package com.learn.java.basic;

//        Удаление лишних пробелов
//        Вводится ненормированная строка, у которой могут быть пробелы в начале, в конце и между словами более одного пробела. Привести ее к нормированному виду, т.е. удалить все пробелы в начале и конце, а между словами оставить только один пробел.

public class SpacesRemover {

    public static void removeSpacesInTheString (String str) {
        str = str.trim().replaceAll(" +", " ");
        System.out.println("The string without spaces:" + "\"" + str + "\""  );

    }
}
