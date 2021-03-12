package view;

import controller.Threads;

public class Principal {
	
	public static void main(String[] args) {
	
		int[] Thread1 = new int[5];
		int[] Thread2 = new int[5];
		int[] Thread3 = new int[5];
		int i = 0;
		for (int y = 0; y < 5; y++) {
			Thread1[i] = (int)(Math.random()*20);
			i = i + 1;
		}
		i = 0;
		for (int y = 0; y < 5; y++) {
			Thread2[i] = (int)(Math.random()*20);
			i = i + 1;
		}
		i = 0;
		for (int y = 0; y < 5; y++) {
			Thread3[i] = (int)(Math.random()*20);
			i = i + 1;
		}
		for(int j = 0; j < 1; j++) {
			Thread threads = new Threads(Thread1, Thread2, Thread3);
			threads.start();
		}
	}
	
}
