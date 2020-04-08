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

public class Fighter {
	
	static MonthClass MonthUFC = new MonthClass();
	static BalanceClass BalanceUFC = new BalanceClass();
	
	static String charFile;
	
	static JPanel lobby, twitter, gym, division, money, date, overviewFace, overview, overviewNum, record, name, info;
	
	static JLabel lblLobby, lblMoney, lblDate, lblOverviewFace, lblOverview, lblOverviewNum, lblRecord, lblName, lblInfo;
	
	static JButton btnTwitter, btnGym, btnDivision;
	
	static ImageIcon overviewPic;
	
	static TwitterScreenHandler twitterHandler = new TwitterScreenHandler();
	static GymScreenHandler gymHandler = new GymScreenHandler();
	static CareerScreenHandler careerHandler = new CareerScreenHandler();
	
	static Boolean first1 = true;
	
	public static void fighterScreen() {
		
		FollowerCheck.followerCheck(Weight.Player.getWeight());
		
		if (first1 == true) {
		CreateFighter.createFighter();
		first1 = false;
		}
		BalanceUFC.calcClout();
		
		switch (CharacterSelect.charNum) {
			case 0:
				charFile = "/UFCsimulator/resources/faces/alexFace.png";
				break;
			case 1:
				charFile = "/UFCsimulator/resources/faces/jamesFace.png";
				break;
			case 2:
				charFile = "/UFCsimulator/resources/faces/khoaFace.png";
				break;
			case 3:
				charFile = "/UFCsimulator/resources/faces/jimmyFace.png";
				break;
			case 4:
				charFile = "/UFCsimulator/resources/faces/benFace.png";
				break;
			case 5:
				charFile = "/UFCsimulator/resources/faces/johnFace.png";
				break;
			case 6:
				charFile = "/UFCsimulator/resources/faces/erikFace.png";
				break;
			case 7:
				charFile = "/UFCsimulator/resources/faces/michaelFace.png";
				break;
			case 8:
				charFile = "/UFCsimulator/resources/faces/henryFace.png";
				break;
			case 9:
				charFile = "/UFCsimulator/resources/faces/elFace.png";
				break;
		}
		
		String weight = null;
		
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
		
		FollowerCheck.followerCheck(Weight.Player.getWeight());
		
		lobby = new JPanel();
		lobby.setBounds(0, 0, 1024, 35);
		UFCgui.con.add(lobby);
		lobby.setVisible(true);
		
		lblLobby = new JLabel("UFC SIMULATOR");
		lblLobby.setFont(new Font("Tahoma", Font.BOLD, 28));
		lobby.add(lblLobby);
		
		
		overview = new JPanel();
		overview.setBounds(500, 130, 110, 250);
		UFCgui.con.add(overview);
		overview.setVisible(true);
		
		lblOverview = new JLabel("<html><p style=\"text-align:right;\">STRENGTH<br>SPEED<br>STAMINA<br>CHIN<br>STRIKING<br>WRESTLING<br>IQ<br>LUCK<br></p></html>");
		lblOverview.setHorizontalAlignment(JLabel.TRAILING);
		lblOverview.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblOverview.setPreferredSize(new Dimension(110, 250));
		overview.add(lblOverview);
		
		overviewNum = new JPanel();
		overviewNum.setBounds(550, 130, 130, 250);
		UFCgui.con.add(overviewNum);
		overviewNum.setVisible(true);
		
		lblOverviewNum = new JLabel("<html><p style=\"text-align:left;\">" + Weight.Player.getStr() + "<br>" + Weight.Player.getSpd() + "<br>" + Weight.Player.getStm() + "<br>" + Weight.Player.getChin() + "<br>" + Weight.Player.getStrk() + "<br>" + Weight.Player.getWrst() + "<br>" + Weight.Player.getIq() + "<br>" + Weight.Player.getLuck() + "</p></html>");
		lblOverviewNum.setHorizontalAlignment(JLabel.TRAILING);
		lblOverviewNum.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblOverviewNum.setPreferredSize(new Dimension(130, 250));
		overviewNum.add(lblOverviewNum);
		
		
		record = new JPanel();
		record.setBounds(412, 365, 200, 55);
		UFCgui.con.add(record);
		record.setVisible(true);
		
		lblRecord = new JLabel();
		lblRecord.setText(Weight.Player.getWin() + " - " + Weight.Player.getLoss());
		lblRecord.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblRecord.setPreferredSize(new Dimension(200, 55));
		lblRecord.setHorizontalAlignment(JLabel.CENTER);
		record.add(lblRecord);
		
		
		overviewFace = new JPanel();
		overviewFace.setBounds(250, 140, 260, 260);
		UFCgui.con.add(overviewFace);
		overviewFace.setVisible(true);
		
		try {
			overviewPic = new ImageIcon(Fighter.class.getResource(charFile));
			lblOverviewFace = new JLabel(overviewPic);
			overviewFace.add(lblOverviewFace);
		}
		catch(Exception e) {
			System.out.println("Image not found");
		}
		
		
		date = new JPanel();
		date.setBounds(585, 495, 400, 35);
		UFCgui.con.add(date);
		
		lblDate = new JLabel();
		lblDate.setText(Fighter.MonthUFC.getMonth() + " " + Fighter.MonthUFC.getYear());
		lblDate.setHorizontalAlignment(JLabel.RIGHT);
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblDate.setPreferredSize(new Dimension(400, 35));
		date.add(lblDate);
		date.setVisible(true);
		
		
		money = new JPanel();
		money.setBounds(30, 495, 400, 35);
		UFCgui.con.add(money);
		
		lblMoney = new JLabel();
		lblMoney.setText("BALANCE: $" + BalanceUFC.getBalance());
		lblMoney.setHorizontalAlignment(JLabel.LEFT);
		lblMoney.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblMoney.setPreferredSize(new Dimension(400, 35));
		money.add(lblMoney);
		money.setVisible(true);
		
		
		twitter = new JPanel();
		twitter.setBounds(112, 430, 200, 55);
		UFCgui.con.add(twitter);
		twitter.setVisible(true);
		
		btnTwitter = new JButton("TWITTER");
		btnTwitter.setPreferredSize(new Dimension(200, 50));
		btnTwitter.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnTwitter.setBackground(Color.white);
		btnTwitter.setFocusPainted(false);
		btnTwitter.addActionListener(twitterHandler);
		twitter.add(btnTwitter);
		
		
		gym = new JPanel();
		gym.setBounds(412, 430, 200, 55);
		UFCgui.con.add(gym);
		gym.setVisible(true);
		
		btnGym = new JButton("GYM");
		btnGym.setPreferredSize(new Dimension(200, 50));
		btnGym.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnGym.setBackground(Color.white);
		btnGym.setFocusPainted(false);
		btnGym.addActionListener(gymHandler);
		gym.add(btnGym);
		
		
		division = new JPanel();
		division.setBounds(712, 430, 200, 55);
		UFCgui.con.add(division);
		division.setVisible(true);
		
		btnDivision = new JButton("CAREER");
		btnDivision.setPreferredSize(new Dimension(200, 50));
		btnDivision.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDivision.setBackground(Color.white);
		btnDivision.setFocusPainted(false);
		btnDivision.addActionListener(careerHandler);
		division.add(btnDivision);
		
		
		name = new JPanel();
		name.setBounds(24, 35, 976, 60);
		UFCgui.con.add(name);
		name.setVisible(true);
		
		lblName = new JLabel(Weight.Player.first + " " + Weight.Player.last);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 50));
		name.add(lblName);
		
		
		info = new JPanel();
		info.setBounds(24, 90, 976, 60);
		UFCgui.con.add(info);
		info.setVisible(true);
		
		lblInfo = new JLabel(Weight.Player.country + "     " + weight);
		lblInfo.setFont(new Font("Tahoma", Font.BOLD, 30));
		info.add(lblInfo);
	}

	public static class TwitterScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();
			
			twitter.setVisible(false);
			gym.setVisible(false);
			division.setVisible(false);
			overviewFace.setVisible(false);
			overview.setVisible(false);
			overviewNum.setVisible(false);
			record.setVisible(false);
			money.setVisible(false);
			date.setVisible(false);
			name.setVisible(false);
			info.setVisible(false);
			
			FollowerCheck.followerCheck(Weight.Player.getWeight());
			
			TwitterScreen.twitterScreen();
		}
	}
	
	public static class GymScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();
			
			twitter.setVisible(false);
			gym.setVisible(false);
			division.setVisible(false);
			overviewFace.setVisible(false);
			overview.setVisible(false);
			overviewNum.setVisible(false);
			record.setVisible(false);
			name.setVisible(false);
			info.setVisible(false);
			
			GymScreen.gymScreen();
		}
	}
	
	public static class CareerScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();
			
			twitter.setVisible(false);
			gym.setVisible(false);
			division.setVisible(false);
			overviewFace.setVisible(false);
			overview.setVisible(false);
			overviewNum.setVisible(false);
			record.setVisible(false);
			name.setVisible(false);
			info.setVisible(false);
			
			CareerScreen.careerScreen();
		}
	}
}