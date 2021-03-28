// Accepted first attempt with three diff arrayCopy method
// Posted in twitter
// Ubuntu Pastebin: https://pastebin.ubuntu.com/p/kkczPT6KQ4/


package Contest.Weekly_234;

import java.util.Arrays;

public class Minimum_Number_of_Operations_to_Reinitialize_a_Permutation {
    private static void arrayCopy(int[] source, int[] destination) {
        try {
            if (source.length != destination.length) throw new Exception();
            for (int i = 0; i < source.length; i++) destination[i] = source[i];
        }
        catch (Exception e) {
            System.out.println("ArraysLengthNotSameException");
        }
    }

    public int reinitializePermutation(int n) {
        int[] iprem = new int[n];
        int i, counter = 0;
        for (i = 0; i < n; i++) iprem[i] = i;
        int[] prem = new int[n];
        arrayCopy(iprem, prem);
        int[] arr = new int[n];
        do {
            for (i = 0; i < n; i++) {
                if (i % 2 == 0) arr[i] = prem[i / 2];
                else if (i % 2 == 1) arr[i] = prem[n / 2 + (i - 1) / 2];
            }
            arrayCopy(arr, prem);
            counter++;
        }
        while (!Arrays.equals(prem, iprem));

        return counter;
    }
}
