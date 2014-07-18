package com;



import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="wm" , eager =true)
@SessionScoped
public class WelcomeMessage implements Serializable {
 
	private static final long serialVersionUID = 1L;
 
	private String uname;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	
	
	public String getSayHello(){
		   //check if null?
		   if("".equals(uname) || uname ==null){
			return "";
		   }else{
			return "Hello " + uname + "! Have a nice day.";
		   }
		}
}
