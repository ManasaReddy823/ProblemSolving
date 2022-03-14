
public class BinarySearch {
	
	public static boolean binarysearch(int[] arr, int k) {
		int size = arr.length;
		if(k<arr[0] ||k>arr[size-1]) return false;
		int start = 0;
		int end = size-1;
		int mid=-1;
		while(start<end) {
			mid=(start+end)/2;
			if(k==arr[mid]) return true;
			if(k>arr[mid]) {
				start=mid+1;
			}
			if(k<arr[mid]) {
				end=mid-1;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		int[] arr= {1};
		int k=18;
		
		System.out.println(BinarySearch.binarysearch(arr,k));
		
	}

}
