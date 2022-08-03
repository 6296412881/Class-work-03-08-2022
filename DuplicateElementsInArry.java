package arrayexamples;

import java.util.Scanner;

public class DuplicateElementsInArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[],size,i,j,count=0;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter size of Array: ");
        size=sc.nextInt();
        
        arr=new int[size];
        System.out.println("enter "+size+" elements in an array:");
        
        for(i=0;i<size;i++)
           {
        	arr[i]=sc.nextInt();
           }
        //print array elements
        System.out.println("Array elements are:");
          for(i=0;i<size;i++)
              {
        	  System.out.println(arr[i]);
              }
        //find duplicate elements in an array
          
          for(i=0;i<size;i++)
             {
        	  for(j=i+1;j<size;j++)
        	  {
        		  if(arr[i]==arr[j])
        		  {
        			  count++;
        			  break;
        		  }
        	    }
               }
          
          //print total no of duplicates
         System.out.println("the no of duplicates are: "+count); 
	}

}
