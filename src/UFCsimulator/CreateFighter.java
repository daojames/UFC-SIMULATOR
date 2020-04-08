package UFCsimulator;

public class CreateFighter {
	
	// Flyweight
	static OpponentClass DeivesonFigueiredo = new OpponentClass();
	static OpponentClass JosephBenavidez = new OpponentClass();
	static OpponentClass JussierFormiga = new OpponentClass();
	static OpponentClass AlexandrePantoja = new OpponentClass();
	static OpponentClass BrandonMoreno = new OpponentClass();
	static OpponentClass AskarAskarov = new OpponentClass();
	static OpponentClass KaiKaraFrance = new OpponentClass();
	static OpponentClass RogerioBontorin = new OpponentClass();
	static OpponentClass AlexPerez = new OpponentClass();
	static OpponentClass MattSchnell = new OpponentClass();
	
	// Bantamweight
	static OpponentClass HenryCejudo = new OpponentClass();
	static OpponentClass MarlonMoraes = new OpponentClass();
	static OpponentClass AljamainSterling = new OpponentClass();
	static OpponentClass PetrYan = new OpponentClass();
	static OpponentClass CorySandhagen = new OpponentClass();
	static OpponentClass RaphaelAssuncao = new OpponentClass();
	static OpponentClass PedroMunhoz = new OpponentClass();
	static OpponentClass JimmieRivera = new OpponentClass();
	static OpponentClass CodyGarbrandt = new OpponentClass();
	static OpponentClass SeanOMalley = new OpponentClass();
	
	// Featherweight
	static OpponentClass AlexanderVolkanovski = new OpponentClass();
	static OpponentClass MaxHolloway = new OpponentClass();
	static OpponentClass BrianOrtega = new OpponentClass();
	static OpponentClass ZabitMagomedsharipov = new OpponentClass();
	static OpponentClass ChanSungJung = new OpponentClass();
	static OpponentClass YairRodriguez = new OpponentClass();
	static OpponentClass FrankieEdgar = new OpponentClass();
	static OpponentClass JeremyStephens = new OpponentClass();
	static OpponentClass JoseAldo = new OpponentClass();
	static OpponentClass SodiqYusuff = new OpponentClass();
	
	// Lightweight
	static OpponentClass KhabibNurmagomedov = new OpponentClass();
	static OpponentClass TonyFerguson = new OpponentClass();
	static OpponentClass DustinPoirier = new OpponentClass();
	static OpponentClass ConorMcGregor = new OpponentClass();
	static OpponentClass JustinGaethje = new OpponentClass();
	static OpponentClass DanHooker = new OpponentClass();
	static OpponentClass DonaldCerrone = new OpponentClass();
	static OpponentClass PaulFelder = new OpponentClass();
	static OpponentClass CharlesOliveira = new OpponentClass();
	static OpponentClass IslamMakhachev = new OpponentClass();

	// Welterweight
	static OpponentClass KamaruUsman = new OpponentClass();
	static OpponentClass TyronWoodley = new OpponentClass();
	static OpponentClass ColbyCovington = new OpponentClass();
	static OpponentClass JorgeMasvidal = new OpponentClass();
	static OpponentClass LeonEdwards = new OpponentClass();
	static OpponentClass StephenThompson = new OpponentClass();
	static OpponentClass DemianMaia = new OpponentClass();
	static OpponentClass RafaelDosAnjos = new OpponentClass();
	static OpponentClass NateDiaz = new OpponentClass();
	static OpponentClass AnthonyPettis = new OpponentClass();
	
	// Middleweight
	static OpponentClass IsraelAdesanya = new OpponentClass();
	static OpponentClass PauloCosta = new OpponentClass();
	static OpponentClass RobertWhittaker = new OpponentClass();
	static OpponentClass JaredCannonier = new OpponentClass();
	static OpponentClass YoelRomero = new OpponentClass();
	static OpponentClass DarrenTill = new OpponentClass();
	static OpponentClass KelvinGastelum = new OpponentClass();
	static OpponentClass DerekBrunson = new OpponentClass();
	static OpponentClass BradTavares = new OpponentClass();
	static OpponentClass AndersonSilva = new OpponentClass();
	
