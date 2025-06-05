package com.leetcode.easy;
import java.util.*;

public class LeetCodeRomanNumber {
	
	public static void main(String[] args) {
		System.out.println(romanToInt("III"));
	}
	public static int romanToInt(String s) {
        
        char[] c = s.toCharArray();
        
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I',1);
        romanMap.put('V',5);        
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',50);
        romanMap.put('M',1000);
        int total=romanMap.get(c[0]);
//        System.out.println(c.length);
        for(int i=0; i<c.length-1; i++){
            if(romanMap.get(c[i])>=romanMap.get(c[i+1])) {
                total = total + romanMap.get(c[i+1]);
                System.out.println(total);

            }
            
            if(romanMap.get(c[i])<romanMap.get(c[i+1])) {
                total = total - romanMap.get(c[i+1]);
                System.out.println(total);
            }

        }
        return total;
    }
}
