
public class TestAdmin {

	public static void main(String[] args) {
		Admin num = new Admin();
		
		num.name = "admin1";
		num.password = "111111";
		
		num.show();
		
		num.name = "admin2";
		num.password = "222222";
		
		num.show();
	}

}
