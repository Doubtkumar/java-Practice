package Practice;

public class MergeAndSort {
	
	//merging two arrays
	public static void fun(int []a, int []b) {
		
		int l= a.length + b.length;
		int []temp = new int[l];
		
		 int count = 0;
	      
	      for(int i = 0; i < a.length; i++) { 
	         temp[i] = a[i];
	         count++;
	      } 
	      for(int j = 0; j < b.length;j++) { 
	         temp[count++] = b[j];
	      } 
	      
		//sorting the merged array
		for(int i=0;i<l;i++) {
			for(int j=i+1;j<l;j++) {
				if(temp[j]<temp[i]) {
					int t= temp[j];
					temp[j]=temp[i];
					temp[i]=t;
				}
			}
		}
		System.out.print("[ ");
		for(int i=0; i<temp.length;i++) {
			System.out.print(temp[i]+" ");
		}
		System.out.print("]");
		
	}
	
	public static void main(String[] args) {
		
		int []arr1= {4,5,3,10,2};
		int []arr2= {15,1,7,11};
		
		 fun(arr1,arr2);
	}
}
