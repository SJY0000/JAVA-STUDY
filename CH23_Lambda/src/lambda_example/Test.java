package lambda_example;
// 람다식을 쓸려면 functional interface가 있어야함
@FunctionalInterface
public interface Test {
	void run(); // 추상메소드 run을 생성 -> 함수형 인터페이스 조건 만족
//	void run2(); // 함수형 인터페이스는 하나의 추상메소드만 가진 인터페이스이다.
}
