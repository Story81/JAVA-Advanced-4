package org.example.operations;

public class Subtract implements MathOperation{

    @Override
    public float result(float a, float b) {
        return a - b;
    }
    public Subtract () {
        System.out.println("Расчет произведен успешно");
    }
}
