package com.tnsif.accessmodifier;

public class Publicdemo {
	public int a=9;
	public String b="kusuma";
	public void display() {
		System.out.println("welcome");
	}
	public static void main(String[] args) {
		Publicdemo p= new Publicdemo();
		System.out.println(p.a);
		System.out.println(p.b);
		}
	

}
