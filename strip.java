public class Tedtee {
	public static void main(String[] args) {
		
		String name = "A-B-C-D-E-F-G-H-I-J-K-L-M-N-O-P-Q-R-S-T-U-V-W-X-Y-Z";
		
		int i;
		
		System.out.println(name.length());
		
		for(i=0;i<=name.length()-1;i++){
			if(i%2==0){
				System.out.print(name.charAt(i));
			}
			
			
		}
		
	}

}
