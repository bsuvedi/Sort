import java.util.Scanner;
public class testinsertionsort {
	public static void main(String[] args) {
		int a[];
		a= new int[1000];
		int i, n;
		Scanner scn= new Scanner(System.in);
		System.out.print("\n How many values are in your array?");
		n= scn.nextInt();
		System.out.print("\n Enter the values");
		for(i=0; i<n;i++){
			a[i]= scn.nextInt();
		}
		scn.close();
		System.out.println("\n Unsorted Array:");
		for (i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("\n================================");
		System.out.println("Sorted Array:");
		insertionSort(a,n);
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
		
		static void insertionSort(int x[],int n){
			int i,j,nextElement;
			for(i=1; i<n; i++){
				nextElement=x[i];
				j=i;
				while(j>0 && nextElement> x[j-1]){
					x[j]=x[j-1];
					j--;
				}
				x[j]=nextElement;
				}
			}
		
	}
	


