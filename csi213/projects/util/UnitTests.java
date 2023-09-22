package csi213.projects.util;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * {@code UnitTests} tests the implementations in {@code csi213.projects.util.IntArrays}.
 * 
 * @author Jeong-Hyon Hwang (jhh@cs.albany.edu)
 * 
 */
public class UnitTests {

	/**
	 * Tests the Problem 3a implementation.
	 * 
	 * @throws Exception
	 *             if an error occurs
	 */
	@Test
	public void test3a() throws Exception {
		assertEquals(6, IntArrays.sum(new int[] { 1, 2, 3 }));
		assertEquals(10, IntArrays.sum(new int[] { 1, 2, 3, 4 }));
		assertEquals(15, IntArrays.sum(new int[] { 1, 2, 3, 4, 5 }));
	}

	/**
	 * Tests the Problem 3b implementation.
	 * 
	 * @throws Exception
	 *             if an error occurs
	 */
	@Test
	public void test3b() throws Exception {
		assertEquals(3, IntArrays.sumR(new int[] { 1, 2, 3 }, 2));
		assertEquals(5, IntArrays.sumR(new int[] { 1, 2, 3 }, 1));
		assertEquals(6, IntArrays.sumR(new int[] { 1, 2, 3 }, 0));
		assertEquals(10, IntArrays.sumR(new int[] { 1, 2, 3, 4 }, 0));
		assertEquals(15, IntArrays.sumR(new int[] { 1, 2, 3, 4, 5 }, 0));
	}

	/**
	 * Tests the Problem 3c implementation.
	 * 
	 * @throws Exception
	 *             if an error occurs
	 */
	@Test
	public void test3c() throws Exception {
		assertEquals(3, IntArrays.minSum2(new int[] { 1, 2, 3 }));
		assertEquals(5, IntArrays.minSum2(new int[] { 5, 2, 3, 4 }));
		assertEquals(7, IntArrays.minSum2(new int[] { 6, 7, 3, 4, 5 }));
	}

	/**
	 * Tests the Problem 3d implementation.
	 * 
	 * @throws Exception
	 *             if an error occurs
	 */
	@Test
	public void test3d() throws Exception {
		assertEquals(1, IntArrays.minSum(new int[] { 1, 2, 3, 4, 5, 6 }, 1));
		assertEquals(3, IntArrays.minSum(new int[] { 1, 2, 3, 4, 5, 6 }, 2));
		assertEquals(1, IntArrays.minSum(new int[] { 1, 2, 3, 4, 5, 0 }, 2));
		assertEquals(5, IntArrays.minSum(new int[] { 6, 5, 4, 3, 2 }, 2));
		assertEquals(6, IntArrays.minSum(new int[] { 1, 2, 3, 4, 5, 6 }, 3));
		assertEquals(10, IntArrays.minSum(new int[] { 1, 2, 3, 4, 5, 6 }, 4));
	}

}
