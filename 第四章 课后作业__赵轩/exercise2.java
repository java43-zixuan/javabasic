import java.util.Scanner;

public class exercise2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入消费金额：");
		int sum = input.nextInt();
			System.out.println("是否参加优惠换购活动:");
			System.out.println("1：满50元，加2元换购百事可乐饮料1瓶");
			System.out.println("2：满100元，加3元换购500mL可乐1瓶");
			System.out.println("3：满100元，加10元换购5Kg面粉");
			System.out.println("4：满200元，加10元可换购1个苏泊尔炒菜锅");
			System.out.println("5：满200元，加20元可换购欧莱雅爽肤水一瓶");
			System.out.println("0:不换购");
			System.out.println("请选择：");
		int num = input.nextInt();
		double finalNum;
		if(sum >= 50){
			switch(num){ 
				case 1:
					finalNum = sum + 2;
					System.out.println("本次消费总金额：" + finalNum);
					System.out.println("成功换购：百事可乐饮料1瓶。");
					break;
				case 2:
					finalNum = sum + 3;
					System.out.println("本次消费总金额：" + finalNum);
					System.out.println("成功换购：500mL可乐1瓶。");
					break;
				case 3:
					finalNum = sum + 10;
					System.out.println("本次消费总金额：" + finalNum);
					System.out.println("成功换购：5Kg面粉。");
					break;
				case 4:
					finalNum = sum + 10;
					System.out.println("本次消费总金额：" + finalNum);
					System.out.println("成功换购：1个苏泊尔炒菜锅。");
					break;
				case 5:
					finalNum = sum + 20;
					System.out.println("本次消费总金额：" + finalNum);
					System.out.println("成功换购：欧莱雅爽肤水一瓶。");
					break;
				case 6:
					finalNum = sum + 2;
					System.out.println("本次消费总金额：" + sum);
					System.out.println("不参加换购。");
					break;
				}
			}
			else{
				System.out.println("对不起，您的消费金额不足以进行换购。");
				System.out.println("本次消费总金额为：" + sum);	
				}
		input.close();		
		}
	
}
