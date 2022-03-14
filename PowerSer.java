
public class PowerSer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ch = "abc";
		int ch_size = ch.length();
		
		for(int i=0;i<Math.pow(2,ch_size);i++) {
			if(i==0) {
				System.out.println(" ");
				continue;
			}
			
			int temp =i,index=0;
			
			/* while(temp>0) {
				if(temp%2 !=0) {
					System.out.print(ch.charAt(index));
				}
				temp=temp/2;
				index++;
				
			} */
			
			for(int j=0;j<ch_size;j++) {
				if((i & (1<<j)) != 0) {
					System.out.print(ch.charAt(j));
					
				}
			}
			
			System.out.println();
			
			
			int a=0, b=1;
			
			while(a != b) {
				System.out.println("value");
			}
			
		}
		

	}

}
