
public class User {
	
	String nickName ;
	int password;
	char gender;
	int age;
	String regDate;
	String level;
	
	public void showInfo(){
		System.out.println("��Һã�����"+nickName+",����"
				+age+ "��\n����"+regDate+"ע��ģ�Ŀǰ�ȼ��ǣ�"
				+ level);
	}
	
}
