package kr.dventt;

public class Person {
    //�̸�(���ڿ�),����(�Լ�)
	public String name; //���(��ü) ����
	public int age;
	
	//�������� -> ���������� �켱������ ���� ����.
	public Person(String name) {
		this.name = name;
		age = 1;
	}
	public Person() {
		name = "�̸�����";
		age = 1;
	}
	
	
	
	public Person(String name, int age) {
		//a = "��ȣ��"
		this.name = name;
		this.age = age;
	}
	
	//������
    //public Person() {}
	//public - ��ü����
	//private -  ���ο����� ����
	//(default) - ������Ű�� �������� ����
	//protected - ��� ���迡���� ����
	
	//�޼ҵ�  , �Լ� method(�޼���) , function(�Լ�)
	//��ȯŸ�� �޼��� ��(�ŰԺ���) {}
	// ù���� �ҹ��� ���� �̾����� �ܾ� �빮�� ����
	//getter  = ���ο� private ���� �� ������ �ܺο��� �޼��带 ���� �������� ����
	public String  gerName() {
		return name;
	}
	//setter - ���ο��� private ���� �� ������ �ܺο��� �޼��带 �뷡 �����ϴ� ����
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		if(age >= 15) this.age = age;
	}
	
	public void printInfo() {
		System.out.println("�̸� :"+name+"���� :" +age);
	}
	
	//���̸� �ѻ� ������Ű�� �޼���
	public void addAge() {
		age++; //age + 1
	}
	
}
