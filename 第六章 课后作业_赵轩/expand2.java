import java.util.Scanner;

public class expand2 {

	public static void main(String[] args) {
		/* ����һ��������N���жϸ����ǲ�����������������������N��һ��
		���������������N��������������ʾ�������ĺ��壺����1����������
		���κ�����������ʹ��forѭ��ʵ�֣�
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("������һ��������N��");
		int N = input.nextInt();   //��������
		int count = 0;	//���������ۼ��ܱ������Ĵ���
		for(int i=1;i<=N;i++){
				if(N % i==0){
					count++;
				}
				else{
					count=count+0;
				}
			}
				if(count>2){
					System.out.println("N����������");
				
				}else{
					System.out.println("N��������");
				
				}	
				input.close();
	}

}
