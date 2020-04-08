package UFCsimulator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SponsorScreen {
	
	static JPanel spn1, spn2, spn3, spn4, spn5, spn6, spn7, spn8, spn9, spn10, spn11, spn12, back;
	
	static JLabel lblSpn1, lblSpn2, lblSpn3, lblSpn4, lblSpn5, lblSpn6, lblSpn7, lblSpn8, lblSpn9, lblSpn10, lblSpn11, lblSpn12;
	
	static JButton btnSpn1, btnSpn2, btnSpn3, btnSpn4, btnSpn5, btnSpn6, btnSpn7, btnSpn8, btnSpn9, btnSpn10, btnSpn11, btnSpn12, btnBack;
	
	static Boolean spn1s = false;
	static Boolean spn2s = false;
	static Boolean spn3s = false;
	static Boolean spn4s = false;
	static Boolean spn5s = false;
	static Boolean spn6s = false;
	static Boolean spn7s = false;
	static Boolean spn8s = false;
	static Boolean spn9s = false;
	static Boolean spn10s = false;
	static Boolean spn11s = false;
	static Boolean spn12s = false;
	
	static SponsorBackScreenHandler sponsorBackHandler = new SponsorBackScreenHandler();
	static spn1ScreenHandler spn1Handler = new spn1ScreenHandler();
	static spn2ScreenHandler spn2Handler = new spn2ScreenHandler();
	static spn3ScreenHandler spn3Handler = new spn3ScreenHandler();
	static spn4ScreenHandler spn4Handler = new spn4ScreenHandler();
	static spn5ScreenHandler spn5Handler = new spn5ScreenHandler();
	static spn6ScreenHandler spn6Handler = new spn6ScreenHandler();
	static spn7ScreenHandler spn7Handler = new spn7ScreenHandler();
	static spn8ScreenHandler spn8Handler = new spn8ScreenHandler();
	static spn9ScreenHandler spn9Handler = new spn9ScreenHandler();
	static spn10ScreenHandler spn10Handler = new spn10ScreenHandler();
	static spn11ScreenHandler spn11Handler = new spn11ScreenHandler();
	static spn12ScreenHandler spn12Handler = new spn12ScreenHandler();

	public static void sponsorScreen() {
		
		back = new JPanel();
		back.setBounds(412, 430, 200, 55);
		UFCgui.con.add(back);
		back.setVisible(true);
		
		btnBack = new JButton("BACK");
		btnBack.setPreferredSize(new Dimension(200, 50));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBack.setBackground(Color.white);
		btnBack.setFocusPainted(false);
		btnBack.addActionListener(sponsorBackHandler);
		back.add(btnBack);
		
		
		spn1 = new JPanel();
		spn1.setBounds(45, 100, 200, 85);
		UFCgui.con.add(spn1);
		spn1.setVisible(true);
		
		lblSpn1 = new JLabel("SPECTRUM");
		lblSpn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		spn1.add(lblSpn1);
		
		btnSpn1 = new JButton();
		if (Fighter.BalanceUFC.getClout() < 30000) {
			btnSpn1.setText("UNAVAILABLE");
			btnSpn1.setEnabled(false);
		}
		else if (spn1s) {
			btnSpn1.setText("SIGNED");
			btnSpn1.setEnabled(false);
		}
		else {
			btnSpn1.setText("AVAILABLE");
			btnSpn1.setEnabled(true);
		}
		btnSpn1.setPreferredSize(new Dimension(200, 50));
		btnSpn1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSpn1.setBackground(Color.white);
		btnSpn1.setFocusPainted(false);
		btnSpn1.setToolTipText("+$5000 per fight");
		btnSpn1.addActionListener(spn1Handler);
		spn1.add(btnSpn1);
		
		
		spn2 = new JPanel();
		spn2.setBounds(290, 100, 200, 85);
		UFCgui.con.add(spn2);
		spn2.setVisible(true);
		
		lblSpn2 = new JLabel("BURGER KING");
		lblSpn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		spn2.add(lblSpn2);
		
		btnSpn2 = new JButton();
		if (Fighter.BalanceUFC.getClout() < 60000) {
			btnSpn2.setText("UNAVAILABLE");
			btnSpn2.setEnabled(false);
		}
		else if (spn2s) {
			btnSpn2.setText("SIGNED");
			btnSpn2.setEnabled(false);
		}
		else {
			btnSpn2.setText("AVAILABLE");
		}
		btnSpn2.setPreferredSize(new Dimension(200, 50));
		btnSpn2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSpn2.setBackground(Color.white);
		btnSpn2.setFocusPainted(false);
		btnSpn2.setToolTipText("+$5000 per fight");
		btnSpn2.addActionListener(spn2Handler);
		spn2.add(btnSpn2);
		
		
		spn3 = new JPanel();
		spn3.setBounds(535, 100, 200, 85);
		UFCgui.con.add(spn3);
		spn3.setVisible(true);
		
		lblSpn3 = new JLabel("JACK LINK'S");
		lblSpn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		spn3.add(lblSpn3);
		
		btnSpn3 = new JButton();
		if (Fighter.BalanceUFC.getClout() < 90000) {
			btnSpn3.setText("UNAVAILABLE");
			btnSpn3.setEnabled(false);
		}
		else if (spn3s) {
			btnSpn3.setText("SIGNED");
			btnSpn3.setEnabled(false);
		}
		else {
			btnSpn3.setText("AVAILABLE");
		}
		btnSpn3.setPreferredSize(new Dimension(200, 50));
		btnSpn3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSpn3.setBackground(Color.white);
		btnSpn3.setFocusPainted(false);
		btnSpn3.setToolTipText("+$5000 per fight");
		btnSpn3.addActionListener(spn3Handler);
		spn3.add(btnSpn3);
		
		
		spn4 = new JPanel();
		spn4.setBounds(790, 100, 200, 85);
		UFCgui.con.add(spn4);
		spn4.setVisible(true);
		
		lblSpn4 = new JLabel("REEBOK");
		lblSpn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		spn4.add(lblSpn4);
		
		btnSpn4 = new JButton();
		if (Fighter.BalanceUFC.getClout() < 120000) {
			btnSpn4.setText("UNAVAILABLE");
			btnSpn4.setEnabled(false);
		}
		else if (spn4s) {
			btnSpn4.setText("SIGNED");
			btnSpn4.setEnabled(false);
		}
		else {
			btnSpn4.setText("AVAILABLE");
		}
		btnSpn4.setPreferredSize(new Dimension(200, 50));
		btnSpn4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSpn4.setBackground(Color.white);
		btnSpn4.setFocusPainted(false);
		btnSpn4.setToolTipText("+$5000 per fight");
		btnSpn4.addActionListener(spn4Handler);
		spn4.add(btnSpn4);
		
		
		spn5 = new JPanel();
		spn5.setBounds(45, 200, 200, 85);
		UFCgui.con.add(spn5);
		spn5.setVisible(true);
		
		lblSpn5 = new JLabel("CONDOM DEPOT");
		lblSpn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		spn5.add(lblSpn5);
		
		btnSpn5 = new JButton();
		if (Fighter.BalanceUFC.getClout() < 150000) {
			btnSpn5.setText("UNAVAILABLE");
			btnSpn5.setEnabled(false);
		}
		else if (spn5s) {
			btnSpn5.setText("SIGNED");
			btnSpn5.setEnabled(false);
		}
		else {
			btnSpn5.setText("AVAILABLE");
		}
		btnSpn5.setPreferredSize(new Dimension(200, 50));
		btnSpn5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSpn5.setBackground(Color.white);
		btnSpn5.setFocusPainted(false);
		btnSpn5.setToolTipText("+$10000 per fight");
		btnSpn5.addActionListener(spn5Handler);
		spn5.add(btnSpn5);
		
		
		spn6 = new JPanel();
		spn6.setBounds(290, 200, 200, 85);
		UFCgui.con.add(spn6);
		spn6.setVisible(true);
		
		lblSpn6 = new JLabel("BUD LIGHT");
		lblSpn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		spn6.add(lblSpn6);
		
		btnSpn6 = new JButton();
		if (Fighter.BalanceUFC.getClout() < 180000) {
			btnSpn6.setText("UNAVAILABLE");
			btnSpn6.setEnabled(false);
		}
		else if (spn6s) {
			btnSpn6.setText("SIGNED");
			btnSpn6.setEnabled(false);
		}
		else {
			btnSpn6.setText("AVAILABLE");
		}
		btnSpn6.setPreferredSize(new Dimension(200, 50));
		btnSpn6.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSpn6.setBackground(Color.white);
		btnSpn6.setFocusPainted(false);
		btnSpn6.setToolTipText("+$10000 per fight");
		btnSpn6.addActionListener(spn6Handler);
		spn6.add(btnSpn6);
		
		
		spn7 = new JPanel();
		spn7.setBounds(535, 200, 200, 85);
		UFCgui.con.add(spn7);
		spn7.setVisible(true);
		
		lblSpn7 = new JLabel("COCA COLA");
		lblSpn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		spn7.add(lblSpn7);
		
		btnSpn7 = new JButton();
		if (Fighter.BalanceUFC.getClout() < 210000) {
			btnSpn7.setText("UNAVAILABLE");
			btnSpn7.setEnabled(false);
		}
		else if (spn7s) {
			btnSpn7.setText("SIGNED");
			btnSpn7.setEnabled(false);
		}
		else {
			btnSpn7.setText("AVAILABLE");
		}
		btnSpn7.setPreferredSize(new Dimension(200, 50));
		btnSpn7.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSpn7.setBackground(Color.white);
		btnSpn7.setFocusPainted(false);
		btnSpn7.setToolTipText("+$10000 per fight");
		btnSpn7.addActionListener(spn7Handler);
		spn7.add(btnSpn7);
		
		
		spn8 = new JPanel();
		spn8.setBounds(790, 200, 200, 85);
		UFCgui.con.add(spn8);
		spn8.setVisible(true);
		
		lblSpn8 = new JLabel("HARLEY DAVIDSON");
		lblSpn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		spn8.add(lblSpn8);
		
		btnSpn8 = new JButton();
		if (Fighter.BalanceUFC.getClout() < 240000) {
			btnSpn8.setText("UNAVAILABLE");
			btnSpn8.setEnabled(false);
		}
		else if (spn8s) {
			btnSpn8.setText("SIGNED");
			btnSpn8.setEnabled(false);
		}
		else {
			btnSpn8.setText("AVAILABLE");
		}
		btnSpn8.setPreferredSize(new Dimension(200, 50));
		btnSpn8.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSpn8.setBackground(Color.white);
		btnSpn8.setFocusPainted(false);
		btnSpn8.setToolTipText("+$10000 per fight");
		btnSpn8.addActionListener(spn8Handler);
		spn8.add(btnSpn8);
		
		
		spn9 = new JPanel();
		spn9.setBounds(45, 300, 200, 85);
		UFCgui.con.add(spn9);
		spn9.setVisible(true);
		
		lblSpn9 = new JLabel("PROPER TWELVE");
		lblSpn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		spn9.add(lblSpn9);
		
		btnSpn9 = new JButton();
		if (Fighter.BalanceUFC.getClout() < 270000) {
			btnSpn9.setText("UNAVAILABLE");
			btnSpn9.setEnabled(false);
		}
		else if (spn9s) {
			btnSpn9.setText("SIGNED");
			btnSpn9.setEnabled(false);
		}
		else {
			btnSpn9.setText("AVAILABLE");
		}
		btnSpn9.setPreferredSize(new Dimension(200, 50));
		btnSpn9.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSpn9.setBackground(Color.white);
		btnSpn9.setFocusPainted(false);
		btnSpn9.setToolTipText("+$15000 per fight");
		btnSpn9.addActionListener(spn9Handler);
		spn9.add(btnSpn9);
		
		
		spn10 = new JPanel();
		spn10.setBounds(290, 300, 200, 85);
		UFCgui.con.add(spn10);
		spn10.setVisible(true);
		
		lblSpn10 = new JLabel("NIKE");
		lblSpn10.setFont(new Font("Tahoma", Font.BOLD, 20));
		spn10.add(lblSpn10);
		
		btnSpn10 = new JButton();
		if (Fighter.BalanceUFC.getClout() < 300000) {
			btnSpn10.setText("UNAVAILABLE");
			btnSpn10.setEnabled(false);
		}
		else if (spn10s) {
			btnSpn10.setText("SIGNED");
			btnSpn10.setEnabled(false);
		}
		else {
			btnSpn10.setText("AVAILABLE");
		}
		btnSpn10.setPreferredSize(new Dimension(200, 50));
		btnSpn10.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSpn10.setBackground(Color.white);
		btnSpn10.setFocusPainted(false);
		btnSpn10.setToolTipText("+$15000 per fight");
		btnSpn10.addActionListener(spn10Handler);
		spn10.add(btnSpn10);
		
		
		spn11 = new JPanel();
		spn11.setBounds(535, 300, 200, 85);
		UFCgui.con.add(spn11);
		spn11.setVisible(true);
		
		lblSpn11 = new JLabel("JPMORGAN CHASE");
		lblSpn11.setFont(new Font("Tahoma", Font.BOLD, 20));
		spn11.add(lblSpn11);
		
		btnSpn11 = new JButton();
		if (Fighter.BalanceUFC.getClout() < 330000) {
			btnSpn11.setText("UNAVAILABLE");
			btnSpn11.setEnabled(false);
		}
		else if (spn11s) {
			btnSpn11.setText("SIGNED");
			btnSpn11.setEnabled(false);
		}
		else {
			btnSpn11.setText("AVAILABLE");
		}
		btnSpn11.setPreferredSize(new Dimension(200, 50));
		btnSpn11.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSpn11.setBackground(Color.white);
		btnSpn11.setFocusPainted(false);
		btnSpn11.setToolTipText("+$15000 per fight");
		btnSpn11.addActionListener(spn11Handler);
		spn11.add(btnSpn11);
		
		
		spn12 = new JPanel();
		spn12.setBounds(790, 300, 200, 85);
		UFCgui.con.add(spn12);
		spn12.setVisible(true);
		
		lblSpn12 = new JLabel("LAMBORGHINI");
		lblSpn12.setFont(new Font("Tahoma", Font.BOLD, 20));
		spn12.add(lblSpn12);
		
		btnSpn12 = new JButton();
		if (Fighter.BalanceUFC.getClout() < 360000) {
			btnSpn12.setText("UNAVAILABLE");
			btnSpn12.setEnabled(false);
		}
		else if (spn12s) {
			btnSpn12.setText("SIGNED");
			btnSpn12.setEnabled(false);
		}
		else {
			btnSpn12.setText("AVAILABLE");
		}
		btnSpn12.setPreferredSize(new Dimension(200, 50));
		btnSpn12.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSpn12.setBackground(Color.white);
		btnSpn12.setFocusPainted(false);
		btnSpn12.setToolTipText("+$15000 per fight");
		btnSpn12.addActionListener(spn12Handler);
		spn12.add(btnSpn12);
		
	}
	
	public static class SponsorBackScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();
			
			back.setVisible(false);
			
			spn1.setVisible(false);
			spn2.setVisible(false);
			spn3.setVisible(false);
			spn4.setVisible(false);
			spn5.setVisible(false);
			spn6.setVisible(false);
			spn7.setVisible(false);
			spn8.setVisible(false);
			spn9.setVisible(false);
			spn10.setVisible(false);
			spn11.setVisible(false);
			spn12.setVisible(false);

			
			CareerScreen.careerScreen();
		}
	}
	
	public static class spn1ScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();

			spn1s = true;
			btnSpn1.setEnabled(false);
			btnSpn1.setText("SIGNED");
			Fighter.BalanceUFC.sponsor += 5000;
		}
	}
	
	public static class spn2ScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();

			spn2s = true;
			btnSpn2.setEnabled(false);
			btnSpn2.setText("SIGNED");
			Fighter.BalanceUFC.sponsor += 5000;
		}
	}
	
	public static class spn3ScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();

			spn3s = true;
			btnSpn3.setEnabled(false);
			btnSpn3.setText("SIGNED");
			Fighter.BalanceUFC.sponsor += 5000;
		}
	}
	
	public static class spn4ScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();

			spn4s = true;
			btnSpn4.setEnabled(false);
			btnSpn4.setText("SIGNED");
			Fighter.BalanceUFC.sponsor += 5000;
		}
	}
	
	public static class spn5ScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();

			spn5s = true;
			btnSpn5.setEnabled(false);
			btnSpn5.setText("SIGNED");
			Fighter.BalanceUFC.sponsor += 10000;
		}
	}
	
	public static class spn6ScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();

			spn6s = true;
			btnSpn6.setEnabled(false);
			btnSpn6.setText("SIGNED");
			Fighter.BalanceUFC.sponsor += 10000;
		}
	}
	
	public static class spn7ScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();

			spn7s = true;
			btnSpn7.setEnabled(false);
			btnSpn7.setText("SIGNED");
			Fighter.BalanceUFC.sponsor += 10000;
		}
	}
	
	public static class spn8ScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();

			spn8s = true;
			btnSpn8.setEnabled(false);
			btnSpn8.setText("SIGNED");
			Fighter.BalanceUFC.sponsor += 10000;
		}
	}
	
	public static class spn9ScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();

			spn9s = true;
			btnSpn9.setEnabled(false);
			btnSpn9.setText("SIGNED");
			Fighter.BalanceUFC.sponsor += 15000;
		}
	}
	
	public static class spn10ScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();
			
			spn10s = true;
			btnSpn10.setEnabled(false);
			btnSpn10.setText("SIGNED");
			Fighter.BalanceUFC.sponsor += 15000;
		}
	}
	
	public static class spn11ScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();

			spn11s = true;
			btnSpn11.setEnabled(false);
			btnSpn11.setText("SIGNED");
			Fighter.BalanceUFC.sponsor += 15000;
		}
	}
	
	public static class spn12ScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();

			spn12s = true;
			btnSpn12.setEnabled(false);
			btnSpn12.setText("SIGNED");
			Fighter.BalanceUFC.sponsor += 15000;
		}
	}
	
}
