package com.heavyplus.bonbbs;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonParseSingleObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    String jsonString = "{\"title\": \"how to get stroage size\","
	            + "\"url\": \"https://codechacha.com/ko/get-free-and-total-size-of-volumes-in-android/\","
	            + "\"draft\": false,"
	            + "\"star\": 10"
	            + "}";

	    // JSONObjet�� �����ͼ� key-value�� �н��ϴ�.
	    JSONObject jObject = new JSONObject(jsonString);
	    String title 	= jObject.getString("title");
	    String url 		= jObject.getString("url");
	    Boolean draft 	= jObject.getBoolean("draft");
	    int star 		= jObject.getInt("star");

	    System.out.println("title: " + title);
	    System.out.println("url: " + url);
	    System.out.println("draft: " + draft);
	    System.out.println("star: " + star);		
	}

}
