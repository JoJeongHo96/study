package com.example.demo;

//@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws Exception {
		
		// Q: Enum의 valueOf는 값이 없으면 뭘 반환 할까
		System.out.println(jjhEnum.valueOf("one")); //일치
		System.out.println(jjhEnum.valueOf("Two")); // 대문자도 구분해? >> 컴파일 에러
		System.out.println(jjhEnum.valueOf("Four")); // 마찬가지로 컴파일 에러.
		
	}

}

