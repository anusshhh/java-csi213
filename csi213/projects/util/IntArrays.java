package csi213.projects.util;

import java.util.Arrays;

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
        if (startIndex == a.length - 1) {
            return a[startIndex];
        }
        return a[startIndex] + sumR(a, startIndex + 1);
    }

    /**
     * Returns the minimum possible sum of two numbers from the specified array.
     *
     * @param a an {@code int} array
     */
    public static int minSum2(int[] a) {
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int sum = a[i] + a[j];
                if (sum < minSum) {
                    minSum = sum;
                }
            }
        }
        return minSum;
    }

    /**
     * Returns the minimum possible sum of {@code k} numbers from the specified array.
     *
     * @param a an {@code int} array
     * @param k a positive integer
     */
    public static int minSum(int[] a, int k) {
        int minSum = Integer.MAX_VALUE;
        Arrays.sort(a);
        for (int i = 0; i + k <= a.length; i++) {
            int temp = 0;
            for (int j = i; j < i + k; j++) {
                temp += a[j];
            }
            if (temp < minSum)
                minSum = temp;
        }

        return minSum;
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
