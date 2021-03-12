package controller;

public class Threads extends Thread {

	private int[] Thread1, Thread2, Thread3;
	
	public Threads(int[] Thread1, int[] Thread2, int[] Thread3){
		this.Thread1 = Thread1;
		this.Thread2 = Thread2;
		this.Thread3 = Thread3;
	}
	
	public void calc() {
		int soma = 0;
		int soma1 = 0;
		int soma2 = 0;
		int i = 0;
		for (int j = 0; j < 5; j++) {
			soma = soma + Thread1[i];
			i = i + 1;
		}
		i = 0;
		for (int j = 0; j < 5; j++) {
			soma1 = soma1 + Thread2[i];
			i = i + 1;
		}
		i = 0;
		for (int j = 0; j < 5; j++) {
			soma2 = soma2 + Thread3[i];
			i = i + 1;
		}
		System.out.println(Thread1[0] + " + " + Thread1[1] + " + " + Thread1[2] + " + " + Thread1[3] + " + " + Thread1[4] + " = " + soma);
		System.out.println(Thread2[0] + " + " + Thread2[1] + " + " + Thread2[2] + " + " + Thread2[3] + " + " + Thread2[4] + " = " + soma1);
		System.out.println(Thread3[0] + " + " + Thread3[1] + " + " + Thread3[2] + " + " + Thread3[3] + " + " + Thread3[4] + " = " + soma2);
	}
	
	public void run() {
		calc();
	}
	
}
