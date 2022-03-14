
public class SecondLargest {
	
	public static int getLargest(int[] arr) {
			int result = 0;
			int n = arr.length;
			for(int i=1;i<n;i++) {
				if(arr[i]>arr[result]) {
					result = i;
				}
			}
		
		
		return result;
	}
	
	public static int getsecondLargest(int[] arr) {
		int largest = SecondLargest.getLargest(arr);
		System.out.println(largest);
		int result = -1;
		int n = arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i]!=arr[largest]) {
				if(result==-1) {
					result=i;
				}
				else if(arr[i]>arr[result]) {
					result=i;
				}
			}
		}
	return result;
}
	
	

	public static void main(String[] args) {
		
		int[] arr= {10,20,20};
		System.out.println(SecondLargest.getsecondLargest(arr));
		
	}
}
