
public class RandomNumberEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		무작위 숫자를 구하는 방법
		
		int rndNum = 0;
		
		rndNum = (int)(Math.random() * 10);			//난수 생성 메서드, 0.0 <= Math.random() < 1.0 범위에서 나옴
													//0부터 9까지의 숫자 하나 줘라
		System.out.println(rndNum);
	}

}
