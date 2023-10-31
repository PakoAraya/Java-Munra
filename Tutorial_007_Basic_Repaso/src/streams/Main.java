package streams;

import java.io.*;
import java.util.*;

public class Main {
	static void escribir() {
		try {
			OutputStream fos = new FileOutputStream("datos.txt");
			for (int i = 0x10; i < 0x19; i++) {
				fos.write(i);				
			}
			fos.flush();
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
	public static void main(String[] args) {
		try {
			InputStream fis = new FileInputStream("datos.txt");
			
			byte[] arr = new byte[4096];
			System.out.println(fis.read(arr,200,5));
			System.out.println(fis.read(arr,300,10));
			System.out.println("FIN");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
