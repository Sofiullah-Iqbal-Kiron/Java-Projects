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

    /*
        The toString method is a non-static method. System.out.print() always invokes the toString()
        method for current object type then print this on console.
        It's called instance method also.
    */
    public String toString() {return String.format("%d:%d:%.2f", this.hour, this.minute, this.second);}
}
