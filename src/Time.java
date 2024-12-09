public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void tick() {
        seconds ++;
        if (seconds == 60) {
            seconds = 0;
            minutes ++;
        }
        if (minutes == 60) {
            minutes = 0;
            hours ++;
        }
        if (hours == 24) {
            hours = 0;
            minutes = 0;
            seconds = 0;
        }
    }

    public void add(Time time) {
        hours += time.hours;
        minutes += time.minutes;
        seconds += time.seconds;

        if (seconds > 59) {
            minutes += seconds / 60;
            seconds = seconds - (seconds / 60) * 60;
        }

        if (minutes > 59) {
            hours += minutes / 60;
            minutes = minutes - (minutes / 60) * 60;
        }

        if (hours >= 24) {
            hours = hours - (hours / 24) * 24;
        }
    }

    public String toString() {
        String str = "";
        if (hours < 10) {
            str += "0" + hours + ":";
        } else {
            str += hours + ":";
        }

        if (minutes < 10) {
            str += "0" + minutes + ":";
        } else {
            str += minutes + ":";
        }

        if (seconds < 10) {
            str += "0" + seconds;
        } else {
            str += seconds;
        }
        return str;
    }
}
