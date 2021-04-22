package excerciseBase;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Niveau1 {
	
	static BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
    private static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		String[] s= {"black?","white?","red?"};
		String[] r= {"b","w","r"};
	// int n=quizz(s,r);	
	// System.out.println("gagné "+n+" points");
	 boocle(5);

	}
	static void affichNom(String nom)
	{
		System.out.println("Hello"+nom+" !");
	}
	
	static double airTriangle(double base,double hauteur)
	{
		return (base*hauteur)/2;
	}
	static double volumeSphere(double r)
	{
		return 4/3*Math.PI*r*r*r;
	}
	static void boocle(int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print('#');
		}
	}
	
	static int quizz(String[]qst, String[]reponse)
	{ 
		Console console = null;
		String s="";String answ="";
		int points=0;
		for(int i=0;i<3;i++)
		{
		  System.out.println(qst[i]);
		  s=scan.nextLine();
		  if(s.equals(reponse[i]))
		  {
			points++;  
		  }else
		  {
			  System.out.println("la reponse est "+reponse[i]);
		  }
		
		  
		}
		 
			return points;
	}
	
	
	
	

}
