package javasim;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Exchange {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		double won = 0;
		int menu = 0;
		InputClass inputClass = new InputClass();
		do {
			won = inputClass.inputFromConsoleWon();
			menu = (int) inputClass.inputFromConsoleType();

			RunExchangeclass runClass = new RunExchangeclass();
			if (menu == Constvalue.CHANGE_TYPE_USD) {
				runClass.ChangeToUSD(won);
			} else if (menu == Constvalue.CHANGE_TYPE_EUR) {
				runClass.ChangeToEUR(won);
			} else if (menu == Constvalue.CHANGE_TYPE_JPY) {
				runClass.ChangeToJPY(won);
			}
		} while (menu != 0);
	}

}
