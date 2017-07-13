
public class exercise8 {

	public static void main(String[] args) {
		int men,women,kids;
		for(men=0;men<10;men++){
			for(women=0;women<15;women++){
				kids=30-men-women;
				if(men*3+women*2+kids*1==50){
				System.out.println("男人："+men+"人\t"+"女人："+women+"人\t"+"小孩="+kids+"人");
			}
			}
			
		}
		
		
		

	}

}
