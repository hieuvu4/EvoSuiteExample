/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 05:33:28 GMT 2024
 */

package org.example.sorting;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.example.sorting.InsertionSort;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InsertionSort_ESTest extends InsertionSort_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InsertionSort insertionSort0 = new InsertionSort();
      // Undeclared exception!
      try { 
        insertionSort0.sort((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.example.sorting.InsertionSort", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InsertionSort insertionSort0 = new InsertionSort();
      int[] intArray0 = new int[6];
      intArray0[0] = 1;
      insertionSort0.sort(intArray0);
      insertionSort0.sort(intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 1}, intArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      InsertionSort insertionSort0 = new InsertionSort();
      int[] intArray0 = new int[0];
      insertionSort0.sort(intArray0);
      assertEquals(0, intArray0.length);
  }
}
