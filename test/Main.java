package com.lanqiao.test;
import java.util.Scanner;

public class Main {
    static int a[];
    static int max;
    static long sum;

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	max = sc.nextInt();
	sc.close();
	getPrimeArray();
    }
    // ��ʱĬ������������Ǵ���2������С��2���������������Ϊ0���պ����ʼ����sum=0�����ˣ��Ͳ����ٵ������д���
    public static void getPrimeArray() {
	a = new int[max + 1];
	int middle = (int) Math.sqrt(max);
	for (int i = 2; i <= max; i++) {
	    a[i] = i;
	}
	for (int j = 2; j <= middle; j++) {
	    if (a[j] != 0) {
		int mul = 0;
		int count = 2;
		//��2����ʼ��ȥ������
		while ((mul = j * count) <=max) {
		    a[mul] = 0;
		    count++;
		}
	    }
	}
	for (int i : a) {
	   if(i!=0){
	       sum=sum+i;
	   }
	}
	System.out.print(sum);
    }
}
