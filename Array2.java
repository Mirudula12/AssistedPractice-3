public class Array2 {
	    
	public void kthelement(int arr[],int k) {
	    System.out.println("Fourth smallest element: " + arr[arr.length-k]);
	}

	public static void main(String[] args) {

		
		int k=4;
		Array2 obj = new Array2();
		int arr[] = {45,32,78,60,12,98,65,28};
		
		int temp;
		int i=0,j;
		for(i=0;i<arr.length;i++) {
			for(j=i+1;j<arr.length;j++) {
				if(arr[i] < arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		
		obj.kthelement(arr,k);
	
	}

}
