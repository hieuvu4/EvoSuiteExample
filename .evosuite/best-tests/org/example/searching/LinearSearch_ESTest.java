/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 05:35:26 GMT 2024
 */

package org.example.searching;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.example.searching.LinearSearch;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LinearSearch_ESTest extends LinearSearch_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinearSearch linearSearch0 = new LinearSearch();
      int[] intArray0 = new int[4];
      intArray0[0] = (-2015);
      int int0 = linearSearch0.search(intArray0, 0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinearSearch linearSearch0 = new LinearSearch();
      // Undeclared exception!
      try { 
        linearSearch0.search((int[]) null, 4537);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.example.searching.LinearSearch", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinearSearch linearSearch0 = new LinearSearch();
      int[] intArray0 = new int[1];
      intArray0[0] = (-1652);
      int int0 = linearSearch0.search(intArray0, (-1652));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinearSearch linearSearch0 = new LinearSearch();
      int[] intArray0 = new int[1];
      int int0 = linearSearch0.search(intArray0, (-1));
      assertEquals((-1), int0);
  }
}
