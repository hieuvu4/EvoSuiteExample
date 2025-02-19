/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 05:29:30 GMT 2024
 */

package org.example.sorting;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.example.sorting.SelectionSort;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SelectionSort_ESTest extends SelectionSort_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[0];
      SelectionSort.sort(intArray0);
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        SelectionSort.sort((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.example.sorting.SelectionSort", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[14];
      intArray0[11] = 1327;
      SelectionSort.sort(intArray0);
      assertEquals(14, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SelectionSort selectionSort0 = new SelectionSort();
  }
}
