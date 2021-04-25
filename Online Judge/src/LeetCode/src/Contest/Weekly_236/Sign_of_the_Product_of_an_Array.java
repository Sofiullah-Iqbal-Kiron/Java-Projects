// Accepted but why product can not be int?
// Posted in twitter
// Ubuntu Pastebin: https://pastebin.ubuntu.com/p/nfvVKxpTnb/

package Contest.Weekly_236;

import java.math.BigInteger;

public class Sign_of_the_Product_of_an_Array {
    public int arraySign(int[] nums) {
        BigInteger product = new BigInteger(String.valueOf(BigInteger.valueOf(nums[0])));
        for (int i = 1; i < nums.length; i++)
            product = product.multiply(new BigInteger(String.valueOf(BigInteger.valueOf(nums[i]))));

        return product.equals(BigInteger.ZERO) ? 0 : (product.compareTo(BigInteger.valueOf(0)) > 0 ? 1 : -1);
    }
}
