package practice1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
			DateAdd(a, b);
			req.close();
			return;
		}
		req.close();
	}
	/**
	 * 日期相加
	 * @param date 指定日期
	 * @param dateNum 指定天數
	 * @return
	 */
	public static Date DateAdd(String date, int dateNum) {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			calendar.setTime(sdf.parse(date));
			System.out.println(calendar.getTime());
			calendar.add(Calendar.DAY_OF_MONTH, dateNum);
			System.out.println(calendar.getTime());

		} catch (ParseException e) {
			System.out.println("您輸入的格式有錯");
			e.printStackTrace();
		}
		return null;
	}
}
