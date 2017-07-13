
public class expand3 {

	public static void main(String[] args) {
		// 计算2+22+222+2222+......的前8项是多少？
		int num = 0;   //初始化第几个数的变量
		int sum = 0;  //初始化和的变量
		for(int i=0;i<8;i++){
			num = num*10+2;
			sum += num;
		}
		System.out.println("2+22+222+2222+...的前8项=" + sum);
	}

}
