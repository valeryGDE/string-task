package com.learn.java.basic;

public class Main {

    public static void main(String[] args) {

        String str = "   Todayfffwffff 111222 nbbm     иjYттkfjfkj...f   ";

        WordsCounter.countWordsInTheString(str);

        RegisterCounter.countRegisterOfEnglishCharsInTheString(str);

        SpacesRemover.removeSpacesInTheString(str);

        FinderOfTheLongestWordInTheString.getTheLongestWord(str);

    }
}
