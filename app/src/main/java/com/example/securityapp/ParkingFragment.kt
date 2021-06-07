package com.example.securityapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ParkingFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ParkingFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater!!.inflate(R.layout.fragment_parking, container, false)
        view.findViewById<ImageButton>(R.id.CLAW).setOnClickListener {
            activity?.let{
                val intent = Intent (it, ParkingLaw::class.java)
                it.startActivity(intent)
            }

            view.findViewById<ImageButton>(R.id.CHTM).setOnClickListener {
                activity?.let{
                    val intent = Intent (it, Che_parking::class.java)
                    it.startActivity(intent)
                }
            }
            view.findViewById<ImageButton>(R.id.CoN).setOnClickListener {
                activity?.let{
                    val intent = Intent (it, ConParking::class.java)
                    it.startActivity(intent)
                }
            }
            view.findViewById<ImageButton>(R.id.Marcelo).setOnClickListener {
                activity?.let{
                    val intent = Intent (it, HeroesPark::class.java)
                    it.startActivity(intent)
                }
            }
            view.findViewById<ImageButton>(R.id.parking_logs).setOnClickListener {
                activity?.let{
                    val intent = Intent (it, ParkingLogs::class.java)
                    it.startActivity(intent)
                }
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
         * @return A new instance of fragment ParkingFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ParkingFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}