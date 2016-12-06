package exercise;

public class ArrayExercise {
	public static void main(String[] args) {
		
		// 1. 1월부터 12월까지 영문 월명을 담고있는
		//    배열을 만들어 반환하세요.
		//    단, {"January", ... "December"} 문법 제외
		String[] monthNames = createMonthNameArray();
		printArray(monthNames);		
		
		// 2. 월명 배열의 각 글자 수를 배열로 만들어 반환하세요.
		//  hint: int lengthOfString = "March".length();
		int[] monthNamesLength = countMonthNamesLength(monthNames);
		printArray(monthNamesLength);
		
		// 3. 월명이 5자 이하인 월명을 배열로 만들어 반환하세요.
		String[] shortMonthNames = getShortMonthNames(monthNames);
		printArray(shortMonthNames);
		
		// 4. 월명이 5자 이하이면 월명을 배열에 넣고
		//    6자 이상이면 "Long" 문자열을 넣어서 배열을 반환하세요.
		shortMonthNames = getShortMonthNamesOrLong(monthNames);
		printArray(shortMonthNames);
				
	}
	
	static String[] getShortMonthNamesOrLong(String[] monthNames) {

		String[] resultMonthNames = new String[monthNames.length];
		
		for( int i=0 ; i < monthNames.length ; i++) {
			if(monthNames[i].length()<=5) {
				resultMonthNames[i] = monthNames[i];
			}
			else{
				resultMonthNames[i] = "Long";
			}
		}
		return resultMonthNames;
	}

	static String[] getShortMonthNames(String[] monthNames) {

		int[] resultIndex = new int[monthNames.length];
		int count =0;
		for(int i=0 ; i<monthNames.length ; i++) {
			if(monthNames[i].length()<=5) {
				resultIndex[count] = i;
				count++;
			}
		}
		
		String[] resultMonthName = new String[count];
		for(int j=0 ; j<count ; j++) {
			int index = resultIndex[j];
			resultMonthName[j] = monthNames[index];
			}
		return resultMonthName;
	
	}

	static int[] countMonthNamesLength(String[] monthNames) {

		int[] lengthOfMonthName =new int[monthNames.length];
		
		for(int i=0 ; i<monthNames.length ; i++) {
			lengthOfMonthName[i] = monthNames[i].length();
		}
		return lengthOfMonthName;
	}

	static void printArray(int[] array) {
		System.out.print("[");
		for (int i=0;i<array.length;i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			
			System.out.print(array[i]);
		}
		System.out.println("]");
	}
	
	static String[] createMonthNameArray() {
		
		String[] monthNameEng = new String[12];
		
		monthNameEng[0] ="January";
		monthNameEng[1] ="February"; 
		monthNameEng[2] ="March";
		monthNameEng[3] ="April";
		monthNameEng[4] ="May";
		monthNameEng[5] ="June";
		monthNameEng[6] ="July";
		monthNameEng[7] ="August";
		monthNameEng[8] ="September";
		monthNameEng[9] ="October";
		monthNameEng[10] ="November";
		monthNameEng[11] ="December";
		
		return monthNameEng;
	}

	static void printArray(String[] array) {
		System.out.print("[");
		for (int i=0;i<array.length;i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			
			System.out.print(array[i]);
		}
		System.out.println("]");
	}
}
