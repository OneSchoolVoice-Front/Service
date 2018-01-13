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
    // 暂时默认输入的数都是大于2的数，小于2的求出来的素数和为0，刚好与初始化的sum=0处理了，就不用再单独进行处理。
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
		//从2倍开始，去掉倍数
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
