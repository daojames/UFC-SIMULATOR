package UFCsimulator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PositionScreen {
	
	static JPanel overview, overviewNum, name, info, back, fight;
	
	static JLabel lblOverview, lblOverviewNum, lblName, lblInfo;
	
	static JButton btnBack, btnFight;
	
	static PositionBackScreenHandler positionBackHandler = new PositionBackScreenHandler();
	static PositionFightScreenHandler contractHandler = new PositionFightScreenHandler();
	
	static String weight = null;
	static int posi;
	static int wegt;
	
	public static void posScreen(int pos, int wgt) {
		
		posi = pos;
		wegt = wgt;
		
		if (Weight.Player.getWeight() == 1) {
			weight = "FLYWEIGHT";
		}
		else if (Weight.Player.getWeight() == 2) {
			weight = "BANTAMWEIGHT";
		}
		else if (Weight.Player.getWeight() == 3) {
			weight = "FEATHERWEIGHT";
		}
		else if (Weight.Player.getWeight() == 4) {
			weight = "LIGHTWEIGHT";
		}
		else if (Weight.Player.getWeight() == 5) {
			weight = "WELTERWEIGHT";
		}
		else if (Weight.Player.getWeight() == 6) {
			weight = "MIDDLEWEIGHT";
		}
		else if (Weight.Player.getWeight() == 7) {
			weight = "LIGHT HEAVYWEIGHT";
		}
		else if (Weight.Player.getWeight() == 8) {
			weight = "HEAVYWEIGHT";
		}
		
		int reqClout = 0;
		switch (pos) {
		case 9:
			reqClout = 10000;
			break;
		case 8:
			reqClout = 22000;
			break;
		case 7:
			reqClout = 42000;
			break;
		case 6:
			reqClout = 70000;
			break;
		case 5:
			reqClout = 110000;
			break;
		case 4:
			reqClout = 170000;
			break;
		case 3:
			reqClout = 235000;
			break;
		case 2:
			reqClout = 315000;
			break;
		case 1:
			reqClout = 420000;
			break;
		case 0:
			reqClout = 530000;
			break;
		}
		
		if (wgt == 1) {
			name = new JPanel();
			name.setBounds(24, 35, 976, 60);
			UFCgui.con.add(name);
			name.setVisible(true);
			
			lblName = new JLabel(PositionCheck.flyStr[pos][0] + " " + PositionCheck.flyStr[pos][1]);
			lblName.setFont(new Font("Tahoma", Font.BOLD, 50));
			name.add(lblName);
			
			
			info = new JPanel();
			info.setBounds(24, 90, 976, 60);
			UFCgui.con.add(info);
			info.setVisible(true);
			
			lblInfo = new JLabel(PositionCheck.flyStr[pos][2] + "     " + weight + "     " + PositionCheck.flyInt[pos][0] + " - " + PositionCheck.flyInt[pos][1]);
			lblInfo.setFont(new Font("Tahoma", Font.BOLD, 30));
			info.add(lblInfo);
			
			
			overview = new JPanel();
			overview.setBounds(395, 150, 110, 250);
			UFCgui.con.add(overview);
			overview.setVisible(true);
			
			lblOverview = new JLabel("<html><p style=\"text-align:right;\">STRENGTH<br>SPEED<br>STAMINA<br>CHIN<br>STRIKING<br>WRESTLING<br>IQ<br>LUCK<br></p></html>");
			lblOverview.setHorizontalAlignment(JLabel.TRAILING);
			lblOverview.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblOverview.setPreferredSize(new Dimension(110, 250));
			overview.add(lblOverview);
			
			overviewNum = new JPanel();
			overviewNum.setBounds(450, 150, 130, 250);
			UFCgui.con.add(overviewNum);
			overviewNum.setVisible(true);
			
			DecimalFormat df = new DecimalFormat("0.0");
			String str1 = df.format(PositionCheck.flyDbl[pos][0]);
			String str2 = df.format(PositionCheck.flyDbl[pos][1]);
			String str3 = df.format(PositionCheck.flyDbl[pos][2]);
			String str4 = df.format(PositionCheck.flyDbl[pos][3]);
			String str5 = df.format(PositionCheck.flyDbl[pos][4]);
			String str6 = df.format(PositionCheck.flyDbl[pos][5]);
			String str7 = df.format(PositionCheck.flyDbl[pos][6]);
			String str8 = df.format(PositionCheck.flyDbl[pos][7]);
			
			lblOverviewNum = new JLabel("<html><p style=\"text-align:left;\">" + str1 + "<br>" + str2 + "<br>" + str3 + "<br>" + str4 + "<br>" + str5 + "<br>" + str6 + "<br>" + str7 + "<br>" + str8 + "</p></html>");
			lblOverviewNum.setHorizontalAlignment(JLabel.TRAILING);
			lblOverviewNum.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblOverviewNum.setPreferredSize(new Dimension(130, 250));
			overviewNum.add(lblOverviewNum);
			
			back = new JPanel();
			back.setBounds(300, 430, 200, 55);
			UFCgui.con.add(back);
			back.setVisible(true);
			
			btnBack = new JButton("BACK");
			btnBack.setPreferredSize(new Dimension(200, 50));
			btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnBack.setBackground(Color.white);
			btnBack.setFocusPainted(false);
			btnBack.addActionListener(positionBackHandler);
			back.add(btnBack);
			
			
			fight = new JPanel();
			fight.setBounds(524, 430, 200, 55);
			UFCgui.con.add(fight);
			fight.setVisible(true);
			
			btnFight = new JButton("FIGHT");
			btnFight.setPreferredSize(new Dimension(200, 50));
			btnFight.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnFight.setBackground(Color.white);
			btnFight.setFocusPainted(false);
			btnFight.addActionListener(contractHandler);
			fight.add(btnFight);
			if (Fighter.BalanceUFC.getClout() < reqClout || pos == Weight.Player.getPos()) {
				btnFight.setEnabled(false);
			}
		}
		else if (wgt == 2) {
			name = new JPanel();
			name.setBounds(24, 35, 976, 60);
			UFCgui.con.add(name);
			name.setVisible(true);
			
			lblName = new JLabel(PositionCheck.bantamStr[pos][0] + " " + PositionCheck.bantamStr[pos][1]);
			lblName.setFont(new Font("Tahoma", Font.BOLD, 50));
			name.add(lblName);
			
			
			info = new JPanel();
			info.setBounds(24, 90, 976, 60);
			UFCgui.con.add(info);
			info.setVisible(true);
			
			lblInfo = new JLabel(PositionCheck.bantamStr[pos][2] + "     " + weight + "     " + PositionCheck.bantamInt[pos][0] + " - " + PositionCheck.bantamInt[pos][1]);
			lblInfo.setFont(new Font("Tahoma", Font.BOLD, 30));
			info.add(lblInfo);
			
			
			overview = new JPanel();
			overview.setBounds(395, 150, 110, 250);
			UFCgui.con.add(overview);
			overview.setVisible(true);
			
			lblOverview = new JLabel("<html><p style=\"text-align:right;\">STRENGTH<br>SPEED<br>STAMINA<br>CHIN<br>STRIKING<br>WRESTLING<br>IQ<br>LUCK<br></p></html>");
			lblOverview.setHorizontalAlignment(JLabel.TRAILING);
			lblOverview.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblOverview.setPreferredSize(new Dimension(110, 250));
			overview.add(lblOverview);
			
			overviewNum = new JPanel();
			overviewNum.setBounds(450, 150, 130, 250);
			UFCgui.con.add(overviewNum);
			overviewNum.setVisible(true);
			
			DecimalFormat df = new DecimalFormat("0.0");
			String str1 = df.format(PositionCheck.bantamDbl[pos][0]);
			String str2 = df.format(PositionCheck.bantamDbl[pos][1]);
			String str3 = df.format(PositionCheck.bantamDbl[pos][2]);
			String str4 = df.format(PositionCheck.bantamDbl[pos][3]);
			String str5 = df.format(PositionCheck.bantamDbl[pos][4]);
			String str6 = df.format(PositionCheck.bantamDbl[pos][5]);
			String str7 = df.format(PositionCheck.bantamDbl[pos][6]);
			String str8 = df.format(PositionCheck.bantamDbl[pos][7]);
			
			lblOverviewNum = new JLabel("<html><p style=\"text-align:left;\">" + str1 + "<br>" + str2 + "<br>" + str3 + "<br>" + str4 + "<br>" + str5 + "<br>" + str6 + "<br>" + str7 + "<br>" + str8 + "</p></html>");
			lblOverviewNum.setHorizontalAlignment(JLabel.TRAILING);
			lblOverviewNum.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblOverviewNum.setPreferredSize(new Dimension(130, 250));
			overviewNum.add(lblOverviewNum);
			
			back = new JPanel();
			back.setBounds(300, 430, 200, 55);
			UFCgui.con.add(back);
			back.setVisible(true);
			
			btnBack = new JButton("BACK");
			btnBack.setPreferredSize(new Dimension(200, 50));
			btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnBack.setBackground(Color.white);
			btnBack.setFocusPainted(false);
			btnBack.addActionListener(positionBackHandler);
			back.add(btnBack);
			
			
			fight = new JPanel();
			fight.setBounds(524, 430, 200, 55);
			UFCgui.con.add(fight);
			fight.setVisible(true);
			
			btnFight = new JButton("FIGHT");
			btnFight.setPreferredSize(new Dimension(200, 50));
			btnFight.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnFight.setBackground(Color.white);
			btnFight.setFocusPainted(false);
			btnFight.addActionListener(contractHandler);
			fight.add(btnFight);
			if (Fighter.BalanceUFC.getClout() < reqClout || pos == Weight.Player.getPos()) {
				btnFight.setEnabled(false);
			}
		}
		else if (wgt == 3) {
			name = new JPanel();
			name.setBounds(24, 35, 976, 60);
			UFCgui.con.add(name);
			name.setVisible(true);
			
			lblName = new JLabel(PositionCheck.featherStr[pos][0] + " " + PositionCheck.featherStr[pos][1]);
			lblName.setFont(new Font("Tahoma", Font.BOLD, 50));
			name.add(lblName);
			
			
			info = new JPanel();
			info.setBounds(24, 90, 976, 60);
			UFCgui.con.add(info);
			info.setVisible(true);
			
			lblInfo = new JLabel(PositionCheck.featherStr[pos][2] + "     " + weight + "     " + PositionCheck.featherInt[pos][0] + " - " + PositionCheck.featherInt[pos][1]);
			lblInfo.setFont(new Font("Tahoma", Font.BOLD, 30));
			info.add(lblInfo);
			
			
			overview = new JPanel();
			overview.setBounds(395, 150, 110, 250);
			UFCgui.con.add(overview);
			overview.setVisible(true);
			
			lblOverview = new JLabel("<html><p style=\"text-align:right;\">STRENGTH<br>SPEED<br>STAMINA<br>CHIN<br>STRIKING<br>WRESTLING<br>IQ<br>LUCK<br></p></html>");
			lblOverview.setHorizontalAlignment(JLabel.TRAILING);
			lblOverview.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblOverview.setPreferredSize(new Dimension(110, 250));
			overview.add(lblOverview);
			
			overviewNum = new JPanel();
			overviewNum.setBounds(450, 150, 130, 250);
			UFCgui.con.add(overviewNum);
			overviewNum.setVisible(true);
			
			DecimalFormat df = new DecimalFormat("0.0");
			String str1 = df.format(PositionCheck.featherDbl[pos][0]);
			String str2 = df.format(PositionCheck.featherDbl[pos][1]);
			String str3 = df.format(PositionCheck.featherDbl[pos][2]);
			String str4 = df.format(PositionCheck.featherDbl[pos][3]);
			String str5 = df.format(PositionCheck.featherDbl[pos][4]);
			String str6 = df.format(PositionCheck.featherDbl[pos][5]);
			String str7 = df.format(PositionCheck.featherDbl[pos][6]);
			String str8 = df.format(PositionCheck.featherDbl[pos][7]);
			
			lblOverviewNum = new JLabel("<html><p style=\"text-align:left;\">" + str1 + "<br>" + str2 + "<br>" + str3 + "<br>" + str4 + "<br>" + str5 + "<br>" + str6 + "<br>" + str7 + "<br>" + str8 + "</p></html>");
			lblOverviewNum.setHorizontalAlignment(JLabel.TRAILING);
			lblOverviewNum.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblOverviewNum.setPreferredSize(new Dimension(130, 250));
			overviewNum.add(lblOverviewNum);
			
			back = new JPanel();
			back.setBounds(300, 430, 200, 55);
			UFCgui.con.add(back);
			back.setVisible(true);
			
			btnBack = new JButton("BACK");
			btnBack.setPreferredSize(new Dimension(200, 50));
			btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnBack.setBackground(Color.white);
			btnBack.setFocusPainted(false);
			btnBack.addActionListener(positionBackHandler);
			back.add(btnBack);
			
			
			fight = new JPanel();
			fight.setBounds(524, 430, 200, 55);
			UFCgui.con.add(fight);
			fight.setVisible(true);
			
			btnFight = new JButton("FIGHT");
			btnFight.setPreferredSize(new Dimension(200, 50));
			btnFight.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnFight.setBackground(Color.white);
			btnFight.setFocusPainted(false);
			btnFight.addActionListener(contractHandler);
			fight.add(btnFight);
			if (Fighter.BalanceUFC.getClout() < reqClout || pos == Weight.Player.getPos()) {
				btnFight.setEnabled(false);
			}
		}
		else if (wgt == 4) {
			name = new JPanel();
			name.setBounds(24, 35, 976, 60);
			UFCgui.con.add(name);
			name.setVisible(true);
			
			lblName = new JLabel(PositionCheck.lightStr[pos][0] + " " + PositionCheck.lightStr[pos][1]);
			lblName.setFont(new Font("Tahoma", Font.BOLD, 50));
			name.add(lblName);
			
			
			info = new JPanel();
			info.setBounds(24, 90, 976, 60);
			UFCgui.con.add(info);
			info.setVisible(true);
			
			lblInfo = new JLabel(PositionCheck.lightStr[pos][2] + "     " + weight + "     " + PositionCheck.lightInt[pos][0] + " - " + PositionCheck.lightInt[pos][1]);
			lblInfo.setFont(new Font("Tahoma", Font.BOLD, 30));
			info.add(lblInfo);
			
			
			overview = new JPanel();
			overview.setBounds(395, 150, 110, 250);
			UFCgui.con.add(overview);
			overview.setVisible(true);
			
			lblOverview = new JLabel("<html><p style=\"text-align:right;\">STRENGTH<br>SPEED<br>STAMINA<br>CHIN<br>STRIKING<br>WRESTLING<br>IQ<br>LUCK<br></p></html>");
			lblOverview.setHorizontalAlignment(JLabel.TRAILING);
			lblOverview.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblOverview.setPreferredSize(new Dimension(110, 250));
			overview.add(lblOverview);
			
			overviewNum = new JPanel();
			overviewNum.setBounds(450, 150, 130, 250);
			UFCgui.con.add(overviewNum);
			overviewNum.setVisible(true);
			
			DecimalFormat df = new DecimalFormat("0.0");
			String str1 = df.format(PositionCheck.lightDbl[pos][0]);
			String str2 = df.format(PositionCheck.lightDbl[pos][1]);
			String str3 = df.format(PositionCheck.lightDbl[pos][2]);
			String str4 = df.format(PositionCheck.lightDbl[pos][3]);
			String str5 = df.format(PositionCheck.lightDbl[pos][4]);
			String str6 = df.format(PositionCheck.lightDbl[pos][5]);
			String str7 = df.format(PositionCheck.lightDbl[pos][6]);
			String str8 = df.format(PositionCheck.lightDbl[pos][7]);
			
			lblOverviewNum = new JLabel("<html><p style=\"text-align:left;\">" + str1 + "<br>" + str2 + "<br>" + str3 + "<br>" + str4 + "<br>" + str5 + "<br>" + str6 + "<br>" + str7 + "<br>" + str8 + "</p></html>");
			lblOverviewNum.setHorizontalAlignment(JLabel.TRAILING);
			lblOverviewNum.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblOverviewNum.setPreferredSize(new Dimension(130, 250));
			overviewNum.add(lblOverviewNum);
			
			back = new JPanel();
			back.setBounds(300, 430, 200, 55);
			UFCgui.con.add(back);
			back.setVisible(true);
			
			btnBack = new JButton("BACK");
			btnBack.setPreferredSize(new Dimension(200, 50));
			btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnBack.setBackground(Color.white);
			btnBack.setFocusPainted(false);
			btnBack.addActionListener(positionBackHandler);
			back.add(btnBack);
			
			
			fight = new JPanel();
			fight.setBounds(524, 430, 200, 55);
			UFCgui.con.add(fight);
			fight.setVisible(true);
			
			btnFight = new JButton("FIGHT");
			btnFight.setPreferredSize(new Dimension(200, 50));
			btnFight.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnFight.setBackground(Color.white);
			btnFight.setFocusPainted(false);
			btnFight.addActionListener(contractHandler);
			fight.add(btnFight);
			if (Fighter.BalanceUFC.getClout() < reqClout || pos == Weight.Player.getPos()) {
				btnFight.setEnabled(false);
			}
		}
		else if (wgt == 5) {
			name = new JPanel();
			name.setBounds(24, 35, 976, 60);
			UFCgui.con.add(name);
			name.setVisible(true);
			
			lblName = new JLabel(PositionCheck.welterStr[pos][0] + " " + PositionCheck.welterStr[pos][1]);
			lblName.setFont(new Font("Tahoma", Font.BOLD, 50));
			name.add(lblName);
			
			
			info = new JPanel();
			info.setBounds(24, 90, 976, 60);
			UFCgui.con.add(info);
			info.setVisible(true);
			
			lblInfo = new JLabel(PositionCheck.welterStr[pos][2] + "     " + weight + "     " + PositionCheck.welterInt[pos][0] + " - " + PositionCheck.welterInt[pos][1]);
			lblInfo.setFont(new Font("Tahoma", Font.BOLD, 30));
			info.add(lblInfo);
			
			
			overview = new JPanel();
			overview.setBounds(395, 150, 110, 250);
			UFCgui.con.add(overview);
			overview.setVisible(true);
			
			lblOverview = new JLabel("<html><p style=\"text-align:right;\">STRENGTH<br>SPEED<br>STAMINA<br>CHIN<br>STRIKING<br>WRESTLING<br>IQ<br>LUCK<br></p></html>");
			lblOverview.setHorizontalAlignment(JLabel.TRAILING);
			lblOverview.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblOverview.setPreferredSize(new Dimension(110, 250));
			overview.add(lblOverview);
			
			overviewNum = new JPanel();
			overviewNum.setBounds(450, 150, 130, 250);
			UFCgui.con.add(overviewNum);
			overviewNum.setVisible(true);
			
			DecimalFormat df = new DecimalFormat("0.0");
			String str1 = df.format(PositionCheck.welterDbl[pos][0]);
			String str2 = df.format(PositionCheck.welterDbl[pos][1]);
			String str3 = df.format(PositionCheck.welterDbl[pos][2]);
			String str4 = df.format(PositionCheck.welterDbl[pos][3]);
			String str5 = df.format(PositionCheck.welterDbl[pos][4]);
			String str6 = df.format(PositionCheck.welterDbl[pos][5]);
			String str7 = df.format(PositionCheck.welterDbl[pos][6]);
			String str8 = df.format(PositionCheck.welterDbl[pos][7]);
			
			lblOverviewNum = new JLabel("<html><p style=\"text-align:left;\">" + str1 + "<br>" + str2 + "<br>" + str3 + "<br>" + str4 + "<br>" + str5 + "<br>" + str6 + "<br>" + str7 + "<br>" + str8 + "</p></html>");
			lblOverviewNum.setHorizontalAlignment(JLabel.TRAILING);
			lblOverviewNum.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblOverviewNum.setPreferredSize(new Dimension(130, 250));
			overviewNum.add(lblOverviewNum);
			
			back = new JPanel();
			back.setBounds(300, 430, 200, 55);
			UFCgui.con.add(back);
			back.setVisible(true);
			
			btnBack = new JButton("BACK");
			btnBack.setPreferredSize(new Dimension(200, 50));
			btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnBack.setBackground(Color.white);
			btnBack.setFocusPainted(false);
			btnBack.addActionListener(positionBackHandler);
			back.add(btnBack);
			
			
			fight = new JPanel();
			fight.setBounds(524, 430, 200, 55);
			UFCgui.con.add(fight);
			fight.setVisible(true);
			
			btnFight = new JButton("FIGHT");
			btnFight.setPreferredSize(new Dimension(200, 50));
			btnFight.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnFight.setBackground(Color.white);
			btnFight.setFocusPainted(false);
			btnFight.addActionListener(contractHandler);
			fight.add(btnFight);
			if (Fighter.BalanceUFC.getClout() < reqClout || pos == Weight.Player.getPos()) {
				btnFight.setEnabled(false);
			}
		}
		else if (wgt == 6) {
			name = new JPanel();
			name.setBounds(24, 35, 976, 60);
			UFCgui.con.add(name);
			name.setVisible(true);
			
			lblName = new JLabel(PositionCheck.middleStr[pos][0] + " " + PositionCheck.middleStr[pos][1]);
			lblName.setFont(new Font("Tahoma", Font.BOLD, 50));
			name.add(lblName);
			
			
			info = new JPanel();
			info.setBounds(24, 90, 976, 60);
			UFCgui.con.add(info);
			info.setVisible(true);
			
			lblInfo = new JLabel(PositionCheck.middleStr[pos][2] + "     " + weight + "     " + PositionCheck.middleInt[pos][0] + " - " + PositionCheck.middleInt[pos][1]);
			lblInfo.setFont(new Font("Tahoma", Font.BOLD, 30));
			info.add(lblInfo);
			
			
			overview = new JPanel();
			overview.setBounds(395, 150, 110, 250);
			UFCgui.con.add(overview);
			overview.setVisible(true);
			
			lblOverview = new JLabel("<html><p style=\"text-align:right;\">STRENGTH<br>SPEED<br>STAMINA<br>CHIN<br>STRIKING<br>WRESTLING<br>IQ<br>LUCK<br></p></html>");
			lblOverview.setHorizontalAlignment(JLabel.TRAILING);
			lblOverview.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblOverview.setPreferredSize(new Dimension(110, 250));
			overview.add(lblOverview);
			
			overviewNum = new JPanel();
			overviewNum.setBounds(450, 150, 130, 250);
			UFCgui.con.add(overviewNum);
			overviewNum.setVisible(true);
			
			DecimalFormat df = new DecimalFormat("0.0");
			String str1 = df.format(PositionCheck.middleDbl[pos][0]);
			String str2 = df.format(PositionCheck.middleDbl[pos][1]);
			String str3 = df.format(PositionCheck.middleDbl[pos][2]);
			String str4 = df.format(PositionCheck.middleDbl[pos][3]);
			String str5 = df.format(PositionCheck.middleDbl[pos][4]);
			String str6 = df.format(PositionCheck.middleDbl[pos][5]);
			String str7 = df.format(PositionCheck.middleDbl[pos][6]);
			String str8 = df.format(PositionCheck.middleDbl[pos][7]);
			
			lblOverviewNum = new JLabel("<html><p style=\"text-align:left;\">" + str1 + "<br>" + str2 + "<br>" + str3 + "<br>" + str4 + "<br>" + str5 + "<br>" + str6 + "<br>" + str7 + "<br>" + str8 + "</p></html>");
			lblOverviewNum.setHorizontalAlignment(JLabel.TRAILING);
			lblOverviewNum.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblOverviewNum.setPreferredSize(new Dimension(130, 250));
			overviewNum.add(lblOverviewNum);
			
			back = new JPanel();
			back.setBounds(300, 430, 200, 55);
			UFCgui.con.add(back);
			back.setVisible(true);
			
			btnBack = new JButton("BACK");
			btnBack.setPreferredSize(new Dimension(200, 50));
			btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnBack.setBackground(Color.white);
			btnBack.setFocusPainted(false);
			btnBack.addActionListener(positionBackHandler);
			back.add(btnBack);
			
			
			fight = new JPanel();
			fight.setBounds(524, 430, 200, 55);
			UFCgui.con.add(fight);
			fight.setVisible(true);
			
			btnFight = new JButton("FIGHT");
			btnFight.setPreferredSize(new Dimension(200, 50));
			btnFight.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnFight.setBackground(Color.white);
			btnFight.setFocusPainted(false);
			btnFight.addActionListener(contractHandler);
			fight.add(btnFight);
			if (Fighter.BalanceUFC.getClout() < reqClout || pos == Weight.Player.getPos()) {
				btnFight.setEnabled(false);
			}
		}
		else if (wgt == 7) {
			name = new JPanel();
			name.setBounds(24, 35, 976, 60);
			UFCgui.con.add(name);
			name.setVisible(true);
			
			lblName = new JLabel(PositionCheck.lheavyStr[pos][0] + " " + PositionCheck.lheavyStr[pos][1]);
			lblName.setFont(new Font("Tahoma", Font.BOLD, 50));
			name.add(lblName);
			
			
			info = new JPanel();
			info.setBounds(24, 90, 976, 60);
			UFCgui.con.add(info);
			info.setVisible(true);
			
			lblInfo = new JLabel(PositionCheck.lheavyStr[pos][2] + "     " + weight + "     " + PositionCheck.lheavyInt[pos][0] + " - " + PositionCheck.lheavyInt[pos][1]);
			lblInfo.setFont(new Font("Tahoma", Font.BOLD, 30));
			info.add(lblInfo);
			
			
			overview = new JPanel();
			overview.setBounds(395, 150, 110, 250);
			UFCgui.con.add(overview);
			overview.setVisible(true);
			
			lblOverview = new JLabel("<html><p style=\"text-align:right;\">STRENGTH<br>SPEED<br>STAMINA<br>CHIN<br>STRIKING<br>WRESTLING<br>IQ<br>LUCK<br></p></html>");
			lblOverview.setHorizontalAlignment(JLabel.TRAILING);
			lblOverview.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblOverview.setPreferredSize(new Dimension(110, 250));
			overview.add(lblOverview);
			
			overviewNum = new JPanel();
			overviewNum.setBounds(450, 150, 130, 250);
			UFCgui.con.add(overviewNum);
			overviewNum.setVisible(true);
			
			DecimalFormat df = new DecimalFormat("0.0");
			String str1 = df.format(PositionCheck.lheavyDbl[pos][0]);
			String str2 = df.format(PositionCheck.lheavyDbl[pos][1]);
			String str3 = df.format(PositionCheck.lheavyDbl[pos][2]);
			String str4 = df.format(PositionCheck.lheavyDbl[pos][3]);
			String str5 = df.format(PositionCheck.lheavyDbl[pos][4]);
			String str6 = df.format(PositionCheck.lheavyDbl[pos][5]);
			String str7 = df.format(PositionCheck.lheavyDbl[pos][6]);
			String str8 = df.format(PositionCheck.lheavyDbl[pos][7]);
			
			lblOverviewNum = new JLabel("<html><p style=\"text-align:left;\">" + str1 + "<br>" + str2 + "<br>" + str3 + "<br>" + str4 + "<br>" + str5 + "<br>" + str6 + "<br>" + str7 + "<br>" + str8 + "</p></html>");
			lblOverviewNum.setHorizontalAlignment(JLabel.TRAILING);
			lblOverviewNum.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblOverviewNum.setPreferredSize(new Dimension(130, 250));
			overviewNum.add(lblOverviewNum);
			
			back = new JPanel();
			back.setBounds(300, 430, 200, 55);
			UFCgui.con.add(back);
			back.setVisible(true);
			
			btnBack = new JButton("BACK");
			btnBack.setPreferredSize(new Dimension(200, 50));
			btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnBack.setBackground(Color.white);
			btnBack.setFocusPainted(false);
			btnBack.addActionListener(positionBackHandler);
			back.add(btnBack);
			
			
			fight = new JPanel();
			fight.setBounds(524, 430, 200, 55);
			UFCgui.con.add(fight);
			fight.setVisible(true);
			
			btnFight = new JButton("FIGHT");
			btnFight.setPreferredSize(new Dimension(200, 50));
			btnFight.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnFight.setBackground(Color.white);
			btnFight.setFocusPainted(false);
			btnFight.addActionListener(contractHandler);
			fight.add(btnFight);
			if (Fighter.BalanceUFC.getClout() < reqClout || pos == Weight.Player.getPos()) {
				btnFight.setEnabled(false);
			}
		}
		else if (wgt == 8) {
			name = new JPanel();
			name.setBounds(24, 35, 976, 60);
			UFCgui.con.add(name);
			name.setVisible(true);
			
			lblName = new JLabel(PositionCheck.heavyStr[pos][0] + " " + PositionCheck.heavyStr[pos][1]);
			lblName.setFont(new Font("Tahoma", Font.BOLD, 50));
			name.add(lblName);
			
			
			info = new JPanel();
			info.setBounds(24, 90, 976, 60);
			UFCgui.con.add(info);
			info.setVisible(true);
			
			lblInfo = new JLabel(PositionCheck.heavyStr[pos][2] + "     " + weight + "     " + PositionCheck.heavyInt[pos][0] + " - " + PositionCheck.heavyInt[pos][1]);
			lblInfo.setFont(new Font("Tahoma", Font.BOLD, 30));
			info.add(lblInfo);
			
			
			overview = new JPanel();
			overview.setBounds(395, 150, 110, 250);
			UFCgui.con.add(overview);
			overview.setVisible(true);
			
			lblOverview = new JLabel("<html><p style=\"text-align:right;\">STRENGTH<br>SPEED<br>STAMINA<br>CHIN<br>STRIKING<br>WRESTLING<br>IQ<br>LUCK<br></p></html>");
			lblOverview.setHorizontalAlignment(JLabel.TRAILING);
			lblOverview.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblOverview.setPreferredSize(new Dimension(110, 250));
			overview.add(lblOverview);
			
			overviewNum = new JPanel();
			overviewNum.setBounds(450, 150, 130, 250);
			UFCgui.con.add(overviewNum);
			overviewNum.setVisible(true);
			
			DecimalFormat df = new DecimalFormat("0.0");
			String str1 = df.format(PositionCheck.heavyDbl[pos][0]);
			String str2 = df.format(PositionCheck.heavyDbl[pos][1]);
			String str3 = df.format(PositionCheck.heavyDbl[pos][2]);
			String str4 = df.format(PositionCheck.heavyDbl[pos][3]);
			String str5 = df.format(PositionCheck.heavyDbl[pos][4]);
			String str6 = df.format(PositionCheck.heavyDbl[pos][5]);
			String str7 = df.format(PositionCheck.heavyDbl[pos][6]);
			String str8 = df.format(PositionCheck.heavyDbl[pos][7]);
			
			lblOverviewNum = new JLabel("<html><p style=\"text-align:left;\">" + str1 + "<br>" + str2 + "<br>" + str3 + "<br>" + str4 + "<br>" + str5 + "<br>" + str6 + "<br>" + str7 + "<br>" + str8 + "</p></html>");
			lblOverviewNum.setHorizontalAlignment(JLabel.TRAILING);
			lblOverviewNum.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblOverviewNum.setPreferredSize(new Dimension(130, 250));
			overviewNum.add(lblOverviewNum);
			
			back = new JPanel();
			back.setBounds(300, 430, 200, 55);
			UFCgui.con.add(back);
			back.setVisible(true);
			
			btnBack = new JButton("BACK");
			btnBack.setPreferredSize(new Dimension(200, 50));
			btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnBack.setBackground(Color.white);
			btnBack.setFocusPainted(false);
			btnBack.addActionListener(positionBackHandler);
			back.add(btnBack);
			
			
			fight = new JPanel();
			fight.setBounds(524, 430, 200, 55);
			UFCgui.con.add(fight);
			fight.setVisible(true);
			
			btnFight = new JButton("FIGHT");
			btnFight.setPreferredSize(new Dimension(200, 50));
			btnFight.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnFight.setBackground(Color.white);
			btnFight.setFocusPainted(false);
			btnFight.addActionListener(contractHandler);
			fight.add(btnFight);
			if (Fighter.BalanceUFC.getClout() < reqClout || pos == Weight.Player.getPos()) {
				btnFight.setEnabled(false);
			}
		}
		
	}
	
	public static class PositionBackScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();
			
			overview.setVisible(false);
			overviewNum.setVisible(false);
			name.setVisible(false);
			info.setVisible(false);
			back.setVisible(false);
			fight.setVisible(false);

			CareerScreen.careerScreen();
		}
	}
	
	public static class PositionFightScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();
			
			overview.setVisible(false);
			overviewNum.setVisible(false);
			name.setVisible(false);
			info.setVisible(false);
			back.setVisible(false);
			fight.setVisible(false);

			switch(wegt) {
				case 1:
					ContractScreen.contractScreen(Weight.Player.first, Weight.Player.last, PositionCheck.flyStr[posi][0], PositionCheck.flyStr[posi][1], PositionCheck.flyInt[posi][2]);
					break;
				case 2:
					ContractScreen.contractScreen(Weight.Player.first, Weight.Player.last, PositionCheck.bantamStr[posi][0], PositionCheck.bantamStr[posi][1], PositionCheck.bantamInt[posi][2]);
					break;
				case 3:
					ContractScreen.contractScreen(Weight.Player.first, Weight.Player.last, PositionCheck.featherStr[posi][0], PositionCheck.featherStr[posi][1], PositionCheck.featherInt[posi][2]);
					break;
				case 4:
					ContractScreen.contractScreen(Weight.Player.first, Weight.Player.last, PositionCheck.lightStr[posi][0], PositionCheck.lightStr[posi][1], PositionCheck.lightInt[posi][2]);
					break;
				case 5:
					ContractScreen.contractScreen(Weight.Player.first, Weight.Player.last, PositionCheck.welterStr[posi][0], PositionCheck.welterStr[posi][1], PositionCheck.welterInt[posi][2]);
					break;
				case 6:
					ContractScreen.contractScreen(Weight.Player.first, Weight.Player.last, PositionCheck.middleStr[posi][0], PositionCheck.middleStr[posi][1], PositionCheck.middleInt[posi][2]);
					break;
				case 7:
					ContractScreen.contractScreen(Weight.Player.first, Weight.Player.last, PositionCheck.lheavyStr[posi][0], PositionCheck.lheavyStr[posi][1], PositionCheck.lheavyInt[posi][2]);
					break;
				case 8:
					ContractScreen.contractScreen(Weight.Player.first, Weight.Player.last, PositionCheck.heavyStr[posi][0], PositionCheck.heavyStr[posi][1], PositionCheck.heavyInt[posi][2]);
					break;
			}
		}
	}

}
