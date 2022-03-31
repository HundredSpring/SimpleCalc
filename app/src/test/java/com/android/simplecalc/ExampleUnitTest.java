package com.android.simplecalc;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

@RunWith(JUnit4.class)
public class ExampleUnitTest {
    private Calculator mCalculator;

    @Before
    public void setUp(){
        mCalculator = new Calculator();
    }
    @After
    public void tearDown(){

    }

    @Test
    public void addition_isCorrect() {

        double result = mCalculator.add(1d,2d);
        assertEquals(result, 3d,0d);
    }
    @Test
    public void addNegative() {

        double result = mCalculator.add(-1d,-2d);
        assertEquals(result, -3d,0d);
    }
    @Test
    public void add3() {

        double result = mCalculator.add(-1d,2d);
        assertEquals(result, 1d,0d);
    }

    @Test
    public void sub1() {

        double result = mCalculator.sub(5d,2d);
        assertEquals(result, 3d,0d);
    }
    @Test
    public void sub2() {

        double result = mCalculator.sub(5d,-2d);
        assertEquals(result, 7d,0d);
    }
    @Test
    public void sub3() {

        double result = mCalculator.sub(-5d,2d);
        assertEquals(result, -7d,0d);
    }
    @Test
    public void sub4() {

        double result = mCalculator.sub(-5d,-2d);
        assertEquals(result, -3d,0d);
    }
    @Test
    public void mul1() {

        double result = mCalculator.mul(5d,2d);
        assertEquals(result, 10d,0d);
    }
    @Test
    public void mul2() {

        double result = mCalculator.mul(-5d,2d);
        assertEquals(result, -10d,0d);
    }
    @Test
    public void mul3() {

        double result = mCalculator.mul(-5d,-2d);
        assertEquals(result, 10d,0d);
    }
    @Test
    public void div1() {

        double result = mCalculator.div(10d,3d);
        assertEquals(result, 3.3d,0.5d);
    }
    @Test
    public void div2() {

        double result = mCalculator.div(15d,0d);
        assertEquals(true, Double.isInfinite(result));
    }
    @Test
    public void div3() {

        double result = mCalculator.div(15d,-3d);
        assertEquals(result, -5d,0.5d);
    }
    @Test
    public void div4() {

        double result = mCalculator.div(-15d,-3d);
        assertEquals(result, 5d,0.5d);
    }
    @Test
    public void pow1() {

        double result = mCalculator.pow(2d,3d);
        assertEquals(result, 8d,0.5d);
    }
    @Test
    public void pow2() {

        double result = mCalculator.pow(2d,-2d);
        assertEquals(result, 0.25d,0.5d);
    }
    @Test
    public void pow3() {

        double result = mCalculator.pow(-2d,2d);
        assertEquals(result, 4d,0.5d);
    }
    @Test
    public void pow4() {

        double result = mCalculator.pow(-2d,-2d);
        assertEquals(result, 0d,0.5d);
    }
    @Test
    public void pow5() {

        double result = mCalculator.pow(2d,0.5d);
        assertEquals(result, 1.4d,0.5d);
    }
    @Test
    public void giaithua1() {

        double result = mCalculator.tinhGiaithua(5d);
        assertEquals(result, 120d,0.5d);
    }
    @Test
    public void giaithua2() {

        double result = mCalculator.tinhGiaithua(0.5d);
        assertEquals(result, 0d,0.5d);
    }
    @Test
    public void giaithua3() {

        double result = mCalculator.tinhGiaithua(-5d);
        assertEquals(result, -1d,0.5d);
    }

}