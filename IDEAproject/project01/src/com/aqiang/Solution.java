package com.aqiang;

import java.util.*;
class Solution {
    public String[] divideString(String s, int k, char fill) {
        String[] res;
        int len = s.length();
        if (len == 0) {
            return new String[0];
        }
        int left = k - (len - (len / k) * k);
        if (left == k) {
            res = new String[len / k];
        } else {
            res = new String[len / k + 1];
            while (left-- > 0) {
                s = s + fill;
            }
        }
        int count = 0;
        int index = 0;
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i <= s.length(); i++, count++) {
            if (count == k) {
                res[index++] = sb.toString();
                sb = new StringBuilder("");
                count = 0;
                if (i == s.length()){
                    break;
                }
            }
            sb.append(s.charAt(i));
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().divideString("abcdefghij", 3, 'x').toString());
    }
}