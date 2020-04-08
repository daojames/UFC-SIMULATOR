package UFCsimulator;

public class YouClass {
	
	public String first;
	public String last;
	public String country;
	
	public int win = 0;
	public int loss = 0;
	
	public double str;
	public double spd;
	public double stm;
	public double chin;
	public double strk;
	public double wrst;
	public double iq;
	public double luck;
	public int weight;
	
	public double strBuff;
	public double spdBuff;
	public double stmBuff;
	public double chinBuff;
	public double strkBuff;
	public double wrstBuff;
	public double iqBuff;
	public double luckBuff;
	
	public double recovery = 1.0;
	
	public int position = 10;
	
	public int winKO = 0;
	public int winTKO = 0;
	public int winSub = 0;
	public int winD = 0;
	public int lossKO = 0;
	public int lossTKO = 0;
	public int lossSub = 0;
	public int lossD = 0;
	public int win1 = 0;
	public int win2 = 0;
	public int win3 = 0;
	public int win4 = 0;
	public int win5 = 0;
	public int loss1 = 0;
	public int loss2 = 0;
	public int loss3 = 0;
	public int loss4 = 0;
	public int loss5 = 0;
	public int winStreak = 0;
	public Boolean prevWin = true;
	
	public YouClass() {}
	
	public void setClass(double str1, double spd1, double stm1, double chin1, double strk1, double wrst1, double iq1, double luck1, int weight1, String first1, String last1) {
		this.str = str1;
		this.spd = spd1;
		this.stm = stm1;
		this.chin = chin1;
		this.strk = strk1;
		this.wrst = wrst1;
		this.iq = iq1;
		this.luck = luck1;
		this.weight = weight1;
		
		this.first = first1;
		this.last = last1;
		this.country = "USA";
	}
	
	public void setPos(int pos) {
		position = pos;
	}
	
	public int getPos() {
		return position;
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
	
	public void addRecov(double amt) {
		recovery += amt;
	}
	
	public void subRecov(double amt) {
		recovery -= amt;
	}
	
	public void setRecov(double amt) {
		this.recovery = amt;
	}
	
	public double getRecov() {
		return recovery;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void addStr(double amt) {
		this.str += amt;
	}
	
	public void addSpd(double amt) {
		this.spd += amt;
	}
	
	public void addStm(double amt) {
		this.stm += amt;
	}
	
	public void addChin(double amt) {
		this.chin += amt;
	}
	
	public void addStrk(double amt) {
		this.strk += amt;
	}
	
	public void addWrst(double amt) {
		this.wrst += amt;
	}
	
	public void addIq(double amt) {
		this.iq += amt;
	}
	
	public void addLuck(double amt) {
		this.luck += amt;
	}
	
	public String getStr() {
		double amt = this.str;
		String strg = (String.format("%.1f", amt));
		return strg;
	}
	
	public String getSpd() {
		double amt = this.spd;
		String strg = (String.format("%.1f", amt));
		return strg;
	}
	
	public String getStm() {
		double amt = this.stm;
		String strg = (String.format("%.1f", amt));
		return strg;
	}
	
	public String getChin() {
		double amt = this.chin;
		String strg = (String.format("%.1f", amt));
		return strg;
	}
	
	public String getStrk() {
		double amt = this.strk;
		String strg = (String.format("%.1f", amt));
		return strg;
	}
	
	public String getWrst() {
		double amt = this.wrst;
		String strg = (String.format("%.1f", amt));
		return strg;
	}
	
	public String getIq() {
		double amt = this.iq;
		String strg = (String.format("%.1f", amt));
		return strg;
	}
	
	public String getLuck() {
		double amt = this.luck;
		String strg = (String.format("%.1f", amt));
		return strg;
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
