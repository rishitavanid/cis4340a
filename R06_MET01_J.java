/******************************************************************************
 * Rule 06. Methods (MET)
 * MET01-J. Never use assertions to validate method arguments
 *
 * Non-Compliant Code 
 * public static int getAbsAdd(int x, int y) {
 * assert x != Integer.MIN_VALUE;
 * assert y != Integer.MIN_VALUE;
 * int absX = Math.abs(x);
 * int absY = Math.abs(y);
 * assert (absX <= Integer.MAX_VALUE - absY);
 * return absX + absY;
 * }
 * public static void main(String[] args) {
 * System.out.println(getAbsAdd(Integer.MIN_VALUE, 1));
 * }
 * }
 *
 ******************************************************************************/

// Compliant Code 
public class R06_MET01_J {
    public static int getAbsAdd(int x, int y) {
        if (x == Integer.MIN_VALUE || y == Integer.MIN_VALUE) {
            throw new IllegalArgumentException();
        }
        int absX = Math.abs(x);
        int absY = Math.abs(y);
        if (absX > Integer.MAX_VALUE - absY) {
            throw new IllegalArgumentException();
        }
        return absX + absY;
    }

    public static void main(String[] args) {
        System.out.println(getAbsAdd(Integer.MIN_VALUE, 1));
    }
}
