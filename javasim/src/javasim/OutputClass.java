package javasim;

import java.io.IOException;

public class OutputClass {
		FileWrite fwfw = new FileWrite();
	
	public void printDollar(double dollar,
							int dollar100, int dollar50, int dollar20, int dollar10,
							int dollar5, int dollar2, int dollar1) {
		System.out.println(Math.floor(dollar) + " dollar");
		
		System.out.println("100달러 "
							+ dollar100 / 100 + " 장");
		
		System.out.println("50달러 " 
							+ dollar50 / 50 + " 장");
		
		System.out.println("20달러 " 
							+ dollar20 / 20 + " 장");
		
		System.out.println("10달러 " 
							+ dollar10 / 10 + " 장");
		
		System.out.println("5달러 " 
							+ dollar5 / 5 + " 장");
		
		System.out.println("2달러 " 
							+ dollar2 / 2 + " 장");
		
		System.out.println("1달러 " 
							+ dollar1 / 1 + " 장");
		String str = Math.floor(dollar) + " dollar" + "\r\n"
							+ "100달러 "+ dollar100 / 100 + " 장" + "\r\n"
							+ "50달러 " + dollar50 / 50 + " 장" + "\r\n"
							+ "20달러 " + dollar20 / 20 + " 장" + "\r\n"
							+ "10달러 " + dollar10 / 10 + " 장" + "\r\n"
							+ "5달러 " + dollar5 / 5 + " 장" + "\r\n"
							+ "2달러 " + dollar2 / 2 + " 장" + "\r\n"
							+ "1달러 " + dollar1 / 1 + " 장" + "\r\n";
		try {
			fwfw.filewrite(str);
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
	public void printEuro(double euro, int euro500, int euro200, int euro100, int euro50,
						  int euro20, int euro10, int euro5, int euro2, int euro1) {
		System.out.println(Math.floor(euro) + " euro");
		
		System.out.println("500유로 " + euro500 / 500 + " 장");

		System.out.println("200유로 " 
							+ euro200 / 200 + " 장");
		
		System.out.println("100유로 " 
							+ euro100 / 100 + " 장");
		
		System.out.println("50유로 " 
							+ euro50 / 50 + " 장");

		System.out.println("20유로 " 
							+ euro20 / 20 + " 장");

		System.out.println("10유로 " 
							+ euro10 / 10 + " 장");

		System.out.println("5유로 " 
							+ euro5 / 5 + " 장");

		System.out.println("2유로 " 
							+ euro2 / 2 + " 개");

		System.out.println("1유로 " 
							+ euro1 / 1 + " 개");
		String str = Math.floor(euro) + " euro" + "\r\n"
				+ "500유로 "+ euro500 / 500 + " 장" + "\r\n"
				+ "200유로 " + euro200 / 200 + " 장" + "\r\n"
				+ "100유로 " + euro100 / 100 + " 장" + "\r\n"
				+ "50유로 " + euro50 / 50 + " 장" + "\r\n"
				+ "20유로 " + euro20 / 20 + " 장" + "\r\n"
				+ "10유로 " + euro10 / 10 + " 장" + "\r\n"
				+ "5유로 " + euro5 / 5 + " 장" + "\r\n"
				+ "2유로 " + euro2 / 2 + " 개" + "\r\n"
				+ "1유로 " + euro1 / 1 + " 개" + "\r\n";
		try {
			fwfw.filewrite(str);
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
	public void printJPY(double JPY, int JPY10000, int JPY5000, int JPY2000, int JPY1000,
						 int JPY500, int JPY100, int JPY50, int JPY10, int JPY5, int JPY1) {
		System.out.println(Math.floor(JPY) + " JPY");
		
		System.out.println("10000엔 " + JPY10000 / 10000 + " 장");

		System.out.println("5000엔 " 
							+ JPY5000 / 5000 + " 장");

		System.out.println("2000엔 " 
							+ JPY2000 / 2000 + " 장");

		System.out.println("1000엔 " 
							+ JPY1000 / 1000 + " 장");

		System.out.println("500엔 " 
							+ JPY500 / 500 + " 개");

		System.out.println("100엔 " 
							+ JPY100 / 100 + " 개");

		System.out.println("50엔 " 
							+ JPY50 / 50 + " 개");

		System.out.println("10엔 " 
							+ JPY10 / 10 + " 개");

		System.out.println("5엔 " 
							+ JPY5 / 5 + " 개");

		System.out.println("1엔 " 
							+ JPY1 / 1 + " 개");
		String str = Math.floor(JPY) + " JPY" + "\r\n"
				+ "10000엔 "+ JPY10000 / 10000 + " 장" + "\r\n"
				+ "5000엔 "+ JPY5000 / 5000 + " 장" + "\r\n"
				+ "2000엔 " + JPY2000 / 2000 + " 장" + "\r\n"
				+ "1000엔 " +  JPY1000 / 1000 + " 장" + "\r\n"
				+ "500엔 " + JPY500 / 500 + " 개" + "\r\n"
				+ "100엔 " + JPY100 / 100 + " 개" + "\r\n"
				+ "50엔 " + JPY50 / 50 + " 개" + "\r\n"
				+ "10엔 " + JPY10 / 10 + " 개" + "\r\n"
				+ "50엔 " + JPY5 / 5 + " 개" + "\r\n"
				+ "1엔 " + JPY1 / 1 + " 개" + "\r\n";
		try {
			fwfw.filewrite(str);
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
	public void printExchangeWon(double exchangewon, int Exwon50000,int Exwon10000,
								 int Exwon5000, int Exwon1000,
								 int Exwon500, int Exwon100, int Exwon50, 
								 int Exwon10, int Exwon5, int Exwon1) {
		System.out.println("Exchange is " + Math.floor(exchangewon) + " won");

		System.out.println("50000원 " 
							+ Exwon50000 / 50000 + " 장");

		System.out.println("10000원 "
							+ Exwon10000 / 10000 + " 장");

		System.out.println("5000원 "
							+ Exwon5000 / 5000 + " 장");

		System.out.println("1000원 " 
							+ Exwon1000 / 1000 + " 장");

		System.out.println("500원 " 
							+ Exwon500 / 500 + " 개");

		System.out.println("100원 " 
							+ Exwon100 / 100 + " 개");

		System.out.println("50원 " 
							+ Exwon50 / 50 + " 개");

		System.out.println("10원 " 
							+ Exwon10 / 10 + " 개");

		System.out.println("5원 " 
							+ Exwon5 / 5 + " 개");

		System.out.println("1원 " 
							+ Exwon1 / 1 + " 개");
		String str = "Exchange is " + Math.floor(exchangewon) + " won" + "\r\n"
				+ "50000원 "+ Exwon50000 / 50000 + " 장" + "\r\n"
				+ "10000원 " + Exwon10000 / 10000 + " 장" + "\r\n"
				+ "5000원 " +  Exwon5000 / 5000 + " 장" + "\r\n"
				+ "1000원 " + Exwon1000 / 1000 + " 장" + "\r\n"
				+ "500원 " + Exwon500 / 500 + " 개" + "\r\n"
				+ "100원 " + Exwon100 / 100 + " 개" + "\r\n"
				+ "50원 " + Exwon50 / 50 + " 개" + "\r\n"
				+ "10원 " + Exwon10 / 10 + " 개" + "\r\n"
				+ "5원 " + Exwon5 / 5 + " 개" + "\r\n"
				+ "1원 " + Exwon1 / 1 + " 개" + "\r\n";
		try {
			fwfw.filewrite(str);
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
	public void printErrorMessage(int errorCode) {
			switch(errorCode) {
			case Constvalue.ERR_BALANCE_USD:
					System.out.print("달러 ");
					String str = "달러 " + "\r\n"; 
					try {
						fwfw.filewrite(str);
				} catch (IOException e) {
					e.printStackTrace();
				}
					break;
			case Constvalue.ERR_BALANCE_EUR:
					System.out.print("유로 ");
					String abc = "유로 " + "\r\n"; 
					try {
						fwfw.filewrite(abc);
				} catch (IOException e) {
					e.printStackTrace();
				}
					break;
			case Constvalue.ERR_BALANCE_JPY:
					System.out.print("엔화 ");
					String def = "엔화 " + "\r\n";
					try {
						fwfw.filewrite(def);
				} catch (IOException e) {
					e.printStackTrace();
				}
					break;
			}
			System.out.println("보유 잔액이 부족합니다.");
			String text = "보유 잔액이 부족합니다." + "\r\n";
			try {
				fwfw.filewrite(text);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void outputResultDollar(double dollar) {
			int dollar100, dollar50, dollar20, dollar10;
			int dollar5, dollar2, dollar1;
		
		dollar100 = (int) Math.floor(dollar);
		dollar50 = (int) dollar100 % 100;
		dollar20 = (int) dollar50 % 50;
		dollar10 = (int) dollar20 % 20;
		dollar5 = (int) dollar10 % 10;
		dollar2 = (int) dollar5 % 5;
		dollar1 = (int) dollar2 % 2;
		
		printDollar(dollar,
					dollar100, dollar50, dollar20, dollar10,
					dollar5, dollar2, dollar1);
	}
	public void outputResultEUR(double euro) {
			int euro500, euro200, euro100, euro50;
			int euro20, euro10, euro5, euro2, euro1;
			
			euro500 = (int) Math.floor(euro);
			euro200 = (int) euro500 % 500;
			euro100 = (int) euro200 % 200;
			euro50 = (int) euro100 % 100;
			euro20 = (int) euro50 % 50;
			euro10 = (int) euro20 % 20;
			euro5 = (int) euro10 % 10;
			euro2 = (int) euro5 % 5;
			euro1 = (int) euro2 % 2;
			
			printEuro(euro,
					  euro500, euro200, euro100, euro50, 
					  euro20, euro10, euro5, euro2, euro1);
	}
	public void outputResultJPY(double JPY) {
			int JPY10000, JPY5000, JPY2000, JPY1000;
			int JPY500, JPY100, JPY50, JPY10, JPY5, JPY1;
			
			JPY10000 = (int) Math.floor(JPY);
			JPY5000 = (int) JPY10000 % 10000;
			JPY2000 = (int) JPY5000 % 5000;
			JPY1000 = (int) JPY2000 % 2000;
			JPY500 = (int) JPY1000 % 1000;
			JPY100 = (int) JPY500 % 500;
			JPY50 = (int) JPY100 % 100;
			JPY10 = (int) JPY50 % 50;
			JPY5 = (int) JPY10 % 10;
			JPY1 = (int) JPY5 % 5;
			
			printJPY(JPY,
					 JPY10000, JPY5000, JPY2000, JPY1000, JPY500,
					 JPY100, JPY50, JPY10, JPY5, JPY1);
	}
	public void outputResultExangeWon(double exchangewon) {
		 int Exwon10000, Exwon5000, Exwon1000;
		 int Exwon500, Exwon100, Exwon50, Exwon10, Exwon5, Exwon1;
		 
		 int Exwon50000 = (int) Math.floor(exchangewon);
		 Exwon10000 = (int) Exwon50000 % 50000;
		 Exwon5000 = (int) Exwon10000 % 10000;
		 Exwon1000 = (int) Exwon5000 % 5000;
		 Exwon500 = (int) Exwon1000 % 1000;
		 Exwon100 = (int) Exwon500 % 500;
		 Exwon50 = (int) Exwon100 % 100;
		 Exwon10 = (int) Exwon50 % 50;
		 Exwon5 = (int) Exwon10 % 10;
		 Exwon1 = (int) Exwon5 % 5;
		 
		 printExchangeWon(exchangewon,
				 		  Exwon50000, Exwon10000, Exwon5000, Exwon1000,
				 		  Exwon500, Exwon100, Exwon50, Exwon10,
				 		  Exwon5, Exwon1);
		 
	}

}

