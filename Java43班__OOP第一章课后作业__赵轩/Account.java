import java.util.Scanner;

public class Account {

	String account;
	String name;
	String openDate;
	String idCard;
	int balance;
	Scanner input = new Scanner(System.in);
	public void show(){
		System.out.println("��ӭʹ��**����");
		System.out.println("1�����\n2��ȡ��\n3����ѯ");
		System.out.println("��ѡ��ҵ����ţ�");
		int choice = input.nextInt();
		while(true){
			/*switch(choice){
			case 1:
				System.out.println("���������");
				int deposit = input.nextInt();
				break;
			case 2:
				System.out.println("������ȡ���");
				int embody = input.nextInt();
				break;
			case 3:
				System.out.println("�����˻����Ϊ��");
				int balance = (int) (Math.random() * 100 + 1);
				break;
			default :
					System.out.println("�������ѡ���������������룺");
					choice = input.nextInt();
			}*/
			
			if(choice==1){
				System.out.println("���������");
				int deposit = input.nextInt();
				break;
			}else if(choice==2){
				System.out.println("������ȡ���");
				int embody = input.nextInt();
				break;
			}else if(choice==3){
				System.out.println("�����˻����Ϊ��");
				int balance = (int) (Math.random() * 100 + 1);
				break;
			}else{
				System.out.println("�������ѡ���������������룺");
				choice = input.nextInt();
			}
			
		}
		
	}
	
}
