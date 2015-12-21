package com.mydreamplus.java.kata;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {
    @Test
    public void testReverseSring() {
        String source = "asdfghjklqwertyuiop";
        String result = StringUtil.reverse(source);


        Assert.assertNotNull("Result should not be null", result);
        Assert.assertEquals("poiuytrewqlkjhgfdsa", result);
    }
}
