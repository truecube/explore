package com.truecube;

/**
 * Created by yuva on 10/29/18.
 */
public class StringPerm {

    static int count = 0;
    static void permutation(String str) {
        permutation(str, "");
    }

    static void permutation(String str, String prefix) {
        if(str.length() == 0) {
            System.out.println(count++ + " <<<<<::>>>>> " + prefix);
        } else {
            for(int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i+1);
                System.out.println("<<<" + i + ":"+str+">>>");
                System.out.println(i+":rem=" + str.substring(0, i) + " & " + str.substring(i+1));
                System.out.println(i + ":" + rem + " & " + prefix + " & " + str.charAt(i));
                permutation(rem, prefix + str.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        permutation("abcd");
    }
}
