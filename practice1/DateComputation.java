package practice1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateComputation {
	public static void main(String[] args) {
		Scanner req = new Scanner(System.in);
		String a;
		int b;
		System.out.println("請輸入日期，例2020-07-20");
		while (req.hasNext()) {
			a = req.nextLine();
			System.out.println("請輸入加上的天數");
			b = req.nextInt();
			DateComputation(a, b);
			return;
		}
		req.close();
	}

	public static Date DateComputation(String date, int dateNum) {
		Date date2;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			date2 = sdf.parse(date);
			System.out.println(date2);
			long day = dateNum * 24 * 60 * 60 * 1000l;
			long time = date2.getTime();
			time += day;
			date2.setTime(time);
			System.out.println(date2);

		} catch (ParseException e) {
			System.out.println("您輸入的格式有錯");
			e.printStackTrace();
		}
		return null;
	}
}
