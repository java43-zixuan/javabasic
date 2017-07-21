
public class TestUser {

	public static void main(String[] args) {
		User one = new User();
		
		one.nickName = "Lucy";
		one.age = 21;
		one.gender = '女';
		one.level = "无敌小菜鸟";
		one.regDate = "2011-01-08";
		
		one.showInfo();
		System.out.println("===========================");
		
		one.nickName = "Mary";
		one.age = 28;
		one.gender = '女';
		one.level = "超级智多星";
		one.regDate = "2000-01-01";
		
		one.showInfo();
		
		
		
		

	}

}
