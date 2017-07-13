import java.util.Scanner;

public class expand2 {

	public static void main(String[] args) {
		/* 输入一个正整数N，判断该数是不是质数，如果是质数输出“N是一个
		质数，否则输出“N不是质数”。提示：质数的含义：除了1和它本身不能
		被任何数整除。（使用for循环实现）
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个正整数N：");
		int N = input.nextInt();   //输入整数
		int count = 0;	//计数器：累计能被整除的次数
		for(int i=1;i<=N;i++){
				if(N % i==0){
					count++;
				}
				else{
					count=count+0;
				}
			}
				if(count>2){
					System.out.println("N不是质数。");
				
				}else{
					System.out.println("N是质数。");
				
				}	
				input.close();
	}

}
