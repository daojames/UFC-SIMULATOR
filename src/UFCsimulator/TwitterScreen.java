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

public class TwitterScreen {
	
	static JPanel twitterLogo, back, tweet, line, dm, dms, followers;
	
	static JLabel lblTwitterLogo, lblDm, lblDms, lblFollowers;
	
	static JButton btnBack, btnTweet;
	
	static ImageIcon twitterIcon = new ImageIcon();
	
	static TwitterBackScreenHandler twitterBackHandler = new TwitterBackScreenHandler();
	static TwitterTweetScreenHandler tweetHandler = new TwitterTweetScreenHandler();
	
	public static void twitterScreen() {
		twitterLogo = new JPanel();
		twitterLogo.setBounds(462, 35, 100, 100);
		UFCgui.con.add(twitterLogo);
		twitterLogo.setVisible(true);
		
		try {
			twitterIcon = new ImageIcon(TwitterScreen.class.getResource("/UFCsimulator/resources/twitterLogo.png"));
			lblTwitterLogo = new JLabel(twitterIcon);
			twitterLogo.add(lblTwitterLogo);
		}
		catch(Exception e) {
			System.out.println("Image not found");
		}
		
		back = new JPanel();
		back.setBounds(412, 430, 200, 55);
		UFCgui.con.add(back);
		back.setVisible(true);
		
		btnBack = new JButton("BACK");
		btnBack.setPreferredSize(new Dimension(200, 50));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBack.setBackground(Color.white);
		btnBack.setFocusPainted(false);
		btnBack.addActionListener(twitterBackHandler);
		back.add(btnBack);
		
		
		tweet = new JPanel();
		tweet.setBounds(55, 233, 400, 105);
		UFCgui.con.add(tweet);
		tweet.setVisible(true);
		
		btnTweet = new JButton("TALK SHIT");
		btnTweet.setPreferredSize(new Dimension(400, 100));
		btnTweet.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnTweet.setBackground(Color.white);
		btnTweet.setToolTipText("<html><p style=\"text-align:left;\">$2500<br>+10000 FANS</p></html>");
		btnTweet.setFocusPainted(false);
		btnTweet.addActionListener(tweetHandler);
		tweet.add(btnTweet);
		if (Fighter.BalanceUFC.getBalance() < 2500) {
			btnTweet.setEnabled(false);
		}

		
		followers = new JPanel();
		followers.setBounds(55, 153, 400, 50);
		UFCgui.con.add(followers);
		followers.setVisible(true);
		
		lblFollowers = new JLabel("FOLLOWERS: " + Fighter.BalanceUFC.getTwitter());
		lblFollowers.setHorizontalAlignment(JLabel.CENTER);
		lblFollowers.setPreferredSize(new Dimension(400, 50));
		lblFollowers.setFont(new Font("Tahoma", Font.BOLD, 20));
		followers.add(lblFollowers);
		
		
		line = new JPanel();
		line.setBounds(510, 180, 4, 210);
		line.setBackground(Color.darkGray);
		UFCgui.con.add(line);
		line.setVisible(true);
		
		
		dm = new JPanel();
		dm.setBounds(680, 140, 175, 35);
		UFCgui.con.add(dm);
		dm.setVisible(true);
		
		lblDm = new JLabel("DIRECT MESSAGES");
		lblDm.setFont(new Font("Tahoma", Font.BOLD, 18));
		dm.add(lblDm);
		
		
		dms = new JPanel();
		dms.setBounds(565, 170, 500, 250);
		UFCgui.con.add(dms);
		dms.setVisible(true);
		
		if (FollowerCheck.mad[9][0] != null) {
			lblDms = new JLabel("<html><p style=\"text-align:left;\">@" + FollowerCheck.mad[0][0] + FollowerCheck.mad[0][1] + "MMA says: \"fight me bruh!\"<br>@"
																		+ FollowerCheck.mad[1][0] + FollowerCheck.mad[1][1] + "MMA says: \"square up!\"<br>@"
																		+ FollowerCheck.mad[2][0] + FollowerCheck.mad[2][1] + "MMA says: \"see u in the ring.\"<br>@"
																		+ FollowerCheck.mad[3][0] + FollowerCheck.mad[3][1] + "MMA says: \"ima knock u tf out!\"<br>@"
																		+ FollowerCheck.mad[4][0] + FollowerCheck.mad[4][1] + "MMA says: \"send location\"<br>@"
																		+ FollowerCheck.mad[5][0] + FollowerCheck.mad[5][1] + "MMA says: \"c u soon boi\"<br>@"
																		+ FollowerCheck.mad[6][0] + FollowerCheck.mad[6][1] + "MMA says: \"bitch.\"<br>@"
																		+ FollowerCheck.mad[7][0] + FollowerCheck.mad[7][1] + "MMA says: \"ima eat u bro.\"<br>@"
																		+ FollowerCheck.mad[8][0] + FollowerCheck.mad[8][1] + "MMA says: \"1st round ko.\"<br>@"
																		+ FollowerCheck.mad[9][0] + FollowerCheck.mad[9][1] + "MMA says: \"i luhh uuu\"<br></p></html>");
			lblDms.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblDms.setPreferredSize(new Dimension(500, 300));
			lblDms.setVerticalAlignment(JLabel.TOP);
			dms.add(lblDms);
		}
		else if (FollowerCheck.mad[8][0] != null) {
			lblDms = new JLabel("<html><p style=\"text-align:left;\">@" + FollowerCheck.mad[0][0] + FollowerCheck.mad[0][1] + "MMA says: \"fight me bruh!\"<br>@"
																		+ FollowerCheck.mad[1][0] + FollowerCheck.mad[1][1] + "MMA says: \"square up!\"<br>@"
																		+ FollowerCheck.mad[2][0] + FollowerCheck.mad[2][1] + "MMA says: \"see u in the ring.\"<br>@"
																		+ FollowerCheck.mad[3][0] + FollowerCheck.mad[3][1] + "MMA says: \"ima knock u tf out!\"<br>@"
																		+ FollowerCheck.mad[4][0] + FollowerCheck.mad[4][1] + "MMA says: \"send location\"<br>@"
																		+ FollowerCheck.mad[5][0] + FollowerCheck.mad[5][1] + "MMA says: \"c u soon boi\"<br>@"
																		+ FollowerCheck.mad[6][0] + FollowerCheck.mad[6][1] + "MMA says: \"bitch.\"<br>@"
																		+ FollowerCheck.mad[7][0] + FollowerCheck.mad[7][1] + "MMA says: \"ima eat u bro.\"<br>@"
																		+ FollowerCheck.mad[8][0] + FollowerCheck.mad[8][1] + "MMA says: \"1st round ko.\"<br></p></html>");
			lblDms.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblDms.setPreferredSize(new Dimension(500, 300));
			lblDms.setVerticalAlignment(JLabel.TOP);
			dms.add(lblDms);
		}
		else if (FollowerCheck.mad[7][0] != null) {
			lblDms = new JLabel("<html><p style=\"text-align:left;\">@" + FollowerCheck.mad[0][0] + FollowerCheck.mad[0][1] + "MMA says: \"fight me bruh!\"<br>@"
																		+ FollowerCheck.mad[1][0] + FollowerCheck.mad[1][1] + "MMA says: \"square up!\"<br>@"
																		+ FollowerCheck.mad[2][0] + FollowerCheck.mad[2][1] + "MMA says: \"see u in the ring.\"<br>@"
																		+ FollowerCheck.mad[3][0] + FollowerCheck.mad[3][1] + "MMA says: \"ima knock u tf out!\"<br>@"
																		+ FollowerCheck.mad[4][0] + FollowerCheck.mad[4][1] + "MMA says: \"send location\"<br>@"
																		+ FollowerCheck.mad[5][0] + FollowerCheck.mad[5][1] + "MMA says: \"c u soon boi\"<br>@"
																		+ FollowerCheck.mad[6][0] + FollowerCheck.mad[6][1] + "MMA says: \"bitch.\"<br>@"
																		+ FollowerCheck.mad[7][0] + FollowerCheck.mad[7][1] + "MMA says: \"ima eat u bro.\"<br></p></html>");
			lblDms.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblDms.setPreferredSize(new Dimension(500, 300));
			lblDms.setVerticalAlignment(JLabel.TOP);
			dms.add(lblDms);
		}
		else if (FollowerCheck.mad[6][0] != null) {
			lblDms = new JLabel("<html><p style=\"text-align:left;\">@" + FollowerCheck.mad[0][0] + FollowerCheck.mad[0][1] + "MMA says: \"fight me bruh!\"<br>@"
																		+ FollowerCheck.mad[1][0] + FollowerCheck.mad[1][1] + "MMA says: \"square up!\"<br>@"
																		+ FollowerCheck.mad[2][0] + FollowerCheck.mad[2][1] + "MMA says: \"see u in the ring.\"<br>@"
																		+ FollowerCheck.mad[3][0] + FollowerCheck.mad[3][1] + "MMA says: \"ima knock u tf out!\"<br>@"
																		+ FollowerCheck.mad[4][0] + FollowerCheck.mad[4][1] + "MMA says: \"send location\"<br>@"
																		+ FollowerCheck.mad[5][0] + FollowerCheck.mad[5][1] + "MMA says: \"c u soon boi\"<br>@"
																		+ FollowerCheck.mad[6][0] + FollowerCheck.mad[6][1] + "MMA says: \"bitch.\"<br></p></html>");
			lblDms.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblDms.setPreferredSize(new Dimension(500, 300));
			lblDms.setVerticalAlignment(JLabel.TOP);
			dms.add(lblDms);
		}
		else if (FollowerCheck.mad[5][0] != null) {
			lblDms = new JLabel("<html><p style=\"text-align:left;\">@" + FollowerCheck.mad[0][0] + FollowerCheck.mad[0][1] + "MMA says: \"fight me bruh!\"<br>@"
																		+ FollowerCheck.mad[1][0] + FollowerCheck.mad[1][1] + "MMA says: \"square up!\"<br>@"
																		+ FollowerCheck.mad[2][0] + FollowerCheck.mad[2][1] + "MMA says: \"see u in the ring.\"<br>@"
																		+ FollowerCheck.mad[3][0] + FollowerCheck.mad[3][1] + "MMA says: \"ima knock u tf out!\"<br>@"
																		+ FollowerCheck.mad[4][0] + FollowerCheck.mad[4][1] + "MMA says: \"send location\"<br>@"
																		+ FollowerCheck.mad[5][0] + FollowerCheck.mad[5][1] + "MMA says: \"c u soon boi\"<br></p></html>");
			lblDms.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblDms.setPreferredSize(new Dimension(500, 300));
			lblDms.setVerticalAlignment(JLabel.TOP);
			dms.add(lblDms);
		}
		else if (FollowerCheck.mad[4][0] != null) {
			lblDms = new JLabel("<html><p style=\"text-align:left;\">@" + FollowerCheck.mad[0][0] + FollowerCheck.mad[0][1] + "MMA says: \"fight me bruh!\"<br>@"
																		+ FollowerCheck.mad[1][0] + FollowerCheck.mad[1][1] + "MMA says: \"square up!\"<br>@"
																		+ FollowerCheck.mad[2][0] + FollowerCheck.mad[2][1] + "MMA says: \"see u in the ring.\"<br>@"
																		+ FollowerCheck.mad[3][0] + FollowerCheck.mad[3][1] + "MMA says: \"ima knock u tf out!\"<br>@"
																		+ FollowerCheck.mad[4][0] + FollowerCheck.mad[4][1] + "MMA says: \"send location\"<br></p></html>");
			lblDms.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblDms.setPreferredSize(new Dimension(500, 300));
			lblDms.setVerticalAlignment(JLabel.TOP);
			dms.add(lblDms);
		}
		else if (FollowerCheck.mad[3][0] != null) {
			lblDms = new JLabel("<html><p style=\"text-align:left;\">@" + FollowerCheck.mad[0][0] + FollowerCheck.mad[0][1] + "MMA says: \"fight me bruh!\"<br>@"
																		+ FollowerCheck.mad[1][0] + FollowerCheck.mad[1][1] + "MMA says: \"square up!\"<br>@"
																		+ FollowerCheck.mad[2][0] + FollowerCheck.mad[2][1] + "MMA says: \"see u in the ring.\"<br>@"
																		+ FollowerCheck.mad[3][0] + FollowerCheck.mad[3][1] + "MMA says: \"ima knock u tf out!\"<br></p></html>");
			lblDms.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblDms.setPreferredSize(new Dimension(500, 300));
			lblDms.setVerticalAlignment(JLabel.TOP);
			dms.add(lblDms);
		}
		else if (FollowerCheck.mad[2][0] != null) {
			lblDms = new JLabel("<html><p style=\"text-align:left;\">@" + FollowerCheck.mad[0][0] + FollowerCheck.mad[0][1] + "MMA says: \"fight me bruh!\"<br>@"
																		+ FollowerCheck.mad[1][0] + FollowerCheck.mad[1][1] + "MMA says: \"square up!\"<br>@"
																		+ FollowerCheck.mad[2][0] + FollowerCheck.mad[2][1] + "MMA says: \"see u in the ring.\"<br></p></html>");
			lblDms.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblDms.setPreferredSize(new Dimension(500, 300));
			lblDms.setVerticalAlignment(JLabel.TOP);
			dms.add(lblDms);
		}
		else if (FollowerCheck.mad[1][0] != null) {
			lblDms = new JLabel("<html><p style=\"text-align:left;\">@" + FollowerCheck.mad[0][0] + FollowerCheck.mad[0][1] + "MMA says: \"fight me bruh!              \"<br>@"
																		+ FollowerCheck.mad[1][0] + FollowerCheck.mad[1][1] + "MMA says: \"square up!                  \"<br>");
			lblDms.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblDms.setPreferredSize(new Dimension(500, 300));
			lblDms.setVerticalAlignment(JLabel.TOP);
			dms.add(lblDms);
		}
		else if (FollowerCheck.mad[0][0] != null) {
			lblDms = new JLabel("<html><p style=\"text-align:left;\">@" + FollowerCheck.mad[0][0] + FollowerCheck.mad[0][1] + "MMA says: \"fight me bruh!\"<br></p></html>");
			lblDms.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblDms.setPreferredSize(new Dimension(500, 300));
			lblDms.setVerticalAlignment(JLabel.TOP);
			dms.add(lblDms);
		}
		
		Fighter.lblMoney.setText("BALANCE: $" + Fighter.BalanceUFC.getBalance());
		Fighter.money.setVisible(true);
		
		Fighter.lblDate.setText(Fighter.MonthUFC.getMonth() + " " + Fighter.MonthUFC.getYear());
		Fighter.date.setVisible(true);
		
	}

