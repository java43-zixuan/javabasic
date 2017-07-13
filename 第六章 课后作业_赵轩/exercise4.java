import java.util.Scanner;

public class exercise4 {

	public static void main(String[] args) {
		// 用户登录验证，验证次数最多3次
		Scanner input = new Scanner(System.in);
		System.out.println("我行我素购物管理系统>用户登录");
		int counter = 3; //计数器，记录输入错误次数
		for (int i = 0; i <3; i++) {
			System.out.println("请输入用户名：");
			String userName = input.next();
			
			System.out.println("请输入密码：");
			String password = input.next();
			
			if(userName.equals("Jack") && password.equals("123456")){
				System.out.println("登陆成功，欢迎Jack使用我行我素购物管理系统！");
				break;//退出for循环
			}
			else{
				if(counter==1){
				System.out.println("对不起，您3次输入均有错误！");
				break;
				}
				System.out.println("用户名或密码输入均有误，您还有"+(--counter)+"次机会!\n");
				
				}
			}
			System.out.println("感谢使用我行我素购物管理系统！");
			input.close();
	}

}
