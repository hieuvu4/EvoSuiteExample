/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 07 10:20:03 GMT 2024
 */

package org.example;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.example.WhatKindOfNumber;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class WhatKindOfNumber_ESTest extends WhatKindOfNumber_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WhatKindOfNumber whatKindOfNumber0 = new WhatKindOfNumber();
      String string0 = whatKindOfNumber0.processNumber((-1));
      assertEquals("Negative Odd", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      WhatKindOfNumber whatKindOfNumber0 = new WhatKindOfNumber();
      String string0 = whatKindOfNumber0.processNumber(0);
      assertEquals("Zero", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      WhatKindOfNumber whatKindOfNumber0 = new WhatKindOfNumber();
      String string0 = whatKindOfNumber0.processNumber(2870);
      assertEquals("Positive Even Not Multiple of 3", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      WhatKindOfNumber whatKindOfNumber0 = new WhatKindOfNumber();
      String string0 = whatKindOfNumber0.processNumber(1635);
      assertEquals("Positive Odd", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      WhatKindOfNumber whatKindOfNumber0 = new WhatKindOfNumber();
      String string0 = whatKindOfNumber0.processNumber(888);
      assertEquals("Positive Even Multiple of 3", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      WhatKindOfNumber whatKindOfNumber0 = new WhatKindOfNumber();
      String string0 = whatKindOfNumber0.processNumber((-3416));
      assertEquals("Negative Even", string0);
  }
}
