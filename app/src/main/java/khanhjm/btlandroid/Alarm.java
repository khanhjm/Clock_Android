package khanhjm.btlandroid;

/**
 * Created by khanh on 15/11/2017.
 */

public class Alarm {
    private int alarmID;
    private String alarmTime;

    public Alarm() {
    }

    public Alarm(int alarmID, String alarmTime) {
        this.alarmID = alarmID;
        this.alarmTime = alarmTime;
    }

    public int getAlarmID() {
        return alarmID;
    }

    public void setAlarmID(int alarmID) {
        this.alarmID = alarmID;
    }

    public String getAlarmTime() {
        return alarmTime;
    }

    public void setAlarmTime(String alarmTime) {
        this.alarmTime = alarmTime;
    }
}
