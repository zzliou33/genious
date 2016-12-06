package exercise;

public class StringUtils {

	public static void main(String[] args) {
		// reverse 함수를 사용하여 다음 문자열을 뒤집어 출력하세요.
		String fruit = "banana";
		System.out.println(reverse(fruit));
		System.out.println();
		System.out.println(isEmpty(""));
		System.out.println(isEmpty(null));
		System.out.println(isEmpty(fruit));
		System.out.println();
		System.out.println(isBlank(""));
		System.out.println(isBlank("               "));
		System.out.println(isBlank(null));
		System.out.println(isBlank(" ab   "));
		System.out.println();
		System.out.println(isDigit('2'));
		System.out.println(isDigit('a'));
		System.out.println();
		System.out.println(isAlphabet('a'));
		System.out.println(isAlphabet('X'));
		System.out.println(isAlphabet((char) 50));
		
		System.out.println();
		System.out.println(isAlphaOrDigit("hello"));
		System.out.println(isAlphaOrDigit("1234"));
		System.out.println(isAlphaOrDigit("1st"));
		System.out.println( isAlphaOrDigit("Fighting!"));
		
		System.out.println();
		System.out.println(removeChar("hello",'l'));
		System.out.println(removeChar("java", 'a'));
		System.out.println(removeChar(null, '3'));
		System.out.println();
		System.out.println(removeStr("hanbit", "hans"));
		System.out.println(removeStr("hello","ll"));
		System.out.println( removeStr("java", "av"));
		System.out.println(removeStr(null, "334"));
		System.out.println(removeStr("banana", "na") );
		System.out.println(removeStr("hello",null));
		
		System.out.println();
		System.out.println(compare("aabcd","ABC"));
		System.out.println(compare("aabcd","ABC",false));
		System.out.println();
		System.out.println(switchCase('z'));
		System.out.println(switchCase('A'));
		
		System.out.println();
		System.out.println(toLowerCase('A'));
		System.out.println(toLowerCase('Z'));
		System.out.println(toLowerCase('f'));
		System.out.println(toLowerCase('ㄱ'));
		System.out.println(toLowerCase('!'));
		System.out.println();
		System.out.println(toUpperCase('a'));
		System.out.println(toUpperCase('z'));
		System.out.println(toUpperCase('ㄱ'));
		System.out.println(toUpperCase('!'));
		
		System.out.println();
		System.out.println(toLowerCase("ABC"));
		System.out.println(toLowerCase("Java"));
		System.out.println(toLowerCase(null));
		
		System.out.println();
		System.out.println(toUpperCase("hello"));
		System.out.println(toUpperCase("Java"));
		System.out.println(toUpperCase(null));
		
		System.out.println();
		System.out.println(contains("banana", "an"));
		System.out.println(contains("apple", "led"));
		System.out.println(contains("apple", "pa"));
		System.out.println(contains("hanbit", "NM") );
		System.out.println(contains(null , null));
		
		System.out.println();
		System.out.println(countMatches("banana", "a"));
		System.out.println(countMatches("apple", "led"));
		System.out.println(countMatches("apple", "ap"));
		System.out.println(countMatches("hanbit", "NM") );
		System.out.println(countMatches(null , null));
		
		System.out.println();
		System.out.println(indexOf("banana", "an"));
		System.out.println(indexOf("apple", "led"));
		System.out.println(indexOf("apple", "ple"));
		System.out.println(indexOf("hanbit", "NM") );
		System.out.println(indexOf(null , null));
		
		System.out.println();
		System.out.println(replace("banana", "an", "o"));
		System.out.println(replace("apple", "le", "lication"));
		System.out.println(replace("apple", "ple", "proach"));
		System.out.println(replace("hanbit", "NB",""));
		System.out.println(replace(null, null,null));
		
		System.out.println();
		System.out.println(replace("banana", "an", "o", 1));
		System.out.println(replace("apple", "le", "lication", 0));
		System.out.println(replace("apple", "ple", "proach", 5));
		System.out.println(replace("hanbit", "NB","nba", -1));
		System.out.println(replace(null, null,null, -1));
		
		System.out.println();
		System.out.println(equals("abcd","abcd"));
		System.out.println(equals("abc","abcd"));
		System.out.println(equals(null, "avv"));
		System.out.println(equals("abcdf","abc"));
		System.out.println(equals("abcd","abcf"));
		System.out.println(equals("정동건",null));
		
		
	}
	
