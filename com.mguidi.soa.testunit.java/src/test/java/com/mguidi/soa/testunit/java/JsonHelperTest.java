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
			
			assertTrue("boolean", featuresA._boolean.equals(featuresB._boolean));
			assertTrue("byte", featuresA._byte.equals(featuresB._byte));
			assertTrue("date", featuresA._date.equals(featuresB._date));
			assertTrue("datetime", featuresA._datetime.equals(featuresB._datetime));
			assertTrue("decimal", featuresA._decimal.equals(featuresB._decimal));
			assertTrue("double", featuresA._double.equals(featuresB._double));
			assertTrue("float", featuresA._float.equals(featuresB._float));
			assertTrue("integer", featuresA._integer.equals(featuresB._integer));
			assertTrue("long", featuresA._long.equals(featuresB._long));
			assertTrue("short", featuresA._short.equals(featuresB._short));
			assertTrue("string", featuresA._string.equals(featuresB._string));
			assertTrue("timestamp", featuresA._timestamp.equals(featuresB._timestamp));
			
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
		referenceFeaturesA._features = featuresA;
		
		
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
			
			assertTrue("boolean", referenceFeaturesA._features._boolean.equals(referenceFeaturesB._features._boolean));
			assertTrue("byte", referenceFeaturesA._features._byte.equals(referenceFeaturesB._features._byte));
			assertTrue("date", referenceFeaturesA._features._date.equals(referenceFeaturesB._features._date));
			assertTrue("datetime", referenceFeaturesA._features._datetime.equals(referenceFeaturesB._features._datetime));
			assertTrue("decimal", referenceFeaturesA._features._decimal.equals(referenceFeaturesB._features._decimal));
			assertTrue("double", referenceFeaturesA._features._double.equals(referenceFeaturesB._features._double));
			assertTrue("float", referenceFeaturesA._features._float.equals(referenceFeaturesB._features._float));
			assertTrue("integer", referenceFeaturesA._features._integer.equals(referenceFeaturesB._features._integer));
			assertTrue("long", referenceFeaturesA._features._long.equals(referenceFeaturesB._features._long));
			assertTrue("short", referenceFeaturesA._features._short.equals(referenceFeaturesB._features._short));
			assertTrue("string", referenceFeaturesA._features._string.equals(referenceFeaturesB._features._string));
			assertTrue("timestamp", referenceFeaturesA._features._timestamp.equals(referenceFeaturesB._features._timestamp));
			
		} catch (IOException e) {
			assertTrue("json deserialization fail", false);
		}
	}
}
