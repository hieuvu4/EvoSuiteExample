/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 05:34:28 GMT 2024
 */

package org.example;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.example.Calculator;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Calculator_ESTest extends Calculator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Calculator calculator0 = new Calculator();
      double double0 = calculator0.subtract(2812.26, (-1.0));
      assertEquals(2813.26, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Calculator calculator0 = new Calculator();
      double double0 = calculator0.subtract(0.0, 249.701);
      assertEquals((-249.701), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Calculator calculator0 = new Calculator();
      double double0 = calculator0.squareRoot(1.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Calculator calculator0 = new Calculator();
      double double0 = calculator0.square(1.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Calculator calculator0 = new Calculator();
      double double0 = calculator0.multiply((-2738.785647934212), (-2511.3429759356));
      assertEquals(6878030.099532815, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Calculator calculator0 = new Calculator();
      double double0 = calculator0.multiply(2258.571408994203, (-3757.550100736));
      assertEquals((-8486695.225385617), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Calculator calculator0 = new Calculator();
      double double0 = calculator0.divide(0.0, (-1.0));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Calculator calculator0 = new Calculator();
      double double0 = calculator0.divide((-1.0), 2258.571408994203);
      assertEquals((-4.427577520984047E-4), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Calculator calculator0 = new Calculator();
      double double0 = calculator0.add(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Calculator calculator0 = new Calculator();
      double double0 = calculator0.add((-2153.899971), 0.0);
      assertEquals((-2153.899971), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Calculator calculator0 = new Calculator();
      // Undeclared exception!
      try { 
        calculator0.squareRoot((-2008.565121341104));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // a must not lesser than 0.
         //
         verifyException("org.example.Calculator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Calculator calculator0 = new Calculator();
      double double0 = calculator0.squareRoot(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Calculator calculator0 = new Calculator();
      // Undeclared exception!
      try { 
        calculator0.divide(0.0, 0.0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // b must not be 0.
         //
         verifyException("org.example.Calculator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Calculator calculator0 = new Calculator();
      double double0 = calculator0.divide((-1979.8390836550786), (-1979.8390836550786));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Calculator calculator0 = new Calculator();
      double double0 = calculator0.subtract((-2008.565121341104), (-2008.565121341104));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Calculator calculator0 = new Calculator();
      double double0 = calculator0.square(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Calculator calculator0 = new Calculator();
      double double0 = calculator0.add(1.0, 1.0);
      assertEquals(2.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Calculator calculator0 = new Calculator();
      double double0 = calculator0.multiply(0.0, (-2008.565121341104));
      assertEquals(-0.0, double0, 0.01);
  }
}
