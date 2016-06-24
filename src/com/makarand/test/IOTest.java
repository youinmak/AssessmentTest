package com.makarand.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest {

	public static void main(String[] args) throws IOException {

		String path = "D:\\OLD\\MyDATA\\Photos\\Old";

		File file = new File(path);
		File newFile = new File(path, "newfile.jpg");
		File[] listFiles = file.listFiles();
		//file.delete();
		for (File file2 : listFiles) {
			System.out.println(file2.getName());
			try (FileInputStream fis = new FileInputStream(file2);
					BufferedInputStream bis = new BufferedInputStream(fis);
					FileOutputStream fos = new FileOutputStream(newFile);
					BufferedOutputStream bos = new BufferedOutputStream(fos)) {
				while(bis.read() !=-1){
					bos.write(bis.read());
				}
				bos.flush();
				//if(file2.getName().contains("2016")){
					//file2.delete();
				//}
				
				/*int read = bis.read();
				bos.write(read);
				bos.flush();*/
				//System.out.println(read);
			}
		}
	}
}
