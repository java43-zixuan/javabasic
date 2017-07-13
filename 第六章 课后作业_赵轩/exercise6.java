
public class exercise6 {

	public static void main(String[] args) {
		int chookNum , rabbitNum ;
		for (chookNum = 0; chookNum < 35; chookNum++) {
			rabbitNum = 35 - chookNum;
			if(rabbitNum*4 + chookNum*2 ==94 ){
				System.out.println("鸡有"+chookNum+"只；兔子有"+rabbitNum+"只");
			}
			
		}

	}

}
