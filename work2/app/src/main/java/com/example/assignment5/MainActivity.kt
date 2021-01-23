package com.example.assignment5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var editText: EditText = findViewById(R.id.etext001)
        var editpass002: EditText = findViewById(R.id.editpass002)
        var editpass003: EditText = findViewById(R.id.editpass003)
        var ok: Button = findViewById(R.id.buttonok)
        var clear: Button = findViewById(R.id.buttonclear)
        //  etext001.setText("Boworn Ngamanurakwong")
        clear.setOnClickListener() {
            editText.setText("")
            editpass002.setText("")
            editpass003.setText("")
            val toast = Toast.makeText(applicationContext, "Complete!!!", Toast.LENGTH_LONG)
            toast.show()
        }
        ok.setOnClickListener() {
            var user = editText.text.toString()
            var pass = editpass002.text.toString()
            var confirmpass = editpass003.text.toString()
                if(user == "" || pass == "" || confirmpass == ""){
                    Toast.makeText(applicationContext, "กรุณากรอกให้ครบ", Toast.LENGTH_LONG).show()
                }
                else if(user == pass && user == confirmpass) {
                    Toast.makeText(applicationContext, "อย่ากรอก Username ตรงกับ Password", Toast.LENGTH_LONG).show()
                }
                else if(pass != confirmpass){
                    Toast.makeText(applicationContext, "กรุณากรอกพาสให้ตรงกัน", Toast.LENGTH_LONG).show()

                }
                else{
                    Toast.makeText(applicationContext, "สำเร็จ", Toast.LENGTH_LONG).show()
                }
            }


        }
    }
