package com.mguidi.soa.testunit.java;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mguidi.soa.test.json.model.PrimitiveFeatures;
import com.mguidi.soa.test.json.model.ReferenceFeatures;
import com.mguidi.soa.test.json.model.helper.json.PrimitiveFeaturesHelper;
import com.mguidi.soa.test.json.model.helper.json.ReferenceFeaturesHelper;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author mguidi
 * 
 */
public class JsonHelperTest extends TestCase {

	public JsonHelperTest(String testName) {
		super(testName);
	}

	public static Test suite() {
		return new TestSuite(JsonHelperTest.class);
	}

	public void testPrimitiveFeatures() throws ParseException {
		PrimitiveFeatures featuresA = new PrimitiveFeatures();
		
		featuresA._boolean = true;
		featuresA._byte = 'a';
		featuresA._date = new SimpleDateFormat("yyyy-MM-dd").parse("2014-10-29");
		featuresA._datetime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS").parse("2014-10-29T00:00:00.000");
		featuresA._decimal = new BigDecimal("10.99");
		featuresA._double = 0.99;
		featuresA._float = 0.98f;
		featuresA._integer = 5;
		featuresA._long = 4l;
		featuresA._short = (short) 3;
		featuresA._string = "hello world";
		featuresA._timestamp = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").parse("2014-10-29T00:00:00.000+0000");
		
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		try {
			JsonWriter writer = new JsonWriter(new OutputStreamWriter(os));
			PrimitiveFeaturesHelper.writeJson(featuresA, writer);
			writer.close();
			
		} catch (IOException e) {
			assertTrue("json serialization fail", false);
		}
		
		ByteArrayInputStream is = new ByteArrayInputStream(os.toByteArray());
		try {
			PrimitiveFeatures featuresB = PrimitiveFeaturesHelper.fromJson(new JsonReader(new InputStreamReader(is)));
			
			assertTrue("_boolean", featuresA._boolean.equals(featuresB._boolean));
			assertTrue("_byte", featuresA._byte.equals(featuresB._byte));
			assertTrue("_date", featuresA._date.equals(featuresB._date));
			assertTrue("_datetime", featuresA._datetime.equals(featuresB._datetime));
			assertTrue("_decimal", featuresA._decimal.equals(featuresB._decimal));
			assertTrue("_double", featuresA._double.equals(featuresB._double));
			assertTrue("_float", featuresA._float.equals(featuresB._float));
			assertTrue("_integer", featuresA._integer.equals(featuresB._integer));
			assertTrue("_long", featuresA._long.equals(featuresB._long));
			assertTrue("_short", featuresA._short.equals(featuresB._short));
			assertTrue("_string", featuresA._string.equals(featuresB._string));
			assertTrue("_timestamp", featuresA._timestamp.equals(featuresB._timestamp));
			
		} catch (IOException e) {
			assertTrue("json deserialization fail", false);
		}
	}
	
	public void testReferenceFeatures() throws ParseException {
		PrimitiveFeatures featuresA = new PrimitiveFeatures();
		
		featuresA._boolean = true;
		featuresA._byte = 'a';
		featuresA._date = new SimpleDateFormat("yyyy-MM-dd").parse("2014-10-29");
		featuresA._datetime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS").parse("2014-10-29T00:00:00.000");
		featuresA._decimal = new BigDecimal("10.99");
		featuresA._double = 0.99;
		featuresA._float = 0.98f;
		featuresA._integer = 5;
		featuresA._long = 4l;
		featuresA._short = (short) 3;
		featuresA._string = "hello world";
		featuresA._timestamp = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").parse("2014-10-29T00:00:00.000+0000");
		
		ReferenceFeatures referenceFeaturesA = new ReferenceFeatures();
		referenceFeaturesA.features = featuresA;
		
		
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		try {
			JsonWriter writer = new JsonWriter(new OutputStreamWriter(os));
			ReferenceFeaturesHelper.writeJson(referenceFeaturesA, writer);
			writer.close();
			
		} catch (IOException e) {
			assertTrue("json serialization fail", false);
		}
		
		ByteArrayInputStream is = new ByteArrayInputStream(os.toByteArray());
		try {
			ReferenceFeatures referenceFeaturesB = ReferenceFeaturesHelper.fromJson(new JsonReader(new InputStreamReader(is)));
			
			assertTrue("_boolean", referenceFeaturesA.features._boolean.equals(referenceFeaturesB.features._boolean));
			assertTrue("_byte", referenceFeaturesA.features._byte.equals(referenceFeaturesB.features._byte));
			assertTrue("_date", referenceFeaturesA.features._date.equals(referenceFeaturesB.features._date));
			assertTrue("_datetime", referenceFeaturesA.features._datetime.equals(referenceFeaturesB.features._datetime));
			assertTrue("_decimal", referenceFeaturesA.features._decimal.equals(referenceFeaturesB.features._decimal));
			assertTrue("_double", referenceFeaturesA.features._double.equals(referenceFeaturesB.features._double));
			assertTrue("_float", referenceFeaturesA.features._float.equals(referenceFeaturesB.features._float));
			assertTrue("_integer", referenceFeaturesA.features._integer.equals(referenceFeaturesB.features._integer));
			assertTrue("_long", referenceFeaturesA.features._long.equals(referenceFeaturesB.features._long));
			assertTrue("_short", referenceFeaturesA.features._short.equals(referenceFeaturesB.features._short));
			assertTrue("_string", referenceFeaturesA.features._string.equals(referenceFeaturesB.features._string));
			assertTrue("_timestamp", referenceFeaturesA.features._timestamp.equals(referenceFeaturesB.features._timestamp));
			
		} catch (IOException e) {
			assertTrue("json deserialization fail", false);
		}
	}
}
