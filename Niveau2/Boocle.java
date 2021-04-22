package Niveau2;

public class Boocle {

	public static void main(String[] args) {
	
		//int x=calcul(7225,4080);
		int x=calcul(4080,7225);
		System.out.println(x);

	}
	static int calcul(int a,int b)
	{int r2=0;
	int r1=0;
	int r=1;
	int res = 0;
	if(a==b)
	{
		System.out.println("Vos deux numbres sont égaux");
	}
		if(a<b)
		{
	     int tempo=a;
		 a=b;
		 b=tempo;
		}
		   r1=a%b;
		   r2=b%r1;
		  int i=0;
		  r=r1%r2;
		  while(r!=0)
		  {
			 r1=r2;
			 r2=r;
			 r=r1%r2;
			  //System.out.println("r="+r);
		  }
			
		return r2;
	}

}
