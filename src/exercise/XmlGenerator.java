package exercise;

import java.util.Arrays;

public class XmlGenerator {
	public static void main(String[] args) {
		final String students = "정동건, 문재승, 한지훈"
				+ ", 백수현,조영욱,이상윤"
				+ ", 백미리,박재홍,김지룡"
				+ " ,노상민, 김한슬,채성주";
		
		/*
		 * 다음과 같이 XML을 출력하세요.
		 * 
		 * <students>
		 * 	 <student no="1">김지룡</student>
		 * 	 <student no="2">김한슬</student>
		 *   ...
		 *   <student no="12">한지훈</student>
		 * </students> 
		 */
		System.out.println(generateXml(students));
	}
	static String generateXml(String students) {
		String xml = "<student>\n";
		
		if(!StringUtils.isBlank(students)) {
			String[] studentsArray = StringUtils02.splitNotBlankAndTrim(students, ",");
			Arrays.sort(studentsArray);
			
			int size = String.valueOf(studentsArray.length).length();
			
			for(int i=0 ; i<studentsArray.length ; i++) {
				xml += "\t" + "<student no=\"" + StringUtils01.leftPad((i+1)+"",size,'0')
				+ "\">" + studentsArray[i] + "</student>\n";							
			}
		}
		xml += "</student>";
		
		return xml;
	}
}
