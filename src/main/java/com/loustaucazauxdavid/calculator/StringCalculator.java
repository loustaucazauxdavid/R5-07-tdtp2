package com.loustaucazauxdavid.calculator;

public class StringCalculator {

    public int evaluate(String expression)
    {
        String[] chiffresStrTab = expression.split(",");

        int resultatCalcul = 0;

        for (String s : chiffresStrTab)
        {
            resultatCalcul += Integer.parseInt(s);
        }

        return resultatCalcul;
    }

}
