package com.care.game1;

import java.util.Scanner;

public class Game01 {
	public void display() {
		System.out.println("======= 게임1 ======");
		
	}
	public class TV_choheewon {
        public void display() {
                System.out.println("냉장고 하는 기능입니다");
                Scanner in = new Scanner(System.in);
                int num;
                System.out.println("1.올림, 2.내림");
                num=in.nextInt();
                if(num==1) tempUp();
                else tempDown();
        }
        private void tempUp() {
                System.out.println("온도를 올립니다");
        }
        private void tempDown() {
                System.out.println("온도를 낮춤니다");
        }
}
}
