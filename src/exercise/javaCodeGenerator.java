package exercise;

public class javaCodeGenerator {
	public static void main(String[] args) {
		
		/*
		 * 다음과 같이 소스코드를 생성하여 출력하시오.
		 * 
		 * public class JavaCodeGenerator {
		 * 
		 * 		public static void main(String[] args) {
		 * 			System.out.println("Hello, Java");
		 *		}
		 *
		 * }
		 */
		System.out.println(generateSourceCode("Hello, Java",new String[] {"print","getNumber"}));
		
		String template = "//[var]를 출력하는 코드입니다. \nSystem.out.println([var]);";
		
		/*
		 * 다음과 같이 출력하시오.
		 * 
		 * System.out.println("Hello, World");
		 * System.out.println(42.43);

		 */
		System.out.println();
		System.out.println(generatePrintln(template, "Hello, World"));
		System.out.println(generatePrintln(template, "42.43"));
		System.out.println(generatePrintln(template, "4번째"));

	}
	
	static String generateSourceCode(String code, String[] functions) {
		String result = "public class JavaCodeGenerator {\n\n";
		result += " \tpublic static void main (String[] args) {\n";
		result += "\t\tSystem.out.println(\"" + code + "\");";
		result += "\n\t}\n\n";
		
		for(int i=0 ; i<functions.length ; i++){
		result += "\tstatic void " + functions[i] + "() {\n\n\t}\n\n"; 
		}
		
		result += "}";
		
		return result;
	}
	
	static String generatePrintln(String template, String str) {
		String replaceStr = ""; 
		if(NumberUtils.isNumber(str)) {
			replaceStr = str;
		}
		else {
			replaceStr = "\"" + str + "\"";
		}
		return StringUtils.replace(template, "[var]", replaceStr);
	}

}
