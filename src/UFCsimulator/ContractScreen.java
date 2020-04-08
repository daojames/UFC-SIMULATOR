package UFCsimulator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ContractScreen {

	static JPanel pay, pay1, contract, back, fight;
	
	static JLabel lblBase, lblBase1, lblWin, lblWin1, lblFotn, lblFotn1, lblPotn, lblPotn1, lblSponsor, lblSponsor1, lblBelt, lblTitle, lblInfo, lblDate, lblContract, lblPurse, lblSign;
	
	static JButton btnBack, btnFight;
	
	static ContractBackScreenHandler contractBackHandler = new ContractBackScreenHandler();
	static ContractSignScreenHandler contractSignHandler = new ContractSignScreenHandler();
	
	static int opPos;
	static Boolean champ = false;
	
	static String fightSong = "/UFCsimulator/resources/tapeUFC.wav";
	
	public static void contractScreen(String youFirst, String youLast, String oppoFirst, String oppoLast, int oppoPos) {
		
		opPos = oppoPos;
		
		pay = new JPanel();
		pay.setBounds(24, 50, 350, 380);
		UFCgui.con.add(pay);
		pay.setVisible(true);
		
		lblBase = new JLabel("BASE FIGHT SALARY:");
		lblBase.setHorizontalAlignment(JLabel.RIGHT);
		lblBase.setPreferredSize(new Dimension(350, 68));
		lblBase.setFont(new Font("Tahoma", Font.PLAIN, 20));
		pay.add(lblBase);
		
		lblWin = new JLabel("WIN BONUS:");
		lblWin.setHorizontalAlignment(JLabel.RIGHT);
		lblWin.setPreferredSize(new Dimension(350, 68));
		lblWin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		pay.add(lblWin);
		
		lblFotn = new JLabel("FIGHT OF THE NIGHT BONUS:");
		lblFotn.setHorizontalAlignment(JLabel.RIGHT);
		lblFotn.setPreferredSize(new Dimension(350, 68));
		lblFotn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		pay.add(lblFotn);
		
		lblPotn = new JLabel("PERFORMANCE OF THE NIGHT BONUS:");
		lblPotn.setHorizontalAlignment(JLabel.RIGHT);
		lblPotn.setPreferredSize(new Dimension(350, 68));
		lblPotn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		pay.add(lblPotn);
		
		lblSponsor = new JLabel("SPONSOR:");
		lblSponsor.setHorizontalAlignment(JLabel.RIGHT);
		lblSponsor.setPreferredSize(new Dimension(350, 68));
		lblSponsor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		pay.add(lblSponsor);
		
		
		pay1 = new JPanel();
		pay1.setBounds(390, 50, 120, 380);
		UFCgui.con.add(pay1);
		pay1.setVisible(true);
		
		lblBase1 = new JLabel("$" + Fighter.BalanceUFC.getClout());
		lblBase1.setHorizontalAlignment(JLabel.LEFT);
		lblBase1.setPreferredSize(new Dimension(120, 68));
		lblBase1.setFont(new Font("Tahoma", Font.BOLD, 20));
		pay1.add(lblBase1);
		
		lblWin1 = new JLabel("$" + Fighter.BalanceUFC.getClout());
		lblWin1.setHorizontalAlignment(JLabel.LEFT);
		lblWin1.setPreferredSize(new Dimension(120, 68));
		lblWin1.setFont(new Font("Tahoma", Font.BOLD, 20));
		pay1.add(lblWin1);
		
		lblFotn1 = new JLabel("$50000");
		lblFotn1.setHorizontalAlignment(JLabel.LEFT);
		lblFotn1.setPreferredSize(new Dimension(120, 68));
		lblFotn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		pay1.add(lblFotn1);
		
		lblPotn1 = new JLabel("$50000");
		lblPotn1.setHorizontalAlignment(JLabel.LEFT);
		lblPotn1.setPreferredSize(new Dimension(120, 68));
		lblPotn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		pay1.add(lblPotn1);
		
		String spnsr = String.valueOf(Fighter.BalanceUFC.getSponsor());
		
		lblSponsor1 = new JLabel("$" + spnsr);
		lblSponsor1.setHorizontalAlignment(JLabel.LEFT);
		lblSponsor1.setPreferredSize(new Dimension(120, 68));
		lblSponsor1.setFont(new Font("Tahoma", Font.BOLD, 20));
		pay1.add(lblSponsor1);
		
		
		back = new JPanel();
		back.setBounds(300, 430, 200, 55);
		UFCgui.con.add(back);
		back.setVisible(true);
		
		btnBack = new JButton("BACK");
		btnBack.setPreferredSize(new Dimension(200, 50));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBack.setBackground(Color.white);
		btnBack.setFocusPainted(false);
		btnBack.addActionListener(contractBackHandler);
		back.add(btnBack);
		
		
		fight = new JPanel();
		fight.setBounds(524, 430, 200, 55);
		UFCgui.con.add(fight);
		fight.setVisible(true);
		
		btnFight = new JButton("SIGN");
		btnFight.setPreferredSize(new Dimension(200, 50));
		btnFight.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnFight.setBackground(Color.white);
		btnFight.setFocusPainted(false);
		btnFight.addActionListener(contractSignHandler);
		fight.add(btnFight);
		
		
		contract = new JPanel();
		contract.setBounds(500, 157, 500, 250);
		UFCgui.con.add(contract);
		contract.setVisible(true);
		
		if (PositionScreen.posi > Weight.Player.getPos()) {
			lblTitle = new JLabel(oppoFirst + " " + oppoLast + " v. " + youFirst + " " + youLast);
			lblTitle.setHorizontalAlignment(JLabel.CENTER);
			lblTitle.setPreferredSize(new Dimension(500, 25));
			lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 18));
			contract.add(lblTitle);
		}
		else {
			lblTitle = new JLabel(youFirst + " " + youLast + " v. " + oppoFirst + " " + oppoLast);
			lblTitle.setHorizontalAlignment(JLabel.CENTER);
			lblTitle.setPreferredSize(new Dimension(500, 25));
			lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 18));
			contract.add(lblTitle);
		}
		
		String UFC = String.valueOf(Fighter.MonthUFC.getUFC() + 1);
		
		lblInfo = new JLabel(PositionScreen.weight + " BOUT IN THE UFC " + UFC + " MAIN CARD");
		lblInfo.setHorizontalAlignment(JLabel.CENTER);
		lblInfo.setPreferredSize(new Dimension(500, 25));
		lblInfo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contract.add(lblInfo);
		
		if (Weight.Player.getPos() == 0) {
			lblBelt = new JLabel("UFC " + PositionScreen.weight + " CHAMPIONSHIP DEFENSE");
			lblBelt.setHorizontalAlignment(JLabel.CENTER);
			lblBelt.setPreferredSize(new Dimension(500, 25));
			lblBelt.setFont(new Font("Tahoma", Font.PLAIN, 18));
			contract.add(lblBelt);
		}
		else if (oppoPos == 0) {
			lblBelt = new JLabel("FOR THE UFC " + PositionScreen.weight + " CHAMPIONSHIP");
			lblBelt.setHorizontalAlignment(JLabel.CENTER);
			lblBelt.setPreferredSize(new Dimension(500, 25));
			lblBelt.setFont(new Font("Tahoma", Font.PLAIN, 18));
			contract.add(lblBelt);
		}
		
		String yr = String.valueOf(Fighter.MonthUFC.getYear());
		
		champ = false;
		if (Weight.Player.getPos() == 0 || oppoPos == 0) {
			lblDate = new JLabel("5 ROUNDS, ON " + Fighter.MonthUFC.getMonth() + " " + yr);
			lblDate.setHorizontalAlignment(JLabel.CENTER);
			lblDate.setPreferredSize(new Dimension(500, 25));
			lblDate.setFont(new Font("Tahoma", Font.PLAIN, 18));
			contract.add(lblDate);
			champ = true;
		}
		else {
			lblDate = new JLabel("3 ROUNDS, ON " + Fighter.MonthUFC.getMonth() + " " + yr);
			lblDate.setHorizontalAlignment(JLabel.CENTER);
			lblDate.setPreferredSize(new Dimension(500, 25));
			lblDate.setFont(new Font("Tahoma", Font.PLAIN, 18));
			contract.add(lblDate);
		}
		
		lblContract = new JLabel("YOUR GUARANTEED PURSE FOR THIS FIGHT IS:");
		lblContract.setHorizontalAlignment(JLabel.CENTER);
		lblContract.setPreferredSize(new Dimension(500, 25));
		lblContract.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contract.add(lblContract);
		
		String purse = String.valueOf(Fighter.BalanceUFC.getClout() + Fighter.BalanceUFC.getSponsor());
		
		lblPurse = new JLabel("$" + purse);
		lblPurse.setHorizontalAlignment(JLabel.CENTER);
		lblPurse.setPreferredSize(new Dimension(500, 25));
		lblPurse.setFont(new Font("Tahoma", Font.BOLD, 18));
		contract.add(lblPurse);
		
		lblSign = new JLabel("SIGN CONTRACT?");
		lblSign.setHorizontalAlignment(JLabel.CENTER);
		lblSign.setPreferredSize(new Dimension(500, 25));
		lblSign.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contract.add(lblSign);

	}
	
	public static class ContractBackScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();
			
			pay.setVisible(false);
			pay1.setVisible(false);
			contract.setVisible(false);
			back.setVisible(false);
			fight.setVisible(false);

			PositionScreen.posScreen(opPos, Weight.Player.getWeight());
		}
	}
	
	public static class ContractSignScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();
			
			UFCgui.music.stop();
			UFCgui.music.setFile(fightSong);
			UFCgui.music.play();
			
			pay.setVisible(false);
			pay1.setVisible(false);
			contract.setVisible(false);
			back.setVisible(false);
			fight.setVisible(false);

			FightScreen.fightScreen0();
		}
	}

}
