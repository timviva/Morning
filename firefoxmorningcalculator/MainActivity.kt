package com.example.firefoxmorningcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var myAnswer : TextView ?=null
    var myFnum :EditText ?=null
    var mySnum:EditText ?=null
    var buttonAdd: Button ?= null
    var buttonSub: Button ?= null
    var buttonMultiply: Button ?= null
    var buttonDivide: Button ?= null
    var ButtonClear: Button ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myAnswer=findViewById(R.id.MtvAnswer)
        myFnum=findViewById(R.id.MEdtSnum)
        mySnum=findViewById(R.id.MEdtSnum)
        buttonAdd=findViewById(R.id.mBtnAdd)
        buttonMultiply=findViewById(R.id.MbtnMultiplication)
        buttonDivide=findViewById(R.id.MbtnDivide)
        buttonSub=findViewById(R.id.Mbtnsubtract)
        ButtonClear=findViewById(R.id.MbtnClear)

//        set on click listeners
        ButtonClear!!.setOnClickListener{
            myFnum!!.setText("")
            mySnum!!.setText("")
            myAnswer!!.setText("")
        }
        buttonAdd!!.setOnClickListener{
//            Receive the two numbers from the user
            var FirstNumber=myFnum !!.text.toString().trim()
            var SecondNumber=mySnum!!.text.toString().trim()
//            check  if the user is submitting empty fields
            if (FirstNumber.isEmpty()){
//                set an error to thr first number edit text
                myFnum!!.setError("please fill this input")
                myFnum!!.requestFocus()
            }else if (SecondNumber.isEmpty()){
                mySnum!!.setError("please fill this input")
                mySnum!!.requestFocus()

            }else{
                var answer=FirstNumber.toDouble()+SecondNumber.toDouble()
                myAnswer!!.text=answer.toString()
            }

        }
        buttonSub!!.setOnClickListener{
//            Receive the two numbers from the user
            var FirstNUmber=myFnum !!.text.toString().trim()
            var secondnumber=mySnum!!.text.toString().trim()
//            check  if the user is submitting empty fields
            if (FirstNUmber.isEmpty()){
//                set an error to thr first number edit text
                myFnum!!.setError("please fill this input")
                myFnum!!.requestFocus()
            }else if (secondnumber.isEmpty()){
                mySnum!!.setError("please fill this input")
                mySnum!!.requestFocus()

            }else{
                var answer=FirstNUmber.toDouble()-secondnumber.toDouble()
                myAnswer!!.text=answer.toString()
            }
        }
        buttonMultiply!!.setOnClickListener{
//            Receive the two numbers from the user
            var FirstNUmber=myFnum !!.text.toString().trim()
            var secondnumber=mySnum!!.text.toString().trim()
//            check  if the user is submitting empty fields
            if (FirstNUmber.isEmpty()){
//                set an error to thr first number edit text
                myFnum!!.setError("please fill this input")
                myFnum!!.requestFocus()
            }else if (secondnumber.isEmpty()){
                mySnum!!.setError("please fill this input")
                mySnum!!.requestFocus()

            }else{
                var answer=(FirstNUmber.toDouble())*(secondnumber.toDouble())
                myAnswer!!.text=answer.toString()
            }
        }
        buttonDivide!!.setOnClickListener{
            //            Receive the two numbers from the user
            var FirstNUmber=myFnum !!.text.toString().trim()
            var secondnumber=mySnum!!.text.toString().trim()
//            check  if the user is submitting empty fields
            if (FirstNUmber.isEmpty()){
//                set an error to thr first number edit text
                myFnum!!.setError("please fill this input")
                myFnum!!.requestFocus()
            }else if (secondnumber.isEmpty()){
                mySnum!!.setError("please fill this input")
                mySnum!!.requestFocus()

            }else{
                var answer=(FirstNUmber.toDouble())/(secondnumber.toDouble())
                myAnswer!!.text=answer.toString()
            }
        }

    }
}