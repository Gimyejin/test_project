package com.care.def;

import java.util.Scanner;

public class Tv0555 {
	public static void main(String[] args) {
		
	System.out.println("����� ���");
	Scanner sc = new Scanner(System.in);
	int num;
	System.out.println("1. �ø� 2. ����");
	num = sc.nextInt();
	if(num==1) tempUp();
	else tempDown();
}
private static void tempUp() {
	System.out.println("�µ� �ø�");
}
private static void tempDown() {
	System.out.println("�µ� ����");
}
}
