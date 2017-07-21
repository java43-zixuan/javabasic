
public class User {
	
	String nickName ;
	int password;
	char gender;
	int age;
	String regDate;
	String level;
	
	public void showInfo(){
		System.out.println("大家好！我是"+nickName+",今年"
				+age+ "岁\n我是"+regDate+"注册的，目前等级是："
				+ level);
	}
	
}
