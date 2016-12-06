package exercise;

public class ForExercise {
	
	public static void main(String[] args) {
		
		// 1. 1부터 10까지의 합을 구하는 함수를 작성하세요.
		System.out.println(getSumOneToTen());
		
		// 2. 두개의 정수를 입력받아
		//    첫번째 수 부터 두번째 수까지의 합을
		//    구하는 함수를 작성하세요.
		int from = 1, to = 10;
		System.out.println(getSum(from, to));
		
		// 3. 두개의 정수를 입력받아
		//    첫번째 수 부터 두번째 수까지 중 짝수의 합을
		//    구하는 함수를 작성하세요.
		System.out.println(getSumOnlyEven(from, to));
		
		// 4. 두개의 정수를 입력받아
		//    두수의 합이 홀수이면
		//    첫번째 수 부터 두번째 수까지의 합을 구하고
		//    두수의 합이 짝수이면
		//    두번째 수를 반환하는 함수를 작성하세요.
		System.out.println(getSumComplex(from, to));
	}

	static int getSumOneToTen() {
		
		int sum = 0;
		
		for(int i = 1 ; i <=10 ; i++) {
			
			sum += i;
			
		}
		
		return sum;
		
	}

	static int getSum(int from, int to) {
		int sum = 0;
		
		for(int i = from ; i <= to ; i++ ) {
			sum += i;
		}
		
		return sum;
		
	}

	static int getSumOnlyEven(int from, int to) {
		
		int sum = 0;
		
		for(int i = from ; i <= to; i++) {
			
			if(i % 2 ==0){
				sum += i;	
			}			
			
		}
		
		return sum;
		
	}

	static int getSumComplex(int from, int to) {
		if( (from + to) % 2 != 0) {
			return getSum(from, to);			
		}
		else {
			return to;
		}
	}
}
