package com.learn.java.basic;

//    	  Самое длинное слово в строке
//        Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых длинных слов может быть несколько, не обрабатывать.

public class FinderOfTheLongestWordInTheString {

    public static void getTheLongestWord(String str) {
        str = str.trim();
        String[] words = str.split("\\s+");
        String max = words[0];
        for (String word : words) {
            if (word.length() > max.length()) {
                max = word;
            }
        }
        System.out.println("The longest word in the string: " + max);
    }
}
