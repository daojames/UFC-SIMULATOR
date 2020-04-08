package UFCsimulator;

public class MaulAlgorithm {

	public static String player4_1(int randomSteady, double randomDamage) {
		if (FightScreen.ground2 == false) {
			double randomSteady1 = (double) randomSteady;
			
			double chance = (10 + (Weight.Player.wrst * 4) + (Weight.Player.spd * 2) + (Weight.Player.str * 1) + (Weight.Player.iq * 1) + (Weight.Player.luck * 1)) - 1 - (FightScreen.opIqDbl * 3);
			
			if (randomSteady1 <= chance) {
				++FightScreen.takeDown1;
				FightScreen.ground2 = true;
				System.out.println("player took down oppo");
				String ret = (Weight.Player.last + " TAKES DOWN " + FightScreen.opLast);
				return ret;
			}
			else if (randomSteady1 <= (chance + (FightScreen.opIqDbl * 3))){
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
					if (damage >= 17) {
						FightScreen.finish = "KO";
						FightScreen.time = "1:15";
						FightScreen.winner = 1;
						System.out.println("oppo ko player with counter " + damage);
						double retStam = (damage / FightScreen.max1) * 100;
						String ret = (FightScreen.opLast + " COUNTERS THE TAKE DOWN AND KOs " + Weight.Player.last + " WITH A STRIKE, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
						return ret;
					}
					else {
						FightScreen.finish = "TKO";
						FightScreen.time = "1:15";
						FightScreen.winner = 1;
						System.out.println("oppo tko player with counter " + damage);
						double retStam = (damage / FightScreen.max1) * 100;
						String ret = (FightScreen.opLast + " COUNTERS THE TAKE DOWN AND TKOs " + Weight.Player.last + " WITH A FEW STRIKES, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
						return ret;
					}
				}
				else {
					FightScreen.hitpoints1 -= damage;
					FightScreen.stam1 = (FightScreen.hitpoints1 / FightScreen.max1) * 100;
					FightScreen.lblStamina1.setText(FightScreen.df1.format(FightScreen.stam1) + "%");
					System.out.println("oppo gave counter " + damage);
					double retStam = (damage / FightScreen.max1) * 100;
					String ret = (FightScreen.opLast + " COUNTERS " + Weight.Player.last + "'S TAKE DOWN WITH A STRIKE, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					return ret;
				}
			}
			else {
				// fail
				System.out.println("player failed to take down oppo");
				String ret = (Weight.Player.last + " ATTEMPTS A TAKE DOWN ON " + FightScreen.opLast + ", BUT FAILS");
				return ret;
			}
		}
		else {
			double randomSub = (double) randomSteady;
			double subChance = 80 + (Weight.Player.wrst * 2) - (FightScreen.opWrstDbl * 4) - 1;
			if (randomSub <= (Weight.Player.wrst * 2)) {
				// sub
				FightScreen.hitpoints2 = 0;
				FightScreen.lblStamina2.setText("0%");
				FightScreen.finish = "SUB";
				FightScreen.winner = 0;
				System.out.println("player submitted oppo");
				String ret = (Weight.Player.last + " SUBMITS " + FightScreen.opLast);
				return ret;
			}
			else if (randomSub <= subChance) {
				double damage = (Weight.Player.str * 4) * (((11 - FightScreen.opChinDbl) * 0.05) + 0.5);
				
				if (FightScreen.hitpoints2 <= damage) {
					FightScreen.hitpoints2 = 0;
					FightScreen.lblStamina2.setText("0%");
					
					FightScreen.finish = "TKO";
					FightScreen.time = "1:15";
					FightScreen.winner = 0;
					System.out.println("player tko oppo with " + damage);
					double retStam = (damage / FightScreen.max2) * 100;
					String ret = (Weight.Player.last + " TKOs " + FightScreen.opLast + " WITH GROUND & POUND, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					return ret;
				}
				else {
					FightScreen.hitpoints2 -= damage;
					FightScreen.stam2 = (FightScreen.hitpoints2 / FightScreen.max2) * 100;
					FightScreen.lblStamina2.setText(FightScreen.df1.format(FightScreen.stam2) + "%");
					System.out.println("player gave " + damage);
					double retStam = (damage / FightScreen.max2) * 100;
					String ret = (Weight.Player.last + " ATTACKS WITH GROUND & POUND, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					return ret;
				}
			}
			else {
				// got up
				FightScreen.ground2 = false;
				System.out.println("oppo got up");
				String ret = (FightScreen.opLast + " GETS BACK UP TO HIS FEET");
				return ret;
			}
		}
	}
	
	public static String player4_2(int randomSteady, double randomDamage) {
		if (FightScreen.ground2 == false) {
			double randomSteady1 = (double) randomSteady;
			
			double chance = (10 + (Weight.Player.wrst * 4) + (Weight.Player.spd * 2) + (Weight.Player.str * 1) + (Weight.Player.iq * 1) + (Weight.Player.luck * 1)) - 1;
			
			if (randomSteady1 <= chance) {
				++FightScreen.takeDown1;
				FightScreen.ground2 = true;
				System.out.println("player took down oppo");
				String ret = (Weight.Player.last + " TAKES DOWN " + FightScreen.opLast);
				return ret;
			}
			else {
				// fail
				System.out.println("player failed to take down oppo");
				String ret = (Weight.Player.last + " ATTEMPTS A TAKE DOWN ON " + FightScreen.opLast + ", BUT FAILS");
				return ret;
			}
		}
		else {
			double randomSub = (double) randomSteady;
			double subChance = 80 + (Weight.Player.wrst * 2) - (FightScreen.opWrstDbl * 4) - 1;
			if (randomSub <= (Weight.Player.wrst * 2)) {
				// sub
				FightScreen.hitpoints2 = 0;
				FightScreen.lblStamina2.setText("0%");
				FightScreen.finish = "SUB";
				FightScreen.winner = 0;
				System.out.println("player submitted oppo");
				String ret = (Weight.Player.last + " SUBMITS " + FightScreen.opLast);
				return ret;
			}
			else if (randomSub <= subChance) {
				double damage = (Weight.Player.str * 4) * (((11 - FightScreen.opChinDbl) * 0.05) + 0.5);
				
				if (FightScreen.hitpoints2 <= damage) {
					FightScreen.hitpoints2 = 0;
					FightScreen.lblStamina2.setText("0%");
					
					FightScreen.finish = "TKO";
					FightScreen.time = "1:15";
					FightScreen.winner = 0;
					System.out.println("player tko oppo with " + damage);
					double retStam = (damage / FightScreen.max2) * 100;
					String ret = (Weight.Player.last + " TKOs " + FightScreen.opLast + " WITH GROUND & POUND, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					return ret;
				}
				else {
					FightScreen.hitpoints2 -= damage;
					FightScreen.stam2 = (FightScreen.hitpoints2 / FightScreen.max2) * 100;
					FightScreen.lblStamina2.setText(FightScreen.df1.format(FightScreen.stam2) + "%");
					System.out.println("player gave " + damage);
					double retStam = (damage / FightScreen.max2) * 100;
					String ret = (Weight.Player.last + " ATTACKS WITH GROUND & POUND, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					return ret;
				}
			}
			else {
				// got up
				FightScreen.ground2 = false;
				System.out.println("oppo got up");
				String ret = (FightScreen.opLast + " GETS BACK UP TO HIS FEET");
				return ret;
			}
		}
	}
	
	public static String player4_3(int randomSteady, double randomDamage) {
		if (FightScreen.ground2 == false) {
			double randomSteady1 = (double) randomSteady;
			
			double chance = (10 + (Weight.Player.wrst * 4) + (Weight.Player.spd * 2) + (Weight.Player.str * 1) + (Weight.Player.iq * 1) + (Weight.Player.luck * 1)) - 1 - (FightScreen.opWrstDbl * 5);
			
			if (randomSteady1 <= chance) {
				++FightScreen.takeDown1;
				FightScreen.ground2 = true;
				System.out.println("player took down oppo");
				String ret = (Weight.Player.last + " TAKES DOWN " + FightScreen.opLast);
				return ret;
			}
			else {
				// fail
				System.out.println("player failed to take down oppo");
				String ret = (FightScreen.opLast + " DEFENDS A TAKE DOWN BY " + Weight.Player.last);
				return ret;
			}
		}
		else {
			double randomSub = (double) randomSteady;
			double subChance = 80 + (Weight.Player.wrst * 2) - (FightScreen.opWrstDbl * 4) - 1;
			if (randomSub <= (Weight.Player.wrst * 2)) {
				// sub
				FightScreen.hitpoints2 = 0;
				FightScreen.lblStamina2.setText("0%");
				FightScreen.finish = "SUB";
				FightScreen.winner = 0;
				System.out.println("player submitted oppo");
				String ret = (Weight.Player.last + " SUBMITS " + FightScreen.opLast);
				return ret;
			}
			else if (randomSub <= subChance) {
				double damage = (Weight.Player.str * 4) * (((11 - FightScreen.opChinDbl) * 0.05) + 0.5);
				
				if (FightScreen.hitpoints2 <= damage) {
					FightScreen.hitpoints2 = 0;
					FightScreen.lblStamina2.setText("0%");
					
					FightScreen.finish = "TKO";
					FightScreen.time = "1:15";
					FightScreen.winner = 0;
					System.out.println("player tko oppo with " + damage);
					double retStam = (damage / FightScreen.max2) * 100;
					String ret = (Weight.Player.last + " TKOs " + FightScreen.opLast + " WITH GROUND & POUND, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					return ret;
				}
				else {
					FightScreen.hitpoints2 -= damage;
					FightScreen.stam2 = (FightScreen.hitpoints2 / FightScreen.max2) * 100;
					FightScreen.lblStamina2.setText(FightScreen.df1.format(FightScreen.stam2) + "%");
					System.out.println("player gave " + damage);
					double retStam = (damage / FightScreen.max2) * 100;
					String ret = (Weight.Player.last + " ATTACKS WITH GROUND & POUND, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					return ret;
				}
			}
			else {
				// got up
				FightScreen.ground2 = false;
				System.out.println("player got up");
				String ret = (FightScreen.opLast + " GETS BACK UP TO HIS FEET");
				return ret;
			}
		}
	}
	
	public static String op4_1(int randomSteady, double randomDamage) {
		if (FightScreen.ground1 == false) {
			double randomSteady1 = (double) randomSteady;
			
			double chance = (10 + (FightScreen.opWrstDbl * 4) + (FightScreen.opSpdDbl * 2) + (FightScreen.opStrDbl * 1) + (FightScreen.opIqDbl * 1) + (FightScreen.opLuckDbl * 1)) - 1 - (Weight.Player.iq * 3);
			
			if (randomSteady1 <= chance) {
				++FightScreen.takeDown2;
				FightScreen.ground1 = true;
				System.out.println("oppo took down player");
				String ret = (FightScreen.opLast + " TAKES DOWN " + Weight.Player.last);
				return ret;
			}
			else if (randomSteady1 <= (chance + (Weight.Player.iq * 3))){
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
					if (damage >= 17) {
						FightScreen.finish = "KO";
						FightScreen.time = "1:15";
						FightScreen.winner = 0;
						System.out.println("player ko oppo with counter " + damage);
						double retStam = (damage / FightScreen.max2) * 100;
						String ret = (Weight.Player.last + " COUNTERS THE TAKE DOWN AND KOs " + FightScreen.opLast + " WITH A STRIKE, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
						return ret;
					}
					else {
						FightScreen.finish = "TKO";
						FightScreen.time = "1:15";
						FightScreen.winner = 0;
						System.out.println("player tko oppo with counter " + damage);
						double retStam = (damage / FightScreen.max2) * 100;
						String ret = (Weight.Player.last + " COUNTERS THE TAKE DOWN AND TKOs " + FightScreen.opLast + " WITH A FEW STRIKES, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
						return ret;
					}
				}
				else {
					FightScreen.hitpoints2 -= damage;
					FightScreen.stam2 = (FightScreen.hitpoints2 / FightScreen.max2) * 100;
					FightScreen.lblStamina2.setText(FightScreen.df1.format(FightScreen.stam2) + "%");
					System.out.println("player gave counter " + damage);
					double retStam = (damage / FightScreen.max2) * 100;
					String ret = (Weight.Player.last + " COUNTERS " + FightScreen.opLast + "'S TAKE DOWN WITH A STRIKE, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					return ret;
				}
			}
			else {
				// fail
				System.out.println("oppo failed to take down player");
				String ret = (FightScreen.opLast + " ATTEMPTS A TAKE DOWN ON " + Weight.Player.last + ", BUT FAILS");
				return ret;
			}
		}
		else {
			double randomSub = (double) randomSteady;
			double subChance = 80 + (FightScreen.opWrstDbl * 2) - (Weight.Player.wrst * 4) - 1;
			if (randomSub <= (FightScreen.opWrstDbl * 2)) {
				// sub
				FightScreen.hitpoints1 = 0;
				FightScreen.lblStamina1.setText("0%");
				FightScreen.finish = "SUB";
				FightScreen.winner = 1;
				System.out.println("oppo submitted player");
				String ret = (FightScreen.opLast + " SUBMITS " + Weight.Player.last);
				return ret;
			}
			else if (randomSub <= subChance) {
				double damage = (FightScreen.opStrDbl * 4) * (((11 - Weight.Player.chin) * 0.05) + 0.5);
				
				if (FightScreen.hitpoints1 <= damage) {
					FightScreen.hitpoints1 = 0;
					FightScreen.lblStamina1.setText("0%");
					
					FightScreen.finish = "TKO";
					FightScreen.time = "1:15";
					FightScreen.winner = 1;
					System.out.println("oppo tko player with " + damage);
					double retStam = (damage / FightScreen.max1) * 100;
					String ret = (FightScreen.opLast + " TKOs " + Weight.Player.last + " WITH GROUND & POUND, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					return ret;
				}
				else {
					FightScreen.hitpoints1 -= damage;
					FightScreen.stam1 = (FightScreen.hitpoints1 / FightScreen.max1) * 100;
					FightScreen.lblStamina1.setText(FightScreen.df1.format(FightScreen.stam1) + "%");
					System.out.println("oppo gave " + damage);
					double retStam = (damage / FightScreen.max1) * 100;
					String ret = (FightScreen.opLast + " ATTACKS WITH GROUND & POUND, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					return ret;
				}
			}
			else {
				// got up
				FightScreen.ground1 = false;
				System.out.println("player got up");
				String ret = (Weight.Player.last + " GETS BACK UP TO HIS FEET");
				return ret;
			}
		}
	}
	
	public static String op4_2(int randomSteady, double randomDamage) {
		if (FightScreen.ground1 == false) {
			double randomSteady1 = (double) randomSteady;
			
			double chance = (10 + (FightScreen.opWrstDbl * 4) + (FightScreen.opSpdDbl * 2) + (FightScreen.opStrDbl * 1) + (FightScreen.opIqDbl * 1) + (FightScreen.opLuckDbl * 1)) - 1;
			
			if (randomSteady1 <= chance) {
				++FightScreen.takeDown2;
				FightScreen.ground1 = true;
				System.out.println("oppo took down player");
				String ret = (FightScreen.opLast + " TAKES DOWN " + Weight.Player.last);
				return ret;
			}
			else {
				// fail
				System.out.println("oppo failed to take down player");
				String ret = (FightScreen.opLast + " ATTEMPTS A TAKE DOWN ON " + Weight.Player.last + ", BUT FAILS");
				return ret;
			}
		}
		else {
			double randomSub = (double) randomSteady;
			double subChance = 80 + (FightScreen.opWrstDbl * 2) - (Weight.Player.wrst * 4) - 1;
			if (randomSub <= (FightScreen.opWrstDbl * 2)) {
				// sub
				FightScreen.hitpoints1 = 0;
				FightScreen.lblStamina1.setText("0%");
				FightScreen.finish = "SUB";
				FightScreen.winner = 1;
				System.out.println("oppo submitted player");
				String ret = (FightScreen.opLast + " SUBMITS " + Weight.Player.last);
				return ret;
			}
			else if (randomSub <= subChance) {
				double damage = (FightScreen.opStrDbl * 4) * (((11 - Weight.Player.chin) * 0.05) + 0.5);
				
				if (FightScreen.hitpoints1 <= damage) {
					FightScreen.hitpoints1 = 0;
					FightScreen.lblStamina1.setText("0%");
					
					FightScreen.finish = "TKO";
					FightScreen.time = "1:15";
					FightScreen.winner = 1;
					System.out.println("oppo tko player with " + damage);
					double retStam = (damage / FightScreen.max1) * 100;
					String ret = (FightScreen.opLast + " TKOs " + Weight.Player.last + " WITH GROUND & POUND, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					return ret;
				}
				else {
					FightScreen.hitpoints1 -= damage;
					FightScreen.stam1 = (FightScreen.hitpoints1 / FightScreen.max1) * 100;
					FightScreen.lblStamina1.setText(FightScreen.df1.format(FightScreen.stam1) + "%");
					System.out.println("oppo gave " + damage);
					double retStam = (damage / FightScreen.max1) * 100;
					String ret = (FightScreen.opLast + " ATTACKS WITH GROUND & POUND, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					return ret;
				}
			}
			else {
				// got up
				FightScreen.ground1 = false;
				System.out.println("player got up");
				String ret = (Weight.Player.last + " GETS BACK UP TO HIS FEET");
				return ret;
			}
		}
	}
	
	public static String op4_3(int randomSteady, double randomDamage) {
		if (FightScreen.ground1 == false) {
			double randomSteady1 = (double) randomSteady;
			
			double chance = (10 + (FightScreen.opWrstDbl * 4) + (FightScreen.opSpdDbl * 2) + (FightScreen.opStrDbl * 1) + (FightScreen.opIqDbl * 1) + (FightScreen.opLuckDbl * 1)) - 1 - (Weight.Player.wrst * 5);
			
			if (randomSteady1 <= chance) {
				++FightScreen.takeDown2;
				FightScreen.ground1 = true;
				System.out.println("oppo took down player");
				String ret = (FightScreen.opLast + " TAKES DOWN " + Weight.Player.last);
				return ret;
			}
			else {
				// fail
				System.out.println("oppo failed to take down player");
				String ret = (Weight.Player.last + " DEFENDS A TAKE DOWN BY " + FightScreen.opLast);
				return ret;
			}
		}
		else {
			double randomSub = (double) randomSteady;
			double subChance = 80 + (FightScreen.opWrstDbl * 2) - (Weight.Player.wrst * 4) - 1;
			if (randomSub <= (FightScreen.opWrstDbl * 2)) {
				// sub
				FightScreen.hitpoints1 = 0;
				FightScreen.lblStamina1.setText("0%");
				FightScreen.finish = "SUB";
				FightScreen.winner = 1;
				System.out.println("oppo submitted player");
				String ret = (FightScreen.opLast + " SUBMITS " + Weight.Player.last);
				return ret;
			}
			else if (randomSub <= subChance) {
				double damage = (FightScreen.opStrDbl * 4) * (((11 - Weight.Player.chin) * 0.05) + 0.5);
				
				if (FightScreen.hitpoints1 <= damage) {
					FightScreen.hitpoints1 = 0;
					FightScreen.lblStamina1.setText("0%");
					
					FightScreen.finish = "TKO";
					FightScreen.time = "1:15";
					FightScreen.winner = 1;
					System.out.println("oppo tko player with " + damage);
					double retStam = (damage / FightScreen.max1) * 100;
					String ret = (FightScreen.opLast + " TKOs " + Weight.Player.last + " WITH GROUND & POUND, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					return ret;
				}
				else {
					FightScreen.hitpoints1 -= damage;
					FightScreen.stam1 = (FightScreen.hitpoints1 / FightScreen.max1) * 100;
					FightScreen.lblStamina1.setText(FightScreen.df1.format(FightScreen.stam1) + "%");
					System.out.println("oppo gave " + damage);
					double retStam = (damage / FightScreen.max1) * 100;
					String ret = (FightScreen.opLast + " ATTACKS WITH GROUND & POUND, DEALING " + FightScreen.df1.format(retStam) + "% DAMAGE");
					return ret;
				}
			}
			else {
				// got up
				FightScreen.ground1 = false;
				System.out.println("player got up");
				String ret = (Weight.Player.last + " GETS BACK UP TO HIS FEET");
				return ret;
			}
		}
	}

}
