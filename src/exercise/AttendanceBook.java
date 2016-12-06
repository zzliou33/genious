package exercise;

import java.util.Arrays;

public class AttendanceBook {
	public static void main(String[] args) {
		final String students = "정동건, 문재승, 한지훈"
			+ ", 백수현,조영욱,이상윤"
			+ ", 백미리,박재홍,김지룡"
			+ " ,노상민, 김한슬,채성주";

		/*
		 * 다음처럼 출력하시오.
		 * 
		 * 1. 정동건
		 * 2. 문재승
		 * 3. 한지훈
		 * ...
		 * 12. 채성주
		 */		
		System.out.println(createAttendaceBook(students));
		//다음 학생이 몇번인지 출력하세요.
		System.out.println(getNumber(students,"정동건"));
	}
	static int getNumber(String str, String keyName) {
		if(StringUtils.isBlank(str) || StringUtils.isBlank(keyName)) {
			return -1;
		}
		
		String[] studentsArray = StringUtils02.splitNotBlankAndTrim(str, ",");
		
		Arrays.sort(studentsArray);

		return Arrays.binarySearch(studentsArray, keyName)+1;		

	}
	static String createAttendaceBook(String str) {
		if( str==null) {
			return "";
		}
		
		String result = "";
		String[] studentsArray = StringUtils02.splitNotBlankAndTrim(str, ",");
		
		Arrays.sort(studentsArray);
		
		int size = String.valueOf(studentsArray.length).length() + 2;
		
		for(int i=0 ; i<studentsArray.length ; i++) {
			
			result += StringUtils01.leftPad((i+1) + ". ",size,'0') + studentsArray[i] + "\n";							
		}				
		return result;
	}
	
}
