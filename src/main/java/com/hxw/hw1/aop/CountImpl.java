package com.hxw.hw1.aop;
import org.springframework.stereotype.Component;

@Component
public class CountImpl implements ICount{
    @Override
    public float add(float a, float b) {
        float result = a + b;
        return result;
    }

    @Override
    public float sub(float a, float b) {
        float result = a - b;
        return result;
    }

    @Override
    public float mul(float a, float b) {
        float result = a * b;
        return result;
    }

    @Override
    public float dev(float a, float b) {
        float result = a / b;
        return result;
    }
}
