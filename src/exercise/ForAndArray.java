package exercise;

public class ForAndArray {

	public static void main(String[] args) {
	
		// 1. 시작월부터 12월까지의 월명을 배열로 반환하세요.
		//  ex: startMonth = 3 -> {"3월", "4월", ... , "12월"}
		int startMonth = 3;
		String[] monthNames = getMonthNames(startMonth);
		
		System.out.print("[");
		
		int k = 0;
		
		for (String monthName : monthNames) {

			
			if (k > 0) {
				System.out.print(", ");
			}
			
			k++;
			
			System.out.print(monthName);
		}
		System.out.println("]");
		
		
		//저 for문은 monthNames배열의 끝까지 하는? 그런거
		/*
		 	
		// 1. 시작월부터 12월까지의 월명을 배열로 반환하세요.
		//  ex: startMonth = 3 -> {"3월", "4월", ... , "12월"}
		int startMonth = 3;
		String[] monthNames = getMonthNames(startMonth);
		
		System.out.print("[");
		for (int i=0;i<monthNames.length;i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			
			System.out.print(monthNames[i]);
		}
		System.out.println("]");
		
		 */
		// 2. 주어진 배열의 부분 배열을 반환하는 함수를 작성하세요.
		int[] numbers = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int startIndex = 2;	// 시작인덱스
		int length = 4;		// 부분 배열의 길이
		int[] subNumbers = getSubArray(numbers, startIndex, length);
		
		System.out.print("[");
		for (int i=0;i<subNumbers.length;i++) {
			if (i > 0) {
				System.out.print(", ");
			}
		
			System.out.print(subNumbers[i]);
		}
		System.out.println("]");
		
		// 3. AB형이 아닌 혈액형만 출력하세요.
				String[] bloodTypes = new String[] {"A", "B", "AB", "O"};
				printPureBloodType(bloodTypes);
				

		// 4. 배열의 길이와 첫번째 숫자를 입력받아
		//    1씩 증가하는 숫자로 채워진 배열을 반환하세요.
		int arrayLength = 10;
		int firstNumber = 7;
		int[] numberArray = createArray(arrayLength, firstNumber);
		
		System.out.print("[");
		for(int i=0;i<arrayLength;i++) {
			
			if(i>0) {
				System.out.print(", ");
			}
			System.out.print(numberArray[i]);
		}
		System.out.print("]");
	}
	
	static int[] getSubArray(int[] numbers, int startIndex, int length) {

		int[] subArray = new int[length];
		
		for ( int i = 0 ; i < length ; i++) {
			int index = startIndex + i;
			
			if(index >= numbers.length) {
				break;
			}
			
			subArray[i] = numbers[startIndex + i];
		}
		return subArray;		
	}

	static String[] getMonthNames(int startMonth) {
		
		String[] monthNames = new String[12 - startMonth + 1];
		
		for ( int m = startMonth, i=0; m <= 12 ;m++, i++) {
			monthNames[i] = m + "월";
		}
		
		return monthNames;
	}
	
	static void printPureBloodType(String[] bloodTypes) {

		System.out.print("[");
		for( int i = 0 ; i < bloodTypes.length ; i++) {
			
			if (!"AB".equals(bloodTypes[i])) {
				if(i>0){
					System.out.print(", ");
				}

				System.out.print(bloodTypes[i]);
			}
					
		}
		System.out.println("]");
		
	}

	static int[] createArray(int arrayLength, int firstNumber) {
		
		int[] array = new int[arrayLength];
		
		for(int i=0 ;i<arrayLength;i++,firstNumber++) {

			array[i] = firstNumber;
			
		}
		return array;
		
	}
	
}