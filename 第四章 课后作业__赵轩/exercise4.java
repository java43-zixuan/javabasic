import java.util.Scanner;

public class exercise4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入Java成绩：");
		int score = input.nextInt();
		int score1 = score / 10;
		switch(score1){
			case 10:
				System.out.println("父亲给她买辆车。");
				break;
			case 9:
				System.out.println("母亲给她买一部笔记本电脑。");	
				break;
			case 8:
			case 7:	
			case 6:
				System.out.println("母亲给她买一部手机。");
				break;
			default :
				System.out.println("没有礼物。");
				break;
			
		}
		input.close();

	}

}
