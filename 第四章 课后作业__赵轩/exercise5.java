import java.util.Scanner;

public class exercise5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("��������е��·ݣ�");
		int month = input.nextInt();
		System.out.println("������ѡ��ͷ�Ȳջ��Ǿ��òգ�ͷ�Ȳ�����1�����ò�����2��");
		int freightSpace = input.nextInt();
		switch(month){
			case 1:
			case 2:
			case 3:
			case 11:
			case 12:
				switch(freightSpace){
					case 1:
						System.out.println("���Ļ�Ʊ�۸�Ϊ��" + 5000*0.5);
						break;
					case 2:
						System.out.println("���Ļ�Ʊ�۸�Ϊ��" + 5000*0.4);
						break;
				}
			break;
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
				switch(freightSpace){
				case 1:
					System.out.println("���Ļ�Ʊ�۸�Ϊ��" + 5000*0.9);
					break;
				case 2:
					System.out.println("���Ļ�Ʊ�۸�Ϊ��" + 5000*0.8);
					break;
			}
			break;
			default :
				System.out.println("�����������������롣");
				break;
		}
		input.close();
	}

}
