package com.test;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertFalse;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Ignore;
import org.junit.experimental.categories.Category;
import org.testng.SkipException;

public class firstTest {

	
	@Test
	public void testmethod1() throws JSONException, IOException {

		String payload = getPayload("gitLabjob.json");
		JSONObject json = new JSONObject(payload);
		System.out.println(json.get("build_id"));

		System.out.println("after update");
		json.put("build_id", 101);
		System.out.println(json.get("build_id"));
		assertTrue(true);
	}

	@Test
	public void testmethod2() {
		assertTrue(true);
	}

	public static String getPayload(final String fileNm) throws IOException, JSONException {

		final File file = new File("src/test/resources/" + fileNm);

		final Path path = file.toPath();
		System.out.println("-------------path for json file :" + file.getAbsolutePath());

		final StringBuilder sb = new StringBuilder();
		final List<String> content = Files.readAllLines(path, Charset.defaultCharset());

		for (final String string : content) {

			sb.append(string);
		}

		final String jsonstring = sb.toString();

		return jsonstring;
	}

	@Test
	public void emptytest() {

	}
	@Test
	public void testmethod1() {
		assertTrue(true);
	}
	@Test
	public void testmethod2() {
		assertTrue(true);
	}
	@Test
	public void testmethod3() {
		assertTrue(true);
	}
	@Test
	public void testmethod4() {
		assertTrue(true);
	}
	@Test
	public void testmethod5() {
		assertTrue(true);
	}
	@Test
	public void testmethod6() {
		assertTrue(true);
	}
	@Test
	public void testmethod7() {
		assertTrue(true);
	}
	@Test
	public void testmethod8() {
		assertTrue(true);
	}
	@Test
	public void testmethod9() {
		assertTrue(true);
	}
	@Test
	public void testmethod10() {
		assertTrue(true);
	}
	@Test
	public void testmethod11() {
		assertTrue(true);
	}
	@Test
	public void testmethod12() {
		assertTrue(true);
	}
	@Test
	public void testmethod13() {
		assertTrue(true);
	}
	@Test
	public void testmethod14() {
		assertTrue(true);
	}
	@Test
	public void testmethod15() {
		assertTrue(true);
	}
	@Test
	public void testmethod16() {
		assertTrue(true);
	}
	@Test
	public void testmethod17() {
		assertTrue(true);
	}
	@Test
	public void testmethod18() {
		assertTrue(true);
	}
	@Test
	public void testmethod19() {
		assertTrue(true);
	}
	@Test
	public void testmethod20() {
		assertTrue(true);
	}
	@Test
	public void testmethod21() {
		assertTrue(true);
	}
	@Test
	public void testmethod22() {
		assertTrue(true);
	}

