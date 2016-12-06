package exercise;

public class StudyFunctions {

	public static void main(String[] args) {
		
		// 1. 변수로 받은 문자열을 출력하는 함수를 작성하세요.
		printString("Hello");
		
		// 2. 변수로 받은 월에 따라 영문 월명을 출력하세요.
		//   ex: month = 1 -> January
		//   ex: month = 2 -> Febrary
		int month = 8;
		printMonthName(month);
		
		// 3. 변수로 받는 년, 월에 따라 영문 월명과 해당 년월의 날짜 수를 출력하세요.
		int year = 2016;
		printMonthNameAndDays(year, month);
		
		// 4. 변수로 받는 년, 월에 따라 영문 월명과
		//    해당 년월의 날짜 수를 출력하세요.
		//    (단, 날짜 수가 31일이 아닐 경우에만 날짜 수를 출력하세요.)
		//   출력예: 2016년 1월 : January
		//   출력예: 2016년 2월 : May (29일)
		printMonthNameAndDays2(year, month);
	}
	static void printString(String letter) {
		
		System.out.println(letter);
		
	}
	
	static String printMonthName(int month) {
		/*
		switch(month){
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default:
			System.out.println("오류");			
			
		}
		*/
		String monthNames[] = {"January","February","March","April","May","June","July","August",
				"September","october","November","December"};
		String monthName = monthNames[month - 1];
		
		return monthName;
	}
	
	static int getDaysOfMonth(int year, int month) {
		
		if (month == 2) {
			if (year % 4 == 0) {
				return 29;
			}
			else {
				return 28;				
			}
		}
		
		else if ((month < 8 && month % 2 == 1) || (month >=8 && month % 2 ==0)) {
			return 31;
		}
		
		else {
			return 30;
		}
		
	}
	
	static void printMonthNameAndDays(int year, int month) {
		
		System.out.println(year + "년 " + month + "월 : " + printMonthName(month) + " ("
				+ getDaysOfMonth(year,month) + "일)");
		
	}
	static void printMonthNameAndDays2(int year, int month) {
		
		if( getDaysOfMonth(year, month) == 31){
			System.out.println( year + "년 " + month + "월 : " + printMonthName(month));
		}
		else {
			printMonthNameAndDays(year, month);
		}
		
	}
}
