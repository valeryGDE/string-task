package com.learn.java.basic;

//    Количество слов в строке
//    Вводится строка, состоящая из слов, разделенных пробелами. Требуется посчитать количество слов в ней.

public class WordsCounter {

    public static void countWordsInTheString(String str) {
        str = str.trim();
        String[] words = str.split("\\s+");
        int counter = 0;
        for (String word : words) {
            counter++;
        }
        System.out.println("Number of words in the string " + "\"" + str + "\"" + ": " + counter);
    }

}
