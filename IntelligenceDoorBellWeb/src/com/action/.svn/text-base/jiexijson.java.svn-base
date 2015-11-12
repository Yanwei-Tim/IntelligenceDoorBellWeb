package com.action;



import org.json.JSONException;

import net.sf.json.JSONObject;

import com.info.Person;




public class jiexijson {
   
     public jiexijson(){
    	 
     }
	  //解析注册页面的变量
     public static Person getperson(String key , String jsonstring) throws JSONException
 	{
 			Person person = new Person();
 			org.json.JSONObject object = new org.json.JSONObject(jsonstring);
 			org.json.JSONObject jsonobjectperson = object.getJSONObject("person");
 			person.setTel(jsonobjectperson.getString("tel"));
 			person.setYanzhengma(jsonobjectperson.getString("yanzhengma"));
 			person.setNickname(jsonobjectperson.getString("nickname"));
 			person.setPassword(jsonobjectperson.getString("password"));
 			person.setConfirmpassword(jsonobjectperson.getString("confirmpassword"));
 			return person;
 			
 	}
    
     //解析忘记密码页面的变量
      
    
     //解析登陆页面的变量

}
