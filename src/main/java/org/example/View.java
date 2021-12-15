package org.example;

public class View {

    public static final String WRONG_INPUT= "Wrong input! Repeat please! ";
    public static final String INPUT_TEXT_FIRST = "Enter the word \"Hello\":";
    public static final String INPUT_TEXT_SECOND = "Enter the word \"world!\":";


    public void printMessage(String message){
        System.out.println(message);
    }

    public void printText(String messageOne, String messageTwo){
        System.out.println(messageOne + " " + messageTwo);
    }

}
