package Application;

public class PreAndPost {
	public static void main(String[] args) {
		// 증감연산자 ++ -- 위치가 다른 경우
		// 뒤에 있을 경우 먼저 사용한 다음 증감
		// 앞에 있을 경우 먼저 증감하고 사용
		int x = 5;
		System.out.println(x++);
		System.out.println(x);
		
		int y = 3;
		System.out.println(++y);
		System.out.println(y);
		
		int z = 10;
		
		int sum = x + z++;
		System.out.println("z의 값은 " + z);
		System.out.println(sum);
		
		int apples = 5;
		int bananas = 4;
		
		int fruits = ++apples + bananas++;
		System.out.println(fruits);
		System.out.println(bananas);
	}
}
