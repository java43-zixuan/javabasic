import java.util.Scanner;

public class exercise3 {

	public static void main(String[] args) {
		System.out.println("MyShopping����ϵͳ>�ͻ���Ϣ����>��ӿͻ���Ϣ");
		Scanner input = new Scanner(System.in);
		int num;
		String birthday;
		int integral;
		for (int i = 0; i < 3; i++) {
			System.out.print("�������Ա��(<4λ����>)��");
			num = input.nextInt(); //��Ա��
			System.out.print("�������Ա����(��/��<����λ������ʾ>)��");
			birthday = input.next(); //����
			System.out.print("�������Ա���֣�");
			integral = input.nextInt(); //����
			if(num<1000 ||num>9999){    //��Ա����Ч���˳�
				System.out.println("�ͻ���"+ num +"����Ч��Ա��");
				System.out.println("¼����Ϣʧ�ܣ�");
				continue;
			}
			System.out.println("��¼��Ļ�Ա��Ϣ�ǣ�" + num    +"\t"+ birthday +"\t"+ integral );
		}
		System.out.println("���������");
		input.close();
	}

}
