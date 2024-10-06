package com.example.demo;

public class ThreadExample {
	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable(); // NewThread 객체 생성 및 스레드 시작

		try {
			myRunnable.t.join(); // 자식 스레드가 종료될 때까지 기다림
			
			/* 메인 스레드가 마지막에 종료되어야 되는 경우가 많기 때문에
			   join을 이용해서 자식 스레드를 기다려준다
			*/
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
		
		// 메인 스레드의 작업
		Thread t = Thread.currentThread();
		for (int i = 0; i < 5; i++) {
			
			System.out.println(t.getName()+": " + i);
			try {
				Thread.sleep(1000); // 1초 대기
			} catch (InterruptedException e) {
				System.out.println("Main thread interrupted.");
			}
		}
	}
}

/*
 * 결과가 이런식으로 나온다고 해서 이상하길래 해봤는데 역시나 다르게 나온다.
 * Demo Thread: 0
Main Thread: 0
Demo Thread: 1
Main Thread: 1
Demo Thread: 2
Main Thread: 2
Demo Thread: 3
Main Thread: 3
Demo Thread: 4
Main Thread: 4
 * */
 