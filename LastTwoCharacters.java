
public class LastTwoCharacters {
	
	public static String charcters(String word) {
		String result="";
		char last=word.charAt(word.length() - 1);
		char second=word.charAt(word.length() - 2);
		result= last+" "+second;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "APPLE";
		System.out.println(LastTwoCharacters.charcters(word));
		
		int[] arr = {1,1,2,2,3};
		int b=1;
		
		for(int j=0;j<arr.length;j++){
			if(b==arr[j]){
				b=b*2;
			}
			
			else{
				continue;
			}
		}

		System.out.println(b);
	
	}

}
