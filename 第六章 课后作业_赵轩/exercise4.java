import java.util.Scanner;

public class exercise4 {

	public static void main(String[] args) {
		// �û���¼��֤����֤�������3��
		Scanner input = new Scanner(System.in);
		System.out.println("�������ع������ϵͳ>�û���¼");
		int counter = 3; //����������¼����������
		for (int i = 0; i <3; i++) {
			System.out.println("�������û�����");
			String userName = input.next();
			
			System.out.println("���������룺");
			String password = input.next();
			
			if(userName.equals("Jack") && password.equals("123456")){
				System.out.println("��½�ɹ�����ӭJackʹ���������ع������ϵͳ��");
				break;//�˳�forѭ��
			}
			else{
				if(counter==1){
				System.out.println("�Բ�����3��������д���");
				break;
				}
				System.out.println("�û������������������������"+(--counter)+"�λ���!\n");
				
				}
			}
			System.out.println("��лʹ���������ع������ϵͳ��");
			input.close();
	}

}
