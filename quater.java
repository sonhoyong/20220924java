package kr.dv.pratic;

public class quater {
	//x �غ�
	//y ���� 
     private int x,y;
     
     //������
     //public Person() {} <-- �ٸ� �����ڻ� �����Ǹ� ������.
     //���������� ��ü�̸�(�ŰԺ���) {}
     public quater(int x,  int y) {
    	 this.x = x;
    	 this.y = y;
     }
     
     //�ﰢ���� ���̸� ����ϴ� �Լ�(�޼���)
     public void printArea() {
    	 System.out.println("�簢����  ���̴� : "+ (x * y));
     }
}
