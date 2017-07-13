
public class exercise7 {

	public static void main(String[] args) {
		int i = 1;
		for (; i <=100; i++) {
			if(i%3==0 && i%5==0){
				System.out.println("FlipFlop");
				continue;
			}
			else{
				if(i%3==0){
				System.out.println("Flip");
				continue;
				}
				if(i%5==0){
				System.out.println("Flop");
				continue;
				}
			}
			System.out.println(i);
		}//end  forÑ­»·
	}

}
