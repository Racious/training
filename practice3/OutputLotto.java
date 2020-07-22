package practice3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

public class OutputLotto {
	public static void main(String[] args) {
		try {
			/* 寫入txt檔案 */
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
			// 相對路徑，如果沒有則要建立一個新的output。txt檔案
			File writename = new File("src\\practice3\\Lotto.txt");
			// 建立新檔案
			writename.createNewFile();

			BufferedWriter out = new BufferedWriter(new FileWriter(writename));
			for (int i = 0; i < list.size(); i++) {
				out.write(list.get(i).toString() + "\r\n"); // \r\n即為換行
			}
			// 把快取區內容壓入檔案
			out.flush();
			// 關閉檔案
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
//// 防止檔案建立或讀取失敗，用catch捕捉錯誤並列印，也可以throw
///* 讀入TXT檔案 */
//String pathname = "D:\\JAVA\\富邦培訓\\Java\\src\\practice3\\Lotto.txt"; // 絕對路徑或相對路徑都可以，這裡是絕對路徑，寫入檔案時演示相對路徑
//File filename = new File(pathname); // 要讀取以上路徑的input。txt檔案
//InputStreamReader reader = new InputStreamReader(new FileInputStream(filename)); // 建立一個輸入流物件reader
//BufferedReader br = new BufferedReader(reader); // 建立一個物件，它把檔案內容轉成計算機能讀懂的語言
//String line = "";
//line = br.readLine();
//while (line != null) {
//	line = br.readLine(); // 一次讀入一行資料
//}