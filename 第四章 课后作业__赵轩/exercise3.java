import java.util.Scanner;

public class exercise3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("���������ڼ�:");
		String week = input.next();
		switch(week){
			case "����һ":
			case "������":
			case "������":
				System.out.println("ѧϰ���");
				break;
			case "���ڶ�":
			case "������":
			case "������":
				System.out.println("ѧϰӢ��");
				break;
			case "������":
				System.out.println("��Ϣ");
				break;
			default :
				System.out.println("������������������");
				break;
		}
				input.close();

	}

}
