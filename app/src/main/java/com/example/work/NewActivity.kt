package com.example.work


import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.os.Bundle
import android.text.InputType
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class NewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.newactivity)
        initial()

    }

    private fun initial() { //初始化组件
        val showDate = findViewById<EditText>(R.id.newactivity_date)
        val add = findViewById<Button>(R.id.newactivity_add)
        val delete = findViewById<Button>(R.id.newactivity_delete)
        showDate.inputType = InputType.TYPE_NULL
        showDate.setOnClickListener {//显示日历
            createCalender()
        }
        add.setOnClickListener{
            newEdittext()
        }
        delete.setOnClickListener {

        }

    }

    @SuppressLint("WrongViewCast")
    private fun newEdittext() {
        val myLinearLayout = findViewById<LinearLayout>(R.id.textView)

        val t = TextView(this)
        t.text = "ziview"


    }

    @SuppressLint("SetTextI18n")
    private fun createCalender(){
        val showDate = findViewById<EditText>(R.id.newactivity_date)
        val c = Calendar.getInstance()
        val mYear = c.get(Calendar.YEAR)
        val mMonth = c.get(Calendar.MONTH)
        val mDay = c.get(Calendar.DAY_OF_MONTH)
        val dpd = DatePickerDialog(this,

            { _, year, monthOfYear, dayOfMonth ->
                showDate.setText(
                    "$monthOfYear-$dayOfMonth-$year"
                )
            }, mYear, mMonth, mDay)
        dpd.datePicker.minDate= System.currentTimeMillis()
        dpd.show()
    }



}