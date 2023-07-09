package com.heavyplus.bonbbs;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonParseMultiObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    String jsonString =
	            "{"
	            +   "\"post1\": {"
	            +       "\"title\": \"how to get stroage size\","
	            +       "\"url\": \"https://codechacha.com/ko/get-free-and-total-size-of-volumes-in-android/\","
	            +       "\"draft\": false"
	            +"  },"
	            +   "\"post2\": {"
	            +       "\"title\": \"Android Q, Scoped Storage\","
	            +       "\"url\": \"https://codechacha.com/ko/android-q-scoped-storage/\","
	            +       "\"draft\": false"
	            +   "}"
	            +"}";

	        // ���� ū JSONObject�� �����ɴϴ�.
	        JSONObject jObject = new JSONObject(jsonString);

	        // ù��° JSONObject�� �����ͼ� key-value�� �н��ϴ�.
	        JSONObject post1Object = jObject.getJSONObject("post1");
	        System.out.println(post1Object.toString());
	        System.out.println();
	        
	        String title  = post1Object.getString("title");
	        String url    = post1Object.getString("url");
	        boolean draft = post1Object.getBoolean("draft");
	        
	        System.out.println("title(post1): " + title);
	        System.out.println("url(post1): " + url);
	        System.out.println("draft(post1): " + draft);
	        System.out.println();

	        // �ι�° JSONObject�� �����ͼ� key-value�� �н��ϴ�.
	        JSONObject post2Object = jObject.getJSONObject("post2");
	        System.out.println(post2Object.toString());
	        System.out.println();
	        
	        title = post2Object.getString("title");
	        url   = post2Object.getString("url");
	        draft = post2Object.getBoolean("draft");
	        
	        System.out.println("title(post1): " + title);
	        System.out.println("url(post1): " + url);
	        System.out.println("draft(post1): " + draft);		

	}
}