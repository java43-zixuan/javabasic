
public class TestUser {

	public static void main(String[] args) {
		User one = new User();
		
		one.nickName = "Lucy";
		one.age = 21;
		one.gender = 'Ů';
		one.level = "�޵�С����";
		one.regDate = "2011-01-08";
		
		one.showInfo();
		System.out.println("===========================");
		
		one.nickName = "Mary";
		one.age = 28;
		one.gender = 'Ů';
		one.level = "�����Ƕ���";
		one.regDate = "2000-01-01";
		
		one.showInfo();
		
		
		
		

	}

}
