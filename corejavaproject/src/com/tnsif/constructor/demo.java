package com.tnsif.constructor;

public class demo {
        demo(){
                System.out.println("welcome to java");
                System.out.println("default");
        }
        demo(int a,int b){
                System.out.println("2 parameter ");
        }
        demo(String s){
                System.out.println("one parameter");
        }
        demo(int a,String f){
                System.out.println("mixed parameter");                
        }
        public static void main(String[] args) {
                demo  d=new demo ();
                demo d1=new demo (2,"roshan");
                demo d2=new demo (2,5);
                demo d3=new demo ("raghu");
                
        }
}