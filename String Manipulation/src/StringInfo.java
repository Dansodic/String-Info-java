import java.util.Scanner;

// Student Name : 		Daniel Kenny
// Date :				11/09/2019
// Purpose :
/*
 outputs the number of words in the user's input, with the average, 
 *minimum and maximum number of characters in the words
 */ 
public class StringInfo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String  str;
    	int numWords ;
    	int spPos ;
    	String  firstWord;
    	int totalLength ; 
    	double average ;
    	int noOfSpace ;
    	int shortestWd ;
    	int longestWd ;  
    	String shortestWdstr ; 	// Stores shortest word
    	String longestWdstr ;   // Stores longest word
    	
    	System.out.print("Enter a string ");
		str = sc.nextLine();
    	

  
		// Adding a space in order to process the last word
		str =  str + " ";
		noOfSpace = -1 ;
		numWords = 0 ;
		spPos = str.indexOf(" ") ;
		totalLength = 0 ;
		shortestWd = str.length() ;
		longestWd = 0 ;
		longestWdstr = "" ;
		shortestWdstr = "" ;
		while (spPos > -1)
		{
		    noOfSpace++ ; 
			firstWord = str.substring(0,spPos) ;
			if(firstWord.length() > 0)
				{
					numWords++ ;
					totalLength += firstWord.length() ;
				   // Find the shortest word
				   if(shortestWd > firstWord.length())
				   	{
				   		shortestWd = firstWord.length() ;
				   		shortestWdstr = firstWord ;
				   	}
				   	
				   	// Find the longest word
				   	if(longestWd < firstWord.length())
				   	{
				   		longestWd = firstWord.length() ;
				   		longestWdstr = firstWord ;
				   	}
					
				}			
			
			// Now remove the first word.
			str = str.substring(spPos+1) ;
			spPos = str.indexOf(" ") ;	
		}
		average = (double)totalLength / numWords ;
		
		System.out.println("The average number of characters is : " + average) ;
		System.out.println("Number of spaces : " + noOfSpace) ;
		System.out.println("Total number of words : " + numWords) ;
		System.out.println("The longest word is  : " +   longestWdstr) ;
		System.out.println("The shortest word is  : " +   shortestWdstr) ;

	}

}
