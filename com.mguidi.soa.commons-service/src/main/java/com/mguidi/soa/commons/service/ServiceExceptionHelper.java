package com.mguidi.soa.commons.service;

import java.io.IOException;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public class ServiceExceptionHelper {
	
	public static final String CODE = "code";
	public static final String MSG = "msg";

	public static ServiceException fromJson(JsonReader reader)
			throws IOException {
		ServiceExceptionImpl exception = new ServiceExceptionImpl();

		reader.beginObject();
		String key;
		while (reader.hasNext()) {
			key = reader.nextName();
			if (key.equals(CODE)) {
				exception.code = reader.nextInt();
			} else if (key.equals(MSG)) {
				exception.msg = reader.nextString();
			} else {
				reader.skipValue();
			}
		}
		reader.endObject();

		return exception;

	}

	public static void writeJson(ServiceException obj, JsonWriter writer)
			throws IOException {

		writer.beginObject();

		writer.name(CODE);
		writer.value(obj.getCode());

		writer.name(MSG);
		writer.value(obj.getMsg());

		writer.endObject();
	}
	
	static class ServiceExceptionImpl implements ServiceException {
		
		public int code;
		public String msg;

		@Override
		public int getCode() {
			return code;
		}

		@Override
		public String getMsg() {
			return msg;
		}
	}

}
