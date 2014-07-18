package com;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "ud", eager = true)
@SessionScoped
public class userData implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public String data = "1";
	public String data1 = "1";
	public String data2 = "1";
	public String data3 = "1";
	public String data4 = "1";
	private int score=0;
	

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	public String getData1() {
		return data1;
	}

	public void setData1(String data1) {
		this.data1 = data1;
	}

	public String getData2() {
		return data2;
	}

	public void setData2(String data2) {
		this.data2 = data2;
	}

	public String getData3() {
		return data3;
	}

	public void setData3(String data3) {
		this.data3 = data3;
	}

	public String getData4() {
		return data4;
	}

	public void setData4(String data4) {
		this.data4 = data4;
	}

	public int calculate()
	{
		score=0;
	
		if(data.equals("4"))
		{
			 score=score+1;
			
		}
			 if(data1.equals("2"))
				
			{score=score+1;
				
			}
   if(data2.equals("4"))
				
			{ 
        	  score=score+1;
				
			}
     if(data3.equals("2"))
	     {
	      score=score+1;
	      
      }
       if(data4.equals("2"))
	     {
	      score=score+1;
	   
        }
       System.out.println(score);
		return score;
		
		}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}