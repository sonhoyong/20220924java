package kr.dventt;

public class Person {
    //이름(문자열),나이(함수)
	public String name; //멤버(개체) 변수
	public int age;
	
	//지역변수 -> 지역변수의 우선순위가 가장 높다.
	public Person(String name) {
		this.name = name;
		age = 1;
	}
	public Person() {
		name = "이름없음";
		age = 1;
	}
	
	
	
	public Person(String name, int age) {
		//a = "손호용"
		this.name = name;
		this.age = age;
	}
	
	//생성자
    //public Person() {}
	//public - 전체공개
	//private -  내부에서만 공개
	//(default) - 같은패키지 내에서만 공개
	//protected - 상속 관계에서만 공개
	
	//메소드  , 함수 method(메서드) , function(함수)
	//변환타임 메서드 명(매게변수) {}
	// 첫글자 소문자 시작 이어지는 단어 대문자 시작
	//getter  = 내부에 private 선언 된 변수를 외부에서 메서드를 통해 가져가는 형식
	public String  gerName() {
		return name;
	}
	//setter - 내부에서 private 선언 된 변수를 외부에서 메서드를 통래 설정하는 형식
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		if(age >= 15) this.age = age;
	}
	
	public void printInfo() {
		System.out.println("이름 :"+name+"나이 :" +age);
	}
	
	//나이를 한살 증가시키는 메서드
	public void addAge() {
		age++; //age + 1
	}
	
}
