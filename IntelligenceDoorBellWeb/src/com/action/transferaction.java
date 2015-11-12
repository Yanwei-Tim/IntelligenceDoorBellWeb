package com.action;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.json.JSONException;

import com.info.Person;
import com.opensymphony.xwork2.ActionSupport;

public class transferaction   extends ActionSupport{
     
	  public String jsonstring ;
	  public String tel1;
	  public String yanzhengma1;
	  public String nickname1;
	  public String password1;
	  public String confirmword1;
	  public Person person;
	  public  String  getjsonstring(){
		  
		  return jsonstring;
	  }
	 public void setjsonstring(String jsonstring){
		 this.jsonstring = jsonstring;
	 }
	 
	 public String execute(){
		  return "sdfsdf";
	 }
	 
	 //获得注册界面的信息，并返回给注册页面
	 public void  transfer() throws IOException, JSONException{
		 
		 HttpServletRequest  request = ServletActionContext.getRequest();
		 HttpServletResponse response = (HttpServletResponse) ServletActionContext.getResponse();
		 response.setContentType("text/html;charset=utf-8");
         response.setCharacterEncoding("UTF-8");     //显示的是中文，传到移动端的也是中文(编码方式)
         jsonstring = request.getParameter("jsonstring");  
      //  System.out.println(new String(jsonstring.getBytes("ISO-8859-1"),"GBK"));  //转换编码方式在网页输出的为正常汉字
     	  System.out.println(jsonstring);
     	/*person = jiexijson.getperson("person", jsonstring);
     	  tel1 = person.getTel();
     	  yanzhengma1 = person.getYanzhengma();
     	  nickname1 = person.getNickname();
     	  password1 = person.getPassword();
     	  confirmword1 = person.getConfirmpassword();
     	  System.out.println(tel1);
     	  System.out.println(yanzhengma1);
     	  System.out.println(nickname1);
     	  System.out.println(password1);
     	  System.out.println(confirmword1);*/
          response.getWriter().println("注册成功");                //把字符串返回到流中移动端取得
	 }
	 
	 //获得忘记密码页面的信息，并返回给忘记密码页面信息
	 public void transferforget(){
		 
		 
		 
	 }
	 
	 //获得登陆页面的信息，并返回给登陆页面细信息
	 public void transferenter(){
		 
	 }
}
