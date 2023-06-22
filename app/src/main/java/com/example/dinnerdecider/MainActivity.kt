package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var selectfoodTxt:TextView
    val foodList= arrayListOf("Indian","Bengali","Burger King","Pizza","Momo","Daal","Roti","Kheer")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.selectedFoodTxt)
//        R.id.selectedFoodTxt="Burgur King"
//        TextView(R.id.selectedFoodTxt)
//        val textView =findViewById<TextView>(R.id.selectedFoodTxt)
        selectfoodTxt=findViewById(R.id.selectedFoodTxt)
//        selectfoodTxt.text="Burger King"
        val btn1=findViewById<Button>(R.id.decideBtn)
        btn1.setOnClickListener{
            val random = Random()
            val randomFood=random.nextInt(foodList.count())
            selectfoodTxt.text=foodList[randomFood]
        }
        val btn2=findViewById<Button>(R.id.addFoodBtn)
        val addfoodtxt=findViewById<EditText>(R.id.addFoodTxt)
        btn2.setOnClickListener{
            val newFood=addfoodtxt.text.toString()
            foodList.add(newFood)
            addfoodtxt.text.clear()
            println(foodList)
        }
    }
}