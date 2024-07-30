package com.java8;

import java. util.*;
import java.util.Arrays;

public class NameStart {
	
	public static void main(String[] args) {
		
		List<String>list=Arrays.asList("Apple","Banana","Apricot","bit");
		list.stream().filter(i->i.startsWith("A"))
		.forEach(System.out::println);
	}

}