	public static class TwitterBackScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();
			
			twitterLogo.setVisible(false);
			back.setVisible(false);
			tweet.setVisible(false);
			followers.setVisible(false);
			line.setVisible(false);
			dm.setVisible(false);
			dms.setVisible(false);
			Fighter.money.setVisible(false);
			Fighter.date.setVisible(false);
			
			
			Fighter.fighterScreen();
		}
	}
	
	public static class TwitterTweetScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();
			
			Fighter.BalanceUFC.addTwitter(10000);
			TwitterScreen.lblFollowers.setText("FOLLOWERS: " + Fighter.BalanceUFC.getTwitter());
			Fighter.BalanceUFC.subBalance(2500);
			Fighter.lblMoney.setText("BALANCE: $" + Fighter.BalanceUFC.getBalance());
			Fighter.BalanceUFC.calcClout();
			
			if (Fighter.BalanceUFC.getBalance() < 2500) {
				btnTweet.setEnabled(false);
			}
			
			FollowerCheck.followerCheck(Weight.Player.getWeight());

			if (FollowerCheck.mad[9][0] != null) {
				lblDms.setText("<html><p style=\"text-align:left;\">@" + FollowerCheck.mad[0][0] + FollowerCheck.mad[0][1] + "MMA says: \"fight me bruh!\"<br>@"
																			+ FollowerCheck.mad[1][0] + FollowerCheck.mad[1][1] + "MMA says: \"square up!\"<br>@"
																			+ FollowerCheck.mad[2][0] + FollowerCheck.mad[2][1] + "MMA says: \"see u in the ring.\"<br>@"
																			+ FollowerCheck.mad[3][0] + FollowerCheck.mad[3][1] + "MMA says: \"ima knock u tf out!\"<br>@"
																			+ FollowerCheck.mad[4][0] + FollowerCheck.mad[4][1] + "MMA says: \"send location\"<br>@"
																			+ FollowerCheck.mad[5][0] + FollowerCheck.mad[5][1] + "MMA says: \"c u soon boi\"<br>@"
																			+ FollowerCheck.mad[6][0] + FollowerCheck.mad[6][1] + "MMA says: \"bitch.\"<br>@"
																			+ FollowerCheck.mad[7][0] + FollowerCheck.mad[7][1] + "MMA says: \"ima eat u bro.\"<br>@"
																			+ FollowerCheck.mad[8][0] + FollowerCheck.mad[8][1] + "MMA says: \"1st round ko.\"<br>@"
																			+ FollowerCheck.mad[9][0] + FollowerCheck.mad[9][1] + "MMA says: \"i luhh uuu\"<br></p></html>");
			}
			else if (FollowerCheck.mad[8][0] != null) {
				lblDms.setText("<html><p style=\"text-align:left;\">@" + FollowerCheck.mad[0][0] + FollowerCheck.mad[0][1] + "MMA says: \"fight me bruh!\"<br>@"
																			+ FollowerCheck.mad[1][0] + FollowerCheck.mad[1][1] + "MMA says: \"square up!\"<br>@"
																			+ FollowerCheck.mad[2][0] + FollowerCheck.mad[2][1] + "MMA says: \"see u in the ring.\"<br>@"
																			+ FollowerCheck.mad[3][0] + FollowerCheck.mad[3][1] + "MMA says: \"ima knock u tf out!\"<br>@"
																			+ FollowerCheck.mad[4][0] + FollowerCheck.mad[4][1] + "MMA says: \"send location\"<br>@"
																			+ FollowerCheck.mad[5][0] + FollowerCheck.mad[5][1] + "MMA says: \"c u soon boi\"<br>@"
																			+ FollowerCheck.mad[6][0] + FollowerCheck.mad[6][1] + "MMA says: \"bitch.\"<br>@"
																			+ FollowerCheck.mad[7][0] + FollowerCheck.mad[7][1] + "MMA says: \"ima eat u bro.\"<br>@"
																			+ FollowerCheck.mad[8][0] + FollowerCheck.mad[8][1] + "MMA says: \"1st round ko.\"<br></p></html>");
				lblDms.setFont(new Font("Tahoma", Font.PLAIN, 18));
				lblDms.setPreferredSize(new Dimension(500, 300));
				lblDms.setVerticalAlignment(JLabel.TOP);
				dms.add(lblDms);
			}
			else if (FollowerCheck.mad[7][0] != null) {
				lblDms.setText("<html><p style=\"text-align:left;\">@" + FollowerCheck.mad[0][0] + FollowerCheck.mad[0][1] + "MMA says: \"fight me bruh!\"<br>@"
																			+ FollowerCheck.mad[1][0] + FollowerCheck.mad[1][1] + "MMA says: \"square up!\"<br>@"
																			+ FollowerCheck.mad[2][0] + FollowerCheck.mad[2][1] + "MMA says: \"see u in the ring.\"<br>@"
																			+ FollowerCheck.mad[3][0] + FollowerCheck.mad[3][1] + "MMA says: \"ima knock u tf out!\"<br>@"
																			+ FollowerCheck.mad[4][0] + FollowerCheck.mad[4][1] + "MMA says: \"send location\"<br>@"
																			+ FollowerCheck.mad[5][0] + FollowerCheck.mad[5][1] + "MMA says: \"c u soon boi\"<br>@"
																			+ FollowerCheck.mad[6][0] + FollowerCheck.mad[6][1] + "MMA says: \"bitch.\"<br>@"
																			+ FollowerCheck.mad[7][0] + FollowerCheck.mad[7][1] + "MMA says: \"ima eat u bro.\"<br></p></html>");
			}
			else if (FollowerCheck.mad[6][0] != null) {
				lblDms.setText("<html><p style=\"text-align:left;\">@" + FollowerCheck.mad[0][0] + FollowerCheck.mad[0][1] + "MMA says: \"fight me bruh!\"<br>@"
																			+ FollowerCheck.mad[1][0] + FollowerCheck.mad[1][1] + "MMA says: \"square up!\"<br>@"
																			+ FollowerCheck.mad[2][0] + FollowerCheck.mad[2][1] + "MMA says: \"see u in the ring.\"<br>@"
																			+ FollowerCheck.mad[3][0] + FollowerCheck.mad[3][1] + "MMA says: \"ima knock u tf out!\"<br>@"
																			+ FollowerCheck.mad[4][0] + FollowerCheck.mad[4][1] + "MMA says: \"send location\"<br>@"
																			+ FollowerCheck.mad[5][0] + FollowerCheck.mad[5][1] + "MMA says: \"c u soon boi\"<br>@"
																			+ FollowerCheck.mad[6][0] + FollowerCheck.mad[6][1] + "MMA says: \"bitch.\"<br></p></html>");
			}
			else if (FollowerCheck.mad[5][0] != null) {
				lblDms.setText("<html><p style=\"text-align:left;\">@" + FollowerCheck.mad[0][0] + FollowerCheck.mad[0][1] + "MMA says: \"fight me bruh!\"<br>@"
																			+ FollowerCheck.mad[1][0] + FollowerCheck.mad[1][1] + "MMA says: \"square up!\"<br>@"
																			+ FollowerCheck.mad[2][0] + FollowerCheck.mad[2][1] + "MMA says: \"see u in the ring.\"<br>@"
																			+ FollowerCheck.mad[3][0] + FollowerCheck.mad[3][1] + "MMA says: \"ima knock u tf out!\"<br>@"
																			+ FollowerCheck.mad[4][0] + FollowerCheck.mad[4][1] + "MMA says: \"send location\"<br>@"
																			+ FollowerCheck.mad[5][0] + FollowerCheck.mad[5][1] + "MMA says: \"c u soon boi\"<br></p></html>");
			}
			else if (FollowerCheck.mad[4][0] != null) {
				lblDms.setText("<html><p style=\"text-align:left;\">@" + FollowerCheck.mad[0][0] + FollowerCheck.mad[0][1] + "MMA says: \"fight me bruh!\"<br>@"
																			+ FollowerCheck.mad[1][0] + FollowerCheck.mad[1][1] + "MMA says: \"square up!\"<br>@"
																			+ FollowerCheck.mad[2][0] + FollowerCheck.mad[2][1] + "MMA says: \"see u in the ring.\"<br>@"
																			+ FollowerCheck.mad[3][0] + FollowerCheck.mad[3][1] + "MMA says: \"ima knock u tf out!\"<br>@"
																			+ FollowerCheck.mad[4][0] + FollowerCheck.mad[4][1] + "MMA says: \"send location\"<br></p></html>");
			}
			else if (FollowerCheck.mad[3][0] != null) {
				lblDms.setText("<html><p style=\"text-align:left;\">@" + FollowerCheck.mad[0][0] + FollowerCheck.mad[0][1] + "MMA says: \"fight me bruh!\"<br>@"
																			+ FollowerCheck.mad[1][0] + FollowerCheck.mad[1][1] + "MMA says: \"square up!\"<br>@"
																			+ FollowerCheck.mad[2][0] + FollowerCheck.mad[2][1] + "MMA says: \"see u in the ring.\"<br>@"
																			+ FollowerCheck.mad[3][0] + FollowerCheck.mad[3][1] + "MMA says: \"ima knock u tf out!\"<br></p></html>");
			}
			else if (FollowerCheck.mad[2][0] != null) {
				lblDms.setText("<html><p style=\"text-align:left;\">@" + FollowerCheck.mad[0][0] + FollowerCheck.mad[0][1] + "MMA says: \"fight me bruh!\"<br>@"
																			+ FollowerCheck.mad[1][0] + FollowerCheck.mad[1][1] + "MMA says: \"square up!\"<br>@"
																			+ FollowerCheck.mad[2][0] + FollowerCheck.mad[2][1] + "MMA says: \"see u in the ring.\"<br></p></html>");
			}
			else if (FollowerCheck.mad[1][0] != null) {
				lblDms.setText("<html><p style=\"text-align:left;\">@" + FollowerCheck.mad[0][0] + FollowerCheck.mad[0][1] + "MMA says: \"fight me bruh!\"<br>@"
																			+ FollowerCheck.mad[1][0] + FollowerCheck.mad[1][1] + "MMA says: \"square up!\"<br>");
			}
			else if (FollowerCheck.mad[0][0] != null) {
				lblDms.setText("<html><p style=\"text-align:left;\">@" + FollowerCheck.mad[0][0] + FollowerCheck.mad[0][1] + "MMA says: \"fight me bruh!\"<br></p></html>");
			}
			
			Fighter.MonthUFC.incMonth();
			Fighter.lblDate.setText(Fighter.MonthUFC.getMonth() + " " + Fighter.MonthUFC.getYear());
		}
	}
}
