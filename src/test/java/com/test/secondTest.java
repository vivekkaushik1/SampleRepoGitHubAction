package com.test;

import static org.testng.Assert.assertFalse;
import com.lib.Library;
import static org.junit.Assert.assertTrue;
//import static org.junit.Assert.assertFalse;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class secondTest {

	@Test
	public void test2() {

		for (int i = 0; i < 3; i++)
			System.out.print("test summaries....");

		Assert.assertTrue(true, "test is passed");
	}
/*	@Test
	public void test3() {

		for (int i = 0; i < 3; i++)
			System.out.print("test summaries....");

		Assert.assertTrue(true, "test is passed");
	}

	@Test
	public void test4() {

		for (int i = 0; i < 3; i++)
			System.out.print("test summaries....");

		Assert.assertTrue(true, "test is passed");
	}
	@Test
	public void test6() {

		for (int i = 0; i < 3; i++)
			System.out.print("test summaries....");

		Assert.assertTrue(true, "test is passed");
	}
	@Test
	public void test5() {
	
		for (int i = 0; i < 3; i++)
			System.out.print("test summaries....");

		Assert.assertTrue(true, "test is passed");
	}
	@Test
	public void test7() {

		for (int i = 0; i < 3; i++)
			System.out.print("test summaries....");

		Assert.assertTrue(true, "test is passed");
	}
	@Test
	public void test8() {

		for (int i = 0; i < 3; i++)
			System.out.print("test summaries....");

		Assert.assertTrue(true, "test is passed");
	}
	@Test
	public void test9() {

		for (int i = 0; i < 3; i++)
			System.out.print("test summaries....");

		Assert.assertTrue(true, "test is passed");
	}
	@Test
	public void test10() {

		for (int i = 0; i < 3; i++)
			System.out.print("test summaries....");

		Assert.assertTrue(true, "test is passed");
	}
	@Test
	public void test1() {

		for (int i = 0; i < 3; i++)
			System.out.print("test summaries....");

		Assert.assertTrue(true, "test is passed");
	}
	@Test
	public void test13() {

		for (int i = 0; i < 3; i++)
			System.out.print("test summaries....");

		Assert.assertTrue(true, "test is passed");
	}
	@Test
	public void test11() {

		for (int i = 0; i < 3; i++)
			System.out.print("test summaries....");

		Assert.assertTrue(true, "test is passed");
	}
	@Test
	public void test12() {

		for (int i = 0; i < 3; i++)
			System.out.print("test summaries....");

		Assert.assertTrue(true, "test is passed");
	}
	@Test
	public void test14() {

		for (int i = 0; i < 3; i++)
			System.out.print("test summaries....");

		Assert.assertTrue(true, "test is passed");
	}
	@Test
	public void test15() {

		for (int i = 0; i < 3; i++)
			System.out.print("test summaries....");

		Assert.assertTrue(true, "test is passed");
	}
	@Test
	public void test16() {

		for (int i = 0; i < 3; i++)
			System.out.print("test summaries....");

		Assert.assertTrue(true, "test is passed");
	}

	@Test
	public void test17() {

		for (int i = 0; i < 3; i++)
			System.out.print("test summaries....");

		Assert.assertTrue(true, "test is passed");
	}	
	@Test
	public void test18() {

		for (int i = 0; i < 3; i++)
			System.out.print("test summaries....");

		Assert.assertTrue(true, "test is passed");
	}
	@Test
	public void test19() {

		for (int i = 0; i < 3; i++)
			System.out.print("test summaries....");

		Assert.assertTrue(true, "test is passed");
	}	
	@Test
	public void test20() {

		for (int i = 0; i < 3; i++)
			System.out.print("test summaries....");

		Assert.assertTrue(true, "test is passed");
	}*/	
	@Test
	public void testskipped() {
		throw new SkipException("skipped");
	}
	
	@Test 
	public void testAdd()
    {
        Library classUnderTest = new Library();
        Assert.assertTrue(classUnderTest.add(1,2)==3, "1+2 should be 3" );
    }
}
