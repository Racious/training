package practice3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;


public class ReadandOutPut {
	    // 讀取文件指定行。  
	    static String readAppointedLineNumber(File sourceFile, int lineNumber)  
	            throws IOException {  
	        FileReader in = new FileReader(sourceFile);  
	        LineNumberReader reader = new LineNumberReader(in);  
	        String s = "";  
	        int lines = 0;  
	        while (s != null) {  
	            lines++;  
	            s = reader.readLine();  
	            if((lines - lineNumber) == 0) {  
	             System.out.println(s);
	             return s;
	            }
	        }  
	        reader.close();  
	        in.close(); 
	        return s;
	    }  
	    
	     static void OutPut(String s) {
	    	 try {
	 			// 相對路徑，如果沒有則要建立一個新的output。txt檔案
	 			File writename = new File("src\\practice3\\Lotto_new.txt");
	 			// 建立新檔案
	 			writename.createNewFile();

	 			BufferedWriter out = new BufferedWriter(new FileWriter(writename));
	 				out.write(s + "\r\n"); // \r\n即為換行
	 			// 把快取區內容壓入檔案
	 			out.flush();
	 			// 關閉檔案
	 			out.close();
	 		} catch (Exception e) {
	 			e.printStackTrace();
	 		}
	     }
	      
	    /** 
	     * 讀取文件指定行。 
	     */  
	    public static void main(String[] args) throws IOException {  
	        // 指定讀取的行號  
	        int lineNumber ;  
	        Scanner scanner=new Scanner(System.in);
	        System.out.println("請問要查詢第幾筆資料?");
	        lineNumber=scanner.nextInt();
	        // 讀取文件  
	        File sourceFile = new File("src\\practice3\\Lotto.txt");  
	        // 讀取指定的行  
	        String s=readAppointedLineNumber(sourceFile, lineNumber);  
	        if (s==null) {
				System.out.println("不在文件的行數範圍(1至總行數)之內。");
			}else {
				OutPut(s);				
			}
	    } 
	  
}
