package practice1;


public class DrawStars {
	public static void main(String[] args) {
		//設定星星最大數層
		int floor =5 ;
		// (1)
		for (int i = 1; i <= floor; i++) {
			for (int j = 1; j <= floor; j++) {
				if (i >= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();

		// (2)
		for (int i = 1; i <= floor; i++) {
			for (int j = floor; j >= 1; j--) {
				if (j > i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();

		// (3)
		for (int i = 1; i <= floor; i++) {
			for (int j = floor; j >= 1; j--) {
				if (j >= i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();

		// (4)
		for (int i = 1; i <= floor; i++) {
			for (int j = 1; j <= floor; j++) {
				if (i <= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();

		// (5)
		for (int i = 1; i <= floor; i++) {
			for (int j = floor; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();

		//(6)
		// 拆成兩個三角形依序繪出
		for (int i = 1; i <= floor; i++) {
			for (int j = floor; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// 倒過來的三角形
		for (int x = floor - 1; x >= 1; x--) {
			for (int y = floor; y > x; y--) {
				System.out.print(" ");
			}
			for (int y = 1; y <= x; y++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
