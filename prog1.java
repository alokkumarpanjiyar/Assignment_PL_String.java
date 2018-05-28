import java.*;
import java.io.*;

class count_Unique_char
{
	void cout_char(String str)
	{
		String temp="";                                   //Temporary string to make a copy the orginal string for operation 	
		for(int i=0; i<str.length();i++)
		{
			if(temp.indexOf(str.charAt(i))==-1)
			{
				temp = temp + str.charAt(i);
			}
		}
		System.out.println(temp);
		System.out.println("Unique character is = " + temp.length());
	}
}

class Alternate_char_to_Uppercase
{
	void Convert_Alternative_char_to_UpperCase(String str)
	{
		for(int i=0; i<str.length();i++)
		{
			char ch= str.charAt(i);
			if(i % 2 == 0)                                            // Alternative index of String
			{
				System.out.print(Character.toUpperCase(ch));      // converting to upperCase 
			}
			else
				System.out.print(Character.toLowerCase(ch));
		}
		System.out.println();
	}	
}


public class prog1
{
	public static void main(String args[]){
	try {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter thr string : ");
		System.out.println();
		String str= br.readLine();                                                //taking input string             
		count_Unique_char ob= new count_Unique_char();                           //Creating object of class "count_Unique_char"
		ob.cout_char(str);                                                       // calling methode of class count_Unique_char
		Alternate_char_to_Uppercase obj= new Alternate_char_to_Uppercase(); //creating object of Alternate_char_to_Uppercase class
		obj.Convert_Alternative_char_to_UpperCase(str);                     //calling methode of Alternate_char_to_Uppercase
	
	}  // end of try block
	catch(Exception e)
	{
		System.out.println(e);                                     //Diplaying exception occurs in try block
	}
}
}
