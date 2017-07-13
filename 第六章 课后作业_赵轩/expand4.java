
public class expand4 {

	public static void main(String[] args) {
		// 有一口井7米深，一只青蛙白天爬3米，晚上坠下2米。
		// 问这青蛙几天才能爬出这口井？
		int h = 0; //高度
		int count; //计数，累计天数
		for (count = 0; h <=7; count++) {
			h += 1;
		}
		System.out.println("这只青蛙"+ count + "天才能爬出这口井");
	}

}
