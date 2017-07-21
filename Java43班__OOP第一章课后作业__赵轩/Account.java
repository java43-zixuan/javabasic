import java.util.Scanner;

public class Account {

	String account;
	String name;
	String openDate;
	String idCard;
	int balance;
	Scanner input = new Scanner(System.in);
	public void show(){
		System.out.println("欢迎使用**银行");
		System.out.println("1、存款\n2、取款\n3、查询");
		System.out.println("请选择业务序号：");
		int choice = input.nextInt();
		while(true){
			/*switch(choice){
			case 1:
				System.out.println("请输入存款金额：");
				int deposit = input.nextInt();
				break;
			case 2:
				System.out.println("请输入取款金额：");
				int embody = input.nextInt();
				break;
			case 3:
				System.out.println("您的账户余额为：");
				int balance = (int) (Math.random() * 100 + 1);
				break;
			default :
					System.out.println("您输入的选择有误，请重新输入：");
					choice = input.nextInt();
			}*/
			
			if(choice==1){
				System.out.println("请输入存款金额：");
				int deposit = input.nextInt();
				break;
			}else if(choice==2){
				System.out.println("请输入取款金额：");
				int embody = input.nextInt();
				break;
			}else if(choice==3){
				System.out.println("您的账户余额为：");
				int balance = (int) (Math.random() * 100 + 1);
				break;
			}else{
				System.out.println("您输入的选择有误，请重新输入：");
				choice = input.nextInt();
			}
			
		}
		
	}
	
}
