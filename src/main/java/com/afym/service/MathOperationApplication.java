package com.afym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MathOperationApplication implements MathOperationService {

    public StringBuilder getBuilder()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("The result is : ");
        return builder;
    }

    @Override
    public String addition(double a, double b) {
        return this.getResult(a + b);
    }

    @Override
    public String multiple(double a, double b) {
        return this.getResult(a * b);
    }

    private String getResult(double result) {
        return this.getBuilder().append(result).toString();
    }
}
