package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EmployeeTest {

    Emlpoyee emlpoyee;

    @BeforeMethod
    public void setUp(){
        emlpoyee = new Emlpoyee();
    }

    @Test(priority = 1)
    public void testName(){
        emlpoyee.setName("Siliwangi");
        Assert.assertEquals(emlpoyee.getName(), "Siliwangi");
    }

    @Test (priority = 2)
    public void testAddress(){
        emlpoyee.setAddress("Jakarta");
        Assert.assertEquals(emlpoyee.getAddress(), "Jakarta");
    }

    @Test
    public void testSalary(){
        emlpoyee.setSalary(7500000.0);
        Assert.assertEquals(emlpoyee.getSalary(), 7500000.0);
    }

}
