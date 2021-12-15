package org.example;

import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processOutput() {
        Scanner sc = new Scanner(System.in);

        model.setWordOne(inputOneTextWithScanner(sc));
        model.setWordTwo(inputTwoTextWithScanner(sc));

        view.printText(model.getWordOne(), model.getWordTwo());

    }

    public String inputOneTextWithScanner(Scanner sc) {
        view.printMessage(View.INPUT_TEXT_FIRST);

        while (!sc.hasNext("Hello")) {

            view.printMessage(View.WRONG_INPUT);
            view.printMessage(View.INPUT_TEXT_FIRST);
            sc.nextLine();

        }

        return sc.nextLine();
    }


    public String inputTwoTextWithScanner(Scanner sc) {
        view.printMessage(View.INPUT_TEXT_SECOND);

        while (!sc.hasNext("world!")) {

            view.printMessage(View.WRONG_INPUT);
            view.printMessage(View.INPUT_TEXT_SECOND);
            sc.nextLine();

        }

        return sc.nextLine();
    }

}
