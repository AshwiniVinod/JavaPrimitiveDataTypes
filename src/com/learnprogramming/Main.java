package com.learnprogramming;

//This Program is the introduction to the 8 Primitive data type and there wrapper classes.
//1.int,
// 2.short,
// 3.long,
// 4.byte,
// 5.boolean,
// 6.char,
// 7.float,
// 8.double
//And Special dataType String

import java.rmi.Naming;

public class Main {

    public static void main(String[] args) {
	/*int myIntMinValue=Integer.MIN_VALUE;
	int myIntMaxValue=Integer.MAX_VALUE;
	byte myByteMinValue=Byte.MIN_VALUE;
	byte myByteMaxValue=Byte.MAX_VALUE;
	short myShortMinValue=Short.MIN_VALUE;
	short myShortMaxValue=Short.MAX_VALUE;
	Long myLongValue;
	int intValue=50000;
	byte byteValue=120;
	short shortValue=4000;
	int sum=intValue+byteValue+shortValue;
	Long longValue=(10*sum)+50000L;
	System.out.println("Primitive Data Type Challenge ans ="+longValue);
	//Float and double
	float minFloatValue=Float.MIN_VALUE;
	float maxFloatValue=Float.MAX_VALUE;
	double minDoubleValue=Double.MIN_VALUE;
	double maxDoubleValue=Double.MAX_VALUE;
		System.out.println("float and double"+maxDoubleValue+":"+maxFloatValue+":"
				+minDoubleValue+":"+minFloatValue);

		int intV=5/2;
		float floatV=5/2f;
		double doubleV=5/2d;
		System.out.println("float value "+floatV+": double value "+doubleV);
		*/

        //punds to Kg convertion 1pound=0.45359237kg
		/*double inputPounds=3.5;
		double converstionValueP2K=0.45359237;
		double outPutKgs = (inputPounds * converstionValueP2K);
		System.out.println(inputPounds+" pounds is "+outPutKgs+"Kgs");

		char myChar='D';
		char mynicode='\u0044';
		System.out.println(myChar);
		System.out.println(mynicode);
		char myCopyritechar='\u00A9';
		System.out.println(myCopyritechar);
		boolean myBoolean=true;
*/
		/*String myString ="Hi trying to build String";
		System.out.println(myString);
		myString = myString + " my string is coming along";
		System.out.println(myString);
		double doubleNum=20.00;
		myString+=doubleNum;
		System.out.println(myString);
		int result=0;
		System.out.println(result++); //result =0 after the statement executed it got incremented by 1
		System.out.println(result);
		System.out.println(++result); //result=2 as the increment happens fist and then it is printed.

		boolean isCar=false;
		if (isCar){
			System.out.println("this should not happen");
		}
		boolean wasCar=isCar?true:false;
		if (wasCar){
			System.out.println("this was car" +wasCar);
		}*/

        //Operator Challenge
        double num1 = 20.00;
        double num2 = 80.00;
        //double multiNums=(num1+num2)*100;
        double multiNums = num1 + num2 * 100;
        boolean isResult = (multiNums % 40.00 == 0) ? true : false;
        System.out.println(isResult ? "remender is Zero" : "got Some remender");

        //Naming Convention
        double numOfMilesPerMonth = 0.00;
        int numOfCustPerDay = 1;
        char lastKeyPressed = 'd';

        //code block challenge
        boolean gameOver=true;
        int score=1000;
        int levelcompleted=8;
        int bonus=200;
        if (gameOver){
            getFinalScore(score,levelcompleted,bonus);
        }            
        
    }
    public static void getFinalScore(int score,int levelComplete,int bonus){
        System.out.println("your final score is :"+(score+(levelComplete*bonus)));

    }
}
