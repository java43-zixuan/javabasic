
public class Game {
	String name;
	String hp;
	String weapon;
	String atk;
	String petName;
	String petHp;
	String type;
	
	public void show(){
		System.out.println("我是英雄，我的基本信息如下："+"\n姓名："+name+",生命值："+hp+""
				+ "\n我的武器的基本信息如下："+"\n武器名："+weapon+",攻击力："+atk+"\n我的怪物的基本信息如下："
						+ "\n姓名："+petName+",生命值："+petHp+"，类型："+type);
	}
}
