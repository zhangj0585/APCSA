//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class Lab15d
{
	public static void main( String args[] ) throws IOException
	{

		Scanner s = new Scanner(new File("H://Unit13//src//lab15d2.dat"));
		FancyWords fw;
		s.nextLine();
		
		while(s.hasNextLine())
		{
			fw = new FancyWords(s.nextLine());
			System.out.println(fw);
		
		}




	}
}