package com.niuike;

/**
 * @Author h_xy;
 * @Date 2022/5/19 16:57
 * @Version 1.0
 * @Description
 */

public class First {
    public static void main(String[] args) {
        String str = "abcdef" ;
        String a = reverse(str);
        System.out.println(a);
    }
    public static String reverse(String str){
        char[] s = str.toCharArray();
        int left = 0;
        int right = s.length-1;
        while(left < right){
            char c = s[left];
            s[left] = s[right];
            s[right] = c ;
            left++;
            right--;
        }
        return  new String(s);
    }
}
