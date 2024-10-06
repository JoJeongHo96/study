package com.example.demo;

public class ThreadExample {
	public static void main(String[] args) {
		new MyRunnable(); // NewThread 객체 생성 및 스레드 시작

		// 메인 스레드의 작업
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread: " + i);
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
 