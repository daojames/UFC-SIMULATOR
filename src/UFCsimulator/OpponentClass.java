package UFCsimulator;

public class OpponentClass {
	
	public String first;
	public String last;
	public String country;
	
	public int win;
	public int loss;
	
	public double str;
	public double spd;
	public double stm;
	public double chin;
	public double strk;
	public double wrst;
	public double iq;
	public double luck;
	
	public double strBuff;
	public double spdBuff;
	public double stmBuff;
	public double chinBuff;
	public double strkBuff;
	public double wrstBuff;
	public double iqBuff;
	public double luckBuff;
	
	public int position;
	public int weight;
	
	public Boolean unfound = true;
	public Boolean mad = false;
	
	public OpponentClass() {}
	
	public void setClass(double str1, double spd1, double stm1, double chin1, double strk1, double wrst1, double iq1, double luck1, String first1, String last1, int win1, int loss1, int pos1, int weight1, String country1) {
		this.str = str1;
		this.spd = spd1;
		this.stm = stm1;
		this.chin = chin1;
		this.strk = strk1;
		this.wrst = wrst1;
		this.iq = iq1;
		this.luck = luck1;
		
		this.first = first1;
		this.last = last1;
		this.country = country1;
		
		this.win = win1;
		this.loss = loss1;
		
		this.position = pos1;
		this.weight = weight1;
	}
	
	public void win() {
		++win;
	}
	
	public void loss() {
		++loss;
	}
	
	public int getWin() {
		return win;
	}
	
	public int getLoss() {
		return loss;
	}
	
	public int getPos() {
		return position;
	}
	
	public void setPos(int pos) {
		position = pos;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int amt) {
		weight = amt;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void found() {
		unfound = false;
	}
	
	public void mad() {
		mad = true;
	}
	
	public void setStrBuff(double amt) {
		this.strBuff = amt;
	}
	
	public void setSpdBuff(double amt) {
		this.strBuff = amt;
	}
	
	public void setStmBuff(double amt) {
		this.strBuff = amt;
	}
	
	public void setChinBuff(double amt) {
		this.strBuff = amt;
	}
	
	public void setStrkBuff(double amt) {
		this.strBuff = amt;
	}
	
	public void setWrstBuff(double amt) {
		this.strBuff = amt;
	}
	
	public void setIqBuff(double amt) {
		this.strBuff = amt;
	}
	
	public void setLuckBuff(double amt) {
		this.strBuff = amt;
	}
	
	public int getOverall() {
		int overall = (int) (this.str + this.spd + this.stm + this.chin + this.strk + this.wrst + this.iq + this.luck);
		return overall;
	}
}
