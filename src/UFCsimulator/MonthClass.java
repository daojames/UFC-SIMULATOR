package UFCsimulator;

public class MonthClass {

	String month = "APRIL";
	int monthNum = 4;
	int year = 2020;
	int ufc = 250;
	int fightLim = 0;
	int campLim = 0;
	
	public MonthClass() {}
	
	public String getMonth() {
		return month;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getUFC() {
		return ufc;
	}
	
	public void incMonth() {
		monthNum += 1;
		ufc += 1;
		
		if (monthNum == 13) {
			monthNum = 1;
			year += 1;
		}
		
		switch (monthNum) {
			case 1:
				month = "JANUARY";
				break;
			case 2:
				month = "FEBRUARY";
				break;
			case 3:
				month = "MARCH";
				break;
			case 4:
				month = "APRIL";
				break;
			case 5:
				month = "MAY";
				break;
			case 6:
				month = "JUNE";
				break;
			case 7:
				month = "JULY";
				break;
			case 8:
				month = "AUGUST";
				break;
			case 9:
				month = "SEPTEMBER";
				break;
			case 10:
				month = "OCTOBER";
				break;
			case 11:
				month = "NOVEMBER";
				break;
			case 12:
				month = "DECEMBER";
				break;
			}
		
		if (Weight.Player.recovery == 1.0) {}
		else if ((Weight.Player.recovery + 0.2) > 1.0) {
			Weight.Player.recovery = 1.0;
		}
		else {
			Weight.Player.recovery += 0.2;
		}
	}
	
	public Boolean incFightLim() {
		fightLim += 1;
		
		if (fightLim == 12) {
			fightLim = 0;
			return true;
		}
		else {
			return false;
		}
	}
	
	public Boolean incCampLim() {
		campLim += 1;
		
		if (campLim == 2) {
			campLim = 0;
			return true;
		}
		else {
			return false;
		}
	}
}
