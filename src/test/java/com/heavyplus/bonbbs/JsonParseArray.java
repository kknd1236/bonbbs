package com.heavyplus.bonbbs;

import org.json.JSONArray;
import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;

public class JsonParseArray {
	
	public static void main(String[] args) throws JsonProcessingException {
		
	    String jsonString =
	    "{"
	    +   "\"posts\": ["
	    +       "{"
	    +           "\"title\": \"how to get stroage size\","
	    +           "\"url\": \"https://codechacha.com/ko/get-free-and-total-size-of-volumes-in-android/\","
	    +           "\"draft\": false"
	    +       "},"
	    +       "{"
	    +           "\"title\": \"Android Q, Scoped Storage\","
	    +           "\"url\": \"https://codechacha.com/ko/android-q-scoped-storage/\","
	    +           "\"draft\": false"
	    +       "},"
	    +       "{"
	    +           "\"title\": \"How to parse JSON in android\","
	    +           "\"url\": \"https://codechacha.com/ko/how-to-parse-json-in-android/\","
	    +           "\"draft\": true"
	    +       "}"
	    +   "]"
	    +"}";
	
	    // ���� ū JSONObject�� �����ɴϴ�.
	    JSONObject jObject = new JSONObject(jsonString);
	    // �迭�� �����ɴϴ�.
	    JSONArray jArray = jObject.getJSONArray("posts");
	
	    // �迭�� ��� �������� ����մϴ�.
	    for (int i = 0; i < jArray.length(); i++) {
	        JSONObject obj = jArray.getJSONObject(i);
	        String title  = obj.getString("title");
	        String url 	  = obj.getString("url");
	        boolean draft = obj.getBoolean("draft");
	        
	        System.out.println("title(" + i + "): " + title);
	        System.out.println("url(" + i + "): " + url);
	        System.out.println("draft(" + i + "): " + draft);
	        System.out.println();
	    }
	}
	
}	
