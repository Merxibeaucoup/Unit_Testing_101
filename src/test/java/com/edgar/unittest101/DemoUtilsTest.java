package com.edgar.unittest101;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DemoUtilsTest {

    DemoUtils demoUtils ;

    @BeforeAll
    static void setUpbeforeAll(){
        System.out.println("executes before all, must be static");
    }

    @AfterAll
    static void setUpAfterAll(){
        System.out.println("executes after all, must be static");
    }

    @BeforeEach
    void setUpBeforeEach(){
    demoUtils = new DemoUtils();
    System.out.println("Executes before each test");
    }

    @AfterEach
    void runAfterEach(){
        System.out.println("runs aftereach test");
    }
    
    @Test
    void testNullandNotNull(){      
        String str1 = null;
        String str2 = "loveyoumummy";

        assertNull(demoUtils.checKNull(str1),"Object should be null");
        assertNotNull(demoUtils.checKNull(str2), "Object Should not be null");

    }
    @Test
    void testEqualsAndNotEquals(){

        assertEquals(6, demoUtils.add(4, 2), "2+4 equals 6");
        assertNotEquals(8, demoUtils.add(5, 5), "not equal 5+5 is 10");

    }
}
