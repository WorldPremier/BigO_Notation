package com.tts;

import java.math.BigInteger;
import java.util.Collection;

import com.ttsBigO.FileNameConstants;
import com.ttsBigO.LinearTimeAlgorithm;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LinearTimeAlgorithmTest extends TestBase {

    @Parameterized.Parameters
    public static Collection input() {
        return TEST_SIZE_PARAMETER;
    }

    private LinearTimeAlgorithm testClass;

    public LinearTimeAlgorithmTest(long nSize) {
        super();
        this.nSize = nSize;
    }

    @Before
    public void setup() {
        testClass = new LinearTimeAlgorithm();
        this.filename = FileNameConstants.LINEAR_TIME;
        super.setup();
    }

    @Test
    public void sumOfArithmeticSeries_via_add_all() {
        BigInteger total = testClass.sumOfArithmeticSerie_via_add_all(nSize);
        System.out.println("Sum of 1.." + nSize + " =" + total.longValue());
    }

}