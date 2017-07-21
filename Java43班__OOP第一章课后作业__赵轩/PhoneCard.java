import java.util.Scanner;

public class PhoneCard {
	
	String number;
	String name;
	int balance;
	int password;
	
	public void print(){
		/*int password = 000000;
		
		Scanner input = new Scanner(System.in);
		System.out.print("请输入用户名：");
		String name = input.next();
		System.out.print("请输入密码：");
		password = input.nextInt();
		while(true){
		if(password==000000){
		int balance = (int) (Math.random() * 100 + 1);
		System.out.print(name+",账户余额为："+ balance);
		break;
		}else{
			System.out.print("您输入的密码有误！请重新输入：");
			password = input.nextInt();
		}
		}*/
		System.out.print(name+"的卡号为："+number+",账户余额为："+ balance+"元。");
	}
}
