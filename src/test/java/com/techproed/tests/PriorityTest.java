package com.techproed.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PriorityTest {

    @BeforeMethod
    public void setUp(){
        System.out.println("setup");
    }

    @Test(priority = 1)
    public void amazonTest(){

    }
    @Test(priority = 2)
    public void googleTest(){

    }
    @Test(priority = 3)
    public void facebookTest(){

    }
    @Test(priority = 4)
    public void appleTest(){

    }
}
