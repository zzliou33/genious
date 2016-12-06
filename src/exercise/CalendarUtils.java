package exercise;

public class CalendarUtils {

	public static void main(String[] args) {
		
		int year = 2016;
		int month = 7;
		
		System.out.println(getDaysOfMonth(year,month));
		//해당 년월의 날짜 수를 출력하세요.
		
		System.out.println(getDaysOfYear(year) + "일");
		//해당년의 총 날짜 수를 출력하세요.
		
		System.out.println(plusAndMinus(4, 5, 3));
		//3개의 정수값을 받아 앞의 두값을 더하고 세번째 값을 빼는 함수를 작성하세요.
		
		System.out.println(plusAndMultiply(4, 5, 3));
		//3개의 정수값을 받아 앞의 두값을 더하고 세번째 값을 곱하는 함수를 작성하세요.
		
		System.out.println(plusAndMultiplyOrMinus(4, 5, 3));
		//3개의 정수값을 받아 앞의 두값을 더하고, 그합이 짝수리면 세번째 값을 곱하고 홀수이면 값을 빼는 함수
	}
	static int plusAndMultiplyOrMinus(int a, int b, int c) {
	
		int sum = plus(a, b);
		
		if(sum % 2 ==0) {
			return multiply(sum,c);
		}
		else {
			return minus(sum,c);
		}
			
	}
	static int plusAndMinus(int a, int b, int c) {
		
		return minus(plus(a, b), c);
		
	}
	static int plusAndMultiply(int a, int b, int c) {
		return multiply(plus(a, b), c);
	}
	static int plus(int a, int b) {
		
		return a + b;
		
	}
	static int minus(int a, int b) {
		
		return a - b;
		
	}
	static int multiply(int a, int b) {
		return a * b;
	}
	static String getDaysOfMonth(int year, int month) {
	
		if (month == 2) {
			if (year % 4 == 0) {
				return "29일";
			}
			else {
				return "28일";				
			}
		}
		
		else if ((month < 8 && month % 2 == 1) || (month >=8 && month % 2 ==0)) {
			return "31일";
		}
		
		else {
			return "30일";
		}
		
	}
	static int getDaysOfYear(int year) {

		if (year % 4 ==0) {
			return 366;
		}
		
		else {
			return 365;
		}
		
	}
	
}