package javasim;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class RunExchangeclass {
		private OutputClass outClass = null;
		FileWrite fwfw = new FileWrite();
	

	public RunExchangeclass() {
		outClass = new OutputClass();
		Calendar calt = Calendar.getInstance();
		SimpleDateFormat sdt = new SimpleDateFormat ("YYYY/MM/dd HH:mm:ss");
		System.out.printf("최종실행시간 : %s\n", sdt.format(calt.getTime()));
		String str = "최종실행시간 : " + sdt.format(calt.getTime()) + "\r\n";
		try {
			fwfw.filewrite(str);
	} catch (IOException e) {
		e.printStackTrace();
	}
	}

	private boolean checkBalanceUSD(double requestUSD) {
		if (requestUSD <= Constvalue.BALANCE_USD) { //돈이 있으면
			return true;
		} else { //돈이 없으면
			return false;
		}

	}
	
	private boolean checkBalanceEUR(double requestEUR) {
		if (requestEUR <= Constvalue.BALANCE_EUR) { //돈이 있으면
			return true;
		} else { //돈이 없으면
			return false;
		}
	}
	
	private boolean checkBalanceJPY(double requestJPY) {
		if (requestJPY <= Constvalue.BALANCE_JPY) { 
			return true; //돈이 있으면
		} else {
			return false; //돈이 없으면
		}
	}

	public void ChangeToUSD(double won) {
		double dollar = (double) won / 1134.30;
		double exchangewon;

		if(checkBalanceUSD(dollar)) {
			outClass.outputResultDollar(dollar);

			exchangewon = dollar - Math.floor(dollar);
			exchangewon = exchangewon * 1134.30;

			outClass.outputResultExangeWon(exchangewon);
			Constvalue.BALANCE_USD -= dollar;
			System.out.println("남은 잔액은 " + Constvalue.BALANCE_USD + " 달라");
			String str = "남은 잔액은 " + Constvalue.BALANCE_USD + " 달라" + "\r\n";
			try {
				fwfw.filewrite(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
		} else {
					outClass.printErrorMessage(Constvalue.ERR_BALANCE_USD);
		}
	}

	public void ChangeToEUR(double won) {
		double euro = (double) won / 1333.25;
		double exchangewon;
		
		if(checkBalanceEUR(euro)) {
			outClass.outputResultEUR(euro);

			exchangewon = euro - Math.floor(euro);
			exchangewon = exchangewon * 1333.25;
			
			outClass.outputResultExangeWon(exchangewon);
			Constvalue.BALANCE_EUR -= euro;
			System.out.println("남은 잔액은 " + Constvalue.BALANCE_EUR + " 유로");
			String str = "남은 잔액은 " + Constvalue.BALANCE_EUR + " 유로" + "\r\n";
			try {
				fwfw.filewrite(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
		} else {
					outClass.printErrorMessage(Constvalue.ERR_BALANCE_EUR);
		}
	}

	public void ChangeToJPY(double won) {
		double JPY = (double) won / 10.30;
		double exchangewon;

		if(checkBalanceJPY(JPY)) {
			outClass.outputResultJPY(JPY);

			exchangewon = JPY - Math.floor(JPY);
			exchangewon = exchangewon * 10.30;

			outClass.outputResultExangeWon(exchangewon);
			Constvalue.BALANCE_JPY -= JPY;
			System.out.println("남은 잔액은 " + Constvalue.BALANCE_JPY + " 엔");
			String str = "남은 잔액은 " + Constvalue.BALANCE_JPY + " 엔" + "\r\n";
			try {
				fwfw.filewrite(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
		} else {
					outClass.printErrorMessage(Constvalue.CHANGE_TYPE_JPY);
		}
		

	}
}
