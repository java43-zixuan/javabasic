import java.util.Scanner;

public class PhoneCard {
	
	String number;
	String name;
	int balance;
	int password;
	
	public void print(){
		/*int password = 000000;
		
		Scanner input = new Scanner(System.in);
		System.out.print("�������û�����");
		String name = input.next();
		System.out.print("���������룺");
		password = input.nextInt();
		while(true){
		if(password==000000){
		int balance = (int) (Math.random() * 100 + 1);
		System.out.print(name+",�˻����Ϊ��"+ balance);
		break;
		}else{
			System.out.print("������������������������룺");
			password = input.nextInt();
		}
		}*/
		System.out.print(name+"�Ŀ���Ϊ��"+number+",�˻����Ϊ��"+ balance+"Ԫ��");
	}
}
