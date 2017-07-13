
public class exercise1 {

	public static void main(String[] args) {
		//计算100以内的奇数之和。
		int sum =0;
		for(int num=1;num<=100;num++){
			if(num%2!=0){
				sum = sum + num;
			}
		}
		
		System.out.println("100以内的奇数之和为：" + sum);		

	}

}
