package UFCsimulator;

public class BalanceClass {

	int balance = 50000;
	int twitter = 10000;
	int clout;
	int sponsor = 0;
	
	public BalanceClass() {}
	
	public int getBalance() {
		return balance;
	}
	
	public void addBalance(int amt) {
		balance += amt;
	}
	
	public void subBalance(int amt) {
		balance -= amt;
	}
	
	public int getTwitter() {
		return twitter;
	}
	
	public void addTwitter(int amt) {
		twitter += amt;
	}
	
	public void subTwitter(int amt) {
		twitter -= amt;
	}
	
	public void calcClout() {
		int twitter = this.getTwitter();
		int pos = Weight.Player.getPos();
		double pos1 = 1;

		if (pos == 10) {
			pos1 = 1.0;
		}
		else if (pos == 9) {
			pos1 = 1.1;
		}
		else if (pos == 8) {
			pos1 = 1.2;
		}
		else if (pos == 7) {
			pos1 = 1.3;
		}
		else if (pos == 6) {
			pos1 = 1.4;
		}
		else if (pos == 5) {
			pos1 = 1.5;
		}
		else if (pos == 4) {
			pos1 = 1.6;
		}
		else if (pos == 3) {
			pos1 = 1.7;
		}
		else if (pos == 2) {
			pos1 = 1.8;
		}
		else if (pos == 1) {
			pos1 = 1.9;
		}
		else if (pos == 0) {
			pos1 = 3.0;
		}
		
		this.clout = (int) (twitter * pos1);
	}
	
	public int getClout() {
		return this.clout;
	}
	
	public void setSponsor(int amt) {
		this.sponsor = amt;
	}
	
	public int getSponsor() {
		return this.sponsor;
	}
}
