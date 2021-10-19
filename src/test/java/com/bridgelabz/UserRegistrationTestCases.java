package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTestCases {
    @Test
    public void firstName_UserInput_CheckValidInput() {
        boolean firstName = JUnitSourceFile.validName("Bhavna");
        Assert.assertTrue(firstName);
    }

    @Test
    public void firstName_UserInput_CheckInvalidInput() {
        boolean firstName =JUnitSourceFile.validName("Bh@vn@");
        Assert.assertFalse(firstName);
    }
}