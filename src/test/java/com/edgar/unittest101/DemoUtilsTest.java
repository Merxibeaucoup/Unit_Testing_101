package com.edgar.unittest101;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertLinesMatch;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(DisplayNameGenerator.Simple.class)
public class DemoUtilsTest {

    DemoUtils demoUtils ;

    @BeforeAll
    static void setUpBeforeAll(){
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

    @Test
    void testTrueOrFalse(){
        int gradeOne = 10;
        int gradeTwo = 5;

        assertTrue(demoUtils.isGreater(gradeOne, gradeTwo),"This should return true");
        assertFalse(demoUtils.isGreater(gradeTwo, gradeOne), "This should return false");
    }

    @Test
    void testSameAndNotSame(){
        String str = "LuvYouMummy Alot";

        assertSame(demoUtils.getAcademy(), demoUtils.getAcademyDuplicate(), "Objects should refer to the same object");
        assertNotSame(str, demoUtils.getAcademy(), "Objects are not the same");
    }

    @Test
    void testArrayEquals(){
        String[] stringArray = {"A","B","C"};
        assertArrayEquals(stringArray, demoUtils.getfirstThreeLettersOfAlphabet(), "Arrays Should be the same");
    }

    @Test
    void testIterableEquals(){
        List<String> theList = List.of("Luv","You","Mummy");
        assertIterableEquals(theList, demoUtils.getLuvInList(), "Iterable should be the same");
    }

    @Test
    void testLinesMatch(){
        List<String> theList = List.of("Luv","You","Mummy");
        assertLinesMatch(theList, demoUtils.getLuvInList(), "Lines should match");
    }
}
