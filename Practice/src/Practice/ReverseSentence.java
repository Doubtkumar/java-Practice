package Practice;

public class ReverseSentence {

	public static void main(String[] args) {
		
		String str= "roHIt Is nAme My";
		
		char[]arr= str.toCharArray();
		
		for(int i=0;i<=str.length()-1;i++) {
			
			if(i==0 && arr[i] != ' ' || arr[i]!=' '  &&  arr[i-1]==' ') {
				
				if(arr[i]>='a' && arr[i]<='z' ) {
					arr[i]= (char) (arr[i]-32);
				}
				
			}
			
		}
		
		for(int i=0;i<=str.length()-1;i++) {
			
			if(i!=0 && arr[i-1]!=' ' && arr[i]!=' ' ) {
				
				if(arr[i]>='A' && arr[i]<='Z' ) {
					arr[i]= (char) (arr[i]+32);
				}
				
			}
			
		}
		
		String ch = new String(arr) ;
		String []split= ch.split(" ");
		for(int i=split.length-1;i>=0;i--) {
			System.out.print(split[i]+" ");
		}
	}

}
