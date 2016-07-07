package com.main;

import com.main.HelloWorld;

public class HelloWorld {

    
   private String name = "";

   public String getName() 
   {
      return name;
   }

   public String getMessage() 
   {
      if (name == "") 
      {
         return "Hello!";
      }
      else 
      {
         return "Hello " + name + "!";
      }
   }

   public void setName(String name) 
   {
      this.name = name;
   }
   
   public static void main(String args[]){
       HelloWorld hw = new HelloWorld();
       
       hw.setName("Andy");
       System.out.println(hw.getMessage());
   }
}
