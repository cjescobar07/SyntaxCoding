package com.syntax.class16;

import java.util.Arrays;

public class StringDemo3 {

	public static void main(String[] args) {
		
		String s = "This is a sentence";
		String[] strArr = s.split(" ");
		System.out.println(Arrays.toString(strArr));
		System.out.println(strArr.length);
		System.out.println(strArr[0]);
		System.out.println(strArr[3]);
		System.out.println("-----------------------");
		String s2 = "This is a sentence. Batch12 is great." + "Chris is the greatest. I am superduper";
		String[] strArr2 = s2.split("[.]");
		System.out.println(strArr2.length);
		System.out.println(strArr2[3]);
		System.out.println(strArr2[3].trim());
		

	}
}