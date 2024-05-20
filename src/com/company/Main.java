package com.company;

public class Main {

    public static void main(String[] args) {

        String fileName = "resources/Hamlet.txt"; 

        TopWords topWords = new TopWords();
        topWords.findTopWords(fileName);
    }
}