	// Light Heavyweight
	static OpponentClass JonJones = new OpponentClass();
	static OpponentClass DominickReyes = new OpponentClass();
	static OpponentClass ThiagoSantos = new OpponentClass();
	static OpponentClass AnthonySmith = new OpponentClass();
	static OpponentClass JanBlachowicz = new OpponentClass();
	static OpponentClass CoreyAnderson = new OpponentClass();
	static OpponentClass VolkanOezdemir = new OpponentClass();
	static OpponentClass AlexanderGustafsson = new OpponentClass();
	static OpponentClass GloverTeixeira = new OpponentClass();
	static OpponentClass JohnnyWalker = new OpponentClass();
	
	// Heavyweight
	static OpponentClass StipeMiocic = new OpponentClass();
	static OpponentClass DanielCormier = new OpponentClass();
	static OpponentClass FrancisNgannou = new OpponentClass();
	static OpponentClass CurtisBlaydes = new OpponentClass();
	static OpponentClass JuniorDosSantos = new OpponentClass();
	static OpponentClass DerrickLewis = new OpponentClass();
	static OpponentClass JairzinhoRozenstruik = new OpponentClass();
	static OpponentClass AlexanderVolkov = new OpponentClass();
	static OpponentClass AlistairOvereem = new OpponentClass();
	static OpponentClass WaltHarris = new OpponentClass();
	
