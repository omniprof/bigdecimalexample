package com.cejv416.bigdecimalexample;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * BigDecimal Examples
 *
 * @author Ken Fogel
 */
public class BigDecimalExample {

    /**
     * Example of inaccuracy of floating point
     */
    public void perform1() {
        System.out.println("\nperform1: Example of inaccuracy of floating point");
        double d1 = 2.75;
        double d2 = 2.45;
        System.out.println("d1 - d2 = " + (d1 - d2));
    }

    /**
     * Correct result using BigDecimal
     */
    public void perform2() {
        System.out.println("\nperform2: Correct result using BigDecimal");
        BigDecimal bd1 = new BigDecimal("2.75");
        BigDecimal bd2 = new BigDecimal("2.45");
        System.out.println("bd1 - bd2 = " + bd1.subtract(bd2));
    }

    /**
     * Determining the scale and setting the scale
     */
    public void perform3() {
        System.out.println("\nperform3: Determining the scale and setting the scale");
        BigDecimal b1 = new BigDecimal("456.0");
        BigDecimal b2 = new BigDecimal("-1.45");

        System.out.println("The scale of " + b1 + " is " + b1.scale());
        System.out.println("The scale of " + b2 + " is " + b2.scale());

        b1 = b1.setScale(3, RoundingMode.HALF_EVEN);
        b2 = b2.setScale(1, RoundingMode.HALF_EVEN);

        System.out.println("The scale of " + b1 + " is " + b1.scale());
        System.out.println("The scale of " + b2 + " is " + b2.scale());
    }

    /**
     * Repeating or non-terminating decimal resolved with MathContext
     */
    public void perform4() {
        System.out.println("\nperform4: Repeating or non-terminating decimal resolved with MathContext");
        BigDecimal one = new BigDecimal("1");
        BigDecimal three = new BigDecimal("3");

        MathContext mc = new MathContext(2, RoundingMode.HALF_EVEN);
        System.out.println(" 1 divided by 3 with a MathContext: " + one.divide(three, mc));
    }

    /**
     * Repeating or non-terminating decimal error
     */
    public void perform5() {
        System.out.println("\nperform5 Repeating or non-terminating decimal error");;
        BigDecimal one = new BigDecimal("1");
        BigDecimal three = new BigDecimal("3");

        System.out.println(" 1 divided by 3 without a MathContext: " + one.divide(three));
    }

    /**
     * Where it all begins
     *
     * @param args
     */
    public static void main(String... args) {
        var bigDecimalExample = new BigDecimalExample();
        bigDecimalExample.perform1();
        bigDecimalExample.perform2();
        bigDecimalExample.perform3();
        bigDecimalExample.perform4();
        bigDecimalExample.perform5();
    }
}
