package com.example.demo;

import java.util.ArrayList;
import java.util.List;

//@SpringBootApplication
public class DemoApplication {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		
		// Q: List<String>의 foreach문의 매개변수는 어떤 구조이길래 List의 요소를 변경할 수 없는걸까?
		// A.1: 일단 프로그래밍 관행상 권장 X
		// A.2: 불변객체는 값을 변경할 수 없고 새로운 객체를 생성하기 때문이다.
		 List<StringBuilder> list = new ArrayList<>();
	        list.add(new StringBuilder("a"));
	        list.add(new StringBuilder("b"));
	        list.add(new StringBuilder("c"));

	        list.forEach(item -> System.out.println("1>>>"+item));
	        
	        list.forEach(item -> {
	            item.append(" modified");
	            System.out.println("2>>>"+item);
	        });

	        // 리스트의 요소는 가변 객체이기 때문에, append 메서드를 통해 수정 가능
	        list.forEach(item -> System.out.println("3>>>"+item));
	        
	        // @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	        // 반면 불변 객체(String)은 수정할수없다.
	        List<String> list_str = List.of("a", "b", "c");
	        list_str.forEach(item -> {
	            item="1"; 
	            // 현재 item은 String 객체를 참조하고있는 로컬 변수임.
	            // 여기서 "1"을 넣어줘봐야 로컬 변수의 참조가 변할 뿐이다.
	            // 그럼 어찌해야 바꿀수 있느냐?
	            // 불변객체인 String의 상태를 바꿔줄순없으니
	            // list가 바라보는 객체를 바꿔줘야한다.
	            // list는 가변객체이므로 상태를 바꿔줄수있고 바라보는 객체를 변경해줄 수 있는것이 바로 set()이다.
	        });
	        list_str.forEach(item -> System.out.println("4>>>"+item)); // 각 요소들이 1로 변경되지 않음
	}

	static void Mymethod (String a) {
		a="b";
	}
}

