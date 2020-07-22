package practice3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CopyLotto {
	public static void main(String[] args) {
		final String INPUT_FILE_PATH = "src\\practice3\\Lotto.txt"; // 被複製的檔案路徑及檔名
		final String OUTPUT_FILE_PATH = "src\\Lotto_20200721.txt"; // 已複製的檔案路徑及檔名

		try ( 
		        FileOutputStream fos = new FileOutputStream(new File(OUTPUT_FILE_PATH))
		) {
		    Path inputPath = new File(INPUT_FILE_PATH).toPath();
		    Files.copy(inputPath, fos);
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}
}
