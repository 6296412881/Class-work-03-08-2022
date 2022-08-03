package arrayexamples;

public class OddEvenNumberArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arry[]= {6,12,3,5,6,12};
		System.out.println("even");
		for (int i=0;i<arry.length;i++)
		{
			if(arry[i]%2==0)
			
			{
				
				System.out.println(arry[i]);
			}

	}
		System.out.println("odd");
		for (int i=0;i<arry.length;i++)
		{
			
			if(arry[i]%2!=0)
			{
				System.out.println(arry[i]);
			}
		}
	}
}


