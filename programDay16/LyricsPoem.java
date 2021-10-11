package com.bridgelabz.programDay16;

import java.util.Scanner;

public class LyricsPoem {
	
	public static void verse(String animalN, String Anoise)
	  {
		String s1 = "Old MacDonald had a farm"+
				"E-I-E-I-O"+
				"And on his farm he had some ANIMAL"+
				" E-I-E-I-O"+
				"With a SOUND SOUND here"+
				"And a %SOUND% %SOUND% there"+
				"Here a %SOUND% there a %SOUND%"+
				"Everywhere a %SOUND% %SOUND%";
		
		String replaceString1=s1.replace("ANIMAL",animalN);
		//System.out.println(replaceString1);
		String replaceString2=replaceString1.replace("SOUND",Anoise);
		System.out.println(replaceString2);
		
		
//	    System.out.println( "Old MacDonald had a farm" );
//	    System.out.println( "E-I-E-I-O" );
//	    System.out.println( "And on that farm he had a " + animal );
//	    System.out.println( "E-I-E-I-O" );
//	    System.out.println( "With a " + noise + "-" + noise + " here") ;
//	    System.out.println( "And a " + noise + "-" + noise + " there" );
//	    System.out.println( "Here a " + noise + ", there a " + noise );
//	    System.out.println( "Everywhere a " + noise + "-" + noise );
//	    System.out.println( "Old MacDonald had a farm" );
//	    System.out.println( "E-I-E-I-O" );
	  }

	  public static void main(String[] args)
	  {
		  Scanner sc = new Scanner (System.in);
		  System.out.println("enter animal name");
		  String animalN= sc.next();
		  System.out.println("enter sound");
		  String Anoise= sc.next();
		  verse( animalN, Anoise );
//	    verse( "duck" , "quack" );
//	    verse("pig", "oink");
	  }
}
