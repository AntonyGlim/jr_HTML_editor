package com.javarush.task.task32.task3209;

import javax.swing.text.html.HTMLDocument;
import java.io.File;

public class Controller {

    private View view; //это представление
    private HTMLDocument document; //модель
    private File currentFile; //файл, который открыт в данный момент

    public Controller(View view) {
        this.view = view;
    }

    public static void main(String[] args) {

    }
}
