package com.care.def;

import java.util.*;

class TV_koogeonhwe {

	public void display() {
		// TODO Auto-generated method stub
		
	}
}
public class Mainclass5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TV_koogeonhwe tv_koogeonhwe = new TV_koogeonhwe();
		int num;
		System.out.println("---가전제품---");
		while(true) {
			System.out.println("1.냉장고");
			System.out.println("2.Tv");
			System.out.println("3.세탁기");
			System.out.println("4.건조기");
			System.out.print(">>>");
			num = sc.nextInt();
			switch(num) {
			case 1:
				tv_koogeonhwe.display();
				System.out.println("냉장고");
				break;
			case 2:
				System.out.println("Tv");
				break;
			case 3:
				System.out.println("세탁기");
				break;
			case 4:
				System.out.println("건조기");
				break;
			}
	}
}
}