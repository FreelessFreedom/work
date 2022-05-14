package com.example.work

import android.app.DatePickerDialog
import android.os.Bundle
import android.text.InputType
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class NewActivity : AppCompatActivity() {

    private var mYear = 0
    private var mMonth = 0
    private var mDay = 0
    val c = Calendar.getInstance();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.newactivity)
        initial()


        mYear = c.get(Calendar.YEAR);
        mMonth = c.get(Calendar.MONTH);
        mDay = c.get(Calendar.DAY_OF_MONTH);



    }

    private fun initial() {
        val showDate = findViewById<EditText>(R.id.newactivity_date);
        showDate.inputType = InputType.TYPE_NULL
        showDate.setOnClickListener {

            val c = Calendar.getInstance()
            val mYear = c.get(Calendar.YEAR)
            val mMonth = c.get(Calendar.MONTH)
            val mDay = c.get(Calendar.DAY_OF_MONTH)
            val dpd = DatePickerDialog(this,
                DatePickerDialog.OnDateSetListener
                { view, year, monthOfYear, dayOfMonth ->
                    showDate.setText(
                        "$monthOfYear-$dayOfMonth-$year"
                    )
                }, mYear, mMonth, mDay)
            dpd.datePicker.minDate= System.currentTimeMillis()
            dpd.show()


        }

    }
//         private fun setDateTime(){ //设置日期
//
//
//         mYear = c.get(Calendar.YEAR);
//         mMonth = c.get(Calendar.MONTH);
//         mDay = c.get(Calendar.DAY_OF_MONTH);
//
//        updateDateDisplay();
//    }

//    private fun updateDateDisplay() {
//        val showDate = findViewById<EditText>(R.id.newactivity_date);
//        showDate.setText(
//            StringBuilder()
//                .append(mMonth + 1).append(" - ")
//                .append(mDay +1 ).append(" - ")
//                .append(mYear)
//        );
//    }


}