import java.util.Scanner;

public class Admin04 {
	
	String name = "admin";
	String code = "111111";
	public void show(){
		Scanner input = new Scanner(System.in); 
		System.out.print("请输入用户名：");
		String name = input.next();
		System.out.print("请输入密码：");
		String code = input.next();
		if(name.equals("admin")&& code.equals("111111")){
			System.out.print("请输入新密码：");
			code = input.next();
			System.out.println("修改密码成功，您的新密码为："+code);
		}else{
			System.out.println("用户名和密码不匹配！您没有权限更新管理信息。");
		}
		

	}
	
}
