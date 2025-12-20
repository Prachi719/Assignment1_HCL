package Assignment1;

public class Fourth {
	public static void main(String args[]) {
		
		String a = "Hello! I am very excited to start My Career with HCL  .....  ";
		//length()
		System.out.println("Length of "+a+" is : "+a.length());
		
		//isEmpty()
		System.out.println("Check Whether the string is empty "+a.isEmpty());
		
		//chatAt()
		System.out.println("Character at "+ 5 +" is : "+a.charAt(5));
		
		//toString
		Integer n = 342;
		System.out.println(n.toString());
		
		//equals()
		System.out.println("equals : "+a.equals("Hello! I am very excited to start My Career with HCL  .....  "));
		
		//compareTo()
		System.out.println("Compare to "+a.compareTo("Let's start!"));
		
		//contains()
		System.out.println("contains 'career'  "+" : "+a.contains("career"));
		
		//indexOf()
		System.out.println("index of "+ "excited "+" is : "+a.indexOf("excited"));
		
		////lastindexOf()
		System.out.println("last index of "+ "x "+" is : "+a.lastIndexOf("x"));
		
		//startsWith()
		System.out.println("starts with 'Hello' :  "+a.startsWith("Hello"));
		
		//endsWith()
		System.out.println("ends with '  ' :  "+a.startsWith("  "));
		
		//toLowerCase()
		System.out.println("change case to lower  "+a.toLowerCase());
		
		//trim()
		System.out.println("trim "+a.trim());
		
	}
}
