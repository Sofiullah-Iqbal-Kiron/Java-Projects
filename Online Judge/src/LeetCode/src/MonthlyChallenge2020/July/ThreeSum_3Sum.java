package MonthlyChallenge2020.July;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum_3Sum
{
    public static void main(String[] args)
    {
        threeSum(new int[] {1});
    }
    public static List<List<Integer>> threeSum(int[] nums)
    {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> subList=new ArrayList<>();

        list.add(Arrays.asList(1, 2,3));
        list.add(Arrays.asList(5, 4, 3));
        System.out.println(list);

        return list;
    }
}
