package com;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		
		String str = "programming";
		StringBuffer sb = new StringBuffer();
		char[] ch=str.toCharArray();
		
		
		for(int i=0;i<ch.length;i++) { 
			boolean duplicate=false;
			for(int j=i+1;j<ch.length;j++) { 
				if(ch[i]==ch[j]) { 
					duplicate=true;
					break;
				}
			}
			if(!duplicate) { 
				sb.append(ch[i]);
			}
			
		}
		System.out.println(sb.toString());
	}

}
