package com.nepplus.newproject

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.DatePicker
import kotlinx.android.synthetic.main.activity_edit_phone_num.*
import kotlinx.android.synthetic.main.activity_edit_phone_num.*
import java.util.*

class EditPhoneNumActivity : BaseActivity() {

    val mSelectedDate = Calendar.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_phone_num)
    }

    override fun setupEvents() {

        selectBirthDayBtn.setOnClickListener{

            val dateSetListener = object : DatePickerDialog.OnDateSetListener{
                override fun onDateSet(p0: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {

                }
            }

            val datePickerDialog = DatePickerDialog(mContext, dateSetListener,
            mSelectedDate.get(Calendar.YEAR), mSelectedDate.get(Calendar.MONTH), mSelectedDate.get(Calendar.DAY_OF_MONTH))
            datePickerDialog.show()

        }

    }

    override fun setValues() {
    }
}