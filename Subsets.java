
public class Subsets {
	
	public static void psubsets(int[] arr,String curr,int index) {
		if(index==arr.length) {
			System.out.println(curr);
			return;
		}
		
		psubsets(arr,curr,index+1);
		psubsets(arr,curr+arr[index],index+1);
	}
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,3};

		
		Subsets.psubsets(arr," ",0);
		
	}

}
