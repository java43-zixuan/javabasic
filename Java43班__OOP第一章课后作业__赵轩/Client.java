import java.util.Scanner;

public class Client {
	
	int integral;
	String genre;
	
	public void show(){
		Scanner input = new Scanner(System.in);
		System.out.print("积分：");
		int integral = input.nextInt();
		System.out.print("卡类型：");
		genre = input.next();
		if(integral > 1000 && genre.equals("金卡")){
			System.out.print("回馈积分500分！");
		}else if(integral > 5000 && genre.equals("普通卡")){
			System.out.print("回馈积分500分！");
		}else{
			System.out.println("您的卡型或者积分不满足回馈条件");
		}
		
	}	
}
