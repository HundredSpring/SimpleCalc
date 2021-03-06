package com.android.simplecalc;

public class Calculator {

    // Available operations
    public enum Operator {ADD, SUB, DIV, MUL, POW, GiaiThua}

    /**
     * Addition operation
     */
    public double add(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }

    /**
     * Subtract operation
     */
    public double sub(double firstOperand, double secondOperand) {
        return firstOperand - secondOperand;
    }

    /**
     * Divide operation
     */
    public double div(double firstOperand, double secondOperand) {
        return firstOperand / secondOperand;
    }

    /**
     * Multiply operation
     */
    public double mul(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }


    public double pow(double firstOperand, double secondOperand){
        return Math.pow(firstOperand, secondOperand);
    }

    public double tinhGiaithua(double firstOperand) {
        if (firstOperand > 0) {
            return firstOperand * tinhGiaithua(firstOperand - 1);
        } else if (firstOperand < 0){
            return -1;
        }else {
            return 1;
        }
    }
}