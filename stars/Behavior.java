package stars;

//�߻�Ŭ������ ����
//�߻� �ż��常 ���� ����
//���� ���ε��� ��ηθ� ����
//abstract�� public�� �����ص� ��. �����Ϸ��� �˾Ƽ� �ٿ���.
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

