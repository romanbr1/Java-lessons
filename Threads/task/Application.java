package ua.lviv.lgs.task;

import java.util.Scanner;

public class ApplicationBasic {
	public static void main(String[] args) throws InterruptedException {
		MyThread myThread = new MyThread(1000);
		myThread.start();
		//myThread.join();
		RunnableThread runnableThread = new RunnableThread(1000);
	}
}

class RunnableThread implements Runnable {
	private int delay;
	private Thread thread;

	public RunnableThread(int delay) {
		this.delay = delay;
		this.thread = new Thread(this);
		thread.start();
	}

	@Override
	public synchronized void run() {
		System.out.println("enter n");
		Scanner scMenu = new Scanner(System.in);
		int n = scMenu.nextInt();

		int[] f = new int[n];
		f[0] = 0;
		f[1] = 1;
		for (int i = 2; i < n; ++i) {
			f[i] = f[i - 1] + f[i - 2];
		}
		try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("");
		System.out.print("...");
		for (int i = f.length - 1; i > -1; i--) {
			System.out.print(f[i] + " ");
		}

	}

}

class MyThread extends Thread {
	private int delay;

	public MyThread(int delay) {
		this.delay = delay;
	}

	@Override
	public void run() {
		System.out.println("enter n");
		Scanner scMenu = new Scanner(System.in);
		int n = scMenu.nextInt();

		int[] f = new int[n];
		f[0] = 0;
		f[1] = 1;
		for (int i = 2; i < n; ++i) {
			f[i] = f[i - 1] + f[i - 2];
		}
		try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("");
		for (int i : f) {
			System.out.print(i + " ");
		}
		System.out.println("...");
	}

}
