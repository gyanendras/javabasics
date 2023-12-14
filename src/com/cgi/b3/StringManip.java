package com.cgi.b3;

public class StringManip {
	
	String s2 = new String("student");
	String s3 = new String("student");
	String s0="apple";
	
	String s4 = "student";
	String s1 = "student";
	public static void main(String[] args) {
		StringManip sm = new StringManip();
		String s5 = new String("student");
		String s6 = new String("student");
		StringBuilder sb1 = new StringBuilder("student");
		StringBuilder sb2 = new StringBuilder("student");
		sb1.replace(1, 2, "abc");
		
		
		
		s5 = sm.s4.replace("ent", "ious");
		s6 = sm.s4.replace("ent", "ious1");
		String s7 =  sm.s4.replace("student", "apple");
		
		
		System.out.println(sm.s0 + sm.s0.hashCode() +"\n"+sm.s1 + sm.s1.hashCode() +"\n"+ 
		sm.s2+sm.s2.hashCode()+"\n"+sm.s3+sm.s3.hashCode()+"\n"+sm.s4+sm.s4.hashCode()
		+"\n"+s5+s5.hashCode()+"\n"+s6+s6.hashCode()
		+"\n"+s7+s7.hashCode());
		
	System.out.println(sb1.append(sb1.hashCode())+ "\n"+ sb2+sb2.hashCode());
	
	System.out.println(sm.s1 == sb2.toString());
	System.out.println(sm.s1.equals(sb2.toString()));
	System.out.println(sm.s1+" "+sb2.toString());
	}

}
