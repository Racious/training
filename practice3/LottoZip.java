package practice3;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;


public class LottoZip {
	public static void main(String[] a){
		   File srcFile= new File("src\\practice3\\Lotto\\");
		   File targetZip=new File("src\\practice3\\Lotto.zip");
		  // File extractDir= new File("C:\\servlet2\\");
		   
		try {
			//壓縮
			new LottoZip().makeZip(srcFile, targetZip);
			//解壓縮
			//new LottoZip().unzipFile(targetZip, extractDir);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	/**
	 * 建立 zip 檔
	 * @param srcFile	想要壓縮的資料夾
	 * @param targetZip	壓縮zip檔
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	   public void makeZip(File srcFile, File targetZip)
	         throws IOException, FileNotFoundException
	   {      
		  ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(targetZip));
		  String dir="";
	      recurseFiles(srcFile,zos,dir);
	      zos.close();
	    }
	   
	   /**
	    * 壓縮 主程式
	    * @param file
	    * @param zos
	    * @throws IOException
	    * @throws FileNotFoundException
	    */
	   private void recurseFiles(File file, ZipOutputStream zos, String dir)
	      throws IOException, FileNotFoundException
	   {
		   //目錄
	      if (file.isDirectory()) {
	    	  System.out.println("找到資料夾:"+file.getName());
	    	  dir += file.getName()+File.separator;
	         String[] fileNames = file.list();
	         if (fileNames != null) {        	 
	            for (int i=0; i < fileNames.length ; i++)  {            	
	               recurseFiles(new File(file, fileNames[i]), zos,dir);
	            }
	         }
	      }
	      //Otherwise, a file so add it as an entry to the Zip file.
	      else {
	    	  System.out.println("壓縮檔案:"+file.getName());
	    	  
	         byte[] buf = new byte[1024];
	         int len;
	 
	         //Create a new Zip entry with the file's name.
	         dir = dir.substring(dir.indexOf(File.separator)+1);
	         ZipEntry zipEntry = new ZipEntry(dir+file.getName());
	         //Create a buffered input stream out of the file
	         //we're trying to add into the Zip archive.
	         FileInputStream fin = new FileInputStream(file);
	         BufferedInputStream in = new BufferedInputStream(fin);
	         zos.putNextEntry(zipEntry);
	         //Read bytes from the file and write into the Zip archive.
	 
	         while ((len = in.read(buf)) >= 0) {
	            zos.write(buf, 0, len);
	         }
	 
	         //Close the input stream.
	         in.close();
	 
	         //Close this entry in the Zip stream.
	         zos.closeEntry();
	      }
	   }
}

