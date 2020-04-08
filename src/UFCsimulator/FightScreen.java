package UFCsimulator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FightScreen {

	static JPanel fightCamp, steady, brawl, blitz, maul, read, counter, handsUp, handsDown, offense, defense, fight, overview, overviewNum, overview1, overviewNum1, name1, name2, stamina1, stamina2, tott, tottList, tottNum1, tottNum2, tottName1, tottName2, tottRecord1, tottRecord2, fight1, fightRound, fight2, finishFight, done;
	
	static JLabel lblFightCamp, lblOffense, lblDefense, lblOverview, lblOverviewNum, lblOverview1, lblOverviewNum1, lblName1, lblName2, lblStamina1, lblStamina2, lblStaminaName1, lblStaminaName2, lblTott, lblTottList, lblTottNum1, lblTottNum2, lblTottName1, lblTottName2, lblTottRecord1, lblTottRecord2, lblFightRound;
	
	static JButton btnSteady, btnBrawl, btnBlitz, btnMaul, btnRead, btnCounter, btnHandsUp, btnHandsDown, btnFight, btnFight1, btnFight2, btnFinishFight, btnDone;
	
	static JPanel fightText, finishText, moneyText, strat1Text, strat2Text;
	static JLabel lblText1, lblText2, lblText3, lblText4, lblText5, lblText6, lblText7, lblText8, lblText9, lblFinish1, lblFinish2, lblFinish3, lblFinish4, lblFinish5, lblFinish6, lblMoney1, lblMoney2, lblMoney3, lblMoney4, lblMoney5, lblMoney6, lblStrat1, lblStrat1_1, lblStrat2, lblStrat2_1;
	
	static steadyFightScreenHandler steadyFightHandler = new steadyFightScreenHandler();
	static brawlFightScreenHandler brawlFightHandler = new brawlFightScreenHandler();
	static blitzFightScreenHandler blitzFightHandler = new blitzFightScreenHandler();
	static maulFightScreenHandler maulFightHandler = new maulFightScreenHandler();
	static readFightScreenHandler readFightHandler = new readFightScreenHandler();
	static counterFightScreenHandler counterFightHandler = new counterFightScreenHandler();
	static handsUpFightScreenHandler handsUpFightHandler = new handsUpFightScreenHandler();
	static handsDownFightScreenHandler handsDownFightHandler = new handsDownFightScreenHandler();
	static Fight1ScreenHandler fight1Handler = new Fight1ScreenHandler();
	static FightScreenHandler fightHandler = new FightScreenHandler();
	static Fight2ScreenHandler fight2Handler = new Fight2ScreenHandler();
	static FinishFightScreenHandler finishFightHandler = new FinishFightScreenHandler();
	static DoneFightScreenHandler doneFightHandler = new DoneFightScreenHandler();
	
	static DecimalFormat df = new DecimalFormat("0.0");
	static DecimalFormat df1 = new DecimalFormat("0");
	
	static int round = 1;
	static int[] strat = new int[2];
	static int opStrat, opDef;
	static double stam1, stam2;
	static double hitpoints1, hitpoints2;
	static double max1, max2;
	
	static double fightStr;
	static double fightSpd;
	static double fightStm;
	static double fightChin;
	static double fightStrk;
	static double fightWrst;
	static double fightIq;
	static double fightLuck;
	static int fightWgt;
	static int opOverall;
	
	static String opStr = null;
	static String opSpd = null;
	static String opStm = null;
	static String opChin = null;
	static String opStrk = null;
	static String opWrst = null;
	static String opIq = null;
	static String opLuck = null;
	static String opFirst = null;
	static String opLast = null;
	static String opWin = null;
	static String opLoss = null;
	static String opCountry = null;
	
	static double opStrDbl;
	static double opSpdDbl;
	static double opStmDbl;
	static double opChinDbl;
	static double opStrkDbl;
	static double opWrstDbl;
	static double opIqDbl;
	static double opLuckDbl;
	
	static String finish;
	static String time;
	static int winner;
	static Boolean ground1;
	static Boolean ground2;
	static int timesRead1;
	static int timesRead2;
	
	static int maxRounds;
	static int labelNum;
	static int knockDown1;
	static int knockDown2;
	static int takeDown1;
	static int takeDown2;
	static int[][] score = new int[2][5];
	
	public static void fightScreenLoad() {
		
		knockDown1 = 0;
		knockDown2 = 0;
		takeDown1 = 0;
		takeDown2 = 0;
		score[0][0] = 10;
		score[0][1] = 10;
		score[0][2] = 10;
		score[0][3] = 10;
		score[0][4] = 10;
		score[1][0] = 10;
		score[1][1] = 10;
		score[1][2] = 10;
		score[1][3] = 10;
		score[1][4] = 10;
		finish = "0";
		
		fightStr = Weight.Player.str * Weight.Player.recovery;
		fightSpd = Weight.Player.spd * Weight.Player.recovery;
		fightStm = Weight.Player.stm * Weight.Player.recovery;
		fightChin = Weight.Player.chin * Weight.Player.recovery;
		fightStrk = Weight.Player.strk;
		fightWrst = Weight.Player.wrst;
		fightIq = Weight.Player.iq;
		fightLuck = Weight.Player.luck;
		
		switch (PositionScreen.wegt) {
			case 1:
				opStr = String.valueOf(PositionCheck.flyDbl[PositionScreen.posi][0]);
				opSpd = String.valueOf(PositionCheck.flyDbl[PositionScreen.posi][1]);
				opStm = String.valueOf(PositionCheck.flyDbl[PositionScreen.posi][2]);
				opChin = String.valueOf(PositionCheck.flyDbl[PositionScreen.posi][3]);
				opStrk = String.valueOf(PositionCheck.flyDbl[PositionScreen.posi][4]);
				opWrst = String.valueOf(PositionCheck.flyDbl[PositionScreen.posi][5]);
				opIq = String.valueOf(PositionCheck.flyDbl[PositionScreen.posi][6]);
				opLuck = String.valueOf(PositionCheck.flyDbl[PositionScreen.posi][7]);
				opFirst = PositionCheck.flyStr[PositionScreen.posi][0];
				opLast = PositionCheck.flyStr[PositionScreen.posi][1];
				opWin = String.valueOf(PositionCheck.flyInt[PositionScreen.posi][0]);
				opLoss = String.valueOf(PositionCheck.flyInt[PositionScreen.posi][1]);
				opCountry = PositionCheck.flyStr[PositionScreen.posi][2];
				fightWgt = 125;
				break;
			case 2:
				opStr = String.valueOf(PositionCheck.bantamDbl[PositionScreen.posi][0]);
				opSpd = String.valueOf(PositionCheck.bantamDbl[PositionScreen.posi][1]);
				opStm = String.valueOf(PositionCheck.bantamDbl[PositionScreen.posi][2]);
				opChin = String.valueOf(PositionCheck.bantamDbl[PositionScreen.posi][3]);
				opStrk = String.valueOf(PositionCheck.bantamDbl[PositionScreen.posi][4]);
				opWrst = String.valueOf(PositionCheck.bantamDbl[PositionScreen.posi][5]);
				opIq = String.valueOf(PositionCheck.bantamDbl[PositionScreen.posi][6]);
				opLuck = String.valueOf(PositionCheck.bantamDbl[PositionScreen.posi][7]);
				opFirst = PositionCheck.bantamStr[PositionScreen.posi][0];
				opLast = PositionCheck.bantamStr[PositionScreen.posi][1];
				opWin = String.valueOf(PositionCheck.bantamInt[PositionScreen.posi][0]);
				opLoss = String.valueOf(PositionCheck.bantamInt[PositionScreen.posi][1]);
				opCountry = PositionCheck.bantamStr[PositionScreen.posi][2];
				fightWgt = 135;
				break;
			case 3:
				opStr = String.valueOf(PositionCheck.featherDbl[PositionScreen.posi][0]);
				opSpd = String.valueOf(PositionCheck.featherDbl[PositionScreen.posi][1]);
				opStm = String.valueOf(PositionCheck.featherDbl[PositionScreen.posi][2]);
				opChin = String.valueOf(PositionCheck.featherDbl[PositionScreen.posi][3]);
				opStrk = String.valueOf(PositionCheck.featherDbl[PositionScreen.posi][4]);
				opWrst = String.valueOf(PositionCheck.featherDbl[PositionScreen.posi][5]);
				opIq = String.valueOf(PositionCheck.featherDbl[PositionScreen.posi][6]);
				opLuck = String.valueOf(PositionCheck.featherDbl[PositionScreen.posi][7]);
				opFirst = PositionCheck.featherStr[PositionScreen.posi][0];
				opLast = PositionCheck.featherStr[PositionScreen.posi][1];
				opWin = String.valueOf(PositionCheck.featherInt[PositionScreen.posi][0]);
				opLoss = String.valueOf(PositionCheck.featherInt[PositionScreen.posi][1]);
				opCountry = PositionCheck.featherStr[PositionScreen.posi][2];
				fightWgt = 145;
				break;
			case 4:
				opStr = String.valueOf(PositionCheck.lightDbl[PositionScreen.posi][0]);
				opSpd = String.valueOf(PositionCheck.lightDbl[PositionScreen.posi][1]);
				opStm = String.valueOf(PositionCheck.lightDbl[PositionScreen.posi][2]);
				opChin = String.valueOf(PositionCheck.lightDbl[PositionScreen.posi][3]);
				opStrk = String.valueOf(PositionCheck.lightDbl[PositionScreen.posi][4]);
				opWrst = String.valueOf(PositionCheck.lightDbl[PositionScreen.posi][5]);
				opIq = String.valueOf(PositionCheck.lightDbl[PositionScreen.posi][6]);
				opLuck = String.valueOf(PositionCheck.lightDbl[PositionScreen.posi][7]);
				opFirst = PositionCheck.lightStr[PositionScreen.posi][0];
				opLast = PositionCheck.lightStr[PositionScreen.posi][1];
				opWin = String.valueOf(PositionCheck.lightInt[PositionScreen.posi][0]);
				opLoss = String.valueOf(PositionCheck.lightInt[PositionScreen.posi][1]);
				opCountry = PositionCheck.lightStr[PositionScreen.posi][2];
				fightWgt = 155;
				break;
			case 5:
				opStr = String.valueOf(PositionCheck.welterDbl[PositionScreen.posi][0]);
				opSpd = String.valueOf(PositionCheck.welterDbl[PositionScreen.posi][1]);
				opStm = String.valueOf(PositionCheck.welterDbl[PositionScreen.posi][2]);
				opChin = String.valueOf(PositionCheck.welterDbl[PositionScreen.posi][3]);
				opStrk = String.valueOf(PositionCheck.welterDbl[PositionScreen.posi][4]);
				opWrst = String.valueOf(PositionCheck.welterDbl[PositionScreen.posi][5]);
				opIq = String.valueOf(PositionCheck.welterDbl[PositionScreen.posi][6]);
				opLuck = String.valueOf(PositionCheck.welterDbl[PositionScreen.posi][7]);
				opFirst = PositionCheck.welterStr[PositionScreen.posi][0];
				opLast = PositionCheck.welterStr[PositionScreen.posi][1];
				opWin = String.valueOf(PositionCheck.welterInt[PositionScreen.posi][0]);
				opLoss = String.valueOf(PositionCheck.welterInt[PositionScreen.posi][1]);
				opCountry = PositionCheck.welterStr[PositionScreen.posi][2];
				fightWgt = 170;
				break;
			case 6:
				opStr = String.valueOf(PositionCheck.middleDbl[PositionScreen.posi][0]);
				opSpd = String.valueOf(PositionCheck.middleDbl[PositionScreen.posi][1]);
				opStm = String.valueOf(PositionCheck.middleDbl[PositionScreen.posi][2]);
				opChin = String.valueOf(PositionCheck.middleDbl[PositionScreen.posi][3]);
				opStrk = String.valueOf(PositionCheck.middleDbl[PositionScreen.posi][4]);
				opWrst = String.valueOf(PositionCheck.middleDbl[PositionScreen.posi][5]);
				opIq = String.valueOf(PositionCheck.middleDbl[PositionScreen.posi][6]);
				opLuck = String.valueOf(PositionCheck.middleDbl[PositionScreen.posi][7]);
				opFirst = PositionCheck.middleStr[PositionScreen.posi][0];
				opLast = PositionCheck.middleStr[PositionScreen.posi][1];
				opWin = String.valueOf(PositionCheck.middleInt[PositionScreen.posi][0]);
				opLoss = String.valueOf(PositionCheck.middleInt[PositionScreen.posi][1]);
				opCountry = PositionCheck.middleStr[PositionScreen.posi][2];
				fightWgt = 185;
				break;
			case 7:
				opStr = String.valueOf(PositionCheck.lheavyDbl[PositionScreen.posi][0]);
				opSpd = String.valueOf(PositionCheck.lheavyDbl[PositionScreen.posi][1]);
				opStm = String.valueOf(PositionCheck.lheavyDbl[PositionScreen.posi][2]);
				opChin = String.valueOf(PositionCheck.lheavyDbl[PositionScreen.posi][3]);
				opStrk = String.valueOf(PositionCheck.lheavyDbl[PositionScreen.posi][4]);
				opWrst = String.valueOf(PositionCheck.lheavyDbl[PositionScreen.posi][5]);
				opIq = String.valueOf(PositionCheck.lheavyDbl[PositionScreen.posi][6]);
				opLuck = String.valueOf(PositionCheck.lheavyDbl[PositionScreen.posi][7]);
				opFirst = PositionCheck.lheavyStr[PositionScreen.posi][0];
				opLast = PositionCheck.lheavyStr[PositionScreen.posi][1];
				opWin = String.valueOf(PositionCheck.lheavyInt[PositionScreen.posi][0]);
				opLoss = String.valueOf(PositionCheck.lheavyInt[PositionScreen.posi][1]);
				opCountry = PositionCheck.lheavyStr[PositionScreen.posi][2];
				fightWgt = 205;
				break;
			case 8:
				opStr = String.valueOf(PositionCheck.heavyDbl[PositionScreen.posi][0]);
				opSpd = String.valueOf(PositionCheck.heavyDbl[PositionScreen.posi][1]);
				opStm = String.valueOf(PositionCheck.heavyDbl[PositionScreen.posi][2]);
				opChin = String.valueOf(PositionCheck.heavyDbl[PositionScreen.posi][3]);
				opStrk = String.valueOf(PositionCheck.heavyDbl[PositionScreen.posi][4]);
				opWrst = String.valueOf(PositionCheck.heavyDbl[PositionScreen.posi][5]);
				opIq = String.valueOf(PositionCheck.heavyDbl[PositionScreen.posi][6]);
				opLuck = String.valueOf(PositionCheck.heavyDbl[PositionScreen.posi][7]);
				opFirst = PositionCheck.heavyStr[PositionScreen.posi][0];
				opLast = PositionCheck.heavyStr[PositionScreen.posi][1];
				opWin = String.valueOf(PositionCheck.heavyInt[PositionScreen.posi][0]);
				opLoss = String.valueOf(PositionCheck.heavyInt[PositionScreen.posi][1]);
				opCountry = PositionCheck.heavyStr[PositionScreen.posi][2];
				fightWgt = 265;
				break;
		}
		
		opStrDbl = Double.parseDouble(opStr);
		opSpdDbl = Double.parseDouble(opSpd);
		opStmDbl = Double.parseDouble(opStm);
		opChinDbl = Double.parseDouble(opChin);
		opStrkDbl = Double.parseDouble(opStrk);
		opWrstDbl = Double.parseDouble(opWrst);
		opIqDbl = Double.parseDouble(opIq);
		opLuckDbl = Double.parseDouble(opLuck);
		
		opOverall = (int) (opStrDbl + opSpdDbl + opStmDbl + opChinDbl + opStrkDbl + opWrstDbl + opIqDbl + opLuckDbl);
		
		max1 = (100 + (Weight.Player.stm * 20));
		hitpoints1 = (100 + (Weight.Player.stm * 20)) * Weight.Player.recovery;
		stam1 = (hitpoints1 / max1) * 100;
		System.out.println("player hitpoints " + hitpoints1);

		max2 = (100 + (opStmDbl * 20));
		hitpoints2 = (100 + (opStmDbl * 20));
		stam2 = (hitpoints2 / max2) * 100;
		System.out.println("oppo hitpoints " + hitpoints2);
		
		strat[0] = 0;
		strat[1] = 0;
		
		round = 1;
		if (Weight.Player.position == 0 || ContractScreen.opPos == 0) {
			maxRounds = 5;
		}
		else {
			maxRounds = 3;
		}
		
		winner = 2;
		timesRead1 = 0;
		timesRead2 = 0;
		ground1 = false;
		ground2 = false;
	}
	
	public static int fightScreenAlgorithm() {
		
		double[] opArr = new double[3];
		opArr[0] = opWrstDbl;
		opArr[1] = opStrkDbl;
		opArr[2] = opSpdDbl;

		Arrays.sort(opArr);
		
		String[] opArr1 = new String[3];
		Boolean[] found = new Boolean[3];
		found[0] = false;
		found[1] = false;
		found[2] = false;
		
		for (int i = 0; i < 3; ++i) {
			if (opArr[i] == opSpdDbl && found[2] == false) {
				opArr1[i] = "spd";
				found[2] = true;
			}
			else if (opArr[i] == opStrkDbl && found[1] == false) {
				opArr1[i] = "strk";
				found[1] = true;
			}
			else if (opArr[i] == opWrstDbl && found[0] == false) {
				opArr1[i] = "wrst";
				found[0] = true;
			}
		}
		
		int random1 = Randomizer.randomizer_1();
		int opStrat = 1;
		
		if (round == 1) {
			if (random1 < 9) {
				if (opStmDbl < 6) {
					opStrat = 1;
				}
				else if (opArr1[2].equals("wrst")) {
					opStrat = 4;
				}
				else if (opArr1[2].equals("strk")) {
					opStrat = 2;
				}
				else if (opArr1[2].equals("spd")) {
					opStrat = 3;
				}
			}
			else if (random1 < 12) {
				if (opStmDbl < 6) {
					if (opArr1[2].equals("wrst") ) {
						opStrat = 4;
					}
					else if (opArr1[2].equals("strk") ) {
						opStrat = 2;
					}
					else if (opArr1[2].equals("spd") ) {
						opStrat = 3;
					}
				}
				else if (opArr1[1].equals("wrst") ) {
					opStrat = 4;
				}
				else if (opArr1[1].equals("strk") ) {
					opStrat = 2;
				}
				else if (opArr1[1].equals("spd") ) {
					opStrat = 3;
				}
			}
			else if (random1 < 13) {
				if (opStmDbl < 6) {
					if (opArr1[1].equals("wrst") ) {
						opStrat = 4;
					}
					else if (opArr1[1].equals("strk") ) {
						opStrat = 2;
					}
					else if (opArr1[1].equals("spd") ) {
						opStrat = 3;
					}
				}
				else if (opArr1[0].equals("wrst") ) {
					opStrat = 4;
				}
				else if (opArr1[0].equals("strk") ) {
					opStrat = 2;
				}
				else if (opArr1[0].equals("spd") ) {
					opStrat = 3;
				}
			}
			else if (random1 < 15) {
				if (opStmDbl < 6) {
					if (opArr1[0].equals("wrst") ) {
						opStrat = 4;
					}
					else if (opArr1[0].equals("strk") ) {
						opStrat = 2;
					}
					else if (opArr1[0].equals("spd") ) {
						opStrat = 3;
					}
				}
				else {
					opStrat = 1;
				}
			}
			else {
				opStrat = 5;
			}
		}
		else {
			if (random1 < 10) {
				if (opStmDbl < 6) {
					opStrat = 1;
				}
				else if (opArr1[2].equals("wrst")) {
					opStrat = 4;
				}
				else if (opArr1[2].equals("strk")) {
					opStrat = 2;
				}
				else if (opArr1[2].equals("spd")) {
					opStrat = 3;
				}
			}
			else if (random1 < 14) {
				if (opStmDbl < 6) {
					if (opArr1[2].equals("wrst") ) {
						opStrat = 4;
					}
					else if (opArr1[2].equals("strk") ) {
						opStrat = 2;
					}
					else if (opArr1[2].equals("spd") ) {
						opStrat = 3;
					}
				}
				else if (opArr1[1].equals("wrst") ) {
					opStrat = 4;
				}
				else if (opArr1[1].equals("strk") ) {
					opStrat = 2;
				}
				else if (opArr1[1].equals("spd") ) {
					opStrat = 3;
				}
			}
			else if (random1 < 16) {
				if (opStmDbl < 6) {
					if (opArr1[1].equals("wrst") ) {
						opStrat = 4;
					}
					else if (opArr1[1].equals("strk") ) {
						opStrat = 2;
					}
					else if (opArr1[1].equals("spd") ) {
						opStrat = 3;
					}
				}
				else if (opArr1[0].equals("wrst") ) {
					opStrat = 4;
				}
				else if (opArr1[0].equals("strk") ) {
					opStrat = 2;
				}
				else if (opArr1[0].equals("spd") ) {
					opStrat = 3;
				}
			}
			else if (random1 < 19) {
				if (opStmDbl < 6) {
					if (opArr1[0].equals("wrst") ) {
						opStrat = 4;
					}
					else if (opArr1[0].equals("strk") ) {
						opStrat = 2;
					}
					else if (opArr1[0].equals("spd") ) {
						opStrat = 3;
					}
				}
				else {
					opStrat = 1;
				}
			}
			else {
				opStrat = 5;
			}
		}
		System.out.println(opStrat);
		return opStrat;
	}
	
	public static int fightScreenDefense() {
		int opDef = 1;
		if (Weight.Player.wrst > Weight.Player.strk) {
			int random1 = Randomizer.randomizer_1();
			if (random1 < 12) {
				opDef = 3;
			}
			else if (random1 < 17) {
				opDef = 1;
			}
			else {
				opDef = 2;
			}
		}
		else if (Weight.Player.strk > Weight.Player.wrst) {
			int random1 = Randomizer.randomizer_1();
			if (random1 < 12) {
				opDef = 2;
			}
			else if (random1 < 17) {
				opDef = 1;
			}
			else {
				opDef = 3;
			}
		}
		else if (Weight.Player.strk == Weight.Player.wrst) {
			int random1 = Randomizer.randomizer_1();
			if (random1 < 7) {
				opDef = 2;
			}
			else if (random1 < 14) {
				opDef = 3;
			}
			else {
				opDef = 1;
			}
		}
		System.out.println(opDef);
		return opDef;
	}
	
	public static void fightScreen0() {
		
		fightScreenLoad();
		
		fight1 = new JPanel();
		fight1.setBounds(412, 430, 200, 55);
		UFCgui.con.add(fight1);
		fight1.setVisible(true);
		
		btnFight1 = new JButton("FIGHT");
		btnFight1.setPreferredSize(new Dimension(200, 50));
		btnFight1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnFight1.setBackground(Color.white);
		btnFight1.setFocusPainted(false);
		btnFight1.addActionListener(fight1Handler);
		fight1.add(btnFight1);
		
		
		tott = new JPanel();
		tott.setBounds(0, 45, 1024, 40);
		UFCgui.con.add(tott);
		tott.setVisible(true);
		
		lblTott = new JLabel("TALE OF THE TAPE");
		lblTott.setFont(new Font("Tahoma", Font.BOLD, 35));
		tott.add(lblTott);
		
		
		tottName1 = new JPanel();
		tottName1.setBounds(0, 430, 400, 30);
		UFCgui.con.add(tottName1);
		tottName1.setVisible(true);
		
		if (Weight.Player.position == 0) {
			lblTottName1 = new JLabel("C. " + Weight.Player.first + " " + Weight.Player.last);
		}
		else {
			lblTottName1 = new JLabel(Weight.Player.getPos() + ". " + Weight.Player.first + " " + Weight.Player.last);
		}
		lblTottName1.setHorizontalAlignment(JLabel.CENTER);
		lblTottName1.setFont(new Font("Tahoma", Font.BOLD, 25));
		tottName1.add(lblTottName1);
		
		
		tottRecord1 = new JPanel();
		tottRecord1.setBounds(0, 460, 400, 50);
		UFCgui.con.add(tottRecord1);
		tottRecord1.setVisible(true);
		
		lblTottRecord1 = new JLabel(Weight.Player.win + " - " + Weight.Player.loss);
		lblTottRecord1.setHorizontalAlignment(JLabel.CENTER);
		lblTottRecord1.setFont(new Font("Tahoma", Font.BOLD, 25));
		tottRecord1.add(lblTottRecord1);
		
		
		tottName2 = new JPanel();
		tottName2.setBounds(624, 430, 400, 30);
		UFCgui.con.add(tottName2);
		tottName2.setVisible(true);
		
		if (PositionScreen.posi == 0) {
			lblTottName2 = new JLabel("C. " + opFirst + " " + opLast);
		}
		else {
			lblTottName2 = new JLabel(PositionScreen.posi + ". " + opFirst + " " + opLast);
		}
		lblTottName2.setHorizontalAlignment(JLabel.CENTER);
		lblTottName2.setFont(new Font("Tahoma", Font.BOLD, 25));
		tottName2.add(lblTottName2);
		
		
		tottRecord2 = new JPanel();
		tottRecord2.setBounds(624, 460, 400, 50);
		UFCgui.con.add(tottRecord2);
		tottRecord2.setVisible(true);
		
		lblTottRecord2 = new JLabel(opWin + " - " + opLoss);
		lblTottRecord2.setHorizontalAlignment(JLabel.CENTER);
		lblTottRecord2.setFont(new Font("Tahoma", Font.BOLD, 25));
		tottRecord2.add(lblTottRecord2);
		
		
		tottList = new JPanel();
		tottList.setBounds(412, 89, 200, 400);
		UFCgui.con.add(tottList);
		tottList.setVisible(true);
		
		lblTottList = new JLabel("<html><p style=\"text-align:center;\">COUNTRY<br>WEIGHT<br>OVERALL<br>STRENGTH<br>SPEED<br>STAMINA<br>CHIN<br>STRIKING<br>WRESTLING<br>IQ<br>LUCK<br></p></html>");
		lblTottList.setFont(new Font("Tahoma", Font.PLAIN, 25));
		tottList.add(lblTottList);
		
		
		tottNum1 = new JPanel();
		tottNum1.setBounds(62, 89, 300, 400);
		UFCgui.con.add(tottNum1);
		tottNum1.setVisible(true);
		
		lblTottNum1 = new JLabel("<html><p style=\"text-align:right;\">" + Weight.Player.country + "<br>" + fightWgt + "<br>" + Weight.Player.getOverall() + "<br>" + df.format(fightStr) + "<br>" + df.format(fightSpd) + "<br>" + df.format(fightStm) + "<br>" + df.format(fightChin) + "<br>" + df.format(fightStrk) + "<br>" + df.format(fightWrst) + "<br>" + df.format(fightIq) + "<br>" + df.format(fightLuck) + "</p></html>");
		lblTottNum1.setVerticalAlignment(JLabel.TOP);
		lblTottNum1.setHorizontalAlignment(JLabel.RIGHT);
		lblTottNum1.setPreferredSize(new Dimension(300, 400));
		lblTottNum1.setFont(new Font("Tahoma", Font.BOLD, 25));
		tottNum1.add(lblTottNum1);
		
		
		tottNum2 = new JPanel();
		tottNum2.setBounds(662, 89, 300, 400);
		UFCgui.con.add(tottNum2);
		tottNum2.setVisible(true);
		
		lblTottNum2 = new JLabel("<html><p style=\"text-align:left;\">" + opCountry + "<br>" + fightWgt + "<br>" + opOverall + "<br>" + opStr + "<br>" + opSpd + "<br>" + opStm + "<br>" + opChin + "<br>" + opStrk + "<br>" + opWrst + "<br>" + opIq + "<br>" + opLuck + "</p></html>");
		lblTottNum2.setVerticalAlignment(JLabel.TOP);
		lblTottNum2.setHorizontalAlignment(JLabel.LEFT);
		lblTottNum2.setPreferredSize(new Dimension(300, 400));
		lblTottNum2.setFont(new Font("Tahoma", Font.BOLD, 25));
		tottNum2.add(lblTottNum2);
	}
	
	public static void fightScreen1() {
		
		ground1 = false;
		ground2 = false;
		
		strat[0] = 0;
		strat[1] = 0;
		
		
		fightText = new JPanel();
		fightText.setBounds(0, 100, 1024, 310);
		UFCgui.con.add(fightText);
		fightText.setVisible(false);
		
		lblText1 = new JLabel();
		lblText1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblText1.setPreferredSize(new Dimension(1024, 30));
		lblText1.setHorizontalAlignment(JLabel.CENTER);
		fightText.add(lblText1);
		
		lblText2 = new JLabel();
		lblText2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblText2.setPreferredSize(new Dimension(1024, 30));
		lblText2.setHorizontalAlignment(JLabel.CENTER);
		fightText.add(lblText2);
		
		lblText3 = new JLabel();
		lblText3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblText3.setPreferredSize(new Dimension(1024, 30));
		lblText3.setHorizontalAlignment(JLabel.CENTER);
		fightText.add(lblText3);
		
		lblText4 = new JLabel();
		lblText4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblText4.setPreferredSize(new Dimension(1024, 30));
		lblText4.setHorizontalAlignment(JLabel.CENTER);
		fightText.add(lblText4);
		
		lblText5 = new JLabel();
		lblText5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblText5.setPreferredSize(new Dimension(1024, 30));
		lblText5.setHorizontalAlignment(JLabel.CENTER);
		fightText.add(lblText5);
		
		lblText6 = new JLabel();
		lblText6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblText6.setPreferredSize(new Dimension(1024, 30));
		lblText6.setHorizontalAlignment(JLabel.CENTER);
		fightText.add(lblText6);
		
		lblText7 = new JLabel();
		lblText7.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblText7.setPreferredSize(new Dimension(1024, 30));
		lblText7.setHorizontalAlignment(JLabel.CENTER);
		fightText.add(lblText7);
		
		lblText8 = new JLabel();
		lblText8.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblText8.setPreferredSize(new Dimension(1024, 30));
		lblText8.setHorizontalAlignment(JLabel.CENTER);
		fightText.add(lblText8);
		
		lblText9 = new JLabel();
		lblText9.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblText9.setPreferredSize(new Dimension(1024, 30));
		lblText9.setHorizontalAlignment(JLabel.CENTER);
		fightText.add(lblText9);
		
		
		name1 = new JPanel();
		name1.setBounds(845, 335, 135, 15);
		UFCgui.con.add(name1);
		name1.setVisible(true);
		
		lblName1 = new JLabel(opFirst + " " + opLast);
		lblName1.setHorizontalAlignment(JLabel.CENTER);
		lblName1.setFont(new Font("Tahoma", Font.BOLD, 10));
		name1.add(lblName1);
		
		
		stamina2 = new JPanel();
		stamina2.setBounds(714, 30, 275, 100);
		UFCgui.con.add(stamina2);
		stamina2.setVisible(true);
		
		lblStaminaName2 = new JLabel(opFirst + " " + opLast);
		lblStaminaName2.setHorizontalAlignment(JLabel.RIGHT);
		lblStaminaName2.setPreferredSize(new Dimension (275, 25));
		lblStaminaName2.setFont(new Font("Tahoma", Font.BOLD, 20));
		stamina2.add(lblStaminaName2);
		
		
		lblStamina2 = new JLabel(df1.format(stam2) + "%");
		lblStamina2.setPreferredSize(new Dimension (275, 25));
		lblStamina2.setHorizontalAlignment(JLabel.RIGHT);
		lblStamina2.setFont(new Font("Tahoma", Font.BOLD, 20));
		stamina2.add(lblStamina2);
		
		
		overview = new JPanel();
		overview.setBounds(850, 350, 60, 125);
		UFCgui.con.add(overview);
		overview.setVisible(true);
		
		lblOverview = new JLabel("<html><p style=\"text-align:right;\">STRENGTH<br>SPEED<br>STAMINA<br>CHIN<br>STRIKING<br>WRESTLING<br>IQ<br>LUCK<br></p></html>");
		lblOverview.setHorizontalAlignment(JLabel.TRAILING);
		lblOverview.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblOverview.setPreferredSize(new Dimension(60, 100));
		overview.add(lblOverview);
		
		
		overviewNum = new JPanel();
		overviewNum.setBounds(910, 340, 45, 120);
		UFCgui.con.add(overviewNum);
		overviewNum.setVisible(true);
		
		lblOverviewNum = new JLabel("<html><p style=\"text-align:left;\">" + opStr + "<br>" + opSpd + "<br>" + opStm + "<br>" + opChin + "<br>" + opStrk + "<br>" + opWrst + "<br>" + opIq + "<br>" + opLuck + "</p></html>");
		lblOverviewNum.setHorizontalAlignment(JLabel.TRAILING);
		lblOverviewNum.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblOverviewNum.setPreferredSize(new Dimension(45, 120));
		overviewNum.add(lblOverviewNum);
		
		
		name2 = new JPanel();
		name2.setBounds(45, 335, 135, 15);
		UFCgui.con.add(name2);
		name2.setVisible(true);
		
		lblName2 = new JLabel(Weight.Player.first + " " + Weight.Player.last);
		lblName2.setHorizontalAlignment(JLabel.CENTER);
		lblName2.setFont(new Font("Tahoma", Font.BOLD, 10));
		name2.add(lblName2);
		
		
		stamina1 = new JPanel();
		stamina1.setBounds(30, 30, 275, 100);
		UFCgui.con.add(stamina1);
		stamina1.setVisible(true);
		
		lblStaminaName1 = new JLabel(Weight.Player.first + " " + Weight.Player.last);
		lblStaminaName1.setHorizontalAlignment(JLabel.LEFT);
		lblStaminaName1.setPreferredSize(new Dimension (275, 25));
		lblStaminaName1.setFont(new Font("Tahoma", Font.BOLD, 20));
		stamina1.add(lblStaminaName1);
		
		lblStamina1 = new JLabel(df1.format(stam1) + "%");
		lblStamina1.setPreferredSize(new Dimension (275, 25));
		lblStamina1.setHorizontalAlignment(JLabel.LEFT);
		lblStamina1.setFont(new Font("Tahoma", Font.BOLD, 20));
		stamina1.add(lblStamina1);
		
		
		overview1 = new JPanel();
		overview1.setBounds(50, 350, 60, 125);
		UFCgui.con.add(overview1);
		overview1.setVisible(true);
		
		lblOverview1 = new JLabel("<html><p style=\"text-align:right;\">STRENGTH<br>SPEED<br>STAMINA<br>CHIN<br>STRIKING<br>WRESTLING<br>IQ<br>LUCK<br></p></html>");
		lblOverview1.setHorizontalAlignment(JLabel.TRAILING);
		lblOverview1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblOverview1.setPreferredSize(new Dimension(60, 100));
		overview1.add(lblOverview1);
		
		
		overviewNum1 = new JPanel();
		overviewNum1.setBounds(110, 340, 45, 120);
		UFCgui.con.add(overviewNum1);
		overviewNum1.setVisible(true);
		
		lblOverviewNum1 = new JLabel("<html><p style=\"text-align:left;\">" + df.format(fightStr) + "<br>" + df.format(fightSpd) + "<br>" + df.format(fightStm) + "<br>" + df.format(fightChin) + "<br>" + df.format(fightStrk) + "<br>" + df.format(fightWrst) + "<br>" + df.format(fightIq) + "<br>" + df.format(fightLuck) + "</p></html>");
		lblOverviewNum1.setHorizontalAlignment(JLabel.TRAILING);
		lblOverviewNum1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblOverviewNum1.setPreferredSize(new Dimension(45, 120));
		overviewNum1.add(lblOverviewNum1);
		
		
		fightCamp = new JPanel();
		fightCamp.setBounds(0, 45, 1024, 40);
		UFCgui.con.add(fightCamp);
		fightCamp.setVisible(true);
		
		lblFightCamp = new JLabel("CHOOSE ROUND " + round + " STRATEGY");
		lblFightCamp.setFont(new Font("Tahoma", Font.BOLD, 25));
		fightCamp.add(lblFightCamp);

		
		fight = new JPanel();
		fight.setBounds(412, 430, 200, 55);
		UFCgui.con.add(fight);
		fight.setVisible(true);
		
		btnFight = new JButton("FIGHT");
		btnFight.setPreferredSize(new Dimension(200, 50));
		btnFight.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnFight.setBackground(Color.white);
		btnFight.setFocusPainted(false);
		btnFight.setEnabled(false);
		btnFight.addActionListener(fightHandler);
		fight.add(btnFight);
		
		
		offense = new JPanel();
		offense.setBounds(0, 130, 1024, 25);
		UFCgui.con.add(offense);
		offense.setVisible(true);
		
		lblOffense = new JLabel("OFFENSIVE");
		lblOffense.setFont(new Font("Tahoma", Font.BOLD, 20));
		offense.add(lblOffense);
		
		
		defense = new JPanel();
		defense.setBounds(0, 255, 1024, 25);
		UFCgui.con.add(defense);
		defense.setVisible(true);
		
		lblDefense = new JLabel("DEFENSIVE");
		lblDefense.setFont(new Font("Tahoma", Font.BOLD, 20));
		defense.add(lblDefense);
		
		
		steady = new JPanel();
		steady.setBounds(32, 170, 160, 85);
		UFCgui.con.add(steady);
		steady.setVisible(true);
		
		btnSteady = new JButton("STEADY");
		btnSteady.setPreferredSize(new Dimension(160, 50));
		btnSteady.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSteady.setBackground(Color.white);
		btnSteady.setFocusPainted(false);
		btnSteady.setToolTipText("<html><p style=\"text-align:left;\">Fight at a steady pace<br>Low damage<br>Low energy</p></html>");
		btnSteady.addActionListener(steadyFightHandler);
		steady.add(btnSteady);
		
		
		brawl = new JPanel();
		brawl.setBounds(232, 170, 160, 85);
		UFCgui.con.add(brawl);
		brawl.setVisible(true);

		btnBrawl = new JButton("BRAWL");
		btnBrawl.setPreferredSize(new Dimension(160, 50));
		btnBrawl.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBrawl.setBackground(Color.white);
		btnBrawl.setFocusPainted(false);
		btnBrawl.setToolTipText("<html><p style=\"text-align:left;\">Relentless pressure and high volume of strikes (heavily dependent on STRK)<br>High damage<br>High energy</p></html>");
		btnBrawl.addActionListener(brawlFightHandler);
		brawl.add(btnBrawl);
		
		
		blitz = new JPanel();
		blitz.setBounds(432, 170, 160, 85);
		UFCgui.con.add(blitz);
		blitz.setVisible(true);
		
		btnBlitz = new JButton("BLITZ");
		btnBlitz.setPreferredSize(new Dimension(160, 50));
		btnBlitz.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBlitz.setBackground(Color.white);
		btnBlitz.setFocusPainted(false);
		btnBlitz.setToolTipText("<html><p style=\"text-align:left;\">Dash in to deliver risky power shots (heavily dependent on SPD)<br>High damage<br>High energy</p></html>");
		btnBlitz.addActionListener(blitzFightHandler);
		blitz.add(btnBlitz);
		
		
		maul = new JPanel();
		maul.setBounds(632, 170, 160, 85);
		UFCgui.con.add(maul);
		maul.setVisible(true);

		btnMaul = new JButton("MAUL");
		btnMaul.setPreferredSize(new Dimension(160, 50));
		btnMaul.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnMaul.setBackground(Color.white);
		btnMaul.setFocusPainted(false);
		btnMaul.setToolTipText("<html><p style=\"text-align:left;\">Bring down opponent with takedowns to unleash ground & pound and submission attacks (heavily dependent on WRST)<br>High damage<br>High energy</p></html>");
		btnMaul.addActionListener(maulFightHandler);
		maul.add(btnMaul);
		
		
		read = new JPanel();
		read.setBounds(832, 170, 160, 85);
		UFCgui.con.add(read);
		read.setVisible(true);

		btnRead = new JButton("READ");
		btnRead.setPreferredSize(new Dimension(160, 50));
		btnRead.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnRead.setBackground(Color.white);
		btnRead.setFocusPainted(false);
		btnRead.setToolTipText("<html><p style=\"text-align:left;\">Passively read opponent's moves and gain an 4 IQ buff after the round<br>No damage</p>Low energy</html>");
		btnRead.addActionListener(readFightHandler);
		read.add(btnRead);
		
		
		counter = new JPanel();
		counter.setBounds(232, 295, 160, 85);
		UFCgui.con.add(counter);
		counter.setVisible(true);

		btnCounter = new JButton("COUNTER");
		btnCounter.setPreferredSize(new Dimension(160, 50));
		btnCounter.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCounter.setBackground(Color.white);
		btnCounter.setFocusPainted(false);
		btnCounter.setToolTipText("<html><p style=\"text-align:left;\">Riskily stand in the way of attacks to counterstrike</p></html>");
		btnCounter.addActionListener(counterFightHandler);
		counter.add(btnCounter);
		
		
		handsUp = new JPanel();
		handsUp.setBounds(432, 295, 160, 85);
		UFCgui.con.add(handsUp);
		handsUp.setVisible(true);

		btnHandsUp = new JButton("HANDS UP");
		btnHandsUp.setPreferredSize(new Dimension(160, 50));
		btnHandsUp.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnHandsUp.setBackground(Color.white);
		btnHandsUp.setFocusPainted(false);
		btnHandsUp.setToolTipText("<html><p style=\"text-align:left;\">Keep guard high to defend against strikes</p></html>");
		btnHandsUp.addActionListener(handsUpFightHandler);
		handsUp.add(btnHandsUp);
		
		
		handsDown = new JPanel();
		handsDown.setBounds(632, 295, 160, 85);
		UFCgui.con.add(handsDown);
		handsDown.setVisible(true);

		btnHandsDown = new JButton("HANDS DOWN");
		btnHandsDown.setPreferredSize(new Dimension(160, 50));
		btnHandsDown.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnHandsDown.setBackground(Color.white);
		btnHandsDown.setFocusPainted(false);
		btnHandsDown.setToolTipText("<html><p style=\"text-align:left;\">Keep guard low to defend against takedowns</p></html>");
		btnHandsDown.addActionListener(handsDownFightHandler);
		handsDown.add(btnHandsDown);
	}
	
	public static void fightScreen2() {
		fightRound = new JPanel();
		fightRound.setBounds(0, 45, 1024, 40);
		UFCgui.con.add(fightRound);
		fightRound.setVisible(true);
		
		lblFightRound = new JLabel("ROUND " + round);
		lblFightRound.setFont(new Font("Tahoma", Font.BOLD, 25));
		fightRound.add(lblFightRound);
		
		fightText.setVisible(true);
		
		opStrat = fightScreenAlgorithm();
		opDef = fightScreenDefense();
		
		String offStrat1 = null;
		String offStrat2 = null;
		String defStrat1 = null;
		String defStrat2 = null;
		
		if (strat[0] == 1) {
			offStrat1 = "STEADY";
		}
		else if (strat[0] == 2) {
			offStrat1 = "BRAWL";
		}
		else if (strat[0] == 3) {
			offStrat1 = "BLITZ";
		}
		else if (strat[0] == 4) {
			offStrat1 = "MAUL";
		}
		else {
			offStrat1 = "READ";
		}
		
		if (opStrat == 1) {
			offStrat2 = "STEADY";
		}
		else if (opStrat == 2) {
			offStrat2 = "BRAWL";
		}
		else if (opStrat == 3) {
			offStrat2 = "BLITZ";
		}
		else if (opStrat == 4) {
			offStrat2 = "MAUL";
		}
		else {
			offStrat2 = "READ";
		}
		
		if (strat[1] == 1) {
			defStrat1 = "COUNTER";
		}
		else if (strat[1] == 2) {
			defStrat1 = "HANDS UP";
		}
		else {
			defStrat1 = "HANDS DOWN";
		}
		
		if (opDef == 1) {
			defStrat2 = "COUNTER";
		}
		else if (opDef == 2) {
			defStrat2 = "HANDS UP";
		}
		else {
			defStrat2 = "HANDS DOWN";
		}
		
		strat1Text = new JPanel();
		strat1Text.setBounds(30, 440, 150, 40);
		UFCgui.con.add(strat1Text);
		strat1Text.setVisible(true);
		
		lblStrat1 = new JLabel("OFF STRAT: " + offStrat1);
		lblStrat1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblStrat1.setPreferredSize(new Dimension(150, 15));
		lblStrat1.setHorizontalAlignment(JLabel.LEFT);
		strat1Text.add(lblStrat1);

		lblStrat1_1 = new JLabel("DEF STRAT: " + defStrat1);
		lblStrat1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblStrat1_1.setPreferredSize(new Dimension(150, 15));
		lblStrat1_1.setHorizontalAlignment(JLabel.LEFT);
		strat1Text.add(lblStrat1_1);
		
		
		strat2Text = new JPanel();
		strat2Text.setBounds(844, 440, 150, 40);
		UFCgui.con.add(strat2Text);
		strat2Text.setVisible(true);
		
		lblStrat2 = new JLabel("OFF STRAT: " + offStrat2);
		lblStrat2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblStrat2.setPreferredSize(new Dimension(150, 15));
		lblStrat2.setHorizontalAlignment(JLabel.RIGHT);
		strat2Text.add(lblStrat2);

		lblStrat2_1 = new JLabel("DEF STRAT: " + defStrat2);
		lblStrat2_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblStrat2_1.setPreferredSize(new Dimension(150, 15));
		lblStrat2_1.setHorizontalAlignment(JLabel.RIGHT);
		strat2Text.add(lblStrat2_1);
		
		
		Boolean done = false;
		
		double tempStam1 = stam1;
		double tempStam2 = stam2;
		
		if (hitpoints1 == 0) {
			winner = 1;
			finish = "TKO";
			FightScreen.lblText1.setText(Weight.Player.last + " CANNOT CONTINUE DUE TO EXHAUSTION");
		}
		
		if (Weight.Player.spd >= opSpdDbl) {
			int randomSteady;
			double randomDamage;
			labelNum = 1;
			
			if (winner != 2) {
				done = true;
			}
			else if (hitpoints1 > 0 && done == false && ground1 == false) {
				randomSteady = Randomizer.randomizer100_1();
				randomDamage = Randomizer.randomizer_1();
				RoundFlow.playerFlow(randomSteady, randomDamage);
				++labelNum;
			}
			else if (hitpoints1 > 0 && done == false && ground1 == true) {
				FightScreen.lblText1.setText(Weight.Player.last + " TRIES TO GET UP, BUT FAILS");
				++labelNum;
			}

		
			if (winner != 2) {
				done = true;
			}
			else if (hitpoints2 > 0 && done == false && ground2 == false) {
				randomSteady = Randomizer.randomizer100_2();
				randomDamage = Randomizer.randomizer_2();
				RoundFlow.opFlow(randomSteady, randomDamage);
				++labelNum;
			}
			else if (hitpoints1 > 0 && done == false && ground2 == true) {
				FightScreen.lblText2.setText(opLast + " TRIES TO GET UP, BUT FAILS");
				++labelNum;
			}
			
			
			if (winner != 2) {
				done = true;
			}
			else if (hitpoints1 > 0 && done == false && ground1 == false) {
				randomSteady = Randomizer.randomizer100_3();
				randomDamage = Randomizer.randomizer_3();
				RoundFlow.playerFlow(randomSteady, randomDamage);
				++labelNum;
			}
			else if (hitpoints1 > 0 && done == false && ground1 == true) {
				FightScreen.lblText3.setText(Weight.Player.last + " TRIES TO GET UP, BUT FAILS");
				++labelNum;
			}
			
			if (winner != 2) {
				done = true;
			}
			else if (hitpoints2 > 0 && done == false && ground2 == false) {
				randomSteady = Randomizer.randomizer100_4();
				randomDamage = Randomizer.randomizer_4();
				RoundFlow.opFlow(randomSteady, randomDamage);
				++labelNum;
			}
			else if (hitpoints1 > 0 && done == false && ground2 == true) {
				FightScreen.lblText4.setText(opLast + " TRIES TO GET UP, BUT FAILS");
				++labelNum;
			}
			
			if (winner != 2) {
				done = true;
			}
			else if (hitpoints1 > 0 && done == false && ground1 == false) {
				randomSteady = Randomizer.randomizer100_5();
				randomDamage = Randomizer.randomizer_5();
				RoundFlow.playerFlow(randomSteady, randomDamage);
				++labelNum;
			}
			else if (hitpoints1 > 0 && done == false && ground1 == true) {
				FightScreen.lblText5.setText(Weight.Player.last + " TRIES TO GET UP, BUT FAILS");
				++labelNum;
			}
			
			if (winner != 2) {
				done = true;
			}
			else if (hitpoints2 > 0 && done == false && ground2 == false) {
				randomSteady = Randomizer.randomizer100_6();
				randomDamage = Randomizer.randomizer_6();
				RoundFlow.opFlow(randomSteady, randomDamage);
				++labelNum;
			}
			else if (hitpoints1 > 0 && done == false && ground2 == true) {
				FightScreen.lblText6.setText(opLast + " TRIES TO GET UP, BUT FAILS");
				++labelNum;
			}
			
			if (winner != 2) {
				done = true;
			}
			else if (hitpoints1 > 0 && done == false && ground1 == false) {
				randomSteady = Randomizer.randomizer100_7();
				randomDamage = Randomizer.randomizer_7();
				RoundFlow.playerFlow(randomSteady, randomDamage);
				++labelNum;
			}
			else if (hitpoints1 > 0 && done == false && ground1 == true) {
				FightScreen.lblText7.setText(Weight.Player.last + " TRIES TO GET UP, BUT FAILS");
				++labelNum;
			}
			
			if (winner != 2) {
				done = true;
			}
			else if (hitpoints2 > 0 && done == false && ground2 == false) {
				randomSteady = Randomizer.randomizer100_8();
				randomDamage = Randomizer.randomizer_8();
				RoundFlow.opFlow(randomSteady, randomDamage);
				++labelNum;
			}
			else if (hitpoints1 > 0 && done == false && ground2 == true) {
				FightScreen.lblText8.setText(opLast + " TRIES TO GET UP, BUT FAILS");
				++labelNum;
			}
			
			if (winner != 2) {
				done = true;
			}
		}
		else {
			int randomSteady;
			double randomDamage;
			labelNum = 1;
			
			if (winner != 2) {
				done = true;
			}
			else if (hitpoints2 > 0 && done == false && ground2 == false) {
				randomSteady = Randomizer.randomizer100_1();
				randomDamage = Randomizer.randomizer_1();
				RoundFlow.opFlow(randomSteady, randomDamage);
				++labelNum;
			}
			else if (hitpoints1 > 0 && done == false && ground2 == true) {
				FightScreen.lblText1.setText(opLast + " TRIES TO GET UP, BUT FAILS");
				++labelNum;
			}
			
			if (winner != 2) {
				done = true;
			}
			else if (hitpoints1 > 0 && done == false && ground1 == false) {
				randomSteady = Randomizer.randomizer100_2();
				randomDamage = Randomizer.randomizer_2();
				RoundFlow.playerFlow(randomSteady, randomDamage);
				++labelNum;
			}
			else if (hitpoints1 > 0 && done == false && ground1 == true) {
				FightScreen.lblText2.setText(Weight.Player.last + " TRIES TO GET UP, BUT FAILS");
				++labelNum;
			}
			
			if (winner != 2) {
				done = true;
			}
			else if (hitpoints2 > 0 && done == false && ground2 == false) {
				randomSteady = Randomizer.randomizer100_3();
				randomDamage = Randomizer.randomizer_3();
				RoundFlow.opFlow(randomSteady, randomDamage);
				++labelNum;
			}
			else if (hitpoints1 > 0 && done == false && ground2 == true) {
				FightScreen.lblText3.setText(opLast + " TRIES TO GET UP, BUT FAILS");
				++labelNum;
			}
			
			if (winner != 2) {
				done = true;
			}
			else if (hitpoints1 > 0 && done == false && ground1 == false) {
				randomSteady = Randomizer.randomizer100_4();
				randomDamage = Randomizer.randomizer_4();
				RoundFlow.playerFlow(randomSteady, randomDamage);
				++labelNum;
			}
			else if (hitpoints1 > 0 && done == false && ground1 == true) {
				FightScreen.lblText4.setText(Weight.Player.last + " TRIES TO GET UP, BUT FAILS");
				++labelNum;
			}
			
			if (winner != 2) {
				done = true;
			}
			else if (hitpoints2 > 0 && done == false && ground2 == false) {
				randomSteady = Randomizer.randomizer100_5();
				randomDamage = Randomizer.randomizer_5();
				RoundFlow.opFlow(randomSteady, randomDamage);
				++labelNum;
			}
			else if (hitpoints1 > 0 && done == false && ground2 == true) {
				FightScreen.lblText5.setText(opLast + " TRIES TO GET UP, BUT FAILS");
				++labelNum;
			}
			
			if (winner != 2) {
				done = true;
			}
			else if (hitpoints1 > 0 && done == false && ground1 == false) {
				randomSteady = Randomizer.randomizer100_6();
				randomDamage = Randomizer.randomizer_6();
				RoundFlow.playerFlow(randomSteady, randomDamage);
				++labelNum;
			}
			else if (hitpoints1 > 0 && done == false && ground1 == true) {
				FightScreen.lblText6.setText(Weight.Player.last + " TRIES TO GET UP, BUT FAILS");
				++labelNum;
			}
			
			if (winner != 2) {
				done = true;
			}
			else if (hitpoints2 > 0 && done == false && ground2 == false) {
				randomSteady = Randomizer.randomizer100_7();
				randomDamage = Randomizer.randomizer_7();
				RoundFlow.opFlow(randomSteady, randomDamage);
				++labelNum;
			}
			else if (hitpoints1 > 0 && done == false && ground2 == true) {
				FightScreen.lblText7.setText(opLast + " TRIES TO GET UP, BUT FAILS");
				++labelNum;
			}
			
			if (winner != 2) {
				done = true;
			}
			else if (hitpoints1 > 0 && done == false && ground1 == false) {
				randomSteady = Randomizer.randomizer100_8();
				randomDamage = Randomizer.randomizer_8();
				RoundFlow.playerFlow(randomSteady, randomDamage);
				++labelNum;
			}
			else if (hitpoints1 > 0 && done == false && ground1 == true) {
				FightScreen.lblText8.setText(Weight.Player.last + " TRIES TO GET UP, BUT FAILS");
				++labelNum;
			}

			if (winner != 2) {
				done = true;
			}
		}
		
		double roundDam1;
		double roundDam2;
		
		if (strat[1] == 1 || strat[1] == 5) {
			roundDam1 = (tempStam2 - stam2) - ((20 / max2) * 100);
		}
		else {
			roundDam1 = (tempStam2 - stam2) - ((36 / max2) * 100);
		}
		
		if (strat[0] == 1 || strat[0] == 5) {
			roundDam2 = (tempStam1 - stam1) - ((20 / max1) * 100);
		}
		else {
			roundDam2 = (tempStam1 - stam1) - ((36 / max1) * 100);
		}

		int score1 = 0;
		
		if (roundDam1 > roundDam2) {
			if ((roundDam1 - 25) >= roundDam2) {
				score1 = 2;
			}
			else {
				score1 = 1;
			}
		}
		else if (roundDam1 < roundDam2) {
			if ((roundDam2 - 25) >= roundDam1) {
				score1 = 12;
			}
			else {
				score1 = 11;
			}
		}
		else {
			score1 = 0;
		}
		
		int points1 = knockDown1 + takeDown1;
		int points2 = knockDown2 + takeDown2;
		
		// 0 knockdown player, 10-9
		if (points1 == points2 && score1 == 1) {
			switch(round) {
			case 1:
				score[0][0] = 10;
				score[1][0] = 9;
				break;
			case 2:
				score[0][1] = 10;
				score[1][1] = 9;
				break;
			case 3:
				score[0][2] = 10;
				score[1][2] = 9;
				break;
			case 4:
				score[0][3] = 10;
				score[1][3] = 9;
				break;
			case 5:
				score[0][4] = 10;
				score[1][4] = 9;
				break;
			}
		}
		else if (points1 == points2 && score1 == 11) {
			switch(round) {
			case 1:
				score[0][0] = 9;
				score[1][0] = 10;
				break;
			case 2:
				score[0][1] = 9;
				score[1][1] = 10;
				break;
			case 3:
				score[0][2] = 9;
				score[1][2] = 10;
				break;
			case 4:
				score[0][3] = 9;
				score[1][3] = 10;
				break;
			case 5:
				score[0][4] = 9;
				score[1][4] = 10;
				break;
			}
		}
		// 0 knockdown, 10-8
		else if (points1 == points2 && score1 == 2) {
			switch(round) {
			case 1:
				score[0][0] = 10;
				score[1][0] = 8;
				break;
			case 2:
				score[0][1] = 10;
				score[1][1] = 8;
				break;
			case 3:
				score[0][2] = 10;
				score[1][2] = 8;
				break;
			case 4:
				score[0][3] = 10;
				score[1][3] = 8;
				break;
			case 5:
				score[0][4] = 10;
				score[1][4] = 8;
				break;
			}
		}
		else if (points1 == points2 && score1 == 12) {
			switch(round) {
			case 1:
				score[0][0] = 8;
				score[1][0] = 10;
				break;
			case 2:
				score[0][1] = 8;
				score[1][1] = 10;
				break;
			case 3:
				score[0][2] = 8;
				score[1][2] = 10;
				break;
			case 4:
				score[0][3] = 8;
				score[1][3] = 10;
				break;
			case 5:
				score[0][4] = 8;
				score[1][4] = 10;
				break;
			}
		}
		// 1 knockdown player, losing round
		else if ((points1 - points2) == 1 && roundDam1 < roundDam2) {
			switch(round) {
			case 1:
				score[0][0] = 10;
				score[1][0] = 9;
				break;
			case 2:
				score[0][1] = 10;
				score[1][1] = 9;
				break;
			case 3:
				score[0][2] = 10;
				score[1][2] = 9;
				break;
			case 4:
				score[0][3] = 10;
				score[1][3] = 9;
				break;
			case 5:
				score[0][4] = 10;
				score[1][4] = 9;
				break;
			}
		}
		else if ((points2 - points1) == 1 && roundDam1 > roundDam2) {
			switch(round) {
			case 1:
				score[0][0] = 9;
				score[1][0] = 10;
				break;
			case 2:
				score[0][1] = 9;
				score[1][1] = 10;
				break;
			case 3:
				score[0][2] = 9;
				score[1][2] = 10;
				break;
			case 4:
				score[0][3] = 9;
				score[1][3] = 10;
				break;
			case 5:
				score[0][4] = 9;
				score[1][4] = 10;
				break;
			}
		}
		// 2 knockdown player, losing round
		else if ((points1 - points2) == 2 && roundDam1 < roundDam2) {
			switch(round) {
			case 1:
				score[0][0] = 10;
				score[1][0] = 8;
				break;
			case 2:
				score[0][1] = 10;
				score[1][1] = 8;
				break;
			case 3:
				score[0][2] = 10;
				score[1][2] = 8;
				break;
			case 4:
				score[0][3] = 10;
				score[1][3] = 8;
				break;
			case 5:
				score[0][4] = 10;
				score[1][4] = 8;
				break;
			}
		}
		else if ((points2 - points1) == 2 && roundDam1 > roundDam2) {
			switch(round) {
			case 1:
				score[0][0] = 8;
				score[1][0] = 10;
				break;
			case 2:
				score[0][1] = 8;
				score[1][1] = 10;
				break;
			case 3:
				score[0][2] = 8;
				score[1][2] = 10;
				break;
			case 4:
				score[0][3] = 8;
				score[1][3] = 10;
				break;
			case 5:
				score[0][4] = 8;
				score[1][4] = 10;
				break;
			}
		}
		// 3 knockdown player, losing round
		else if ((points1 - points2) > 2 && roundDam1 < roundDam2) {
			switch(round) {
			case 1:
				score[0][0] = 10;
				score[1][0] = 7;
				break;
			case 2:
				score[0][1] = 10;
				score[1][1] = 7;
				break;
			case 3:
				score[0][2] = 10;
				score[1][2] = 7;
				break;
			case 4:
				score[0][3] = 10;
				score[1][3] = 7;
				break;
			case 5:
				score[0][4] = 10;
				score[1][4] = 7;
				break;
			}
		}
		else if ((points2 - points1) > 2 && roundDam1 > roundDam2) {
			switch(round) {
			case 1:
				score[0][0] = 7;
				score[1][0] = 10;
				break;
			case 2:
				score[0][1] = 7;
				score[1][1] = 10;
				break;
			case 3:
				score[0][2] = 7;
				score[1][2] = 10;
				break;
			case 4:
				score[0][3] = 7;
				score[1][3] = 10;
				break;
			case 5:
				score[0][4] = 7;
				score[1][4] = 10;
				break;
			}
		}
		// 10-8 from 10-9
		else if ((points1 - points2) == 1 && score1 == 1) {
			switch(round) {
			case 1:
				score[0][0] = 10;
				score[1][0] = 8;
				break;
			case 2:
				score[0][1] = 10;
				score[1][1] = 8;
				break;
			case 3:
				score[0][2] = 10;
				score[1][2] = 8;
				break;
			case 4:
				score[0][3] = 10;
				score[1][3] = 8;
				break;
			case 5:
				score[0][4] = 10;
				score[1][4] = 8;
				break;
			}
		}
		else if ((points2 - points1) == 1 && score1 == 11) {
			switch(round) {
			case 1:
				score[0][0] = 8;
				score[1][0] = 10;
				break;
			case 2:
				score[0][1] = 8;
				score[1][1] = 10;
				break;
			case 3:
				score[0][2] = 8;
				score[1][2] = 10;
				break;
			case 4:
				score[0][3] = 8;
				score[1][3] = 10;
				break;
			case 5:
				score[0][4] = 8;
				score[1][4] = 10;
				break;
			}
		}
		// 10-7 from 10-8
		else if ((points1 - points2) > 0 && score1 == 2) {
			switch(round) {
			case 1:
				score[0][0] = 10;
				score[1][0] = 7;
				break;
			case 2:
				score[0][1] = 10;
				score[1][1] = 7;
				break;
			case 3:
				score[0][2] = 10;
				score[1][2] = 7;
				break;
			case 4:
				score[0][3] = 10;
				score[1][3] = 7;
				break;
			case 5:
				score[0][4] = 10;
				score[1][4] = 7;
				break;
			}
		}
		else if ((points2 - points1) > 0 && score1 == 12) {
			switch(round) {
			case 1:
				score[0][0] = 7;
				score[1][0] = 10;
				break;
			case 2:
				score[0][1] = 7;
				score[1][1] = 10;
				break;
			case 3:
				score[0][2] = 7;
				score[1][2] = 10;
				break;
			case 4:
				score[0][3] = 7;
				score[1][3] = 10;
				break;
			case 5:
				score[0][4] = 7;
				score[1][4] = 10;
				break;
			}
		}
		// 10-7 from 10-9
		else if ((points1 - points2) > 1 && score1 == 1) {
			switch(round) {
			case 1:
				score[0][0] = 10;
				score[1][0] = 7;
				break;
			case 2:
				score[0][1] = 10;
				score[1][1] = 7;
				break;
			case 3:
				score[0][2] = 10;
				score[1][2] = 7;
				break;
			case 4:
				score[0][3] = 10;
				score[1][3] = 7;
				break;
			case 5:
				score[0][4] = 10;
				score[1][4] = 7;
				break;
			}
		}
		else if ((points2 - points1) > 1 && score1 == 11) {
			switch(round) {
			case 1:
				score[0][0] = 7;
				score[1][0] = 10;
				break;
			case 2:
				score[0][1] = 7;
				score[1][1] = 10;
				break;
			case 3:
				score[0][2] = 7;
				score[1][2] = 10;
				break;
			case 4:
				score[0][3] = 7;
				score[1][3] = 10;
				break;
			case 5:
				score[0][4] = 7;
				score[1][4] = 10;
				break;
			}
		}
		
		knockDown1 = 0;
		knockDown2 = 0;
		takeDown1 = 0;
		takeDown2 = 0;
		++round;

		if (round > maxRounds || done == true) {

			finishFight = new JPanel();
			finishFight.setBounds(412, 430, 200, 55);
			UFCgui.con.add(finishFight);
			finishFight.setVisible(true);
			
			btnFinishFight = new JButton("FINISH FIGHT");
			btnFinishFight.setPreferredSize(new Dimension(200, 50));
			btnFinishFight.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnFinishFight.setBackground(Color.white);
			btnFinishFight.setFocusPainted(false);
			btnFinishFight.addActionListener(finishFightHandler);
			finishFight.add(btnFinishFight);
		}
		else {
			fight2 = new JPanel();
			fight2.setBounds(412, 430, 200, 55);
			UFCgui.con.add(fight2);
			fight2.setVisible(true);
			
			btnFight2 = new JButton("BACK TO CORNER");
			btnFight2.setPreferredSize(new Dimension(200, 50));
			btnFight2.setFont(new Font("Tahoma", Font.BOLD, 18));
			btnFight2.setBackground(Color.white);
			btnFight2.setFocusPainted(false);
			btnFight2.addActionListener(fight2Handler);
			fight2.add(btnFight2);
		}
		
	}
	
	public static void finishFightScreen() {
		
		done = new JPanel();
		done.setBounds(412, 430, 200, 55);
		UFCgui.con.add(done);
		done.setVisible(true);
		
		btnDone = new JButton("GO HOME");
		btnDone.setPreferredSize(new Dimension(200, 50));
		btnDone.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDone.setBackground(Color.white);
		btnDone.setFocusPainted(false);
		btnDone.addActionListener(doneFightHandler);
		done.add(btnDone);
		
		int tempMoney = 0;
		
		moneyText = new JPanel();
		moneyText.setBounds(30, 350, 250, 200);
		UFCgui.con.add(moneyText);
		moneyText.setVisible(true);
		
		lblMoney1 = new JLabel("BASE FIGHT SALARY: $" + Fighter.BalanceUFC.getClout());
		lblMoney1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblMoney1.setPreferredSize(new Dimension(250, 15));
		lblMoney1.setHorizontalAlignment(JLabel.LEFT);
		moneyText.add(lblMoney1);
		tempMoney += Fighter.BalanceUFC.getClout();
		
		if (winner == 0) {
			lblMoney2 = new JLabel("WIN BONUS: $" + Fighter.BalanceUFC.getClout());
			lblMoney2.setFont(new Font("Tahoma", Font.PLAIN, 10));
			lblMoney2.setPreferredSize(new Dimension(250, 15));
			lblMoney2.setHorizontalAlignment(JLabel.LEFT);
			moneyText.add(lblMoney2);
			tempMoney += Fighter.BalanceUFC.getClout();
		}
		else {
			lblMoney2 = new JLabel("WIN BONUS: N/A");
			lblMoney2.setFont(new Font("Tahoma", Font.PLAIN, 10));
			lblMoney2.setPreferredSize(new Dimension(250, 15));
			lblMoney2.setHorizontalAlignment(JLabel.LEFT);
			moneyText.add(lblMoney2);
		}
		
		if ((stam1 + stam2) <= 70) {
			lblMoney3 = new JLabel("FIGHT OF THE NIGHT BONUS: $50000");
			lblMoney3.setFont(new Font("Tahoma", Font.PLAIN, 10));
			lblMoney3.setPreferredSize(new Dimension(250, 15));
			lblMoney3.setHorizontalAlignment(JLabel.LEFT);
			moneyText.add(lblMoney3);
			tempMoney += 50000;
		}
		else {
			lblMoney3 = new JLabel("FIGHT OF THE NIGHT BONUS: N/A");
			lblMoney3.setFont(new Font("Tahoma", Font.PLAIN, 10));
			lblMoney3.setPreferredSize(new Dimension(250, 15));
			lblMoney3.setHorizontalAlignment(JLabel.LEFT);
			moneyText.add(lblMoney3);
		}
		
		if (finish.equals("KO")) {
			lblMoney4 = new JLabel("PERFORMANCE OF THE NIGHT BONUS: $50000");
			lblMoney4.setFont(new Font("Tahoma", Font.PLAIN, 10));
			lblMoney4.setPreferredSize(new Dimension(250, 15));
			lblMoney4.setHorizontalAlignment(JLabel.LEFT);
			moneyText.add(lblMoney4);
			tempMoney += 50000;
		}
		else {
			lblMoney4 = new JLabel("PERFORMANCE OF THE NIGHT BONUS: N/A");
			lblMoney4.setFont(new Font("Tahoma", Font.PLAIN, 10));
			lblMoney4.setPreferredSize(new Dimension(250, 15));
			lblMoney4.setHorizontalAlignment(JLabel.LEFT);
			moneyText.add(lblMoney4);
		}
		
		if (Fighter.BalanceUFC.getSponsor() > 0) {
			lblMoney5 = new JLabel("SPONSOR: $" + Fighter.BalanceUFC.getSponsor());
			lblMoney5.setFont(new Font("Tahoma", Font.PLAIN, 10));
			lblMoney5.setPreferredSize(new Dimension(250, 15));
			lblMoney5.setHorizontalAlignment(JLabel.LEFT);
			moneyText.add(lblMoney5);
			tempMoney += Fighter.BalanceUFC.getSponsor();
		}
		else {
			lblMoney5 = new JLabel("SPONSOR: N/A");
			lblMoney5.setFont(new Font("Tahoma", Font.PLAIN, 10));
			lblMoney5.setPreferredSize(new Dimension(250, 15));
			lblMoney5.setHorizontalAlignment(JLabel.LEFT);
			moneyText.add(lblMoney5);
		}
		
		lblMoney6 = new JLabel("TOTAL BAGGED: $" + tempMoney);
		lblMoney6.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblMoney6.setPreferredSize(new Dimension(250, 15));
		lblMoney6.setHorizontalAlignment(JLabel.LEFT);
		moneyText.add(lblMoney6);
		
		
		finishText = new JPanel();
		finishText.setBounds(0, 150, 1024, 260);
		UFCgui.con.add(finishText);
		finishText.setVisible(true);
		
		String playerName = (Weight.Player.first + " " + Weight.Player.last);
		String oppoName = (opFirst + " " + opLast);
		
		int[] overallScore = new int[2];
		overallScore[0] = 0;
		overallScore[1] = 0;
		
		switch (round - 1) {
		case 1:
			overallScore[0] += score[0][0];
			overallScore[1] += score[1][0];
			break;
		case 2:
			overallScore[0] += (score[0][0] + score[0][1]);
			overallScore[1] += (score[1][0] + score[1][1]);
			break;
		case 3:
			overallScore[0] += (score[0][0] + score[0][1] + score[0][2]);
			overallScore[1] += (score[1][0] + score[1][1] + score[1][2]);
			break;
		case 4:
			overallScore[0] += (score[0][0] + score[0][1] + score[0][2] + score[0][3]);
			overallScore[1] += (score[1][0] + score[1][1] + score[1][2] + score[1][3]);
			break;
		case 5:
			overallScore[0] += (score[0][0] + score[0][1] + score[0][2] + score[0][3] + score[0][4]);
			overallScore[1] += (score[1][0] + score[1][1] + score[1][2] + score[1][3] + score[1][4]);
			break;
		}
		
		if (finish.equals("0")) {
			if (overallScore[1] > overallScore[0]) {
				winner = 1;
			}
			else {
				winner = 0;
			}
		}
		
		if (finish.equals("0") && ContractScreen.champ == false) {
			lblFinish1 = new JLabel("THE JUDGES SCORE THIS CONTEST:");
			lblFinish1.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblFinish1.setPreferredSize(new Dimension(1024, 30));
			lblFinish1.setHorizontalAlignment(JLabel.CENTER);
			finishText.add(lblFinish1);
			
			if (winner == 0) {
				++Weight.Player.winD;
				lblFinish2 = new JLabel(overallScore[0] + " - " + overallScore[1]);
				lblFinish2.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblFinish2.setPreferredSize(new Dimension(1024, 30));
				lblFinish2.setHorizontalAlignment(JLabel.CENTER);
				finishText.add(lblFinish2);
				
				lblFinish3 = new JLabel("FOR THE WINNER BY UNANIMOUS DECISION...");
				lblFinish3.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblFinish3.setPreferredSize(new Dimension(1024, 30));
				lblFinish3.setHorizontalAlignment(JLabel.CENTER);
				finishText.add(lblFinish3);
				
				lblFinish4 = new JLabel(playerName + "!");
				lblFinish4.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblFinish4.setPreferredSize(new Dimension(1024, 30));
				lblFinish4.setHorizontalAlignment(JLabel.CENTER);
				finishText.add(lblFinish4);
				
				lblFinish5 = new JLabel(" ");
				lblFinish5.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblFinish5.setPreferredSize(new Dimension(1024, 30));
				lblFinish5.setHorizontalAlignment(JLabel.CENTER);
				finishText.add(lblFinish5);
				
				lblFinish6 = new JLabel(score[0][0] + " - " + score[1][0] + ", " + score[0][1] + " - " + score[1][1] + ", " + score[0][2] + " - " + score[1][2]);
				lblFinish6.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblFinish6.setPreferredSize(new Dimension(1024, 30));
				lblFinish6.setHorizontalAlignment(JLabel.CENTER);
				finishText.add(lblFinish6);
			}
			else {
				++Weight.Player.lossD;
				lblFinish2 = new JLabel(overallScore[1] + " - " + overallScore[0]);
				lblFinish2.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblFinish2.setPreferredSize(new Dimension(1024, 30));
				lblFinish2.setHorizontalAlignment(JLabel.CENTER);
				finishText.add(lblFinish2);
				
				lblFinish3 = new JLabel("FOR THE WINNER BY UNANIMOUS DECISION...");
				lblFinish3.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblFinish3.setPreferredSize(new Dimension(1024, 30));
				lblFinish3.setHorizontalAlignment(JLabel.CENTER);
				finishText.add(lblFinish3);
				
				lblFinish4 = new JLabel(oppoName + "!");
				lblFinish4.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblFinish4.setPreferredSize(new Dimension(1024, 30));
				lblFinish4.setHorizontalAlignment(JLabel.CENTER);
				finishText.add(lblFinish4);
				
				lblFinish5 = new JLabel(" ");
				lblFinish5.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblFinish5.setPreferredSize(new Dimension(1024, 30));
				lblFinish5.setHorizontalAlignment(JLabel.CENTER);
				finishText.add(lblFinish5);
				
				lblFinish6 = new JLabel(score[1][0] + " - " + score[0][0] + ", " + score[1][1] + " - " + score[0][1] + ", " + score[1][2] + " - " + score[0][2]);
				lblFinish6.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblFinish6.setPreferredSize(new Dimension(1024, 30));
				lblFinish6.setHorizontalAlignment(JLabel.CENTER);
				finishText.add(lblFinish6);
			}
		}
		else if (finish.equals("0") && ContractScreen.champ == true) {
			lblFinish1 = new JLabel("THE JUDGES SCORE THIS CONTEST:");
			lblFinish1.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblFinish1.setPreferredSize(new Dimension(1024, 30));
			lblFinish1.setHorizontalAlignment(JLabel.CENTER);
			finishText.add(lblFinish1);
			
			if (winner == 0) {
				++Weight.Player.winD;
				lblFinish2 = new JLabel(overallScore[0] + " - " + overallScore[1]);
				lblFinish2.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblFinish2.setPreferredSize(new Dimension(1024, 30));
				lblFinish2.setHorizontalAlignment(JLabel.CENTER);
				finishText.add(lblFinish2);
				
				lblFinish3 = new JLabel("FOR THE WINNER BY UNANIMOUS DECISION...");
				lblFinish3.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblFinish3.setPreferredSize(new Dimension(1024, 30));
				lblFinish3.setHorizontalAlignment(JLabel.CENTER);
				finishText.add(lblFinish3);
				
				if (Weight.Player.position == 0) {
					lblFinish4 = new JLabel("AND STILL! THE UNDISPUTED UFC " + PositionScreen.weight + " CHAMPION OF THE WORLD:");
					lblFinish4.setFont(new Font("Tahoma", Font.BOLD, 20));
					lblFinish4.setPreferredSize(new Dimension(1024, 30));
					lblFinish4.setHorizontalAlignment(JLabel.CENTER);
					finishText.add(lblFinish4);
				}
				else {
					lblFinish4 = new JLabel("AND NEW! UNDISPUTED UFC " + PositionScreen.weight + " CHAMPION OF THE WORLD:");
					lblFinish4.setFont(new Font("Tahoma", Font.BOLD, 20));
					lblFinish4.setPreferredSize(new Dimension(1024, 30));
					lblFinish4.setHorizontalAlignment(JLabel.CENTER);
					finishText.add(lblFinish4);
				}
				
				lblFinish5 = new JLabel(playerName + "!");
				lblFinish5.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblFinish5.setPreferredSize(new Dimension(1024, 30));
				lblFinish5.setHorizontalAlignment(JLabel.CENTER);
				finishText.add(lblFinish5);
				
				lblFinish6 = new JLabel(score[0][0] + " - " + score[1][0] + ", " + score[0][1] + " - " + score[1][1] + ", " + score[0][2] + " - " + score[1][2] + ", " + score[0][3] + " - " + score[1][3] + ", " + score[0][4] + " - " + score[1][4]);
				lblFinish6.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblFinish6.setPreferredSize(new Dimension(1024, 30));
				lblFinish6.setHorizontalAlignment(JLabel.CENTER);
				finishText.add(lblFinish6);
			}
			else {
				++Weight.Player.lossD;
				lblFinish2 = new JLabel(overallScore[1] + " - " + overallScore[0]);
				lblFinish2.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblFinish2.setPreferredSize(new Dimension(1024, 30));
				lblFinish2.setHorizontalAlignment(JLabel.CENTER);
				finishText.add(lblFinish2);
				
				lblFinish3 = new JLabel("FOR THE WINNER BY UNANIMOUS DECISION...");
				lblFinish3.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblFinish3.setPreferredSize(new Dimension(1024, 30));
				lblFinish3.setHorizontalAlignment(JLabel.CENTER);
				finishText.add(lblFinish3);
				
				if (Weight.Player.position == 0) {
					lblFinish4 = new JLabel("AND NEW! UNDISPUTED UFC " + PositionScreen.weight + " CHAMPION OF THE WORLD:");
					lblFinish4.setFont(new Font("Tahoma", Font.BOLD, 20));
					lblFinish4.setPreferredSize(new Dimension(1024, 30));
					lblFinish4.setHorizontalAlignment(JLabel.CENTER);
					finishText.add(lblFinish4);
				}
				else {
					lblFinish4 = new JLabel("AND STILL! THE UNDISPUTED UFC " + PositionScreen.weight + " CHAMPION OF THE WORLD:");
					lblFinish4.setFont(new Font("Tahoma", Font.BOLD, 20));
					lblFinish4.setPreferredSize(new Dimension(1024, 30));
					lblFinish4.setHorizontalAlignment(JLabel.CENTER);
					finishText.add(lblFinish4);
				}
				
				lblFinish5 = new JLabel(oppoName + "!");
				lblFinish5.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblFinish5.setPreferredSize(new Dimension(1024, 30));
				lblFinish5.setHorizontalAlignment(JLabel.CENTER);
				finishText.add(lblFinish5);
				
				lblFinish6 = new JLabel(score[1][0] + " - " + score[0][0] + ", " + score[1][1] + " - " + score[0][1] + ", " + score[1][2] + " - " + score[0][2] + ", " + score[1][3] + " - " + score[0][3] + ", " + score[1][4] + " - " + score[0][4]);
				lblFinish6.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblFinish6.setPreferredSize(new Dimension(1024, 30));
				lblFinish6.setHorizontalAlignment(JLabel.CENTER);
				finishText.add(lblFinish6);
			}
		}
		else if (ContractScreen.champ == false) {
			if (finish.equals("KO")) {
				lblFinish1 = new JLabel("DECLARING THE WINNER BY KNOCKOUT...");
				lblFinish1.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblFinish1.setPreferredSize(new Dimension(1024, 30));
				lblFinish1.setHorizontalAlignment(JLabel.CENTER);
				finishText.add(lblFinish1);
			}
			else if (finish.equals("TKO")) {
				lblFinish1 = new JLabel("DECLARING THE WINNER BY TKO...");
				lblFinish1.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblFinish1.setPreferredSize(new Dimension(1024, 30));
				lblFinish1.setHorizontalAlignment(JLabel.CENTER);
				finishText.add(lblFinish1);
			}
			else if (finish.equals("SUB")) {
				lblFinish1 = new JLabel("DECLARING THE WINNER BY SUBMISSION...");
				lblFinish1.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblFinish1.setPreferredSize(new Dimension(1024, 30));
				lblFinish1.setHorizontalAlignment(JLabel.CENTER);
				finishText.add(lblFinish1);
			}
			
			if (winner == 0) {
				if (finish.equals("KO")) {
					++Weight.Player.winKO;
				}
				else if (finish.equals("TKO")) {
					++Weight.Player.winTKO;
				}
				else if (finish.equals("SUB")) {
					++Weight.Player.winSub;
				}
				
				switch (round - 1) {
					case 1:
						++Weight.Player.win1;
						break;
					case 2:
						++Weight.Player.win2;
						break;
					case 3:
						++Weight.Player.win3;
						break;
				}
				
				lblFinish2 = new JLabel(playerName + "!");
				lblFinish2.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblFinish2.setPreferredSize(new Dimension(1024, 30));
				lblFinish2.setHorizontalAlignment(JLabel.CENTER);
				finishText.add(lblFinish2);
				
				lblFinish3 = new JLabel(" ");
				lblFinish3.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblFinish3.setPreferredSize(new Dimension(1024, 30));
				lblFinish3.setHorizontalAlignment(JLabel.CENTER);
				finishText.add(lblFinish3);
				
				lblFinish4 = new JLabel(" ");
				lblFinish4.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblFinish4.setPreferredSize(new Dimension(1024, 30));
				lblFinish4.setHorizontalAlignment(JLabel.CENTER);
				finishText.add(lblFinish3);
				
				lblFinish5 = new JLabel(" ");
				lblFinish5.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblFinish5.setPreferredSize(new Dimension(1024, 30));
				lblFinish5.setHorizontalAlignment(JLabel.CENTER);
				finishText.add(lblFinish5);
				
				switch (round - 1) {
				case 2:
					lblFinish6 = new JLabel(score[0][0] + " - " + score[1][0]);
					lblFinish6.setFont(new Font("Tahoma", Font.BOLD, 20));
					lblFinish6.setPreferredSize(new Dimension(1024, 30));
					lblFinish6.setHorizontalAlignment(JLabel.CENTER);
					finishText.add(lblFinish6);
					break;
				case 3:
					lblFinish6 = new JLabel(score[0][0] + " - " + score[1][0] + ", " + score[0][1] + " - " + score[1][1]);
					lblFinish6.setFont(new Font("Tahoma", Font.BOLD, 20));
					lblFinish6.setPreferredSize(new Dimension(1024, 30));
					lblFinish6.setHorizontalAlignment(JLabel.CENTER);
					finishText.add(lblFinish6);
					break;
				}
			}
			else {
				if (finish.equals("KO")) {
					++Weight.Player.lossKO;
				}
				else if (finish.equals("TKO")) {
					++Weight.Player.lossTKO;
				}
				else if (finish.equals("SUB")) {
					++Weight.Player.lossSub;
				}
				
				switch (round - 1) {
				case 1:
					++Weight.Player.loss1;
					break;
				case 2:
					++Weight.Player.loss2;
					break;
				case 3:
					++Weight.Player.loss3;
					break;
			}
			
				lblFinish2 = new JLabel(oppoName + "!");
				lblFinish2.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblFinish2.setPreferredSize(new Dimension(1024, 30));
				lblFinish2.setHorizontalAlignment(JLabel.CENTER);
				finishText.add(lblFinish2);
				
				lblFinish3 = new JLabel(" ");
				lblFinish3.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblFinish3.setPreferredSize(new Dimension(1024, 30));
				lblFinish3.setHorizontalAlignment(JLabel.CENTER);
				finishText.add(lblFinish3);
				
				lblFinish4 = new JLabel(" ");
				lblFinish4.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblFinish4.setPreferredSize(new Dimension(1024, 30));
				lblFinish4.setHorizontalAlignment(JLabel.CENTER);
				finishText.add(lblFinish3);
				
				lblFinish5 = new JLabel(" ");
				lblFinish5.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblFinish5.setPreferredSize(new Dimension(1024, 30));
				lblFinish5.setHorizontalAlignment(JLabel.CENTER);
				finishText.add(lblFinish5);
				
				switch (round - 1) {
				case 2:
					lblFinish6 = new JLabel(score[1][0] + " - " + score[0][0]);
					lblFinish6.setFont(new Font("Tahoma", Font.BOLD, 20));
					lblFinish6.setPreferredSize(new Dimension(1024, 30));
					lblFinish6.setHorizontalAlignment(JLabel.CENTER);
					finishText.add(lblFinish6);
					break;
				case 3:
					lblFinish6 = new JLabel(score[1][0] + " - " + score[0][0] + ", " + score[1][1] + " - " + score[0][1]);
					lblFinish6.setFont(new Font("Tahoma", Font.BOLD, 20));
					lblFinish6.setPreferredSize(new Dimension(1024, 30));
					lblFinish6.setHorizontalAlignment(JLabel.CENTER);
					finishText.add(lblFinish6);
					break;
				}
			}
		}
		else if (ContractScreen.champ == true) {
			if (finish.equals("KO")) {
				lblFinish1 = new JLabel("DECLARING THE WINNER BY KNOCKOUT...");
				lblFinish1.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblFinish1.setPreferredSize(new Dimension(1024, 30));
				lblFinish1.setHorizontalAlignment(JLabel.CENTER);
				finishText.add(lblFinish1);
			}
			else if (finish.equals("TKO")) {
				lblFinish1 = new JLabel("DECLARING THE WINNER BY TKO...");
				lblFinish1.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblFinish1.setPreferredSize(new Dimension(1024, 30));
				lblFinish1.setHorizontalAlignment(JLabel.CENTER);
				finishText.add(lblFinish1);
			}
			else if (finish.equals("SUB")) {
				lblFinish1 = new JLabel("DECLARING THE WINNER BY SUBMISSION...");
				lblFinish1.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblFinish1.setPreferredSize(new Dimension(1024, 30));
				lblFinish1.setHorizontalAlignment(JLabel.CENTER);
				finishText.add(lblFinish1);
			}
			
			if (winner == 0) {
				if (finish.equals("KO")) {
					++Weight.Player.winKO;
				}
				else if (finish.equals("TKO")) {
					++Weight.Player.winTKO;
				}
				else if (finish.equals("SUB")) {
					++Weight.Player.winSub;
				}
				
				switch (round - 1) {
				case 1:
					++Weight.Player.win1;
					break;
				case 2:
					++Weight.Player.win2;
					break;
				case 3:
					++Weight.Player.win3;
					break;
				case 4:
					++Weight.Player.win4;
					break;
				case 5:
					++Weight.Player.win5;
					break;
			}
				
				if (Weight.Player.position == 0) {
					lblFinish2 = new JLabel("AND STILL! THE UNDISPUTED UFC " + PositionScreen.weight + " CHAMPION OF THE WORLD:");
					lblFinish2.setFont(new Font("Tahoma", Font.BOLD, 20));
					lblFinish2.setPreferredSize(new Dimension(1024, 30));
					lblFinish2.setHorizontalAlignment(JLabel.CENTER);
					finishText.add(lblFinish2);
					
					lblFinish3 = new JLabel(playerName + "!");
					lblFinish3.setFont(new Font("Tahoma", Font.BOLD, 20));
					lblFinish3.setPreferredSize(new Dimension(1024, 30));
					lblFinish3.setHorizontalAlignment(JLabel.CENTER);
					finishText.add(lblFinish3);
				}
				else {
					lblFinish2 = new JLabel("AND NEW! UNDISPUTED UFC " + PositionScreen.weight + " CHAMPION OF THE WORLD:");
					lblFinish2.setFont(new Font("Tahoma", Font.BOLD, 20));
					lblFinish2.setPreferredSize(new Dimension(1024, 30));
					lblFinish2.setHorizontalAlignment(JLabel.CENTER);
					finishText.add(lblFinish2);
					
					lblFinish3 = new JLabel(playerName + "!");
					lblFinish3.setFont(new Font("Tahoma", Font.BOLD, 20));
					lblFinish3.setPreferredSize(new Dimension(1024, 30));
					lblFinish3.setHorizontalAlignment(JLabel.CENTER);
					finishText.add(lblFinish3);
				}
				
				lblFinish4 = new JLabel(" ");
				lblFinish4.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblFinish4.setPreferredSize(new Dimension(1024, 30));
				lblFinish4.setHorizontalAlignment(JLabel.CENTER);
				finishText.add(lblFinish3);
				
				lblFinish5 = new JLabel(" ");
				lblFinish5.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblFinish5.setPreferredSize(new Dimension(1024, 30));
				lblFinish5.setHorizontalAlignment(JLabel.CENTER);
				finishText.add(lblFinish5);
				
				switch (round - 1) {
				case 2:
					lblFinish6 = new JLabel(score[0][0] + " - " + score[1][0]);
					lblFinish6.setFont(new Font("Tahoma", Font.BOLD, 20));
					lblFinish6.setPreferredSize(new Dimension(1024, 30));
					lblFinish6.setHorizontalAlignment(JLabel.CENTER);
					finishText.add(lblFinish6);
					break;
				case 3:
					lblFinish6 = new JLabel(score[0][0] + " - " + score[1][0] + ", " + score[0][1] + " - " + score[1][1]);
					lblFinish6.setFont(new Font("Tahoma", Font.BOLD, 20));
					lblFinish6.setPreferredSize(new Dimension(1024, 30));
					lblFinish6.setHorizontalAlignment(JLabel.CENTER);
					finishText.add(lblFinish6);
					break;
				case 4:
					lblFinish6 = new JLabel(score[0][0] + " - " + score[1][0] + ", " + score[0][1] + " - " + score[1][1] + ", " + score[0][2] + " - " + score[1][2]);
					lblFinish6.setFont(new Font("Tahoma", Font.BOLD, 20));
					lblFinish6.setPreferredSize(new Dimension(1024, 30));
					lblFinish6.setHorizontalAlignment(JLabel.CENTER);
					finishText.add(lblFinish6);
					break;
				case 5:
					lblFinish6 = new JLabel(score[0][0] + " - " + score[1][0] + ", " + score[0][1] + " - " + score[1][1] + ", " + score[0][2] + " - " + score[1][2] + ", " + score[0][3] + " - " + score[1][3]);
					lblFinish6.setFont(new Font("Tahoma", Font.BOLD, 20));
					lblFinish6.setPreferredSize(new Dimension(1024, 30));
					lblFinish6.setHorizontalAlignment(JLabel.CENTER);
					finishText.add(lblFinish6);
					break;
				}
			}
			else {
				if (finish.equals("KO")) {
					++Weight.Player.lossKO;
				}
				else if (finish.equals("TKO")) {
					++Weight.Player.lossTKO;
				}
				else if (finish.equals("SUB")) {
					++Weight.Player.lossSub;
				}
				
				switch (round - 1) {
				case 1:
					++Weight.Player.loss1;
					break;
				case 2:
					++Weight.Player.loss2;
					break;
				case 3:
					++Weight.Player.loss3;
					break;
				case 4:
					++Weight.Player.loss4;
					break;
				case 5:
					++Weight.Player.loss5;
					break;
			}
				
				if (Weight.Player.position == 0) {
					lblFinish2 = new JLabel("AND NEW! UNDISPUTED UFC " + PositionScreen.weight + " CHAMPION OF THE WORLD:");
					lblFinish2.setFont(new Font("Tahoma", Font.BOLD, 20));
					lblFinish2.setPreferredSize(new Dimension(1024, 30));
					lblFinish2.setHorizontalAlignment(JLabel.CENTER);
					finishText.add(lblFinish2);
					
					lblFinish3 = new JLabel(oppoName + "!");
					lblFinish3.setFont(new Font("Tahoma", Font.BOLD, 20));
					lblFinish3.setPreferredSize(new Dimension(1024, 30));
					lblFinish3.setHorizontalAlignment(JLabel.CENTER);
					finishText.add(lblFinish3);
				}
				else {
					lblFinish2 = new JLabel("AND STILL! THE UNDISPUTED UFC " + PositionScreen.weight + " CHAMPION OF THE WORLD:");
					lblFinish2.setFont(new Font("Tahoma", Font.BOLD, 20));
					lblFinish2.setPreferredSize(new Dimension(1024, 30));
					lblFinish2.setHorizontalAlignment(JLabel.CENTER);
					finishText.add(lblFinish2);
					
					lblFinish3 = new JLabel(oppoName + "!");
					lblFinish3.setFont(new Font("Tahoma", Font.BOLD, 20));
					lblFinish3.setPreferredSize(new Dimension(1024, 30));
					lblFinish3.setHorizontalAlignment(JLabel.CENTER);
					finishText.add(lblFinish3);
				}
				
				lblFinish4 = new JLabel(" ");
				lblFinish4.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblFinish4.setPreferredSize(new Dimension(1024, 30));
				lblFinish4.setHorizontalAlignment(JLabel.CENTER);
				finishText.add(lblFinish3);
				
				lblFinish5 = new JLabel(" ");
				lblFinish5.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblFinish5.setPreferredSize(new Dimension(1024, 30));
				lblFinish5.setHorizontalAlignment(JLabel.CENTER);
				finishText.add(lblFinish5);
				
				switch (round - 1) {
				case 2:
					lblFinish6 = new JLabel(score[1][0] + " - " + score[0][0]);
					lblFinish6.setFont(new Font("Tahoma", Font.BOLD, 20));
					lblFinish6.setPreferredSize(new Dimension(1024, 30));
					lblFinish6.setHorizontalAlignment(JLabel.CENTER);
					finishText.add(lblFinish6);
					break;
				case 3:
					lblFinish6 = new JLabel(score[1][0] + " - " + score[0][0] + ", " + score[1][1] + " - " + score[0][1]);
					lblFinish6.setFont(new Font("Tahoma", Font.BOLD, 20));
					lblFinish6.setPreferredSize(new Dimension(1024, 30));
					lblFinish6.setHorizontalAlignment(JLabel.CENTER);
					finishText.add(lblFinish6);
					break;
				case 4:
					lblFinish6 = new JLabel(score[1][0] + " - " + score[0][0] + ", " + score[1][1] + " - " + score[0][1] + ", " + score[1][2] + " - " + score[0][2]);
					lblFinish6.setFont(new Font("Tahoma", Font.BOLD, 20));
					lblFinish6.setPreferredSize(new Dimension(1024, 30));
					lblFinish6.setHorizontalAlignment(JLabel.CENTER);
					finishText.add(lblFinish6);
					break;
				case 5:
					lblFinish6 = new JLabel(score[1][0] + " - " + score[0][0] + ", " + score[1][1] + " - " + score[0][1] + ", " + score[1][2] + " - " + score[0][2] + ", " + score[1][3] + " - " + score[0][3]);
					lblFinish6.setFont(new Font("Tahoma", Font.BOLD, 20));
					lblFinish6.setPreferredSize(new Dimension(1024, 30));
					lblFinish6.setHorizontalAlignment(JLabel.CENTER);
					finishText.add(lblFinish6);
					break;
				}
			}
		}
		
		
		
	}
	
	public static class steadyFightScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();

			btnSteady.setEnabled(false);
			btnBrawl.setEnabled(true);
			btnBlitz.setEnabled(true);
			btnMaul.setEnabled(true);
			btnRead.setEnabled(true);
			
			strat[0] = 1;
			
			if (strat[0] == 0 || strat[1] == 0) {}
			else {
				btnFight.setEnabled(true);
			}

		}
	}
	
	public static class brawlFightScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();

			btnSteady.setEnabled(true);
			btnBrawl.setEnabled(false);
			btnBlitz.setEnabled(true);
			btnMaul.setEnabled(true);
			btnRead.setEnabled(true);
			
			strat[0] = 2;
			
			if (strat[0] == 0 || strat[1] == 0) {}
			else {
				btnFight.setEnabled(true);
			}

		}
	}
	
	public static class blitzFightScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();

			btnSteady.setEnabled(true);
			btnBrawl.setEnabled(true);
			btnBlitz.setEnabled(false);
			btnMaul.setEnabled(true);
			btnRead.setEnabled(true);
			
			strat[0] = 3;
			
			if (strat[0] == 0 || strat[1] == 0) {}
			else {
				btnFight.setEnabled(true);
			}

		}
	}
	
	public static class maulFightScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();

			btnSteady.setEnabled(true);
			btnBrawl.setEnabled(true);
			btnBlitz.setEnabled(true);
			btnMaul.setEnabled(false);
			btnRead.setEnabled(true);
			
			strat[0] = 4;
			
			if (strat[0] == 0 || strat[1] == 0) {}
			else {
				btnFight.setEnabled(true);
			}

		}
	}
	
	public static class readFightScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();

			btnSteady.setEnabled(true);
			btnBrawl.setEnabled(true);
			btnBlitz.setEnabled(true);
			btnMaul.setEnabled(true);
			btnRead.setEnabled(false);
			
			strat[0] = 5;
			
			if (strat[0] == 0 || strat[1] == 0) {}
			else {
				btnFight.setEnabled(true);
			}

		}
	}
	
	public static class counterFightScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();

			btnCounter.setEnabled(false);
			btnHandsUp.setEnabled(true);
			btnHandsDown.setEnabled(true);
			
			strat[1] = 1;
			
			if (strat[0] == 0 || strat[1] == 0) {}
			else {
				btnFight.setEnabled(true);
			}

		}
	}
	
	public static class handsUpFightScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();

			btnCounter.setEnabled(true);
			btnHandsUp.setEnabled(false);
			btnHandsDown.setEnabled(true);
			
			strat[1] = 2;
			
			if (strat[0] == 0 || strat[1] == 0) {}
			else {
				btnFight.setEnabled(true);
			}

		}
	}
	
	public static class handsDownFightScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();
			
			btnCounter.setEnabled(true);
			btnHandsUp.setEnabled(true);
			btnHandsDown.setEnabled(false);
			
			strat[1] = 3;
			
			if (strat[0] == 0 || strat[1] == 0) {}
			else {
				btnFight.setEnabled(true);
			}

		}
	}
	
	public static class Fight1ScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();
			
			tott.setVisible(false);
			tottList.setVisible(false);
			tottNum1.setVisible(false);
			tottNum2.setVisible(false);
			tottName1.setVisible(false);
			tottName2.setVisible(false);
			tottRecord1.setVisible(false);
			tottRecord2.setVisible(false);
			fight1.setVisible(false);

			fightScreen1();
		}
	}
	
	public static class FightScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();
			
			fightCamp.setVisible(false);
			steady.setVisible(false);
			brawl.setVisible(false);
			blitz.setVisible(false);
			maul.setVisible(false);
			read.setVisible(false);
			counter.setVisible(false);
			handsUp.setVisible(false);
			handsDown.setVisible(false);
			offense.setVisible(false);
			defense.setVisible(false);
			fight.setVisible(false);
			overview.setVisible(false);
			overviewNum.setVisible(false);
			overview1.setVisible(false);
			overviewNum1.setVisible(false);
			name1.setVisible(false);
			name2.setVisible(false);
			
			fightScreen2();
		}
	}
	
	public static class Fight2ScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();
			
			fightRound.setVisible(false);
			fight2.setVisible(false);
			stamina1.setVisible(false);
			stamina2.setVisible(false);
			name1.setVisible(false);
			name2.setVisible(false);
			fightText.setVisible(false);
			strat1Text.setVisible(false);
			strat2Text.setVisible(false);

			fightScreen1();
		}
	}
	
	public static class FinishFightScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();

			fightRound.setVisible(false);
			stamina1.setVisible(false);
			stamina2.setVisible(false);
			name1.setVisible(false);
			name2.setVisible(false);
			finishFight.setVisible(false);
			fightText.setVisible(false);
			strat1Text.setVisible(false);
			strat2Text.setVisible(false);

			finishFightScreen();
		}
	}
	
	public static class DoneFightScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();
			
			UFCgui.music.stop();
			UFCgui.music.setFile(UFCgui.startMusic);
			UFCgui.music.play();
			
			moneyText.setVisible(false);
			finishText.setVisible(false);
			done.setVisible(false);
			Fighter.money.setVisible(false);
			Fighter.date.setVisible(false);

			Fighter.MonthUFC.incMonth();

			if (winner == 0) {
				if (Weight.Player.prevWin == true) {
					++Weight.Player.winStreak;
				}
				else {
					Weight.Player.prevWin = true;
					++Weight.Player.winStreak;
				}
			}
			else {
				Weight.Player.prevWin = false;
				Weight.Player.winStreak = 0;
			}
				
			if (winner == 0) {
				int newTweet = (10 - ContractScreen.opPos) * 10000;
				int newBalance = Fighter.BalanceUFC.getClout() * 2;
				int iqSub = timesRead1;
				Weight.Player.iq -= iqSub;
				if (finish.equals("KO")) {
					newBalance += 50000;
				}
				if ((stam1 + stam2) <= 70) {
					newBalance += 50000;
				}
				newBalance += Fighter.BalanceUFC.sponsor;
				Fighter.BalanceUFC.addTwitter(newTweet);
				Fighter.BalanceUFC.addBalance(newBalance);
				switch (Weight.Player.getWeight()) {
					case 1:
						++PositionCheck.flyInt[Weight.Player.getPos()][0];
						++PositionCheck.flyInt[ContractScreen.opPos][1];
						++Weight.Player.win;
						break;
					case 2:
						++PositionCheck.bantamInt[Weight.Player.getPos()][0];
						++PositionCheck.bantamInt[ContractScreen.opPos][1];
						++Weight.Player.win;
						break;
					case 3:
						++PositionCheck.featherInt[Weight.Player.getPos()][0];
						++PositionCheck.featherInt[ContractScreen.opPos][1];
						++Weight.Player.win;
						break;
					case 4:
						++PositionCheck.lightInt[Weight.Player.getPos()][0];
						++PositionCheck.lightInt[ContractScreen.opPos][1];
						++Weight.Player.win;
						break;
					case 5:
						++PositionCheck.welterInt[Weight.Player.getPos()][0];
						++PositionCheck.welterInt[ContractScreen.opPos][1];
						++Weight.Player.win;
						break;
					case 6:
						++PositionCheck.middleInt[Weight.Player.getPos()][0];
						++PositionCheck.middleInt[ContractScreen.opPos][1];
						++Weight.Player.win;
						break;
					case 7:
						++PositionCheck.lheavyInt[Weight.Player.getPos()][0];
						++PositionCheck.lheavyInt[ContractScreen.opPos][1];
						++Weight.Player.win;
						break;
					case 8:
						++PositionCheck.heavyInt[Weight.Player.getPos()][0];
						++PositionCheck.heavyInt[ContractScreen.opPos][1];
						++Weight.Player.win;
						break;
				}
			}
			else if (winner == 1) {
				int newTweet = (10 - ContractScreen.opPos) * 1000;
				int newBalance = Fighter.BalanceUFC.getClout();
				if ((stam1 + stam2) <= 70) {
					newBalance += 50000;
				}
				int iqSub = timesRead1;
				Weight.Player.iq -= iqSub;
				newBalance += Fighter.BalanceUFC.sponsor;
				Fighter.BalanceUFC.addTwitter(newTweet);
				Fighter.BalanceUFC.addBalance(newBalance);
				switch (PositionScreen.wegt) {
					case 1:
						++PositionCheck.flyInt[ContractScreen.opPos][0];
						++PositionCheck.flyInt[Weight.Player.getPos()][1];
						++Weight.Player.loss;
						break;
					case 2:
						++PositionCheck.bantamInt[ContractScreen.opPos][0];
						++PositionCheck.bantamInt[Weight.Player.getPos()][1];
						++Weight.Player.loss;
						break;
					case 3:
						++PositionCheck.featherInt[ContractScreen.opPos][0];
						++PositionCheck.featherInt[Weight.Player.getPos()][1];
						++Weight.Player.loss;
						break;
					case 4:
						++PositionCheck.lightInt[ContractScreen.opPos][0];
						++PositionCheck.lightInt[Weight.Player.getPos()][1];
						++Weight.Player.loss;
						break;
					case 5:
						++PositionCheck.welterInt[ContractScreen.opPos][0];
						++PositionCheck.welterInt[Weight.Player.getPos()][1];
						++Weight.Player.loss;
						break;
					case 6:
						++PositionCheck.middleInt[ContractScreen.opPos][0];
						++PositionCheck.middleInt[Weight.Player.getPos()][1];
						++Weight.Player.loss;
						break;
					case 7:
						++PositionCheck.lheavyInt[ContractScreen.opPos][0];
						++PositionCheck.lheavyInt[Weight.Player.getPos()][1];
						++Weight.Player.loss;
						break;
					case 8:
						++PositionCheck.heavyInt[ContractScreen.opPos][0];
						++PositionCheck.heavyInt[Weight.Player.getPos()][1];
						++Weight.Player.loss;
						break;
				}
			}
			
			Weight.Player.setRecov(stam1 / 100);

			if (Weight.Player.getPos() < ContractScreen.opPos && winner == 1) {
				int newPos = Weight.Player.getPos();
				switch (PositionScreen.wegt) {
				case 1:
					String[] youStr = new String[4];
					Integer[] youInt = new Integer[4];
					Double[] youDbl = new Double[4];
					Boolean[] youBool = new Boolean[4];

					youStr = PositionCheck.flyStr[ContractScreen.opPos];
					youInt = PositionCheck.flyInt[ContractScreen.opPos];
					youDbl = PositionCheck.flyDbl[ContractScreen.opPos];
					youBool = PositionCheck.flyBool[ContractScreen.opPos];
					
					for (int i = 10; i >= 0; --i) {	
						if ((PositionCheck.flyInt[i][2] >= Weight.Player.getPos()) && (PositionCheck.flyInt[i][2] < ContractScreen.opPos)) {
							PositionCheck.flyStr[i + 1] = PositionCheck.flyStr[i];
							PositionCheck.flyInt[i + 1] = PositionCheck.flyInt[i];
							PositionCheck.flyDbl[i + 1] = PositionCheck.flyDbl[i];
							PositionCheck.flyBool[i + 1] = PositionCheck.flyBool[i];
							++PositionCheck.flyInt[i + 1][2];
						}
					}
					
					PositionCheck.flyStr[newPos] = youStr;
					PositionCheck.flyInt[newPos] = youInt;
					PositionCheck.flyDbl[newPos] = youDbl;
					PositionCheck.flyBool[newPos] = youBool;
					PositionCheck.flyInt[newPos][2] = newPos;
					break;
				case 2:
					String[] youStr1 = new String[4];
					Integer[] youInt1 = new Integer[4];
					Double[] youDbl1 = new Double[4];
					Boolean[] youBool1 = new Boolean[4];

					youStr1 = PositionCheck.bantamStr[ContractScreen.opPos];
					youInt1 = PositionCheck.bantamInt[ContractScreen.opPos];
					youDbl1 = PositionCheck.bantamDbl[ContractScreen.opPos];
					youBool1 = PositionCheck.bantamBool[ContractScreen.opPos];
					
					for (int i = 10; i >= 0; --i) {	
						if ((PositionCheck.bantamInt[i][2] >= Weight.Player.getPos()) && (PositionCheck.bantamInt[i][2] < ContractScreen.opPos)) {
							PositionCheck.bantamStr[i + 1] = PositionCheck.bantamStr[i];
							PositionCheck.bantamInt[i + 1] = PositionCheck.bantamInt[i];
							PositionCheck.bantamDbl[i + 1] = PositionCheck.bantamDbl[i];
							PositionCheck.bantamBool[i + 1] = PositionCheck.bantamBool[i];
							++PositionCheck.bantamInt[i + 1][2];
						}
					}
					
					PositionCheck.bantamStr[newPos] = youStr1;
					PositionCheck.bantamInt[newPos] = youInt1;
					PositionCheck.bantamDbl[newPos] = youDbl1;
					PositionCheck.bantamBool[newPos] = youBool1;
					PositionCheck.bantamInt[newPos][2] = newPos;
					break;
				case 3:
					String[] youStr2 = new String[4];
					Integer[] youInt2 = new Integer[4];
					Double[] youDbl2 = new Double[4];
					Boolean[] youBool2 = new Boolean[4];

					youStr2 = PositionCheck.featherStr[ContractScreen.opPos];
					youInt2 = PositionCheck.featherInt[ContractScreen.opPos];
					youDbl2 = PositionCheck.featherDbl[ContractScreen.opPos];
					youBool2 = PositionCheck.featherBool[ContractScreen.opPos];
					
					for (int i = 10; i >= 0; --i) {	
						if ((PositionCheck.featherInt[i][2] >= Weight.Player.getPos()) && (PositionCheck.featherInt[i][2] < ContractScreen.opPos)) {
							PositionCheck.featherStr[i + 1] = PositionCheck.featherStr[i];
							PositionCheck.featherInt[i + 1] = PositionCheck.featherInt[i];
							PositionCheck.featherDbl[i + 1] = PositionCheck.featherDbl[i];
							PositionCheck.featherBool[i + 1] = PositionCheck.featherBool[i];
							++PositionCheck.featherInt[i + 1][2];
						}
					}
					
					PositionCheck.featherStr[newPos] = youStr2;
					PositionCheck.featherInt[newPos] = youInt2;
					PositionCheck.featherDbl[newPos] = youDbl2;
					PositionCheck.featherBool[newPos] = youBool2;
					PositionCheck.featherInt[newPos][2] = newPos;
					break;
				case 4:
					String[] youStr3 = new String[4];
					Integer[] youInt3 = new Integer[4];
					Double[] youDbl3 = new Double[4];
					Boolean[] youBool3 = new Boolean[4];

					youStr3 = PositionCheck.lightStr[ContractScreen.opPos];
					youInt3 = PositionCheck.lightInt[ContractScreen.opPos];
					youDbl3 = PositionCheck.lightDbl[ContractScreen.opPos];
					youBool3 = PositionCheck.lightBool[ContractScreen.opPos];
					
					for (int i = 10; i >= 0; --i) {	
						if ((PositionCheck.lightInt[i][2] >= Weight.Player.getPos()) && (PositionCheck.lightInt[i][2] < ContractScreen.opPos)) {
							PositionCheck.lightStr[i + 1] = PositionCheck.lightStr[i];
							PositionCheck.lightInt[i + 1] = PositionCheck.lightInt[i];
							PositionCheck.lightDbl[i + 1] = PositionCheck.lightDbl[i];
							PositionCheck.lightBool[i + 1] = PositionCheck.lightBool[i];
							++PositionCheck.lightInt[i + 1][2];
						}
					}
					
					PositionCheck.lightStr[newPos] = youStr3;
					PositionCheck.lightInt[newPos] = youInt3;
					PositionCheck.lightDbl[newPos] = youDbl3;
					PositionCheck.lightBool[newPos] = youBool3;
					PositionCheck.lightInt[newPos][2] = newPos;
					break;
				case 5:
					String[] youStr4 = new String[4];
					Integer[] youInt4 = new Integer[4];
					Double[] youDbl4 = new Double[4];
					Boolean[] youBool4 = new Boolean[4];

					youStr4 = PositionCheck.welterStr[ContractScreen.opPos];
					youInt4 = PositionCheck.welterInt[ContractScreen.opPos];
					youDbl4 = PositionCheck.welterDbl[ContractScreen.opPos];
					youBool4 = PositionCheck.welterBool[ContractScreen.opPos];
					
					for (int i = 10; i >= 0; --i) {	
						if ((PositionCheck.welterInt[i][2] >= Weight.Player.getPos()) && (PositionCheck.welterInt[i][2] < ContractScreen.opPos)) {
							PositionCheck.welterStr[i + 1] = PositionCheck.welterStr[i];
							PositionCheck.welterInt[i + 1] = PositionCheck.welterInt[i];
							PositionCheck.welterDbl[i + 1] = PositionCheck.welterDbl[i];
							PositionCheck.welterBool[i + 1] = PositionCheck.welterBool[i];
							++PositionCheck.welterInt[i + 1][2];
						}
					}
					
					PositionCheck.welterStr[newPos] = youStr4;
					PositionCheck.welterInt[newPos] = youInt4;
					PositionCheck.welterDbl[newPos] = youDbl4;
					PositionCheck.welterBool[newPos] = youBool4;
					PositionCheck.welterInt[newPos][2] = newPos;
					break;
				case 6:
					String[] youStr5 = new String[4];
					Integer[] youInt5 = new Integer[4];
					Double[] youDbl5 = new Double[4];
					Boolean[] youBool5 = new Boolean[4];

					youStr5 = PositionCheck.middleStr[ContractScreen.opPos];
					youInt5 = PositionCheck.middleInt[ContractScreen.opPos];
					youDbl5 = PositionCheck.middleDbl[ContractScreen.opPos];
					youBool5 = PositionCheck.middleBool[ContractScreen.opPos];
					
					for (int i = 10; i >= 0; --i) {	
						if ((PositionCheck.middleInt[i][2] >= Weight.Player.getPos()) && (PositionCheck.middleInt[i][2] < ContractScreen.opPos)) {
							PositionCheck.middleStr[i + 1] = PositionCheck.middleStr[i];
							PositionCheck.middleInt[i + 1] = PositionCheck.middleInt[i];
							PositionCheck.middleDbl[i + 1] = PositionCheck.middleDbl[i];
							PositionCheck.middleBool[i + 1] = PositionCheck.middleBool[i];
							++PositionCheck.middleInt[i + 1][2];
						}
					}
					
					PositionCheck.middleStr[newPos] = youStr5;
					PositionCheck.middleInt[newPos] = youInt5;
					PositionCheck.middleDbl[newPos] = youDbl5;
					PositionCheck.middleBool[newPos] = youBool5;
					PositionCheck.middleInt[newPos][2] = newPos;
					break;
				case 7:
					String[] youStr6 = new String[4];
					Integer[] youInt6 = new Integer[4];
					Double[] youDbl6 = new Double[4];
					Boolean[] youBool6 = new Boolean[4];

					youStr6 = PositionCheck.lheavyStr[ContractScreen.opPos];
					youInt6 = PositionCheck.lheavyInt[ContractScreen.opPos];
					youDbl6 = PositionCheck.lheavyDbl[ContractScreen.opPos];
					youBool6 = PositionCheck.lheavyBool[ContractScreen.opPos];
					
					for (int i = 10; i >= 0; --i) {	
						if ((PositionCheck.lheavyInt[i][2] >= Weight.Player.getPos()) && (PositionCheck.lheavyInt[i][2] < ContractScreen.opPos)) {
							PositionCheck.lheavyStr[i + 1] = PositionCheck.lheavyStr[i];
							PositionCheck.lheavyInt[i + 1] = PositionCheck.lheavyInt[i];
							PositionCheck.lheavyDbl[i + 1] = PositionCheck.lheavyDbl[i];
							PositionCheck.lheavyBool[i + 1] = PositionCheck.lheavyBool[i];
							++PositionCheck.lheavyInt[i + 1][2];
						}
					}
					
					PositionCheck.lheavyStr[newPos] = youStr6;
					PositionCheck.lheavyInt[newPos] = youInt6;
					PositionCheck.lheavyDbl[newPos] = youDbl6;
					PositionCheck.lheavyBool[newPos] = youBool6;
					PositionCheck.lheavyInt[newPos][2] = newPos;
					break;
				case 8:
					String[] youStr7 = new String[4];
					Integer[] youInt7 = new Integer[4];
					Double[] youDbl7 = new Double[4];
					Boolean[] youBool7 = new Boolean[4];

					youStr7 = PositionCheck.heavyStr[ContractScreen.opPos];
					youInt7 = PositionCheck.heavyInt[ContractScreen.opPos];
					youDbl7 = PositionCheck.heavyDbl[ContractScreen.opPos];
					youBool7 = PositionCheck.heavyBool[ContractScreen.opPos];
					
					for (int i = 10; i >= 0; --i) {	
						if ((PositionCheck.heavyInt[i][2] >= Weight.Player.getPos()) && (PositionCheck.heavyInt[i][2] < ContractScreen.opPos)) {
							PositionCheck.heavyStr[i + 1] = PositionCheck.heavyStr[i];
							PositionCheck.heavyInt[i + 1] = PositionCheck.heavyInt[i];
							PositionCheck.heavyDbl[i + 1] = PositionCheck.heavyDbl[i];
							PositionCheck.heavyBool[i + 1] = PositionCheck.heavyBool[i];
							++PositionCheck.heavyInt[i + 1][2];
						}
					}
					
					PositionCheck.heavyStr[newPos] = youStr7;
					PositionCheck.heavyInt[newPos] = youInt7;
					PositionCheck.heavyDbl[newPos] = youDbl7;
					PositionCheck.heavyBool[newPos] = youBool7;
					PositionCheck.heavyInt[newPos][2] = newPos;
					break;
			}
			}
			else if (ContractScreen.opPos < Weight.Player.getPos() && winner == 0) {
				int newPos = ContractScreen.opPos;
				switch (PositionScreen.wegt) {
				case 1:
					String[] youStr = new String[4];
					Integer[] youInt = new Integer[4];
					Double[] youDbl = new Double[4];
					Boolean[] youBool = new Boolean[4];

					youStr = PositionCheck.flyStr[Weight.Player.getPos()];
					youInt = PositionCheck.flyInt[Weight.Player.getPos()];
					youDbl = PositionCheck.flyDbl[Weight.Player.getPos()];
					youBool = PositionCheck.flyBool[Weight.Player.getPos()];
					
					for (int i = 10; i >= 0; --i) {	
						if ((PositionCheck.flyInt[i][2] >= ContractScreen.opPos) && (PositionCheck.flyInt[i][2] < Weight.Player.getPos())) {
							PositionCheck.flyStr[i + 1] = PositionCheck.flyStr[i];
							PositionCheck.flyInt[i + 1] = PositionCheck.flyInt[i];
							PositionCheck.flyDbl[i + 1] = PositionCheck.flyDbl[i];
							PositionCheck.flyBool[i + 1] = PositionCheck.flyBool[i];
							++PositionCheck.flyInt[i + 1][2];
						}
					}
					
					PositionCheck.flyStr[newPos] = youStr;
					PositionCheck.flyInt[newPos] = youInt;
					PositionCheck.flyDbl[newPos] = youDbl;
					PositionCheck.flyBool[newPos] = youBool;
					PositionCheck.flyInt[newPos][2] = newPos;
					Weight.Player.position = newPos;
					break;
				case 2:
					String[] youStr1 = new String[4];
					Integer[] youInt1 = new Integer[4];
					Double[] youDbl1 = new Double[4];
					Boolean[] youBool1 = new Boolean[4];

					youStr1 = PositionCheck.bantamStr[Weight.Player.getPos()];
					youInt1 = PositionCheck.bantamInt[Weight.Player.getPos()];
					youDbl1 = PositionCheck.bantamDbl[Weight.Player.getPos()];
					youBool1 = PositionCheck.bantamBool[Weight.Player.getPos()];
					
					for (int i = 10; i >= 0; --i) {	
						if ((PositionCheck.bantamInt[i][2] >= ContractScreen.opPos) && (PositionCheck.bantamInt[i][2] < Weight.Player.getPos())) {
							PositionCheck.bantamStr[i + 1] = PositionCheck.bantamStr[i];
							PositionCheck.bantamInt[i + 1] = PositionCheck.bantamInt[i];
							PositionCheck.bantamDbl[i + 1] = PositionCheck.bantamDbl[i];
							PositionCheck.bantamBool[i + 1] = PositionCheck.bantamBool[i];
							++PositionCheck.bantamInt[i + 1][2];
						}
					}
					
					PositionCheck.bantamStr[newPos] = youStr1;
					PositionCheck.bantamInt[newPos] = youInt1;
					PositionCheck.bantamDbl[newPos] = youDbl1;
					PositionCheck.bantamBool[newPos] = youBool1;
					PositionCheck.bantamInt[newPos][2] = newPos;
					Weight.Player.position = newPos;
					break;
				case 3:
					String[] youStr2 = new String[4];
					Integer[] youInt2 = new Integer[4];
					Double[] youDbl2 = new Double[4];
					Boolean[] youBool2 = new Boolean[4];

					youStr2 = PositionCheck.featherStr[Weight.Player.getPos()];
					youInt2 = PositionCheck.featherInt[Weight.Player.getPos()];
					youDbl2 = PositionCheck.featherDbl[Weight.Player.getPos()];
					youBool2 = PositionCheck.featherBool[Weight.Player.getPos()];
					
					for (int i = 10; i >= 0; --i) {	
						if ((PositionCheck.featherInt[i][2] >= ContractScreen.opPos) && (PositionCheck.featherInt[i][2] < Weight.Player.getPos())) {
							PositionCheck.featherStr[i + 1] = PositionCheck.featherStr[i];
							PositionCheck.featherInt[i + 1] = PositionCheck.featherInt[i];
							PositionCheck.featherDbl[i + 1] = PositionCheck.featherDbl[i];
							PositionCheck.featherBool[i + 1] = PositionCheck.featherBool[i];
							++PositionCheck.featherInt[i + 1][2];
						}
					}
					
					PositionCheck.featherStr[newPos] = youStr2;
					PositionCheck.featherInt[newPos] = youInt2;
					PositionCheck.featherDbl[newPos] = youDbl2;
					PositionCheck.featherBool[newPos] = youBool2;
					PositionCheck.featherInt[newPos][2] = newPos;
					Weight.Player.position = newPos;
					break;
				case 4:
					String[] youStr3 = new String[4];
					Integer[] youInt3 = new Integer[4];
					Double[] youDbl3 = new Double[4];
					Boolean[] youBool3 = new Boolean[4];

					youStr3 = PositionCheck.lightStr[Weight.Player.getPos()];
					youInt3 = PositionCheck.lightInt[Weight.Player.getPos()];
					youDbl3 = PositionCheck.lightDbl[Weight.Player.getPos()];
					youBool3 = PositionCheck.lightBool[Weight.Player.getPos()];
					
					for (int i = 10; i >= 0; --i) {	
						if ((PositionCheck.lightInt[i][2] >= ContractScreen.opPos) && (PositionCheck.lightInt[i][2] < Weight.Player.getPos())) {
							PositionCheck.lightStr[i + 1] = PositionCheck.lightStr[i];
							PositionCheck.lightInt[i + 1] = PositionCheck.lightInt[i];
							PositionCheck.lightDbl[i + 1] = PositionCheck.lightDbl[i];
							PositionCheck.lightBool[i + 1] = PositionCheck.lightBool[i];
							++PositionCheck.lightInt[i + 1][2];
						}
					}
					
					PositionCheck.lightStr[newPos] = youStr3;
					PositionCheck.lightInt[newPos] = youInt3;
					PositionCheck.lightDbl[newPos] = youDbl3;
					PositionCheck.lightBool[newPos] = youBool3;
					PositionCheck.lightInt[newPos][2] = newPos;
					Weight.Player.position = newPos;
					break;
				case 5:
					String[] youStr4 = new String[4];
					Integer[] youInt4 = new Integer[4];
					Double[] youDbl4 = new Double[4];
					Boolean[] youBool4 = new Boolean[4];

					youStr4 = PositionCheck.welterStr[Weight.Player.getPos()];
					youInt4 = PositionCheck.welterInt[Weight.Player.getPos()];
					youDbl4 = PositionCheck.welterDbl[Weight.Player.getPos()];
					youBool4 = PositionCheck.welterBool[Weight.Player.getPos()];
					
					for (int i = 10; i >= 0; --i) {	
						if ((PositionCheck.welterInt[i][2] >= ContractScreen.opPos) && (PositionCheck.welterInt[i][2] < Weight.Player.getPos())) {
							PositionCheck.welterStr[i + 1] = PositionCheck.welterStr[i];
							PositionCheck.welterInt[i + 1] = PositionCheck.welterInt[i];
							PositionCheck.welterDbl[i + 1] = PositionCheck.welterDbl[i];
							PositionCheck.welterBool[i + 1] = PositionCheck.welterBool[i];
							++PositionCheck.welterInt[i + 1][2];
						}
					}
					
					PositionCheck.welterStr[newPos] = youStr4;
					PositionCheck.welterInt[newPos] = youInt4;
					PositionCheck.welterDbl[newPos] = youDbl4;
					PositionCheck.welterBool[newPos] = youBool4;
					PositionCheck.welterInt[newPos][2] = newPos;
					Weight.Player.position = newPos;
					break;
				case 6:
					String[] youStr5 = new String[4];
					Integer[] youInt5 = new Integer[4];
					Double[] youDbl5 = new Double[4];
					Boolean[] youBool5 = new Boolean[4];

					youStr5 = PositionCheck.middleStr[Weight.Player.getPos()];
					youInt5 = PositionCheck.middleInt[Weight.Player.getPos()];
					youDbl5 = PositionCheck.middleDbl[Weight.Player.getPos()];
					youBool5 = PositionCheck.middleBool[Weight.Player.getPos()];
					
					for (int i = 10; i >= 0; --i) {	
						if ((PositionCheck.middleInt[i][2] >= ContractScreen.opPos) && (PositionCheck.middleInt[i][2] < Weight.Player.getPos())) {
							PositionCheck.middleStr[i + 1] = PositionCheck.middleStr[i];
							PositionCheck.middleInt[i + 1] = PositionCheck.middleInt[i];
							PositionCheck.middleDbl[i + 1] = PositionCheck.middleDbl[i];
							PositionCheck.middleBool[i + 1] = PositionCheck.middleBool[i];
							++PositionCheck.middleInt[i + 1][2];
						}
					}
					
					PositionCheck.middleStr[newPos] = youStr5;
					PositionCheck.middleInt[newPos] = youInt5;
					PositionCheck.middleDbl[newPos] = youDbl5;
					PositionCheck.middleBool[newPos] = youBool5;
					PositionCheck.middleInt[newPos][2] = newPos;
					Weight.Player.position = newPos;
					break;
				case 7:
					String[] youStr6 = new String[4];
					Integer[] youInt6 = new Integer[4];
					Double[] youDbl6 = new Double[4];
					Boolean[] youBool6 = new Boolean[4];

					youStr6 = PositionCheck.lheavyStr[Weight.Player.getPos()];
					youInt6 = PositionCheck.lheavyInt[Weight.Player.getPos()];
					youDbl6 = PositionCheck.lheavyDbl[Weight.Player.getPos()];
					youBool6 = PositionCheck.lheavyBool[Weight.Player.getPos()];
					
					for (int i = 10; i >= 0; --i) {	
						if ((PositionCheck.lheavyInt[i][2] >= ContractScreen.opPos) && (PositionCheck.lheavyInt[i][2] < Weight.Player.getPos())) {
							PositionCheck.lheavyStr[i + 1] = PositionCheck.lheavyStr[i];
							PositionCheck.lheavyInt[i + 1] = PositionCheck.lheavyInt[i];
							PositionCheck.lheavyDbl[i + 1] = PositionCheck.lheavyDbl[i];
							PositionCheck.lheavyBool[i + 1] = PositionCheck.lheavyBool[i];
							++PositionCheck.lheavyInt[i + 1][2];
						}
					}
					
					PositionCheck.lheavyStr[newPos] = youStr6;
					PositionCheck.lheavyInt[newPos] = youInt6;
					PositionCheck.lheavyDbl[newPos] = youDbl6;
					PositionCheck.lheavyBool[newPos] = youBool6;
					PositionCheck.lheavyInt[newPos][2] = newPos;
					Weight.Player.position = newPos;
					break;
				case 8:
					String[] youStr7 = new String[4];
					Integer[] youInt7 = new Integer[4];
					Double[] youDbl7 = new Double[4];
					Boolean[] youBool7 = new Boolean[4];

					youStr7 = PositionCheck.heavyStr[Weight.Player.getPos()];
					youInt7 = PositionCheck.heavyInt[Weight.Player.getPos()];
					youDbl7 = PositionCheck.heavyDbl[Weight.Player.getPos()];
					youBool7 = PositionCheck.heavyBool[Weight.Player.getPos()];
					
					for (int i = 10; i >= 0; --i) {	
						if ((PositionCheck.heavyInt[i][2] >= ContractScreen.opPos) && (PositionCheck.heavyInt[i][2] < Weight.Player.getPos())) {
							PositionCheck.heavyStr[i + 1] = PositionCheck.heavyStr[i];
							PositionCheck.heavyInt[i + 1] = PositionCheck.heavyInt[i];
							PositionCheck.heavyDbl[i + 1] = PositionCheck.heavyDbl[i];
							PositionCheck.heavyBool[i + 1] = PositionCheck.heavyBool[i];
							++PositionCheck.heavyInt[i + 1][2];
						}
					}
					
					PositionCheck.heavyStr[newPos] = youStr7;
					PositionCheck.heavyInt[newPos] = youInt7;
					PositionCheck.heavyDbl[newPos] = youDbl7;
					PositionCheck.heavyBool[newPos] = youBool7;
					PositionCheck.heavyInt[newPos][2] = newPos;
					Weight.Player.position = newPos;
					break;
			}
			}

				
				

			Fighter.fighterScreen();
		}
	}

}
