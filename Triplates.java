
public class Triplates {

	public static void main(String[] args) {
int arr[]= {3, -1,-7, -4, -5, 9, 10};
		
int n=arr.length;

for (int i=0; i<n; i++) {
	
	 for(int j=i+1; j<n; j++) {
		 
			for (int k=j+1; k<n; k++) {
				
			if(arr[i]+arr[j]+arr[k]==0) {
				System.out.print(arr[i]+","+arr[j]+","+arr[k]);
				
			}
			
			
			}
		
}

}

	}

}
