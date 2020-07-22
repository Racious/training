package practice3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class FileTest {
	
	public static void main(String[] args) {
		
		File writename = new File("");
		try (BufferedWriter out = new BufferedWriter(new FileWriter(writename));) {

	

			// 把快取區內容壓入檔案
			out.flush();
			// 關閉檔案

			System.out.println("成功輸出資料");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		
		}
	}
	
	public static void main1(String[] args) {
		BufferedWriter out = null;
		try {

			File writename = new File("");
	
			out = new BufferedWriter(new FileWriter(writename));

			// 把快取區內容壓入檔案
			out.flush();
			// 關閉檔案

			System.out.println("成功輸出資料");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if(out != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
