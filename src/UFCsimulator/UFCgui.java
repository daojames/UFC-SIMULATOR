package UFCsimulator;

import java.awt.event.*;
import java.io.BufferedInputStream;
import java.awt.Font;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Rectangle;


public class UFCgui {
	
	static Color bg = new Color(240,240,240);
	
	static TitleScreenHandler tsHandler = new TitleScreenHandler();
	
	static Container con;
	static JFrame window;
	
	static JPanel titleScreen, startBtnPanel, titleLogo;
	
	static JLabel lblHello, lblFriendsEmbark, lblTitleLogo, lblJames;
	
	static JButton btnStart;
	
	static ImageIcon titleIcon;
	
	static String clickSound = "/UFCsimulator/resources/Thunder.wav";
	static String startMusic = "/UFCsimulator/resources/magnoliaUFC.wav";
	static startSound music = new startSound();
	static startSound sS = new startSound();
	

	public static void main(String[] args) {
		new UFCgui();
	}
	
	public UFCgui() {
		
		window = new JFrame();
		window.setBounds(new Rectangle(448, 252, 0, 0));
		window.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/UFCsimulator/resources/ufcSimLogo.png")));
		window.setResizable(false);
		window.setSize(1024, 576);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setLayout(null);
		con = window.getContentPane();
		
		
		titleLogo = new JPanel();
		titleLogo.setBounds(437, 35, 150, 155);
		con.add(titleLogo);
		titleLogo.setVisible(true);
		
		try {
			titleIcon = new ImageIcon(this.getClass().getResource("/UFCsimulator/resources/ufcSimLogo2.png"));
			lblTitleLogo = new JLabel(titleIcon);
			titleLogo.add(lblTitleLogo);
		}
		catch(Exception e) {
			System.out.println("Image not found");
		}
		
		
		titleScreen = new JPanel();
		titleScreen.setBounds(0, 200, 1024, 170);
		titleScreen.setBackground(bg);
		con.add(titleScreen);
		titleScreen.setVisible(true);
		
		lblHello = new JLabel("UFC SIMULATOR");
		lblHello.setFont(new Font("Tahoma", Font.BOLD, 99));
		titleScreen.add(lblHello);

		lblFriendsEmbark = new JLabel(" BUILD YOUR PRO MIXED MARTIAL ARTS LEGACY ");
		lblFriendsEmbark.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		titleScreen.add(lblFriendsEmbark);	
		
		
		startBtnPanel = new JPanel();
		startBtnPanel.setBounds(412, 400, 200, 85);
		con.add(startBtnPanel);
		startBtnPanel.setVisible(true);
		
		btnStart = new JButton("START");
		btnStart.setPreferredSize(new Dimension(200, 50));
		btnStart.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnStart.setBackground(Color.white);
		btnStart.setFocusPainted(false);
		btnStart.addActionListener(tsHandler);
		startBtnPanel.add(btnStart);
		
		lblJames = new JLabel("CREATED BY JAMES DAO");
		lblJames.setHorizontalAlignment(JLabel.CENTER);
		lblJames.setPreferredSize(new Dimension(200, 20));
		lblJames.setFont(new Font("Tahoma", Font.BOLD, 15));
		startBtnPanel.add(lblJames);
		
		
		window.setVisible(true);
		
		
		music.setFile(startMusic);
		music.play();
	}
	
	public static class startSound {
		Clip clip;
		public void setFile(String fileName) {
			try {
				clip = AudioSystem.getClip();
				AudioInputStream sound = AudioSystem.getAudioInputStream(new BufferedInputStream(this.getClass().getResourceAsStream(fileName)));
				clip.open(sound);
			}
			catch(Exception e) {
				System.out.println("Sound not found");
			}
		}
		public void play() {
			clip.setFramePosition(0);
			clip.start();
		}
		public void stop() {
			clip.stop();
		}
	}
	
	public static class TitleScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			sS.setFile(clickSound);
			sS.play();
			
			titleLogo.setVisible(false);
			titleScreen.setVisible(false);
			startBtnPanel.setVisible(false);

			CharacterSelect.charSelectScreen();
		}
	}
}