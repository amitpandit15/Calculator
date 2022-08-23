package com.example.basiccalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        btnBack.setOnClickListener {
            finish()
        }

        btnMod.setOnClickListener{
            val mod=etFirstNumber2.text.toString().toInt().rem(etSecondNumber2.text.toString().toInt());
            tvMod.text=mod.toString();
        }

        btnAnd.setOnClickListener{
            val and=etFirstNumber2.text.toString().toInt().and(etSecondNumber2.text.toString().toInt());
            tvAnd.text=and.toString();
        }

        btnOr.setOnClickListener{
            val or=etFirstNumber2.text.toString().toInt().or(etSecondNumber2.text.toString().toInt());
            tvOr.text=or.toString();
        }

        btnInv.setOnClickListener{
            val inv=etFirstNumber2.text.toString().toInt().inv();
            tvInv.text=inv.toString();
        }

        btnRoots.setOnClickListener {
            val a=etFirstNumber2.text.toString().toInt();
            val b=etSecondNumber2.text.toString().toInt();
            val c=etThirdNumber2.text.toString().toInt();
            val D=b*b-4*a*c;
            if(D<0){
                tvRoot1.text="Imag";
                tvRoot2.text="Imag";
            }
            else{
                val num=D.toDouble();
                val rootD=Math.sqrt(num);
                val root1=(rootD-b)/(2*a);
                val root2=(-1)*((rootD+b)/(2*a));
                tvRoot1.text=root1.toString();
                tvRoot2.text=root2.toString();
            }
        }

    }
}