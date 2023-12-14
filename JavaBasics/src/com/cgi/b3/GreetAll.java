package com.cgi.b3;

public class GreetAll{
private String s = "Hello World!";
private int x = 20;

GreetAll(){
	s = "HI PPL!" ;
}

GreetAll(String s){
	this.s = s ;
}

void greet(){
System.out.println(s);
}

public static void main(String args[]){
GreetAll ga = new GreetAll();
GreetAll ga1 = new GreetAll("HI from parameterised Const in JB Fix branch	");
ga.greet();
ga1.greet();

}
}