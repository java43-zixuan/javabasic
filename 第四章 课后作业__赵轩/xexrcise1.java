import java.util.Scanner;

public class xexrcise1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("��ӭʹ���������ع������ϵͳ\n");
		System.out.println("\t1���� ½ ϵ ͳ\n ");
		System.out.println("\t2���� �� \n");
		System.out.println("*****************************\n");
		System.out.println("��ѡ���������֣�");
		int num = input.nextInt();
		switch(num){
			case 1:
				System.out.println("\t���˵�");
				System.out.println("1���ͻ���Ϣ����");
				System.out.println("2���������");
				System.out.println("3���������");
				System.out.println("4��ע��");
				System.out.println("��ѡ���������֣�");
				Scanner In = new Scanner(System.in);
				int Num = In.nextInt();
					switch(Num){
					case 1:
						System.out.println("�������ϵͳ>�ͻ���Ϣ����");
						System.out.println("\t1����ʾ���пͻ���Ϣ");
						System.out.println("\t2����ӿͻ���Ϣ");
						System.out.println("\t3���޸Ŀͻ���Ϣ");
						System.out.println("\t4����ѯ�ͻ���Ϣ");
						System.out.println("��ѡ���������֣�");
						break;
					case 3:
						System.out.println("�������ϵͳ>�������");
						System.out.println("\t1�����˴����");
						System.out.println("\t2�����˳齱");
						System.out.println("\t3�������ʺ�");
						break;
					default :
						break;
					
				}
				break;
			case 2:
				System.out.println("лл����ʹ�ã�");
				break;
			default :
				System.out.println("��������");
				break;
		}
		input.close();
	}

}
