package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.plaf.PanelUI;

public class UserTest {

    User user;

    @BeforeMethod
    public void setUp(){
        user = new User();
    }

    @Test
    public void testCheckLogin(){
        user.setUsername("admin");
        user.setPassword("admin123");
        Assert.assertTrue(user.checkLogin());
    }

    // gunakan contains pada assertTrue
    @Test
    public void testErrorMessage(){
        Assert.assertTrue(user.getErrorMessage().contains("Invalid"));
    }

    @Test
    public void testError(){
        boolean result = user.getErrorMessage().contains("Invalid");
        Assert.assertTrue(result);
    }

}
