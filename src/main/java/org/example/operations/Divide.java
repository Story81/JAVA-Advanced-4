package org.example.operations;

public class Divide implements MathOperation {

    @Override
    public float result(float a, float b) {
        return a / b;
    }
    public Divide () {
        System.out.println("Расчет произведен успешно");
    }
}
