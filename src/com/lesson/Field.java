package com.lesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: Bishop
 * Date: 18.07.13
 * Time: 11:35
 * To change this template use File | Settings | File Templates.
 */
public class Field {

    public static final int MAX_FIELD_SIZE = 100;
    public static final int MIN_FIELD_SIZE = 0;
    public static final int DEFAULT_FIELD_SIZE = 3;
    private final int fieldSize;

    private static final char DEFAULT_CELL_VALUE = ' ';
    private static final char USED_CELL_VALUE = 'X';
    private static final String LEFT_BORDER_CHAR = "[";
    private static final String RIGHT_BORDER_CHAR = "]";

    private final char[][] field;

    public Field() {
        this(DEFAULT_FIELD_SIZE);
        System.out.println("In constructor 1");
    }

    public Field(int size) {
        fieldSize = size;
        field = new char[fieldSize][fieldSize];
        System.out.println("In constructor 2");
    }

//    public void setFieldSize(int newFieldSize) {
//        if (newFieldSize > MIN_FIELD_SIZE && newFieldSize < MAX_FIELD_SIZE) {
//            this.fieldSize = newFieldSize;
//        }
//    }

    public void eraseField() {
        for (int i = 0; i < fieldSize; i++) {
            eraseLine(i);
        }
    }

    public void eraseLine(int lineNumber) {
        for (int i = 0; i < fieldSize; i++) {
            field[lineNumber][i] = DEFAULT_CELL_VALUE;
        }
    }

    public void showField() {
        for (int i = 0; i < fieldSize; i++){
            showLine(i);
            System.out.println();
        }
        //System.out.println();
    }

    public void showLine(int lineNumber) {
        for (int i = 0; i < fieldSize; i++) {
            showCell(lineNumber, i);
        }
    }

    private void showCell(int i, int j) {
        System.out.print(LEFT_BORDER_CHAR + field[i][j] + RIGHT_BORDER_CHAR);
    }

    public void getUserInput() {
        field[getUserRow()][getUserCol()] = USED_CELL_VALUE;
    }

    private int getUserRow() {
        System.out.print("введите номер строки: ");

        int i = 1;
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        try {
            i = Integer.parseInt(stdin.readLine()) - 1;
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return i;
    }

    private int getUserCol() {
        System.out.print("введите номер столбца: ");

        int i = 1;
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        try {
            i = Integer.parseInt(stdin.readLine()) - 1;
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return i;
    }

    public static void about() {
        System.out.println("class Board is our game's board");
    }
}
