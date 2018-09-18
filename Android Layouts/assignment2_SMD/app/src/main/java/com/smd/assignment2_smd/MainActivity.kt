package com.smd.assignment2_smd

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import com.smd.assignment2_smd.R.layout.signup_constraint
import kotlinx.android.synthetic.main.signup_relative.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen_linear)

        val email=findViewById<EditText>(R.id.Email)
        val password=findViewById<EditText>(R.id.Password)
        val male=findViewById<RadioButton>(R.id.radioButton)
        val female=findViewById<RadioButton>(R.id.radioButton2)

    val relative=findViewById<Button>(R.id.button3)
        relative.setOnClickListener {
            setContentView(R.layout.signup_relative)
            val register_relative=findViewById<Button>(R.id.Register_Relative)
            register_relative.setOnClickListener {
                Toast.makeText(this,email.text,Toast.LENGTH_LONG).show()
                Toast.makeText(this,password.text,Toast.LENGTH_LONG).show()
            }
        }
        val constraint=findViewById<Button>(R.id.button4)
        constraint.setOnClickListener {
            setContentView(R.layout.signup_constraint)
            val register_constraint=findViewById<Button>(R.id.Register_Constraint)
            register_constraint.setOnClickListener {
                Toast.makeText( this,email.text,Toast.LENGTH_LONG).show()
                Toast.makeText(this,password.text,Toast.LENGTH_LONG).show()
            }
        }
    }
}
