package org.example;

import org.testng.annotations.*;

public class TestngDemoAnnotations {


    @BeforeMethod
    public void beforeMethod(){

        System.out.println("before method");
    }


    @Test
    public void test1(){
        System.out.println("test");
    }

//    @AfterMethod
//
//
//
//    @BeforeTest
//    @AfterTest
//
//    @BeforeSuite
//
//    @AfterSuite
//
//    @BeforeClass
//
//    @AfterClass
//
//    @BeforeGroups
//
//    @AfterGroups



    /*

    <Before suites>  1
        <Before tests> @BeforeTest  1
            <Before classes> 1
                <Before method>   3 times
                    <test method> @Test
                    <test method1> @Test
                    <test methd 3>  @Test
                <after method>      3 times
             <after class>
        <after test>
     <after suite>

     */

}
