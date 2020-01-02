package com.example.fragmentinetraction

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import androidx.fragment.app.Fragment

import com.example.fragmentinetraction.Fragments.HomeFragment

class Home : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_home)

        val tx = supportFragmentManager.beginTransaction()
        tx.replace(R.id.framefragmenthome, HomeFragment())
        tx.commit()
    }

    private fun replaceFragment(frgm: Fragment, name:String){
        val fm=supportFragmentManager.beginTransaction()
        fm.replace(R.id.framefragmenthome,frgm,name)
        fm.addToBackStack(null)
        fm.commit()
    }
}
