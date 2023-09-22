package csi213.projects.util;

/**
 * This {@code IntArrays} class provides methods for manipulating {@code int} arrays.
 *
 * @author Jeong-Hyon Hwang (jhh@cs.albany.edu)
 */
public class IntArrays {

    /**
     * Returns the sum of the elements in the specified array.
     *
     * @param a an {@code int} array
     */
    public static int sum(int[] a) {
        int sum = 0;
        for (int e : a) {
            sum += e;
        }
        return sum;
    }

    /**
     * Returns the sum of the elements in the specified region of an array.
     *
     * @param a          an {@code int} array
     * @param startIndex the start index of the region in which the sum of the elements needs to be calculated
     */
    public static int sumR(int[] a, int startIndex) {
        return 0;
    }

    /**
     * Returns the minimum possible sum of two numbers from the specified array.
     *
     * @param a an {@code int} array
     */
    public static int minSum2(int[] a) {
        return 0;
    }

    /**
     * Returns the minimum possible sum of {@code k} numbers from the specified array.
     *
     * @param a an {@code int} array
     * @param k a positive integer
     */
    public static int minSum(int[] a, int k) {
        return 0;
    }

    /**
     * The main method of the {@code IntArrays} class.
     *
     * @param args the program arguments.
     */
    public static void main(String[] args) {
        System.out.println(sum(new int[]{1, 2, 3}));
        System.out.println(sum(new int[]{1, 2, 3, 4}));
        System.out.println(sum(new int[]{1, 2, 3, 4, 5}));

        System.out.println();

        System.out.println(sumR(new int[]{1, 2, 3}, 2));
        System.out.println(sumR(new int[]{1, 2, 3}, 1));
        System.out.println(sumR(new int[]{1, 2, 3}, 0));
        System.out.println(sumR(new int[]{1, 2, 3, 4}, 0));
        System.out.println(sumR(new int[]{1, 2, 3, 4, 5}, 0));

        System.out.println();

        System.out.println(minSum2(new int[]{1, 2, 3}));
        System.out.println(minSum2(new int[]{5, 2, 3, 4}));
        System.out.println(minSum2(new int[]{6, 7, 3, 4, 5}));

        System.out.println();

        System.out.println(minSum(new int[]{1, 2, 3, 4, 5, 6}, 1));
        System.out.println(minSum(new int[]{1, 2, 3, 4, 5, 6}, 2));
        System.out.println(minSum(new int[]{1, 2, 3, 4, 5, 0}, 2));
        System.out.println(minSum(new int[]{6, 5, 4, 3, 2}, 2));
        System.out.println(minSum(new int[]{1, 2, 3, 4, 5, 6}, 3));
        System.out.println(minSum(new int[]{1, 2, 3, 4, 5, 6}, 4));
    }

}
