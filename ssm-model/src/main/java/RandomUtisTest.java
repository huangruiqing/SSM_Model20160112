import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.RandomStringUtils;


public class RandomUtisTest {

	
	public static void main(String[] args) {
		
		/*String i = RandomStringUtils.random(4);// 中文会乱码
		System.out.println("i: "+i);
		//String i2 = RandomStringUtils.random(2, 'a','b','c');
		String i2 = RandomStringUtils.random(3, new char[]{'a','b','c'});
		System.out.println("i2: "+i2);
		String i3 = RandomStringUtils.random(2, "abcd");
		System.out.println("i3: "+i3);
		String i4 = RandomStringUtils.random(4, true, true);
		System.out.println("i4: "+i4);*/
		/*String i5 = RandomStringUtils.random(1, 1, 2, false, true);//不能用
		System.out.println("i5: "+ i5);*/
		
		/*String i6 = RandomStringUtils.randomAlphabetic(4);
		System.out.println("i6: "+i6);
		String i7 = RandomStringUtils.randomAlphanumeric(4);
		System.out.println("i7: "+i7);
		String i8 = RandomStringUtils.randomAscii(4);
		System.out.println("i8: "+i8);*/
		/*String i9 = RandomStringUtils.randomNumeric(4);
		System.out.println("i9: "+i9);*/
		/*
		try {
			String s = FileUtils.readFileToString(FileUtils.getFile(new File("c:/"), "nginx.conf"), "UTF-8");
			System.out.println("ssss: "+s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		 
		 File file= FileUtils.getFile(new File("c:/"), "nginx.conf");
		
		 try {
			 FileInputStream in = FileUtils.openInputStream(file);
			 FileOutputStream out = new FileOutputStream("c:/fcc.jpg");
			 
			 IOUtils.copy(in, out);
			 out.flush();
			 out.close();
			 in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}
