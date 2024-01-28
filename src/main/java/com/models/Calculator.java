package com.models;

public class Calculator {

    private int value;

    public Calculator() {
        this.value = 0;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }


    public void concatenateNumbers(int currentNumber, int newDigit) {
        if(currentNumber == 0) {
            this.value = newDigit;
            return;
        }
        String resultString = Integer.toString(currentNumber) + Integer.toString(newDigit);
        this.value = Integer.parseInt(resultString);
    }

    public void add(int value) {
        this.value += value;
    }

    public void subtract(int value) {
        this.value -= value;
    }

    public void multiply(int value) {
        this.value *= value;
    }

    public void divide(int value) {
        this.value /= value;
    }
}
