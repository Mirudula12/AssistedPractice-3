import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
    
		int arr[] = {1,2,3,4,5,6,7};

		int rightrotate=5;
		int temp;
		for(int i=1;i<=rightrotate;i++) {
	   
			temp= arr[arr.length-1];
			for(int j=arr.length-1;j>0;j--) {
				arr[j] = arr[j-1];
			}
	        arr[0]=temp;
      }

        System.out.println(Arrays.toString(arr));
	}

}