	@Test
	public void testmethod23() {
		assertTrue(true);
	}
	@Test
	public void testmethod24() {
		assertTrue(true);
	}
	@Test
	public void testmethod25() {
		assertTrue(true);
	}
	@Test
	public void testmethod26() {
		assertTrue(true);
	}
	@Test
	public void testmethod28() {
		assertTrue(true);
	}
	@Test
	public void testmethod27() {
		assertTrue(true);
	}
	@Test
	public void testmethod29() {
		assertTrue(true);
	}
	@Test
	public void testmethod30() {
		assertTrue(true);
	}
	@Test
	public void test_method1() {
		assertTrue(true);
	}
	@Test
	public void test_method2() {
		assertTrue(true);
	}
	@Test
	public void test_method3() {
		assertTrue(true);
	}
	@Test
	public void test_method4() {
		assertTrue(true);
	}
	@Test
	public void test_method5() {
		assertTrue(true);
	}
	@Test
	public void test_method6() {
		assertTrue(true);
	}
	@Test
	public void test_method7() {
		assertTrue(true);
	}
	@Test
	public void test_method8() {
		assertTrue(true);
	}
	@Test
	public void test_method9() {
		assertTrue(true);
	}
	@Test
	public void test_method10() {
		assertTrue(true);
	}
	@Test
	public void test_method11() {
		assertTrue(true);
	}
	@Test
	public void test_method12() {
		assertTrue(true);
	}
	@Test
	public void test_method13() {
		assertTrue(true);
	}
	@Test
	public void test_method14() {
		assertTrue(true);
	}
	@Test
	public void test_method15() {
		assertTrue(true);
	}
	@Test
	public void test_method16() {
		assertTrue(true);
	}
	@Test
	public void test_method17() {
		assertTrue(true);
	}
	@Test
	public void test_method18() {
		assertTrue(true);
	}
	@Test
	public void test_method19() {
		assertTrue(true);
	}
	@Test
	public void test_method20() {
		assertTrue(true);
	}
	@Test
	public void test_method21() {
		assertTrue(true);
	}
	@Test
	public void test_method22() {
		assertTrue(true);
	}
	@Test
	public void test_method23() {
		assertTrue(true);
	}
	@Test
	public void test_method24() {
		assertTrue(true);
	}
	@Test
	public void test_method25() {
		assertTrue(true);
	}
	@Test
	public void test_method26() {
		assertTrue(true);
	}
	@Test
	public void test_method28() {
		assertTrue(true);
	}
	@Test
	public void test_method27() {
		assertTrue(true);
	}
	@Test
	public void test_method29() {
		assertTrue(true);
	}
	@Test
	public void test_method30() {
		assertTrue(true);
	}
	@Test
	public void test_method_1() {
		assertTrue(true);
	}
	@Test
	public void test_method_2() {
		assertTrue(true);
	}
	@Test
	public void test_method_3() {
		assertTrue(true);
	}
	@Test
	public void test_method_4() {
		assertTrue(true);
	}
	@Test
	public void test_method_5() {
		assertTrue(true);
	}
	@Test
	public void test_method_6() {
		assertTrue(true);
	}
	@Test
	public void test_method_7() {
		assertTrue(true);
	}
	@Test
	public void test_method_8() {
		assertTrue(true);
	}
	@Test
	public void test_method_9() {
		assertTrue(true);
	}
	@Test
	public void test_method_10() {
		assertTrue(true);
	}
	@Test
	public void test_method_11() {
		assertTrue(true);
	}
	@Test
	public void test_method_12() {
		assertTrue(true);
	}
	@Test
	public void test_method_13() {
		assertTrue(true);
	}
	@Test
	public void test_method_14() {
		assertTrue(true);
	}
	@Test
	public void test_method_15() {
		assertTrue(true);
	}
	@Test
	public void test_method_16() {
		assertTrue(true);
	}
	@Test
	public void test_method_17() {
		assertTrue(true);
	}
	@Test
	public void test_method_18() {
		assertTrue(true);
	}
	@Test
	public void test_method_19() {
		assertTrue(true);
	}
	@Test
	public void test_method_20() {
		assertTrue(true);
	}
	@Test
	public void test_method_21() {
		assertTrue(true);
	}
	@Test
	public void test_method_22() {
		assertTrue(true);
	}
	@Test
	public void test_method_23() {
		assertTrue(true);
	}
	@Test
	public void test_method_24() {
		assertTrue(true);
	}
	@Test
	public void test_method_25() {
		assertTrue(true);
	}
	@Test
	public void test_method_26() {
		assertTrue(true);
	}
	@Test
	public void test_method_28() {
		assertTrue(true);
	}
	@Test
	public void test_method_27() {
		assertTrue(true);
	}
	@Test
	public void test_method_29() {
		assertTrue(true);
	}
	@Test
	public void test_method_30() {
		assertTrue(true);
	}
	@Test
	public void test_method_31() {
		assertTrue(true);
	}
	@Test
	public void test_method_32() {
		assertTrue(true);
	}
	@Test
	public void test_method_33() {
		assertTrue(true);
	}
	@Test
	public void test_method_34() {
		assertTrue(true);
	}
	@Test
	public void test_method_35() {
		assertTrue(true);
	}
	@Test
	public void test_method_36() {
		assertTrue(true);
	}
	@Test
	public void test_method_38() {
		assertTrue(true);
	}
	@Test
	public void test_method_37() {
		assertTrue(true);
	}
	@Test
	public void test_method_39() {
		assertTrue(true);
	}
	@Test
	public void test_method_40() {
		assertTrue(true);
	}				
	
	
	@Test
	public void failedtest() {
		assertFalse(true, "balu-test is failed");
	}

	@Ignore
	@Test()
	public void disabledtest() {
		System.out.println("disabled test");
	}

	@Test
	public void testskipped() {
		throw new SkipException("skipped");
	}
}
