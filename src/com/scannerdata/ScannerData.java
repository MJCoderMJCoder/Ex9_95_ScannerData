package com.scannerdata;

import java.util.Scanner;

public class ScannerData {

	public static void main(String[] args) {
		Scanner s = new Scanner("123 3.1415 true abcdef");
		System.out.println(s.nextInt()); //从s中读一个整数输出
		System.out.println(s.nextFloat()); //从s中读一个浮点数输出
		System.out.println(s.nextBoolean()); //从s中读一个布尔数据输出
		System.out.println(s.next()); //从s中读一个字符串输出
	}

}
