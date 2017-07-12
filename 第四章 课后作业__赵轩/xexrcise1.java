import java.util.Scanner;

public class xexrcise1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("欢迎使用我行我素购物管理系统\n");
		System.out.println("\t1、登 陆 系 统\n ");
		System.out.println("\t2、退 出 \n");
		System.out.println("*****************************\n");
		System.out.println("请选择，输入数字：");
		int num = input.nextInt();
		switch(num){
			case 1:
				System.out.println("\t主菜单");
				System.out.println("1、客户信息管理");
				System.out.println("2、购物结算");
				System.out.println("3、真情回馈");
				System.out.println("4、注销");
				System.out.println("请选择，输入数字：");
				Scanner In = new Scanner(System.in);
				int Num = In.nextInt();
					switch(Num){
					case 1:
						System.out.println("购物管理系统>客户信息管理");
						System.out.println("\t1、显示所有客户信息");
						System.out.println("\t2、添加客户信息");
						System.out.println("\t3、修改客户信息");
						System.out.println("\t4、查询客户信息");
						System.out.println("请选择，输入数字：");
						break;
					case 3:
						System.out.println("购物管理系统>真情回馈");
						System.out.println("\t1、幸运大放送");
						System.out.println("\t2、幸运抽奖");
						System.out.println("\t3、生日问候");
						break;
					default :
						break;
					
				}
				break;
			case 2:
				System.out.println("谢谢您的使用！");
				break;
			default :
				System.out.println("输入有误。");
				break;
		}
		input.close();
	}

}
