package com.example.demo;

class MyRunnable implements Runnable {
	Thread t;

	MyRunnable() {
        // 새 스레드 객체 생성
        t = new Thread(this, "Demo Thread");
        t.start(); // 스레드 시작
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(t.getName() + ": " + i);
            try {
                Thread.sleep(500); // 0.5초 대기
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

