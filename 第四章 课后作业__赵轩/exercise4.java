import java.util.Scanner;

public class exercise4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������Java�ɼ���");
		int score = input.nextInt();
		int score1 = score / 10;
		switch(score1){
			case 10:
				System.out.println("���׸�����������");
				break;
			case 9:
				System.out.println("ĸ�׸�����һ���ʼǱ����ԡ�");	
				break;
			case 8:
			case 7:	
			case 6:
				System.out.println("ĸ�׸�����һ���ֻ���");
				break;
			default :
				System.out.println("û�����");
				break;
			
		}
		input.close();

	}

}
