package com.dippindab.alarmclockorganizerapp

import android.app.AlarmManager
import android.app.DatePickerDialog
import android.app.Dialog
import android.app.DialogFragment
import android.app.PendingIntent
import android.app.TimePickerDialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.text.format.DateFormat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.DatePicker
import android.widget.TimePicker

import java.util.Calendar


class AlarmCreatorDialog : DialogFragment(), TimePickerDialog.OnTimeSetListener {

    override fun onCreateDialog(savedInstanceState: Bundle): Dialog {
        val c = Calendar.getInstance()
        val hour = c.get(Calendar.HOUR_OF_DAY)
        val minute = c.get(Calendar.MINUTE)
        return TimePickerDialog(activity, this, hour, minute,
                DateFormat.is24HourFormat(activity))
        // Use the Builder class for convenient dialog construction
        //        DatePickerDialog.Builder builder = new DatePickerDialog.Builder(getActivity());
        //        builder.setMessage(R.string.hello_blank_fragment)
        //                .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
        //                    public void onClick(DialogInterface dialog, int id) {
        //                        // FIRE ZE MISSILES!
        //                    }
        //                })
        //                .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
        //                    public void onClick(DialogInterface dialog, int id) {
        //                        // User cancelled the dialog
        //                    }
        //                });
        //        // Create the AlertDialog object and return it
        //        return builder.create();
    }

    override fun onTimeSet(view: TimePicker, hourOfDay: Int, minute: Int) {
        val calendar = Calendar.getInstance()
        calendar.set(Calendar.HOUR_OF_DAY, hourOfDay)
        calendar.set(Calendar.MINUTE, minute)
        val intent = Intent(this.activity, AlarmReceiver::class.java)
        val pendingIntent = PendingIntent.getBroadcast(this.activity, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT)
        val alarmManager = activity.getSystemService(Context.ALARM_SERVICE) as AlarmManager
        alarmManager.set(AlarmManager.RTC_WAKEUP, calendar.timeInMillis, pendingIntent)
    }

}// Required empty public constructor
