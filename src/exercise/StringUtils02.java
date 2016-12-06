package exercise;

public class StringUtils02 {

	private static String[] resultStrings;

	/**
	 * 주어진 문자열에서 시작인덱스(포함)와 끝인덱스(비포함) 사이의 문자열을 반환합니다.
	 * 
	 * 예1 : substring("hello", 1, 4) -> "ell"
	 * 예2 : substring("hello", 1, 10) -> "ello"
	 * 예3 : substring("hello", 5 ,9) -> ""
	 * 예4 : substring("hello", -1, 4) -> null
	 * 
	 * @param str
	 * @param beginIndex
	 * @param endindex
	 * @return
	 */
	static String substring(String str, int beginIndex, int endIndex) {
		if(str==null || beginIndex<0 || endIndex<0) {
			return null;
		}
		if(beginIndex >= str.length() || beginIndex >= endIndex) {
			return "";
		}
		
		endIndex = endIndex > str.length() ? str.length() : endIndex;
		
		char[] chars = str.toCharArray();
		String result = "";		

		for(int i=beginIndex ; i<endIndex ; i++) {
			result += chars[i];
		}
		
		return result;
	}
	/**
	 * 주어진 문자열에서 시작인덱스부터의 문자열을 반환합니다.
	 * 
	 * 예1 : substring("hello", 1) -> "ello"
	 * 예2 : substring("hello", 3) -> "lo"
	 * 예3 : substring("hello", 5) -> ""
	 * 예4 : substring("hello", -1) -> null  
	 * 
	 * @param str
	 * @param beginIndex
	 * @return
	 */
	static String substring(String str, int beginIndex) {
		if(str==null){
			return null;
		}		
		return substring(str, beginIndex,str.length());
	}
	/**
	 * 입력받은 문자열에서 구분자로 받은 문자열 뒤의 문자열을 반환합니다.
	 * 
	 * 예1: substringAfter("hello world", "hello") -> " world"
	 * 예2: substringAfter("banana", "ba") -> "nana"
	 * 예3: substringAfter("banana", "B") -> ""
	 * 예4: substringAfter("banana", null) -> "" 
	 * @param str
	 * @param separator 구분자
	 * @return
	 */
	static String substringAfter(String str, String separator) {
		if(str==null) {
			return null;
		}		
		int index = StringUtils.indexOf(str, separator);
		
		if(index<0) {
			return "";
		}
		
		return substring(str, index+separator.length());
	}
	/**
	 * 입력받은 문자열에서 구분자로 받은 문자열 앞의 문자열을 반환합니다.
	 * 
	 * 예1: substringAfter("hello world", "world") -> " hello "
	 * 예2: substringAfter("banana", "na") -> "ba"
	 * 예3: substringAfter("banana", "B") -> ""
	 * 예4: substringAfter("banana", null) -> "" 
	 * @param str
	 * @param separator 구분자
	 * @return
	 */
	static String substringBefore(String str, String separator) {
		if(str==null) {
			return null;
		}		
		int index = StringUtils.indexOf(str, separator);
		
		if(index<0) {
			return "";
		}
		
		return substring(str,0,index);
	}
	/**
	 * 입력받은 문자열에서 구분자로 받은 각 문자열 사이의 문자열을 반환합니다.
	 * 
	 * 예1: substringBetween("<div>hello</div>", "<div>", "</div>") -> "hello"
	 * 예2: substringBetween("<div>hello</div>", null, "</div>") -> null
	 * 예3: substringBetween("<div>hello</div>", "<div>", null) -> null
	 * 예4: substringBetween("chars[304]", "[", "]") -> "304"
	 * @param str
	 * @param open
	 * @param close
	 * @return
	 */
	static String substringBetween(String str, String open, String close) {
		if(str==null || open ==null || close==null) {
			return null;
		}		
		return substringBefore(substringAfter(str,open),close);
	}
	/**
	 * 입력받은 문자열에서 구분자로 받은 문자열로 둘러싸인 문자열을 반환합니다.
	 * 
	 * 예1: substringBetween("#hello#", "#") -> "hello"
	 * 예2: substringBetween("char ch = 'z';", "'") -> "z"
	 * 예3: substringBetween("char ch = 'z';", null) -> null
	 * @param str
	 * @param tag
	 * @return
	 */
	static String substringBetween(String str, String tag) {
		
		return substringBetween(str,tag,tag);
	}
	/**
	 * 설명 : 입력받은 문자열을 구분자를 기준으로 분리한 문자열의 배열을 반환합니다.
	 * 
	 * 예1: split("hello, world",',') ->["hello", " world"]
	 * 예2: split("5,4,3,2,1",',') ->["5", "4", "3", "2", "1"]
	 * 예3: split("이상윤|조영욱", '|') -> ["이상윤", "조영욱"]
	 * 
	 * @param str
	 * @param separator
	 * @return
	 */
	static String[] split(String str, char separator) {
		if(str==null) {
			return null;
		}
		
		if(!StringChecker.hasChar(str, separator)) {
			return new String[] {str};
		}
		
		int index=StringChecker.countChar(str, separator);
		

		String[] resultString = new String [index+1];
		char[] chars = str.toCharArray();
		int n=0;
		resultString[n]="";
		
		for(int i=0 ; i<chars.length ; i++) {
			if(chars[i] == separator) {
				resultString[++n] = "";
				continue;
			}
			resultString[n]+=chars[i];
		}

		return resultString;
	}
	/**
	 * 입력받은 문자열을 구분자를 기준으로 분리한 문자열의
	 * 배열을 반환합니다. 단, 빈문자열을 제외합니다.
	 * 
	 * 예1: split("hello, world", ',') -> ["hello", " world"]
	 * 예2: split("5,4,3,2,1", ',') -> ["5", "4", "3", "2", "1"]
	 * 예3: split("이상윤|조영욱|||", '|') -> ["이상윤", "조영욱"]
	 * 
	 * @param str
	 * @param separator 구분자
	 * @return
	 */
	static String[] splitNotEmpty(String str, char separator) {
		int count = 0;
		
		String[] split = split(str, separator);
		
		for (int i=0;i<split.length;i++) {
			if (!StringUtils.isEmpty(split[i])) {
				count++;
			}
		}
		
		String[] result = new String[count];
		
		for (int i=0, n=0;i<split.length;i++) {
			if (StringUtils.isEmpty(split[i])) {
				continue;
			}
			
			result[n++] = split[i];
		}		
		
		return result;
	}
	/**
	 * 입력받은 문자열을 구분자를 기준으로 분리한 문자열의
	 * 배열을 반환합니다. 단, 공백으로만 이루어진 문자열을 제외합니다.
	 * 
	 * 예1: splitNotBlank("hello, world", ',') -> ["hello", " world"]
	 * 예2: splitNotBlank("5,4,3,2,1", ',') -> ["5", "4", "3", "2", "1"]
	 * 예3: splitNotBlank("이상윤|조영욱|  | |", '|') -> ["이상윤", "조영욱"]
	 * 
	 * @param str
	 * @param separator
	 * @return
	 */
	static String[] splitNotBlank(String str, char separator) {
		int count = 0;
		
		String[] split = split(str, separator);
		
		for (int i=0;i<split.length;i++) {
			if (!StringUtils.isBlank(split[i])) {
				count++;
			}
		}
		
		String[] result = new String[count];
		
		for (int i=0, n=0;i<split.length;i++) {
			if (StringUtils.isBlank(split[i])) {
				continue;
			}
			
			result[n++] = split[i];
		}		
		
		return result;
	}

