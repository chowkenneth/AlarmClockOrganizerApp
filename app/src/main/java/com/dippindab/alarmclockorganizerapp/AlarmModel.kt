package com.dippindab.alarmclockorganizerapp

import android.provider.AlarmClock

class AlarmModel {
    private val ID: Int = 0
    private var alarmClock: AlarmClock? = null

    fun setAlarmClock(alarmClock: AlarmClock) {
        this.alarmClock = alarmClock
    }
}
