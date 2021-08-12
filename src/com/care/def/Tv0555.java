package com.care.def;

import java.util.Scanner;

public class Tv0555 {
	public static void main(String[] args) {
		
	System.out.println("냉장고 기능");
	Scanner sc = new Scanner(System.in);
	int num;
	System.out.println("1. 올림 2. 내림");
	num = sc.nextInt();
	if(num==1) tempUp();
	else tempDown();
}
private static void tempUp() {
	System.out.println("온도 올림");
}
private static void tempDown() {
	System.out.println("온도 낮춤");
}
}