	/**
	 * 설명 : 입력받은 문자열을 구분자를 기준으로 분리한 문자열의 배열을 반환합니다.
	 * 
	 * 예1: split("hello, world",",") ->["hello", " world"]
	 * 예2: split("5,4,3,2,1",",") ->["5", "4", "3", "2", "1"]
	 * 예3: split("이상윤||조영욱|||", "||") -> ["이상윤", "조영욱","|"]
	 * 
	 * @param str
	 * @param separator 구분자
	 * @return
	 */
	static String[] split(String str, String separator) {
		if(str==null) {
			return null;
		}
		if(!StringUtils.contains(str, separator)) {
			return new String[] {str};
		}
		int index = StringUtils.countMatches(str, separator);
		
		String[] result = new String [index+1];
		char[] chars = str.toCharArray();
		int n=0;
		result[n]="";

		for(int i=0 ; i<chars.length ; i++) {
			String candidate = "";
			
			for(int j=i ; j<chars.length && j<i+separator.length() ; j++) {
				candidate+=chars[j];
			}
			
			if(separator.equals(candidate)) {
				result[++n] = "";
				i+=separator.length()-1;
				continue;
			}
			
			result[n]+=chars[i];
		}
		return result;
	}
	/**
	 * 입력받은 문자열을 구분자를 기준으로 분리한 문자열의
	 * 배열을 반환합니다. 단, 빈문자열을 제외합니다.
	 * 
	 * 예1: splitNotEmpty("hello, world", ",") -> ["hello", " world"]
	 * 예2: splitNotEmpty("5,4,3,2,1", ",") -> ["5", "4", "3", "2", "1"]
	 * 예3: splitNotEmpty("이상윤|조영욱|| ||", "||") -> ["이상윤|조영욱", " "]
	 * 
	 * @param str
	 * @param separator 구분자
	 * @return
	 */
	static String[] splitNotEmpty(String str, String separator) {
		int count = 0;
		
		String[] split = split(str, separator);
		
		for (int i=0;i<split.length;i++) {
			if (!StringUtils.isEmpty(split[i])) {
				count++;
			}
		}
		
		String[] result = new String[count];
		
		for (int i=0, n=0;i<split.length;i++) {
			if (StringUtils.isEmpty(split[i])) {
				continue;
			}
			
			result[n++] = split[i];
		}		
		
		return result;
	}
	
