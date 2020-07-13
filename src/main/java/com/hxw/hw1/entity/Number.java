package com.hxw.hw1.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Number {
    @Value(value = "10")
    private float a;
    @Value(value = "5")
    private float b;

    public Number() {
    }

    public Number(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }


    @Override
    public String toString() {
        return "Number{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
