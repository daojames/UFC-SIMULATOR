package UFCsimulator;

public class BalanceClass {

	private int balance = 50000;
	private int twitter = 10000;
	private int clout;
	private int sponsor = 0;
	
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

	    switch (pos) {
		case 10:
		    pos1 = 1.0;
		    break;
		case 9:
		    pos1 = 1.1;
		    break;
		case 8:
		    pos1 = 1.2;
		    break;
		case 7:
		    pos1 = 1.3;
		    break;
		case 6:
		    pos1 = 1.4;
		    break;
		case 5:
		    pos1 = 1.5;
		    break;
		case 4:
		    pos1 = 1.6;
		    break;
		case 3:
		    pos1 = 1.7;
		    break;
		case 2:
		    pos1 = 1.8;
		    break;
		case 1:
		    pos1 = 1.9;
		    break;
		case 0:
		    pos1 = 3.0;
		    break;
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