	/**
	 * 입력받은 문자열을 구분자를 기준으로 분리한 문자열의
	 * 배열을 반환합니다. 단, 빈문자열을 제외합니다.
	 * 
	 * 예1: splitNotBlank("hello, world", ",") -> ["hello", " world"]
	 * 예2: splitNotBlank("5,4,3,2,1", ",") -> ["5", "4", "3", "2", "1"]
	 * 예3: splitNotBlank("이상윤|조영욱|| ||", "||") -> ["이상윤|조영욱"]
	 * 
	 * @param str
	 * @param separator 구분자
	 * @return
	 */
	static String[] splitNotBlank(String str, String separator) {
	int count = 0;
		
		String[] split = split(str, separator);
		
		for (int i=0;i<split.length;i++) {
			if (!StringUtils.isBlank(split[i])) {
				count++;
			}
		}
		
		String[] result = new String[count];
		
		for (int i=0, n=0;i<split.length;i++) {
			if (StringUtils.isBlank(split[i])) {
				continue;
			}
			
			result[n++] = split[i];
		}		
		
		return result;
	}
	
	/**
	 * 입력받은 문자열을 구분자를 기준으로 분리한 문자열의
	 * 배열 중 빈문자열을 제외하고, 빈문자열이 아닌 문자열의
	 * 앞뒤 공백도 제거한 문자열의 배열을 반환합니다.
	 * 
	 * 예1: splitNotBlankAndTrim("hello, world", ",") -> ["hello", "world"]
	 * 예2: splitNotBlankAndTrim("5,4,3,2,1", ",") -> ["5", "4", "3", "2", "1"]
	 * 예3: splitNotBlankAndTrim("이상윤|조영욱|| ||", "||") -> ["이상윤|조영욱"]
	 * 
	 * @param str
	 * @param separator
	 * @return
	 */
	static String[] splitNotBlankAndTrim(String str, String separator) {
		
		String[] result = new String[splitNotBlank(str,separator).length];
		
		for(int i=0 ; i<splitNotBlank(str,separator).length ; i++){
			result[i] = StringUtils01.trim(splitNotBlank(str,separator)[i]);
		}
		return result;
	}
	
	
}