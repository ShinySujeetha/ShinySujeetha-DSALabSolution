package com.gl.javafsd.lab3.brackets;


public class BracketsDriverClass {

	public static void main(String[] args) {
				
		test("{[()]}");
		test("{}");
     	test("[]");
		test("[{}]");
		test("[<>]");
		test("[<<]");
		test("({[<>]})");
		test("({)[](}}");
		
		
	}
	
	private static void test(String brackets) {
			
		BalancedBracketsChecker checker 
			= new BalancedBracketsChecker(brackets);
		boolean result = checker.check();
		
		if (result) {
			System.out.println("The entered string has balanced brackets");			
		}else {
			System.out.println("The entered string doesnot have balanced brackets");
		}		
	}
}