package com.afym.service;

import org.junit.Before;
import org.junit.Test;

import static org.springframework.test.util.AssertionErrors.assertEquals;

public class MathOperationApplicationTest {
    MathOperationService service;

    @Before
    public void setService() {
        this.service = new MathOperationApplication();
    }

    @Test
    public void mathAdditional() {
        assertEquals("12 -92", "The result is : -80.0", this.service.addition(12, -92));
        assertEquals("11 10", "The result is : 21.0", this.service.addition(11.0, 10.0));
        assertEquals("100 200", "The result is : 300.0", this.service.addition(100, 200));
        assertEquals("12 - 92", "The result is : 40.0", this.service.addition(49, -9));
    }
}
