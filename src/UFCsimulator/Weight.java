package UFCsimulator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Weight {

	static JPanel chooseWeight, flyWeight, bantamWeight, featherWeight, lightWeight, welterWeight, middleWeight, lheavyWeight, heavyWeight, backArrow, logoUFC;
	
	static JLabel lblChooseWeight, lblLogoUFC;
	
	static JButton btnFlyWeight, btnBantamWeight, btnFeatherWeight, btnLightWeight, btnWelterWeight, btnMiddleWeight, btnLheavyWeight, btnHeavyWeight, btnBack;
	
	static FlyScreenHandler flyHandler = new FlyScreenHandler();
	static BantamScreenHandler bantamHandler = new BantamScreenHandler();
	static FeatherScreenHandler featherHandler = new FeatherScreenHandler();
	static LightScreenHandler lightHandler = new LightScreenHandler();
	static WelterScreenHandler welterHandler = new WelterScreenHandler();
	static MiddleScreenHandler middleHandler = new MiddleScreenHandler();
	static LheavyScreenHandler lheavyHandler = new LheavyScreenHandler();
	static HeavyScreenHandler heavyHandler = new HeavyScreenHandler();
	static BackScreenHandler backHandler = new BackScreenHandler();
	
	static YouClass Player = new YouClass();
	
	static ImageIcon ufcIcon;
	
	public static void weightScreen() {
		
		logoUFC = new JPanel();
		logoUFC.setBounds(490, 489, 45, 50);
		UFCgui.con.add(logoUFC);
		logoUFC.setVisible(true);
		
		try {
			ufcIcon = new ImageIcon(Fighter.class.getResource("/UFCsimulator/resources/ufcSimLogo1.png"));
			lblLogoUFC = new JLabel(ufcIcon);
			lblLogoUFC.setToolTipText("UFC SIMULATOR was created by JAMES DAO");
			logoUFC.add(lblLogoUFC);
		}
		catch(Exception e) {
			System.out.println("Image not found");
		}
		
		
		chooseWeight = new JPanel();
		chooseWeight.setBounds(0, 0, 1024, 35);
		UFCgui.con.add(chooseWeight);
		chooseWeight.setVisible(true);
		lblChooseWeight = new JLabel("CHOOSE YOUR WEIGHTCLASS");
		lblChooseWeight.setFont(new Font("Tahoma", Font.BOLD, 28));
		chooseWeight.add(lblChooseWeight);
		
		flyWeight = new JPanel();
		flyWeight.setBounds(312, 105, 400, 50);
		UFCgui.con.add(flyWeight);
		flyWeight.setVisible(true);
		btnFlyWeight = new JButton("FLYWEIGHT 125 LBS");
		btnFlyWeight.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnFlyWeight.setPreferredSize(new Dimension(300, 30));
		btnFlyWeight.setBackground(Color.white);
		btnFlyWeight.setFocusPainted(false);
		btnFlyWeight.addActionListener(flyHandler);
		flyWeight.add(btnFlyWeight);
		
		bantamWeight = new JPanel();
		bantamWeight.setBounds(312, 150, 400, 50);
		UFCgui.con.add(bantamWeight);
		bantamWeight.setVisible(true);
		btnBantamWeight = new JButton("BANTAMWEIGHT 135 LBS");
		btnBantamWeight.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBantamWeight.setPreferredSize(new Dimension(300, 30));
		btnBantamWeight.setBackground(Color.white);
		btnBantamWeight.setFocusPainted(false);
		btnBantamWeight.addActionListener(bantamHandler);
		bantamWeight.add(btnBantamWeight);
		
		featherWeight = new JPanel();
		featherWeight.setBounds(312, 195, 400, 50);
		UFCgui.con.add(featherWeight);
		featherWeight.setVisible(true);
		btnFeatherWeight = new JButton("FEATHERWEIGHT 145 LBS");
		btnFeatherWeight.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnFeatherWeight.setPreferredSize(new Dimension(300, 30));
		btnFeatherWeight.setBackground(Color.white);
		btnFeatherWeight.setFocusPainted(false);
		btnFeatherWeight.addActionListener(featherHandler);
		featherWeight.add(btnFeatherWeight);
		
		lightWeight = new JPanel();
		lightWeight.setBounds(312, 240, 400, 50);
		UFCgui.con.add(lightWeight);
		lightWeight.setVisible(true);
		btnLightWeight = new JButton("LIGHTWEIGHT 155 LBS");
		btnLightWeight.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLightWeight.setPreferredSize(new Dimension(300, 30));
		btnLightWeight.setBackground(Color.white);
		btnLightWeight.setFocusPainted(false);
		btnLightWeight.addActionListener(lightHandler);
		lightWeight.add(btnLightWeight);
		
		welterWeight = new JPanel();
		welterWeight.setBounds(312, 285, 400, 50);
		UFCgui.con.add(welterWeight);
		welterWeight.setVisible(true);
		btnWelterWeight = new JButton("WELTERWEIGHT 170 LBS");
		btnWelterWeight.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnWelterWeight.setPreferredSize(new Dimension(300, 30));
		btnWelterWeight.setBackground(Color.white);
		btnWelterWeight.setFocusPainted(false);
		btnWelterWeight.addActionListener(welterHandler);
		welterWeight.add(btnWelterWeight);
		
		middleWeight = new JPanel();
		middleWeight.setBounds(312, 330, 400, 50);
		UFCgui.con.add(middleWeight);
		middleWeight.setVisible(true);
		btnMiddleWeight = new JButton("MIDDLEWEIGHT 185 LBS");
		btnMiddleWeight.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnMiddleWeight.setPreferredSize(new Dimension(300, 30));
		btnMiddleWeight.setBackground(Color.white);
		btnMiddleWeight.setFocusPainted(false);
		btnMiddleWeight.addActionListener(middleHandler);
		middleWeight.add(btnMiddleWeight);
		
		lheavyWeight = new JPanel();
		lheavyWeight.setBounds(312, 375, 400, 50);
		UFCgui.con.add(lheavyWeight);
		lheavyWeight.setVisible(true);
		btnLheavyWeight = new JButton("LIGHT HEAVYWEIGHT 205 LBS");
		btnLheavyWeight.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLheavyWeight.setPreferredSize(new Dimension(300, 30));
		btnLheavyWeight.setBackground(Color.white);
		btnLheavyWeight.setFocusPainted(false);
		btnLheavyWeight.addActionListener(lheavyHandler);
		lheavyWeight.add(btnLheavyWeight);
		
		heavyWeight = new JPanel();
		heavyWeight.setBounds(312, 420, 400, 50);
		UFCgui.con.add(heavyWeight);
		heavyWeight.setVisible(true);
		btnHeavyWeight = new JButton("HEAVYWEIGHT 265 LBS");
		btnHeavyWeight.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnHeavyWeight.setPreferredSize(new Dimension(300, 30));
		btnHeavyWeight.setBackground(Color.white);
		btnHeavyWeight.setFocusPainted(false);
		btnHeavyWeight.addActionListener(heavyHandler);
		heavyWeight.add(btnHeavyWeight);
		
		backArrow = new JPanel();
		backArrow.setBounds(15, 213, 50, 105);
		UFCgui.con.add(backArrow);
		backArrow.setVisible(true);
		
		btnBack = new JButton("<");
		btnBack.setPreferredSize(new Dimension(50, 100));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBack.setBackground(Color.white);
		btnBack.setFocusPainted(false);
		btnBack.addActionListener(backHandler);
		backArrow.add(btnBack);
	}
	
	public static class FlyScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();

			chooseWeight.setVisible(false);
			flyWeight.setVisible(false);
			bantamWeight.setVisible(false);
			featherWeight.setVisible(false);
			lightWeight.setVisible(false);
			welterWeight.setVisible(false);
			middleWeight.setVisible(false);
			lheavyWeight.setVisible(false);
			heavyWeight.setVisible(false);
			backArrow.setVisible(false);
			
			switch(CharacterSelect.charNum) {
				case 0:
					Player.setClass(6, 6, 6, 6, 6, 6, 6, 6, 1, "ALEX", "DUONG");
					break;
				case 1:
					Player.setClass(7, 7, 7, 7, 10, 2, 7, 1, 1, "JAMES", "DAO");
					break;
				case 2:
					Player.setClass(6, 6, 5, 5, 5, 5, 8, 8, 1, "KHOA", "DIEP");
					break;
				case 3:
					Player.setClass(9, 9, 9, 1, 7, 7, 5, 1, 1, "JIMMY", "TRAN");
					break;
				case 4:
					Player.setClass(6, 5, 7, 4, 4, 6, 6, 10, 1, "BEN", "GRAY");
					break;
				case 5:
					Player.setClass(8, 4, 6, 6, 6, 7, 10, 1, 1, "JOHN", "NGUYEN");
					break;
				case 6:
					Player.setClass(8, 5, 5, 5, 9, 6, 8, 2, 1, "ERIK", "NGUYEN");
					break;
				case 7:
					Player.setClass(4, 4, 8, 10, 10, 10, 1, 1, 1, "MICHAEL", "ADKISSON");
					break;
				case 8:
					Player.setClass(6, 2, 6, 5, 5, 10, 6, 8, 1, "HENRY", "HU");
					break;
				case 9:
					Player.setClass(10, 10, 10, 2, 2, 2, 6, 6, 1, "TYRONE", "FORD");
					break;
			}
			
			Fighter.fighterScreen();
		}
	}
	
	public static class BantamScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();

			chooseWeight.setVisible(false);
			flyWeight.setVisible(false);
			bantamWeight.setVisible(false);
			featherWeight.setVisible(false);
			lightWeight.setVisible(false);
			welterWeight.setVisible(false);
			middleWeight.setVisible(false);
			lheavyWeight.setVisible(false);
			heavyWeight.setVisible(false);
			backArrow.setVisible(false);
			
			switch(CharacterSelect.charNum) {
				case 0:
					Player.setClass(6, 6, 6, 6, 6, 6, 6, 6, 2, "ALEX", "DUONG");
					break;
				case 1:
					Player.setClass(7, 7, 7, 7, 10, 2, 7, 1, 2, "JAMES", "DAO");
					break;
				case 2:
					Player.setClass(6, 6, 5, 5, 5, 5, 8, 8, 2, "KHOA", "DIEP");
					break;
				case 3:
					Player.setClass(9, 9, 9, 1, 7, 7, 5, 1, 2, "JIMMY", "TRAN");
					break;
				case 4:
					Player.setClass(6, 5, 7, 4, 4, 6, 6, 10, 2, "BEN", "GRAY");
					break;
				case 5:
					Player.setClass(8, 4, 6, 6, 6, 7, 10, 1, 2, "JOHN", "NGUYEN");
					break;
				case 6:
					Player.setClass(8, 5, 5, 5, 9, 6, 8, 2, 2, "ERIK", "NGUYEN");
					break;
				case 7:
					Player.setClass(4, 4, 8, 10, 10, 10, 1, 1, 2, "MICHAEL", "ADKISSON");
					break;
				case 8:
					Player.setClass(6, 2, 6, 5, 5, 10, 6, 8, 2, "HENRY", "HU");
					break;
				case 9:
					Player.setClass(10, 10, 10, 2, 2, 2, 6, 6, 2, "TYRONE", "FORD");
					break;
			}
			
			Fighter.fighterScreen();
		}
	}
	
	public static class FeatherScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();

			chooseWeight.setVisible(false);
			flyWeight.setVisible(false);
			bantamWeight.setVisible(false);
			featherWeight.setVisible(false);
			lightWeight.setVisible(false);
			welterWeight.setVisible(false);
			middleWeight.setVisible(false);
			lheavyWeight.setVisible(false);
			heavyWeight.setVisible(false);
			backArrow.setVisible(false);
			
			switch(CharacterSelect.charNum) {
				case 0:
					Player.setClass(6, 6, 6, 6, 6, 6, 6, 6, 3, "ALEX", "DUONG");
					break;
				case 1:
					Player.setClass(7, 7, 7, 7, 10, 2, 7, 1, 3, "JAMES", "DAO");
					break;
				case 2:
					Player.setClass(6, 6, 5, 5, 5, 5, 8, 8, 3, "KHOA", "DIEP");
					break;
				case 3:
					Player.setClass(9, 9, 9, 1, 7, 7, 5, 1, 3, "JIMMY", "TRAN");
					break;
				case 4:
					Player.setClass(6, 5, 7, 4, 4, 6, 6, 10, 3, "BEN", "GRAY");
					break;
				case 5:
					Player.setClass(8, 4, 6, 6, 6, 7, 10, 1, 3, "JOHN", "NGUYEN");
					break;
				case 6:
					Player.setClass(8, 5, 5, 5, 9, 6, 8, 2, 3, "ERIK", "NGUYEN");
					break;
				case 7:
					Player.setClass(4, 4, 8, 10, 10, 10, 1, 1, 3, "MICHAEL", "ADKISSON");
					break;
				case 8:
					Player.setClass(6, 2, 6, 5, 5, 10, 6, 8, 3, "HENRY", "HU");
					break;
				case 9:
					Player.setClass(10, 10, 10, 2, 2, 2, 6, 6, 3, "TYRONE", "FORD");
					break;
			}
			
			Fighter.fighterScreen();
		}
	}
	
	public static class LightScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();

			chooseWeight.setVisible(false);
			flyWeight.setVisible(false);
			bantamWeight.setVisible(false);
			featherWeight.setVisible(false);
			lightWeight.setVisible(false);
			welterWeight.setVisible(false);
			middleWeight.setVisible(false);
			lheavyWeight.setVisible(false);
			heavyWeight.setVisible(false);
			backArrow.setVisible(false);
			
			switch(CharacterSelect.charNum) {
				case 0:
					Player.setClass(6, 6, 6, 6, 6, 6, 6, 6, 4, "ALEX", "DUONG");
					break;
				case 1:
					Player.setClass(7, 7, 7, 7, 10, 2, 7, 1, 4, "JAMES", "DAO");
					break;
				case 2:
					Player.setClass(6, 6, 5, 5, 5, 5, 8, 8, 4, "KHOA", "DIEP");
					break;
				case 3:
					Player.setClass(9, 9, 9, 1, 7, 7, 5, 1, 4, "JIMMY", "TRAN");
					break;
				case 4:
					Player.setClass(6, 5, 7, 4, 4, 6, 6, 10, 4, "BEN", "GRAY");
					break;
				case 5:
					Player.setClass(8, 4, 6, 6, 6, 7, 10, 1, 4, "JOHN", "NGUYEN");
					break;
				case 6:
					Player.setClass(8, 5, 5, 5, 9, 6, 8, 2, 4, "ERIK", "NGUYEN");
					break;
				case 7:
					Player.setClass(4, 4, 8, 10, 10, 10, 1, 1, 4, "MICHAEL", "ADKISSON");
					break;
				case 8:
					Player.setClass(6, 2, 6, 5, 5, 10, 6, 8, 4, "HENRY", "HU");
					break;
				case 9:
					Player.setClass(10, 10, 10, 2, 2, 2, 6, 6, 4, "TYRONE", "FORD");
					break;
			}
			
			Fighter.fighterScreen();
		}
	}
	
	public static class WelterScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();

			chooseWeight.setVisible(false);
			flyWeight.setVisible(false);
			bantamWeight.setVisible(false);
			featherWeight.setVisible(false);
			lightWeight.setVisible(false);
			welterWeight.setVisible(false);
			middleWeight.setVisible(false);
			lheavyWeight.setVisible(false);
			heavyWeight.setVisible(false);
			backArrow.setVisible(false);
			
			switch(CharacterSelect.charNum) {
				case 0:
					Player.setClass(6, 6, 6, 6, 6, 6, 6, 6, 5, "ALEX", "DUONG");
					break;
				case 1:
					Player.setClass(7, 7, 7, 7, 10, 2, 7, 1, 5, "JAMES", "DAO");
					break;
				case 2:
					Player.setClass(6, 6, 5, 5, 5, 5, 8, 8, 5, "KHOA", "DIEP");
					break;
				case 3:
					Player.setClass(9, 9, 9, 1, 7, 7, 5, 1, 5, "JIMMY", "TRAN");
					break;
				case 4:
					Player.setClass(6, 5, 7, 4, 4, 6, 6, 10, 5, "BEN", "GRAY");
					break;
				case 5:
					Player.setClass(8, 4, 6, 6, 6, 7, 10, 1, 5, "JOHN", "NGUYEN");
					break;
				case 6:
					Player.setClass(8, 5, 5, 5, 9, 6, 8, 2, 5, "ERIK", "NGUYEN");
					break;
				case 7:
					Player.setClass(4, 4, 8, 10, 10, 10, 1, 1, 5, "MICHAEL", "ADKISSON");
					break;
				case 8:
					Player.setClass(6, 2, 6, 5, 5, 10, 6, 8, 5, "HENRY", "HU");
					break;
				case 9:
					Player.setClass(10, 10, 10, 2, 2, 2, 6, 6, 5, "TYRONE", "FORD");
					break;
			}
			
			Fighter.fighterScreen();
		}
	}
	
	public static class MiddleScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();

			chooseWeight.setVisible(false);
			flyWeight.setVisible(false);
			bantamWeight.setVisible(false);
			featherWeight.setVisible(false);
			lightWeight.setVisible(false);
			welterWeight.setVisible(false);
			middleWeight.setVisible(false);
			lheavyWeight.setVisible(false);
			heavyWeight.setVisible(false);
			backArrow.setVisible(false);
			
			switch(CharacterSelect.charNum) {
				case 0:
					Player.setClass(6, 6, 6, 6, 6, 6, 6, 6, 6, "ALEX", "DUONG");
					break;
				case 1:
					Player.setClass(7, 7, 7, 7, 10, 2, 7, 1, 6, "JAMES", "DAO");
					break;
				case 2:
					Player.setClass(6, 6, 5, 5, 5, 5, 8, 8, 6, "KHOA", "DIEP");
					break;
				case 3:
					Player.setClass(9, 9, 9, 1, 7, 7, 5, 1, 6, "JIMMY", "TRAN");
					break;
				case 4:
					Player.setClass(6, 5, 7, 4, 4, 6, 6, 10, 6, "BEN", "GRAY");
					break;
				case 5:
					Player.setClass(8, 4, 6, 6, 6, 7, 10, 1, 6, "JOHN", "NGUYEN");
					break;
				case 6:
					Player.setClass(8, 5, 5, 5, 9, 6, 8, 2, 6, "ERIK", "NGUYEN");
					break;
				case 7:
					Player.setClass(4, 4, 8, 10, 10, 10, 1, 1, 6, "MICHAEL", "ADKISSON");
					break;
				case 8:
					Player.setClass(6, 2, 6, 5, 5, 10, 6, 8, 6, "HENRY", "HU");
					break;
				case 9:
					Player.setClass(10, 10, 10, 2, 2, 2, 6, 6, 6, "TYRONE", "FORD");
					break;
			}
			
			Fighter.fighterScreen();
		}
	}
	
	public static class LheavyScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();

			chooseWeight.setVisible(false);
			flyWeight.setVisible(false);
			bantamWeight.setVisible(false);
			featherWeight.setVisible(false);
			lightWeight.setVisible(false);
			welterWeight.setVisible(false);
			middleWeight.setVisible(false);
			lheavyWeight.setVisible(false);
			heavyWeight.setVisible(false);
			backArrow.setVisible(false);
			
			switch(CharacterSelect.charNum) {
			case 0:
				Player.setClass(6, 6, 6, 6, 6, 6, 6, 6, 7, "ALEX", "DUONG");
				break;
			case 1:
				Player.setClass(7, 7, 7, 7, 10, 2, 7, 1, 7, "JAMES", "DAO");
				break;
			case 2:
				Player.setClass(6, 6, 5, 5, 5, 5, 8, 8, 7, "KHOA", "DIEP");
				break;
			case 3:
				Player.setClass(9, 9, 9, 1, 7, 7, 5, 1, 7, "JIMMY", "TRAN");
				break;
			case 4:
				Player.setClass(6, 5, 7, 4, 4, 6, 6, 10, 7, "BEN", "GRAY");
				break;
			case 5:
				Player.setClass(8, 4, 6, 6, 6, 7, 10, 1, 7, "JOHN", "NGUYEN");
				break;
			case 6:
				Player.setClass(8, 5, 5, 5, 9, 6, 8, 2, 7, "ERIK", "NGUYEN");
				break;
			case 7:
				Player.setClass(4, 4, 8, 10, 10, 10, 1, 1, 7, "MICHAEL", "ADKISSON");
				break;
			case 8:
				Player.setClass(6, 2, 6, 5, 5, 10, 6, 8, 7, "HENRY", "HU");
				break;
			case 9:
				Player.setClass(10, 10, 10, 2, 2, 2, 6, 6, 7, "TYRONE", "FORD");
				break;
		}
			
			Fighter.fighterScreen();
		}
	}
	
	public static class HeavyScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();

			chooseWeight.setVisible(false);
			flyWeight.setVisible(false);
			bantamWeight.setVisible(false);
			featherWeight.setVisible(false);
			lightWeight.setVisible(false);
			welterWeight.setVisible(false);
			middleWeight.setVisible(false);
			lheavyWeight.setVisible(false);
			heavyWeight.setVisible(false);
			backArrow.setVisible(false);
			
			switch(CharacterSelect.charNum) {
			case 0:
				Player.setClass(6, 6, 6, 6, 6, 6, 6, 6, 8, "ALEX", "DUONG");
				break;
			case 1:
				Player.setClass(7, 7, 7, 7, 10, 2, 7, 1, 8, "JAMES", "DAO");
				break;
			case 2:
				Player.setClass(6, 6, 5, 5, 5, 5, 8, 8, 8, "KHOA", "DIEP");
				break;
			case 3:
				Player.setClass(9, 9, 9, 1, 7, 7, 5, 1, 8, "JIMMY", "TRAN");
				break;
			case 4:
				Player.setClass(6, 5, 7, 4, 4, 6, 6, 10, 8, "BEN", "GRAY");
				break;
			case 5:
				Player.setClass(8, 4, 6, 6, 6, 7, 10, 1, 8, "JOHN", "NGUYEN");
				break;
			case 6:
				Player.setClass(8, 5, 5, 5, 9, 6, 8, 2, 8, "ERIK", "NGUYEN");
				break;
			case 7:
				Player.setClass(4, 4, 8, 10, 10, 10, 1, 1, 8, "MICHAEL", "ADKISSON");
				break;
			case 8:
				Player.setClass(6, 2, 6, 5, 5, 10, 6, 8, 8, "HENRY", "HU");
				break;
			case 9:
				Player.setClass(10, 10, 10, 2, 2, 2, 6, 6, 8, "TYRONE", "FORD");
				break;
		}
			
			Fighter.fighterScreen();
		}
	}
	
	public static class BackScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();
			
			chooseWeight.setVisible(false);
			flyWeight.setVisible(false);
			bantamWeight.setVisible(false);
			featherWeight.setVisible(false);
			lightWeight.setVisible(false);
			welterWeight.setVisible(false);
			middleWeight.setVisible(false);
			lheavyWeight.setVisible(false);
			heavyWeight.setVisible(false);
			
			CharacterSelect.charNum = 0;
			logoUFC.setVisible(false);
			backArrow.setVisible(false);
			
			CharacterSelect.charSelectScreen();
		}
	}
}

