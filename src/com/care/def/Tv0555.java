package com.care.def;

import java.util.Scanner;

public class Tv0555 {
	public void display() {
		
	System.out.println("����� ���");
	Scanner sc = new Scanner(System.in);
	int num;
	System.out.println("1. �ø� 2. ����");
	num = sc.nextInt();
	if(num==1) tempUp();
	else tempDown();
}
private void tempUp() {
	System.out.println("�µ� �ø�");
}
private void tempDown() {
	System.out.println("�µ� ����");
}
}
