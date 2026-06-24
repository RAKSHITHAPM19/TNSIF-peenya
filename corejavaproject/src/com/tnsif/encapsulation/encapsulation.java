package com.tnsif.encapsulation;

public class encapsulation {
        
        int serialnumber;// properties or data member
        String name; // Declaration 
        int age;
        
        void show() {  // member function 
                System.out.println(serialnumber +" "+name+" "+age);
        }
        
        public static void main(String[] args) {
                encapsulation e=new encapsulation();
                e.serialnumber=9;
                e.name="Ramesh";
                e.age=56;
                
                e.show();
        }
}
