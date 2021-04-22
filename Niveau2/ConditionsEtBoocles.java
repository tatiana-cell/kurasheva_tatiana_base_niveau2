package Niveau2;

public class ConditionsEtBoocles {

	public static void main(String[] args) {
		System.out.println(isPrimary(17));

	}
	static boolean isPrimary(int x)
	{
		int count=0;
		for(int i=2;i<x;i++)
		{
			if(x%i==0) return false;
		}
		return true;
	}

}
