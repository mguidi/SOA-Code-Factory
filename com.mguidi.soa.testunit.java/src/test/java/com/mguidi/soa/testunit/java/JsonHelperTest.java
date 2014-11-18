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
		
		featuresA.setBoolean(true);
		featuresA.setByte((byte)'a');
		featuresA.setDate(new SimpleDateFormat("yyyy-MM-dd").parse("2014-10-29"));
		featuresA.setDatetime(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS").parse("2014-10-29T00:00:00.000"));
		featuresA.setDecimal(new BigDecimal("10.99"));
		featuresA.setDouble(0.99);
		featuresA.setFloat(0.98f);
		featuresA.setInteger(5);
		featuresA.setLong(4l);
		featuresA.setShort((short) 3);
		featuresA.setString("hello world");
		featuresA.setTimestamp(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").parse("2014-10-29T00:00:00.000+0000"));
		
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
			
			assertTrue("boolean", featuresA.getBoolean().equals(featuresB.getBoolean()));
			assertTrue("byte", featuresA.getByte().equals(featuresB.getByte()));
			assertTrue("date", featuresA.getDate().equals(featuresB.getDate()));
			assertTrue("datetime", featuresA.getDatetime().equals(featuresB.getDatetime()));
			assertTrue("decimal", featuresA.getDecimal().equals(featuresB.getDecimal()));
			assertTrue("double", featuresA.getDouble().equals(featuresB.getDouble()));
			assertTrue("float", featuresA.getFloat().equals(featuresB.getFloat()));
			assertTrue("integer", featuresA.getInteger().equals(featuresB.getInteger()));
			assertTrue("long", featuresA.getLong().equals(featuresB.getLong()));
			assertTrue("short", featuresA.getShort().equals(featuresB.getShort()));
			assertTrue("string", featuresA.getString().equals(featuresB.getString()));
			assertTrue("timestamp", featuresA.getTimestamp().equals(featuresB.getTimestamp()));
			
		} catch (IOException e) {
			assertTrue("json deserialization fail", false);
		}
	}
	
	public void testReferenceFeatures() throws ParseException {
		PrimitiveFeatures featuresA = new PrimitiveFeatures();
		
		featuresA.setBoolean(true);
		featuresA.setByte((byte)'a');
		featuresA.setDate(new SimpleDateFormat("yyyy-MM-dd").parse("2014-10-29"));
		featuresA.setDatetime(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS").parse("2014-10-29T00:00:00.000"));
		featuresA.setDecimal(new BigDecimal("10.99"));
		featuresA.setDouble(0.99);
		featuresA.setFloat(0.98f);
		featuresA.setInteger(5);
		featuresA.setLong(4l);
		featuresA.setShort((short) 3);
		featuresA.setString("hello world");
		featuresA.setTimestamp(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").parse("2014-10-29T00:00:00.000+0000"));
		
		ReferenceFeatures referenceFeaturesA = new ReferenceFeatures();
		referenceFeaturesA.setFeatures(featuresA);
		
		
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
			
			assertTrue("boolean", referenceFeaturesA.getFeatures().getBoolean().equals(referenceFeaturesB.getFeatures().getBoolean()));
			assertTrue("byte", referenceFeaturesA.getFeatures().getByte().equals(referenceFeaturesB.getFeatures().getByte()));
			assertTrue("date", referenceFeaturesA.getFeatures().getDate().equals(referenceFeaturesB.getFeatures().getDate()));
			assertTrue("datetime", referenceFeaturesA.getFeatures().getDatetime().equals(referenceFeaturesB.getFeatures().getDatetime()));
			assertTrue("decimal", referenceFeaturesA.getFeatures().getDecimal().equals(referenceFeaturesB.getFeatures().getDecimal()));
			assertTrue("double", referenceFeaturesA.getFeatures().getDouble().equals(referenceFeaturesB.getFeatures().getDouble()));
			assertTrue("float", referenceFeaturesA.getFeatures().getFloat().equals(referenceFeaturesB.getFeatures().getFloat()));
			assertTrue("integer", referenceFeaturesA.getFeatures().getInteger().equals(referenceFeaturesB.getFeatures().getInteger()));
			assertTrue("long", referenceFeaturesA.getFeatures().getLong().equals(referenceFeaturesB.getFeatures().getLong()));
			assertTrue("short", referenceFeaturesA.getFeatures().getShort().equals(referenceFeaturesB.getFeatures().getShort()));
			assertTrue("string", referenceFeaturesA.getFeatures().getString().equals(referenceFeaturesB.getFeatures().getString()));
			assertTrue("timestamp", referenceFeaturesA.getFeatures().getTimestamp().equals(referenceFeaturesB.getFeatures().getTimestamp()));
			
		} catch (IOException e) {
			assertTrue("json deserialization fail", false);
		}
	}
}
