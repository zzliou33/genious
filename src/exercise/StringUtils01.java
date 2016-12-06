package exercise;

/**
 * @author 정동건
 *
 */
public class StringUtils01 {
	/*
	 * 함수명 : trim
	 * 매개변수 : String str
	 * 리턴타입 : String
	 * 설명 : 입력받은 문자열의 앞뒤 공백을 제거하고 반환합니다.
	 * 예1 : trim("   abc   ") -> "abc"
	 * 예2 : trim("a b ") -> -> "a b"
	 * 예3 : trim(null) -> null
	 */
	static String trim(final String str) {
				
		return rightTrim(leftTrim(str));
	}
	static String leftTrim(final String str) {
		if(str==null) {
			return null;
		}
		char[] chars = str.toCharArray();
		int frontIndex = 0;
		String result = "";
		
		for(int i=0 ; i<chars.length && (StringUtils.isWhitespace(chars[i])); i++) {
			frontIndex++;					
		}
		for(int i=frontIndex ; i<chars.length ; i++) {
			result += chars[i];
		}
		return result;
	
	}	
	static String rightTrim(final String str) {
		if(str==null) {
			return null;
		}
		char[] chars = str.toCharArray();
		int endIndex = chars.length-1;
		String result = "";
		
		
		for(int i=chars.length-1 ; i>0 &&(StringUtils.isWhitespace(chars[i])) ; i--) {
			endIndex--;			
		}		
		for(int i=0 ; i<=endIndex ; i++) {
			result += chars[i];
		}
		return result;
	}	
	static String removeWhitespace(final String str) {
		if(str==null) {
			return null;
		}
		
		char[] chars = str.toCharArray();
		String result="";
		
		for(int i=0 ; i<chars.length ; i++) {
			if(StringUtils.isWhitespace(chars[i])) {
				continue;
			}
			
			result += chars[i];
		}
		
		return result;
	}
	
	/*
	 * 함수 : leftPad
	 * 매개변수1 : String str
	 * 매개변수2 : int size
	 * 매개변수3 : char ch
	 * 리턴타입 : String
	 * 설명 : 문자열의 길이가 입력받은 사이즈보다 작으면 왼쪽에 입력받은 문자를
	 *        남은 사이즈만큼 더하여 반환합니다.
	 * 예1 : leftPad("11", 4, '0') -> "0011"
	 * 예2 : leftPad("abcd", 3, '_') -> "abcd"
	 */
	
	static String leftPad(String str, int size, char ch) {
		int strLength = str.length();
		
		if(str == null || str.length() >= size) {
			return str;
		}
		return repeat(size-strLength,ch) + str;
	}	
	/*
	 * 함수 : rightPad
	 * 매개변수1 : String str
	 * 매개변수2 : int size
	 * 매개변수3 : char ch
	 * 리턴타입 : String
	 * 설명 : 문자열의 길이가 입력받은 사이즈보다 작으면 오른쪽에 입력받은 문자를
	 *        남은 사이즈만큼 더하여 반환합니다.
	 * 예1 : rightPad("11", 4, '0') -> "1100"
	 * 예2 : rightPad("abcd", 3, '_') -> "abcd"
	 */
	static String rightPad(String str, int size, char ch) {
		int strLength = str.length();
		
		if(str == null || str.length() >= size) {
			return str;
		}
		return str + repeat(size-strLength,ch);
	}
	
	/**
	 * 길이와 문자를 입력받아 해당 문자를 사이즈만큼 반복한 문자열을 반환합니다.
	 * 
	 * @param size 반복할 길이
	 * @param ch 반복할 문자
	 * @return 문자를 sizr만큼 반복한 문자열
	 */
	static String repeat(int size, char ch) {
		String result = "";
		
		for(int i=0 ; i<size ; i++) {
			result += ch;
		}		
		return result;
	}
	
	
	
	
	
}
