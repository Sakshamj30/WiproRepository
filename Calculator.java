package wiprovelocity.in;

import java.util.*;

class OperationClass{
	
	public void add(int a,int b) {
		int c = a+b;
		System.out.println(c);
	}
	
	public void sub(int a, int b) {
		int c = a-b;
		System.out.println(c);
		
	}
	
	public void div(int a,int b) {
		int c = a/b;
		System.out.println(c);
		
	}
	
	public void mul(int a, int b) {
		int c = a*b;
		System.out.println(c);
		
	}
}

public class Calculator {
	
	
	@SuppressWarnings("resource")
	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		char op = sc.next().charAt(0);
		
		OperationClass opc = new OperationClass();
		
		switch(op) {
		case '+':
			opc.add(a, b);
			break;
		
		case '-':
			opc.sub(a, b);
			break;
			
		case '/':
			opc.div(a, b);
			break;
			
		case '*':
			opc.mul(a, b);
			break;
			
		}	
	}
}
