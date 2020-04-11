package com.example.gregpl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity(),View.OnClickListener {

    override fun onClick(view: View) {
        when (view.id) {
            R.id.logout_btn -> {
                mAuth.signOut()
                startActivity(Intent(this, LoginActivity::class.java))
                finish()
            }
        }
    }
        private val TAG = "MainActivity"
        private lateinit var mAuth: FirebaseAuth

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            mAuth = FirebaseAuth.getInstance()
            logout_btn.setOnClickListener(this)

    }
}
