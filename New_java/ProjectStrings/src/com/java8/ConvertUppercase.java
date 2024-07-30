package com.java8;

import java.util.Arrays;
import java.util.List;

public class ConvertUppercase {
	public static void main(String[] args) {
		
		List<String>list=Arrays.asList("Apple","banana","Apricot","bit");
		list.stream().skip(2).map(i->i.toUpperCase()).forEach(System.out::println);
	}

}
