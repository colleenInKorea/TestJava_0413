package ex01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class Ex01 {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fs = new FileOutputStream("output.txt", false);
			OutputStreamWriter ow = new OutputStreamWriter(fs, "utf-8");
			BufferedWriter bw = new BufferedWriter(ow);
			
			String text = "�ȳ��ϼ��� ���Ͼ���� ó������?\n"
					+ "������ �������Դϴ�. "
					+ "������ �ݰ����ϴ�.";
			
			bw.write(text);
			bw.close();
			
			FileInputStream fis = new FileInputStream("output.text");
			InputStreamReader isr = new InputStreamReader(fis, "utf-8");
			BufferedReader br = new BufferedReader(isr);
			
			while (true) {
				
				String readText = br.readLine();
				if((readText = br.readLine()) != null) {
					
					System.out.println(readText);
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
