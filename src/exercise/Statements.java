package exercise;

public class Statements {

		public static void main(String[] args) {
			
			int number = 4; //선언문(Declaration statement)
			number = 7; // 할당문 (Assignment statement)
			number = plus(4, 9); // 호출문(Invocation statement)
			
			// Control flow statements(제어흐름 문장들)
			// 조건문 (Conditional statements)
			/* 
			 if
			 -> if(조건(boolean)표현){~문장들~}
			 	else if(조건(boolean)표현){~문장들~}
			 	else {~완료~}
			 
			 cf) 조건 ? 참 : 거짓;
			 	ex)number > 99 ? 세자리 이상입니다. : 세자리 미만입니다.;
			 
			 조건 &&(and) 조건 ||(or) 조건 : and의 결과를 가지고 or 를 비교
			 switch
			 -> switch(값){
			 		case 비교값:
			 			break;
			 		case 비교값:
			 			break;
			 		case 비교값:
			 			break;
			 		default:
			 			break;
			 	
			 }
			 switch문은 case가 일치하는 부분부터 아래 다 실행+_+
			 굳이 필요한 상황은 해당월 이후의 모든 월을 출력하시오~+_+
			  
			 */
			String oddOrEven1 = number % 2 != 0 ? "홀수" : "짝수";
			System.out.println(oddOrEven1);
			
			String oddOrEven2 = null;
			
			if (number % 2 != 0){
				oddOrEven2 = "홀수";
			}
			else if(number % 2 ==0){
				oddOrEven2 = "짝수";
			}
			
			System.out.println(oddOrEven2);
			
			// 반복문 (Looping statements)
			
			
		}
		
		static int plus(int x, int y){
			return x + y;			
		}
	
}
