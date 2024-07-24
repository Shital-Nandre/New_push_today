package com;

import java.util.HashMap;
import java.util.Map;

public class CountEachCharcter {
	
	public static void main(String[] args) {
		String str ="hagfhlgflhj";
		char[] ch=str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for(Character c:ch) { 
			Integer itr=map.get(c);
			if(itr==null) { 
				map.put(c, 1);
			}else { 
				itr++;
				map.put(c, itr);
			}
			
		}
		System.out.println(map);
	}

}
