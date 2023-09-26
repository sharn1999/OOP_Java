package task3;

class Time {
    private int hour;
    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    private int minute;
    public int getMinute() {
        return minute;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    private int second;
    public int getSecond() {
        return second;
    }
    public void setSecond(int second) {
        this.second = second;
    }

    {
        hour = 0;
        minute = 0;
        second = 0;
    }

    public Time(int hour, int minute, int second) {
        if (isValidHour(hour) && isValidMinute(minute) && isValidSecond(second)) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }

    private boolean isValidHour(int hour) {
        if (hour > 23 || hour < 0)
        return false;
        return true;
    }

    private boolean isValidMinute(int minute) {
        if (minute > 59 || minute < 0)
        return false;
        return true;
    }

    private boolean isValidSecond(int second) {
        if (second > 59 || second < 0)
            return false;
        return true;
    }

    private String addZero(int value) {
        if (value >= 0 && value <= 9) {
            return "0" + value;
        }
        return value + "";
    }

    public String toUniversal() {
        return this.toString();
    }

    public String toStandard() {
        if (this.hour >= 12) {
            return addZero(this.hour - 12) + ":" + addZero(this.minute) + ":" + addZero(this.second) + " PM";
        } else {
            return addZero(this.hour) + ":" + addZero(this.minute) + ":" + addZero(this.second) + " AM";
        }
    }

    public String toStandard2() {
        String time = addZero(this.hour % 12) + ":" + addZero(this.minute) + ":" + addZero(this.second);

        if (this.hour / 12 == 1) {
            time += " PM";
        } else {
            time += " AM";
        }
        return time;
    }

    public void add(Time other) {
        int newSecond = (this.second + other.getSecond());
        this.second = newSecond % 60;
        int newMinute = (this.minute + other.getMinute() + newSecond / 60);
        this.minute = newMinute % 60;
        int newHour = (this.hour + other.getHour() + newMinute / 60) % 24;
        this.hour = newHour;
    }


    public String toString() {
        return addZero(this.hour) + ":" + addZero(this.minute) + ":" + addZero(this.second);
    }
}

public class TimeTest{
    public static void main(String[] args){
        Time t = new Time(23,5,6);
        System.out.println(t.toUniversal());
        System.out.println(t.toStandard());
        Time t2 = new Time(4,24,33);
        t.add(t2);
    }
}