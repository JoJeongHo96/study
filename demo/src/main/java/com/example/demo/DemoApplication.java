package com.example.demo;

//@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws Exception {
//		SpringApplication.run(DemoApplication.class, args);
		
		Thread t = Thread.currentThread();
		System.out.println(t); //Thread[main,5,main]
								// Thread[스레드이름,우선순위,스레드그룹이름]
	
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		System.out.println(t.getThreadGroup());
		System.out.println(t.getThreadGroup().getName());
	}

}

