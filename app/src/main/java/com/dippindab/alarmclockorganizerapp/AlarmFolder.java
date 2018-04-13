package com.dippindab.alarmclockorganizerapp;

import android.provider.AlarmClock;

import java.util.ArrayList;

public class AlarmFolder {

    private ArrayList<AlarmClock> folder;
    public String name;
    public int id;

    public void setAllAlarms(boolean on) {

    }

    public void modifyAllAlarmTimes(int minutes) {

    }

    public void addAlarm(AlarmClock alarm) {
        folder.add(alarm);
    }

    public void deleteAlarm(AlarmClock alarm) {
        folder.remove(alarm);
    }

    public void setFolder(ArrayList<AlarmClock> folder) {
        this.folder = folder;
    }
}
