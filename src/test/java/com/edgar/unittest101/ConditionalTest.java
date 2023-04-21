package com.edgar.unittest101;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class ConditionalTest {
    
    @Test
    @Disabled("Dont run until JIRA #123 is resolved")
    void basicTest(){

    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testForWindowsOnly(){

    }

    @Test
    @EnabledOnOs(OS.MAC)
    void testForMacOnly(){

    }

    @Test
    @EnabledOnOs({OS.MAC, OS.WINDOWS})
    void testForMacAndWindowsOnly(){

    }


    @Test
    @EnabledOnOs(OS.LINUX)
    void testForLinuxOnly(){

    }
    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void testForOnlyJava17(){

    }

    @Test
    @EnabledOnJre(JRE.JAVA_13)
    void testForOnlyJava13(){

    }
    @Test
    @EnabledForJreRange(min=JRE.JAVA_13, max=JRE.JAVA_18)
    void testForOnlyJavaJRERange13To18(){

    }
    @Test
    @EnabledForJreRange(min=JRE.JAVA_9)
    void testForOnlyJavaJREMin9(){

    }


    
}
