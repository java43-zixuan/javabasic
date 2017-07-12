import java.util.Scanner;

public class exercise3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入星期几:");
		String week = input.next();
		switch(week){
			case "星期一":
			case "星期三":
			case "星期五":
				System.out.println("学习编程");
				break;
			case "星期二":
			case "星期四":
			case "星期六":
				System.out.println("学习英语");
				break;
			case "星期日":
				System.out.println("休息");
				break;
			default :
				System.out.println("输入有误，请重新输入");
				break;
		}
				input.close();

	}

}
