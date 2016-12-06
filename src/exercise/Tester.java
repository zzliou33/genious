package exercise;

public class Tester {
	public static void main(String[] args) {
		
		long time = System.nanoTime();
		System.out.println("[" + "    a b c    " + "]");
		System.out.println("[" + StringUtils01.trim("    a b c    ") + "]");
		System.out.println("[" + StringUtils01.leftTrim("    a b c    ") + "]");
		System.out.println("[" + StringUtils01.rightTrim("    a b c    ") + "]");
		System.out.println("[" + StringUtils01.removeWhitespace("    a b c    ") + "]");
		
		
		System.out.println();
		time = System.nanoTime(); 
		System.out.println(StringUtils01.rightPad("11", 4, '0'));
		System.out.println(StringUtils01.leftPad("11", 4, '0'));
		System.out.println((System.nanoTime() - time) + "ns");

		System.out.println();
		System.out.println("result : " + StringUtils02.substring("hello", 1, 4));
		System.out.println("result : " + StringUtils02.substring("hello", 1, 10));
		System.out.println("result : " + StringUtils02.substring("hello", 5, 9));
		System.out.println("result : " + StringUtils02.substring("hello", -1, 4));
		System.out.println();
		System.out.println("result : " + StringUtils02.substring("hello", 1));
		System.out.println("result : " + StringUtils02.substring("hello", 3));
		System.out.println("result : " + StringUtils02.substring("hello", 5));
		System.out.println("result : " + StringUtils02.substring(null, -1));
		
		System.out.println();
		System.out.println("result :" + StringUtils02.substringAfter("hello world", "hello"));
		System.out.println("result :" + StringUtils02.substringAfter("banana", "ba"));
		System.out.println("result :" + StringUtils02.substringAfter("banana", "B"));
		System.out.println("result :" + StringUtils02.substringAfter("banana", null));
		System.out.println("result :" + StringUtils02.substringAfter(null,"b"));
		
		System.out.println();
		System.out.println("result :" + StringUtils02.substringBefore("hello world", "world"));
		System.out.println("result :" + StringUtils02.substringBefore("banana", "na"));
		System.out.println("result :" + StringUtils02.substringBefore("banana", "B"));
		System.out.println("result :" + StringUtils02.substringBefore("banana", null));
		System.out.println("result :" + StringUtils02.substringBefore(null,"b"));
		
		System.out.println();
		System.out.println(StringUtils02.substringBetween("<div>hello</div>", "<div>", "</div>"));
		System.out.println(StringUtils02.substringBetween("char ch = 'z';", "'"));
		System.out.println(StringUtils02.substringBetween("char ch = 'z';", null));
		
		System.out.println();
		
	
		printArray(StringUtils02.split("이상윤||조영욱|||", "||"));
		System.out.println("----------------");
		printArray(StringUtils02.splitNotBlankAndTrim("hello, world", ","));
		System.out.println("----------------");
		System.out.println((System.nanoTime() - time) + "ns");		
	}
	
	static void printArray(String[] array) {
		for (int i=0;i<array.length;i++) {
			System.out.println(array[i]);
			
		}
	}
}
