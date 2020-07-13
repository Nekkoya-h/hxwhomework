package com.hxw.hw1.aop;

import org.springframework.stereotype.Component;

@Component
public interface ICount {
    public float add(float a, float b);
    public float sub(float a, float b);
    public float mul(float a, float b);
    public float dev(float a, float b);
}
