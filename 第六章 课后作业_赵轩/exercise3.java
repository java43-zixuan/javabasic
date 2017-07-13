import java.util.Scanner;

public class exercise3 {

	public static void main(String[] args) {
		System.out.println("MyShopping管理系统>客户信息管理>添加客户信息");
		Scanner input = new Scanner(System.in);
		int num;
		String birthday;
		int integral;
		for (int i = 0; i < 3; i++) {
			System.out.print("请输入会员号(<4位整数>)：");
			num = input.nextInt(); //会员号
			System.out.print("请输入会员生日(月/日<用两位整数表示>)：");
			birthday = input.next(); //生日
			System.out.print("请输入会员积分：");
			integral = input.nextInt(); //积分
			if(num<1000 ||num>9999){    //会员号无效则退出
				System.out.println("客户号"+ num +"是无效会员号");
				System.out.println("录入信息失败！");
				continue;
			}
			System.out.println("您录入的会员信息是：" + num    +"\t"+ birthday +"\t"+ integral );
		}
		System.out.println("程序结束！");
		input.close();
	}

}
