public class TimeClient
{
    private static final char COLON;

    static
    {
        COLON = '\u003A';
    }

    public static void main(String[] args)
    {
        Time myTime = new Time(10, 12, 4.6);
        System.out.println(String.valueOf(myTime.hour) + COLON + myTime.minute + COLON + myTime.second);
        System.out.println(myTime.toString());
    }
}
