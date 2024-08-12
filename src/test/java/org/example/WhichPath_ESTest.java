/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 07 10:20:40 GMT 2024
 */

package org.example;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.example.WhichPath;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class WhichPath_ESTest extends WhichPath_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = WhichPath.makeDecision(5, 5, 5);
      assertEquals("Path 9", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = WhichPath.makeDecision(1897, 1897, 10);
      assertEquals("Path 5", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = WhichPath.makeDecision(1639, (-1428), 10);
      assertEquals("Path 3", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = WhichPath.makeDecision(41, 5, 0);
      assertEquals("Path 5", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = WhichPath.makeDecision(10, 10, 10);
      assertEquals("Path 8", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = WhichPath.makeDecision((-10), 2548, (-10));
      assertEquals("Path 7", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = WhichPath.makeDecision((-1), 2698, 2698);
      assertEquals("Path 8", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = WhichPath.makeDecision((-1), (-1222), 7);
      assertEquals("Path 9", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = WhichPath.makeDecision(2698, 2698, 2698);
      assertEquals("Path 4", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = WhichPath.makeDecision(2698, (-1), 7);
      assertEquals("Path 2", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = WhichPath.makeDecision(2698, (-1222), 2698);
      assertEquals("Path 3", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = WhichPath.makeDecision(2548, (-10), 0);
      assertEquals("Path 1", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = WhichPath.makeDecision(2698, (-1), (-1));
      assertEquals("Path 3", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = WhichPath.makeDecision((-1), 2698, (-1222));
      assertEquals("Path 6", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      WhichPath whichPath0 = new WhichPath();
  }
}
