package javasim;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class InputClass {
		private Scanner sc = null;
		FileWrite fwfw = new FileWrite();
		
		public InputClass() {
			sc = new Scanner(System.in);
		}
		
		public double inputFromConsoleWon() {
			System.out.println("Input the won");
			double won = sc.nextDouble();
			String str = "Input the won" + "\r\n" + won + "\r\n";
			try {
					fwfw.filewrite(str);
			} catch (IOException e) {
				e.printStackTrace();
			}
			return won;
		}
		public double inputFromConsoleType() {
			int menu;
			System.out.println("어떤 돈으로 환전?\n" 
					+ "1. USD\n\n" 
					+ "2. EUR\n\n" 
					+ "3. JPY\n\n" 
					+ "0. Exit");
			menu = sc.nextInt();
			String str = "어떤 돈으로 환전?\n" + "\r\n"
					+ "1. USD" + "\r\n"
					+ "2. EUR" + "\r\n"
					+ "3. JPY" + "\r\n"
					+ "0. Exit" + "\r\n";
			try {
					fwfw.filewrite(str);
			} catch (IOException e) {
				e.printStackTrace();
			}
			return menu;
	}

}
