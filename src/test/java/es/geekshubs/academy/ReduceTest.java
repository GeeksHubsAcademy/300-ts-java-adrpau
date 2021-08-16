package es.geekshubs.academy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ReduceTest {

  private Reduce reduce;

  @Before
  public void setUp() throws Exception {
    this.reduce = new Reduce();
  }

  @After
  public void tearDown() throws Exception {
    this.reduce = null;
  }

  @Test public void test1()
  {
    final String result = this.reduce.apply("X");
    assertEquals( result, "X");
  }

  @Test public void test2()
  {
    final String result = this.reduce.apply("Y");
    assertEquals( result, "Y");
  }

  @Test public void test3()
  {
    final String result = this.reduce.apply("Z");
    assertEquals( result, "Z");
  }

  @Test public void test4()
  {
    final String result = this.reduce.apply("XX");
    assertEquals( result, "X");
  }

  @Test public void test5()
  {
    final String result = this.reduce.apply("ZX");
    assertEquals( result, "Y");
  }

  @Test public void test6()
  {
    final String result = this.reduce.apply("XZ");
    assertEquals( result, "Y");
  }

  @Test public void test7()
  {
    final String result = this.reduce.apply("ZY");
    assertEquals( result, "X");
  }

  @Test public void test8()
  {
    final String result = this.reduce.apply("YZ");
    assertEquals( result, "X");
  }

  @Test public void test9()
  {
    final String result = this.reduce.apply("XY");
    assertEquals( result, "Z");
  }

  @Test public void test10()
  {
    final String result = this.reduce.apply("YX");
    assertEquals( result, "Z");
  }

  @Test public void test11()
  {
    final String result = this.reduce.apply("YY");
    assertEquals( result, "Y");
  }

  @Test public void test12()
  {
    final String result = this.reduce.apply("ZXX");
    assertEquals( result, "Z");
  }

  @Test public void test13()
  {
    final String result = this.reduce.apply("YYZXYY");
    assertEquals( result, "Y");
  }

  @Test public void test14()
  {
    final String result = this.reduce.apply("YYYXZY");
    assertEquals( result, "X");
  }

  @Test public void test15()
  {
    final String result = this.reduce.apply("XXYZXYZZ");
    assertEquals( result, "Y");
  }

  @Test public void test16()
  {
    final String result = this.reduce.apply("XYYZYYZZ");
    assertEquals( result, "Y");
  }

  @Test public void test17()
  {
    final String result = this.reduce.apply("XYYZYYZZY");
    assertEquals( result, "Z");
  }

  @Test public void test18()
  {
    final String result = this.reduce.apply("XYZZYYZZY");
    assertEquals( result, "X");
  }

  @Test public void test19()
  {
    final String result = this.reduce.apply("YXXZYZYXXY");
    assertEquals( result, "Y");
  }

  @Test public void test20()
  {
    final String result = this.reduce.apply("ZYXXYYYXXYZXYX");
    assertEquals( result, "Y");
  }

  @Test public void test21()
  {
    final String result = this.reduce.apply("YYZXYYXYZXXYXXZZXY");
    assertEquals( result, "Y");
  }

  @Test public void test22()
  {
    final String result = this.reduce.apply("YYXXYYXYZXYYXXYZXY");
    assertEquals( result, "X");
  }

  @Test public void test23()
  {
    final String result = this.reduce.apply("ZXYYXZZXYXXYYZXZXYZYXY");
    assertEquals( result, "Y");
  }

  @Test public void test24()
  {
    final String result = this.reduce.apply("ZXXYXXZXYYXZYYXYYYZXXZY");
    assertEquals( result, "Z");
  }

  @Test public void test25()
  {
    final String result = this.reduce.apply("YYXXYYXYZXYYXXYZXY");
    assertEquals( result, "X");
  }
  
}