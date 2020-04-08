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

public class CharacterSelect {
	
	static JPanel charSelect, prevArrow, nextArrow, goArrow, hoverPanel;
	static JPanel facePanel1, facePanel2, facePanel3, facePanel4, facePanel5, facePanel6, facePanel7, facePanel8, facePanel9, facePanel10;
	static JPanel tip1, tip2, tip3, tip4, tip5, tip6, tip7, tip8;
	
	static JLabel lblCharSelect, hoverDesc;
	static JLabel lblCharPic1, lblCharPic2, lblCharPic3, lblCharPic4, lblCharPic5, lblCharPic6, lblCharPic7, lblCharPic8, lblCharPic9, lblCharPic10;
	
	static JButton btnPrev, btnNext, btnGo;
	
	static int charNum = 0;
	static ImageIcon charPic;
	
	static PrevScreenHandler prevHandler = new PrevScreenHandler();
	static NextScreenHandler nextHandler = new NextScreenHandler();
	static GoScreenHandler goHandler = new GoScreenHandler();

	public static void charSelectScreen() {
		
		charSelect = new JPanel();
		charSelect.setBounds(0, 0, 1024, 35);
		UFCgui.con.add(charSelect);
		charSelect.setVisible(true);

		lblCharSelect = new JLabel("CHOOSE YOUR FIGHTER");
		lblCharSelect.setFont(new Font("Tahoma", Font.BOLD, 28));
		charSelect.add(lblCharSelect);
		
		hoverPanel = new JPanel();
		hoverPanel.setBounds(0, 30, 1024, 15);
		UFCgui.con.add(hoverPanel);
		hoverPanel.setVisible(true);
		hoverDesc = new JLabel("HOVER OVER STATS FOR INFO");
		hoverDesc.setFont(new Font("Tahoma", Font.BOLD, 10));
		hoverPanel.add(hoverDesc);
		
		
		prevArrow = new JPanel();
		prevArrow.setBounds(15, 213, 50, 105);
		UFCgui.con.add(prevArrow);
		prevArrow.setVisible(true);
		
		btnPrev = new JButton("<");
		btnPrev.setPreferredSize(new Dimension(50, 100));
		btnPrev.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPrev.setBackground(Color.white);
		btnPrev.setFocusPainted(false);
		btnPrev.addActionListener(prevHandler);
		prevArrow.add(btnPrev);
		
		
		nextArrow = new JPanel();
		nextArrow.setBounds(954, 213, 50, 105);
		UFCgui.con.add(nextArrow);
		nextArrow.setVisible(true);
		
		btnNext = new JButton(">");
		btnNext.setPreferredSize(new Dimension(50, 100));
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNext.setBackground(Color.white);
		btnNext.setFocusPainted(false);
		btnNext.addActionListener(nextHandler);
		nextArrow.add(btnNext);
		
		
		goArrow = new JPanel();
		goArrow.setBounds(695, 115, 200, 105);
		UFCgui.con.add(goArrow);
		goArrow.setVisible(true);
		
		btnGo = new JButton("SIGN WITH UFC");
		btnGo.setPreferredSize(new Dimension(200, 100));
		btnGo.setFont(new Font("Tahoma", Font.BOLD, 20));;
		btnGo.setBackground(Color.white);
		btnGo.setFocusPainted(false);
		btnGo.addActionListener(goHandler);
		goArrow.add(btnGo);
		
		
		facePanel1 = new JPanel();
		facePanel1.setBounds(70, 20, 884, 526);
		UFCgui.con.add(facePanel1);
		facePanel1.setVisible(true);
		
		try {
			charPic = new ImageIcon(CharacterSelect.class.getResource("/UFCsimulator/resources/faces/alexPane.png"));
			lblCharPic1 = new JLabel(charPic);
			facePanel1.add(lblCharPic1);
		}
		catch(Exception e) {
			System.out.println("Image not found");
		}
			
		
		facePanel2 = new JPanel();
		facePanel2.setBounds(70, 20, 884, 526);
		UFCgui.con.add(facePanel2);
		
		try {
			charPic = new ImageIcon(CharacterSelect.class.getResource("/UFCsimulator/resources/faces/jamesPane.png"));
			lblCharPic2 = new JLabel(charPic);
			facePanel2.add(lblCharPic2);
		}
		catch(Exception e) {
			System.out.println("Image not found");
		}		
		
		facePanel3 = new JPanel();
		facePanel3.setBounds(70, 20, 884, 526);
		UFCgui.con.add(facePanel3);
		
		try {
			charPic = new ImageIcon(CharacterSelect.class.getResource("/UFCsimulator/resources/faces/khoaPane.png"));
			lblCharPic3 = new JLabel(charPic);
			facePanel3.add(lblCharPic3);
		}
		catch(Exception e) {
			System.out.println("Image not found");
		}		
		
		facePanel4 = new JPanel();
		facePanel4.setBounds(70, 20, 884, 526);
		UFCgui.con.add(facePanel4);
		
		try {
			charPic = new ImageIcon(CharacterSelect.class.getResource("/UFCsimulator/resources/faces/jimmyPane.png"));
			lblCharPic4 = new JLabel(charPic);
			facePanel4.add(lblCharPic4);
		}
		catch(Exception e) {
			System.out.println("Image not found");
		}		
		
		facePanel5 = new JPanel();
		facePanel5.setBounds(70, 20, 884, 526);
		UFCgui.con.add(facePanel5);
		
		try {
			charPic = new ImageIcon(CharacterSelect.class.getResource("/UFCsimulator/resources/faces/benPane.png"));
			lblCharPic5 = new JLabel(charPic);
			facePanel5.add(lblCharPic5);
		}
		catch(Exception e) {
			System.out.println("Image not found");
		}		
		
		facePanel6 = new JPanel();
		facePanel6.setBounds(70, 20, 884, 526);
		UFCgui.con.add(facePanel6);
		
		try {
			charPic = new ImageIcon(CharacterSelect.class.getResource("/UFCsimulator/resources/faces/johnPane.png"));
			lblCharPic6 = new JLabel(charPic);
			facePanel6.add(lblCharPic6);
		}
		catch(Exception e) {
			System.out.println("Image not found");
		}		
		
		facePanel7 = new JPanel();
		facePanel7.setBounds(70, 20, 884, 526);
		UFCgui.con.add(facePanel7);
		
		try {
			charPic = new ImageIcon(CharacterSelect.class.getResource("/UFCsimulator/resources/faces/erikPane.png"));
			lblCharPic7 = new JLabel(charPic);
			facePanel7.add(lblCharPic7);
		}
		catch(Exception e) {
			System.out.println("Image not found");
		}		
		
		facePanel8 = new JPanel();
		facePanel8.setBounds(70, 20, 884, 526);
		UFCgui.con.add(facePanel8);
		
		try {
			charPic = new ImageIcon(CharacterSelect.class.getResource("/UFCsimulator/resources/faces/michaelPane.png"));
			lblCharPic8 = new JLabel(charPic);
			facePanel8.add(lblCharPic8);
		}
		catch(Exception e) {
			System.out.println("Image not found");
		}		
		
		facePanel9 = new JPanel();
		facePanel9.setBounds(70, 20, 884, 526);
		UFCgui.con.add(facePanel9);

		try {
			charPic = new ImageIcon(CharacterSelect.class.getResource("/UFCsimulator/resources/faces/henryPane.png"));
			lblCharPic9 = new JLabel(charPic);
			facePanel9.add(lblCharPic9);
		}
		catch(Exception e) {
			System.out.println("Image not found");
		}
		
		facePanel10 = new JPanel();
		facePanel10.setBounds(70, 20, 884, 526);
		UFCgui.con.add(facePanel10);
		
		try {
			charPic = new ImageIcon(CharacterSelect.class.getResource("/UFCsimulator/resources/faces/tyPane.png"));
			lblCharPic10 = new JLabel(charPic);
			facePanel10.add(lblCharPic10);
		}
		catch(Exception e) {
			System.out.println("Image not found");
		}
		
		
		tip1 = new JPanel();
		tip1.setBounds(100, 277, 800, 26);
		UFCgui.con.add(tip1);
		tip1.setToolTipText("Power behind strikes and wrestling");
		tip1.setVisible(true);
		
		tip2 = new JPanel();
		tip2.setBounds(100, 307, 800, 26);
		UFCgui.con.add(tip2);
		tip2.setToolTipText("Speed of strikes, takedowns, and slips (also determines who attacks first)");
		tip2.setVisible(true);
		
		tip3 = new JPanel();
		tip3.setBounds(100, 339, 800, 26);
		UFCgui.con.add(tip3);
		tip3.setToolTipText("Gas tank");
		tip3.setVisible(true);
		
		tip4 = new JPanel();
		tip4.setBounds(100, 371, 800, 26);
		UFCgui.con.add(tip4);
		tip4.setToolTipText("Strike damage resistance");
		tip4.setVisible(true);
		
		tip5 = new JPanel();
		tip5.setBounds(100, 404, 800, 26);
		UFCgui.con.add(tip5);
		tip5.setToolTipText("Depth of stand-up game");
		tip5.setVisible(true);
		
		tip6 = new JPanel();
		tip6.setBounds(100, 436, 800, 26);
		UFCgui.con.add(tip6);
		tip6.setToolTipText("Depth of ground game");
		tip6.setVisible(true);
		
		tip7 = new JPanel();
		tip7.setBounds(100, 468, 800, 26);
		UFCgui.con.add(tip7);
		tip7.setToolTipText("Retentiveness and adaptiveness");
		tip7.setVisible(true);
		
		tip8 = new JPanel();
		tip8.setBounds(100, 500, 800, 26);
		UFCgui.con.add(tip8);
		tip8.setToolTipText("Extra chance of attack success");
		tip8.setVisible(true);
		
		
		UFCgui.clickSound = "/UFCsimulator/resources/clickSound.wav";
	}