	public static void createFighter() {
		// 1 - 2:  Worst
		// 3 - 4:  Bad
		// 5 - 6:  Average
		// 7 - 8:  Good
		// 9 - 10: Elite
		
		// Flyweight
		DeivesonFigueiredo.setClass(7, 8, 8, 7, 8, 7, 7, 6, "DEIVESON", "FIGUEIREDO", 18, 1, 0, 1, "BRAZIL");
		JosephBenavidez.setClass(7, 8, 9, 7, 8, 8, 7, 5, "JOSEPH", "BENAVIDEZ", 28, 6, 1, 1, "USA");
		JussierFormiga.setClass(6, 8, 9, 6, 6, 9, 7, 4, "JUSSIER", "FORMIGA", 23, 7, 2, 1, "BRAZIL");
		AlexandrePantoja.setClass(7, 8, 8, 8, 7, 7, 7, 4, "ALEXANDRE", "PANTOJA", 22, 4, 3, 1, "BRAZIL");
		BrandonMoreno.setClass(6, 8, 6, 7, 6, 8, 7, 4, "BRANDON", "MORENO", 17, 5, 4, 1, "MEXICO");
		AskarAskarov.setClass(6, 7, 7, 7, 6, 8, 7, 7, "ASKAR", "ASKAROV", 11, 0, 5, 1, "RUSSIA");
		KaiKaraFrance.setClass(7, 8, 9, 8, 8, 6, 8, 6, "KAI", "KARA-FRANCE", 21, 8, 6, 1, "NEW ZEALAND");
		RogerioBontorin.setClass(6, 8, 7, 7, 6, 8, 7, 5, "ROGERIO", "BONTORIN", 16, 2, 7, 1, "BRAZIL");
		AlexPerez.setClass(6, 8, 9, 7, 6, 7, 7, 6, "ALEX", "PEREZ", 23, 5, 8, 1, "USA");
		MattSchnell.setClass(6, 8, 8, 5, 5, 8, 7, 4, "MATT", "SCHNELL", 14, 5, 9, 1, "USA");
		
		// Bantamweight
		HenryCejudo.setClass(7, 8, 8, 7, 8, 6, 8, 6, "HENRY", "CEJUDO", 15, 2, 0, 2, "USA");
		MarlonMoraes.setClass(7, 8, 8, 7, 8, 7, 8, 5, "MARLON", "MORAES", 23, 6, 1, 2, "BRAZIL");
		AljamainSterling.setClass(6, 8, 8, 7, 7, 8, 7, 5, "ALJAMAIN", "STERLING", 18, 3, 2, 2, "USA");
		PetrYan.setClass(7, 8, 8, 7, 8, 7, 7, 7, "PETR", "YAN", 14, 1, 3, 2, "RUSSIA");
		CorySandhagen.setClass(7, 7, 7, 7, 7, 7, 7, 7, "CORY", "SANDHAGEN", 12, 1, 4, 2, "USA");
		RaphaelAssuncao.setClass(6, 7, 8, 7, 6, 8, 7, 4, "RAPHAEL", "ASSUNCAO", 27, 7, 5, 2, "BRAZIL");
		PedroMunhoz.setClass(6, 7, 6, 7, 7, 8, 7, 5, "PEDRO", "MUNHOZ", 18, 4, 6, 2, "BRAZIL");
		JimmieRivera.setClass(6, 7, 9, 7, 6, 5, 7, 2, "JIMMIE", "RIVERA", 22, 4, 7, 2, "USA");
		CodyGarbrandt.setClass(8, 8, 6, 7, 8, 6, 7, 2, "CODY", "GARBRANDT", 11, 3, 8, 2, "USA");
		SeanOMalley.setClass(8, 8, 7, 7, 10, 6, 10, 7, "SEAN", "O'MALLEY", 11, 0, 9, 2, "USA");
		
		// Featherweight
		AlexanderVolkanovski.setClass(8, 7, 8, 7, 8, 7, 9, 7, "ALEXANDER", "VOLKANOVSKI", 21, 1, 0, 3, "AUSTRALIA");
		MaxHolloway.setClass(7, 9, 10, 8, 10, 6, 8, 6, "MAX", "HOLLOWAY", 21, 5, 1, 3, "USA");
		BrianOrtega.setClass(7, 7, 8, 9, 7, 8, 7, 6, "BRIAN", "ORTEGA", 14, 1, 2, 3, "USA");
		ZabitMagomedsharipov.setClass(7, 8, 8, 7, 8, 8, 8, 7, "ZABIT", "MAGOMEDSHARIPOV", 18, 1, 3, 3, "RUSSIA");
		ChanSungJung.setClass(7, 7, 7, 7, 7, 7, 7, 5, "CHAN SUNG", "JUNG", 16, 5, 4, 3, "KOREA");
		YairRodriguez.setClass(7, 7, 7, 7, 7, 7, 7, 6, "YAIR", "RODRIGUEZ", 13, 2, 5, 3, "MEXICO");
		FrankieEdgar.setClass(7, 7, 8, 7, 7, 7, 7, 3, "FRANKIE", "EDGAR", 23, 8, 6, 3, "USA");
		JeremyStephens.setClass(8, 7, 5, 7, 8, 5, 7, 1, "JEREMY", "STEPHENS", 28, 17, 7, 3, "USA");
		JoseAldo.setClass(8, 8, 8, 6, 9, 6, 8, 1, "JOSE", "ALDO", 28, 6, 8, 3, "BRAZIL");
		SodiqYusuff.setClass(7, 9, 8, 7, 8, 5, 7, 6, "SODIQ", "YUSUFF", 11, 1, 9, 3, "NIGERIA");
		
		// Lightweight
		KhabibNurmagomedov.setClass(8, 6, 7, 7, 5, 10, 6, 7, "KHABIB", "NURMAGOMEDOV", 28, 0, 0, 4, "RUSSIA");
		TonyFerguson.setClass(7, 7, 8, 9, 8, 8, 8, 7, "TONY", "FERGUSON", 25, 3, 1, 4, "USA");
		DustinPoirier.setClass(7, 7, 8, 7, 9, 8, 7, 5, "DUSTIN", "POIRIER", 25, 6, 2, 4, "USA");
		ConorMcGregor.setClass(8, 9, 3, 8, 10, 5, 10, 6, "CONOR", "MCGREGOR", 22, 4, 3, 4, "IRELAND");
		JustinGaethje.setClass(8, 7, 6, 6, 9, 6, 7, 7, "JUSTIN", "GAETHJE", 21, 2, 4, 4, "USA");
		DanHooker.setClass(8, 7, 6, 7, 9, 8, 8, 5, "DAN", "HOOKER", 20, 8, 5, 4, "NEW ZEALAND");
		DonaldCerrone.setClass(8, 7, 7, 4, 8, 8, 6, 1, "DONALD", "CERRONE", 36, 14, 6, 4, "USA");
		PaulFelder.setClass(8, 8, 6, 7, 9, 6, 7, 4, "PAUL", "FELDER", 17, 5, 7, 4, "USA");
		CharlesOliveira.setClass(7, 7, 6, 5, 7, 10, 7, 7, "CHARLES", "OLIVEIRA", 29, 8, 8, 4, "BRAZIL");
		IslamMakhachev.setClass(6, 6, 8, 7, 6, 7, 7, 7, "ISLAM", "MAKHACHEV", 18, 1, 9, 4, "RUSSIA");
		
		// Welterweight
		KamaruUsman.setClass(8, 7, 9, 8, 7, 9, 8, 7, "KAMARU", "USMAN", 16, 1, 0, 5, "NIGERIA");
		TyronWoodley.setClass(8, 7, 8, 8, 8, 9, 8, 5, "TYRON", "WOODLEY", 19, 4, 1, 5, "USA");
		ColbyCovington.setClass(6, 8, 10, 9, 8, 9, 8, 5, "COLBY", "COVINGTON", 15, 2, 2, 5, "USA");
		JorgeMasvidal.setClass(8, 7, 8, 8, 8, 5, 6, 7, "JORGE", "MASVIDAL", 35, 13, 3, 5, "USA");
		LeonEdwards.setClass(7, 7, 7, 7, 7, 7, 7, 7, "LEON", "EDWARDS", 18, 3, 4, 5, "ENGLAND");
		StephenThompson.setClass(7, 8, 8, 7, 10, 5, 8, 5, "STEPHEN", "THOMPSON", 15, 4, 5, 5, "USA");
		DemianMaia.setClass(4, 5, 7, 7, 3, 9, 8, 3, "DEMIAN", "MAIA", 28, 10, 6, 5, "BRAZIL");
		RafaelDosAnjos.setClass(6, 7, 8, 8, 7, 8, 7, 1, "RAFAEL", "DOS ANJOS", 16, 1, 7, 5, "BRAZIL");
		NateDiaz.setClass(7, 6, 10, 10, 6, 10, 7, 4, "NATE", "DIAZ", 20, 12, 8, 5, "USA");
		AnthonyPettis.setClass(8, 7, 4, 7, 9, 8, 5, 1, "ANTHONY", "PETTIS", 22, 10, 9, 5, "USA");
		
		// Middleweight
		IsraelAdesanya.setClass(6, 9, 9, 7, 10, 7, 10, 7, "ISRAEL", "ADESANYA", 19, 0, 0, 6, "NIGERIA");
		PauloCosta.setClass(9, 6, 5, 7, 8, 6, 6, 7, "PAULO", "COSTA", 13, 0, 1, 6, "BRAZIL");
		RobertWhittaker.setClass(8, 8, 7, 6, 8, 7, 7, 5, "ROBERT", "WHITTAKER", 20, 5, 2, 6, "AUSTRALIA");
		JaredCannonier.setClass(8, 7, 6, 7, 7, 6, 8, 6, "JARED", "CANNONIER", 13, 4, 3, 6, "USA");
		YoelRomero.setClass(10, 8, 9, 9, 8, 6, 3, 1, "YOEL", "ROMERO", 13, 5, 4, 6, "CUBA");
		DarrenTill.setClass(8, 7, 5, 7, 8, 6, 6, 4, "DARREN", "TILL", 18, 2, 5, 6, "ENGLAND");
		KelvinGastelum.setClass(9, 6, 9, 9, 7, 8, 7, 3, "KELVIN", "GASTELUM", 15, 5, 6, 6, "USA");
		DerekBrunson.setClass(8, 7, 7, 5, 7, 8, 7, 4, "DEREK", "BRUNSON", 20, 7, 7, 6, "USA");
		BradTavares.setClass(6, 7, 7, 6, 6, 5, 7, 1, "BRAD", "TAVARES", 17, 6, 8, 6, "USA");
		AndersonSilva.setClass(7, 8, 7, 5, 8, 6, 9, 1, "ANDERSON", "SILVA", 34, 10, 9, 6, "BRAZIL");
		
		// Light Heavyweight
		JonJones.setClass(8, 8, 8, 8, 8, 8, 9, 7, "JON", "JONES", 26, 1, 0, 7, "USA");
		DominickReyes.setClass(8, 8, 6, 7, 8, 6, 7, 6, "DOMINICK", "REYES", 12, 1, 1, 7, "USA");
		ThiagoSantos.setClass(8, 6, 7, 8, 7, 7, 6, 5, "THIAGO", "SANTOS", 21, 7, 2, 7, "BRAZIL");
		AnthonySmith.setClass(8, 6, 7, 7, 8, 8, 6, 5, "ANTHONY", "SMITH", 32, 14, 3, 7, "USA");
		JanBlachowicz.setClass(7, 7, 8, 7, 8, 8, 8, 6, "JAN", "BLACHOWICZ", 26, 8, 4, 7, "POLAND");
		CoreyAnderson.setClass(7, 6, 6, 4, 7, 8, 8, 5, "COREY", "ANDERSON", 13, 5, 5, 7, "USA");
		VolkanOezdemir.setClass(9, 6, 6, 8, 8, 5, 6, 2, "VOLKAN", "OEZDEMIR", 17, 4, 6, 7, "SWITZERLAND");
		AlexanderGustafsson.setClass(8, 8, 7, 7, 8, 6, 7, 2, "ALEXANDER", "GUSTAFSSON", 18, 6, 7, 7, "SWEDEN");
		GloverTeixeira.setClass(8, 6, 5, 6, 7, 8, 7, 4, "GLOVER", "TEIXEIRA", 30, 7, 8, 7, "BRAZIL");
		JohnnyWalker.setClass(8, 8, 7, 6, 9, 6, 7, 4, "JOHNNY", "WALKER", 17, 5, 9, 7, "BRAZIL");
		
		// Heavyweight
		StipeMiocic.setClass(9, 6, 6, 7, 8, 5, 7, 6, "STIPE", "MIOCIC", 19, 3, 0, 8, "USA");
		DanielCormier.setClass(9, 6, 6, 7, 6, 9, 7, 5, "DANIEL", "CORMIER", 22, 2, 1, 8, "USA");
		FrancisNgannou.setClass(10, 6, 6, 8, 8, 7, 7, 5, "FRANCIS", "NGANNOU", 14, 3, 2, 8, "CAMEROON");
		CurtisBlaydes.setClass(9, 6, 6, 7, 8, 6, 7, 4, "CURTIS", "BLAYDES", 13, 2, 3, 8, "USA");
		JuniorDosSantos.setClass(9, 6, 6, 5, 8, 6, 7, 3, "JUNIOR", "DOS SANTOS", 21, 7, 4, 8, "BRAZIL");
		DerrickLewis.setClass(9, 5, 5, 6, 7, 7, 7, 4, "COREY", "ANDERSON", 23, 7, 5, 8, "USA");
		JairzinhoRozenstruik.setClass(9, 6, 6, 7, 9, 6, 8, 7, "JAIRZINHO", "ROZENSTRUIK", 10, 0, 6, 8, "SURINAME");
		AlexanderVolkov.setClass(9, 7, 7, 7, 8, 6, 7, 5, "ALEXANDER", "VOLKOV", 31, 7, 7, 8, "RUSSIA");
		AlistairOvereem.setClass(9, 6, 6, 3, 8, 8, 7, 2, "ALISTAIR", "OVEREEM", 45, 18, 8, 8, "NETHERLANDS");
		WaltHarris.setClass(9, 6, 6, 6, 8, 5, 7, 5, "WALT", "HARRIS", 13, 7, 9, 8, "USA");
	}

}
