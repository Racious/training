package practice3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

public class LottoOutput20 {
	
	static List<TreeSet<String>> LottoCreat(){
		List<TreeSet<String>> list = new ArrayList<TreeSet<String>>();
		Random random = new Random();
		String s;
		// 紀錄100組樂透號碼
		while (list.size() < 100) {
			// 記錄每一組的6個樂透號碼
			TreeSet<String> set = new TreeSet<String>();
			while (set.size() < 6) {
				// 產生亂數
				int x = random.nextInt(49) + 1;
				// 格式化
				DecimalFormat g1 = new DecimalFormat("00");
				// 轉字串
				s = g1.format(Integer.valueOf(x));
				// 加入set中
				set.add(s);
			}
			// 將這組樂透號碼加到list
			list.add(set);
		}
		return list;
	}
	
	public static void main(String[] args) {
		try {
			for (int i = 1; i <= 20; i++) {
				List<TreeSet<String>> list =LottoCreat();
				DecimalFormat g1 = new DecimalFormat("00");
				// 相對路徑，如果沒有則要建立一個新的output。txt檔案
				File writename = new File("src\\practice3\\Lotto\\Lotto_"+g1.format(i)+".txt");
			// 建立新檔案
			writename.createNewFile();
			BufferedWriter out = new BufferedWriter(new FileWriter(writename));
			for (int j = 0; j < list.size(); j++) {
				out.write(list.get(j).toString() + "\r\n"); // \r\n即為換行
			}
			// 把快取區內容壓入檔案
			out.flush();
			// 關閉檔案
			out.close();
			}
			System.out.println("成功輸出資料");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
