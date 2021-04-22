package Niveau2;

public class BouclesEtRecursivites {

	public static void main(String[] args) {
		
		long f=factoriel(3);
		System.out.println(f);

	}
	static long factoriel(int n)
	{
		if(n==0) return 1;
		else return (factoriel(n-1)*n);
		
		
		
	}

}
