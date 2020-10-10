package by.academy.classwork.lesson1;

import java.util.Scanner;

public class Cat {
	int age;
	String nickname;
	double money;

	public Cat() {
	};

	public Cat(String nicname) {
		this.nickname = nicname;
	};

	public void grow(int addAge) {
		System.out.println("��� ����� �� " + addAge + " ���(�)");
		age = age + addAge;
	}

	public void sleep() {
		System.out.println("��� ������");
	}

	public void eat() {
		System.out.println("��� ���");
	}

	public void walk() {
		System.out.println("��� ������");
	}

	public void getMoney() {
		System.out.println("������� ���������� �����");
		Scanner scan = new Scanner(System.in);
		money = scan.nextInt();
	}

	public double showMoney() {
		System.out.println("��� ����� " + money + " ������");
		return money;
	}

}