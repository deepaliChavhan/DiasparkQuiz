package com;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name = "pcs",eager = true)
@SessionScoped

public class PageControllers implements Serializable {

	public String next(){
	    return "page.xhtml";
	}
	
	public String prev(){
	    return "pagnav";
	}
	
	
}
