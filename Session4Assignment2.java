import java.util.Scanner;


public class Session4Assignment2{
	
	public static void main (String args[]){
		
		Scanner scnr = new Scanner(System.in);
		
		int[] a = new int[10];
		 a[0]= 0;
		 a[1]=3;
		 a[2]=2;
		 a[3]=5;
		 a[4]=4;
		 a[5]=-1;
		 System.out.println("Enter the number to add to array");
		 a[6]= scnr.nextInt();
		 scnr.close();
		 int i,j;
		for (i=0;i< a.length-1;i++)
		 {
			for (j=i+1; j< a.length-1; j++){
				
				//if (a[j]!=0){
				if (a[i] < a[j]){
				int k= a[i];
				a[i]=a[j];
				a[j]=k;
				
				}
				//}
			} 
			
			
		 }	 
		for (i=0; i< a.length-1 ; i++){
		System.out.println(a[i]);}
	}
}