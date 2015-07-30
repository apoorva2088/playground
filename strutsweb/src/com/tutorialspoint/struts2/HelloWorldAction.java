package com.tutorialspoint.struts2;

public class HelloWorldAction{
	   private String name;

	   public String execute() throws Exception {
	      return "helloworld";
	   }
	   
	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }
	}