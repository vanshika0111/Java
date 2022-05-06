/*Create a class time that has hour, minute and second as data members. 
Create a parameterized constructor to initialize Time */

class Time {
    int hour, minute, second;

    Time(int hr, int min, int sec) {
        this.hour = hr;
        this.minute = min;
        this.second = sec;
    }

    Time TimeSum(Time t1, Time t2) {
        // int hour = 0; minute = 0;
        Time FinalTime = new Time(0, 0, 0);

        FinalTime.minute = t1.minute + t2.minute;
        FinalTime.second = t1.second + t2.second;
        FinalTime.hour = t1.hour + t2.hour;

        minute = FinalTime.second / 60;
        FinalTime.second = FinalTime.second % 60;
        hour = FinalTime.minute / 60;
        FinalTime.minute = (FinalTime.minute % 60) + minute;
        FinalTime.hour = FinalTime.hour + hour;

        return FinalTime;
    }

    void DisplayTime(Time t) {
        System.out.println("Addition of time: " + t.hour + " : " + t.minute + " : " + t.second);
    }

    public static void main(String[] args) {
        Time t1 = new Time(2, 30, 30);
        Time t2 = new Time(2, 30, 30);
        Time t = new Time(0, 0, 0);
        t.DisplayTime(t.TimeSum(t1, t2));
    }
}