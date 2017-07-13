import java.util.Scanner;

public class exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum =0.0;
		double mean = 0.0;
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {		
		System.out.println("请输入周"+(i+1)+"的学习时间：" );
		double time = input.nextDouble();
		sum +=time;
		}
		mean = sum / 5 ;
		System.out.println("周一至周五每日平均学习时间是：" + mean +"小时");
		input.close();
	}

}
