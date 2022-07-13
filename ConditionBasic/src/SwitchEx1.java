import java.util.Scanner;

public class SwitchEx1 {
	public static void main(String[] args) {
		
//		switch(조건식) {								삼항연산자가 제일 빠르고 그 다음 스위치, 그 뒤에 이프문 순으로 빠르다. 강력한 것은 이프
//		case 값1:									내가 짜진 않아도 남 코드를 볼 줄은 알아야 됨		
//			조건식의 결과가 값 1과 같을 경우 수행될 문장들
//		break;
//		case 값2:
//			조건식의 결과가 값 2와 같을 경우 수행될 문장들
//		break;
//		.
//		.
//		.
//		default:
//			조건식의 결과와 일치하는 case문이 없을 때 수행될 문장들
//			
//		}
//		
//		switch문의 제약조건
//		조건식의 결과값이 반드시 정수여야 한다
//		조건식 결과는 정수 또는 문자열
//		case문은 값은 정수와 상수만 가능, 중복되면 안 된다
		

		
		int rndNum = 0;
		
		rndNum = (int)(Math.random() * 10);			
		
		rndNum = rndNum * 100;
		
		System.out.print("당신의 번호는 " + rndNum + "번입니다. ");
		

		
		switch (rndNum) {
			case 100:
				System.out.println("상품은 자전거입니다.");
				break;
			case 200:
				System.out.println("상품은 TV입니다.");
				break;
			case 300:
				System.out.println("상품은 노트북입니다.");
				break;
			case 400:
				System.out.println("상품은 자동차입니다.");
				break;
			case 500:
				System.out.println("상품은 컴퓨터입니다.");
				break;
				
			default:
				System.out.println("꽝! 다음 기회를 기대해주세요.");
				break;		
		}
		System.out.println("프로그램을 종료합니다.");
	}
}