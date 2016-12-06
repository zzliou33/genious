package exercise;

import java.math.BigDecimal;

public class HelloEclipse {


	public static void main(String[] args) {
		System.out.println("Hello Eclipse 한글");
		int num1 = 543;
		int num2 = 715;
		int sum = plus(num1,num2);
				
		System.out.println(isLesserThan(num1, num2));
		System.out.println(isGreaterThan(num1, num2));
		System.out.println(sum);
		System.out.println(minus(num1, num2));
		System.out.println(multiply(num1, num2));
		System.out.println(divide(num1, num2));
	}
	static boolean isLesserThan(int x, int y){
		return x < y; //lT
	}

	static boolean isGreaterThan(int x, int y){
		return x > y; //lT
	}

 	static int plus(int x, int y){
		
		return x+y;		
		
	}
	
	static int minus(int x, int y){
		
		return x-y;		
		
	}
	
	static int multiply(int x, int y){
		
		return x*y;		
		
	}
	
	static float divide(float x, float y){
		
		//return x/y;		 
		return new BigDecimal(String.valueOf(x)).divide(new BigDecimal(String.valueOf(y)),
				5, BigDecimal.ROUND_CEILING).floatValue();
	}

}

