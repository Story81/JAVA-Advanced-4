package org.example.operations;


public class Multiply implements MathOperation{

    @Override
    public float result(float a, float b) {
        return a * b;
    }
    public Multiply () {
        System.out.println("Расчет произведен успешно");
    }
}
