package com.example.fragmentinetraction.Fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.fragmentinetraction.Communicator.Communicator
import com.example.fragmentinetraction.R

class HomeFragment: Fragment() {

    companion object {
        lateinit var mctx: Context
    }

    private var model: Communicator?=null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view=inflater.inflate(R.layout.fragment1,container,false)

        return  view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        model= ViewModelProviders.of(activity!!).get(Communicator::class.java)

        val btn=view.findViewById<View>(R.id.btnSend) as Button
        val edt=view.findViewById<View>(R.id.txTraiteurNom) as EditText
        //listener onClick
        btn.setOnClickListener {view ->

            model!!.setMsgCommunicator(edt.text.toString())

            val myfragment = ReceiveFragment()
            val fragmentTransaction = fragmentManager!!.beginTransaction()
            fragmentTransaction.replace(R.id.framefragmenthome, myfragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()


        }

    }

}