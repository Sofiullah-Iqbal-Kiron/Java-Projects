// Accepted at 2'nd attempt.
// First of all, tried with LinkedList Node but internal compilation producing garbage.
// Posted in twitter
// Ubuntu Pastebin: https://pastebin.ubuntu.com/p/4VD5z3mjVS/


package MonthlyChallenge2021.March;

import java.util.ArrayList;

public class DesignHashMap
{
    ArrayList<Integer> KEY = new ArrayList<>();
    ArrayList<Integer> VALUE = new ArrayList<>();
    public void put(int key, int value)
    {
        if (!KEY.contains(key))
        {
            KEY.add(key);
            VALUE.add(value);
        }
        else
        {
            int id = KEY.indexOf(key);
            VALUE.set(id, value);
        }
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
     */
    public int get(int key)
    {
        if (!KEY.contains(key))
            return -1;
        int id = KEY.indexOf(key);
        return VALUE.get(id);
    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    public void remove(int key)
    {
        if (!KEY.contains(key))
            return;
        int id = KEY.indexOf(key);
        KEY.remove(id);
        VALUE.remove(id);
    }
}
