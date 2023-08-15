package org.example.operations;

public class Sum implements MathOperation {

    @Override
    public float result (float a, float b) {
        return a + b;
    }

    public Sum () {
        System.out.println("Расчет произведен успешно");
    }

}

