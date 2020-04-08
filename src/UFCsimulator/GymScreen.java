package UFCsimulator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GymScreen {
	
	static JPanel back, str, spd, stm, chin, strk, wrst, iq, luck, overallDesc, overall, recovery;
	
	static JButton btnBack, btnStr, btnSpd, btnStm, btnChin, btnStrk, btnWrst, btnIq, btnLuck;
	
	static JLabel lblOverallDesc, lblOverall, lblStr, lblSpd, lblStm, lblChin, lblStrk, lblWrst, lblIq, lblLuck, lblRecovery;
	
	static GymBackScreenHandler gymBackHandler = new GymBackScreenHandler();
	static GymStrScreenHandler strHandler = new GymStrScreenHandler();
	static GymSpdScreenHandler spdHandler = new GymSpdScreenHandler();
	static GymStmScreenHandler stmHandler = new GymStmScreenHandler();
	static GymChinScreenHandler chinHandler = new GymChinScreenHandler();
	static GymStrkScreenHandler strkHandler = new GymStrkScreenHandler();
	static GymWrstScreenHandler wrstHandler = new GymWrstScreenHandler();
	static GymIqScreenHandler iqHandler = new GymIqScreenHandler();
	static GymLuckScreenHandler luckHandler = new GymLuckScreenHandler();
	
	static int recov;

	public static void gymScreen() {
		
		//PositionCheck.positionCheck();
		
		recov = (int) (Weight.Player.recovery * 100);
		
		recovery = new JPanel();
		recovery.setBounds(810, 460, 200, 25);
		UFCgui.con.add(recovery);
		recovery.setVisible(true);
		
		lblRecovery = new JLabel("RECOVERY: " + recov + "%");
		lblRecovery.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRecovery.setPreferredSize(new Dimension(200, 25));
		lblRecovery.setHorizontalAlignment(JLabel.LEFT);
		lblRecovery.setToolTipText("It's recommended to fully recover before you fight");
		recovery.add(lblRecovery);
		
		
		overallDesc = new JPanel();
		overallDesc.setBounds(412, 50, 200, 25);
		UFCgui.con.add(overallDesc);
		overallDesc.setVisible(true);
		
		lblOverallDesc = new JLabel("OVERALL");
		lblOverallDesc.setFont(new Font("Tahoma", Font.BOLD, 20));
		overallDesc.add(lblOverallDesc);
		
		
		overall = new JPanel();
		overall.setBounds(312, 60, 400, 100);
		UFCgui.con.add(overall);
		overall.setVisible(true);
		
		lblOverall = new JLabel(Integer.toString(Weight.Player.getOverall()));
		lblOverall.setFont(new Font("Tahoma", Font.BOLD, 80));
		overall.add(lblOverall);
		
		
		back = new JPanel();
		back.setBounds(412, 430, 200, 55);
		UFCgui.con.add(back);
		back.setVisible(true);
		
		btnBack = new JButton("BACK");
		btnBack.setPreferredSize(new Dimension(200, 50));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBack.setBackground(Color.white);
		btnBack.setFocusPainted(false);
		btnBack.addActionListener(gymBackHandler);
		back.add(btnBack);
		
		
		str = new JPanel();
		str.setBounds(45, 170, 200, 85);
		UFCgui.con.add(str);
		str.setVisible(true);
		
		lblStr = new JLabel(String.format("STRENGTH: %.1f", Weight.Player.str));
		lblStr.setFont(new Font("Tahoma", Font.BOLD, 20));
		str.add(lblStr);
		
		btnStr = new JButton("BENCH PRESS");
		btnStr.setPreferredSize(new Dimension(200, 50));
		btnStr.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnStr.setBackground(Color.white);
		btnStr.setFocusPainted(false);
		btnStr.setToolTipText("<html><p style=\"text-align:left;\">$20000<br>+0.1 STR</p></html>");
		btnStr.addActionListener(strHandler);
		str.add(btnStr);
		
		
		spd = new JPanel();
		spd.setBounds(290, 170, 200, 85);
		UFCgui.con.add(spd);
		spd.setVisible(true);
		
		lblSpd = new JLabel(String.format("SPEED: %.1f", Weight.Player.spd));;
		lblSpd.setFont(new Font("Tahoma", Font.BOLD, 20));
		spd.add(lblSpd);
		
		btnSpd = new JButton("MUSCLE EXPLOSION");
		btnSpd.setPreferredSize(new Dimension(200, 50));
		btnSpd.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSpd.setBackground(Color.white);
		btnSpd.setFocusPainted(false);
		btnSpd.setToolTipText("<html><p style=\"text-align:left;\">$20000<br>+0.1 SPD</p></html>");
		btnSpd.addActionListener(spdHandler);
		spd.add(btnSpd);
		
		
		stm = new JPanel();
		stm.setBounds(535, 170, 200, 85);
		UFCgui.con.add(stm);
		stm.setVisible(true);
		
		lblStm = new JLabel(String.format("STAMINA: %.1f", Weight.Player.stm));
		lblStm.setFont(new Font("Tahoma", Font.BOLD, 20));
		stm.add(lblStm);
		
		btnStm = new JButton("MARATHON");
		btnStm.setPreferredSize(new Dimension(200, 50));
		btnStm.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnStm.setBackground(Color.white);
		btnStm.setFocusPainted(false);
		btnStm.setToolTipText("<html><p style=\"text-align:left;\">$20000<br>+0.1 STM</p></html>");
		btnStm.addActionListener(stmHandler);
		stm.add(btnStm);
		
		
		chin = new JPanel();
		chin.setBounds(790, 170, 200, 85);
		UFCgui.con.add(chin);
		chin.setVisible(true);
		
		lblChin = new JLabel(String.format("CHIN: %.1f", Weight.Player.chin));
		lblChin.setFont(new Font("Tahoma", Font.BOLD, 20));
		chin.add(lblChin);
		
		btnChin = new JButton("DRINK MILK");
		btnChin.setPreferredSize(new Dimension(200, 50));
		btnChin.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnChin.setBackground(Color.white);
		btnChin.setFocusPainted(false);
		btnChin.setToolTipText("<html><p style=\"text-align:left;\">$20000<br>+0.1 CHIN</p></html>");
		btnChin.addActionListener(chinHandler);
		chin.add(btnChin);
		
		
		strk = new JPanel();
		strk.setBounds(45, 285, 200, 85);
		UFCgui.con.add(strk);
		strk.setVisible(true);
		
		lblStrk = new JLabel(String.format("STRIKING: %.1f", Weight.Player.strk));
		lblStrk.setFont(new Font("Tahoma", Font.BOLD, 20));
		strk.add(lblStrk);
		
		btnStrk = new JButton("SPAR");
		btnStrk.setPreferredSize(new Dimension(200, 50));
		btnStrk.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnStrk.setBackground(Color.white);
		btnStrk.setFocusPainted(false);
		btnStrk.setToolTipText("<html><p style=\"text-align:left;\">$20000<br>+0.1 STRK</p></html>");
		btnStrk.addActionListener(strkHandler);
		strk.add(btnStrk);
		
		
		wrst = new JPanel();
		wrst.setBounds(290, 285, 200, 85);
		UFCgui.con.add(wrst);
		wrst.setVisible(true);
		
		lblWrst = new JLabel(String.format("WRESTLING: %.1f", Weight.Player.wrst));
		lblWrst.setFont(new Font("Tahoma", Font.BOLD, 20));
		wrst.add(lblWrst);
		
		btnWrst = new JButton("ROLL");
		btnWrst.setPreferredSize(new Dimension(200, 50));
		btnWrst.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnWrst.setBackground(Color.white);
		btnWrst.setFocusPainted(false);
		btnWrst.setToolTipText("<html><p style=\"text-align:left;\">$20000<br>+0.1 WRST</p></html>");
		btnWrst.addActionListener(wrstHandler);
		wrst.add(btnWrst);
		
		
		iq = new JPanel();
		iq.setBounds(535, 285, 200, 85);
		UFCgui.con.add(iq);
		iq.setVisible(true);
		
		lblIq = new JLabel(String.format("IQ: %.1f", Weight.Player.iq));
		lblIq.setFont(new Font("Tahoma", Font.BOLD, 20));
		iq.add(lblIq);
		
		btnIq = new JButton("WATCH FILM");
		btnIq.setPreferredSize(new Dimension(200, 50));
		btnIq.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnIq.setBackground(Color.white);
		btnIq.setFocusPainted(false);
		btnIq.setToolTipText("<html><p style=\"text-align:left;\">$20000<br>+0.1 IQ</p></html>");
		btnIq.addActionListener(iqHandler);
		iq.add(btnIq);
		
		
		luck = new JPanel();
		luck.setBounds(790, 285, 200, 85);
		UFCgui.con.add(luck);
		luck.setVisible(true);
		
		lblLuck = new JLabel(String.format("LUCK: %.1f", Weight.Player.luck));
		lblLuck.setFont(new Font("Tahoma", Font.BOLD, 20));
		luck.add(lblLuck);
		
		btnLuck = new JButton("PRAY");
		btnLuck.setPreferredSize(new Dimension(200, 50));
		btnLuck.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLuck.setBackground(Color.white);
		btnLuck.setFocusPainted(false);
		btnLuck.setToolTipText("<html><p style=\"text-align:left;\">$20000<br>+0.1 LUCK</p></html>");
		btnLuck.addActionListener(luckHandler);
		luck.add(btnLuck);
		
		if (Fighter.BalanceUFC.getBalance() < 20000) {
			btnStr.setEnabled(false);
			btnSpd.setEnabled(false);
			btnStm.setEnabled(false);
			btnChin.setEnabled(false);
			btnStrk.setEnabled(false);
			btnWrst.setEnabled(false);
			btnIq.setEnabled(false);
			btnLuck.setEnabled(false);
		}
		
		if (Weight.Player.str >= 9.95) {
			btnStr.setEnabled(false);
		}
		if (Weight.Player.spd >= 9.95) {
			btnSpd.setEnabled(false);
		}
		if (Weight.Player.stm >= 9.95) {
			btnStm.setEnabled(false);
		}
		if (Weight.Player.chin >= 9.95) {
			btnChin.setEnabled(false);
		}
		if (Weight.Player.strk >= 9.95) {
			btnStrk.setEnabled(false);
		}
		if (Weight.Player.wrst >= 9.95) {
			btnWrst.setEnabled(false);
		}
		if (Weight.Player.iq >= 9.95) {
			btnIq.setEnabled(false);
		}
		if (Weight.Player.luck >= 9.95) {
			btnLuck.setEnabled(false);
		}
	}
	
	public static class GymStrScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();
			
			Weight.Player.addStr(0.1);
			lblStr.setText(String.format("STRENGTH: %.1f", Weight.Player.str));
			Fighter.BalanceUFC.subBalance(20000);
			Fighter.lblMoney.setText("BALANCE: $" + Fighter.BalanceUFC.getBalance());
			
			if (Weight.Player.getWeight() == 1) {
				PositionCheck.flyDbl[Weight.Player.getPos()][0] = Weight.Player.str;
			}
			else if (Weight.Player.getWeight() == 2) {
				PositionCheck.bantamDbl[Weight.Player.getPos()][0] = Weight.Player.str;
			}
			else if (Weight.Player.getWeight() == 3) {
				PositionCheck.featherDbl[Weight.Player.getPos()][0] = Weight.Player.str;
			}
			else if (Weight.Player.getWeight() == 4) {
				PositionCheck.lightDbl[Weight.Player.getPos()][0] = Weight.Player.str;
			}
			else if (Weight.Player.getWeight() == 5) {
				PositionCheck.welterDbl[Weight.Player.getPos()][0] = Weight.Player.str;
			}
			else if (Weight.Player.getWeight() == 6) {
				PositionCheck.middleDbl[Weight.Player.getPos()][0] = Weight.Player.str;
			}
			else if (Weight.Player.getWeight() == 7) {
				PositionCheck.lheavyDbl[Weight.Player.getPos()][0] = Weight.Player.str;
			}
			else if (Weight.Player.getWeight() == 8) {
				PositionCheck.heavyDbl[Weight.Player.getPos()][0] = Weight.Player.str;
			}
			
			Fighter.MonthUFC.incMonth();
			Fighter.lblDate.setText(Fighter.MonthUFC.getMonth() + " " + Fighter.MonthUFC.getYear());
			recov = (int) (Weight.Player.recovery * 100);
			lblRecovery.setText("RECOVERY: " + recov + "%");
			
			if (Fighter.BalanceUFC.getBalance() < 20000) {
				btnStr.setEnabled(false);
				btnSpd.setEnabled(false);
				btnStm.setEnabled(false);
				btnChin.setEnabled(false);
				btnStrk.setEnabled(false);
				btnWrst.setEnabled(false);
				btnIq.setEnabled(false);
				btnLuck.setEnabled(false);
			}
			
			if (Weight.Player.str >= 9.9) {
				btnStr.setEnabled(false);
			}
		}
	}
	
	public static class GymSpdScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();
			
			Weight.Player.addSpd(0.1);
			lblSpd.setText(String.format("SPEED: %.1f", Weight.Player.spd));
			Fighter.BalanceUFC.subBalance(20000);
			Fighter.lblMoney.setText("BALANCE: $" + Fighter.BalanceUFC.getBalance());
			
			if (Weight.Player.getWeight() == 1) {
				PositionCheck.flyDbl[Weight.Player.getPos()][1] = Weight.Player.spd;
			}
			else if (Weight.Player.getWeight() == 2) {
				PositionCheck.bantamDbl[Weight.Player.getPos()][1] = Weight.Player.spd;
			}
			else if (Weight.Player.getWeight() == 3) {
				PositionCheck.featherDbl[Weight.Player.getPos()][1] = Weight.Player.spd;
			}
			else if (Weight.Player.getWeight() == 4) {
				PositionCheck.lightDbl[Weight.Player.getPos()][1] = Weight.Player.spd;
			}
			else if (Weight.Player.getWeight() == 5) {
				PositionCheck.welterDbl[Weight.Player.getPos()][1] = Weight.Player.spd;
			}
			else if (Weight.Player.getWeight() == 6) {
				PositionCheck.middleDbl[Weight.Player.getPos()][1] = Weight.Player.spd;
			}
			else if (Weight.Player.getWeight() == 7) {
				PositionCheck.lheavyDbl[Weight.Player.getPos()][1] = Weight.Player.spd;
			}
			else if (Weight.Player.getWeight() == 8) {
				PositionCheck.heavyDbl[Weight.Player.getPos()][1] = Weight.Player.spd;
			}
			
			Fighter.MonthUFC.incMonth();
			Fighter.lblDate.setText(Fighter.MonthUFC.getMonth() + " " + Fighter.MonthUFC.getYear());
			recov = (int) (Weight.Player.recovery * 100);
			lblRecovery.setText("RECOVERY: " + recov + "%");
			
			if (Fighter.BalanceUFC.getBalance() < 20000) {
				btnStr.setEnabled(false);
				btnSpd.setEnabled(false);
				btnStm.setEnabled(false);
				btnChin.setEnabled(false);
				btnStrk.setEnabled(false);
				btnWrst.setEnabled(false);
				btnIq.setEnabled(false);
				btnLuck.setEnabled(false);
			}
			
			if (Weight.Player.spd >= 9.9) {
				btnSpd.setEnabled(false);
			}
		}
	}
	
	public static class GymStmScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();
			
			Weight.Player.addStm(0.1);
			lblStm.setText(String.format("STAMINA: %.1f", Weight.Player.stm));
			Fighter.BalanceUFC.subBalance(20000);
			Fighter.lblMoney.setText("BALANCE: $" + Fighter.BalanceUFC.getBalance());
			
			if (Weight.Player.getWeight() == 1) {
				PositionCheck.flyDbl[Weight.Player.getPos()][2] = Weight.Player.stm;
			}
			else if (Weight.Player.getWeight() == 2) {
				PositionCheck.bantamDbl[Weight.Player.getPos()][2] = Weight.Player.stm;
			}
			else if (Weight.Player.getWeight() == 3) {
				PositionCheck.featherDbl[Weight.Player.getPos()][2] = Weight.Player.stm;
			}
			else if (Weight.Player.getWeight() == 4) {
				PositionCheck.lightDbl[Weight.Player.getPos()][2] = Weight.Player.stm;
			}
			else if (Weight.Player.getWeight() == 5) {
				PositionCheck.welterDbl[Weight.Player.getPos()][2] = Weight.Player.stm;
			}
			else if (Weight.Player.getWeight() == 6) {
				PositionCheck.middleDbl[Weight.Player.getPos()][2] = Weight.Player.stm;
			}
			else if (Weight.Player.getWeight() == 7) {
				PositionCheck.lheavyDbl[Weight.Player.getPos()][2] = Weight.Player.stm;
			}
			else if (Weight.Player.getWeight() == 8) {
				PositionCheck.heavyDbl[Weight.Player.getPos()][2] = Weight.Player.stm;
			}
			
			Fighter.MonthUFC.incMonth();
			Fighter.lblDate.setText(Fighter.MonthUFC.getMonth() + " " + Fighter.MonthUFC.getYear());
			recov = (int) (Weight.Player.recovery * 100);
			lblRecovery.setText("RECOVERY: " + recov + "%");
			
			if (Fighter.BalanceUFC.getBalance() < 20000) {
				btnStr.setEnabled(false);
				btnSpd.setEnabled(false);
				btnStm.setEnabled(false);
				btnChin.setEnabled(false);
				btnStrk.setEnabled(false);
				btnWrst.setEnabled(false);
				btnIq.setEnabled(false);
				btnLuck.setEnabled(false);
			}
			
			if (Weight.Player.stm >= 9.9) {
				btnStm.setEnabled(false);
			}
		}
	}
	
	public static class GymChinScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();
			
			Weight.Player.addChin(0.1);
			lblChin.setText(String.format("CHIN: %.1f", Weight.Player.chin));
			Fighter.BalanceUFC.subBalance(20000);
			Fighter.lblMoney.setText("BALANCE: $" + Fighter.BalanceUFC.getBalance());
			
			if (Weight.Player.getWeight() == 1) {
				PositionCheck.flyDbl[Weight.Player.getPos()][3] = Weight.Player.chin;
			}
			else if (Weight.Player.getWeight() == 2) {
				PositionCheck.bantamDbl[Weight.Player.getPos()][3] = Weight.Player.chin;
			}
			else if (Weight.Player.getWeight() == 3) {
				PositionCheck.featherDbl[Weight.Player.getPos()][3] = Weight.Player.chin;
			}
			else if (Weight.Player.getWeight() == 4) {
				PositionCheck.lightDbl[Weight.Player.getPos()][3] = Weight.Player.chin;
			}
			else if (Weight.Player.getWeight() == 5) {
				PositionCheck.welterDbl[Weight.Player.getPos()][3] = Weight.Player.chin;
			}
			else if (Weight.Player.getWeight() == 6) {
				PositionCheck.middleDbl[Weight.Player.getPos()][3] = Weight.Player.chin;
			}
			else if (Weight.Player.getWeight() == 7) {
				PositionCheck.lheavyDbl[Weight.Player.getPos()][3] = Weight.Player.chin;
			}
			else if (Weight.Player.getWeight() == 8) {
				PositionCheck.heavyDbl[Weight.Player.getPos()][3] = Weight.Player.chin;
			}
			
			Fighter.MonthUFC.incMonth();
			Fighter.lblDate.setText(Fighter.MonthUFC.getMonth() + " " + Fighter.MonthUFC.getYear());
			recov = (int) (Weight.Player.recovery * 100);
			lblRecovery.setText("RECOVERY: " + recov + "%");
			
			if (Fighter.BalanceUFC.getBalance() < 20000) {
				btnStr.setEnabled(false);
				btnSpd.setEnabled(false);
				btnStm.setEnabled(false);
				btnChin.setEnabled(false);
				btnStrk.setEnabled(false);
				btnWrst.setEnabled(false);
				btnIq.setEnabled(false);
				btnLuck.setEnabled(false);
			}
			
			if (Weight.Player.chin >= 9.9) {
				btnChin.setEnabled(false);
			}
		}
	}
	
	public static class GymStrkScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();
			
			Weight.Player.addStrk(0.1);
			lblStrk.setText(String.format("STRIKING: %.1f", Weight.Player.strk));
			Fighter.BalanceUFC.subBalance(20000);
			Fighter.lblMoney.setText("BALANCE: $" + Fighter.BalanceUFC.getBalance());
			
			if (Weight.Player.getWeight() == 1) {
				PositionCheck.flyDbl[Weight.Player.getPos()][4] = Weight.Player.strk;
			}
			else if (Weight.Player.getWeight() == 2) {
				PositionCheck.bantamDbl[Weight.Player.getPos()][4] = Weight.Player.strk;
			}
			else if (Weight.Player.getWeight() == 3) {
				PositionCheck.featherDbl[Weight.Player.getPos()][4] = Weight.Player.strk;
			}
			else if (Weight.Player.getWeight() == 4) {
				PositionCheck.lightDbl[Weight.Player.getPos()][4] = Weight.Player.strk;
			}
			else if (Weight.Player.getWeight() == 5) {
				PositionCheck.welterDbl[Weight.Player.getPos()][4] = Weight.Player.strk;
			}
			else if (Weight.Player.getWeight() == 6) {
				PositionCheck.middleDbl[Weight.Player.getPos()][4] = Weight.Player.strk;
			}
			else if (Weight.Player.getWeight() == 7) {
				PositionCheck.lheavyDbl[Weight.Player.getPos()][4] = Weight.Player.strk;
			}
			else if (Weight.Player.getWeight() == 8) {
				PositionCheck.heavyDbl[Weight.Player.getPos()][4] = Weight.Player.strk;
			}
			
			Fighter.MonthUFC.incMonth();
			Fighter.lblDate.setText(Fighter.MonthUFC.getMonth() + " " + Fighter.MonthUFC.getYear());
			recov = (int) (Weight.Player.recovery * 100);
			lblRecovery.setText("RECOVERY: " + recov + "%");
			
			if (Fighter.BalanceUFC.getBalance() < 20000) {
				btnStr.setEnabled(false);
				btnSpd.setEnabled(false);
				btnStm.setEnabled(false);
				btnChin.setEnabled(false);
				btnStrk.setEnabled(false);
				btnWrst.setEnabled(false);
				btnIq.setEnabled(false);
				btnLuck.setEnabled(false);
			}
			
			if (Weight.Player.strk >= 9.9) {
				btnStrk.setEnabled(false);
			}
		}
	}
	
	public static class GymWrstScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();
			
			Weight.Player.addWrst(0.1);
			lblWrst.setText(String.format("WRESTLING: %.1f", Weight.Player.wrst));
			Fighter.BalanceUFC.subBalance(20000);
			Fighter.lblMoney.setText("BALANCE: $" + Fighter.BalanceUFC.getBalance());
			
			if (Weight.Player.getWeight() == 1) {
				PositionCheck.flyDbl[Weight.Player.getPos()][5] = Weight.Player.wrst;
			}
			else if (Weight.Player.getWeight() == 2) {
				PositionCheck.bantamDbl[Weight.Player.getPos()][5] = Weight.Player.wrst;
			}
			else if (Weight.Player.getWeight() == 3) {
				PositionCheck.featherDbl[Weight.Player.getPos()][5] = Weight.Player.wrst;
			}
			else if (Weight.Player.getWeight() == 4) {
				PositionCheck.lightDbl[Weight.Player.getPos()][5] = Weight.Player.wrst;
			}
			else if (Weight.Player.getWeight() == 5) {
				PositionCheck.welterDbl[Weight.Player.getPos()][5] = Weight.Player.wrst;
			}
			else if (Weight.Player.getWeight() == 6) {
				PositionCheck.middleDbl[Weight.Player.getPos()][5] = Weight.Player.wrst;
			}
			else if (Weight.Player.getWeight() == 7) {
				PositionCheck.lheavyDbl[Weight.Player.getPos()][5] = Weight.Player.wrst;
			}
			else if (Weight.Player.getWeight() == 8) {
				PositionCheck.heavyDbl[Weight.Player.getPos()][5] = Weight.Player.wrst;
			}
			
			Fighter.MonthUFC.incMonth();
			Fighter.lblDate.setText(Fighter.MonthUFC.getMonth() + " " + Fighter.MonthUFC.getYear());
			recov = (int) (Weight.Player.recovery * 100);
			lblRecovery.setText("RECOVERY: " + recov + "%");
			
			if (Fighter.BalanceUFC.getBalance() < 20000) {
				btnStr.setEnabled(false);
				btnSpd.setEnabled(false);
				btnStm.setEnabled(false);
				btnChin.setEnabled(false);
				btnStrk.setEnabled(false);
				btnWrst.setEnabled(false);
				btnIq.setEnabled(false);
				btnLuck.setEnabled(false);
			}
			
			if (Weight.Player.wrst >= 9.9) {
				btnWrst.setEnabled(false);
			}
		}
	}
	
	public static class GymIqScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();
			
			Weight.Player.addIq(0.1);
			lblIq.setText(String.format("IQ: %.1f", Weight.Player.iq));;
			Fighter.BalanceUFC.subBalance(20000);
			Fighter.lblMoney.setText("BALANCE: $" + Fighter.BalanceUFC.getBalance());
			
			if (Weight.Player.getWeight() == 1) {
				PositionCheck.flyDbl[Weight.Player.getPos()][6] = Weight.Player.iq;
			}
			else if (Weight.Player.getWeight() == 2) {
				PositionCheck.bantamDbl[Weight.Player.getPos()][6] = Weight.Player.iq;
			}
			else if (Weight.Player.getWeight() == 3) {
				PositionCheck.featherDbl[Weight.Player.getPos()][6] = Weight.Player.iq;
			}
			else if (Weight.Player.getWeight() == 4) {
				PositionCheck.lightDbl[Weight.Player.getPos()][6] = Weight.Player.iq;
			}
			else if (Weight.Player.getWeight() == 5) {
				PositionCheck.welterDbl[Weight.Player.getPos()][6] = Weight.Player.iq;
			}
			else if (Weight.Player.getWeight() == 6) {
				PositionCheck.middleDbl[Weight.Player.getPos()][6] = Weight.Player.iq;
			}
			else if (Weight.Player.getWeight() == 7) {
				PositionCheck.lheavyDbl[Weight.Player.getPos()][6] = Weight.Player.iq;
			}
			else if (Weight.Player.getWeight() == 8) {
				PositionCheck.heavyDbl[Weight.Player.getPos()][6] = Weight.Player.iq;
			}
			
			Fighter.MonthUFC.incMonth();
			Fighter.lblDate.setText(Fighter.MonthUFC.getMonth() + " " + Fighter.MonthUFC.getYear());
			recov = (int) (Weight.Player.recovery * 100);
			lblRecovery.setText("RECOVERY: " + recov + "%");
			
			if (Fighter.BalanceUFC.getBalance() < 20000) {
				btnStr.setEnabled(false);
				btnSpd.setEnabled(false);
				btnStm.setEnabled(false);
				btnChin.setEnabled(false);
				btnStrk.setEnabled(false);
				btnWrst.setEnabled(false);
				btnIq.setEnabled(false);
				btnLuck.setEnabled(false);
			}
			
			if (Weight.Player.iq >= 9.9) {
				btnIq.setEnabled(false);
			}
		}
	}
	
	public static class GymLuckScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();
			
			Weight.Player.addLuck(0.1);
			lblLuck.setText(String.format("LUCK: %.1f", Weight.Player.luck));;
			Fighter.BalanceUFC.subBalance(20000);
			Fighter.lblMoney.setText("BALANCE: $" + Fighter.BalanceUFC.getBalance());
			
			if (Weight.Player.getWeight() == 1) {
				PositionCheck.flyDbl[Weight.Player.getPos()][7] = Weight.Player.luck;
			}
			else if (Weight.Player.getWeight() == 2) {
				PositionCheck.bantamDbl[Weight.Player.getPos()][7] = Weight.Player.luck;
			}
			else if (Weight.Player.getWeight() == 3) {
				PositionCheck.featherDbl[Weight.Player.getPos()][7] = Weight.Player.luck;
			}
			else if (Weight.Player.getWeight() == 4) {
				PositionCheck.lightDbl[Weight.Player.getPos()][7] = Weight.Player.luck;
			}
			else if (Weight.Player.getWeight() == 5) {
				PositionCheck.welterDbl[Weight.Player.getPos()][7] = Weight.Player.luck;
			}
			else if (Weight.Player.getWeight() == 6) {
				PositionCheck.middleDbl[Weight.Player.getPos()][7] = Weight.Player.luck;
			}
			else if (Weight.Player.getWeight() == 7) {
				PositionCheck.lheavyDbl[Weight.Player.getPos()][7] = Weight.Player.luck;
			}
			else if (Weight.Player.getWeight() == 8) {
				PositionCheck.heavyDbl[Weight.Player.getPos()][7] = Weight.Player.luck;
			}
			
			Fighter.MonthUFC.incMonth();
			Fighter.lblDate.setText(Fighter.MonthUFC.getMonth() + " " + Fighter.MonthUFC.getYear());
			recov = (int) (Weight.Player.recovery * 100);
			lblRecovery.setText("RECOVERY: " + recov + "%");
			
			if (Fighter.BalanceUFC.getBalance() < 20000) {
				btnStr.setEnabled(false);
				btnSpd.setEnabled(false);
				btnStm.setEnabled(false);
				btnChin.setEnabled(false);
				btnStrk.setEnabled(false);
				btnWrst.setEnabled(false);
				btnIq.setEnabled(false);
				btnLuck.setEnabled(false);
			}
			
			if (Weight.Player.luck >= 9.9) {
				btnLuck.setEnabled(false);
			}
		}
	}
	
	public static class GymBackScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();
			
			back.setVisible(false);
			overallDesc.setVisible(false);
			overall.setVisible(false);
			Fighter.money.setVisible(false);
			Fighter.date.setVisible(false);
			
			str.setVisible(false);
			spd.setVisible(false);
			stm.setVisible(false);
			chin.setVisible(false);
			strk.setVisible(false);
			wrst.setVisible(false);
			iq.setVisible(false);
			luck.setVisible(false);
			recovery.setVisible(false);
			
			
			Fighter.fighterScreen();
		}
	}

}
