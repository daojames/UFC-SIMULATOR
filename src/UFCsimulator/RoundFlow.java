package UFCsimulator;

public class RoundFlow {

	public static void playerFlow(int randomSteady, double randomDamage) {
		if (FightScreen.strat[0] == 1) {
			if (FightScreen.opDef == 1) {
				String ret = SteadyAlgorithm.player1_1(randomSteady, randomDamage);
				switch (FightScreen.labelNum) {
				case 1:
					FightScreen.lblText1.setText(ret);
					break;
				case 2:
					FightScreen.lblText2.setText(ret);
					break;
				case 3:
					FightScreen.lblText3.setText(ret);
					break;
				case 4:
					FightScreen.lblText4.setText(ret);
					break;
				case 5:
					FightScreen.lblText5.setText(ret);
					break;
				case 6:
					FightScreen.lblText6.setText(ret);
					break;
				case 7:
					FightScreen.lblText7.setText(ret);
					break;
				case 8:
					FightScreen.lblText8.setText(ret);
					break;
				}
			}
			else if (FightScreen.opDef == 2) {
				String ret = SteadyAlgorithm.player1_2(randomSteady, randomDamage);
				switch (FightScreen.labelNum) {
				case 1:
					FightScreen.lblText1.setText(ret);
					break;
				case 2:
					FightScreen.lblText2.setText(ret);
					break;
				case 3:
					FightScreen.lblText3.setText(ret);
					break;
				case 4:
					FightScreen.lblText4.setText(ret);
					break;
				case 5:
					FightScreen.lblText5.setText(ret);
					break;
				case 6:
					FightScreen.lblText6.setText(ret);
					break;
				case 7:
					FightScreen.lblText7.setText(ret);
					break;
				case 8:
					FightScreen.lblText8.setText(ret);
					break;
				}
			}
			else {
				String ret = SteadyAlgorithm.player1_3(randomSteady, randomDamage);
				switch (FightScreen.labelNum) {
				case 1:
					FightScreen.lblText1.setText(ret);
					break;
				case 2:
					FightScreen.lblText2.setText(ret);
					break;
				case 3:
					FightScreen.lblText3.setText(ret);
					break;
				case 4:
					FightScreen.lblText4.setText(ret);
					break;
				case 5:
					FightScreen.lblText5.setText(ret);
					break;
				case 6:
					FightScreen.lblText6.setText(ret);
					break;
				case 7:
					FightScreen.lblText7.setText(ret);
					break;
				case 8:
					FightScreen.lblText8.setText(ret);
					break;
				}
			}
			if (FightScreen.hitpoints1 <= 5 && FightScreen.winner == 2) {
				FightScreen.hitpoints1 = 0;
				FightScreen.stam1 = (FightScreen.hitpoints1 / FightScreen.max1) * 100;
				FightScreen.lblStamina1.setText("0%");
				FightScreen.winner = 1;
				FightScreen.finish = "TKO";
				System.out.println("player cannot continue due to exhaustion");
				++FightScreen.labelNum;
				switch (FightScreen.labelNum) {
				case 1:
					FightScreen.lblText1.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 2:
					FightScreen.lblText2.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 3:
					FightScreen.lblText3.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 4:
					FightScreen.lblText4.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 5:
					FightScreen.lblText5.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 6:
					FightScreen.lblText6.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 7:
					FightScreen.lblText7.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 8:
					FightScreen.lblText8.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 9:
					FightScreen.lblText8.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				}
			}
			else if (FightScreen.winner == 1) {
				FightScreen.hitpoints1 = 0;
				FightScreen.lblStamina1.setText("0%");
			}
			else if (FightScreen.hitpoints1 <= 5 && FightScreen.winner == 0) {
				FightScreen.lblStamina1.setText("1%");
			}
			else {
				FightScreen.hitpoints1 -= 5;
				FightScreen.stam1 = (FightScreen.hitpoints1 / FightScreen.max1) * 100;
				FightScreen.lblStamina1.setText(FightScreen.df1.format(FightScreen.stam1) + "%");
				if (FightScreen.hitpoints1 == 0) {
					FightScreen.winner = 1;
					FightScreen.finish = "TKO";
					System.out.println("player cannot continue due to exhaustion");
					++FightScreen.labelNum;
					switch (FightScreen.labelNum) {
					case 1:
						FightScreen.lblText1.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 2:
						FightScreen.lblText2.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 3:
						FightScreen.lblText3.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 4:
						FightScreen.lblText4.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 5:
						FightScreen.lblText5.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 6:
						FightScreen.lblText6.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 7:
						FightScreen.lblText7.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 8:
						FightScreen.lblText8.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 9:
						FightScreen.lblText8.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					}
				}
			}
		}
		
		else if (FightScreen.strat[0] == 2) {
			if (FightScreen.opDef == 1) {
				String ret = BrawlAlgorithm.player2_1(randomSteady, randomDamage);
				switch (FightScreen.labelNum) {
				case 1:
					FightScreen.lblText1.setText(ret);
					break;
				case 2:
					FightScreen.lblText2.setText(ret);
					break;
				case 3:
					FightScreen.lblText3.setText(ret);
					break;
				case 4:
					FightScreen.lblText4.setText(ret);
					break;
				case 5:
					FightScreen.lblText5.setText(ret);
					break;
				case 6:
					FightScreen.lblText6.setText(ret);
					break;
				case 7:
					FightScreen.lblText7.setText(ret);
					break;
				case 8:
					FightScreen.lblText8.setText(ret);
					break;
				}
			}
			else if (FightScreen.opDef == 2) {
				String ret = BrawlAlgorithm.player2_2(randomSteady, randomDamage);
				switch (FightScreen.labelNum) {
				case 1:
					FightScreen.lblText1.setText(ret);
					break;
				case 2:
					FightScreen.lblText2.setText(ret);
					break;
				case 3:
					FightScreen.lblText3.setText(ret);
					break;
				case 4:
					FightScreen.lblText4.setText(ret);
					break;
				case 5:
					FightScreen.lblText5.setText(ret);
					break;
				case 6:
					FightScreen.lblText6.setText(ret);
					break;
				case 7:
					FightScreen.lblText7.setText(ret);
					break;
				case 8:
					FightScreen.lblText8.setText(ret);
					break;
				}
			}
			else {
				String ret = BrawlAlgorithm.player2_3(randomSteady, randomDamage);
				switch (FightScreen.labelNum) {
				case 1:
					FightScreen.lblText1.setText(ret);
					break;
				case 2:
					FightScreen.lblText2.setText(ret);
					break;
				case 3:
					FightScreen.lblText3.setText(ret);
					break;
				case 4:
					FightScreen.lblText4.setText(ret);
					break;
				case 5:
					FightScreen.lblText5.setText(ret);
					break;
				case 6:
					FightScreen.lblText6.setText(ret);
					break;
				case 7:
					FightScreen.lblText7.setText(ret);
					break;
				case 8:
					FightScreen.lblText8.setText(ret);
					break;
				}
			}
			if (FightScreen.hitpoints1 <= 8 && FightScreen.winner == 2) {
				FightScreen.hitpoints1 = 0;
				FightScreen.stam1 = (FightScreen.hitpoints1 / FightScreen.max1) * 100;
				FightScreen.lblStamina1.setText("0%");
				FightScreen.winner = 1;
				FightScreen.finish = "TKO";
				System.out.println("player cannot continue due to exhaustion");
				++FightScreen.labelNum;
				switch (FightScreen.labelNum) {
				case 1:
					FightScreen.lblText1.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 2:
					FightScreen.lblText2.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 3:
					FightScreen.lblText3.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 4:
					FightScreen.lblText4.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 5:
					FightScreen.lblText5.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 6:
					FightScreen.lblText6.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 7:
					FightScreen.lblText7.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 8:
					FightScreen.lblText8.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 9:
					FightScreen.lblText8.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				}
			}
			else if (FightScreen.winner == 1) {
				FightScreen.hitpoints1 = 0;
				FightScreen.lblStamina1.setText("0%");
			}
			else if (FightScreen.hitpoints1 <= 8 && FightScreen.winner == 0) {
				FightScreen.lblStamina1.setText("1%");
			}
			else {
				FightScreen.hitpoints1 -= 8;
				FightScreen.stam1 = (FightScreen.hitpoints1 / FightScreen.max1) * 100;
				FightScreen.lblStamina1.setText(FightScreen.df1.format(FightScreen.stam1) + "%");
				if (FightScreen.hitpoints1 == 0) {
					FightScreen.winner = 1;
					FightScreen.finish = "TKO";
					System.out.println("player cannot continue due to exhaustion");
					++FightScreen.labelNum;
					switch (FightScreen.labelNum) {
					case 1:
						FightScreen.lblText1.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 2:
						FightScreen.lblText2.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 3:
						FightScreen.lblText3.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 4:
						FightScreen.lblText4.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 5:
						FightScreen.lblText5.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 6:
						FightScreen.lblText6.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 7:
						FightScreen.lblText7.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 8:
						FightScreen.lblText8.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 9:
						FightScreen.lblText8.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					}
				}
			}
		}
		
		else if (FightScreen.strat[0] == 3) {
			if (FightScreen.opDef == 1) {
				String ret = BlitzAlgorithm.player3_1(randomSteady, randomDamage);
				switch (FightScreen.labelNum) {
				case 1:
					FightScreen.lblText1.setText(ret);
					break;
				case 2:
					FightScreen.lblText2.setText(ret);
					break;
				case 3:
					FightScreen.lblText3.setText(ret);
					break;
				case 4:
					FightScreen.lblText4.setText(ret);
					break;
				case 5:
					FightScreen.lblText5.setText(ret);
					break;
				case 6:
					FightScreen.lblText6.setText(ret);
					break;
				case 7:
					FightScreen.lblText7.setText(ret);
					break;
				case 8:
					FightScreen.lblText8.setText(ret);
					break;
				}
			}
			else if (FightScreen.opDef == 2) {
				String ret = BlitzAlgorithm.player3_2(randomSteady, randomDamage);
				switch (FightScreen.labelNum) {
				case 1:
					FightScreen.lblText1.setText(ret);
					break;
				case 2:
					FightScreen.lblText2.setText(ret);
					break;
				case 3:
					FightScreen.lblText3.setText(ret);
					break;
				case 4:
					FightScreen.lblText4.setText(ret);
					break;
				case 5:
					FightScreen.lblText5.setText(ret);
					break;
				case 6:
					FightScreen.lblText6.setText(ret);
					break;
				case 7:
					FightScreen.lblText7.setText(ret);
					break;
				case 8:
					FightScreen.lblText8.setText(ret);
					break;
				}
			}
			else {
				String ret = BlitzAlgorithm.player3_3(randomSteady, randomDamage);
				switch (FightScreen.labelNum) {
				case 1:
					FightScreen.lblText1.setText(ret);
					break;
				case 2:
					FightScreen.lblText2.setText(ret);
					break;
				case 3:
					FightScreen.lblText3.setText(ret);
					break;
				case 4:
					FightScreen.lblText4.setText(ret);
					break;
				case 5:
					FightScreen.lblText5.setText(ret);
					break;
				case 6:
					FightScreen.lblText6.setText(ret);
					break;
				case 7:
					FightScreen.lblText7.setText(ret);
					break;
				case 8:
					FightScreen.lblText8.setText(ret);
					break;
				}
			}
			if (FightScreen.hitpoints1 <= 8 && FightScreen.winner == 2) {
				FightScreen.hitpoints1 = 0;
				FightScreen.stam1 = (FightScreen.hitpoints1 / FightScreen.max1) * 100;
				FightScreen.lblStamina1.setText("0%");
				FightScreen.winner = 1;
				FightScreen.finish = "TKO";
				System.out.println("player cannot continue due to exhaustion");
				++FightScreen.labelNum;
				switch (FightScreen.labelNum) {
				case 1:
					FightScreen.lblText1.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 2:
					FightScreen.lblText2.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 3:
					FightScreen.lblText3.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 4:
					FightScreen.lblText4.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 5:
					FightScreen.lblText5.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 6:
					FightScreen.lblText6.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 7:
					FightScreen.lblText7.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 8:
					FightScreen.lblText8.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 9:
					FightScreen.lblText8.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				}
			}
			else if (FightScreen.winner == 1) {
				FightScreen.hitpoints1 = 0;
				FightScreen.lblStamina1.setText("0%");
			}
			else if (FightScreen.hitpoints1 <= 8 && FightScreen.winner == 0) {
				FightScreen.lblStamina1.setText("1%");
			}
			else {
				FightScreen.hitpoints1 -= 8;
				FightScreen.stam1 = (FightScreen.hitpoints1 / FightScreen.max1) * 100;
				FightScreen.lblStamina1.setText(FightScreen.df1.format(FightScreen.stam1) + "%");
				if (FightScreen.hitpoints1 == 0) {
					FightScreen.winner = 1;
					FightScreen.finish = "TKO";
					System.out.println("player cannot continue due to exhaustion");
					++FightScreen.labelNum;
					switch (FightScreen.labelNum) {
					case 1:
						FightScreen.lblText1.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 2:
						FightScreen.lblText2.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 3:
						FightScreen.lblText3.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 4:
						FightScreen.lblText4.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 5:
						FightScreen.lblText5.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 6:
						FightScreen.lblText6.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 7:
						FightScreen.lblText7.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 8:
						FightScreen.lblText8.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 9:
						FightScreen.lblText8.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					}
				}
			}
		}
		
		else if (FightScreen.strat[0] == 4) {
			if (FightScreen.opDef == 1) {
				String ret = MaulAlgorithm.player4_1(randomSteady, randomDamage);
				switch (FightScreen.labelNum) {
				case 1:
					FightScreen.lblText1.setText(ret);
					break;
				case 2:
					FightScreen.lblText2.setText(ret);
					break;
				case 3:
					FightScreen.lblText3.setText(ret);
					break;
				case 4:
					FightScreen.lblText4.setText(ret);
					break;
				case 5:
					FightScreen.lblText5.setText(ret);
					break;
				case 6:
					FightScreen.lblText6.setText(ret);
					break;
				case 7:
					FightScreen.lblText7.setText(ret);
					break;
				case 8:
					FightScreen.lblText8.setText(ret);
					break;
				}
			}
			else if (FightScreen.opDef == 2) {
				String ret = MaulAlgorithm.player4_2(randomSteady, randomDamage);
				switch (FightScreen.labelNum) {
				case 1:
					FightScreen.lblText1.setText(ret);
					break;
				case 2:
					FightScreen.lblText2.setText(ret);
					break;
				case 3:
					FightScreen.lblText3.setText(ret);
					break;
				case 4:
					FightScreen.lblText4.setText(ret);
					break;
				case 5:
					FightScreen.lblText5.setText(ret);
					break;
				case 6:
					FightScreen.lblText6.setText(ret);
					break;
				case 7:
					FightScreen.lblText7.setText(ret);
					break;
				case 8:
					FightScreen.lblText8.setText(ret);
					break;
				}
			}
			else {
				String ret = MaulAlgorithm.player4_3(randomSteady, randomDamage);
				switch (FightScreen.labelNum) {
				case 1:
					FightScreen.lblText1.setText(ret);
					break;
				case 2:
					FightScreen.lblText2.setText(ret);
					break;
				case 3:
					FightScreen.lblText3.setText(ret);
					break;
				case 4:
					FightScreen.lblText4.setText(ret);
					break;
				case 5:
					FightScreen.lblText5.setText(ret);
					break;
				case 6:
					FightScreen.lblText6.setText(ret);
					break;
				case 7:
					FightScreen.lblText7.setText(ret);
					break;
				case 8:
					FightScreen.lblText8.setText(ret);
					break;
				}
			}
			if (FightScreen.hitpoints1 <= 8 && FightScreen.winner == 2) {
				FightScreen.hitpoints1 = 0;
				FightScreen.stam1 = (FightScreen.hitpoints1 / FightScreen.max1) * 100;
				FightScreen.lblStamina1.setText("0%");
				FightScreen.winner = 1;
				FightScreen.finish = "TKO";
				System.out.println("player cannot continue due to exhaustion");
				++FightScreen.labelNum;
				switch (FightScreen.labelNum) {
				case 1:
					FightScreen.lblText1.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 2:
					FightScreen.lblText2.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 3:
					FightScreen.lblText3.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 4:
					FightScreen.lblText4.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 5:
					FightScreen.lblText5.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 6:
					FightScreen.lblText6.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 7:
					FightScreen.lblText7.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 8:
					FightScreen.lblText8.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 9:
					FightScreen.lblText8.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				}
			}
			else if (FightScreen.winner == 1) {
				FightScreen.hitpoints1 = 0;
				FightScreen.lblStamina1.setText("0%");
			}
			else if (FightScreen.hitpoints1 <= 8 && FightScreen.winner == 0) {
				FightScreen.lblStamina1.setText("1%");
			}
			else {
				FightScreen.hitpoints1 -= 8;
				FightScreen.stam1 = (FightScreen.hitpoints1 / FightScreen.max1) * 100;
				FightScreen.lblStamina1.setText(FightScreen.df1.format(FightScreen.stam1) + "%");
				if (FightScreen.hitpoints1 == 0) {
					FightScreen.winner = 1;
					FightScreen.finish = "TKO";
					System.out.println("player cannot continue due to exhaustion");
					++FightScreen.labelNum;
					switch (FightScreen.labelNum) {
					case 1:
						FightScreen.lblText1.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 2:
						FightScreen.lblText2.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 3:
						FightScreen.lblText3.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 4:
						FightScreen.lblText4.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 5:
						FightScreen.lblText5.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 6:
						FightScreen.lblText6.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 7:
						FightScreen.lblText7.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 8:
						FightScreen.lblText8.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 9:
						FightScreen.lblText8.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					}
				}
			}
		}
		
		else {
			System.out.println("player ran around the cage");
			switch (FightScreen.labelNum) {
			case 1:
				FightScreen.lblText1.setText(Weight.Player.last + " PASSIVELY READS " + FightScreen.opLast + "'S ATTACKS");
				break;
			case 2:
				FightScreen.lblText2.setText(Weight.Player.last + " PASSIVELY READS " + FightScreen.opLast + "'S ATTACKS");
				break;
			case 3:
				FightScreen.lblText3.setText(Weight.Player.last + " PASSIVELY READS " + FightScreen.opLast + "'S ATTACKS");
				break;
			case 4:
				FightScreen.lblText4.setText(Weight.Player.last + " PASSIVELY READS " + FightScreen.opLast + "'S ATTACKS");
				break;
			case 5:
				FightScreen.lblText5.setText(Weight.Player.last + " PASSIVELY READS " + FightScreen.opLast + "'S ATTACKS");
				break;
			case 6:
				FightScreen.lblText6.setText(Weight.Player.last + " PASSIVELY READS " + FightScreen.opLast + "'S ATTACKS");
				break;
			case 7:
				FightScreen.lblText7.setText(Weight.Player.last + " PASSIVELY READS " + FightScreen.opLast + "'S ATTACKS");
				break;
			case 8:
				FightScreen.lblText8.setText(Weight.Player.last + " PASSIVELY READS " + FightScreen.opLast + "'S ATTACKS");
				break;
			}
			++FightScreen.timesRead1;
			Weight.Player.iq += 1;
			if (FightScreen.hitpoints1 <= 5 && FightScreen.winner == 2) {
				FightScreen.hitpoints1 = 0;
				FightScreen.stam1 = (FightScreen.hitpoints1 / FightScreen.max1) * 100;
				FightScreen.lblStamina1.setText("0%");
				FightScreen.winner = 1;
				FightScreen.finish = "TKO";
				System.out.println("player cannot continue due to exhaustion");
				++FightScreen.labelNum;
				switch (FightScreen.labelNum) {
				case 1:
					FightScreen.lblText1.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 2:
					FightScreen.lblText2.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 3:
					FightScreen.lblText3.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 4:
					FightScreen.lblText4.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 5:
					FightScreen.lblText5.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 6:
					FightScreen.lblText6.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 7:
					FightScreen.lblText7.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 8:
					FightScreen.lblText8.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 9:
					FightScreen.lblText8.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				}
			}
			else if (FightScreen.winner == 1) {
				FightScreen.hitpoints1 = 0;
				FightScreen.lblStamina1.setText("0%");
			}
			else if (FightScreen.hitpoints1 <= 5 && FightScreen.winner == 0) {
				FightScreen.lblStamina1.setText("1%");
			}
			else {
				FightScreen.hitpoints1 -= 5;
				FightScreen.stam1 = (FightScreen.hitpoints1 / FightScreen.max1) * 100;
				FightScreen.lblStamina1.setText(FightScreen.df1.format(FightScreen.stam1) + "%");
				if (FightScreen.hitpoints1 == 0) {
					FightScreen.winner = 1;
					FightScreen.finish = "TKO";
					System.out.println("player cannot continue due to exhaustion");
					++FightScreen.labelNum;
					switch (FightScreen.labelNum) {
					case 1:
						FightScreen.lblText1.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 2:
						FightScreen.lblText2.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 3:
						FightScreen.lblText3.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 4:
						FightScreen.lblText4.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 5:
						FightScreen.lblText5.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 6:
						FightScreen.lblText6.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 7:
						FightScreen.lblText7.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 8:
						FightScreen.lblText8.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 9:
						FightScreen.lblText8.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					}
				}
			}
		}
	}
	
