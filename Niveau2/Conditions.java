package Niveau2;

public class Conditions {

	public static void main(String[] args) {
		
     boolean b= isBissextil(1200);
     System.out.println(b);
     /* je vais tester period 100-140
      * 100-false
      * 104-true
      * 108-true
      * 112-true
      * 116-true
      * 120-true
      * 124-true
      * 128-true
      * 132-true
      * 136-true
      * 140-true
      */
     int n=nbrAnnees(100,140);
     System.out.println("Nombre d'années bissextils est= "+n);
	}
	
	
	
	
	static boolean isBissextil(int annee)
	{
		if((annee%4==0)&&(annee%100!=0))
			return true;
		else if(annee%400==0) return true;
		else return false;
	}
   static int nbrAnnees(int debut, int fin)
   {
	  int count=0;
	  for(int i=debut;i<=fin;i++)
	  {
		 if(isBissextil(i))
		 {
			 count++;
		 }
	  }
	  return count;
   }
   
   
	
}