	/*
	 * 함수명: reverse
	 * 매개변수: String str
	 * 리턴타입: String
	 * 설명: 입력받은 문자열을 뒤집어 반환합니다.
	 *       단, 문자열이 null 이면 null을 반환합니다.
	 * 예1: reverse("hello") -> "olleh"
	 * 예2: reverse(null) -> null
	 * 예3: reverse("") -> ""
	 */
	static String reverse(String str) {
		char[] chars = str.toCharArray();
		String reverseStr = "";
		
		System.out.println(reverseStr);
		if(chars == null) {
			return null;
		}
		int start = chars.length-1;
		for (int i=start ; i>=0  ; i--) {
			reverseStr += chars[i];
		}
		
		
		return reverseStr;
	}
	/*
	 * 함수명 : isEmpty
	 * 매개변수 : String str
	 * 리턴타입 : boolean
	 * 설명 : 입력받은 문자열이 ""이거나 null이면 true, 아니면 false반환합니다.
	 */
	static boolean isEmpty(String str) {
		if(str == null || "".equals(str)) {
			return true;
		}
		else {
			return false;
		}
	}
	/*
	 * 함수명 : isBlank
	 * 매개변수 : String str
	 * 리턴타입 : boolean
	 * 설명 : 입력받은 문자열이 null이거나 공백이면 true,
	 *        아니면 false를 반환합니다.
	 * 예1 : isBlank("") -> true
	 * 예2 : isBlank("   ") -> true
	 * 예3 : isBlank("   aab  ") -> false
	 */
	static boolean isBlank(String str) {
		if(str == null) {
			return true;
		}
		
		char[] chars = str.toCharArray();
		
		for(int i=0 ; i<chars.length ; i++) {
			if(!isWhitespace(chars[i])) {
				/*chars[i] != ' '&& chars[i] != '\t' && chars[i] != '\r' && chars[i] != '\n'*/
				return false;
			}
		}
		
		return true;
	}
	/*
	 * 함수명 : isWhitespace
	 * 매개변수 : char ch
	 * 리턴타입 : boolean
	 * 설명 : 입력받은 문자가 공백이면 true, 아니면 false를 반환합니다.
	 */
	static boolean isWhitespace(char ch) {

		return ch==32 || ch==9 || ch==13 || ch==10;
	}
	/*
	 * 함수명 : isDigit
	 * 매개변수 : char ch
	 * 리턴타입 : boolean
	 * 설명 : 입력받은 문자가 0-9이면 true, 아니면 false를 반환합니다.
	 */
	static boolean isDigit(char ch) {
		
	/*	for(int i=48 ; i<58 ; i++) {
			if(ch == i) {
				return true;
			}
		}		
		return false;
	*/
		return ch>=48 && ch<=57;
	}
	/*
	 * 함수명 : isAlphabet
	 * 매개변수 : char ch
	 * 리턴타입 : boolean
	 * 설명 : 입력받은 문자가 a-z 또는 A-Z이면 true, 아니면 false를 반환합니다.
	 */
	static boolean isAlphabet(char ch) {
		
	/*	for(int i=65 ; i<91 ; i++) {
			if(ch == i) {
				return true;
			}
		for(int i1=97 ; i1<123 ; i1++) {
			if(ch == i1) {
				return true;
				}
			}			
		}	
		return false;
		*/
		return (ch>=65 && ch<=90) || (ch>=97 && ch<122);
	}
	/*
	 * 함수명 : isAlphaOrDigit
	 * 매개변수 : String str
	 * 리턴타입 : boolean
	 * 설명 : 입력받은 문자열이 알파벳 또는 숫자로 구성되어있으면 true,
	 *        아니면 false를 반환합니다.
	 * 예1 : isAlphaOrDigit("hello") ->true
	 * 예2 : isAlphaOrDigit("1234") -> true
	 * 예3 : isAlphaOrDigit("1st") -> true
	 * 예4 : isAlphaOrDigit("Fighting!") -> false
	 */
	static boolean isAlphaOrDigit(String str) {
		char[] chars= str.toCharArray();
		
		for(int i=0 ; i<chars.length ; i++) {
			if( !isAlphabet(chars[i]) && !isDigit(chars[i])){
				return false;
			}
		}		
		return true;
	}
	/*
	 * 함수명: removeChar
	 * 매개변수1 : String str
	 * 매개변수2 : char ch
	 * 리턴타입 : String
	 * 설명 : 입력받은 문자열에서 주어진 문자를 삭제하고 반환합니다.
	 * 예1 : removeChar("hello",'l') -> "heo"
	 * 예2 : removeChar("java", 'a') -> "jv"
	 * 예3 : removeChar(null, '3') -> null
	 */
	static String removeChar(String str, char ch) {
		if(str == null) {
			return null;
		}
		char[] chars = str.toCharArray();
		String removeChars = "";
		
		for(int i=0 ; i<chars.length ; i++) {
			if(chars[i] != ch){
				removeChars += chars[i];
			}
		}		
		return removeChars;
	}
	/*
	 * 함수명: removeStr
	 * 매개변수1 : String str
	 * 매개변수2 : String rmStr
	 * 리턴타입 : String
	 * 설명 : 입력받은 문자열에서 주어진 문자를 삭제하고 반환합니다.
	 * 예1 : removeStr("hello","ll") -> "heo"
	 * 예2 : removeStr("java", "av") -> "ja"
	 * 예3 : removeStr(null, "334") -> null
	 * 예4 : removeStr("hanbit", "hans") -> "hanbit"
	 * 예5 : removeStr("banana", "na") -> "ba"
	 */
	static String removeStr(String str, String rmStr) {
		if (str == null) {
			return null;
		}
		if (rmStr == null || "".equals(rmStr) || str.length() < rmStr.length()) {
			return str;
		}		
		String result = "";
		
		char[] chars = str.toCharArray();
		char[] rmChars = rmStr.toCharArray();
		//* 예5: removeStr("banana", "na") -> "ba"
		for (int i=0;i<chars.length;i++) {
			boolean match = true;
			
			if (chars[i] != rmChars[0]) {
				match = false;
			}
			else if (chars.length - i < rmChars.length) {
				match = false;
			}
			else {
				for (int j=0;j<rmChars.length;j++) {
					if (rmChars[j] != chars[i+j]) {
						match = false;
						break;
					}
				}
			}			
			if (match) {
				i += rmChars.length - 1;
			}
			else {
				result += chars[i];
			}
		}		
		return result;
	}
	/*
	 * 함수명 : compare
	 * 매개변수1 : String left
	 * 매개변수2 : String right
	 * 리턴타입 : int
	 * 설명 : 두개의 문자열을 입력받아 왼쪽이 크면1, 오른쪽이 크면 -1, 같으면 0을 반환합니다.
	 * 
	 */
	static int compare(String left, String right, boolean ignoreCase) {
		if (left == null && right == null) {
			return 0;
		}
		else if (left != null && right == null) {
			return 1;
		}
		else if (left == null && right != null) {
			return -1;
		}
		
		if (ignoreCase) {
			left = toLowerCase(left);
			right = toLowerCase(right);
		}

		char[] leftChars = left.toCharArray();
		char[] rightChars = right.toCharArray();
		
		for (int i=0;i<leftChars.length;i++) {
			if (i >= rightChars.length) {
				return 1;
			}
			
			if (leftChars[i] != rightChars[i]) {
				return leftChars[i] - rightChars[i];
			}
		}
		
		return leftChars.length - rightChars.length;
	}
	static int compare(String left, String right) {
		return compare(left,right,false);
	}
	/*
	 * 함수명 : switchCase
	 * 매개변수 : char ch
	 * 리턴타입 : char
	 * 설명 : 소문자를 입력받으면 대문자로, 대문자를 입력받으면 소문자로 반환합니다.
	 * 예1 : swirchCase('a') -> A
	 * 예2 : swirchCase('D') -> d
	 */
	static char switchCase(char ch) {
		int gabOfCase = 'a'-'A';
		
		if(ch>='A' && ch<='Z') {
			return (char) (ch + gabOfCase);
		}
		else if(ch>='a' && ch<='z') {
			return (char) (ch - gabOfCase);			
		}		
		return ch;
	}
	/*
	 * 함수명 : toLowerCase
	 * 매개변수 : char ch
	 * 리턴타입 : char
	 * 설명 : 입력받은 영문 대문자를 소문자로 반환합니다.
	 *        단, 영문 대문자가 아니면 그대로 반환합니다.
	 */
	static char toLowerCase(char ch) {
		int gabOfCase = 'a' - 'A';
		if(ch>='A' && ch <='Z') {
			return (char) (ch + gabOfCase);
		}
		return ch;
	}
	/*
	 * 함수명 : toUpperCase
	 * 매개변수 : char ch
	 * 리턴타입 : char
	 * 설명 : 입력받은 영문 소문자를 대문자로 반환합니다.
	 *        단, 영문 소문자가 아니면 그대로 반환합니다.
	 */	
	static char toUpperCase(char ch) {
		int gabOfCase = 'a' - 'A';
		if(ch>='a' && ch <='z') {
			return (char) (ch - gabOfCase);
		}
		return ch;
	}
	/*
	 * 함수명 : toLowerCase
	 * 매개변수 : String str
	 * 리턴타입 : String
	 * 설명 : 입력받은 영문 대문자를 소문자로 반환합니다.
	 *        단, 영문 대문자가 아니면 그대로 반환합니다.
	 * 예1 : toLowerCase("ABC") -> "abc"
	 * 예2 : toLowerCase("Java") -> "java"
	 */	
	static String toLowerCase(String str) {
		if(str==null){
			return null;
		}
		char[] chars = str.toCharArray();
		String result = "";
		for(int i=0 ; i<chars.length ; i++){
			result+=toLowerCase(chars[i]);
		}
		return result;
	}
	/*
	 * 함수명 : toUpperCase
	 * 매개변수 : String str
	 * 리턴타입 : String
	 * 설명 : 입력받은 영문 소문자를 대문자로 반환합니다.
	 *        단, 영문 소문자가 아니면 그대로 반환합니다.
	 * 예1 : toUpperCase("hello") -> "HELLO"
	 * 예2 : toUpperCase("Java") -> "JAVA"
	 * 예3 : toUpperCase(null) -> null;
	 */	
	static String toUpperCase(String str) {
		if(str==null){
			return null;
		}
		char[] chars = str.toCharArray();
		String result = "";
		for(int i=0 ; i<chars.length ; i++){
			result+=toUpperCase(chars[i]);
		}
		return result;
	}
	/*
	 * 함수명 : contains
	 * 매개변수1 : String str
	 * 매개변수2 : String search
	 * 리턴타입 : boolean
	 * 설명 : 입력받은 문자열에 검색할 문자열이 있으면 true, 없으면 false를 반환합니다.
	 * 예1 : contains("banana", "an") -> true
	 * 예2 : contains("apple", "led") -> false
	 * 예3 : contains("apple", "pa") -> false
 	 * 예4 : contains("hanbit", "NM") -> false
	 * 예5 : contains(null , null) -> null
	 */
	static boolean contains(String str, String search) {
		if (str == null || search == null) {
			return false;
		}		
		char[] chars = str.toCharArray();
		char[] searchChars = search.toCharArray();

		for (int i=0;i<chars.length;i++) {
			boolean match = isMatch(chars, searchChars, i);			
			if (match) {
				return true;
			}			
		}		
		return false;
	}
	/*
	 * 함수명: countMatches
	 * 매개변수1: String str
	 * 매개변수2: String search
	 * 리턴타입: int
	 * 설명: 입력받은 문자열에 검색할 문자열이 몇번 포함되었는지 반환합니다.
	 * 예1: countMatches("banana", "an") -> 2
	 * 예2: countMatches("apple", "led") -> 0
	 * 예3: countMatches("apple", "ap") -> 1
	 * 예4: countMatches("hanbit", "NB") -> 0
	 * 예5: countMatches(null, null) -> 0
	 */
	static int countMatches(String str, String search) {
		if (str == null || search == null) {
			return 0;
		}
		
		char[] chars = str.toCharArray();
		char[] searchChars = search.toCharArray();
		int countMatches = 0;
		
		for (int i=0;i<chars.length;i++) {
			boolean match = isMatch(chars, searchChars, i);	
			if (match) {
				i += searchChars.length - 1;
				countMatches++;
			}			
		}		
		return countMatches;
	}	
	static boolean isMatch(char[] chars, char[] searchChars, int index) {
		boolean match = true;
		
		if (chars[index] != searchChars[0]) {
			match = false;
		}
		else if (chars.length - index < searchChars.length) {
			match = false;
		}
		else {
			for (int j=0;j<searchChars.length;j++) {
				if (searchChars[j] != chars[index+j]) {
					match = false;
					break;
				}
			}
		}
		return match;
	}
	/*
	 * 함수명: indexOf
	 * 매개변수1: String str
	 * 매개변수2: String search
	 * 리턴타입: int
	 * 설명: 입력받은 문자열에 검색할 문자열이 있으면 시작되는 위치를,
	 *       없으면 -1을 반환합니다.
	 * 예1: indexOf("banana", "an") -> 1
	 * 예2: indexOf("apple", "led") -> -1
	 * 예3: indexOf("apple", "ple") -> 2
	 * 예4: indexOf("hanbit", "NB") -> -1
	 * 예5: indexOf(null, null) -> -1
	 */
	static int indexOf(String str, String search) {
		if (str == null || search == null) {
			return -1;
		}		
		char[] chars = str.toCharArray();
		char[] searchChars = search.toCharArray();

		for (int i=0;i<chars.length;i++) {
			boolean match = isMatch(chars, searchChars, i);			
			if (match) {
				return i;
			}			
		}		
		return -1;
	}
	/*
	 * 함수명: replace
	 * 매개변수1: String str
	 * 매개변수2: String search
	 * 매개변수3: String replaceStr
	 * 리턴타입: String
	 * 설명: 입력받은 문자열에서 주어진 문자열을 찾아 대체 문자열로 교체하여 반환합니다.
	 * 예1: replace("banana", "an", "o") -> booa"
	 * 예2: replace("apple", "le", "lication") -> "application" 
	 * 예3: replace("apple", "ple", "proach") -> "approach" 
	 * 예4: replace("hanbit", "NB") -> "hanbit" 
	 * 예5: replace(null, null, ) -> null 
	 */
	static String replace (String str, String search, String replaceStr) {
		return replace (str, search,replaceStr, -1);
	}
	/*
	 * 함수명: replace
	 * 매개변수1: String str
	 * 매개변수2: String search
	 * 매개변수3: String replaceStr
	 * 매개변수4: int limit
	 * 리턴타입: String
	 * 설명: 입력받은 문자열에서 주어진 문자열을 찾아 대체 문자열로 교체하여 반환합니다.
	 *       단, 교체 제한 수 만큼만 교체합니다. 제한이 -1이면 제한을 두지않습니다.
	 * 예1: replace("banana", "an", "o", 1) -> "boana"
	 * 예2: replace("apple", "le", "lication", 0) -> "apple"
	 * 예3: replace("apple", "ple", "proach", 5) -> "approach"
	 * 예4: replace("hanbit", "NB", "nba", -1) -> "hanbit"
	 * 예5: replace(null, null, null, -1) -> null
	 */	
	static String replace (String str, String search, String replaceStr, int limit) {
		if (str == null) {
			return null;
		}

		if (search == null || "".equals(search) || str.length() < search.length()) {
			return str;
		}
		
		if(replaceStr == null) {
			replaceStr = "";
		}
		//예외사항은 꼭 처리해줘야함+_+
		//불필요한 로직은 쓸필요가 없다
		String result = "";
		
		char[] chars = str.toCharArray();
		char[] searchChars = search.toCharArray();
		
		for (int i=0;i<chars.length;i++) {
			boolean match = true;
			if(limit<0 || limit>0){
				 match = isMatch(chars, searchChars, i);	
			}
			else {
				match = false;
			}
			if (match) {
				i += searchChars.length - 1;
				result += replaceStr;
				limit--;
			}		
			else {
				result += chars[i];
			}
		}		
		return result;
	}	
	
	/*
	 * 함수명 : equals
	 * 매개변수1 : str1
	 * 매개변수2 : str2
	 * 리턴타입 : boolean
	 * 설명 : 두개의 문자열이 같으면 true, 다르면 false를 반환합니다.	
	 */
	
	static boolean equals(String str1, String str2) {
		if(str1 == null && str2 == null) {
			return true;
		}		
		if(str1 == null || str2 == null ) {
			return false;
		}
		if(str1.length() != str2.length()) {
			return false;
		}
		char[] chars1 = str1.toCharArray();
		char[] chars2 = str2.toCharArray();		
		
		for(int i=0 ; i<chars1.length ; i++) {		
			if(chars1[i] != chars2[i]) {
				return false;
			}		
		}
		return true;
	}	
}