
public class expand3 {

	public static void main(String[] args) {
		// ����2+22+222+2222+......��ǰ8���Ƕ��٣�
		int num = 0;   //��ʼ���ڼ������ı���
		int sum = 0;  //��ʼ���͵ı���
		for(int i=0;i<8;i++){
			num = num*10+2;
			sum += num;
		}
		System.out.println("2+22+222+2222+...��ǰ8��=" + sum);
	}

}
