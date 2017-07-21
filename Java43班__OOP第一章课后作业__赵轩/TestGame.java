
public class TestGame {

	public static void main(String[] args) {
		Game game = new Game();
		game.atk = "12";
		game.hp = "300";
		game.name = "李小侠";
		game.petHp = "300";
		game.petName ="小龟";
		game.type = "潜水类";
		game.weapon = "死神镰刀";
		
		game.show();
	}

}
