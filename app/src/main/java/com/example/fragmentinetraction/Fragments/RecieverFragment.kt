package com.example.fragmentinetraction.Fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.fragmentinetraction.Communicator.Communicator
import com.example.fragmentinetraction.Home
import com.example.fragmentinetraction.R
import java.util.*

class ReceiveFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val myView=
            LayoutInflater.from(container!!.context).inflate(R.layout.fragment2,container,false)
        return myView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btn=view.findViewById<View>(R.id.btnBack) as Button
        val txt=view.findViewById<View>(R.id.txreceiver) as TextView

        val model= ViewModelProviders.of(activity!!).get(Communicator::class.java)

        model.message.observe(this, object :Observer<Any>{
            override fun onChanged(o: Any?) {
                txt.text = o!!.toString()
            }
        })
        btn.setOnClickListener { view ->
            Toast.makeText(context,"second fragment",Toast.LENGTH_SHORT).show()
        }
    }

}