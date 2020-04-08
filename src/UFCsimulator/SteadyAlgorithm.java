package UFCsimulator;

public class SteadyAlgorithm {

	public static String player1_1(int randomSteady, double randomDamage) {
		double randomSteady1 = (double) randomSteady;
		
		double chance = (10 + (Weight.Player.strk * 4) + (Weight.Player.spd * 2) + (Weight.Player.iq * 2) + (Weight.Player.luck * 1)) - 1 - (FightScreen.opIqDbl * 3);
		
		if (randomSteady1 <= chance) {
			double dmgMult;
			if (randomDamage < 15) {
				dmgMult = 1.0;
			}
			else if (randomDamage < 18) {
				dmgMult = 1.2;
			}
			else {
				dmgMult = 1.5;
			}
			
			double damage = (Weight.Player.str * 2.75) * (((11 - FightScreen.opChinDbl) * 0.05) + 0.5) * dmgMult;
			
			if (FightScreen.hitpoints2 <= damage) {
				FightScreen.hitpoints2 = 0;
				FightScreen.lblStamina2.setText("0%");
				if (damage >= 20) {
					System.out.println("player ko oppo with " + damage);
					FightScreen.finish = "KO";
					FightScreen.time = "1:15";
					FightScreen.winner = 0;
					double retStam = (damage / FightScreen.max2) * 100;
					String ret = (Weight.Player.last + " KOs " + FightScreen.opLast + " WITH A STRIKE, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					return ret;
				}
				else {
					System.out.println("player tko oppo with " + damage);
					FightScreen.finish = "TKO";
					FightScreen.time = "1:15";
					FightScreen.winner = 0;
					double retStam = (damage / FightScreen.max2) * 100;
					String ret = (Weight.Player.last + " TKOs " + FightScreen.opLast + " WITH A FEW STRIKES, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					return ret;
				}
			}
			else {
				if (damage >= 30) {
					++FightScreen.knockDown1;
					FightScreen.hitpoints2 -= damage;
					FightScreen.stam2 = (FightScreen.hitpoints2 / FightScreen.max2) * 100;
					FightScreen.lblStamina2.setText(FightScreen.df1.format(FightScreen.stam2) + "%");
					double retStam = (damage / FightScreen.max2) * 100;
					String ret = (Weight.Player.last + " KNOCKS DOWN " + FightScreen.opLast + " WITH A STRIKE, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					System.out.println("player knocked down oppo with " + damage);
					return ret;
				}
				else {
					FightScreen.hitpoints2 -= damage;
					FightScreen.stam2 = (FightScreen.hitpoints2 / FightScreen.max2) * 100;
					FightScreen.lblStamina2.setText(FightScreen.df1.format(FightScreen.stam2) + "%");
					double retStam = (damage / FightScreen.max2) * 100;
					String ret = (Weight.Player.last + " THROWS A FEW STRIKES, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					System.out.println("player gave " + damage);
					return ret;
				}
			}
		}
		else if (randomSteady1 <= (chance + (FightScreen.opIqDbl * 3))) {
			double dmgMult;
			if (randomDamage < 15) {
				dmgMult = 1.0;
			}
			else if (randomDamage < 18) {
				dmgMult = 1.2;
			}
			else {
				dmgMult = 1.5;
			}
			
			double damage = (FightScreen.opStrDbl * 2.75) * (((11 - Weight.Player.chin) * 0.05) + 0.5) * dmgMult;
			
			if (FightScreen.hitpoints1 <= damage) {
				FightScreen.hitpoints1 = 0;
				FightScreen.lblStamina1.setText("0%");
				if (damage >= 20) {
					FightScreen.finish = "KO";
					FightScreen.time = "1:15";
					FightScreen.winner = 1;
					System.out.println("oppo ko player with counter " + damage);
					double retStam = (damage / FightScreen.max2) * 100;
					String ret = (Weight.Player.last + " COUNTERS AND KOs " + FightScreen.opLast + " WITH A STRIKE, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					return ret;
				}
				else {
					FightScreen.finish = "TKO";
					FightScreen.time = "1:15";
					FightScreen.winner = 1;
					System.out.println("oppo tko player with counter " + damage);
					double retStam = (damage / FightScreen.max1) * 100;
					String ret = (FightScreen.opLast + " COUNTERS AND TKOs " + Weight.Player.last + " WITH A FEW STRIKES, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					return ret;
				}
			}
			else {
				if (damage >= 30) {
					++FightScreen.knockDown2;
					FightScreen.hitpoints1 -= damage;
					FightScreen.stam1 = (FightScreen.hitpoints1 / FightScreen.max1) * 100;
					FightScreen.lblStamina1.setText(FightScreen.df1.format(FightScreen.stam1) + "%");
					System.out.println("oppo knocked down player with counter " + damage);
					double retStam = (damage / FightScreen.max1) * 100;
					String ret = (FightScreen.opLast + " COUNTERS AND KNOCKS DOWN " + Weight.Player.last + " WITH A STRIKE, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					return ret;
				}
				else {
					FightScreen.hitpoints1 -= damage;
					FightScreen.stam1 = (FightScreen.hitpoints1 / FightScreen.max1) * 100;
					FightScreen.lblStamina1.setText(FightScreen.df1.format(FightScreen.stam1) + "%");
					System.out.println("oppo gave counter " + damage);
					double retStam = (damage / FightScreen.max1) * 100;
					String ret = (FightScreen.opLast + " COUNTERS " + Weight.Player.last + " WITH A FEW STRIKES, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					return ret;
				}
			}
		}
		else {
			// miss
			System.out.println("player missed");
			String ret = (Weight.Player.last + " THROWS A FEW STRIKES, BUT MISSES");
			return ret;
		}
	}
	
	public static String player1_2(int randomSteady, double randomDamage) {
		double randomSteady1 = (double) randomSteady;
		
		double chance = (10 + (Weight.Player.strk * 4) + (Weight.Player.spd * 2) + (Weight.Player.iq * 2) + (Weight.Player.luck * 1)) - 1 - 15;
		
		if (randomSteady1 <= chance) {
			double dmgMult;
			if (randomDamage < 15) {
				dmgMult = 1.0;
			}
			else if (randomDamage < 18) {
				dmgMult = 1.2;
			}
			else {
				dmgMult = 1.5;
			}
			
			double damage = (Weight.Player.str * 2.75) * (((11 - FightScreen.opChinDbl) * 0.05) + 0.5) * dmgMult;

			if (FightScreen.hitpoints2 <= damage) {
				FightScreen.hitpoints2 = 0;
				FightScreen.lblStamina2.setText("0%");
				if (damage >= 20) {
					FightScreen.finish = "KO";
					FightScreen.time = "1:15";
					FightScreen.winner = 0;
					System.out.println("player ko oppo with " + damage);
					double retStam = (damage / FightScreen.max2) * 100;
					String ret = (Weight.Player.last + " KOs " + FightScreen.opLast + " WITH A STRIKE, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					return ret;
				}
				else {
					FightScreen.finish = "TKO";
					FightScreen.time = "1:15";
					FightScreen.winner = 0;
					System.out.println("player tko oppo with " + damage);
					double retStam = (damage / FightScreen.max2) * 100;
					String ret = (Weight.Player.last + " TKOs " + FightScreen.opLast + " WITH A FEW STRIKES, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					return ret;
				}
			}
			else {
				if (damage >= 30) {
					++FightScreen.knockDown1;
					FightScreen.hitpoints2 -= damage;
					FightScreen.stam2 = (FightScreen.hitpoints2 / FightScreen.max2) * 100;
					FightScreen.lblStamina2.setText(FightScreen.df1.format(FightScreen.stam2) + "%");
					System.out.println("player knocked down oppo with " + damage);
					double retStam = (damage / FightScreen.max2) * 100;
					String ret = (Weight.Player.last + " KNOCKS DOWN " + FightScreen.opLast + " WITH A STRIKE, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					return ret;
				}
				else {
					FightScreen.hitpoints2 -= damage;
					FightScreen.stam2 = (FightScreen.hitpoints2 / FightScreen.max2) * 100;
					FightScreen.lblStamina2.setText(FightScreen.df1.format(FightScreen.stam2) + "%");
					System.out.println("player gave " + damage);
					double retStam = (damage / FightScreen.max2) * 100;
					String ret = (Weight.Player.last + " THROWS A FEW STRIKES, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					return ret;
				}
			}
		}
		else {
			// block
			System.out.println("player was blocked");
			String ret = (Weight.Player.last + " THROWS A FEW STRIKES, BUT IS BLOCKED");
			return ret;
		}
	}
	
	public static String player1_3(int randomSteady, double randomDamage) {
		double randomSteady1 = (double) randomSteady;
		
		double chance = (10 + (Weight.Player.strk * 4) + (Weight.Player.spd * 2) + (Weight.Player.iq * 2) + (Weight.Player.luck * 1)) - 1;
		
		if (randomSteady1 <= chance) {
			double dmgMult;
			if (randomDamage < 15) {
				dmgMult = 1.0;
			}
			else if (randomDamage < 18) {
				dmgMult = 1.2;
			}
			else {
				dmgMult = 1.5;
			}
			
			double damage = (Weight.Player.str * 2.75) * (((11 - FightScreen.opChinDbl) * 0.05) + 0.5) * dmgMult;
	
			if (FightScreen.hitpoints2 <= damage) {
				FightScreen.hitpoints2 = 0;
				FightScreen.lblStamina2.setText("0%");
				if (damage >= 20) {
					FightScreen.finish = "KO";
					FightScreen.time = "1:15";
					FightScreen.winner = 0;
					System.out.println("player ko oppo with " + damage);
					double retStam = (damage / FightScreen.max2) * 100;
					String ret = (Weight.Player.last + " KOs " + FightScreen.opLast + " WITH STRIKE, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					return ret;
				}
				else {
					FightScreen.finish = "TKO";
					FightScreen.time = "1:15";
					FightScreen.winner = 0;
					System.out.println("player tko oppo with " + damage);
					double retStam = (damage / FightScreen.max2) * 100;
					String ret = (Weight.Player.last + " TKOs " + FightScreen.opLast + " WITH A FEW STRIKES, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					return ret;
				}
			}
			else {
				if (damage >= 30) {
					++FightScreen.knockDown1;
					FightScreen.hitpoints2 -= damage;
					FightScreen.stam2 = (FightScreen.hitpoints2 / FightScreen.max2) * 100;
					FightScreen.lblStamina2.setText(FightScreen.df1.format(FightScreen.stam2) + "%");
					System.out.println("player knocked down oppo with " + damage);
					double retStam = (damage / FightScreen.max2) * 100;
					String ret = (Weight.Player.last + " KNOCKS DOWN " + FightScreen.opLast + " WITH A STRIKE, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					return ret;
				}
				else {
					FightScreen.hitpoints2 -= damage;
					FightScreen.stam2 = (FightScreen.hitpoints2 / FightScreen.max2) * 100;
					FightScreen.lblStamina2.setText(FightScreen.df1.format(FightScreen.stam2) + "%");
					System.out.println("player gave " + damage);
					double retStam = (damage / FightScreen.max2) * 100;
					String ret = (Weight.Player.last + " THROWS A FEW STRIKES, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					return ret;
				}
			}
		}
		else {
			// miss
			System.out.println("player missed");
			String ret = (Weight.Player.last + " THROWS A FEW STRIKES, BUT MISSES");
			return ret;
		}
	}
	
	public static String op1_1(int randomSteady, double randomDamage) {
		double randomSteady1 = (double) randomSteady;
		
		double chance = (10 + (FightScreen.opStrkDbl * 4) + (FightScreen.opSpdDbl * 2) + (FightScreen.opIqDbl * 2) + (FightScreen.opLuckDbl * 1)) - 1 - (Weight.Player.iq * 3);
		
		if (randomSteady1 <= chance) {
			double dmgMult;
			if (randomDamage < 15) {
				dmgMult = 1.0;
			}
			else if (randomDamage < 18) {
				dmgMult = 1.2;
			}
			else {
				dmgMult = 1.5;
			}
			
			double damage = (FightScreen.opStrDbl * 2.75) * (((11 - Weight.Player.chin) * 0.05) + 0.5) * dmgMult;
		
			if (FightScreen.hitpoints1 <= damage) {
				FightScreen.hitpoints1 = 0;
				FightScreen.lblStamina1.setText("0%");
				if (damage >= 20) {
					FightScreen.finish = "KO";
					FightScreen.time = "1:15";
					FightScreen.winner = 1;
					System.out.println("oppo ko player with " + damage);
					double retStam = (damage / FightScreen.max1) * 100;
					String ret = (FightScreen.opLast + " KOs " + Weight.Player.last + " WITH A STRIKE, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					return ret;
				}
				else {
					FightScreen.finish = "TKO";
					FightScreen.time = "1:15";
					FightScreen.winner = 1;
					System.out.println("oppo tko player with " + damage);
					double retStam = (damage / FightScreen.max1) * 100;
					String ret = (FightScreen.opLast + " TKOs " + Weight.Player.last + " WITH A FEW STRIKES, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					return ret;
				}
			}
			else {
				if (damage >= 30) {
					++FightScreen.knockDown2;
					FightScreen.hitpoints1 -= damage;
					FightScreen.stam1 = (FightScreen.hitpoints1 / FightScreen.max1) * 100;
					FightScreen.lblStamina1.setText(FightScreen.df1.format(FightScreen.stam1) + "%");
					System.out.println("oppo knocked down player with " + damage);
					double retStam = (damage / FightScreen.max1) * 100;
					String ret = (FightScreen.opLast + " KNOCKS DOWN " + Weight.Player.last + " WITH A STRIKE, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					return ret;
				}
				else {
					FightScreen.hitpoints1 -= damage;
					FightScreen.stam1 = (FightScreen.hitpoints1 / FightScreen.max1) * 100;
					FightScreen.lblStamina1.setText(FightScreen.df1.format(FightScreen.stam1) + "%");
					System.out.println("oppo gave " + damage);
					double retStam = (damage / FightScreen.max1) * 100;
					String ret = (FightScreen.opLast + " THROWS A FEW STRIKES, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					return ret;
				}
			}
		}
		else if (randomSteady1 <= (chance + (FightScreen.opIqDbl * 3))) {
			double dmgMult;
			if (randomDamage < 15) {
				dmgMult = 1.0;
			}
			else if (randomDamage < 18) {
				dmgMult = 1.2;
			}
			else {
				dmgMult = 1.5;
			}
			
			double damage = (Weight.Player.str * 2.75) * (((11 - FightScreen.opChinDbl) * 0.05) + 0.5) * dmgMult;
			
			if (FightScreen.hitpoints2 <= damage) {
				FightScreen.hitpoints2 = 0;
				FightScreen.lblStamina2.setText("0%");
				if (damage >= 20) {
					FightScreen.finish = "KO";
					FightScreen.time = "1:15";
					FightScreen.winner = 0;
					System.out.println("player ko oppo with counter " + damage);
					double retStam = (damage / FightScreen.max2) * 100;
					String ret = (Weight.Player.last + " COUNTERS AND KOs " + FightScreen.opLast + " WITH A STRIKE, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					return ret;
				}
				else {
					FightScreen.finish = "TKO";
					FightScreen.time = "1:15";
					FightScreen.winner = 0;
					System.out.println("player tko oppo with counter " + damage);
					double retStam = (damage / FightScreen.max2) * 100;
					String ret = (Weight.Player.last + " COUNTERS AND TKOs " + FightScreen.opLast + " WITH A FEW STRIKES, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					return ret;
				}
			}
			else {
				if (damage >= 30) {
					++FightScreen.knockDown1;
					FightScreen.hitpoints2 -= damage;
					FightScreen.stam2 = (FightScreen.hitpoints2 / FightScreen.max2) * 100;
					FightScreen.lblStamina2.setText(FightScreen.df1.format(FightScreen.stam2) + "%");
					System.out.println("player knocked down oppo with counter " + damage);
					double retStam = (damage / FightScreen.max2) * 100;
					String ret = (Weight.Player.last + " COUNTERS AND KNOCKS DOWN " + FightScreen.opLast + " WITH A STRIKE, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					return ret;
				}
				else {
					FightScreen.hitpoints2 -= damage;
					FightScreen.stam2 = (FightScreen.hitpoints2 / FightScreen.max2) * 100;
					FightScreen.lblStamina2.setText(FightScreen.df1.format(FightScreen.stam2) + "%");
					System.out.println("player gave counter " + damage);
					double retStam = (damage / FightScreen.max2) * 100;
					String ret = (Weight.Player.last + " COUNTERS " + FightScreen.opLast + " WITH A FEW STRIKES, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					return ret;
				}
			}
		}
		else {
			// miss
			System.out.println("oppo missed");
			String ret = (FightScreen.opLast + " THROWS A FEW STRIKES, BUT MISSES");
			return ret;
		}
	}
	
	public static String op1_2(int randomSteady, double randomDamage) {
		double randomSteady1 = (double) randomSteady;
		
		double chance = (10 + (FightScreen.opStrkDbl * 4) + (FightScreen.opSpdDbl * 2) + (FightScreen.opIqDbl * 2) + (FightScreen.opLuckDbl * 1)) - 1 - 15;
		
		if (randomSteady1 <= chance) {
			double dmgMult;
			if (randomDamage < 15) {
				dmgMult = 1.0;
			}
			else if (randomDamage < 18) {
				dmgMult = 1.2;
			}
			else {
				dmgMult = 1.5;
			}
			
			double damage = (FightScreen.opStrDbl * 2.75) * (((11 - Weight.Player.chin) * 0.05) + 0.5) * dmgMult;
		
			if (FightScreen.hitpoints1 <= damage) {
				FightScreen.hitpoints1 = 0;
				FightScreen.lblStamina1.setText("0%");
				if (damage >= 20) {
					FightScreen.finish = "KO";
					FightScreen.time = "1:15";
					FightScreen.winner = 1;
					System.out.println("oppo ko player with " + damage);
					double retStam = (damage / FightScreen.max1) * 100;
					String ret = (FightScreen.opLast + " KOs " + Weight.Player.last + " WITH A STRIKE, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					return ret;
				}
				else {
					FightScreen.finish = "TKO";
					FightScreen.time = "1:15";
					FightScreen.winner = 1;
					System.out.println("oppo tko player with " + damage);
					double retStam = (damage / FightScreen.max1) * 100;
					String ret = (FightScreen.opLast + " TKOs " + Weight.Player.last + " WITH A FEW STRIKES, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					return ret;
				}
			}
			else {
				if (damage >= 30) {
					++FightScreen.knockDown2;
					FightScreen.hitpoints1 -= damage;
					FightScreen.stam1 = (FightScreen.hitpoints1 / FightScreen.max1) * 100;
					FightScreen.lblStamina1.setText(FightScreen.df1.format(FightScreen.stam1) + "%");
					System.out.println("oppo knocked down player with " + damage);
					double retStam = (damage / FightScreen.max1) * 100;
					String ret = (FightScreen.opLast + " KNOCKS DOWN " + Weight.Player.last + " WITH A STRIKE, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					return ret;
				}
				else {
					FightScreen.hitpoints1 -= damage;
					FightScreen.stam1 = (FightScreen.hitpoints1 / FightScreen.max1) * 100;
					FightScreen.lblStamina1.setText(FightScreen.df1.format(FightScreen.stam1) + "%");
					System.out.println("oppo gave " + damage);
					double retStam = (damage / FightScreen.max1) * 100;
					String ret = (FightScreen.opLast + " THROWS A FEW STRIKES, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					return ret;
				}
			}
		}
		else {
			// block
			System.out.println("oppo was blocked");
			String ret = (FightScreen.opLast + " THROWS A FEW STRIKES, BUT IS BLOCKED");
			return ret;
		}
	}
	
	public static String op1_3(int randomSteady, double randomDamage) {
		double randomSteady1 = (double) randomSteady;
		
		double chance = (10 + (FightScreen.opStrkDbl * 4) + (FightScreen.opSpdDbl * 2) + (FightScreen.opIqDbl * 2) + (FightScreen.opLuckDbl * 1)) - 1;
		
		if (randomSteady1 <= chance) {
			double dmgMult;
			if (randomDamage < 15) {
				dmgMult = 1.0;
			}
			else if (randomDamage < 18) {
				dmgMult = 1.2;
			}
			else {
				dmgMult = 1.5;
			}
			
			double damage = (FightScreen.opStrDbl * 2.75) * (((11 - Weight.Player.chin) * 0.05) + 0.5) * dmgMult;

			if (FightScreen.hitpoints1 <= damage) {
				FightScreen.hitpoints1 = 0;
				FightScreen.lblStamina1.setText("0%");
				if (damage >= 20) {
					FightScreen.finish = "KO";
					FightScreen.time = "1:15";
					FightScreen.winner = 1;
					System.out.println("oppo ko player with " + damage);
					double retStam = (damage / FightScreen.max1) * 100;
					String ret = (FightScreen.opLast + " KOs " + Weight.Player.last + " WITH A STRIKE, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					return ret;
				}
				else {
					FightScreen.finish = "TKO";
					FightScreen.time = "1:15";
					FightScreen.winner = 1;
					System.out.println("oppo tko player with " + damage);
					double retStam = (damage / FightScreen.max1) * 100;
					String ret = (FightScreen.opLast + " TKOs " + Weight.Player.last + " WITH A FEW STRIKES, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					return ret;
				}
			}
			else {
				if (damage >= 30) {
					++FightScreen.knockDown2;
					FightScreen.hitpoints1 -= damage;
					FightScreen.stam1 = (FightScreen.hitpoints1 / FightScreen.max1) * 100;
					FightScreen.lblStamina1.setText(FightScreen.df1.format(FightScreen.stam1) + "%");
					System.out.println("oppo knocked down player with " + damage);
					double retStam = (damage / FightScreen.max1) * 100;
					String ret = (FightScreen.opLast + " KNOCKS DOWN " + Weight.Player.last + " WITH A STRIKE, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					return ret;
				}
				else {
					FightScreen.hitpoints1 -= damage;
					FightScreen.stam1 = (FightScreen.hitpoints1 / FightScreen.max1) * 100;
					FightScreen.lblStamina1.setText(FightScreen.df1.format(FightScreen.stam1) + "%");
					System.out.println("oppo gave " + damage);
					double retStam = (damage / FightScreen.max1) * 100;
					String ret = (FightScreen.opLast + " THROWS A FEW STRIKES, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					return ret;
				}
			}
		}
		else {
			// miss
			System.out.println("oppo missed");
			String ret = (FightScreen.opLast + " THROWS A FEW STRIKES, BUT MISSES");
			return ret;
		}
	}

}