	public static void opFlow(int randomSteady, double randomDamage) {
		if (FightScreen.opStrat == 1) {
			if (FightScreen.strat[1] == 1) {
				String ret = SteadyAlgorithm.op1_1(randomSteady, randomDamage);
				switch (FightScreen.labelNum) {
				case 1:
					FightScreen.lblText1.setText(ret);
					break;
				case 2:
					FightScreen.lblText2.setText(ret);
					break;
				case 3:
					FightScreen.lblText3.setText(ret);
					break;
				case 4:
					FightScreen.lblText4.setText(ret);
					break;
				case 5:
					FightScreen.lblText5.setText(ret);
					break;
				case 6:
					FightScreen.lblText6.setText(ret);
					break;
				case 7:
					FightScreen.lblText7.setText(ret);
					break;
				case 8:
					FightScreen.lblText8.setText(ret);
					break;
				}
			}
			else if (FightScreen.strat[1] == 2) {
				String ret = SteadyAlgorithm.op1_2(randomSteady, randomDamage);
				switch (FightScreen.labelNum) {
				case 1:
					FightScreen.lblText1.setText(ret);
					break;
				case 2:
					FightScreen.lblText2.setText(ret);
					break;
				case 3:
					FightScreen.lblText3.setText(ret);
					break;
				case 4:
					FightScreen.lblText4.setText(ret);
					break;
				case 5:
					FightScreen.lblText5.setText(ret);
					break;
				case 6:
					FightScreen.lblText6.setText(ret);
					break;
				case 7:
					FightScreen.lblText7.setText(ret);
					break;
				case 8:
					FightScreen.lblText8.setText(ret);
					break;
				}
			}
			else {
				String ret = SteadyAlgorithm.op1_3(randomSteady, randomDamage);
				switch (FightScreen.labelNum) {
				case 1:
					FightScreen.lblText1.setText(ret);
					break;
				case 2:
					FightScreen.lblText2.setText(ret);
					break;
				case 3:
					FightScreen.lblText3.setText(ret);
					break;
				case 4:
					FightScreen.lblText4.setText(ret);
					break;
				case 5:
					FightScreen.lblText5.setText(ret);
					break;
				case 6:
					FightScreen.lblText6.setText(ret);
					break;
				case 7:
					FightScreen.lblText7.setText(ret);
					break;
				case 8:
					FightScreen.lblText8.setText(ret);
					break;
				}
			}
			if (FightScreen.hitpoints2 <= 5 && FightScreen.winner == 2) {
				FightScreen.hitpoints2 = 0;
				FightScreen.stam2 = (FightScreen.hitpoints2 / FightScreen.max2) * 100;
				FightScreen.lblStamina2.setText("0%");
				FightScreen.winner = 0;
				FightScreen.finish = "TKO";
				System.out.println("oppo cannot continue due to exhaustion");
				++FightScreen.labelNum;
				switch (FightScreen.labelNum) {
				case 1:
					FightScreen.lblText1.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 2:
					FightScreen.lblText2.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 3:
					FightScreen.lblText3.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 4:
					FightScreen.lblText4.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 5:
					FightScreen.lblText5.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 6:
					FightScreen.lblText6.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 7:
					FightScreen.lblText7.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 8:
					FightScreen.lblText8.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 9:
					FightScreen.lblText8.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				}
			}
			else if (FightScreen.winner == 0) {
				FightScreen.hitpoints2 = 0;
				FightScreen.lblStamina2.setText("0%");
			}
			else if (FightScreen.hitpoints2 <= 5 && FightScreen.winner == 1) {
				FightScreen.lblStamina2.setText("1%");
			}
			else {
				FightScreen.hitpoints2 -= 5;
				FightScreen.stam2 = (FightScreen.hitpoints2 / FightScreen.max2) * 100;
				FightScreen.lblStamina2.setText(FightScreen.df1.format(FightScreen.stam2) + "%");
				if (FightScreen.hitpoints2 == 0) {
					FightScreen.winner = 0;
					FightScreen.finish = "TKO";
					System.out.println("oppo cannot continue due to exhaustion");
					++FightScreen.labelNum;
					switch (FightScreen.labelNum) {
					case 1:
						FightScreen.lblText1.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 2:
						FightScreen.lblText2.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 3:
						FightScreen.lblText3.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 4:
						FightScreen.lblText4.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 5:
						FightScreen.lblText5.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 6:
						FightScreen.lblText6.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 7:
						FightScreen.lblText7.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 8:
						FightScreen.lblText8.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 9:
						FightScreen.lblText8.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					}
				}
			}
		}
		
		else if (FightScreen.opStrat == 2) {
			if (FightScreen.strat[1] == 1) {
				String ret = BrawlAlgorithm.op2_1(randomSteady, randomDamage);
				switch (FightScreen.labelNum) {
				case 1:
					FightScreen.lblText1.setText(ret);
					break;
				case 2:
					FightScreen.lblText2.setText(ret);
					break;
				case 3:
					FightScreen.lblText3.setText(ret);
					break;
				case 4:
					FightScreen.lblText4.setText(ret);
					break;
				case 5:
					FightScreen.lblText5.setText(ret);
					break;
				case 6:
					FightScreen.lblText6.setText(ret);
					break;
				case 7:
					FightScreen.lblText7.setText(ret);
					break;
				case 8:
					FightScreen.lblText8.setText(ret);
					break;
				}
			}
			else if (FightScreen.strat[1] == 2) {
				String ret = BrawlAlgorithm.op2_2(randomSteady, randomDamage);
				switch (FightScreen.labelNum) {
				case 1:
					FightScreen.lblText1.setText(ret);
					break;
				case 2:
					FightScreen.lblText2.setText(ret);
					break;
				case 3:
					FightScreen.lblText3.setText(ret);
					break;
				case 4:
					FightScreen.lblText4.setText(ret);
					break;
				case 5:
					FightScreen.lblText5.setText(ret);
					break;
				case 6:
					FightScreen.lblText6.setText(ret);
					break;
				case 7:
					FightScreen.lblText7.setText(ret);
					break;
				case 8:
					FightScreen.lblText8.setText(ret);
					break;
				}
			}
			else {
				String ret = BrawlAlgorithm.op2_3(randomSteady, randomDamage);
				switch (FightScreen.labelNum) {
				case 1:
					FightScreen.lblText1.setText(ret);
					break;
				case 2:
					FightScreen.lblText2.setText(ret);
					break;
				case 3:
					FightScreen.lblText3.setText(ret);
					break;
				case 4:
					FightScreen.lblText4.setText(ret);
					break;
				case 5:
					FightScreen.lblText5.setText(ret);
					break;
				case 6:
					FightScreen.lblText6.setText(ret);
					break;
				case 7:
					FightScreen.lblText7.setText(ret);
					break;
				case 8:
					FightScreen.lblText8.setText(ret);
					break;
				}
			}
			if (FightScreen.hitpoints2 <= 8 && FightScreen.winner == 2) {
				FightScreen.hitpoints2 = 0;
				FightScreen.stam2 = (FightScreen.hitpoints2 / FightScreen.max2) * 100;
				FightScreen.lblStamina2.setText("0%");
				FightScreen.winner = 0;
				FightScreen.finish = "TKO";
				System.out.println("oppo cannot continue due to exhaustion");
				++FightScreen.labelNum;
				switch (FightScreen.labelNum) {
				case 1:
					FightScreen.lblText1.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 2:
					FightScreen.lblText2.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 3:
					FightScreen.lblText3.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 4:
					FightScreen.lblText4.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 5:
					FightScreen.lblText5.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 6:
					FightScreen.lblText6.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 7:
					FightScreen.lblText7.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 8:
					FightScreen.lblText8.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 9:
					FightScreen.lblText8.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				}
			}
			else if (FightScreen.winner == 0) {
				FightScreen.hitpoints2 = 0;
				FightScreen.lblStamina2.setText("0%");
			}
			else if (FightScreen.hitpoints2 <= 8 && FightScreen.winner == 1) {
				FightScreen.lblStamina2.setText("1%");
			}
			else {
				FightScreen.hitpoints2 -= 8;
				FightScreen.stam2 = (FightScreen.hitpoints2 / FightScreen.max2) * 100;
				FightScreen.lblStamina2.setText(FightScreen.df1.format(FightScreen.stam2) + "%");
				if (FightScreen.hitpoints2 == 0) {
					FightScreen.winner = 0;
					FightScreen.finish = "TKO";
					System.out.println("oppo cannot continue due to exhaustion");
					++FightScreen.labelNum;
					switch (FightScreen.labelNum) {
					case 1:
						FightScreen.lblText1.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 2:
						FightScreen.lblText2.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 3:
						FightScreen.lblText3.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 4:
						FightScreen.lblText4.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 5:
						FightScreen.lblText5.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 6:
						FightScreen.lblText6.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 7:
						FightScreen.lblText7.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 8:
						FightScreen.lblText8.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 9:
						FightScreen.lblText8.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					}
				}
			}
		}
		
		else if (FightScreen.opStrat == 3) {
			if (FightScreen.strat[1] == 1) {
				String ret = BlitzAlgorithm.op3_1(randomSteady, randomDamage);
				switch (FightScreen.labelNum) {
				case 1:
					FightScreen.lblText1.setText(ret);
					break;
				case 2:
					FightScreen.lblText2.setText(ret);
					break;
				case 3:
					FightScreen.lblText3.setText(ret);
					break;
				case 4:
					FightScreen.lblText4.setText(ret);
					break;
				case 5:
					FightScreen.lblText5.setText(ret);
					break;
				case 6:
					FightScreen.lblText6.setText(ret);
					break;
				case 7:
					FightScreen.lblText7.setText(ret);
					break;
				case 8:
					FightScreen.lblText8.setText(ret);
					break;
				}
			}
			else if (FightScreen.strat[1] == 2) {
				String ret = BlitzAlgorithm.op3_2(randomSteady, randomDamage);
				switch (FightScreen.labelNum) {
				case 1:
					FightScreen.lblText1.setText(ret);
					break;
				case 2:
					FightScreen.lblText2.setText(ret);
					break;
				case 3:
					FightScreen.lblText3.setText(ret);
					break;
				case 4:
					FightScreen.lblText4.setText(ret);
					break;
				case 5:
					FightScreen.lblText5.setText(ret);
					break;
				case 6:
					FightScreen.lblText6.setText(ret);
					break;
				case 7:
					FightScreen.lblText7.setText(ret);
					break;
				case 8:
					FightScreen.lblText8.setText(ret);
					break;
				}
			}
			else {
				String ret = BlitzAlgorithm.op3_3(randomSteady, randomDamage);
				switch (FightScreen.labelNum) {
				case 1:
					FightScreen.lblText1.setText(ret);
					break;
				case 2:
					FightScreen.lblText2.setText(ret);
					break;
				case 3:
					FightScreen.lblText3.setText(ret);
					break;
				case 4:
					FightScreen.lblText4.setText(ret);
					break;
				case 5:
					FightScreen.lblText5.setText(ret);
					break;
				case 6:
					FightScreen.lblText6.setText(ret);
					break;
				case 7:
					FightScreen.lblText7.setText(ret);
					break;
				case 8:
					FightScreen.lblText8.setText(ret);
					break;
				}
			}
			if (FightScreen.hitpoints2 <= 8 && FightScreen.winner == 2) {
				FightScreen.hitpoints2 = 0;
				FightScreen.stam2 = (FightScreen.hitpoints2 / FightScreen.max2) * 100;
				FightScreen.lblStamina2.setText("0%");
				FightScreen.winner = 0;
				FightScreen.finish = "TKO";
				System.out.println("oppo cannot continue due to exhaustion");
				++FightScreen.labelNum;
				switch (FightScreen.labelNum) {
				case 1:
					FightScreen.lblText1.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 2:
					FightScreen.lblText2.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 3:
					FightScreen.lblText3.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 4:
					FightScreen.lblText4.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 5:
					FightScreen.lblText5.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 6:
					FightScreen.lblText6.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 7:
					FightScreen.lblText7.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 8:
					FightScreen.lblText8.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 9:
					FightScreen.lblText8.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				}
			}
			else if (FightScreen.winner == 0) {
				FightScreen.hitpoints2 = 0;
				FightScreen.lblStamina2.setText("0%");
			}
			else if (FightScreen.hitpoints2 <= 8 && FightScreen.winner == 1) {
				FightScreen.lblStamina2.setText("1%");
			}
			else {
				FightScreen.hitpoints2 -= 8;
				FightScreen.stam2 = (FightScreen.hitpoints2 / FightScreen.max2) * 100;
				FightScreen.lblStamina2.setText(FightScreen.df1.format(FightScreen.stam2) + "%");
				if (FightScreen.hitpoints2 == 0) {
					FightScreen.winner = 0;
					FightScreen.finish = "TKO";
					System.out.println("oppo cannot continue due to exhaustion");
					++FightScreen.labelNum;
					switch (FightScreen.labelNum) {
					case 1:
						FightScreen.lblText1.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 2:
						FightScreen.lblText2.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 3:
						FightScreen.lblText3.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 4:
						FightScreen.lblText4.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 5:
						FightScreen.lblText5.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 6:
						FightScreen.lblText6.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 7:
						FightScreen.lblText7.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 8:
						FightScreen.lblText8.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 9:
						FightScreen.lblText8.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					}
				}
			}
		}
		
		else if (FightScreen.opStrat == 4) {
			if (FightScreen.strat[1] == 1) {
				String ret = MaulAlgorithm.op4_1(randomSteady, randomDamage);
				switch (FightScreen.labelNum) {
				case 1:
					FightScreen.lblText1.setText(ret);
					break;
				case 2:
					FightScreen.lblText2.setText(ret);
					break;
				case 3:
					FightScreen.lblText3.setText(ret);
					break;
				case 4:
					FightScreen.lblText4.setText(ret);
					break;
				case 5:
					FightScreen.lblText5.setText(ret);
					break;
				case 6:
					FightScreen.lblText6.setText(ret);
					break;
				case 7:
					FightScreen.lblText7.setText(ret);
					break;
				case 8:
					FightScreen.lblText8.setText(ret);
					break;
				}
			}
			else if (FightScreen.strat[1] == 2) {
				String ret = MaulAlgorithm.op4_2(randomSteady, randomDamage);
				switch (FightScreen.labelNum) {
				case 1:
					FightScreen.lblText1.setText(ret);
					break;
				case 2:
					FightScreen.lblText2.setText(ret);
					break;
				case 3:
					FightScreen.lblText3.setText(ret);
					break;
				case 4:
					FightScreen.lblText4.setText(ret);
					break;
				case 5:
					FightScreen.lblText5.setText(ret);
					break;
				case 6:
					FightScreen.lblText6.setText(ret);
					break;
				case 7:
					FightScreen.lblText7.setText(ret);
					break;
				case 8:
					FightScreen.lblText8.setText(ret);
					break;
				}
			}
			else {
				String ret = MaulAlgorithm.op4_3(randomSteady, randomDamage);
				switch (FightScreen.labelNum) {
				case 1:
					FightScreen.lblText1.setText(ret);
					break;
				case 2:
					FightScreen.lblText2.setText(ret);
					break;
				case 3:
					FightScreen.lblText3.setText(ret);
					break;
				case 4:
					FightScreen.lblText4.setText(ret);
					break;
				case 5:
					FightScreen.lblText5.setText(ret);
					break;
				case 6:
					FightScreen.lblText6.setText(ret);
					break;
				case 7:
					FightScreen.lblText7.setText(ret);
					break;
				case 8:
					FightScreen.lblText8.setText(ret);
					break;
				}
			}
			if (FightScreen.hitpoints2 <= 8 && FightScreen.winner == 2) {
				FightScreen.hitpoints2 = 0;
				FightScreen.stam2 = (FightScreen.hitpoints2 / FightScreen.max2) * 100;
				FightScreen.lblStamina2.setText("0%");
				FightScreen.winner = 0;
				FightScreen.finish = "TKO";
				System.out.println("oppo cannot continue due to exhaustion");
				++FightScreen.labelNum;
				switch (FightScreen.labelNum) {
				case 1:
					FightScreen.lblText1.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 2:
					FightScreen.lblText2.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 3:
					FightScreen.lblText3.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 4:
					FightScreen.lblText4.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 5:
					FightScreen.lblText5.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 6:
					FightScreen.lblText6.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 7:
					FightScreen.lblText7.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 8:
					FightScreen.lblText8.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 9:
					FightScreen.lblText8.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				}
			}
			else if (FightScreen.winner == 0) {
				FightScreen.hitpoints2 = 0;
				FightScreen.lblStamina2.setText("0%");
			}
			else if (FightScreen.hitpoints2 <= 8 && FightScreen.winner == 1) {
				FightScreen.lblStamina2.setText("1%");
			}
			else {
				FightScreen.hitpoints2 -= 8;
				FightScreen.stam2 = (FightScreen.hitpoints2 / FightScreen.max2) * 100;
				FightScreen.lblStamina2.setText(FightScreen.df1.format(FightScreen.stam2) + "%");
				if (FightScreen.hitpoints2 == 0) {
					FightScreen.winner = 0;
					FightScreen.finish = "TKO";
					System.out.println("oppo cannot continue due to exhaustion");
					++FightScreen.labelNum;
					switch (FightScreen.labelNum) {
					case 1:
						FightScreen.lblText1.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 2:
						FightScreen.lblText2.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 3:
						FightScreen.lblText3.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 4:
						FightScreen.lblText4.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 5:
						FightScreen.lblText5.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 6:
						FightScreen.lblText6.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 7:
						FightScreen.lblText7.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 8:
						FightScreen.lblText8.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 9:
						FightScreen.lblText8.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					}
				}
			}
		}
		
		else {
			System.out.println("oppo ran around the cage");
			switch (FightScreen.labelNum) {
			case 1:
				FightScreen.lblText1.setText(FightScreen.opLast + " PASSIVELY READS " + Weight.Player.last + "'S ATTACKS");
				break;
			case 2:
				FightScreen.lblText2.setText(FightScreen.opLast + " PASSIVELY READS " + Weight.Player.last + "'S ATTACKS");
				break;
			case 3:
				FightScreen.lblText3.setText(FightScreen.opLast + " PASSIVELY READS " + Weight.Player.last + "'S ATTACKS");
				break;
			case 4:
				FightScreen.lblText4.setText(FightScreen.opLast + " PASSIVELY READS " + Weight.Player.last + "'S ATTACKS");
				break;
			case 5:
				FightScreen.lblText5.setText(FightScreen.opLast + " PASSIVELY READS " + Weight.Player.last + "'S ATTACKS");
				break;
			case 6:
				FightScreen.lblText6.setText(FightScreen.opLast + " PASSIVELY READS " + Weight.Player.last + "'S ATTACKS");
				break;
			case 7:
				FightScreen.lblText7.setText(FightScreen.opLast + " PASSIVELY READS " + Weight.Player.last + "'S ATTACKS");
				break;
			case 8:
				FightScreen.lblText8.setText(FightScreen.opLast + " PASSIVELY READS " + Weight.Player.last + "'S ATTACKS");
				break;
			}
			++FightScreen.timesRead2;
			FightScreen.opIqDbl += 1;
			if (FightScreen.hitpoints2 <= 5 && FightScreen.winner == 2) {
				FightScreen.hitpoints2 = 0;
				FightScreen.stam2 = (FightScreen.hitpoints2 / FightScreen.max2) * 100;
				FightScreen.lblStamina2.setText("0%");
				FightScreen.winner = 0;
				FightScreen.finish = "TKO";
				System.out.println("oppo cannot continue due to exhaustion");
				++FightScreen.labelNum;
				switch (FightScreen.labelNum) {
				case 1:
					FightScreen.lblText1.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 2:
					FightScreen.lblText2.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 3:
					FightScreen.lblText3.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 4:
					FightScreen.lblText4.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 5:
					FightScreen.lblText5.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 6:
					FightScreen.lblText6.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 7:
					FightScreen.lblText7.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 8:
					FightScreen.lblText8.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				case 9:
					FightScreen.lblText8.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
					break;
				}
			}
			else if (FightScreen.winner == 0) {
				FightScreen.hitpoints2 = 0;
				FightScreen.lblStamina2.setText("0%");
			}
			else if (FightScreen.hitpoints2 <= 5 && FightScreen.winner == 1) {
				FightScreen.lblStamina2.setText("1%");
			}
			else {
				FightScreen.hitpoints2 -= 5;
				FightScreen.stam2 = (FightScreen.hitpoints2 / FightScreen.max2) * 100;
				FightScreen.lblStamina2.setText(FightScreen.df1.format(FightScreen.stam2) + "%");
				if (FightScreen.hitpoints2 == 0) {
					FightScreen.winner = 0;
					FightScreen.finish = "TKO";
					System.out.println("oppo cannot continue due to exhaustion");
					++FightScreen.labelNum;
					switch (FightScreen.labelNum) {
					case 1:
						FightScreen.lblText1.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 2:
						FightScreen.lblText2.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 3:
						FightScreen.lblText3.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 4:
						FightScreen.lblText4.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 5:
						FightScreen.lblText5.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 6:
						FightScreen.lblText6.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 7:
						FightScreen.lblText7.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 8:
						FightScreen.lblText8.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					case 9:
						FightScreen.lblText8.setText(FightScreen.opLast + " CANNOT CONTINUE DUE TO EXHAUSTION");
						break;
					}
				}
			}
		}
	}

}
