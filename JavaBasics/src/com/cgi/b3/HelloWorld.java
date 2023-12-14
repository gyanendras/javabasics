package com.cgi.b3;
/**
* This Class greets everyone
* @author Gyanendra
* @since 01-12-2020
*/
public class HelloWorld{

/*
*This block of code is for intialising 
*Greeting
*
*/
static String greeting = "Hello World" ;
// int x = 10;
// char myfav = 'a';


/**
* Prints the main
* takes arguments from cmd line as strings
* @param args take arg from cmd line
*/
public static void main(String[] args){
System.out.println(greeting + "From Gyanendra" + "04/12" );

System.out.println(greeting + args[0]);

System.out.println(args[1]+ " " + args[7]);

}

}
