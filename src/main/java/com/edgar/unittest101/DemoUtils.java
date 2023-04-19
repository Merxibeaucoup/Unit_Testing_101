package com.edgar.unittest101;

import java.util.List;

public class DemoUtils {

    private String academy ="LuvYouMummy";
    private String academyDuplicate = academy;

    private String [] firstThreeLettersOfAlphabet={"A","B","C"};

    private List<String> luvInList = List.of("Luv","You","Mummy");
    
    public Object checKNull(Object obj){
        return obj !=null ? obj : null;
    }

    public int add(int x , int y){
        return x+y;
    }

    public Boolean isGreater( int n1, int n2){
        return n1 > n2;
    }

    public String getAcademy(){
        return academy;
    }

    public String getAcademyDuplicate(){
        return academyDuplicate;
    }

    public String[] getfirstThreeLettersOfAlphabet(){
        return firstThreeLettersOfAlphabet;
    }

    public List<String> getLuvInList(){
        return luvInList;
    }
}
