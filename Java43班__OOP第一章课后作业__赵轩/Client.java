import java.util.Scanner;

public class Client {
	
	int integral;
	String genre;
	
	public void show(){
		Scanner input = new Scanner(System.in);
		System.out.print("���֣�");
		int integral = input.nextInt();
		System.out.print("�����ͣ�");
		genre = input.next();
		if(integral > 1000 && genre.equals("��")){
			System.out.print("��������500�֣�");
		}else if(integral > 5000 && genre.equals("��ͨ��")){
			System.out.print("��������500�֣�");
		}else{
			System.out.println("���Ŀ��ͻ��߻��ֲ������������");
		}
		
	}	
}
