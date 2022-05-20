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
        // 数组中
        char[] s = str.toCharArray();
        int i = 0;
        int j = s.length -1 ;
        for( i = 0  , j = s.length -1  ; i < j ; i++ ,j--){
            char a = s[i] ;
            s[i] = s[j] ;
            s[j] = a ;
        }

        return new String(s) ;
    }
}
