package UFCsimulator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class CareerScreen {

	static JPanel rankings, back, sponsor, win, loss, winKO, winTKO, winSub, winD, lossKO, lossTKO, lossSub, lossD, win1, win2, win3, win4, win5, loss1, loss2, loss3, loss4, loss5, beltDef, winStreak;
	
	static JLabel lblRankings, lblWin, lblLoss, lblWin1_1_1, lblLoss1_1_1, lblWinKO, lblWinTKO, lblWinSub, lblWinD, lblLossKO, lblLossTKO, lblLossSub, lblLossD, lblWin1, lblWin2, lblWin3, lblWin4, lblWin5, lblLoss1, lblLoss2, lblLoss3, lblLoss4, lblLoss5, lblBeltDef, lblWinStreak;
	static JLabel lblWinKO1, lblWinTKO1, lblWinSub1, lblWinD1, lblLossKO1, lblLossTKO1, lblLossSub1, lblLossD1, lblWin1_1, lblWin2_1, lblWin3_1, lblWin4_1, lblWin5_1, lblLoss1_1, lblLoss2_1, lblLoss3_1, lblLoss4_1, lblLoss5_1, lblBeltDef_1, lblWinStreak_1;
	
	static JButton btnPos0, btnPos1, btnPos2, btnPos3, btnPos4, btnPos5, btnPos6, btnPos7, btnPos8, btnPos9, btnPos10, btnBack, btnSponsor;
	
	static Color gold = new Color(230, 190, 138);
	
	static CareerBackScreenHandler careerBackHandler = new CareerBackScreenHandler();
	static CareerSponsorScreenHandler careerSponsorHandler = new CareerSponsorScreenHandler();
	static pos0ScreenHandler pos0Handler = new pos0ScreenHandler();
	static pos1ScreenHandler pos1Handler = new pos1ScreenHandler();
	static pos2ScreenHandler pos2Handler = new pos2ScreenHandler();
	static pos3ScreenHandler pos3Handler = new pos3ScreenHandler();
	static pos4ScreenHandler pos4Handler = new pos4ScreenHandler();
	static pos5ScreenHandler pos5Handler = new pos5ScreenHandler();
	static pos6ScreenHandler pos6Handler = new pos6ScreenHandler();
	static pos7ScreenHandler pos7Handler = new pos7ScreenHandler();
	static pos8ScreenHandler pos8Handler = new pos8ScreenHandler();
	static pos9ScreenHandler pos9Handler = new pos9ScreenHandler();
	static pos10ScreenHandler pos10Handler = new pos10ScreenHandler();
	
	static Boolean first = true;
	
	public static void careerScreen() {
		
		//FollowerCheck.followerCheck(Weight.Player.getWeight());

		if (first == true) {
			PositionCheck.positionCheck();
			first = false;
		}
		else {
			
		}
		
		String weight = null;
		
		if (Weight.Player.getWeight() == 1) {
			weight = "Flyweight Division";
		}
		else if (Weight.Player.getWeight() == 2) {
			weight = "Bantamweight Division";
		}
		else if (Weight.Player.getWeight() == 3) {
			weight = "Featherweight Division";
		}
		else if (Weight.Player.getWeight() == 4) {
			weight = "Lightweight Division";
		}
		else if (Weight.Player.getWeight() == 5) {
			weight = "Welterweight Division";
		}
		else if (Weight.Player.getWeight() == 6) {
			weight = "Middleweight Division";
		}
		else if (Weight.Player.getWeight() == 7) {
			weight = "Light Heavyweight Division";
		}
		else if (Weight.Player.getWeight() == 8) {
			weight = "Heavyweight Division";
		}
		
		
		win = new JPanel();
		win.setBounds(45, 58, 100, 60);
		UFCgui.con.add(win);
		win.setVisible(true);
		
		lblWin1_1_1 = new JLabel("WINS");
		lblWin1_1_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblWin1_1_1.setPreferredSize(new Dimension(100, 10));
		lblWin1_1_1.setHorizontalAlignment(JLabel.CENTER);
		win.add(lblWin1_1_1);

		lblWin = new JLabel(String.valueOf(Weight.Player.win));
		lblWin.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblWin.setPreferredSize(new Dimension(100, 40));
		lblWin.setHorizontalAlignment(JLabel.CENTER);
		win.add(lblWin);
		
		
		winKO = new JPanel();
		winKO.setBounds(160, 58, 100, 60);
		UFCgui.con.add(winKO);
		winKO.setVisible(true);
		
		lblWinKO1 = new JLabel("WINS BY KO");
		lblWinKO1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblWinKO1.setPreferredSize(new Dimension(100, 10));
		lblWinKO1.setHorizontalAlignment(JLabel.CENTER);
		winKO.add(lblWinKO1);

		lblWinKO = new JLabel(String.valueOf(Weight.Player.winKO));
		lblWinKO.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblWinKO.setPreferredSize(new Dimension(100, 40));
		lblWinKO.setHorizontalAlignment(JLabel.CENTER);
		winKO.add(lblWinKO);
		
		
		winTKO = new JPanel();
		winTKO.setBounds(275, 58, 100, 60);
		UFCgui.con.add(winTKO);
		winTKO.setVisible(true);
		
		lblWinTKO1 = new JLabel("WINS BY TKO");
		lblWinTKO1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblWinTKO1.setPreferredSize(new Dimension(100, 10));
		lblWinTKO1.setHorizontalAlignment(JLabel.CENTER);
		winTKO.add(lblWinTKO1);

		lblWinTKO = new JLabel(String.valueOf(Weight.Player.winTKO));
		lblWinTKO.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblWinTKO.setPreferredSize(new Dimension(100, 40));
		lblWinTKO.setHorizontalAlignment(JLabel.CENTER);
		winTKO.add(lblWinTKO);
		
		
		winSub = new JPanel();
		winSub.setBounds(390, 58, 100, 60);
		UFCgui.con.add(winSub);
		winSub.setVisible(true);
		
		lblWinSub1 = new JLabel("WINS BY SUB.");
		lblWinSub1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblWinSub1.setPreferredSize(new Dimension(100, 10));
		lblWinSub1.setHorizontalAlignment(JLabel.CENTER);
		winSub.add(lblWinSub1);

		lblWinSub = new JLabel(String.valueOf(Weight.Player.winSub));
		lblWinSub.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblWinSub.setPreferredSize(new Dimension(100, 40));
		lblWinSub.setHorizontalAlignment(JLabel.CENTER);
		winSub.add(lblWinSub);
		
		
		winD = new JPanel();
		winD.setBounds(505, 58, 100, 60);
		UFCgui.con.add(winD);
		winD.setVisible(true);
		
		lblWinD1 = new JLabel("WINS BY DEC.");
		lblWinD1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblWinD1.setPreferredSize(new Dimension(100, 10));
		lblWinD1.setHorizontalAlignment(JLabel.CENTER);
		winD.add(lblWinD1);

		lblWinD = new JLabel(String.valueOf(Weight.Player.winD));
		lblWinD.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblWinD.setPreferredSize(new Dimension(100, 40));
		lblWinD.setHorizontalAlignment(JLabel.CENTER);
		winD.add(lblWinD);
		
		
		loss = new JPanel();
		loss.setBounds(45, 130, 100, 60);
		UFCgui.con.add(loss);
		loss.setVisible(true);
		
		lblLoss1_1_1 = new JLabel("LOSSES");
		lblLoss1_1_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblLoss1_1_1.setPreferredSize(new Dimension(100, 10));
		lblLoss1_1_1.setHorizontalAlignment(JLabel.CENTER);
		loss.add(lblLoss1_1_1);

		lblLoss = new JLabel(String.valueOf(Weight.Player.loss));
		lblLoss.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblLoss.setPreferredSize(new Dimension(100, 40));
		lblLoss.setHorizontalAlignment(JLabel.CENTER);
		loss.add(lblLoss);
		
		
		lossKO = new JPanel();
		lossKO.setBounds(160, 130, 100, 60);
		UFCgui.con.add(lossKO);
		lossKO.setVisible(true);
		
		lblLossKO1 = new JLabel("LOSSES BY KO");
		lblLossKO1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblLossKO1.setPreferredSize(new Dimension(100, 10));
		lblLossKO1.setHorizontalAlignment(JLabel.CENTER);
		lossKO.add(lblLossKO1);

		lblLossKO = new JLabel(String.valueOf(Weight.Player.lossKO));
		lblLossKO.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblLossKO.setPreferredSize(new Dimension(100, 40));
		lblLossKO.setHorizontalAlignment(JLabel.CENTER);
		lossKO.add(lblLossKO);
		
		
		lossTKO = new JPanel();
		lossTKO.setBounds(275, 130, 100, 60);
		UFCgui.con.add(lossTKO);
		lossTKO.setVisible(true);
		
		lblLossTKO1 = new JLabel("LOSSES BY TKO");
		lblLossTKO1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblLossTKO1.setPreferredSize(new Dimension(100, 10));
		lblLossTKO1.setHorizontalAlignment(JLabel.CENTER);
		lossTKO.add(lblLossTKO1);

		lblLossTKO = new JLabel(String.valueOf(Weight.Player.lossTKO));
		lblLossTKO.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblLossTKO.setPreferredSize(new Dimension(100, 40));
		lblLossTKO.setHorizontalAlignment(JLabel.CENTER);
		lossTKO.add(lblLossTKO);
		
		
		lossSub = new JPanel();
		lossSub.setBounds(390, 130, 100, 60);
		UFCgui.con.add(lossSub);
		lossSub.setVisible(true);
		
		lblLossSub1 = new JLabel("LOSSES BY SUB.");
		lblLossSub1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblLossSub1.setPreferredSize(new Dimension(100, 10));
		lblLossSub1.setHorizontalAlignment(JLabel.CENTER);
		lossSub.add(lblLossSub1);

		lblLossSub = new JLabel(String.valueOf(Weight.Player.lossSub));
		lblLossSub.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblLossSub.setPreferredSize(new Dimension(100, 40));
		lblLossSub.setHorizontalAlignment(JLabel.CENTER);
		lossSub.add(lblLossSub);
		
		
		lossD = new JPanel();
		lossD.setBounds(505, 130, 100, 60);
		UFCgui.con.add(lossD);
		lossD.setVisible(true);
		
		lblLossD1 = new JLabel("LOSSES BY DEC.");
		lblLossD1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblLossD1.setPreferredSize(new Dimension(100, 10));
		lblLossD1.setHorizontalAlignment(JLabel.CENTER);
		lossD.add(lblLossD1);

		lblLossD = new JLabel(String.valueOf(Weight.Player.lossD));
		lblLossD.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblLossD.setPreferredSize(new Dimension(100, 40));
		lblLossD.setHorizontalAlignment(JLabel.CENTER);
		lossD.add(lblLossD);
		
		
		win1 = new JPanel();
		win1.setBounds(45, 202, 100, 60);
		UFCgui.con.add(win1);
		win1.setVisible(true);
		
		lblWin1_1 = new JLabel("R. 1 FINISHES");
		lblWin1_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblWin1_1.setPreferredSize(new Dimension(100, 10));
		lblWin1_1.setHorizontalAlignment(JLabel.CENTER);
		win1.add(lblWin1_1);

		lblWin1 = new JLabel(String.valueOf(Weight.Player.win1));
		lblWin1.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblWin1.setPreferredSize(new Dimension(100, 40));
		lblWin1.setHorizontalAlignment(JLabel.CENTER);
		win1.add(lblWin1);
		
		
		win2 = new JPanel();
		win2.setBounds(160, 202, 100, 60);
		UFCgui.con.add(win2);
		win2.setVisible(true);
		
		lblWin2_1 = new JLabel("R. 2 FINISHES");
		lblWin2_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblWin2_1.setPreferredSize(new Dimension(100, 10));
		lblWin2_1.setHorizontalAlignment(JLabel.CENTER);
		win2.add(lblWin2_1);

		lblWin2 = new JLabel(String.valueOf(Weight.Player.win2));
		lblWin2.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblWin2.setPreferredSize(new Dimension(100, 40));
		lblWin2.setHorizontalAlignment(JLabel.CENTER);
		win2.add(lblWin2);
		
		
		win3 = new JPanel();
		win3.setBounds(275, 202, 100, 60);
		UFCgui.con.add(win3);
		win3.setVisible(true);
		
		lblWin3_1 = new JLabel("R. 3 FINISHES");
		lblWin3_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblWin3_1.setPreferredSize(new Dimension(100, 10));
		lblWin3_1.setHorizontalAlignment(JLabel.CENTER);
		win3.add(lblWin3_1);

		lblWin3 = new JLabel(String.valueOf(Weight.Player.win3));
		lblWin3.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblWin3.setPreferredSize(new Dimension(100, 40));
		lblWin3.setHorizontalAlignment(JLabel.CENTER);
		win3.add(lblWin3);
		
		
		win4 = new JPanel();
		win4.setBounds(390, 202, 100, 60);
		UFCgui.con.add(win4);
		win4.setVisible(true);
		
		lblWin4_1 = new JLabel("R. 4 FINISHES");
		lblWin4_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblWin4_1.setPreferredSize(new Dimension(100, 10));
		lblWin4_1.setHorizontalAlignment(JLabel.CENTER);
		win4.add(lblWin4_1);

		lblWin4 = new JLabel(String.valueOf(Weight.Player.win4));
		lblWin4.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblWin4.setPreferredSize(new Dimension(100, 40));
		lblWin4.setHorizontalAlignment(JLabel.CENTER);
		win4.add(lblWin4);
		
		
		win5 = new JPanel();
		win5.setBounds(505, 202, 100, 60);
		UFCgui.con.add(win5);
		win5.setVisible(true);
		
		lblWin5_1 = new JLabel("R. 5 FINISHES");
		lblWin5_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblWin5_1.setPreferredSize(new Dimension(100, 10));
		lblWin5_1.setHorizontalAlignment(JLabel.CENTER);
		win5.add(lblWin5_1);

		lblWin5 = new JLabel(String.valueOf(Weight.Player.win5));
		lblWin5.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblWin5.setPreferredSize(new Dimension(100, 40));
		lblWin5.setHorizontalAlignment(JLabel.CENTER);
		win5.add(lblWin5);
		
		
		loss1 = new JPanel();
		loss1.setBounds(45, 274, 100, 60);
		UFCgui.con.add(loss1);
		loss1.setVisible(true);
		
		lblLoss1_1 = new JLabel("R. 1 LOSSES");
		lblLoss1_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblLoss1_1.setPreferredSize(new Dimension(100, 10));
		lblLoss1_1.setHorizontalAlignment(JLabel.CENTER);
		loss1.add(lblLoss1_1);

		lblLoss1 = new JLabel(String.valueOf(Weight.Player.loss1));
		lblLoss1.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblLoss1.setPreferredSize(new Dimension(100, 40));
		lblLoss1.setHorizontalAlignment(JLabel.CENTER);
		loss1.add(lblLoss1);
		
		
		loss2 = new JPanel();
		loss2.setBounds(160, 274, 100, 60);
		UFCgui.con.add(loss2);
		loss2.setVisible(true);
		
		lblLoss2_1 = new JLabel("R. 2 LOSSES");
		lblLoss2_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblLoss2_1.setPreferredSize(new Dimension(100, 10));
		lblLoss2_1.setHorizontalAlignment(JLabel.CENTER);
		loss2.add(lblLoss2_1);

		lblLoss2 = new JLabel(String.valueOf(Weight.Player.loss2));
		lblLoss2.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblLoss2.setPreferredSize(new Dimension(100, 40));
		lblLoss2.setHorizontalAlignment(JLabel.CENTER);
		loss2.add(lblLoss2);
		
		
		loss3 = new JPanel();
		loss3.setBounds(275, 274, 100, 60);
		UFCgui.con.add(loss3);
		loss3.setVisible(true);
		
		lblLoss3_1 = new JLabel("R. 3 LOSSES");
		lblLoss3_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblLoss3_1.setPreferredSize(new Dimension(100, 10));
		lblLoss3_1.setHorizontalAlignment(JLabel.CENTER);
		loss3.add(lblLoss3_1);

		lblLoss3 = new JLabel(String.valueOf(Weight.Player.loss3));
		lblLoss3.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblLoss3.setPreferredSize(new Dimension(100, 40));
		lblLoss3.setHorizontalAlignment(JLabel.CENTER);
		loss3.add(lblLoss3);
		
		
		loss4 = new JPanel();
		loss4.setBounds(390, 274, 100, 60);
		UFCgui.con.add(loss4);
		loss4.setVisible(true);
		
		lblLoss4_1 = new JLabel("R. 4 LOSSES");
		lblLoss4_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblLoss4_1.setPreferredSize(new Dimension(100, 10));
		lblLoss4_1.setHorizontalAlignment(JLabel.CENTER);
		loss4.add(lblLoss4_1);

		lblLoss4 = new JLabel(String.valueOf(Weight.Player.loss4));
		lblLoss4.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblLoss4.setPreferredSize(new Dimension(100, 40));
		lblLoss4.setHorizontalAlignment(JLabel.CENTER);
		loss4.add(lblLoss4);
		
		
		loss5 = new JPanel();
		loss5.setBounds(505, 274, 100, 60);
		UFCgui.con.add(loss5);
		loss5.setVisible(true);
		
		lblLoss5_1 = new JLabel("R. 5 LOSSES");
		lblLoss5_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblLoss5_1.setPreferredSize(new Dimension(100, 10));
		lblLoss5_1.setHorizontalAlignment(JLabel.CENTER);
		loss5.add(lblLoss5_1);

		lblLoss5 = new JLabel(String.valueOf(Weight.Player.loss5));
		lblLoss5.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblLoss5.setPreferredSize(new Dimension(100, 40));
		lblLoss5.setHorizontalAlignment(JLabel.CENTER);
		loss5.add(lblLoss5);
		
		
		winStreak = new JPanel();
		winStreak.setBounds(275, 346, 100, 60);
		UFCgui.con.add(winStreak);
		winStreak.setVisible(true);
		
		lblWinStreak_1 = new JLabel("WIN STREAK");
		lblWinStreak_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblWinStreak_1.setPreferredSize(new Dimension(100, 10));
		lblWinStreak_1.setHorizontalAlignment(JLabel.CENTER);
		winStreak.add(lblWinStreak_1);

		lblWinStreak = new JLabel(String.valueOf(Weight.Player.winStreak));
		lblWinStreak.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblWinStreak.setPreferredSize(new Dimension(100, 40));
		lblWinStreak.setHorizontalAlignment(JLabel.CENTER);
		winStreak.add(lblWinStreak);
		
		
		rankings = new JPanel();
		rankings.setBounds(645, 28, 339, 516);
		UFCgui.con.add(rankings);
		rankings.setVisible(true);
		
		lblRankings = new JLabel(weight);
		lblRankings.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRankings.setPreferredSize(new Dimension(300, 30));
		lblRankings.setHorizontalAlignment(SwingConstants.CENTER);
		rankings.add(lblRankings);
		
		switch(Weight.Player.getWeight()) {
		case 1:
			btnPos0 = new JButton("  C. " + PositionCheck.flyStr[0][0] + " " + PositionCheck.flyStr[0][1]);
			btnPos1 = new JButton("  1. " + PositionCheck.flyStr[1][0] + " " + PositionCheck.flyStr[1][1]);
			btnPos2 = new JButton("  2. " + PositionCheck.flyStr[2][0] + " " + PositionCheck.flyStr[2][1]);
			btnPos3 = new JButton("  3. " + PositionCheck.flyStr[3][0] + " " + PositionCheck.flyStr[3][1]);
			btnPos4 = new JButton("  4. " + PositionCheck.flyStr[4][0] + " " + PositionCheck.flyStr[4][1]);
			btnPos5 = new JButton("  5. " + PositionCheck.flyStr[5][0] + " " + PositionCheck.flyStr[5][1]);
			btnPos6 = new JButton("  6. " + PositionCheck.flyStr[6][0] + " " + PositionCheck.flyStr[6][1]);
			btnPos7 = new JButton("  7. " + PositionCheck.flyStr[7][0] + " " + PositionCheck.flyStr[7][1]);
			btnPos8 = new JButton("  8. " + PositionCheck.flyStr[8][0] + " " + PositionCheck.flyStr[8][1]);
			btnPos9 = new JButton("  9. " + PositionCheck.flyStr[9][0] + " " + PositionCheck.flyStr[9][1]);
			btnPos10 = new JButton("10. " + PositionCheck.flyStr[10][0] + " " + PositionCheck.flyStr[10][1]);
			break;
		case 2:
			btnPos0 = new JButton("  C. " + PositionCheck.bantamStr[0][0] + " " + PositionCheck.bantamStr[0][1]);
			btnPos1 = new JButton("  1. " + PositionCheck.bantamStr[1][0] + " " + PositionCheck.bantamStr[1][1]);
			btnPos2 = new JButton("  2. " + PositionCheck.bantamStr[2][0] + " " + PositionCheck.bantamStr[2][1]);
			btnPos3 = new JButton("  3. " + PositionCheck.bantamStr[3][0] + " " + PositionCheck.bantamStr[3][1]);
			btnPos4 = new JButton("  4. " + PositionCheck.bantamStr[4][0] + " " + PositionCheck.bantamStr[4][1]);
			btnPos5 = new JButton("  5. " + PositionCheck.bantamStr[5][0] + " " + PositionCheck.bantamStr[5][1]);
			btnPos6 = new JButton("  6. " + PositionCheck.bantamStr[6][0] + " " + PositionCheck.bantamStr[6][1]);
			btnPos7 = new JButton("  7. " + PositionCheck.bantamStr[7][0] + " " + PositionCheck.bantamStr[7][1]);
			btnPos8 = new JButton("  8. " + PositionCheck.bantamStr[8][0] + " " + PositionCheck.bantamStr[8][1]);
			btnPos9 = new JButton("  9. " + PositionCheck.bantamStr[9][0] + " " + PositionCheck.bantamStr[9][1]);
			btnPos10 = new JButton("10. " + PositionCheck.bantamStr[10][0] + " " + PositionCheck.bantamStr[10][1]);
			break;
		case 3:
			btnPos0 = new JButton("  C. " + PositionCheck.featherStr[0][0] + " " + PositionCheck.featherStr[0][1]);
			btnPos1 = new JButton("  1. " + PositionCheck.featherStr[1][0] + " " + PositionCheck.featherStr[1][1]);
			btnPos2 = new JButton("  2. " + PositionCheck.featherStr[2][0] + " " + PositionCheck.featherStr[2][1]);
			btnPos3 = new JButton("  3. " + PositionCheck.featherStr[3][0] + " " + PositionCheck.featherStr[3][1]);
			btnPos4 = new JButton("  4. " + PositionCheck.featherStr[4][0] + " " + PositionCheck.featherStr[4][1]);
			btnPos5 = new JButton("  5. " + PositionCheck.featherStr[5][0] + " " + PositionCheck.featherStr[5][1]);
			btnPos6 = new JButton("  6. " + PositionCheck.featherStr[6][0] + " " + PositionCheck.featherStr[6][1]);
			btnPos7 = new JButton("  7. " + PositionCheck.featherStr[7][0] + " " + PositionCheck.featherStr[7][1]);
			btnPos8 = new JButton("  8. " + PositionCheck.featherStr[8][0] + " " + PositionCheck.featherStr[8][1]);
			btnPos9 = new JButton("  9. " + PositionCheck.featherStr[9][0] + " " + PositionCheck.featherStr[9][1]);
			btnPos10 = new JButton("10. " + PositionCheck.featherStr[10][0] + " " + PositionCheck.featherStr[10][1]);
			break;
		case 4:
			btnPos0 = new JButton("  C. " + PositionCheck.lightStr[0][0] + " " + PositionCheck.lightStr[0][1]);
			btnPos1 = new JButton("  1. " + PositionCheck.lightStr[1][0] + " " + PositionCheck.lightStr[1][1]);
			btnPos2 = new JButton("  2. " + PositionCheck.lightStr[2][0] + " " + PositionCheck.lightStr[2][1]);
			btnPos3 = new JButton("  3. " + PositionCheck.lightStr[3][0] + " " + PositionCheck.lightStr[3][1]);
			btnPos4 = new JButton("  4. " + PositionCheck.lightStr[4][0] + " " + PositionCheck.lightStr[4][1]);
			btnPos5 = new JButton("  5. " + PositionCheck.lightStr[5][0] + " " + PositionCheck.lightStr[5][1]);
			btnPos6 = new JButton("  6. " + PositionCheck.lightStr[6][0] + " " + PositionCheck.lightStr[6][1]);
			btnPos7 = new JButton("  7. " + PositionCheck.lightStr[7][0] + " " + PositionCheck.lightStr[7][1]);
			btnPos8 = new JButton("  8. " + PositionCheck.lightStr[8][0] + " " + PositionCheck.lightStr[8][1]);
			btnPos9 = new JButton("  9. " + PositionCheck.lightStr[9][0] + " " + PositionCheck.lightStr[9][1]);
			btnPos10 = new JButton("10. " + PositionCheck.lightStr[10][0] + " " + PositionCheck.lightStr[10][1]);
			break;
		case 5:
			btnPos0 = new JButton("  C. " + PositionCheck.welterStr[0][0] + " " + PositionCheck.welterStr[0][1]);
			btnPos1 = new JButton("  1. " + PositionCheck.welterStr[1][0] + " " + PositionCheck.welterStr[1][1]);
			btnPos2 = new JButton("  2. " + PositionCheck.welterStr[2][0] + " " + PositionCheck.welterStr[2][1]);
			btnPos3 = new JButton("  3. " + PositionCheck.welterStr[3][0] + " " + PositionCheck.welterStr[3][1]);
			btnPos4 = new JButton("  4. " + PositionCheck.welterStr[4][0] + " " + PositionCheck.welterStr[4][1]);
			btnPos5 = new JButton("  5. " + PositionCheck.welterStr[5][0] + " " + PositionCheck.welterStr[5][1]);
			btnPos6 = new JButton("  6. " + PositionCheck.welterStr[6][0] + " " + PositionCheck.welterStr[6][1]);
			btnPos7 = new JButton("  7. " + PositionCheck.welterStr[7][0] + " " + PositionCheck.welterStr[7][1]);
			btnPos8 = new JButton("  8. " + PositionCheck.welterStr[8][0] + " " + PositionCheck.welterStr[8][1]);
			btnPos9 = new JButton("  9. " + PositionCheck.welterStr[9][0] + " " + PositionCheck.welterStr[9][1]);
			btnPos10 = new JButton("10. " + PositionCheck.welterStr[10][0] + " " + PositionCheck.welterStr[10][1]);
			break;
		case 6:
			btnPos0 = new JButton("  C. " + PositionCheck.middleStr[0][0] + " " + PositionCheck.middleStr[0][1]);
			btnPos1 = new JButton("  1. " + PositionCheck.middleStr[1][0] + " " + PositionCheck.middleStr[1][1]);
			btnPos2 = new JButton("  2. " + PositionCheck.middleStr[2][0] + " " + PositionCheck.middleStr[2][1]);
			btnPos3 = new JButton("  3. " + PositionCheck.middleStr[3][0] + " " + PositionCheck.middleStr[3][1]);
			btnPos4 = new JButton("  4. " + PositionCheck.middleStr[4][0] + " " + PositionCheck.middleStr[4][1]);
			btnPos5 = new JButton("  5. " + PositionCheck.middleStr[5][0] + " " + PositionCheck.middleStr[5][1]);
			btnPos6 = new JButton("  6. " + PositionCheck.middleStr[6][0] + " " + PositionCheck.middleStr[6][1]);
			btnPos7 = new JButton("  7. " + PositionCheck.middleStr[7][0] + " " + PositionCheck.middleStr[7][1]);
			btnPos8 = new JButton("  8. " + PositionCheck.middleStr[8][0] + " " + PositionCheck.middleStr[8][1]);
			btnPos9 = new JButton("  9. " + PositionCheck.middleStr[9][0] + " " + PositionCheck.middleStr[9][1]);
			btnPos10 = new JButton("10. " + PositionCheck.middleStr[10][0] + " " + PositionCheck.middleStr[10][1]);
			break;
		case 7:
			btnPos0 = new JButton("  C. " + PositionCheck.lheavyStr[0][0] + " " + PositionCheck.lheavyStr[0][1]);
			btnPos1 = new JButton("  1. " + PositionCheck.lheavyStr[1][0] + " " + PositionCheck.lheavyStr[1][1]);
			btnPos2 = new JButton("  2. " + PositionCheck.lheavyStr[2][0] + " " + PositionCheck.lheavyStr[2][1]);
			btnPos3 = new JButton("  3. " + PositionCheck.lheavyStr[3][0] + " " + PositionCheck.lheavyStr[3][1]);
			btnPos4 = new JButton("  4. " + PositionCheck.lheavyStr[4][0] + " " + PositionCheck.lheavyStr[4][1]);
			btnPos5 = new JButton("  5. " + PositionCheck.lheavyStr[5][0] + " " + PositionCheck.lheavyStr[5][1]);
			btnPos6 = new JButton("  6. " + PositionCheck.lheavyStr[6][0] + " " + PositionCheck.lheavyStr[6][1]);
			btnPos7 = new JButton("  7. " + PositionCheck.lheavyStr[7][0] + " " + PositionCheck.lheavyStr[7][1]);
			btnPos8 = new JButton("  8. " + PositionCheck.lheavyStr[8][0] + " " + PositionCheck.lheavyStr[8][1]);
			btnPos9 = new JButton("  9. " + PositionCheck.lheavyStr[9][0] + " " + PositionCheck.lheavyStr[9][1]);
			btnPos10 = new JButton("10. " + PositionCheck.lheavyStr[10][0] + " " + PositionCheck.lheavyStr[10][1]);
			break;
		case 8:
			btnPos0 = new JButton("  C. " + PositionCheck.heavyStr[0][0] + " " + PositionCheck.heavyStr[0][1]);
			btnPos1 = new JButton("  1. " + PositionCheck.heavyStr[1][0] + " " + PositionCheck.heavyStr[1][1]);
			btnPos2 = new JButton("  2. " + PositionCheck.heavyStr[2][0] + " " + PositionCheck.heavyStr[2][1]);
			btnPos3 = new JButton("  3. " + PositionCheck.heavyStr[3][0] + " " + PositionCheck.heavyStr[3][1]);
			btnPos4 = new JButton("  4. " + PositionCheck.heavyStr[4][0] + " " + PositionCheck.heavyStr[4][1]);
			btnPos5 = new JButton("  5. " + PositionCheck.heavyStr[5][0] + " " + PositionCheck.heavyStr[5][1]);
			btnPos6 = new JButton("  6. " + PositionCheck.heavyStr[6][0] + " " + PositionCheck.heavyStr[6][1]);
			btnPos7 = new JButton("  7. " + PositionCheck.heavyStr[7][0] + " " + PositionCheck.heavyStr[7][1]);
			btnPos8 = new JButton("  8. " + PositionCheck.heavyStr[8][0] + " " + PositionCheck.heavyStr[8][1]);
			btnPos9 = new JButton("  9. " + PositionCheck.heavyStr[9][0] + " " + PositionCheck.heavyStr[9][1]);
			btnPos10 = new JButton("10. " + PositionCheck.heavyStr[10][0] + " " + PositionCheck.heavyStr[10][1]);
			break;
		}
		
		btnPos0.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnPos0.setPreferredSize(new Dimension(300, 34));
		btnPos0.setBackground(gold);
		btnPos0.setFocusPainted(false);
		btnPos0.setHorizontalAlignment(SwingConstants.LEFT);
		btnPos0.addActionListener(pos0Handler);
		rankings.add(btnPos0);
		
		btnPos1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnPos1.setPreferredSize(new Dimension(300, 34));
		btnPos1.setBackground(Color.white);
		btnPos1.setFocusPainted(false);
		btnPos1.setHorizontalAlignment(SwingConstants.LEFT);
		btnPos1.addActionListener(pos1Handler);
		rankings.add(btnPos1);
		
		btnPos2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnPos2.setPreferredSize(new Dimension(300, 34));
		btnPos2.setBackground(Color.white);
		btnPos2.setFocusPainted(false);
		btnPos2.setHorizontalAlignment(SwingConstants.LEFT);
		btnPos2.addActionListener(pos2Handler);
		rankings.add(btnPos2);
		
		btnPos3.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnPos3.setPreferredSize(new Dimension(300, 34));
		btnPos3.setBackground(Color.white);
		btnPos3.setFocusPainted(false);
		btnPos3.setHorizontalAlignment(SwingConstants.LEFT);
		btnPos3.addActionListener(pos3Handler);
		rankings.add(btnPos3);
		
		btnPos4.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnPos4.setPreferredSize(new Dimension(300, 34));
		btnPos4.setBackground(Color.white);
		btnPos4.setFocusPainted(false);
		btnPos4.setHorizontalAlignment(SwingConstants.LEFT);
		btnPos4.addActionListener(pos4Handler);
		rankings.add(btnPos4);
		
		btnPos5.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnPos5.setPreferredSize(new Dimension(300, 34));
		btnPos5.setBackground(Color.white);
		btnPos5.setFocusPainted(false);
		btnPos5.setHorizontalAlignment(SwingConstants.LEFT);
		btnPos5.addActionListener(pos5Handler);
		rankings.add(btnPos5);
		
		btnPos6.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnPos6.setPreferredSize(new Dimension(300, 34));
		btnPos6.setBackground(Color.white);
		btnPos6.setFocusPainted(false);
		btnPos6.setHorizontalAlignment(SwingConstants.LEFT);
		btnPos6.addActionListener(pos6Handler);
		rankings.add(btnPos6);
		
		btnPos7.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnPos7.setPreferredSize(new Dimension(300, 34));
		btnPos7.setBackground(Color.white);
		btnPos7.setFocusPainted(false);
		btnPos7.setHorizontalAlignment(SwingConstants.LEFT);
		btnPos7.addActionListener(pos7Handler);
		rankings.add(btnPos7);
		
		btnPos8.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnPos8.setPreferredSize(new Dimension(300, 34));
		btnPos8.setBackground(Color.white);
		btnPos8.setFocusPainted(false);
		btnPos8.setHorizontalAlignment(SwingConstants.LEFT);
		btnPos8.addActionListener(pos8Handler);
		rankings.add(btnPos8);
		
		btnPos9.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnPos9.setPreferredSize(new Dimension(300, 34));
		btnPos9.setBackground(Color.white);
		btnPos9.setFocusPainted(false);
		btnPos9.setHorizontalAlignment(SwingConstants.LEFT);
		btnPos9.addActionListener(pos9Handler);
		rankings.add(btnPos9);
		
		btnPos10.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnPos10.setPreferredSize(new Dimension(300, 34));
		btnPos10.setBackground(Color.white);
		btnPos10.setFocusPainted(false);
		btnPos10.setHorizontalAlignment(SwingConstants.LEFT);
		btnPos10.addActionListener(pos10Handler);
		rankings.add(btnPos10);
		
		
		back = new JPanel();
		back.setBounds(412, 430, 200, 55);
		UFCgui.con.add(back);
		back.setVisible(true);
		
		btnBack = new JButton("BACK");
		btnBack.setPreferredSize(new Dimension(200, 50));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBack.setBackground(Color.white);
		btnBack.setFocusPainted(false);
		btnBack.addActionListener(careerBackHandler);
		back.add(btnBack);
		
		
		sponsor = new JPanel();
		sponsor.setBounds(112, 430, 200, 55);
		UFCgui.con.add(sponsor);
		sponsor.setVisible(true);
		
		btnSponsor = new JButton("SPONSORSHIP");
		btnSponsor.setPreferredSize(new Dimension(200, 50));
		btnSponsor.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSponsor.setBackground(Color.white);
		btnSponsor.setFocusPainted(false);
		btnSponsor.addActionListener(careerSponsorHandler);
		sponsor.add(btnSponsor);
		
	}
	
	public static class CareerBackScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();
			
			rankings.setVisible(false);
			back.setVisible(false);
			sponsor.setVisible(false);
			Fighter.money.setVisible(false);
			Fighter.date.setVisible(false);
			win.setVisible(false);
			winKO.setVisible(false);
			winTKO.setVisible(false);
			winSub.setVisible(false);
			winD.setVisible(false);
			loss.setVisible(false);
			lossKO.setVisible(false);
			lossTKO.setVisible(false);
			lossSub.setVisible(false);
			lossD.setVisible(false);
			win1.setVisible(false);
			win2.setVisible(false);
			win3.setVisible(false);
			win4.setVisible(false);
			win5.setVisible(false);
			loss1.setVisible(false);
			loss2.setVisible(false);
			loss3.setVisible(false);
			loss4.setVisible(false);
			loss5.setVisible(false);
			winStreak.setVisible(false);

			Fighter.fighterScreen();
		}
	}
	
	public static class CareerSponsorScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();
			
			rankings.setVisible(false);
			back.setVisible(false);
			sponsor.setVisible(false);

			win.setVisible(false);
			winKO.setVisible(false);
			winTKO.setVisible(false);
			winSub.setVisible(false);
			winD.setVisible(false);
			loss.setVisible(false);
			lossKO.setVisible(false);
			lossTKO.setVisible(false);
			lossSub.setVisible(false);
			lossD.setVisible(false);
			win1.setVisible(false);
			win2.setVisible(false);
			win3.setVisible(false);
			win4.setVisible(false);
			win5.setVisible(false);
			loss1.setVisible(false);
			loss2.setVisible(false);
			loss3.setVisible(false);
			loss4.setVisible(false);
			loss5.setVisible(false);
			winStreak.setVisible(false);

			SponsorScreen.sponsorScreen();
		}
	}
	
	public static class pos0ScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();
			
			rankings.setVisible(false);
			back.setVisible(false);
			sponsor.setVisible(false);
			win.setVisible(false);
			winKO.setVisible(false);
			winTKO.setVisible(false);
			winSub.setVisible(false);
			winD.setVisible(false);
			loss.setVisible(false);
			lossKO.setVisible(false);
			lossTKO.setVisible(false);
			lossSub.setVisible(false);
			lossD.setVisible(false);
			win1.setVisible(false);
			win2.setVisible(false);
			win3.setVisible(false);
			win4.setVisible(false);
			win5.setVisible(false);
			loss1.setVisible(false);
			loss2.setVisible(false);
			loss3.setVisible(false);
			loss4.setVisible(false);
			loss5.setVisible(false);
			winStreak.setVisible(false);
			
			PositionScreen.posScreen(0, Weight.Player.getWeight());
		}
	}
	
	public static class pos1ScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();
			
			rankings.setVisible(false);
			back.setVisible(false);
			sponsor.setVisible(false);
			win.setVisible(false);
			winKO.setVisible(false);
			winTKO.setVisible(false);
			winSub.setVisible(false);
			winD.setVisible(false);
			loss.setVisible(false);
			lossKO.setVisible(false);
			lossTKO.setVisible(false);
			lossSub.setVisible(false);
			lossD.setVisible(false);
			win1.setVisible(false);
			win2.setVisible(false);
			win3.setVisible(false);
			win4.setVisible(false);
			win5.setVisible(false);
			loss1.setVisible(false);
			loss2.setVisible(false);
			loss3.setVisible(false);
			loss4.setVisible(false);
			loss5.setVisible(false);
			winStreak.setVisible(false);
			
			PositionScreen.posScreen(1, Weight.Player.getWeight());
		}
	}
	
	public static class pos2ScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();
			
			rankings.setVisible(false);
			back.setVisible(false);
			sponsor.setVisible(false);
			win.setVisible(false);
			winKO.setVisible(false);
			winTKO.setVisible(false);
			winSub.setVisible(false);
			winD.setVisible(false);
			loss.setVisible(false);
			lossKO.setVisible(false);
			lossTKO.setVisible(false);
			lossSub.setVisible(false);
			lossD.setVisible(false);
			win1.setVisible(false);
			win2.setVisible(false);
			win3.setVisible(false);
			win4.setVisible(false);
			win5.setVisible(false);
			loss1.setVisible(false);
			loss2.setVisible(false);
			loss3.setVisible(false);
			loss4.setVisible(false);
			loss5.setVisible(false);
			winStreak.setVisible(false);
			
			PositionScreen.posScreen(2, Weight.Player.getWeight());
		}
	}
	
	public static class pos3ScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();
			
			rankings.setVisible(false);
			back.setVisible(false);
			sponsor.setVisible(false);
			win.setVisible(false);
			winKO.setVisible(false);
			winTKO.setVisible(false);
			winSub.setVisible(false);
			winD.setVisible(false);
			loss.setVisible(false);
			lossKO.setVisible(false);
			lossTKO.setVisible(false);
			lossSub.setVisible(false);
			lossD.setVisible(false);
			win1.setVisible(false);
			win2.setVisible(false);
			win3.setVisible(false);
			win4.setVisible(false);
			win5.setVisible(false);
			loss1.setVisible(false);
			loss2.setVisible(false);
			loss3.setVisible(false);
			loss4.setVisible(false);
			loss5.setVisible(false);
			winStreak.setVisible(false);
			
			PositionScreen.posScreen(3, Weight.Player.getWeight());
		}
	}
	
	public static class pos4ScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();
			
			rankings.setVisible(false);
			back.setVisible(false);
			sponsor.setVisible(false);
			win.setVisible(false);
			winKO.setVisible(false);
			winTKO.setVisible(false);
			winSub.setVisible(false);
			winD.setVisible(false);
			loss.setVisible(false);
			lossKO.setVisible(false);
			lossTKO.setVisible(false);
			lossSub.setVisible(false);
			lossD.setVisible(false);
			win1.setVisible(false);
			win2.setVisible(false);
			win3.setVisible(false);
			win4.setVisible(false);
			win5.setVisible(false);
			loss1.setVisible(false);
			loss2.setVisible(false);
			loss3.setVisible(false);
			loss4.setVisible(false);
			loss5.setVisible(false);
			winStreak.setVisible(false);
			
			PositionScreen.posScreen(4, Weight.Player.getWeight());
		}
	}
	
	public static class pos5ScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();
			
			rankings.setVisible(false);
			back.setVisible(false);
			sponsor.setVisible(false);
			win.setVisible(false);
			winKO.setVisible(false);
			winTKO.setVisible(false);
			winSub.setVisible(false);
			winD.setVisible(false);
			loss.setVisible(false);
			lossKO.setVisible(false);
			lossTKO.setVisible(false);
			lossSub.setVisible(false);
			lossD.setVisible(false);
			win1.setVisible(false);
			win2.setVisible(false);
			win3.setVisible(false);
			win4.setVisible(false);
			win5.setVisible(false);
			loss1.setVisible(false);
			loss2.setVisible(false);
			loss3.setVisible(false);
			loss4.setVisible(false);
			loss5.setVisible(false);
			winStreak.setVisible(false);
			
			PositionScreen.posScreen(5, Weight.Player.getWeight());
		}
	}
	
	public static class pos6ScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();
			
			rankings.setVisible(false);
			back.setVisible(false);
			sponsor.setVisible(false);
			win.setVisible(false);
			winKO.setVisible(false);
			winTKO.setVisible(false);
			winSub.setVisible(false);
			winD.setVisible(false);
			loss.setVisible(false);
			lossKO.setVisible(false);
			lossTKO.setVisible(false);
			lossSub.setVisible(false);
			lossD.setVisible(false);
			win1.setVisible(false);
			win2.setVisible(false);
			win3.setVisible(false);
			win4.setVisible(false);
			win5.setVisible(false);
			loss1.setVisible(false);
			loss2.setVisible(false);
			loss3.setVisible(false);
			loss4.setVisible(false);
			loss5.setVisible(false);
			winStreak.setVisible(false);
			
			PositionScreen.posScreen(6, Weight.Player.getWeight());
		}
	}
	
	public static class pos7ScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();
			
			rankings.setVisible(false);
			back.setVisible(false);
			sponsor.setVisible(false);
			win.setVisible(false);
			winKO.setVisible(false);
			winTKO.setVisible(false);
			winSub.setVisible(false);
			winD.setVisible(false);
			loss.setVisible(false);
			lossKO.setVisible(false);
			lossTKO.setVisible(false);
			lossSub.setVisible(false);
			lossD.setVisible(false);
			win1.setVisible(false);
			win2.setVisible(false);
			win3.setVisible(false);
			win4.setVisible(false);
			win5.setVisible(false);
			loss1.setVisible(false);
			loss2.setVisible(false);
			loss3.setVisible(false);
			loss4.setVisible(false);
			loss5.setVisible(false);
			winStreak.setVisible(false);
			
			PositionScreen.posScreen(7, Weight.Player.getWeight());
		}
	}
	
	public static class pos8ScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();
			
			rankings.setVisible(false);
			back.setVisible(false);
			sponsor.setVisible(false);
			win.setVisible(false);
			winKO.setVisible(false);
			winTKO.setVisible(false);
			winSub.setVisible(false);
			winD.setVisible(false);
			loss.setVisible(false);
			lossKO.setVisible(false);
			lossTKO.setVisible(false);
			lossSub.setVisible(false);
			lossD.setVisible(false);
			win1.setVisible(false);
			win2.setVisible(false);
			win3.setVisible(false);
			win4.setVisible(false);
			win5.setVisible(false);
			loss1.setVisible(false);
			loss2.setVisible(false);
			loss3.setVisible(false);
			loss4.setVisible(false);
			loss5.setVisible(false);
			winStreak.setVisible(false);
			
			PositionScreen.posScreen(8, Weight.Player.getWeight());
		}
	}
	
	public static class pos9ScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();
			
			rankings.setVisible(false);
			back.setVisible(false);
			sponsor.setVisible(false);
			win.setVisible(false);
			winKO.setVisible(false);
			winTKO.setVisible(false);
			winSub.setVisible(false);
			winD.setVisible(false);
			loss.setVisible(false);
			lossKO.setVisible(false);
			lossTKO.setVisible(false);
			lossSub.setVisible(false);
			lossD.setVisible(false);
			win1.setVisible(false);
			win2.setVisible(false);
			win3.setVisible(false);
			win4.setVisible(false);
			win5.setVisible(false);
			loss1.setVisible(false);
			loss2.setVisible(false);
			loss3.setVisible(false);
			loss4.setVisible(false);
			loss5.setVisible(false);
			winStreak.setVisible(false);
			
			PositionScreen.posScreen(9, Weight.Player.getWeight());
		}
	}
	
	public static class pos10ScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();
			
			rankings.setVisible(false);
			back.setVisible(false);
			sponsor.setVisible(false);
			win.setVisible(false);
			winKO.setVisible(false);
			winTKO.setVisible(false);
			winSub.setVisible(false);
			winD.setVisible(false);
			loss.setVisible(false);
			lossKO.setVisible(false);
			lossTKO.setVisible(false);
			lossSub.setVisible(false);
			lossD.setVisible(false);
			win1.setVisible(false);
			win2.setVisible(false);
			win3.setVisible(false);
			win4.setVisible(false);
			win5.setVisible(false);
			loss1.setVisible(false);
			loss2.setVisible(false);
			loss3.setVisible(false);
			loss4.setVisible(false);
			loss5.setVisible(false);
			winStreak.setVisible(false);
			
			PositionScreen.posScreen(10, Weight.Player.getWeight());
		}
	}

}
