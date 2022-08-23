package com.example.basiccalculator

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd.setOnClickListener{
            val add=etFirstNumber.text.toString().toInt()+etSecondNumber.text.toString().toInt();
            tvAdd.text=add.toString();
        }

        btnSub.setOnClickListener{
            val sub=etFirstNumber.text.toString().toInt()-etSecondNumber.text.toString().toInt();
            tvSub.text=sub.toString();
        }

        btnMult.setOnClickListener{
            val mul=etFirstNumber.text.toString().toInt().times(etSecondNumber.text.toString().toInt());
            tvMult.text=mul.toString();
        }

        btnDiv.setOnClickListener{
            if(etSecondNumber.text.toString().toInt() == 0){
                tvDiv.text="Invalid";
            }
            else{
                val div=etFirstNumber.text.toString().toInt()/etSecondNumber.text.toString().toInt();
                tvDiv.text=div.toString();
            }
        }

        btnXor.setOnClickListener{
            val xor=etFirstNumber.text.toString().toInt().xor(etSecondNumber.text.toString().toInt());
            tvXor.text=xor.toString();
        }

        btnAdv.setOnClickListener{
            Intent(this,SecondActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}