package Niveau2;

import java.util.Scanner;

public class Calcul {
static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		//int n=lireEntier("Votre num?:");
		//System.out.println(n);
		double n=menu(60.0,1.0);
		System.out.println(n);

	}
	 static double menu (double degrees, double radians)
	 {
		int m;
		int res=0;
		
		String s1="1 -- Convertir degrés en radians.";
		String s2="2 -- Convertir de radians en degrés";
		do {
			 m=lireEntier("Choisissez une option du Menu:\n1 -- Convertir degrés en radians.\n"
					+ "2 -- Convertir de radians en degrés.\n0 -- Quitter");
			 
			
			if(m==1)
			{ 
			System.out.println("Vous avez choisi "+s1);
				return degrees*Math.PI/180;
			}
			 else if(m==2)
			{ 
			System.out.println("Vous avez choisi "+s2);
				return radians*180/Math.PI;
			}
			
		}while(m!=0);
		return res;
		
		
		
	 }
	 
	 
	 static int lireEntier(String msg)
	 {
		
		int x=0;
		boolean correct;
		do {
			try {
				System.out.println(msg);
				String s=scan.nextLine();
				x=Integer.parseInt(s);
				correct=true;
			}catch(NumberFormatException e)
			{
				System.out.println("Vous avez tapez une autre chose qu'un entier");
				correct=false;
			}
		}while(!correct);
		 
		 return x; 
	 }
	 static double lireDouble(String msg)
	 {
		 double d=0;
		 boolean correct;
		 do {
				try {
					System.out.println(msg);
					String s=scan.nextLine();
					d=Double.parseDouble(s);
					correct=true;
				}catch(NumberFormatException e)
				{
					System.out.println("Vous avez tapez une autre chose qu'un double");
					correct=false;
				}
			}while(!correct);
		 
		return d; 
		 
	 }

}
