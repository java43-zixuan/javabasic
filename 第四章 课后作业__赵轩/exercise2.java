import java.util.Scanner;

public class exercise2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("���������ѽ�");
		int sum = input.nextInt();
			System.out.println("�Ƿ�μ��Żݻ����:");
			System.out.println("1����50Ԫ����2Ԫ�������¿�������1ƿ");
			System.out.println("2����100Ԫ����3Ԫ����500mL����1ƿ");
			System.out.println("3����100Ԫ����10Ԫ����5Kg���");
			System.out.println("4����200Ԫ����10Ԫ�ɻ���1���ղ������˹�");
			System.out.println("5����200Ԫ����20Ԫ�ɻ���ŷ����ˬ��ˮһƿ");
			System.out.println("0:������");
			System.out.println("��ѡ��");
		int num = input.nextInt();
		double finalNum;
		if(sum >= 50){
			switch(num){ 
				case 1:
					finalNum = sum + 2;
					System.out.println("���������ܽ�" + finalNum);
					System.out.println("�ɹ����������¿�������1ƿ��");
					break;
				case 2:
					finalNum = sum + 3;
					System.out.println("���������ܽ�" + finalNum);
					System.out.println("�ɹ�������500mL����1ƿ��");
					break;
				case 3:
					finalNum = sum + 10;
					System.out.println("���������ܽ�" + finalNum);
					System.out.println("�ɹ�������5Kg��ۡ�");
					break;
				case 4:
					finalNum = sum + 10;
					System.out.println("���������ܽ�" + finalNum);
					System.out.println("�ɹ�������1���ղ������˹���");
					break;
				case 5:
					finalNum = sum + 20;
					System.out.println("���������ܽ�" + finalNum);
					System.out.println("�ɹ�������ŷ����ˬ��ˮһƿ��");
					break;
				case 6:
					finalNum = sum + 2;
					System.out.println("���������ܽ�" + sum);
					System.out.println("���μӻ�����");
					break;
				}
			}
			else{
				System.out.println("�Բ����������ѽ����Խ��л�����");
				System.out.println("���������ܽ��Ϊ��" + sum);	
				}
		input.close();		
		}
	
}
