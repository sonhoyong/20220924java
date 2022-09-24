package kr.sonhoyongtest;

import kr.dv.pratic.Triangle;
import kr.dv.pratic.quater;
import kr.dventt.Person;

public class test3 {

	public static void main(String[] args) {
		
		/*
		int[] array1 = new int[3];
		int[][] array2 = new int[5][3];
        
		array1[0] = 0;
		array1[1] = 10;
		array1[2] = 20;
		
		array2[0][0] = 5;
		array2[0][1] = 10;
	//배열 
		//변수의 묶음 혹은 개체의 묶음
		int a =  5;//a <- 5값의 저장
		int b = 10;
		int c = 15;
		
		int[] array = { 5, 10, 15}; //array -> [5] [10] [15] -> 0
		//for(int i = 0; i < ?; i++)
		for(int i = 0; i < array.length  ;i++) {
					System.out.println("array[" + i + "] = "+ array[i]);
			
		}

	
		//개체 - Class - Object- Instance
        //Person
		
		//생성자 (객체를 생성하는 행위)
		Person p1 = new Person("이름",15);
		
		p1.age = 15;
		p1.name = "손호용";
		
		System.out.println(p1.name+p1.age);
		

		Person p1 = new Person("이름",15);
		Person p2 = new Person("손호용");
		p1.setName("손호용");
        p1.printInfo();	

		//int a = (int타입 값);
		//Triangle t1 = (Triangle
		Triangle t1 = new Triangle(5,10);
		t1.printArea();
		*/
		

		quater q1 = new quater(5,10);
		q1.printArea();
	}
	
	
}
