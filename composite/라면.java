package composite;

public class ��� {

	String item1;
	String item2;
	String item3;

	public ���() {
		this("��", "�Ǵ��⽺��", "�и�����");
	}
	
	public ���(String item1) {
		this(item1, "�Ǵ��⽺��", "�и�����");
	}
	
	public ���(String item1, String item2) {
		this(item1,null,item2);
	}
	
	public ���(String item1, String item2, String item3) {
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
	}
	
	public static void main(String[] args) {
		��� r1=new ���("��", "�Ǵ��⽺��", "�и�����");
		��� r2=new ���();
		��� r3=new ���("�ҶṰ", "�Ǵ��⽺��", "�и�����");
		��� r4=new ���("�ҶṰ", "�Ǵ��⽺��", "�и�����");
		��� r5=new ���("�ҶṰ", "�Ǵ��⽺��", "�и�����");
		��� r6=new ���();
		��� r7=new ���("�ҶṰ", "�Ǵ��⽺��", "�и�����");
		��� r8=new ���("�ҶṰ");



	}
}
