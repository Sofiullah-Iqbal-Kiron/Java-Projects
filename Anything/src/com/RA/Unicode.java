package com.RA;

public class Unicode
{
    public static final char FULL_STOP;
    public static final char BULLET;
    public static final char COPYRIGHT;
    public static final char COMMA;
    public static final char COLON;
    public static final char QUESTION_MARK;
    public static final char HASH_TAG;
    public static final char SINGLE_SPACE;

    static
    {
        FULL_STOP = '\u002E';
        BULLET = '\u2022';
        COPYRIGHT = '\u2117';
        COMMA = '\u002C';
        COLON = '\u003A';
        QUESTION_MARK = '\u003F';
        HASH_TAG = '\u0023';
        SINGLE_SPACE='\u0020';
    }

    public static void main(String[] args)
    {
        System.out.println("All right reserved" + COPYRIGHT + ": Sofiullah Iqbal Kiron");
    }
}
