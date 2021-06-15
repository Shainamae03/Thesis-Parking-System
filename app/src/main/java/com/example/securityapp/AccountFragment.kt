package com.example.securityapp

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.*
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*
import java.text.SimpleDateFormat
import java.util.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AccountFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AccountFragment : Fragment() {
    lateinit var auth: FirebaseAuth
    var databaseReference: DatabaseReference? = null
    var database: FirebaseDatabase? = null

    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
        auth = FirebaseAuth.getInstance()
        database = FirebaseDatabase.getInstance()
        databaseReference = database?.reference!!.child("AdminDB")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    )


            : View? {
        // Inflate the layout for this fragment
        val view: View = inflater!!.inflate(R.layout.fragment_account, container, false)

        val user = auth.currentUser
        val userreference = databaseReference?.child(user?.uid!!)
        userreference?.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val adminName = snapshot.child("AdminName").value.toString()
                val adminmail = snapshot.child("EmailAddress").value.toString()
                view.findViewById<TextView>(R.id.adminName).text = adminName
                view.findViewById<TextView>(R.id.adminmail).text = adminmail
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }

        })

        view.findViewById<ImageButton>(R.id.editdetails).setOnClickListener{
            activity?.let {
        val user = auth.currentUser
        val userreference = databaseReference?.child(user?.uid!!)
        userreference?.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val adminName = snapshot.child("Password").value.toString()
                val adminmail = snapshot.child("EmailAddress").value.toString()
                view.findViewById<TextView>(R.id.adminName).text = adminName
                view.findViewById<TextView>(R.id.adminmail).text = adminmail

                val dialog = Dialog(it)
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
                dialog.setCancelable(true)
                dialog.setContentView(R.layout.changemail)
                dialog.findViewById<Button>(R.id.forgot).setOnClickListener{

                    auth.signInWithEmailAndPassword(adminmail, adminName)
                        .addOnCompleteListener { task ->
                            if (task.isSuccessful) {
                                val newEmail = view.findViewById<TextView>(R.id.newemail).text
                                auth.currentUser!!.updateEmail(newEmail as String)
                                    .addOnCompleteListener{ task ->
                                        if (task.isSuccessful) {
                                            val currentUserAdmin = auth.currentUser
                                            val currentUserAdminDB = databaseReference?.child((currentUserAdmin?.uid!!))
                                            currentUserAdmin!!.sendEmailVerification()
                                                .addOnCompleteListener {
                                                    if(it.isSuccessful){
                                                        Toast.makeText(activity, "Email verification sent!", Toast.LENGTH_SHORT).show()

                                                    }else{
                                                        Toast.makeText(activity, "Failed", Toast.LENGTH_SHORT).show()
                                                    }
                                                }
                                        }else{
                                            Toast.makeText(activity, "Failed", Toast.LENGTH_SHORT).show()
                                        }
                                    }
                            } else {
                                Toast.makeText(activity, "Failed", Toast.LENGTH_SHORT).show()
                            }
                        }

                }
                dialog.show()
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }

         })
        }
    }
        view.findViewById<ImageButton>(R.id.clientchangepass).setOnClickListener{
            activity?.let {
                val intent = Intent(it, ForgotAdminPass::class.java)
                it.startActivity(intent)
            }
        }


        view.findViewById<ImageButton>(R.id.admin_logout).setOnClickListener {
            activity?.let {

                auth = FirebaseAuth.getInstance()
                database = FirebaseDatabase.getInstance()
                databaseReference = database?.reference!!.child("SecuDb")

                val user = auth.currentUser
                val userreference = databaseReference?.child(user?.uid!!)

                userreference?.addValueEventListener(object : ValueEventListener {
                    override fun onDataChange(snapshot: DataSnapshot) {
                        val name = snapshot.child("AdminName").value.toString()
                        val id = snapshot.child("AdminID").value.toString()
                        val As = snapshot.child("As").value.toString()
                        val df = SimpleDateFormat("EEE MM/dd/yyyy hh:mm.ss aa")
                        val c = Calendar.getInstance()
                        val str_time: String = df.format(c.time)

                        val database = FirebaseDatabase.getInstance()
                        val myRef = database.getReference("AdminLogs")
                        val map: HashMap<String, String?> = hashMapOf(
                            "Name" to name,
                            "Date" to str_time,
                            "As" to As,
                            "ID" to id,
                            "LogStat" to "LogOut"
                        )
                        myRef.push().setValue(map)
                        auth.signOut()
                        val intent = Intent(it, MainActivity::class.java)
                        it.startActivity(intent)

                    }

                    override fun onCancelled(error: DatabaseError) {
                        TODO("Not yet implemented")
                    }
                })
            }

        }

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment AccountFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            AccountFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}