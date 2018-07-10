package com.dippindab.alarmclockorganizerapp

import android.provider.AlarmClock

import java.util.ArrayList

class AlarmFolder {

    private var folder: ArrayList<AlarmClock>? = null
    var name: String? = null
    var id: Int = 0

    fun setAllAlarms(on: Boolean) {

    }

    fun modifyAllAlarmTimes(minutes: Int) {

    }

    fun addAlarm(alarm: AlarmClock) {
        folder!!.add(alarm)
    }

    fun deleteAlarm(alarm: AlarmClock) {
        folder!!.remove(alarm)
    }

    fun setFolder(folder: ArrayList<AlarmClock>) {
        this.folder = folder
    }
}
