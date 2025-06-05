package com.leetcode.easy;

public class LargestCommonPrefix {

	public static String longestCommonPrefix(String[] strs) {
	    
        String temp = strs[0];
        String index="";
        
        for(String str:strs){
            if(str == strs[0])
                continue;
            // Character[] chArr1 = str.toCharArray();
            // Character[] chArr2 = temp.toCharArray();
            
            for(int i=0;i<temp.length();i++){
                if(str.charAt(i)==temp.charAt(i)){
                    index +=str.charAt(i);
                }
                else{
                    break;
                }
                temp = index;
            }

        }
        return index;
    }
	
	public static void main(String[] args) {
		String[] arr = {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(arr));
		
	}
}
