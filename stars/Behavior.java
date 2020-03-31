package stars;

//추상클래스와 유사
//추상 매서드만 존재 가능
//동적 바인딩의 통로로만 쓰임
//abstract와 public을 생략해도 됨. 컴파일러가 알아서 붙여줌.
public interface Behavior {
	public abstract void move();
	void repair();
	void attack(Behavior unit);
	int getattack();
	void setattack(int attack);
	int gethp();
	void sethp(int hp);
	String getName();

}

