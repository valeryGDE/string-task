package com.learn.java.basic;

//        Количество строчных и прописных букв в строке
//        Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские буквы.

public class RegisterCounter {

    public static void countRegisterOfEnglishCharsInTheString(String str) {
        str = str.replaceAll("[^a-zA-Z]", "");
        char[] chars = str.toCharArray();
        int upperCaseCounter = 0;
        int lowerCaseCounter = 0;
        for (char ch : chars) {
            if ((Character.isLowerCase(ch))) {
                lowerCaseCounter++;
            } else if ((Character.isUpperCase(ch))) {
                upperCaseCounter++;
            }
        }
        System.out.println("Number of letters in uppercase:" + upperCaseCounter + "\n" + "Number of letters in lowercase:" + lowerCaseCounter);

    }
}