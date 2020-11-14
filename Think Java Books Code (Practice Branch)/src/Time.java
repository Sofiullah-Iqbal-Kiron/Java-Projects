public class Time
{
    int hour;
    int minute;
    double second;

    //  Like void methods, constructors do not return any value / object.
    Time(int hour, int minute, double second)
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString() {return String.format("%d:%d:%.2f", this.hour, this.minute, this.second);}
}
