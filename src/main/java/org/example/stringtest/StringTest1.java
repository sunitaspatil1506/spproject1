package org.example.stringtest;

public class StringTest1 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        System.out.println(" str1 == str2  :    "+ str1 == str2);
        System.out.println(" str1 == str3  :    "+ str1 == str2);

        System.out.println(" str1 equals to srt2   :    "+ str1.equals(str2));
        System.out.println(" str1 equals to srt2   :    "+ str1.equals(str3));

        System.out.println(" str1 hashcode equals to srt2   :    "+ (str1.hashCode() == str2.hashCode()));
        System.out.println(" str1 hashcode equals to srt3   :    "+ (str1.hashCode() == str3.hashCode()));


    }

}
