package com.scannerdata;

import java.util.Scanner;

public class ScannerData {

	public static void main(String[] args) {
		Scanner s = new Scanner("123 3.1415 true abcdef");
		System.out.println(s.nextInt()); //��s�ж�һ���������
		System.out.println(s.nextFloat()); //��s�ж�һ�����������
		System.out.println(s.nextBoolean()); //��s�ж�һ�������������
		System.out.println(s.next()); //��s�ж�һ���ַ������
	}

}
