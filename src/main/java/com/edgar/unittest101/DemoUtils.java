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

    public String throwException(int a )throws Exception{
        if(a<0){
            throw new Exception("Value should be greater than 0");
        }
        return "Value is greater than or equal to 0";
    }

    public void checkTimeOut()throws InterruptedException{
        System.out.println("I am going to sleep");
        Thread.sleep(2000);
        System.out.println("sleeping over");

    }
}
