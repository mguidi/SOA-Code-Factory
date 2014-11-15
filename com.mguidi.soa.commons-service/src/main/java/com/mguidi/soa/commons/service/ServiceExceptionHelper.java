package com.mguidi.soa.commons.service;

import java.io.IOException;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public class ServiceExceptionHelper {
	
	public static final String EXCEPTION = "exception";
	public static final String MSG = "msg";

	public static ServiceException fromJson(JsonReader reader)
			throws IOException {
		ServiceExceptionImpl exception = new ServiceExceptionImpl();

		reader.beginObject();
		String key;
		while (reader.hasNext()) {
			key = reader.nextName();
			if (key.equals(EXCEPTION)) {
				exception.exception = reader.nextString();
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

		writer.name(EXCEPTION);
		writer.value(obj.getException());

		writer.name(MSG);
		writer.value(obj.getMsg());

		writer.endObject();
	}
	
	static class ServiceExceptionImpl implements ServiceException {
		
		public String exception;
		public String msg;

		@Override
		public String getException() {
			return exception;
		}

		@Override
		public String getMsg() {
			return msg;
		}
	}

}
