package com.test.jacoco;

import java.util.Arrays;

import javax.imageio.event.IIOReadWarningListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class HelloWorld {
    public HelloWorld() {

    }

    public String Method1() {
        return "Hello World";
    }

    public int Method2(int a, int b) {
        return a + b;
    }
    
    public int Method3(int a, int b, int c){
    	if((a>5&&b<0)||c>0) {
    		System.out.println("Condition 1");
    	}
    	else if(a<5 && c<-2 ) {
    		System.out.println("Condition 2");
    	}
    	else {
    		System.out.println("Condition 3");
    	}
    	return 0;
    }
    public int Method4(int a, int b, int c, int d, float e) {
    	if(a == 0) {
    		return 0;
    	}
    	int x = 0;
    	if((a == b) || ((c == d) && (bug(a)))) {
    		 x = 1; 
    	}
    	e = 1/x;
    	return 0;
    }
    public boolean bug(int a) {
    	if(a == 5) return true;
    	return false;
    }
    
    
    public boolean isTriangle(int a, int b, int c) {
    	/**
    	 * TODO: You need to complete this method to determine whether  a
    	 * triangle is formed or not when given the input edge a, b and c.
    	 */
    	/*my code*/
    	int[] s = {a, b, c};
    	Arrays.sort(s);
    	if(s[0] + s[1] > s[2])
    		return true;
    	else
    		return false;
    }
    public boolean isBirthday(int year, int month, int day) throws ParseException 
    {
    	/**
    	 * TODO: You need to complete this method to determine whether a 
    	 * legitimate date of birth between 1990/01/01 and 2019/10/01 is 
    	 * formed or not when given the input year, month and day.
    	 */
    	SimpleDateFormat simpleDateFormat =new SimpleDateFormat("yyyy-MM-dd");
        Date date1=simpleDateFormat.parse("1990-01-01");
        Date date2=simpleDateFormat.parse("2019-10-01");
        Date date3=simpleDateFormat.parse(String.valueOf(year)+"-"+String.valueOf(month)+"-"+String.valueOf(day));

        if(date1.getTime()<=date3.getTime() && date2.getTime()>=date3.getTime())
        {
        	return true;
        }

        return false;
    	
    }
    public Double miniCalculator(double a, double b, char op) {
    	/**
    	 * TODO: You need to complete this method to form a small calculator which 
    	 * can calculate the formula: "a op b", the op here can be four basic  
    	 * operation: "+","-","*","/". 
    	 */
    	double result = 0.0;
    	switch(op)
    	{
    	case '+':
    		result = a + b;
    		break;
    	case '-':
    		result = a - b;
    		break;
    	case '*':
    		result = a * b;
    		break;
    	case '/':
    		result = a / b;
    		break;
    	default:
    		result = 0.0;
    	}
    	return result;
    }
    
}
