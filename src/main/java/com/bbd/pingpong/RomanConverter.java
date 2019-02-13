package com.bbd.pingpong;

import java.util.ArrayList;
import java.util.List;

public class RomanConverter {
    public static int Convert(String s) {
        int num = 0;

        s = s.toUpperCase();
        s = s.replaceAll("IV", "IIII");
        s = s.replaceAll("IX", "VIIII");
        s = s.replaceAll("XL", "XXXX");
        s = s.replaceAll("XC", "LXXXX");
        s = s.replaceAll("CD", "CCCC");
        s = s.replaceAll("CM", "DCCCC");

        for (int index = 0; index < s.length(); index++)
        {
            switch (s.charAt(index))
            {
                case 'I':
                    num += 1;
                    break;
                case 'V':
                    num += 5;
                break;
                case 'X':
                    num += 10;
                break;
                case 'L':
                    num += 50;
                    break;
                case 'C':
                    num += 100;
                    break;
                case 'D':
                    num += 500;
                    break;
                case 'M':
                    num += 1000;
                    break;
                   default:
                       throw new RuntimeException("character invalid");
            }
            if(num > 1000){
                throw new RuntimeException("fuckkkkkk");
            }
        }
        return num;
    }
}

