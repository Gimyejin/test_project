package com.care.def;

import java.util.Scanner;

import com.care.tv_yejin.TV_yejin;

public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		TV_yejin tv_yejin = new TV_yejin();
		int num;
		System.out.println("---������ǰ---");
		while (true) {
			System.out.println("1.�����");
			System.out.println("2.TV");
			System.out.println("3.��Ź��");
			System.out.println(">>>: ");
			num = input.nextInt();
			switch (num) {
			case 1:
				tv_yejin.display();
				System.out.println("�����");
				break;
			case 2:
				System.out.println("Tv");
				break;
			case 3:
				break;
			}
		}
	}
}