	public static class GoScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();
			
			charSelect.setVisible(false);
			prevArrow.setVisible(false);
			nextArrow.setVisible(false);
			goArrow.setVisible(false);
			
			facePanel1.setVisible(false);
			facePanel2.setVisible(false);
			facePanel3.setVisible(false);
			facePanel4.setVisible(false);
			facePanel5.setVisible(false);
			facePanel6.setVisible(false);
			facePanel7.setVisible(false);
			facePanel8.setVisible(false);
			facePanel9.setVisible(false);
			facePanel10.setVisible(false);
			
			hoverPanel.setVisible(false);
			
			tip1.setVisible(false);
			tip2.setVisible(false);
			tip3.setVisible(false);
			tip4.setVisible(false);
			tip5.setVisible(false);
			tip6.setVisible(false);
			tip7.setVisible(false);
			tip8.setVisible(false);
			
			Weight.weightScreen();
		}
	}
	
	public static class PrevScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UFCgui.sS.setFile(UFCgui.clickSound);
			UFCgui.sS.play();
			
			if(charNum == 0) {}
			else {
				switch(charNum) {
				case 0:
					facePanel1.setVisible(false);
					break;
				case 1:
					facePanel2.setVisible(false);
					break;
				case 2:
					facePanel3.setVisible(false);
					break;
				case 3:
					facePanel4.setVisible(false);
					break;
				case 4:
					facePanel5.setVisible(false);
					break;
				case 5:
					facePanel6.setVisible(false);
					break;
				case 6:
					facePanel7.setVisible(false);
					break;
				case 7:
					facePanel8.setVisible(false);
					break;
				case 8:
					facePanel9.setVisible(false);
					break;
				case 9:
					facePanel10.setVisible(false);
					break;
				case 10:
					facePanel1.setVisible(false);
					break;
				}
				
				charNum -= 1;
				switch(charNum) {
				case 0:
					facePanel1.setVisible(true);
					break;
				case 1:
					facePanel2.setVisible(true);
					break;
				case 2:
					facePanel3.setVisible(true);
					break;
				case 3:
					facePanel4.setVisible(true);
					break;
				case 4:
					facePanel5.setVisible(true);
					break;
				case 5:
					facePanel6.setVisible(true);
					break;
				case 6:
					facePanel7.setVisible(true);
					break;
				case 7:
					facePanel8.setVisible(true);
					break;
				case 8:
					facePanel9.setVisible(true);
					break;
				case 9:
					facePanel10.setVisible(true);
					break;
				case 10:
					facePanel1.setVisible(true);
					break;
				}
				}
			}
		}
		
		public static class NextScreenHandler implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				UFCgui.sS.setFile(UFCgui.clickSound);
				UFCgui.sS.play();
				
				if(charNum == 9) {}
				else {
					switch(charNum) {
					case 0:
						facePanel1.setVisible(false);
						break;
					case 1:
						facePanel2.setVisible(false);
						break;
					case 2:
						facePanel3.setVisible(false);
						break;
					case 3:
						facePanel4.setVisible(false);
						break;
					case 4:
						facePanel5.setVisible(false);
						break;
					case 5:
						facePanel6.setVisible(false);
						break;
					case 6:
						facePanel7.setVisible(false);
						break;
					case 7:
						facePanel8.setVisible(false);
						break;
					case 8:
						facePanel9.setVisible(false);
						break;
					case 9:
						facePanel10.setVisible(false);
						break;
					case 10:
						facePanel1.setVisible(false);
						break;
					}
					
					charNum += 1;
					switch(charNum) {
					case 0:
						facePanel1.setVisible(true);
						break;
					case 1:
						facePanel2.setVisible(true);
						break;
					case 2:
						facePanel3.setVisible(true);
						break;
					case 3:
						facePanel4.setVisible(true);
						break;
					case 4:
						facePanel5.setVisible(true);
						break;
					case 5:
						facePanel6.setVisible(true);
						break;
					case 6:
						facePanel7.setVisible(true);
						break;
					case 7:
						facePanel8.setVisible(true);
						break;
					case 8:
						facePanel9.setVisible(true);
						break;
					case 9:
						facePanel10.setVisible(true);
						break;
					case 10:
						facePanel1.setVisible(true);
						break;
					}
					}
			}
		}
}
