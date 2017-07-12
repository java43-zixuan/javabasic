import java.util.Scanner;

public class execise6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		double num1 = input.nextDouble();
		System.out.println("请输入：+ - * /");
		char opr = input.next().charAt(0);
		System.out.println("请输入第二个数：");
		double num2 = input.nextDouble();
		double result = 0.0; 
		switch(opr){
			case '+':
				result = num1 + num2;
				System.out.printf("计算结果： %.2f %c %.2f = %.2f\n " , num1 , opr , num2 , result);
				break;
			case '-':
				result = num1 - num2;
				System.out.printf("计算结果： %.2f %c %.2f = %.2f\n " , num1 , opr , num2 , result);
				break;	
			case '*':
				result = num1 * num2;
				System.out.printf("计算结果： %.2f %c %.2f = %.2f\n " , num1 , opr , num2 , result);
				break;	
			case '/':
				result = num1 / num2;
				if(num2 == 0){
					System.out.println("除数不能为0，请重新输入：");
				}else{
					System.out.printf("计算结果： %.2f %c %.2f = %.2f\n " , num1 , opr , num2 , result);
				}
				break;
		}
			input.close();

	}

}
