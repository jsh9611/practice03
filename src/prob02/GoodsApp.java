package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];

		for (int i = 0; i < COUNT_GOODS; i++) {
			String name = scanner.next();
			int price = scanner.nextInt();
			int countStock = scanner.nextInt();
			goods[i] = new Goods(name, price, countStock);
		}

		for (int i = 0; i < COUNT_GOODS; i++) {

			System.out.println(goods[i].name + "(가격:" + goods[i].price + "원)이 " + goods[i].countStock + "개 입고 되었습니다.");
		}
		// 자원정리
		scanner.close();
	}
}
