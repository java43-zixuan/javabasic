import java.util.Scanner;

public class Admin04 {
	
	String name = "admin";
	String code = "111111";
	public void show(){
		Scanner input = new Scanner(System.in); 
		System.out.print("�������û�����");
		String name = input.next();
		System.out.print("���������룺");
		String code = input.next();
		if(name.equals("admin")&& code.equals("111111")){
			System.out.print("�����������룺");
			code = input.next();
			System.out.println("�޸�����ɹ�������������Ϊ��"+code);
		}else{
			System.out.println("�û��������벻ƥ�䣡��û��Ȩ�޸��¹�����Ϣ��");
		}
		

	}
	
}
