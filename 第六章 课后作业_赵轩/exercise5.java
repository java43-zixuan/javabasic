import java.util.Scanner;

public class exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum =0.0;
		double mean = 0.0;
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {		
		System.out.println("��������"+(i+1)+"��ѧϰʱ�䣺" );
		double time = input.nextDouble();
		sum +=time;
		}
		mean = sum / 5 ;
		System.out.println("��һ������ÿ��ƽ��ѧϰʱ���ǣ�" + mean +"Сʱ");
		input.close();
	}

}
