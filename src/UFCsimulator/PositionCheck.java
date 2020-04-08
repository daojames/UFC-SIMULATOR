package UFCsimulator;

public class PositionCheck {
	
	static String[][] flyStr = new String[11][3];
	static Double[][] flyDbl = new Double[11][8];
	static Integer[][] flyInt = new Integer[11][4];
	static Boolean[][] flyBool = new Boolean[11][1];
	
	static String[][] bantamStr = new String[11][3];
	static Double[][] bantamDbl = new Double[11][8];
	static Integer[][] bantamInt = new Integer[11][4];
	static Boolean[][] bantamBool = new Boolean[11][1];
	
	static String[][] featherStr = new String[11][3];
	static Double[][] featherDbl = new Double[11][8];
	static Integer[][] featherInt = new Integer[11][4];
	static Boolean[][] featherBool = new Boolean[11][1];
	
	static String[][] lightStr = new String[11][3];
	static Double[][] lightDbl = new Double[11][8];
	static Integer[][] lightInt = new Integer[11][4];
	static Boolean[][] lightBool = new Boolean[11][1];
	
	static String[][] welterStr = new String[11][3];
	static Double[][] welterDbl = new Double[11][8];
	static Integer[][] welterInt = new Integer[11][4];
	static Boolean[][] welterBool = new Boolean[11][1];
	
	static String[][] middleStr = new String[11][3];
	static Double[][] middleDbl = new Double[11][8];
	static Integer[][] middleInt = new Integer[11][4];
	static Boolean[][] middleBool = new Boolean[11][1];
	
	static String[][] lheavyStr = new String[11][3];
	static Double[][] lheavyDbl = new Double[11][8];
	static Integer[][] lheavyInt = new Integer[11][4];
	static Boolean[][] lheavyBool = new Boolean[11][1];
	
	static String[][] heavyStr = new String[11][3];
	static Double[][] heavyDbl = new Double[11][8];
	static Integer[][] heavyInt = new Integer[11][4];
	static Boolean[][] heavyBool = new Boolean[11][1];

	public static void positionCheck() {
		
		for (int i = 0; i < 11; ++i) {
			opponentSearch(i, 1);
			
			if (flyStr[i][0] == null) {
				flyStr[i][0] = Weight.Player.first;
				flyStr[i][1] = Weight.Player.last;
				flyStr[i][2] = Weight.Player.country;
				
				flyDbl[i][0] = Weight.Player.str;
				flyDbl[i][1] = Weight.Player.spd;
				flyDbl[i][2] = Weight.Player.stm;
				flyDbl[i][3] = Weight.Player.chin;
				flyDbl[i][4] = Weight.Player.strk;
				flyDbl[i][5] = Weight.Player.wrst;
				flyDbl[i][6] = Weight.Player.iq;
				flyDbl[i][7] = Weight.Player.luck;
				
				flyInt[i][0] = Weight.Player.win;
				flyInt[i][1] = Weight.Player.loss;
				flyInt[i][2] = Weight.Player.position;
				flyInt[i][3] = Weight.Player.weight;
				
				flyBool[i][0] = false;
			}
		}
		
		for (int i = 0; i < 11; ++i) {
			opponentSearch(i, 2);
			
			if (bantamStr[i][0] == null) {
				bantamStr[i][0] = Weight.Player.first;
				bantamStr[i][1] = Weight.Player.last;
				bantamStr[i][2] = Weight.Player.country;
				
				bantamDbl[i][0] = Weight.Player.str;
				bantamDbl[i][1] = Weight.Player.spd;
				bantamDbl[i][2] = Weight.Player.stm;
				bantamDbl[i][3] = Weight.Player.chin;
				bantamDbl[i][4] = Weight.Player.strk;
				bantamDbl[i][5] = Weight.Player.wrst;
				bantamDbl[i][6] = Weight.Player.iq;
				bantamDbl[i][7] = Weight.Player.luck;
				
				bantamInt[i][0] = Weight.Player.win;
				bantamInt[i][1] = Weight.Player.loss;
				bantamInt[i][2] = Weight.Player.position;
				bantamInt[i][3] = Weight.Player.weight;
				
				bantamBool[i][0] = false;
			}
		}
		
		for (int i = 0; i < 11; ++i) {
			opponentSearch(i, 3);
			
			if (featherStr[i][0] == null) {
				featherStr[i][0] = Weight.Player.first;
				featherStr[i][1] = Weight.Player.last;
				featherStr[i][2] = Weight.Player.country;
				
				featherDbl[i][0] = Weight.Player.str;
				featherDbl[i][1] = Weight.Player.spd;
				featherDbl[i][2] = Weight.Player.stm;
				featherDbl[i][3] = Weight.Player.chin;
				featherDbl[i][4] = Weight.Player.strk;
				featherDbl[i][5] = Weight.Player.wrst;
				featherDbl[i][6] = Weight.Player.iq;
				featherDbl[i][7] = Weight.Player.luck;
				
				featherInt[i][0] = Weight.Player.win;
				featherInt[i][1] = Weight.Player.loss;
				featherInt[i][2] = Weight.Player.position;
				featherInt[i][3] = Weight.Player.weight;
				
				featherBool[i][0] = false;
			}
		}
		
		for (int i = 0; i < 11; ++i) {
			opponentSearch(i, 4);
			
			if (lightStr[i][0] == null) {
				lightStr[i][0] = Weight.Player.first;
				lightStr[i][1] = Weight.Player.last;
				lightStr[i][2] = Weight.Player.country;
				
				lightDbl[i][0] = Weight.Player.str;
				lightDbl[i][1] = Weight.Player.spd;
				lightDbl[i][2] = Weight.Player.stm;
				lightDbl[i][3] = Weight.Player.chin;
				lightDbl[i][4] = Weight.Player.strk;
				lightDbl[i][5] = Weight.Player.wrst;
				lightDbl[i][6] = Weight.Player.iq;
				lightDbl[i][7] = Weight.Player.luck;
				
				lightInt[i][0] = Weight.Player.win;
				lightInt[i][1] = Weight.Player.loss;
				lightInt[i][2] = Weight.Player.position;
				lightInt[i][3] = Weight.Player.weight;
				
				lightBool[i][0] = false;
			}
		}
		
		for (int i = 0; i < 11; ++i) {
			opponentSearch(i, 5);
			
			if (welterStr[i][0] == null) {
				welterStr[i][0] = Weight.Player.first;
				welterStr[i][1] = Weight.Player.last;
				welterStr[i][2] = Weight.Player.country;
				
				welterDbl[i][0] = Weight.Player.str;
				welterDbl[i][1] = Weight.Player.spd;
				welterDbl[i][2] = Weight.Player.stm;
				welterDbl[i][3] = Weight.Player.chin;
				welterDbl[i][4] = Weight.Player.strk;
				welterDbl[i][5] = Weight.Player.wrst;
				welterDbl[i][6] = Weight.Player.iq;
				welterDbl[i][7] = Weight.Player.luck;
				
				welterInt[i][0] = Weight.Player.win;
				welterInt[i][1] = Weight.Player.loss;
				welterInt[i][2] = Weight.Player.position;
				welterInt[i][3] = Weight.Player.weight;
				
				welterBool[i][0] = false;
			}
		}
		
		for (int i = 0; i < 11; ++i) {
			opponentSearch(i, 6);
			
			if (middleStr[i][0] == null) {
				middleStr[i][0] = Weight.Player.first;
				middleStr[i][1] = Weight.Player.last;
				middleStr[i][2] = Weight.Player.country;
				
				middleDbl[i][0] = Weight.Player.str;
				middleDbl[i][1] = Weight.Player.spd;
				middleDbl[i][2] = Weight.Player.stm;
				middleDbl[i][3] = Weight.Player.chin;
				middleDbl[i][4] = Weight.Player.strk;
				middleDbl[i][5] = Weight.Player.wrst;
				middleDbl[i][6] = Weight.Player.iq;
				middleDbl[i][7] = Weight.Player.luck;
				
				middleInt[i][0] = Weight.Player.win;
				middleInt[i][1] = Weight.Player.loss;
				middleInt[i][2] = Weight.Player.position;
				middleInt[i][3] = Weight.Player.weight;
				
				middleBool[i][0] = false;
			}
		}
		
		for (int i = 0; i < 11; ++i) {
			opponentSearch(i, 7);
			
			if (lheavyStr[i][0] == null) {
				lheavyStr[i][0] = Weight.Player.first;
				lheavyStr[i][1] = Weight.Player.last;
				lheavyStr[i][2] = Weight.Player.country;
				
				lheavyDbl[i][0] = Weight.Player.str;
				lheavyDbl[i][1] = Weight.Player.spd;
				lheavyDbl[i][2] = Weight.Player.stm;
				lheavyDbl[i][3] = Weight.Player.chin;
				lheavyDbl[i][4] = Weight.Player.strk;
				lheavyDbl[i][5] = Weight.Player.wrst;
				lheavyDbl[i][6] = Weight.Player.iq;
				lheavyDbl[i][7] = Weight.Player.luck;
				
				lheavyInt[i][0] = Weight.Player.win;
				lheavyInt[i][1] = Weight.Player.loss;
				lheavyInt[i][2] = Weight.Player.position;
				lheavyInt[i][3] = Weight.Player.weight;
				
				lheavyBool[i][0] = false;
			}
		}
		
		for (int i = 0; i < 11; ++i) {
			opponentSearch(i, 8);
			
			if (heavyStr[i][0] == null) {
				heavyStr[i][0] = Weight.Player.first;
				heavyStr[i][1] = Weight.Player.last;
				heavyStr[i][2] = Weight.Player.country;
				
				heavyDbl[i][0] = Weight.Player.str;
				heavyDbl[i][1] = Weight.Player.spd;
				heavyDbl[i][2] = Weight.Player.stm;
				heavyDbl[i][3] = Weight.Player.chin;
				heavyDbl[i][4] = Weight.Player.strk;
				heavyDbl[i][5] = Weight.Player.wrst;
				heavyDbl[i][6] = Weight.Player.iq;
				heavyDbl[i][7] = Weight.Player.luck;
				
				heavyInt[i][0] = Weight.Player.win;
				heavyInt[i][1] = Weight.Player.loss;
				heavyInt[i][2] = Weight.Player.position;
				heavyInt[i][3] = Weight.Player.weight;
				
				heavyBool[i][0] = false;
			}
		}
		
	}
	
	public static void opponentSearch(int pos, int weight) {
		
		if (weight == 1) {
			if (CreateFighter.DeivesonFigueiredo.getPos() == pos) {
				flyStr[pos][0] = CreateFighter.DeivesonFigueiredo.first;
				flyStr[pos][1] = CreateFighter.DeivesonFigueiredo.last;
				flyStr[pos][2] = CreateFighter.DeivesonFigueiredo.country;
				
				flyDbl[pos][0] = CreateFighter.DeivesonFigueiredo.str;
				flyDbl[pos][1] = CreateFighter.DeivesonFigueiredo.spd;
				flyDbl[pos][2] = CreateFighter.DeivesonFigueiredo.stm;
				flyDbl[pos][3] = CreateFighter.DeivesonFigueiredo.chin;
				flyDbl[pos][4] = CreateFighter.DeivesonFigueiredo.strk;
				flyDbl[pos][5] = CreateFighter.DeivesonFigueiredo.wrst;
				flyDbl[pos][6] = CreateFighter.DeivesonFigueiredo.iq;
				flyDbl[pos][7] = CreateFighter.DeivesonFigueiredo.luck;
				
				flyInt[pos][0] = CreateFighter.DeivesonFigueiredo.win;
				flyInt[pos][1] = CreateFighter.DeivesonFigueiredo.loss;
				flyInt[pos][2] = CreateFighter.DeivesonFigueiredo.position;
				flyInt[pos][3] = CreateFighter.DeivesonFigueiredo.weight;
				
				flyBool[pos][0] = CreateFighter.DeivesonFigueiredo.mad;
			}
			else if (CreateFighter.JosephBenavidez.getPos() == pos) {
				flyStr[pos][0] = CreateFighter.JosephBenavidez.first;
				flyStr[pos][1] = CreateFighter.JosephBenavidez.last;
				flyStr[pos][2] = CreateFighter.JosephBenavidez.country;
				
				flyDbl[pos][0] = CreateFighter.JosephBenavidez.str;
				flyDbl[pos][1] = CreateFighter.JosephBenavidez.spd;
				flyDbl[pos][2] = CreateFighter.JosephBenavidez.stm;
				flyDbl[pos][3] = CreateFighter.JosephBenavidez.chin;
				flyDbl[pos][4] = CreateFighter.JosephBenavidez.strk;
				flyDbl[pos][5] = CreateFighter.JosephBenavidez.wrst;
				flyDbl[pos][6] = CreateFighter.JosephBenavidez.iq;
				flyDbl[pos][7] = CreateFighter.JosephBenavidez.luck;
				
				flyInt[pos][0] = CreateFighter.JosephBenavidez.win;
				flyInt[pos][1] = CreateFighter.JosephBenavidez.loss;
				flyInt[pos][2] = CreateFighter.JosephBenavidez.position;
				flyInt[pos][3] = CreateFighter.JosephBenavidez.weight;
				
				flyBool[pos][0] = CreateFighter.JosephBenavidez.mad;
			}
			else if (CreateFighter.JussierFormiga.getPos() == pos) {
				flyStr[pos][0] = CreateFighter.JussierFormiga.first;
				flyStr[pos][1] = CreateFighter.JussierFormiga.last;
				flyStr[pos][2] = CreateFighter.JussierFormiga.country;
				
				flyDbl[pos][0] = CreateFighter.JussierFormiga.str;
				flyDbl[pos][1] = CreateFighter.JussierFormiga.spd;
				flyDbl[pos][2] = CreateFighter.JussierFormiga.stm;
				flyDbl[pos][3] = CreateFighter.JussierFormiga.chin;
				flyDbl[pos][4] = CreateFighter.JussierFormiga.strk;
				flyDbl[pos][5] = CreateFighter.JussierFormiga.wrst;
				flyDbl[pos][6] = CreateFighter.JussierFormiga.iq;
				flyDbl[pos][7] = CreateFighter.JussierFormiga.luck;
				
				flyInt[pos][0] = CreateFighter.JussierFormiga.win;
				flyInt[pos][1] = CreateFighter.JussierFormiga.loss;
				flyInt[pos][2] = CreateFighter.JussierFormiga.position;
				flyInt[pos][3] = CreateFighter.JussierFormiga.weight;
				
				flyBool[pos][0] = CreateFighter.JussierFormiga.mad;
			}
			else if (CreateFighter.AlexandrePantoja.getPos() == pos) {
				flyStr[pos][0] = CreateFighter.AlexandrePantoja.first;
				flyStr[pos][1] = CreateFighter.AlexandrePantoja.last;
				flyStr[pos][2] = CreateFighter.AlexandrePantoja.country;
				
				flyDbl[pos][0] = CreateFighter.AlexandrePantoja.str;
				flyDbl[pos][1] = CreateFighter.AlexandrePantoja.spd;
				flyDbl[pos][2] = CreateFighter.AlexandrePantoja.stm;
				flyDbl[pos][3] = CreateFighter.AlexandrePantoja.chin;
				flyDbl[pos][4] = CreateFighter.AlexandrePantoja.strk;
				flyDbl[pos][5] = CreateFighter.AlexandrePantoja.wrst;
				flyDbl[pos][6] = CreateFighter.AlexandrePantoja.iq;
				flyDbl[pos][7] = CreateFighter.AlexandrePantoja.luck;
				
				flyInt[pos][0] = CreateFighter.AlexandrePantoja.win;
				flyInt[pos][1] = CreateFighter.AlexandrePantoja.loss;
				flyInt[pos][2] = CreateFighter.AlexandrePantoja.position;
				flyInt[pos][3] = CreateFighter.AlexandrePantoja.weight;
				
				flyBool[pos][0] = CreateFighter.AlexandrePantoja.mad;
			}
			else if (CreateFighter.BrandonMoreno.getPos() == pos) {
				flyStr[pos][0] = CreateFighter.BrandonMoreno.first;
				flyStr[pos][1] = CreateFighter.BrandonMoreno.last;
				flyStr[pos][2] = CreateFighter.BrandonMoreno.country;
				
				flyDbl[pos][0] = CreateFighter.BrandonMoreno.str;
				flyDbl[pos][1] = CreateFighter.BrandonMoreno.spd;
				flyDbl[pos][2] = CreateFighter.BrandonMoreno.stm;
				flyDbl[pos][3] = CreateFighter.BrandonMoreno.chin;
				flyDbl[pos][4] = CreateFighter.BrandonMoreno.strk;
				flyDbl[pos][5] = CreateFighter.BrandonMoreno.wrst;
				flyDbl[pos][6] = CreateFighter.BrandonMoreno.iq;
				flyDbl[pos][7] = CreateFighter.BrandonMoreno.luck;
				
				flyInt[pos][0] = CreateFighter.BrandonMoreno.win;
				flyInt[pos][1] = CreateFighter.BrandonMoreno.loss;
				flyInt[pos][2] = CreateFighter.BrandonMoreno.position;
				flyInt[pos][3] = CreateFighter.BrandonMoreno.weight;
				
				flyBool[pos][0] = CreateFighter.BrandonMoreno.mad;
			}
			else if (CreateFighter.AskarAskarov.getPos() == pos) {
				flyStr[pos][0] = CreateFighter.AskarAskarov.first;
				flyStr[pos][1] = CreateFighter.AskarAskarov.last;
				flyStr[pos][2] = CreateFighter.AskarAskarov.country;
				
				flyDbl[pos][0] = CreateFighter.AskarAskarov.str;
				flyDbl[pos][1] = CreateFighter.AskarAskarov.spd;
				flyDbl[pos][2] = CreateFighter.AskarAskarov.stm;
				flyDbl[pos][3] = CreateFighter.AskarAskarov.chin;
				flyDbl[pos][4] = CreateFighter.AskarAskarov.strk;
				flyDbl[pos][5] = CreateFighter.AskarAskarov.wrst;
				flyDbl[pos][6] = CreateFighter.AskarAskarov.iq;
				flyDbl[pos][7] = CreateFighter.AskarAskarov.luck;
				
				flyInt[pos][0] = CreateFighter.AskarAskarov.win;
				flyInt[pos][1] = CreateFighter.AskarAskarov.loss;
				flyInt[pos][2] = CreateFighter.AskarAskarov.position;
				flyInt[pos][3] = CreateFighter.AskarAskarov.weight;
				
				flyBool[pos][0] = CreateFighter.AskarAskarov.mad;
			}
			else if (CreateFighter.KaiKaraFrance.getPos() == pos) {
				flyStr[pos][0] = CreateFighter.KaiKaraFrance.first;
				flyStr[pos][1] = CreateFighter.KaiKaraFrance.last;
				flyStr[pos][2] = CreateFighter.KaiKaraFrance.country;
				
				flyDbl[pos][0] = CreateFighter.KaiKaraFrance.str;
				flyDbl[pos][1] = CreateFighter.KaiKaraFrance.spd;
				flyDbl[pos][2] = CreateFighter.KaiKaraFrance.stm;
				flyDbl[pos][3] = CreateFighter.KaiKaraFrance.chin;
				flyDbl[pos][4] = CreateFighter.KaiKaraFrance.strk;
				flyDbl[pos][5] = CreateFighter.KaiKaraFrance.wrst;
				flyDbl[pos][6] = CreateFighter.KaiKaraFrance.iq;
				flyDbl[pos][7] = CreateFighter.KaiKaraFrance.luck;
				
				flyInt[pos][0] = CreateFighter.KaiKaraFrance.win;
				flyInt[pos][1] = CreateFighter.KaiKaraFrance.loss;
				flyInt[pos][2] = CreateFighter.KaiKaraFrance.position;
				flyInt[pos][3] = CreateFighter.KaiKaraFrance.weight;
				
				flyBool[pos][0] = CreateFighter.KaiKaraFrance.mad;
			}
			else if (CreateFighter.RogerioBontorin.getPos() == pos) {
				flyStr[pos][0] = CreateFighter.RogerioBontorin.first;
				flyStr[pos][1] = CreateFighter.RogerioBontorin.last;
				flyStr[pos][2] = CreateFighter.RogerioBontorin.country;
				
				flyDbl[pos][0] = CreateFighter.RogerioBontorin.str;
				flyDbl[pos][1] = CreateFighter.RogerioBontorin.spd;
				flyDbl[pos][2] = CreateFighter.RogerioBontorin.stm;
				flyDbl[pos][3] = CreateFighter.RogerioBontorin.chin;
				flyDbl[pos][4] = CreateFighter.RogerioBontorin.strk;
				flyDbl[pos][5] = CreateFighter.RogerioBontorin.wrst;
				flyDbl[pos][6] = CreateFighter.RogerioBontorin.iq;
				flyDbl[pos][7] = CreateFighter.RogerioBontorin.luck;
				
				flyInt[pos][0] = CreateFighter.RogerioBontorin.win;
				flyInt[pos][1] = CreateFighter.RogerioBontorin.loss;
				flyInt[pos][2] = CreateFighter.RogerioBontorin.position;
				flyInt[pos][3] = CreateFighter.RogerioBontorin.weight;
				
				flyBool[pos][0] = CreateFighter.RogerioBontorin.mad;
			}
			else if (CreateFighter.AlexPerez.getPos() == pos) {
				flyStr[pos][0] = CreateFighter.AlexPerez.first;
				flyStr[pos][1] = CreateFighter.AlexPerez.last;
				flyStr[pos][2] = CreateFighter.AlexPerez.country;
				
				flyDbl[pos][0] = CreateFighter.AlexPerez.str;
				flyDbl[pos][1] = CreateFighter.AlexPerez.spd;
				flyDbl[pos][2] = CreateFighter.AlexPerez.stm;
				flyDbl[pos][3] = CreateFighter.AlexPerez.chin;
				flyDbl[pos][4] = CreateFighter.AlexPerez.strk;
				flyDbl[pos][5] = CreateFighter.AlexPerez.wrst;
				flyDbl[pos][6] = CreateFighter.AlexPerez.iq;
				flyDbl[pos][7] = CreateFighter.AlexPerez.luck;
				
				flyInt[pos][0] = CreateFighter.AlexPerez.win;
				flyInt[pos][1] = CreateFighter.AlexPerez.loss;
				flyInt[pos][2] = CreateFighter.AlexPerez.position;
				flyInt[pos][3] = CreateFighter.AlexPerez.weight;
				
				flyBool[pos][0] = CreateFighter.AlexPerez.mad;
			}
			else if (CreateFighter.MattSchnell.getPos() == pos) {
				flyStr[pos][0] = CreateFighter.MattSchnell.first;
				flyStr[pos][1] = CreateFighter.MattSchnell.last;
				flyStr[pos][2] = CreateFighter.MattSchnell.country;
				
				flyDbl[pos][0] = CreateFighter.MattSchnell.str;
				flyDbl[pos][1] = CreateFighter.MattSchnell.spd;
				flyDbl[pos][2] = CreateFighter.MattSchnell.stm;
				flyDbl[pos][3] = CreateFighter.MattSchnell.chin;
				flyDbl[pos][4] = CreateFighter.MattSchnell.strk;
				flyDbl[pos][5] = CreateFighter.MattSchnell.wrst;
				flyDbl[pos][6] = CreateFighter.MattSchnell.iq;
				flyDbl[pos][7] = CreateFighter.MattSchnell.luck;
				
				flyInt[pos][0] = CreateFighter.MattSchnell.win;
				flyInt[pos][1] = CreateFighter.MattSchnell.loss;
				flyInt[pos][2] = CreateFighter.MattSchnell.position;
				flyInt[pos][3] = CreateFighter.MattSchnell.weight;
				
				flyBool[pos][0] = CreateFighter.MattSchnell.mad;
			}
		}
		
		else if (weight == 2) {
			if (CreateFighter.HenryCejudo.getPos() == pos) {
				bantamStr[pos][0] = CreateFighter.HenryCejudo.first;
				bantamStr[pos][1] = CreateFighter.HenryCejudo.last;
				bantamStr[pos][2] = CreateFighter.HenryCejudo.country;
				
				bantamDbl[pos][0] = CreateFighter.HenryCejudo.str;
				bantamDbl[pos][1] = CreateFighter.HenryCejudo.spd;
				bantamDbl[pos][2] = CreateFighter.HenryCejudo.stm;
				bantamDbl[pos][3] = CreateFighter.HenryCejudo.chin;
				bantamDbl[pos][4] = CreateFighter.HenryCejudo.strk;
				bantamDbl[pos][5] = CreateFighter.HenryCejudo.wrst;
				bantamDbl[pos][6] = CreateFighter.HenryCejudo.iq;
				bantamDbl[pos][7] = CreateFighter.HenryCejudo.luck;
				
				bantamInt[pos][0] = CreateFighter.HenryCejudo.win;
				bantamInt[pos][1] = CreateFighter.HenryCejudo.loss;
				bantamInt[pos][2] = CreateFighter.HenryCejudo.position;
				bantamInt[pos][3] = CreateFighter.HenryCejudo.weight;
				
				bantamBool[pos][0] = CreateFighter.HenryCejudo.mad;
			}
			else if (CreateFighter.MarlonMoraes.getPos() == pos) {
				bantamStr[pos][0] = CreateFighter.MarlonMoraes.first;
				bantamStr[pos][1] = CreateFighter.MarlonMoraes.last;
				bantamStr[pos][2] = CreateFighter.MarlonMoraes.country;
				
				bantamDbl[pos][0] = CreateFighter.MarlonMoraes.str;
				bantamDbl[pos][1] = CreateFighter.MarlonMoraes.spd;
				bantamDbl[pos][2] = CreateFighter.MarlonMoraes.stm;
				bantamDbl[pos][3] = CreateFighter.MarlonMoraes.chin;
				bantamDbl[pos][4] = CreateFighter.MarlonMoraes.strk;
				bantamDbl[pos][5] = CreateFighter.MarlonMoraes.wrst;
				bantamDbl[pos][6] = CreateFighter.MarlonMoraes.iq;
				bantamDbl[pos][7] = CreateFighter.MarlonMoraes.luck;
				
				bantamInt[pos][0] = CreateFighter.MarlonMoraes.win;
				bantamInt[pos][1] = CreateFighter.MarlonMoraes.loss;
				bantamInt[pos][2] = CreateFighter.MarlonMoraes.position;
				bantamInt[pos][3] = CreateFighter.MarlonMoraes.weight;
				
				bantamBool[pos][0] = CreateFighter.MarlonMoraes.mad;
			}
			else if (CreateFighter.AljamainSterling.getPos() == pos) {
				bantamStr[pos][0] = CreateFighter.AljamainSterling.first;
				bantamStr[pos][1] = CreateFighter.AljamainSterling.last;
				bantamStr[pos][2] = CreateFighter.AljamainSterling.country;
				
				bantamDbl[pos][0] = CreateFighter.AljamainSterling.str;
				bantamDbl[pos][1] = CreateFighter.AljamainSterling.spd;
				bantamDbl[pos][2] = CreateFighter.AljamainSterling.stm;
				bantamDbl[pos][3] = CreateFighter.AljamainSterling.chin;
				bantamDbl[pos][4] = CreateFighter.AljamainSterling.strk;
				bantamDbl[pos][5] = CreateFighter.AljamainSterling.wrst;
				bantamDbl[pos][6] = CreateFighter.AljamainSterling.iq;
				bantamDbl[pos][7] = CreateFighter.AljamainSterling.luck;
				
				bantamInt[pos][0] = CreateFighter.AljamainSterling.win;
				bantamInt[pos][1] = CreateFighter.AljamainSterling.loss;
				bantamInt[pos][2] = CreateFighter.AljamainSterling.position;
				bantamInt[pos][3] = CreateFighter.AljamainSterling.weight;
				
				bantamBool[pos][0] = CreateFighter.AljamainSterling.mad;
			}
			else if (CreateFighter.PetrYan.getPos() == pos) {
				bantamStr[pos][0] = CreateFighter.PetrYan.first;
				bantamStr[pos][1] = CreateFighter.PetrYan.last;
				bantamStr[pos][2] = CreateFighter.PetrYan.country;
				
				bantamDbl[pos][0] = CreateFighter.PetrYan.str;
				bantamDbl[pos][1] = CreateFighter.PetrYan.spd;
				bantamDbl[pos][2] = CreateFighter.PetrYan.stm;
				bantamDbl[pos][3] = CreateFighter.PetrYan.chin;
				bantamDbl[pos][4] = CreateFighter.PetrYan.strk;
				bantamDbl[pos][5] = CreateFighter.PetrYan.wrst;
				bantamDbl[pos][6] = CreateFighter.PetrYan.iq;
				bantamDbl[pos][7] = CreateFighter.PetrYan.luck;
				
				bantamInt[pos][0] = CreateFighter.PetrYan.win;
				bantamInt[pos][1] = CreateFighter.PetrYan.loss;
				bantamInt[pos][2] = CreateFighter.PetrYan.position;
				bantamInt[pos][3] = CreateFighter.PetrYan.weight;
				
				bantamBool[pos][0] = CreateFighter.PetrYan.mad;
			}
			else if (CreateFighter.CorySandhagen.getPos() == pos) {
				bantamStr[pos][0] = CreateFighter.CorySandhagen.first;
				bantamStr[pos][1] = CreateFighter.CorySandhagen.last;
				bantamStr[pos][2] = CreateFighter.CorySandhagen.country;
				
				bantamDbl[pos][0] = CreateFighter.CorySandhagen.str;
				bantamDbl[pos][1] = CreateFighter.CorySandhagen.spd;
				bantamDbl[pos][2] = CreateFighter.CorySandhagen.stm;
				bantamDbl[pos][3] = CreateFighter.CorySandhagen.chin;
				bantamDbl[pos][4] = CreateFighter.CorySandhagen.strk;
				bantamDbl[pos][5] = CreateFighter.CorySandhagen.wrst;
				bantamDbl[pos][6] = CreateFighter.CorySandhagen.iq;
				bantamDbl[pos][7] = CreateFighter.CorySandhagen.luck;
				
				bantamInt[pos][0] = CreateFighter.CorySandhagen.win;
				bantamInt[pos][1] = CreateFighter.CorySandhagen.loss;
				bantamInt[pos][2] = CreateFighter.CorySandhagen.position;
				bantamInt[pos][3] = CreateFighter.CorySandhagen.weight;
				
				bantamBool[pos][0] = CreateFighter.CorySandhagen.mad;
			}
			else if (CreateFighter.RaphaelAssuncao.getPos() == pos) {
				bantamStr[pos][0] = CreateFighter.RaphaelAssuncao.first;
				bantamStr[pos][1] = CreateFighter.RaphaelAssuncao.last;
				bantamStr[pos][2] = CreateFighter.RaphaelAssuncao.country;
				
				bantamDbl[pos][0] = CreateFighter.RaphaelAssuncao.str;
				bantamDbl[pos][1] = CreateFighter.RaphaelAssuncao.spd;
				bantamDbl[pos][2] = CreateFighter.RaphaelAssuncao.stm;
				bantamDbl[pos][3] = CreateFighter.RaphaelAssuncao.chin;
				bantamDbl[pos][4] = CreateFighter.RaphaelAssuncao.strk;
				bantamDbl[pos][5] = CreateFighter.RaphaelAssuncao.wrst;
				bantamDbl[pos][6] = CreateFighter.RaphaelAssuncao.iq;
				bantamDbl[pos][7] = CreateFighter.RaphaelAssuncao.luck;
				
				bantamInt[pos][0] = CreateFighter.RaphaelAssuncao.win;
				bantamInt[pos][1] = CreateFighter.RaphaelAssuncao.loss;
				bantamInt[pos][2] = CreateFighter.RaphaelAssuncao.position;
				bantamInt[pos][3] = CreateFighter.RaphaelAssuncao.weight;
				
				bantamBool[pos][0] = CreateFighter.RaphaelAssuncao.mad;
			}
			else if (CreateFighter.PedroMunhoz.getPos() == pos) {
				bantamStr[pos][0] = CreateFighter.PedroMunhoz.first;
				bantamStr[pos][1] = CreateFighter.PedroMunhoz.last;
				bantamStr[pos][2] = CreateFighter.PedroMunhoz.country;
				
				bantamDbl[pos][0] = CreateFighter.PedroMunhoz.str;
				bantamDbl[pos][1] = CreateFighter.PedroMunhoz.spd;
				bantamDbl[pos][2] = CreateFighter.PedroMunhoz.stm;
				bantamDbl[pos][3] = CreateFighter.PedroMunhoz.chin;
				bantamDbl[pos][4] = CreateFighter.PedroMunhoz.strk;
				bantamDbl[pos][5] = CreateFighter.PedroMunhoz.wrst;
				bantamDbl[pos][6] = CreateFighter.PedroMunhoz.iq;
				bantamDbl[pos][7] = CreateFighter.PedroMunhoz.luck;
				
				bantamInt[pos][0] = CreateFighter.PedroMunhoz.win;
				bantamInt[pos][1] = CreateFighter.PedroMunhoz.loss;
				bantamInt[pos][2] = CreateFighter.PedroMunhoz.position;
				bantamInt[pos][3] = CreateFighter.PedroMunhoz.weight;
				
				bantamBool[pos][0] = CreateFighter.PedroMunhoz.mad;
			}
			else if (CreateFighter.JimmieRivera.getPos() == pos) {
				bantamStr[pos][0] = CreateFighter.JimmieRivera.first;
				bantamStr[pos][1] = CreateFighter.JimmieRivera.last;
				bantamStr[pos][2] = CreateFighter.JimmieRivera.country;
				
				bantamDbl[pos][0] = CreateFighter.JimmieRivera.str;
				bantamDbl[pos][1] = CreateFighter.JimmieRivera.spd;
				bantamDbl[pos][2] = CreateFighter.JimmieRivera.stm;
				bantamDbl[pos][3] = CreateFighter.JimmieRivera.chin;
				bantamDbl[pos][4] = CreateFighter.JimmieRivera.strk;
				bantamDbl[pos][5] = CreateFighter.JimmieRivera.wrst;
				bantamDbl[pos][6] = CreateFighter.JimmieRivera.iq;
				bantamDbl[pos][7] = CreateFighter.JimmieRivera.luck;
				
				bantamInt[pos][0] = CreateFighter.JimmieRivera.win;
				bantamInt[pos][1] = CreateFighter.JimmieRivera.loss;
				bantamInt[pos][2] = CreateFighter.JimmieRivera.position;
				bantamInt[pos][3] = CreateFighter.JimmieRivera.weight;
				
				bantamBool[pos][0] = CreateFighter.JimmieRivera.mad;
			}
			else if (CreateFighter.CodyGarbrandt.getPos() == pos) {
				bantamStr[pos][0] = CreateFighter.CodyGarbrandt.first;
				bantamStr[pos][1] = CreateFighter.CodyGarbrandt.last;
				bantamStr[pos][2] = CreateFighter.CodyGarbrandt.country;
				
				bantamDbl[pos][0] = CreateFighter.CodyGarbrandt.str;
				bantamDbl[pos][1] = CreateFighter.CodyGarbrandt.spd;
				bantamDbl[pos][2] = CreateFighter.CodyGarbrandt.stm;
				bantamDbl[pos][3] = CreateFighter.CodyGarbrandt.chin;
				bantamDbl[pos][4] = CreateFighter.CodyGarbrandt.strk;
				bantamDbl[pos][5] = CreateFighter.CodyGarbrandt.wrst;
				bantamDbl[pos][6] = CreateFighter.CodyGarbrandt.iq;
				bantamDbl[pos][7] = CreateFighter.CodyGarbrandt.luck;
				
				bantamInt[pos][0] = CreateFighter.CodyGarbrandt.win;
				bantamInt[pos][1] = CreateFighter.CodyGarbrandt.loss;
				bantamInt[pos][2] = CreateFighter.CodyGarbrandt.position;
				bantamInt[pos][3] = CreateFighter.CodyGarbrandt.weight;
				
				bantamBool[pos][0] = CreateFighter.CodyGarbrandt.mad;
			}
			else if (CreateFighter.SeanOMalley.getPos() == pos) {
				bantamStr[pos][0] = CreateFighter.SeanOMalley.first;
				bantamStr[pos][1] = CreateFighter.SeanOMalley.last;
				bantamStr[pos][2] = CreateFighter.SeanOMalley.country;
				
				bantamDbl[pos][0] = CreateFighter.SeanOMalley.str;
				bantamDbl[pos][1] = CreateFighter.SeanOMalley.spd;
				bantamDbl[pos][2] = CreateFighter.SeanOMalley.stm;
				bantamDbl[pos][3] = CreateFighter.SeanOMalley.chin;
				bantamDbl[pos][4] = CreateFighter.SeanOMalley.strk;
				bantamDbl[pos][5] = CreateFighter.SeanOMalley.wrst;
				bantamDbl[pos][6] = CreateFighter.SeanOMalley.iq;
				bantamDbl[pos][7] = CreateFighter.SeanOMalley.luck;
				
				bantamInt[pos][0] = CreateFighter.SeanOMalley.win;
				bantamInt[pos][1] = CreateFighter.SeanOMalley.loss;
				bantamInt[pos][2] = CreateFighter.SeanOMalley.position;
				bantamInt[pos][3] = CreateFighter.SeanOMalley.weight;
				
				bantamBool[pos][0] = CreateFighter.SeanOMalley.mad;
			}
		}
		
		else if (weight == 3) {
			if (CreateFighter.AlexanderVolkanovski.getPos() == pos) {
				featherStr[pos][0] = CreateFighter.AlexanderVolkanovski.first;
				featherStr[pos][1] = CreateFighter.AlexanderVolkanovski.last;
				featherStr[pos][2] = CreateFighter.AlexanderVolkanovski.country;
				
				featherDbl[pos][0] = CreateFighter.AlexanderVolkanovski.str;
				featherDbl[pos][1] = CreateFighter.AlexanderVolkanovski.spd;
				featherDbl[pos][2] = CreateFighter.AlexanderVolkanovski.stm;
				featherDbl[pos][3] = CreateFighter.AlexanderVolkanovski.chin;
				featherDbl[pos][4] = CreateFighter.AlexanderVolkanovski.strk;
				featherDbl[pos][5] = CreateFighter.AlexanderVolkanovski.wrst;
				featherDbl[pos][6] = CreateFighter.AlexanderVolkanovski.iq;
				featherDbl[pos][7] = CreateFighter.AlexanderVolkanovski.luck;
				
				featherInt[pos][0] = CreateFighter.AlexanderVolkanovski.win;
				featherInt[pos][1] = CreateFighter.AlexanderVolkanovski.loss;
				featherInt[pos][2] = CreateFighter.AlexanderVolkanovski.position;
				featherInt[pos][3] = CreateFighter.AlexanderVolkanovski.weight;
				
				featherBool[pos][0] = CreateFighter.AlexanderVolkanovski.mad;
			}
			else if (CreateFighter.MaxHolloway.getPos() == pos) {
				featherStr[pos][0] = CreateFighter.MaxHolloway.first;
				featherStr[pos][1] = CreateFighter.MaxHolloway.last;
				featherStr[pos][2] = CreateFighter.MaxHolloway.country;
				
				featherDbl[pos][0] = CreateFighter.MaxHolloway.str;
				featherDbl[pos][1] = CreateFighter.MaxHolloway.spd;
				featherDbl[pos][2] = CreateFighter.MaxHolloway.stm;
				featherDbl[pos][3] = CreateFighter.MaxHolloway.chin;
				featherDbl[pos][4] = CreateFighter.MaxHolloway.strk;
				featherDbl[pos][5] = CreateFighter.MaxHolloway.wrst;
				featherDbl[pos][6] = CreateFighter.MaxHolloway.iq;
				featherDbl[pos][7] = CreateFighter.MaxHolloway.luck;
				
				featherInt[pos][0] = CreateFighter.MaxHolloway.win;
				featherInt[pos][1] = CreateFighter.MaxHolloway.loss;
				featherInt[pos][2] = CreateFighter.MaxHolloway.position;
				featherInt[pos][3] = CreateFighter.MaxHolloway.weight;
				
				featherBool[pos][0] = CreateFighter.MaxHolloway.mad;
			}
			else if (CreateFighter.BrianOrtega.getPos() == pos) {
				featherStr[pos][0] = CreateFighter.BrianOrtega.first;
				featherStr[pos][1] = CreateFighter.BrianOrtega.last;
				featherStr[pos][2] = CreateFighter.BrianOrtega.country;
				
				featherDbl[pos][0] = CreateFighter.BrianOrtega.str;
				featherDbl[pos][1] = CreateFighter.BrianOrtega.spd;
				featherDbl[pos][2] = CreateFighter.BrianOrtega.stm;
				featherDbl[pos][3] = CreateFighter.BrianOrtega.chin;
				featherDbl[pos][4] = CreateFighter.BrianOrtega.strk;
				featherDbl[pos][5] = CreateFighter.BrianOrtega.wrst;
				featherDbl[pos][6] = CreateFighter.BrianOrtega.iq;
				featherDbl[pos][7] = CreateFighter.BrianOrtega.luck;
				
				featherInt[pos][0] = CreateFighter.BrianOrtega.win;
				featherInt[pos][1] = CreateFighter.BrianOrtega.loss;
				featherInt[pos][2] = CreateFighter.BrianOrtega.position;
				featherInt[pos][3] = CreateFighter.BrianOrtega.weight;
				
				featherBool[pos][0] = CreateFighter.BrianOrtega.mad;
			}
			else if (CreateFighter.ZabitMagomedsharipov.getPos() == pos) {
				featherStr[pos][0] = CreateFighter.ZabitMagomedsharipov.first;
				featherStr[pos][1] = CreateFighter.ZabitMagomedsharipov.last;
				featherStr[pos][2] = CreateFighter.ZabitMagomedsharipov.country;
				
				featherDbl[pos][0] = CreateFighter.ZabitMagomedsharipov.str;
				featherDbl[pos][1] = CreateFighter.ZabitMagomedsharipov.spd;
				featherDbl[pos][2] = CreateFighter.ZabitMagomedsharipov.stm;
				featherDbl[pos][3] = CreateFighter.ZabitMagomedsharipov.chin;
				featherDbl[pos][4] = CreateFighter.ZabitMagomedsharipov.strk;
				featherDbl[pos][5] = CreateFighter.ZabitMagomedsharipov.wrst;
				featherDbl[pos][6] = CreateFighter.ZabitMagomedsharipov.iq;
				featherDbl[pos][7] = CreateFighter.ZabitMagomedsharipov.luck;
				
				featherInt[pos][0] = CreateFighter.ZabitMagomedsharipov.win;
				featherInt[pos][1] = CreateFighter.ZabitMagomedsharipov.loss;
				featherInt[pos][2] = CreateFighter.ZabitMagomedsharipov.position;
				featherInt[pos][3] = CreateFighter.ZabitMagomedsharipov.weight;
				
				featherBool[pos][0] = CreateFighter.ZabitMagomedsharipov.mad;
			}
			else if (CreateFighter.ChanSungJung.getPos() == pos) {
				featherStr[pos][0] = CreateFighter.ChanSungJung.first;
				featherStr[pos][1] = CreateFighter.ChanSungJung.last;
				featherStr[pos][2] = CreateFighter.ChanSungJung.country;
				
				featherDbl[pos][0] = CreateFighter.ChanSungJung.str;
				featherDbl[pos][1] = CreateFighter.ChanSungJung.spd;
				featherDbl[pos][2] = CreateFighter.ChanSungJung.stm;
				featherDbl[pos][3] = CreateFighter.ChanSungJung.chin;
				featherDbl[pos][4] = CreateFighter.ChanSungJung.strk;
				featherDbl[pos][5] = CreateFighter.ChanSungJung.wrst;
				featherDbl[pos][6] = CreateFighter.ChanSungJung.iq;
				featherDbl[pos][7] = CreateFighter.ChanSungJung.luck;
				
				featherInt[pos][0] = CreateFighter.ChanSungJung.win;
				featherInt[pos][1] = CreateFighter.ChanSungJung.loss;
				featherInt[pos][2] = CreateFighter.ChanSungJung.position;
				featherInt[pos][3] = CreateFighter.ChanSungJung.weight;
				
				featherBool[pos][0] = CreateFighter.ChanSungJung.mad;
			}
			else if (CreateFighter.YairRodriguez.getPos() == pos) {
				featherStr[pos][0] = CreateFighter.YairRodriguez.first;
				featherStr[pos][1] = CreateFighter.YairRodriguez.last;
				featherStr[pos][2] = CreateFighter.YairRodriguez.country;
				
				featherDbl[pos][0] = CreateFighter.YairRodriguez.str;
				featherDbl[pos][1] = CreateFighter.YairRodriguez.spd;
				featherDbl[pos][2] = CreateFighter.YairRodriguez.stm;
				featherDbl[pos][3] = CreateFighter.YairRodriguez.chin;
				featherDbl[pos][4] = CreateFighter.YairRodriguez.strk;
				featherDbl[pos][5] = CreateFighter.YairRodriguez.wrst;
				featherDbl[pos][6] = CreateFighter.YairRodriguez.iq;
				featherDbl[pos][7] = CreateFighter.YairRodriguez.luck;
				
				featherInt[pos][0] = CreateFighter.YairRodriguez.win;
				featherInt[pos][1] = CreateFighter.YairRodriguez.loss;
				featherInt[pos][2] = CreateFighter.YairRodriguez.position;
				featherInt[pos][3] = CreateFighter.YairRodriguez.weight;
				
				featherBool[pos][0] = CreateFighter.YairRodriguez.mad;
			}
			else if (CreateFighter.FrankieEdgar.getPos() == pos) {
				featherStr[pos][0] = CreateFighter.FrankieEdgar.first;
				featherStr[pos][1] = CreateFighter.FrankieEdgar.last;
				featherStr[pos][2] = CreateFighter.FrankieEdgar.country;
				
				featherDbl[pos][0] = CreateFighter.FrankieEdgar.str;
				featherDbl[pos][1] = CreateFighter.FrankieEdgar.spd;
				featherDbl[pos][2] = CreateFighter.FrankieEdgar.stm;
				featherDbl[pos][3] = CreateFighter.FrankieEdgar.chin;
				featherDbl[pos][4] = CreateFighter.FrankieEdgar.strk;
				featherDbl[pos][5] = CreateFighter.FrankieEdgar.wrst;
				featherDbl[pos][6] = CreateFighter.FrankieEdgar.iq;
				featherDbl[pos][7] = CreateFighter.FrankieEdgar.luck;
				
				featherInt[pos][0] = CreateFighter.FrankieEdgar.win;
				featherInt[pos][1] = CreateFighter.FrankieEdgar.loss;
				featherInt[pos][2] = CreateFighter.FrankieEdgar.position;
				featherInt[pos][3] = CreateFighter.FrankieEdgar.weight;
				
				featherBool[pos][0] = CreateFighter.FrankieEdgar.mad;
			}
			else if (CreateFighter.JeremyStephens.getPos() == pos) {
				featherStr[pos][0] = CreateFighter.JeremyStephens.first;
				featherStr[pos][1] = CreateFighter.JeremyStephens.last;
				featherStr[pos][2] = CreateFighter.JeremyStephens.country;
				
				featherDbl[pos][0] = CreateFighter.JeremyStephens.str;
				featherDbl[pos][1] = CreateFighter.JeremyStephens.spd;
				featherDbl[pos][2] = CreateFighter.JeremyStephens.stm;
				featherDbl[pos][3] = CreateFighter.JeremyStephens.chin;
				featherDbl[pos][4] = CreateFighter.JeremyStephens.strk;
				featherDbl[pos][5] = CreateFighter.JeremyStephens.wrst;
				featherDbl[pos][6] = CreateFighter.JeremyStephens.iq;
				featherDbl[pos][7] = CreateFighter.JeremyStephens.luck;
				
				featherInt[pos][0] = CreateFighter.JeremyStephens.win;
				featherInt[pos][1] = CreateFighter.JeremyStephens.loss;
				featherInt[pos][2] = CreateFighter.JeremyStephens.position;
				featherInt[pos][3] = CreateFighter.JeremyStephens.weight;
				
				featherBool[pos][0] = CreateFighter.JeremyStephens.mad;
			}
			else if (CreateFighter.JoseAldo.getPos() == pos) {
				featherStr[pos][0] = CreateFighter.JoseAldo.first;
				featherStr[pos][1] = CreateFighter.JoseAldo.last;
				featherStr[pos][2] = CreateFighter.JoseAldo.country;
				
				featherDbl[pos][0] = CreateFighter.JoseAldo.str;
				featherDbl[pos][1] = CreateFighter.JoseAldo.spd;
				featherDbl[pos][2] = CreateFighter.JoseAldo.stm;
				featherDbl[pos][3] = CreateFighter.JoseAldo.chin;
				featherDbl[pos][4] = CreateFighter.JoseAldo.strk;
				featherDbl[pos][5] = CreateFighter.JoseAldo.wrst;
				featherDbl[pos][6] = CreateFighter.JoseAldo.iq;
				featherDbl[pos][7] = CreateFighter.JoseAldo.luck;
				
				featherInt[pos][0] = CreateFighter.JoseAldo.win;
				featherInt[pos][1] = CreateFighter.JoseAldo.loss;
				featherInt[pos][2] = CreateFighter.JoseAldo.position;
				featherInt[pos][3] = CreateFighter.JoseAldo.weight;
				
				featherBool[pos][0] = CreateFighter.JoseAldo.mad;
			}
			else if (CreateFighter.SodiqYusuff.getPos() == pos) {
				featherStr[pos][0] = CreateFighter.SodiqYusuff.first;
				featherStr[pos][1] = CreateFighter.SodiqYusuff.last;
				featherStr[pos][2] = CreateFighter.SodiqYusuff.country;
				
				featherDbl[pos][0] = CreateFighter.SodiqYusuff.str;
				featherDbl[pos][1] = CreateFighter.SodiqYusuff.spd;
				featherDbl[pos][2] = CreateFighter.SodiqYusuff.stm;
				featherDbl[pos][3] = CreateFighter.SodiqYusuff.chin;
				featherDbl[pos][4] = CreateFighter.SodiqYusuff.strk;
				featherDbl[pos][5] = CreateFighter.SodiqYusuff.wrst;
				featherDbl[pos][6] = CreateFighter.SodiqYusuff.iq;
				featherDbl[pos][7] = CreateFighter.SodiqYusuff.luck;
				
				featherInt[pos][0] = CreateFighter.SodiqYusuff.win;
				featherInt[pos][1] = CreateFighter.SodiqYusuff.loss;
				featherInt[pos][2] = CreateFighter.SodiqYusuff.position;
				featherInt[pos][3] = CreateFighter.SodiqYusuff.weight;
				
				featherBool[pos][0] = CreateFighter.SodiqYusuff.mad;
			}
		}
		
		else if (weight == 4) {
			if (CreateFighter.KhabibNurmagomedov.getPos() == pos) {
				lightStr[pos][0] = CreateFighter.KhabibNurmagomedov.first;
				lightStr[pos][1] = CreateFighter.KhabibNurmagomedov.last;
				lightStr[pos][2] = CreateFighter.KhabibNurmagomedov.country;
				
				lightDbl[pos][0] = CreateFighter.KhabibNurmagomedov.str;
				lightDbl[pos][1] = CreateFighter.KhabibNurmagomedov.spd;
				lightDbl[pos][2] = CreateFighter.KhabibNurmagomedov.stm;
				lightDbl[pos][3] = CreateFighter.KhabibNurmagomedov.chin;
				lightDbl[pos][4] = CreateFighter.KhabibNurmagomedov.strk;
				lightDbl[pos][5] = CreateFighter.KhabibNurmagomedov.wrst;
				lightDbl[pos][6] = CreateFighter.KhabibNurmagomedov.iq;
				lightDbl[pos][7] = CreateFighter.KhabibNurmagomedov.luck;
				
				lightInt[pos][0] = CreateFighter.KhabibNurmagomedov.win;
				lightInt[pos][1] = CreateFighter.KhabibNurmagomedov.loss;
				lightInt[pos][2] = CreateFighter.KhabibNurmagomedov.position;
				lightInt[pos][3] = CreateFighter.KhabibNurmagomedov.weight;
				
				lightBool[pos][0] = CreateFighter.KhabibNurmagomedov.mad;
			}
			else if (CreateFighter.TonyFerguson.getPos() == pos) {
				lightStr[pos][0] = CreateFighter.TonyFerguson.first;
				lightStr[pos][1] = CreateFighter.TonyFerguson.last;
				lightStr[pos][2] = CreateFighter.TonyFerguson.country;
				
				lightDbl[pos][0] = CreateFighter.TonyFerguson.str;
				lightDbl[pos][1] = CreateFighter.TonyFerguson.spd;
				lightDbl[pos][2] = CreateFighter.TonyFerguson.stm;
				lightDbl[pos][3] = CreateFighter.TonyFerguson.chin;
				lightDbl[pos][4] = CreateFighter.TonyFerguson.strk;
				lightDbl[pos][5] = CreateFighter.TonyFerguson.wrst;
				lightDbl[pos][6] = CreateFighter.TonyFerguson.iq;
				lightDbl[pos][7] = CreateFighter.TonyFerguson.luck;
				
				lightInt[pos][0] = CreateFighter.TonyFerguson.win;
				lightInt[pos][1] = CreateFighter.TonyFerguson.loss;
				lightInt[pos][2] = CreateFighter.TonyFerguson.position;
				lightInt[pos][3] = CreateFighter.TonyFerguson.weight;
				
				lightBool[pos][0] = CreateFighter.TonyFerguson.mad;
			}
			else if (CreateFighter.DustinPoirier.getPos() == pos) {
				lightStr[pos][0] = CreateFighter.DustinPoirier.first;
				lightStr[pos][1] = CreateFighter.DustinPoirier.last;
				lightStr[pos][2] = CreateFighter.DustinPoirier.country;
				
				lightDbl[pos][0] = CreateFighter.DustinPoirier.str;
				lightDbl[pos][1] = CreateFighter.DustinPoirier.spd;
				lightDbl[pos][2] = CreateFighter.DustinPoirier.stm;
				lightDbl[pos][3] = CreateFighter.DustinPoirier.chin;
				lightDbl[pos][4] = CreateFighter.DustinPoirier.strk;
				lightDbl[pos][5] = CreateFighter.DustinPoirier.wrst;
				lightDbl[pos][6] = CreateFighter.DustinPoirier.iq;
				lightDbl[pos][7] = CreateFighter.DustinPoirier.luck;
				
				lightInt[pos][0] = CreateFighter.DustinPoirier.win;
				lightInt[pos][1] = CreateFighter.DustinPoirier.loss;
				lightInt[pos][2] = CreateFighter.DustinPoirier.position;
				lightInt[pos][3] = CreateFighter.DustinPoirier.weight;
				
				lightBool[pos][0] = CreateFighter.DustinPoirier.mad;
			}
			else if (CreateFighter.ConorMcGregor.getPos() == pos) {
				lightStr[pos][0] = CreateFighter.ConorMcGregor.first;
				lightStr[pos][1] = CreateFighter.ConorMcGregor.last;
				lightStr[pos][2] = CreateFighter.ConorMcGregor.country;
				
				lightDbl[pos][0] = CreateFighter.ConorMcGregor.str;
				lightDbl[pos][1] = CreateFighter.ConorMcGregor.spd;
				lightDbl[pos][2] = CreateFighter.ConorMcGregor.stm;
				lightDbl[pos][3] = CreateFighter.ConorMcGregor.chin;
				lightDbl[pos][4] = CreateFighter.ConorMcGregor.strk;
				lightDbl[pos][5] = CreateFighter.ConorMcGregor.wrst;
				lightDbl[pos][6] = CreateFighter.ConorMcGregor.iq;
				lightDbl[pos][7] = CreateFighter.ConorMcGregor.luck;
				
				lightInt[pos][0] = CreateFighter.ConorMcGregor.win;
				lightInt[pos][1] = CreateFighter.ConorMcGregor.loss;
				lightInt[pos][2] = CreateFighter.ConorMcGregor.position;
				lightInt[pos][3] = CreateFighter.ConorMcGregor.weight;
				
				lightBool[pos][0] = CreateFighter.ConorMcGregor.mad;
			}
			else if (CreateFighter.JustinGaethje.getPos() == pos) {
				lightStr[pos][0] = CreateFighter.JustinGaethje.first;
				lightStr[pos][1] = CreateFighter.JustinGaethje.last;
				lightStr[pos][2] = CreateFighter.JustinGaethje.country;
				
				lightDbl[pos][0] = CreateFighter.JustinGaethje.str;
				lightDbl[pos][1] = CreateFighter.JustinGaethje.spd;
				lightDbl[pos][2] = CreateFighter.JustinGaethje.stm;
				lightDbl[pos][3] = CreateFighter.JustinGaethje.chin;
				lightDbl[pos][4] = CreateFighter.JustinGaethje.strk;
				lightDbl[pos][5] = CreateFighter.JustinGaethje.wrst;
				lightDbl[pos][6] = CreateFighter.JustinGaethje.iq;
				lightDbl[pos][7] = CreateFighter.JustinGaethje.luck;
				
				lightInt[pos][0] = CreateFighter.JustinGaethje.win;
				lightInt[pos][1] = CreateFighter.JustinGaethje.loss;
				lightInt[pos][2] = CreateFighter.JustinGaethje.position;
				lightInt[pos][3] = CreateFighter.JustinGaethje.weight;
				
				lightBool[pos][0] = CreateFighter.JustinGaethje.mad;
			}
			else if (CreateFighter.DanHooker.getPos() == pos) {
				lightStr[pos][0] = CreateFighter.DanHooker.first;
				lightStr[pos][1] = CreateFighter.DanHooker.last;
				lightStr[pos][2] = CreateFighter.DanHooker.country;
				
				lightDbl[pos][0] = CreateFighter.DanHooker.str;
				lightDbl[pos][1] = CreateFighter.DanHooker.spd;
				lightDbl[pos][2] = CreateFighter.DanHooker.stm;
				lightDbl[pos][3] = CreateFighter.DanHooker.chin;
				lightDbl[pos][4] = CreateFighter.DanHooker.strk;
				lightDbl[pos][5] = CreateFighter.DanHooker.wrst;
				lightDbl[pos][6] = CreateFighter.DanHooker.iq;
				lightDbl[pos][7] = CreateFighter.DanHooker.luck;
				
				lightInt[pos][0] = CreateFighter.DanHooker.win;
				lightInt[pos][1] = CreateFighter.DanHooker.loss;
				lightInt[pos][2] = CreateFighter.DanHooker.position;
				lightInt[pos][3] = CreateFighter.DanHooker.weight;
				
				lightBool[pos][0] = CreateFighter.DanHooker.mad;
			}
			else if (CreateFighter.DonaldCerrone.getPos() == pos) {
				lightStr[pos][0] = CreateFighter.DonaldCerrone.first;
				lightStr[pos][1] = CreateFighter.DonaldCerrone.last;
				lightStr[pos][2] = CreateFighter.DonaldCerrone.country;
				
				lightDbl[pos][0] = CreateFighter.DonaldCerrone.str;
				lightDbl[pos][1] = CreateFighter.DonaldCerrone.spd;
				lightDbl[pos][2] = CreateFighter.DonaldCerrone.stm;
				lightDbl[pos][3] = CreateFighter.DonaldCerrone.chin;
				lightDbl[pos][4] = CreateFighter.DonaldCerrone.strk;
				lightDbl[pos][5] = CreateFighter.DonaldCerrone.wrst;
				lightDbl[pos][6] = CreateFighter.DonaldCerrone.iq;
				lightDbl[pos][7] = CreateFighter.DonaldCerrone.luck;
				
				lightInt[pos][0] = CreateFighter.DonaldCerrone.win;
				lightInt[pos][1] = CreateFighter.DonaldCerrone.loss;
				lightInt[pos][2] = CreateFighter.DonaldCerrone.position;
				lightInt[pos][3] = CreateFighter.DonaldCerrone.weight;
				
				lightBool[pos][0] = CreateFighter.DonaldCerrone.mad;
			}
			else if (CreateFighter.PaulFelder.getPos() == pos) {
				lightStr[pos][0] = CreateFighter.PaulFelder.first;
				lightStr[pos][1] = CreateFighter.PaulFelder.last;
				lightStr[pos][2] = CreateFighter.PaulFelder.country;
				
				lightDbl[pos][0] = CreateFighter.PaulFelder.str;
				lightDbl[pos][1] = CreateFighter.PaulFelder.spd;
				lightDbl[pos][2] = CreateFighter.PaulFelder.stm;
				lightDbl[pos][3] = CreateFighter.PaulFelder.chin;
				lightDbl[pos][4] = CreateFighter.PaulFelder.strk;
				lightDbl[pos][5] = CreateFighter.PaulFelder.wrst;
				lightDbl[pos][6] = CreateFighter.PaulFelder.iq;
				lightDbl[pos][7] = CreateFighter.PaulFelder.luck;
				
				lightInt[pos][0] = CreateFighter.PaulFelder.win;
				lightInt[pos][1] = CreateFighter.PaulFelder.loss;
				lightInt[pos][2] = CreateFighter.PaulFelder.position;
				lightInt[pos][3] = CreateFighter.PaulFelder.weight;
				
				lightBool[pos][0] = CreateFighter.PaulFelder.mad;
			}
			else if (CreateFighter.CharlesOliveira.getPos() == pos) {
				lightStr[pos][0] = CreateFighter.CharlesOliveira.first;
				lightStr[pos][1] = CreateFighter.CharlesOliveira.last;
				lightStr[pos][2] = CreateFighter.CharlesOliveira.country;
				
				lightDbl[pos][0] = CreateFighter.CharlesOliveira.str;
				lightDbl[pos][1] = CreateFighter.CharlesOliveira.spd;
				lightDbl[pos][2] = CreateFighter.CharlesOliveira.stm;
				lightDbl[pos][3] = CreateFighter.CharlesOliveira.chin;
				lightDbl[pos][4] = CreateFighter.CharlesOliveira.strk;
				lightDbl[pos][5] = CreateFighter.CharlesOliveira.wrst;
				lightDbl[pos][6] = CreateFighter.CharlesOliveira.iq;
				lightDbl[pos][7] = CreateFighter.CharlesOliveira.luck;
				
				lightInt[pos][0] = CreateFighter.CharlesOliveira.win;
				lightInt[pos][1] = CreateFighter.CharlesOliveira.loss;
				lightInt[pos][2] = CreateFighter.CharlesOliveira.position;
				lightInt[pos][3] = CreateFighter.CharlesOliveira.weight;
				
				lightBool[pos][0] = CreateFighter.CharlesOliveira.mad;
			}
			else if (CreateFighter.IslamMakhachev.getPos() == pos) {
				lightStr[pos][0] = CreateFighter.IslamMakhachev.first;
				lightStr[pos][1] = CreateFighter.IslamMakhachev.last;
				lightStr[pos][2] = CreateFighter.IslamMakhachev.country;
				
				lightDbl[pos][0] = CreateFighter.IslamMakhachev.str;
				lightDbl[pos][1] = CreateFighter.IslamMakhachev.spd;
				lightDbl[pos][2] = CreateFighter.IslamMakhachev.stm;
				lightDbl[pos][3] = CreateFighter.IslamMakhachev.chin;
				lightDbl[pos][4] = CreateFighter.IslamMakhachev.strk;
				lightDbl[pos][5] = CreateFighter.IslamMakhachev.wrst;
				lightDbl[pos][6] = CreateFighter.IslamMakhachev.iq;
				lightDbl[pos][7] = CreateFighter.IslamMakhachev.luck;
				
				lightInt[pos][0] = CreateFighter.IslamMakhachev.win;
				lightInt[pos][1] = CreateFighter.IslamMakhachev.loss;
				lightInt[pos][2] = CreateFighter.IslamMakhachev.position;
				lightInt[pos][3] = CreateFighter.IslamMakhachev.weight;
				
				lightBool[pos][0] = CreateFighter.IslamMakhachev.mad;
			}
		}
		
		else if (weight == 5) {
			if (CreateFighter.KamaruUsman.getPos() == pos) {
				welterStr[pos][0] = CreateFighter.KamaruUsman.first;
				welterStr[pos][1] = CreateFighter.KamaruUsman.last;
				welterStr[pos][2] = CreateFighter.KamaruUsman.country;
				
				welterDbl[pos][0] = CreateFighter.KamaruUsman.str;
				welterDbl[pos][1] = CreateFighter.KamaruUsman.spd;
				welterDbl[pos][2] = CreateFighter.KamaruUsman.stm;
				welterDbl[pos][3] = CreateFighter.KamaruUsman.chin;
				welterDbl[pos][4] = CreateFighter.KamaruUsman.strk;
				welterDbl[pos][5] = CreateFighter.KamaruUsman.wrst;
				welterDbl[pos][6] = CreateFighter.KamaruUsman.iq;
				welterDbl[pos][7] = CreateFighter.KamaruUsman.luck;
				
				welterInt[pos][0] = CreateFighter.KamaruUsman.win;
				welterInt[pos][1] = CreateFighter.KamaruUsman.loss;
				welterInt[pos][2] = CreateFighter.KamaruUsman.position;
				welterInt[pos][3] = CreateFighter.KamaruUsman.weight;
				
				welterBool[pos][0] = CreateFighter.KamaruUsman.mad;
			}
			else if (CreateFighter.TyronWoodley.getPos() == pos) {
				welterStr[pos][0] = CreateFighter.TyronWoodley.first;
				welterStr[pos][1] = CreateFighter.TyronWoodley.last;
				welterStr[pos][2] = CreateFighter.TyronWoodley.country;
				
				welterDbl[pos][0] = CreateFighter.TyronWoodley.str;
				welterDbl[pos][1] = CreateFighter.TyronWoodley.spd;
				welterDbl[pos][2] = CreateFighter.TyronWoodley.stm;
				welterDbl[pos][3] = CreateFighter.TyronWoodley.chin;
				welterDbl[pos][4] = CreateFighter.TyronWoodley.strk;
				welterDbl[pos][5] = CreateFighter.TyronWoodley.wrst;
				welterDbl[pos][6] = CreateFighter.TyronWoodley.iq;
				welterDbl[pos][7] = CreateFighter.TyronWoodley.luck;
				
				welterInt[pos][0] = CreateFighter.TyronWoodley.win;
				welterInt[pos][1] = CreateFighter.TyronWoodley.loss;
				welterInt[pos][2] = CreateFighter.TyronWoodley.position;
				welterInt[pos][3] = CreateFighter.TyronWoodley.weight;
				
				welterBool[pos][0] = CreateFighter.TyronWoodley.mad;
			}
			else if (CreateFighter.ColbyCovington.getPos() == pos) {
				welterStr[pos][0] = CreateFighter.ColbyCovington.first;
				welterStr[pos][1] = CreateFighter.ColbyCovington.last;
				welterStr[pos][2] = CreateFighter.ColbyCovington.country;
				
				welterDbl[pos][0] = CreateFighter.ColbyCovington.str;
				welterDbl[pos][1] = CreateFighter.ColbyCovington.spd;
				welterDbl[pos][2] = CreateFighter.ColbyCovington.stm;
				welterDbl[pos][3] = CreateFighter.ColbyCovington.chin;
				welterDbl[pos][4] = CreateFighter.ColbyCovington.strk;
				welterDbl[pos][5] = CreateFighter.ColbyCovington.wrst;
				welterDbl[pos][6] = CreateFighter.ColbyCovington.iq;
				welterDbl[pos][7] = CreateFighter.ColbyCovington.luck;
				
				welterInt[pos][0] = CreateFighter.ColbyCovington.win;
				welterInt[pos][1] = CreateFighter.ColbyCovington.loss;
				welterInt[pos][2] = CreateFighter.ColbyCovington.position;
				welterInt[pos][3] = CreateFighter.ColbyCovington.weight;
				
				welterBool[pos][0] = CreateFighter.ColbyCovington.mad;
			}
			else if (CreateFighter.JorgeMasvidal.getPos() == pos) {
				welterStr[pos][0] = CreateFighter.JorgeMasvidal.first;
				welterStr[pos][1] = CreateFighter.JorgeMasvidal.last;
				welterStr[pos][2] = CreateFighter.JorgeMasvidal.country;
				
				welterDbl[pos][0] = CreateFighter.JorgeMasvidal.str;
				welterDbl[pos][1] = CreateFighter.JorgeMasvidal.spd;
				welterDbl[pos][2] = CreateFighter.JorgeMasvidal.stm;
				welterDbl[pos][3] = CreateFighter.JorgeMasvidal.chin;
				welterDbl[pos][4] = CreateFighter.JorgeMasvidal.strk;
				welterDbl[pos][5] = CreateFighter.JorgeMasvidal.wrst;
				welterDbl[pos][6] = CreateFighter.JorgeMasvidal.iq;
				welterDbl[pos][7] = CreateFighter.JorgeMasvidal.luck;
				
				welterInt[pos][0] = CreateFighter.JorgeMasvidal.win;
				welterInt[pos][1] = CreateFighter.JorgeMasvidal.loss;
				welterInt[pos][2] = CreateFighter.JorgeMasvidal.position;
				welterInt[pos][3] = CreateFighter.JorgeMasvidal.weight;
				
				welterBool[pos][0] = CreateFighter.JorgeMasvidal.mad;
			}
			else if (CreateFighter.LeonEdwards.getPos() == pos) {
				welterStr[pos][0] = CreateFighter.LeonEdwards.first;
				welterStr[pos][1] = CreateFighter.LeonEdwards.last;
				welterStr[pos][2] = CreateFighter.LeonEdwards.country;
				
				welterDbl[pos][0] = CreateFighter.LeonEdwards.str;
				welterDbl[pos][1] = CreateFighter.LeonEdwards.spd;
				welterDbl[pos][2] = CreateFighter.LeonEdwards.stm;
				welterDbl[pos][3] = CreateFighter.LeonEdwards.chin;
				welterDbl[pos][4] = CreateFighter.LeonEdwards.strk;
				welterDbl[pos][5] = CreateFighter.LeonEdwards.wrst;
				welterDbl[pos][6] = CreateFighter.LeonEdwards.iq;
				welterDbl[pos][7] = CreateFighter.LeonEdwards.luck;
				
				welterInt[pos][0] = CreateFighter.LeonEdwards.win;
				welterInt[pos][1] = CreateFighter.LeonEdwards.loss;
				welterInt[pos][2] = CreateFighter.LeonEdwards.position;
				welterInt[pos][3] = CreateFighter.LeonEdwards.weight;
				
				welterBool[pos][0] = CreateFighter.LeonEdwards.mad;
			}
			else if (CreateFighter.StephenThompson.getPos() == pos) {
				welterStr[pos][0] = CreateFighter.StephenThompson.first;
				welterStr[pos][1] = CreateFighter.StephenThompson.last;
				welterStr[pos][2] = CreateFighter.StephenThompson.country;
				
				welterDbl[pos][0] = CreateFighter.StephenThompson.str;
				welterDbl[pos][1] = CreateFighter.StephenThompson.spd;
				welterDbl[pos][2] = CreateFighter.StephenThompson.stm;
				welterDbl[pos][3] = CreateFighter.StephenThompson.chin;
				welterDbl[pos][4] = CreateFighter.StephenThompson.strk;
				welterDbl[pos][5] = CreateFighter.StephenThompson.wrst;
				welterDbl[pos][6] = CreateFighter.StephenThompson.iq;
				welterDbl[pos][7] = CreateFighter.StephenThompson.luck;
				
				welterInt[pos][0] = CreateFighter.StephenThompson.win;
				welterInt[pos][1] = CreateFighter.StephenThompson.loss;
				welterInt[pos][2] = CreateFighter.StephenThompson.position;
				welterInt[pos][3] = CreateFighter.StephenThompson.weight;
				
				welterBool[pos][0] = CreateFighter.StephenThompson.mad;
			}
			else if (CreateFighter.DemianMaia.getPos() == pos) {
				welterStr[pos][0] = CreateFighter.DemianMaia.first;
				welterStr[pos][1] = CreateFighter.DemianMaia.last;
				welterStr[pos][2] = CreateFighter.DemianMaia.country;
				
				welterDbl[pos][0] = CreateFighter.DemianMaia.str;
				welterDbl[pos][1] = CreateFighter.DemianMaia.spd;
				welterDbl[pos][2] = CreateFighter.DemianMaia.stm;
				welterDbl[pos][3] = CreateFighter.DemianMaia.chin;
				welterDbl[pos][4] = CreateFighter.DemianMaia.strk;
				welterDbl[pos][5] = CreateFighter.DemianMaia.wrst;
				welterDbl[pos][6] = CreateFighter.DemianMaia.iq;
				welterDbl[pos][7] = CreateFighter.DemianMaia.luck;
				
				welterInt[pos][0] = CreateFighter.DemianMaia.win;
				welterInt[pos][1] = CreateFighter.DemianMaia.loss;
				welterInt[pos][2] = CreateFighter.DemianMaia.position;
				welterInt[pos][3] = CreateFighter.DemianMaia.weight;
				
				welterBool[pos][0] = CreateFighter.DemianMaia.mad;
			}
			else if (CreateFighter.RafaelDosAnjos.getPos() == pos) {
				welterStr[pos][0] = CreateFighter.RafaelDosAnjos.first;
				welterStr[pos][1] = CreateFighter.RafaelDosAnjos.last;
				welterStr[pos][2] = CreateFighter.RafaelDosAnjos.country;
				
				welterDbl[pos][0] = CreateFighter.RafaelDosAnjos.str;
				welterDbl[pos][1] = CreateFighter.RafaelDosAnjos.spd;
				welterDbl[pos][2] = CreateFighter.RafaelDosAnjos.stm;
				welterDbl[pos][3] = CreateFighter.RafaelDosAnjos.chin;
				welterDbl[pos][4] = CreateFighter.RafaelDosAnjos.strk;
				welterDbl[pos][5] = CreateFighter.RafaelDosAnjos.wrst;
				welterDbl[pos][6] = CreateFighter.RafaelDosAnjos.iq;
				welterDbl[pos][7] = CreateFighter.RafaelDosAnjos.luck;
				
				welterInt[pos][0] = CreateFighter.RafaelDosAnjos.win;
				welterInt[pos][1] = CreateFighter.RafaelDosAnjos.loss;
				welterInt[pos][2] = CreateFighter.RafaelDosAnjos.position;
				welterInt[pos][3] = CreateFighter.RafaelDosAnjos.weight;
				
				welterBool[pos][0] = CreateFighter.RafaelDosAnjos.mad;
			}
			else if (CreateFighter.NateDiaz.getPos() == pos) {
				welterStr[pos][0] = CreateFighter.NateDiaz.first;
				welterStr[pos][1] = CreateFighter.NateDiaz.last;
				welterStr[pos][2] = CreateFighter.NateDiaz.country;
				
				welterDbl[pos][0] = CreateFighter.NateDiaz.str;
				welterDbl[pos][1] = CreateFighter.NateDiaz.spd;
				welterDbl[pos][2] = CreateFighter.NateDiaz.stm;
				welterDbl[pos][3] = CreateFighter.NateDiaz.chin;
				welterDbl[pos][4] = CreateFighter.NateDiaz.strk;
				welterDbl[pos][5] = CreateFighter.NateDiaz.wrst;
				welterDbl[pos][6] = CreateFighter.NateDiaz.iq;
				welterDbl[pos][7] = CreateFighter.NateDiaz.luck;
				
				welterInt[pos][0] = CreateFighter.NateDiaz.win;
				welterInt[pos][1] = CreateFighter.NateDiaz.loss;
				welterInt[pos][2] = CreateFighter.NateDiaz.position;
				welterInt[pos][3] = CreateFighter.NateDiaz.weight;
				
				welterBool[pos][0] = CreateFighter.NateDiaz.mad;
			}
			else if (CreateFighter.AnthonyPettis.getPos() == pos) {
				welterStr[pos][0] = CreateFighter.AnthonyPettis.first;
				welterStr[pos][1] = CreateFighter.AnthonyPettis.last;
				welterStr[pos][2] = CreateFighter.AnthonyPettis.country;
				
				welterDbl[pos][0] = CreateFighter.AnthonyPettis.str;
				welterDbl[pos][1] = CreateFighter.AnthonyPettis.spd;
				welterDbl[pos][2] = CreateFighter.AnthonyPettis.stm;
				welterDbl[pos][3] = CreateFighter.AnthonyPettis.chin;
				welterDbl[pos][4] = CreateFighter.AnthonyPettis.strk;
				welterDbl[pos][5] = CreateFighter.AnthonyPettis.wrst;
				welterDbl[pos][6] = CreateFighter.AnthonyPettis.iq;
				welterDbl[pos][7] = CreateFighter.AnthonyPettis.luck;
				
				welterInt[pos][0] = CreateFighter.AnthonyPettis.win;
				welterInt[pos][1] = CreateFighter.AnthonyPettis.loss;
				welterInt[pos][2] = CreateFighter.AnthonyPettis.position;
				welterInt[pos][3] = CreateFighter.AnthonyPettis.weight;
				
				welterBool[pos][0] = CreateFighter.AnthonyPettis.mad;
			}
		}
		
		else if (weight == 6) {
			if (CreateFighter.IsraelAdesanya.getPos() == pos) {
				middleStr[pos][0] = CreateFighter.IsraelAdesanya.first;
				middleStr[pos][1] = CreateFighter.IsraelAdesanya.last;
				middleStr[pos][2] = CreateFighter.IsraelAdesanya.country;
				
				middleDbl[pos][0] = CreateFighter.IsraelAdesanya.str;
				middleDbl[pos][1] = CreateFighter.IsraelAdesanya.spd;
				middleDbl[pos][2] = CreateFighter.IsraelAdesanya.stm;
				middleDbl[pos][3] = CreateFighter.IsraelAdesanya.chin;
				middleDbl[pos][4] = CreateFighter.IsraelAdesanya.strk;
				middleDbl[pos][5] = CreateFighter.IsraelAdesanya.wrst;
				middleDbl[pos][6] = CreateFighter.IsraelAdesanya.iq;
				middleDbl[pos][7] = CreateFighter.IsraelAdesanya.luck;
				
				middleInt[pos][0] = CreateFighter.IsraelAdesanya.win;
				middleInt[pos][1] = CreateFighter.IsraelAdesanya.loss;
				middleInt[pos][2] = CreateFighter.IsraelAdesanya.position;
				middleInt[pos][3] = CreateFighter.IsraelAdesanya.weight;
				
				middleBool[pos][0] = CreateFighter.IsraelAdesanya.mad;
			}
			else if (CreateFighter.PauloCosta.getPos() == pos) {
				middleStr[pos][0] = CreateFighter.PauloCosta.first;
				middleStr[pos][1] = CreateFighter.PauloCosta.last;
				middleStr[pos][2] = CreateFighter.PauloCosta.country;
				
				middleDbl[pos][0] = CreateFighter.PauloCosta.str;
				middleDbl[pos][1] = CreateFighter.PauloCosta.spd;
				middleDbl[pos][2] = CreateFighter.PauloCosta.stm;
				middleDbl[pos][3] = CreateFighter.PauloCosta.chin;
				middleDbl[pos][4] = CreateFighter.PauloCosta.strk;
				middleDbl[pos][5] = CreateFighter.PauloCosta.wrst;
				middleDbl[pos][6] = CreateFighter.PauloCosta.iq;
				middleDbl[pos][7] = CreateFighter.PauloCosta.luck;
				
				middleInt[pos][0] = CreateFighter.PauloCosta.win;
				middleInt[pos][1] = CreateFighter.PauloCosta.loss;
				middleInt[pos][2] = CreateFighter.PauloCosta.position;
				middleInt[pos][3] = CreateFighter.PauloCosta.weight;
				
				middleBool[pos][0] = CreateFighter.PauloCosta.mad;
			}
			else if (CreateFighter.RobertWhittaker.getPos() == pos) {
				middleStr[pos][0] = CreateFighter.RobertWhittaker.first;
				middleStr[pos][1] = CreateFighter.RobertWhittaker.last;
				middleStr[pos][2] = CreateFighter.RobertWhittaker.country;
				
				middleDbl[pos][0] = CreateFighter.RobertWhittaker.str;
				middleDbl[pos][1] = CreateFighter.RobertWhittaker.spd;
				middleDbl[pos][2] = CreateFighter.RobertWhittaker.stm;
				middleDbl[pos][3] = CreateFighter.RobertWhittaker.chin;
				middleDbl[pos][4] = CreateFighter.RobertWhittaker.strk;
				middleDbl[pos][5] = CreateFighter.RobertWhittaker.wrst;
				middleDbl[pos][6] = CreateFighter.RobertWhittaker.iq;
				middleDbl[pos][7] = CreateFighter.RobertWhittaker.luck;
				
				middleInt[pos][0] = CreateFighter.RobertWhittaker.win;
				middleInt[pos][1] = CreateFighter.RobertWhittaker.loss;
				middleInt[pos][2] = CreateFighter.RobertWhittaker.position;
				middleInt[pos][3] = CreateFighter.RobertWhittaker.weight;
				
				middleBool[pos][0] = CreateFighter.RobertWhittaker.mad;
			}
			else if (CreateFighter.JaredCannonier.getPos() == pos) {
				middleStr[pos][0] = CreateFighter.JaredCannonier.first;
				middleStr[pos][1] = CreateFighter.JaredCannonier.last;
				middleStr[pos][2] = CreateFighter.JaredCannonier.country;
				
				middleDbl[pos][0] = CreateFighter.JaredCannonier.str;
				middleDbl[pos][1] = CreateFighter.JaredCannonier.spd;
				middleDbl[pos][2] = CreateFighter.JaredCannonier.stm;
				middleDbl[pos][3] = CreateFighter.JaredCannonier.chin;
				middleDbl[pos][4] = CreateFighter.JaredCannonier.strk;
				middleDbl[pos][5] = CreateFighter.JaredCannonier.wrst;
				middleDbl[pos][6] = CreateFighter.JaredCannonier.iq;
				middleDbl[pos][7] = CreateFighter.JaredCannonier.luck;
				
				middleInt[pos][0] = CreateFighter.JaredCannonier.win;
				middleInt[pos][1] = CreateFighter.JaredCannonier.loss;
				middleInt[pos][2] = CreateFighter.JaredCannonier.position;
				middleInt[pos][3] = CreateFighter.JaredCannonier.weight;
				
				middleBool[pos][0] = CreateFighter.JaredCannonier.mad;
			}
			else if (CreateFighter.YoelRomero.getPos() == pos) {
				middleStr[pos][0] = CreateFighter.YoelRomero.first;
				middleStr[pos][1] = CreateFighter.YoelRomero.last;
				middleStr[pos][2] = CreateFighter.YoelRomero.country;
				
				middleDbl[pos][0] = CreateFighter.YoelRomero.str;
				middleDbl[pos][1] = CreateFighter.YoelRomero.spd;
				middleDbl[pos][2] = CreateFighter.YoelRomero.stm;
				middleDbl[pos][3] = CreateFighter.YoelRomero.chin;
				middleDbl[pos][4] = CreateFighter.YoelRomero.strk;
				middleDbl[pos][5] = CreateFighter.YoelRomero.wrst;
				middleDbl[pos][6] = CreateFighter.YoelRomero.iq;
				middleDbl[pos][7] = CreateFighter.YoelRomero.luck;
				
				middleInt[pos][0] = CreateFighter.YoelRomero.win;
				middleInt[pos][1] = CreateFighter.YoelRomero.loss;
				middleInt[pos][2] = CreateFighter.YoelRomero.position;
				middleInt[pos][3] = CreateFighter.YoelRomero.weight;
				
				middleBool[pos][0] = CreateFighter.YoelRomero.mad;
			}
			else if (CreateFighter.DarrenTill.getPos() == pos) {
				middleStr[pos][0] = CreateFighter.DarrenTill.first;
				middleStr[pos][1] = CreateFighter.DarrenTill.last;
				middleStr[pos][2] = CreateFighter.DarrenTill.country;
				
				middleDbl[pos][0] = CreateFighter.DarrenTill.str;
				middleDbl[pos][1] = CreateFighter.DarrenTill.spd;
				middleDbl[pos][2] = CreateFighter.DarrenTill.stm;
				middleDbl[pos][3] = CreateFighter.DarrenTill.chin;
				middleDbl[pos][4] = CreateFighter.DarrenTill.strk;
				middleDbl[pos][5] = CreateFighter.DarrenTill.wrst;
				middleDbl[pos][6] = CreateFighter.DarrenTill.iq;
				middleDbl[pos][7] = CreateFighter.DarrenTill.luck;
				
				middleInt[pos][0] = CreateFighter.DarrenTill.win;
				middleInt[pos][1] = CreateFighter.DarrenTill.loss;
				middleInt[pos][2] = CreateFighter.DarrenTill.position;
				middleInt[pos][3] = CreateFighter.DarrenTill.weight;
				
				middleBool[pos][0] = CreateFighter.DarrenTill.mad;
			}
			else if (CreateFighter.KelvinGastelum.getPos() == pos) {
				middleStr[pos][0] = CreateFighter.KelvinGastelum.first;
				middleStr[pos][1] = CreateFighter.KelvinGastelum.last;
				middleStr[pos][2] = CreateFighter.KelvinGastelum.country;
				
				middleDbl[pos][0] = CreateFighter.KelvinGastelum.str;
				middleDbl[pos][1] = CreateFighter.KelvinGastelum.spd;
				middleDbl[pos][2] = CreateFighter.KelvinGastelum.stm;
				middleDbl[pos][3] = CreateFighter.KelvinGastelum.chin;
				middleDbl[pos][4] = CreateFighter.KelvinGastelum.strk;
				middleDbl[pos][5] = CreateFighter.KelvinGastelum.wrst;
				middleDbl[pos][6] = CreateFighter.KelvinGastelum.iq;
				middleDbl[pos][7] = CreateFighter.KelvinGastelum.luck;
				
				middleInt[pos][0] = CreateFighter.KelvinGastelum.win;
				middleInt[pos][1] = CreateFighter.KelvinGastelum.loss;
				middleInt[pos][2] = CreateFighter.KelvinGastelum.position;
				middleInt[pos][3] = CreateFighter.KelvinGastelum.weight;
				
				middleBool[pos][0] = CreateFighter.KelvinGastelum.mad;
			}
			else if (CreateFighter.DerekBrunson.getPos() == pos) {
				middleStr[pos][0] = CreateFighter.DerekBrunson.first;
				middleStr[pos][1] = CreateFighter.DerekBrunson.last;
				middleStr[pos][2] = CreateFighter.DerekBrunson.country;
				
				middleDbl[pos][0] = CreateFighter.DerekBrunson.str;
				middleDbl[pos][1] = CreateFighter.DerekBrunson.spd;
				middleDbl[pos][2] = CreateFighter.DerekBrunson.stm;
				middleDbl[pos][3] = CreateFighter.DerekBrunson.chin;
				middleDbl[pos][4] = CreateFighter.DerekBrunson.strk;
				middleDbl[pos][5] = CreateFighter.DerekBrunson.wrst;
				middleDbl[pos][6] = CreateFighter.DerekBrunson.iq;
				middleDbl[pos][7] = CreateFighter.DerekBrunson.luck;
				
				middleInt[pos][0] = CreateFighter.DerekBrunson.win;
				middleInt[pos][1] = CreateFighter.DerekBrunson.loss;
				middleInt[pos][2] = CreateFighter.DerekBrunson.position;
				middleInt[pos][3] = CreateFighter.DerekBrunson.weight;
				
				middleBool[pos][0] = CreateFighter.DerekBrunson.mad;
			}
			else if (CreateFighter.BradTavares.getPos() == pos) {
				middleStr[pos][0] = CreateFighter.BradTavares.first;
				middleStr[pos][1] = CreateFighter.BradTavares.last;
				middleStr[pos][2] = CreateFighter.BradTavares.country;
				
				middleDbl[pos][0] = CreateFighter.BradTavares.str;
				middleDbl[pos][1] = CreateFighter.BradTavares.spd;
				middleDbl[pos][2] = CreateFighter.BradTavares.stm;
				middleDbl[pos][3] = CreateFighter.BradTavares.chin;
				middleDbl[pos][4] = CreateFighter.BradTavares.strk;
				middleDbl[pos][5] = CreateFighter.BradTavares.wrst;
				middleDbl[pos][6] = CreateFighter.BradTavares.iq;
				middleDbl[pos][7] = CreateFighter.BradTavares.luck;
				
				middleInt[pos][0] = CreateFighter.BradTavares.win;
				middleInt[pos][1] = CreateFighter.BradTavares.loss;
				middleInt[pos][2] = CreateFighter.BradTavares.position;
				middleInt[pos][3] = CreateFighter.BradTavares.weight;
				
				middleBool[pos][0] = CreateFighter.BradTavares.mad;
			}
			else if (CreateFighter.AndersonSilva.getPos() == pos) {
				middleStr[pos][0] = CreateFighter.AndersonSilva.first;
				middleStr[pos][1] = CreateFighter.AndersonSilva.last;
				middleStr[pos][2] = CreateFighter.AndersonSilva.country;
				
				middleDbl[pos][0] = CreateFighter.AndersonSilva.str;
				middleDbl[pos][1] = CreateFighter.AndersonSilva.spd;
				middleDbl[pos][2] = CreateFighter.AndersonSilva.stm;
				middleDbl[pos][3] = CreateFighter.AndersonSilva.chin;
				middleDbl[pos][4] = CreateFighter.AndersonSilva.strk;
				middleDbl[pos][5] = CreateFighter.AndersonSilva.wrst;
				middleDbl[pos][6] = CreateFighter.AndersonSilva.iq;
				middleDbl[pos][7] = CreateFighter.AndersonSilva.luck;
				
				middleInt[pos][0] = CreateFighter.AndersonSilva.win;
				middleInt[pos][1] = CreateFighter.AndersonSilva.loss;
				middleInt[pos][2] = CreateFighter.AndersonSilva.position;
				middleInt[pos][3] = CreateFighter.AndersonSilva.weight;
				
				middleBool[pos][0] = CreateFighter.AndersonSilva.mad;
			}
		}
		
		else if (weight == 7) {
			if (CreateFighter.JonJones.getPos() == pos) {
				lheavyStr[pos][0] = CreateFighter.JonJones.first;
				lheavyStr[pos][1] = CreateFighter.JonJones.last;
				lheavyStr[pos][2] = CreateFighter.JonJones.country;
				
				lheavyDbl[pos][0] = CreateFighter.JonJones.str;
				lheavyDbl[pos][1] = CreateFighter.JonJones.spd;
				lheavyDbl[pos][2] = CreateFighter.JonJones.stm;
				lheavyDbl[pos][3] = CreateFighter.JonJones.chin;
				lheavyDbl[pos][4] = CreateFighter.JonJones.strk;
				lheavyDbl[pos][5] = CreateFighter.JonJones.wrst;
				lheavyDbl[pos][6] = CreateFighter.JonJones.iq;
				lheavyDbl[pos][7] = CreateFighter.JonJones.luck;
				
				lheavyInt[pos][0] = CreateFighter.JonJones.win;
				lheavyInt[pos][1] = CreateFighter.JonJones.loss;
				lheavyInt[pos][2] = CreateFighter.JonJones.position;
				lheavyInt[pos][3] = CreateFighter.JonJones.weight;
				
				lheavyBool[pos][0] = CreateFighter.JonJones.mad;
			}
			else if (CreateFighter.DominickReyes.getPos() == pos) {
				lheavyStr[pos][0] = CreateFighter.DominickReyes.first;
				lheavyStr[pos][1] = CreateFighter.DominickReyes.last;
				lheavyStr[pos][2] = CreateFighter.DominickReyes.country;
				
				lheavyDbl[pos][0] = CreateFighter.DominickReyes.str;
				lheavyDbl[pos][1] = CreateFighter.DominickReyes.spd;
				lheavyDbl[pos][2] = CreateFighter.DominickReyes.stm;
				lheavyDbl[pos][3] = CreateFighter.DominickReyes.chin;
				lheavyDbl[pos][4] = CreateFighter.DominickReyes.strk;
				lheavyDbl[pos][5] = CreateFighter.DominickReyes.wrst;
				lheavyDbl[pos][6] = CreateFighter.DominickReyes.iq;
				lheavyDbl[pos][7] = CreateFighter.DominickReyes.luck;
				
				lheavyInt[pos][0] = CreateFighter.DominickReyes.win;
				lheavyInt[pos][1] = CreateFighter.DominickReyes.loss;
				lheavyInt[pos][2] = CreateFighter.DominickReyes.position;
				lheavyInt[pos][3] = CreateFighter.DominickReyes.weight;
				
				lheavyBool[pos][0] = CreateFighter.DominickReyes.mad;
			}
			else if (CreateFighter.ThiagoSantos.getPos() == pos) {
				lheavyStr[pos][0] = CreateFighter.ThiagoSantos.first;
				lheavyStr[pos][1] = CreateFighter.ThiagoSantos.last;
				lheavyStr[pos][2] = CreateFighter.ThiagoSantos.country;
				
				lheavyDbl[pos][0] = CreateFighter.ThiagoSantos.str;
				lheavyDbl[pos][1] = CreateFighter.ThiagoSantos.spd;
				lheavyDbl[pos][2] = CreateFighter.ThiagoSantos.stm;
				lheavyDbl[pos][3] = CreateFighter.ThiagoSantos.chin;
				lheavyDbl[pos][4] = CreateFighter.ThiagoSantos.strk;
				lheavyDbl[pos][5] = CreateFighter.ThiagoSantos.wrst;
				lheavyDbl[pos][6] = CreateFighter.ThiagoSantos.iq;
				lheavyDbl[pos][7] = CreateFighter.ThiagoSantos.luck;
				
				lheavyInt[pos][0] = CreateFighter.ThiagoSantos.win;
				lheavyInt[pos][1] = CreateFighter.ThiagoSantos.loss;
				lheavyInt[pos][2] = CreateFighter.ThiagoSantos.position;
				lheavyInt[pos][3] = CreateFighter.ThiagoSantos.weight;
				
				lheavyBool[pos][0] = CreateFighter.ThiagoSantos.mad;
			}
			else if (CreateFighter.AnthonySmith.getPos() == pos) {
				lheavyStr[pos][0] = CreateFighter.AnthonySmith.first;
				lheavyStr[pos][1] = CreateFighter.AnthonySmith.last;
				lheavyStr[pos][2] = CreateFighter.AnthonySmith.country;
				
				lheavyDbl[pos][0] = CreateFighter.AnthonySmith.str;
				lheavyDbl[pos][1] = CreateFighter.AnthonySmith.spd;
				lheavyDbl[pos][2] = CreateFighter.AnthonySmith.stm;
				lheavyDbl[pos][3] = CreateFighter.AnthonySmith.chin;
				lheavyDbl[pos][4] = CreateFighter.AnthonySmith.strk;
				lheavyDbl[pos][5] = CreateFighter.AnthonySmith.wrst;
				lheavyDbl[pos][6] = CreateFighter.AnthonySmith.iq;
				lheavyDbl[pos][7] = CreateFighter.AnthonySmith.luck;
				
				lheavyInt[pos][0] = CreateFighter.AnthonySmith.win;
				lheavyInt[pos][1] = CreateFighter.AnthonySmith.loss;
				lheavyInt[pos][2] = CreateFighter.AnthonySmith.position;
				lheavyInt[pos][3] = CreateFighter.AnthonySmith.weight;
				
				lheavyBool[pos][0] = CreateFighter.AnthonySmith.mad;
			}
			else if (CreateFighter.JanBlachowicz.getPos() == pos) {
				lheavyStr[pos][0] = CreateFighter.JanBlachowicz.first;
				lheavyStr[pos][1] = CreateFighter.JanBlachowicz.last;
				lheavyStr[pos][2] = CreateFighter.JanBlachowicz.country;
				
				lheavyDbl[pos][0] = CreateFighter.JanBlachowicz.str;
				lheavyDbl[pos][1] = CreateFighter.JanBlachowicz.spd;
				lheavyDbl[pos][2] = CreateFighter.JanBlachowicz.stm;
				lheavyDbl[pos][3] = CreateFighter.JanBlachowicz.chin;
				lheavyDbl[pos][4] = CreateFighter.JanBlachowicz.strk;
				lheavyDbl[pos][5] = CreateFighter.JanBlachowicz.wrst;
				lheavyDbl[pos][6] = CreateFighter.JanBlachowicz.iq;
				lheavyDbl[pos][7] = CreateFighter.JanBlachowicz.luck;
				
				lheavyInt[pos][0] = CreateFighter.JanBlachowicz.win;
				lheavyInt[pos][1] = CreateFighter.JanBlachowicz.loss;
				lheavyInt[pos][2] = CreateFighter.JanBlachowicz.position;
				lheavyInt[pos][3] = CreateFighter.JanBlachowicz.weight;
				
				lheavyBool[pos][0] = CreateFighter.JanBlachowicz.mad;
			}
			else if (CreateFighter.CoreyAnderson.getPos() == pos) {
				lheavyStr[pos][0] = CreateFighter.CoreyAnderson.first;
				lheavyStr[pos][1] = CreateFighter.CoreyAnderson.last;
				lheavyStr[pos][2] = CreateFighter.CoreyAnderson.country;
				
				lheavyDbl[pos][0] = CreateFighter.CoreyAnderson.str;
				lheavyDbl[pos][1] = CreateFighter.CoreyAnderson.spd;
				lheavyDbl[pos][2] = CreateFighter.CoreyAnderson.stm;
				lheavyDbl[pos][3] = CreateFighter.CoreyAnderson.chin;
				lheavyDbl[pos][4] = CreateFighter.CoreyAnderson.strk;
				lheavyDbl[pos][5] = CreateFighter.CoreyAnderson.wrst;
				lheavyDbl[pos][6] = CreateFighter.CoreyAnderson.iq;
				lheavyDbl[pos][7] = CreateFighter.CoreyAnderson.luck;
				
				lheavyInt[pos][0] = CreateFighter.CoreyAnderson.win;
				lheavyInt[pos][1] = CreateFighter.CoreyAnderson.loss;
				lheavyInt[pos][2] = CreateFighter.CoreyAnderson.position;
				lheavyInt[pos][3] = CreateFighter.CoreyAnderson.weight;
				
				lheavyBool[pos][0] = CreateFighter.CoreyAnderson.mad;
			}
			else if (CreateFighter.VolkanOezdemir.getPos() == pos) {
				lheavyStr[pos][0] = CreateFighter.VolkanOezdemir.first;
				lheavyStr[pos][1] = CreateFighter.VolkanOezdemir.last;
				lheavyStr[pos][2] = CreateFighter.VolkanOezdemir.country;
				
				lheavyDbl[pos][0] = CreateFighter.VolkanOezdemir.str;
				lheavyDbl[pos][1] = CreateFighter.VolkanOezdemir.spd;
				lheavyDbl[pos][2] = CreateFighter.VolkanOezdemir.stm;
				lheavyDbl[pos][3] = CreateFighter.VolkanOezdemir.chin;
				lheavyDbl[pos][4] = CreateFighter.VolkanOezdemir.strk;
				lheavyDbl[pos][5] = CreateFighter.VolkanOezdemir.wrst;
				lheavyDbl[pos][6] = CreateFighter.VolkanOezdemir.iq;
				lheavyDbl[pos][7] = CreateFighter.VolkanOezdemir.luck;
				
				lheavyInt[pos][0] = CreateFighter.VolkanOezdemir.win;
				lheavyInt[pos][1] = CreateFighter.VolkanOezdemir.loss;
				lheavyInt[pos][2] = CreateFighter.VolkanOezdemir.position;
				lheavyInt[pos][3] = CreateFighter.VolkanOezdemir.weight;
				
				lheavyBool[pos][0] = CreateFighter.VolkanOezdemir.mad;
			}
			else if (CreateFighter.AlexanderGustafsson.getPos() == pos) {
				lheavyStr[pos][0] = CreateFighter.AlexanderGustafsson.first;
				lheavyStr[pos][1] = CreateFighter.AlexanderGustafsson.last;
				lheavyStr[pos][2] = CreateFighter.AlexanderGustafsson.country;
				
				lheavyDbl[pos][0] = CreateFighter.AlexanderGustafsson.str;
				lheavyDbl[pos][1] = CreateFighter.AlexanderGustafsson.spd;
				lheavyDbl[pos][2] = CreateFighter.AlexanderGustafsson.stm;
				lheavyDbl[pos][3] = CreateFighter.AlexanderGustafsson.chin;
				lheavyDbl[pos][4] = CreateFighter.AlexanderGustafsson.strk;
				lheavyDbl[pos][5] = CreateFighter.AlexanderGustafsson.wrst;
				lheavyDbl[pos][6] = CreateFighter.AlexanderGustafsson.iq;
				lheavyDbl[pos][7] = CreateFighter.AlexanderGustafsson.luck;
				
				lheavyInt[pos][0] = CreateFighter.AlexanderGustafsson.win;
				lheavyInt[pos][1] = CreateFighter.AlexanderGustafsson.loss;
				lheavyInt[pos][2] = CreateFighter.AlexanderGustafsson.position;
				lheavyInt[pos][3] = CreateFighter.AlexanderGustafsson.weight;
				
				lheavyBool[pos][0] = CreateFighter.AlexanderGustafsson.mad;
			}
			else if (CreateFighter.GloverTeixeira.getPos() == pos) {
				lheavyStr[pos][0] = CreateFighter.GloverTeixeira.first;
				lheavyStr[pos][1] = CreateFighter.GloverTeixeira.last;
				lheavyStr[pos][2] = CreateFighter.GloverTeixeira.country;
				
				lheavyDbl[pos][0] = CreateFighter.GloverTeixeira.str;
				lheavyDbl[pos][1] = CreateFighter.GloverTeixeira.spd;
				lheavyDbl[pos][2] = CreateFighter.GloverTeixeira.stm;
				lheavyDbl[pos][3] = CreateFighter.GloverTeixeira.chin;
				lheavyDbl[pos][4] = CreateFighter.GloverTeixeira.strk;
				lheavyDbl[pos][5] = CreateFighter.GloverTeixeira.wrst;
				lheavyDbl[pos][6] = CreateFighter.GloverTeixeira.iq;
				lheavyDbl[pos][7] = CreateFighter.GloverTeixeira.luck;
				
				lheavyInt[pos][0] = CreateFighter.GloverTeixeira.win;
				lheavyInt[pos][1] = CreateFighter.GloverTeixeira.loss;
				lheavyInt[pos][2] = CreateFighter.GloverTeixeira.position;
				lheavyInt[pos][3] = CreateFighter.GloverTeixeira.weight;
				
				lheavyBool[pos][0] = CreateFighter.GloverTeixeira.mad;
			}
			else if (CreateFighter.JohnnyWalker.getPos() == pos) {
				lheavyStr[pos][0] = CreateFighter.JohnnyWalker.first;
				lheavyStr[pos][1] = CreateFighter.JohnnyWalker.last;
				lheavyStr[pos][2] = CreateFighter.JohnnyWalker.country;
				
				lheavyDbl[pos][0] = CreateFighter.JohnnyWalker.str;
				lheavyDbl[pos][1] = CreateFighter.JohnnyWalker.spd;
				lheavyDbl[pos][2] = CreateFighter.JohnnyWalker.stm;
				lheavyDbl[pos][3] = CreateFighter.JohnnyWalker.chin;
				lheavyDbl[pos][4] = CreateFighter.JohnnyWalker.strk;
				lheavyDbl[pos][5] = CreateFighter.JohnnyWalker.wrst;
				lheavyDbl[pos][6] = CreateFighter.JohnnyWalker.iq;
				lheavyDbl[pos][7] = CreateFighter.JohnnyWalker.luck;
				
				lheavyInt[pos][0] = CreateFighter.JohnnyWalker.win;
				lheavyInt[pos][1] = CreateFighter.JohnnyWalker.loss;
				lheavyInt[pos][2] = CreateFighter.JohnnyWalker.position;
				lheavyInt[pos][3] = CreateFighter.JohnnyWalker.weight;
				
				lheavyBool[pos][0] = CreateFighter.JohnnyWalker.mad;
			}
		}
		
		else if (weight == 8) {
			if (CreateFighter.StipeMiocic.getPos() == pos) {
				heavyStr[pos][0] = CreateFighter.StipeMiocic.first;
				heavyStr[pos][1] = CreateFighter.StipeMiocic.last;
				heavyStr[pos][2] = CreateFighter.StipeMiocic.country;
				
				heavyDbl[pos][0] = CreateFighter.StipeMiocic.str;
				heavyDbl[pos][1] = CreateFighter.StipeMiocic.spd;
				heavyDbl[pos][2] = CreateFighter.StipeMiocic.stm;
				heavyDbl[pos][3] = CreateFighter.StipeMiocic.chin;
				heavyDbl[pos][4] = CreateFighter.StipeMiocic.strk;
				heavyDbl[pos][5] = CreateFighter.StipeMiocic.wrst;
				heavyDbl[pos][6] = CreateFighter.StipeMiocic.iq;
				heavyDbl[pos][7] = CreateFighter.StipeMiocic.luck;
				
				heavyInt[pos][0] = CreateFighter.StipeMiocic.win;
				heavyInt[pos][1] = CreateFighter.StipeMiocic.loss;
				heavyInt[pos][2] = CreateFighter.StipeMiocic.position;
				heavyInt[pos][3] = CreateFighter.StipeMiocic.weight;
				
				heavyBool[pos][0] = CreateFighter.StipeMiocic.mad;
			}
			else if (CreateFighter.DanielCormier.getPos() == pos) {
				heavyStr[pos][0] = CreateFighter.DanielCormier.first;
				heavyStr[pos][1] = CreateFighter.DanielCormier.last;
				heavyStr[pos][2] = CreateFighter.DanielCormier.country;
				
				heavyDbl[pos][0] = CreateFighter.DanielCormier.str;
				heavyDbl[pos][1] = CreateFighter.DanielCormier.spd;
				heavyDbl[pos][2] = CreateFighter.DanielCormier.stm;
				heavyDbl[pos][3] = CreateFighter.DanielCormier.chin;
				heavyDbl[pos][4] = CreateFighter.DanielCormier.strk;
				heavyDbl[pos][5] = CreateFighter.DanielCormier.wrst;
				heavyDbl[pos][6] = CreateFighter.DanielCormier.iq;
				heavyDbl[pos][7] = CreateFighter.DanielCormier.luck;
				
				heavyInt[pos][0] = CreateFighter.DanielCormier.win;
				heavyInt[pos][1] = CreateFighter.DanielCormier.loss;
				heavyInt[pos][2] = CreateFighter.DanielCormier.position;
				heavyInt[pos][3] = CreateFighter.DanielCormier.weight;
				
				heavyBool[pos][0] = CreateFighter.DanielCormier.mad;
			}
			else if (CreateFighter.FrancisNgannou.getPos() == pos) {
				heavyStr[pos][0] = CreateFighter.FrancisNgannou.first;
				heavyStr[pos][1] = CreateFighter.FrancisNgannou.last;
				heavyStr[pos][2] = CreateFighter.FrancisNgannou.country;
				
				heavyDbl[pos][0] = CreateFighter.FrancisNgannou.str;
				heavyDbl[pos][1] = CreateFighter.FrancisNgannou.spd;
				heavyDbl[pos][2] = CreateFighter.FrancisNgannou.stm;
				heavyDbl[pos][3] = CreateFighter.FrancisNgannou.chin;
				heavyDbl[pos][4] = CreateFighter.FrancisNgannou.strk;
				heavyDbl[pos][5] = CreateFighter.FrancisNgannou.wrst;
				heavyDbl[pos][6] = CreateFighter.FrancisNgannou.iq;
				heavyDbl[pos][7] = CreateFighter.FrancisNgannou.luck;
				
				heavyInt[pos][0] = CreateFighter.FrancisNgannou.win;
				heavyInt[pos][1] = CreateFighter.FrancisNgannou.loss;
				heavyInt[pos][2] = CreateFighter.FrancisNgannou.position;
				heavyInt[pos][3] = CreateFighter.FrancisNgannou.weight;
				
				heavyBool[pos][0] = CreateFighter.FrancisNgannou.mad;
			}
			else if (CreateFighter.CurtisBlaydes.getPos() == pos) {
				heavyStr[pos][0] = CreateFighter.CurtisBlaydes.first;
				heavyStr[pos][1] = CreateFighter.CurtisBlaydes.last;
				heavyStr[pos][2] = CreateFighter.CurtisBlaydes.country;
				
				heavyDbl[pos][0] = CreateFighter.CurtisBlaydes.str;
				heavyDbl[pos][1] = CreateFighter.CurtisBlaydes.spd;
				heavyDbl[pos][2] = CreateFighter.CurtisBlaydes.stm;
				heavyDbl[pos][3] = CreateFighter.CurtisBlaydes.chin;
				heavyDbl[pos][4] = CreateFighter.CurtisBlaydes.strk;
				heavyDbl[pos][5] = CreateFighter.CurtisBlaydes.wrst;
				heavyDbl[pos][6] = CreateFighter.CurtisBlaydes.iq;
				heavyDbl[pos][7] = CreateFighter.CurtisBlaydes.luck;
				
				heavyInt[pos][0] = CreateFighter.CurtisBlaydes.win;
				heavyInt[pos][1] = CreateFighter.CurtisBlaydes.loss;
				heavyInt[pos][2] = CreateFighter.CurtisBlaydes.position;
				heavyInt[pos][3] = CreateFighter.CurtisBlaydes.weight;
				
				heavyBool[pos][0] = CreateFighter.CurtisBlaydes.mad;
			}
			else if (CreateFighter.JuniorDosSantos.getPos() == pos) {
				heavyStr[pos][0] = CreateFighter.JuniorDosSantos.first;
				heavyStr[pos][1] = CreateFighter.JuniorDosSantos.last;
				heavyStr[pos][2] = CreateFighter.JuniorDosSantos.country;
				
				heavyDbl[pos][0] = CreateFighter.JuniorDosSantos.str;
				heavyDbl[pos][1] = CreateFighter.JuniorDosSantos.spd;
				heavyDbl[pos][2] = CreateFighter.JuniorDosSantos.stm;
				heavyDbl[pos][3] = CreateFighter.JuniorDosSantos.chin;
				heavyDbl[pos][4] = CreateFighter.JuniorDosSantos.strk;
				heavyDbl[pos][5] = CreateFighter.JuniorDosSantos.wrst;
				heavyDbl[pos][6] = CreateFighter.JuniorDosSantos.iq;
				heavyDbl[pos][7] = CreateFighter.JuniorDosSantos.luck;
				
				heavyInt[pos][0] = CreateFighter.JuniorDosSantos.win;
				heavyInt[pos][1] = CreateFighter.JuniorDosSantos.loss;
				heavyInt[pos][2] = CreateFighter.JuniorDosSantos.position;
				heavyInt[pos][3] = CreateFighter.JuniorDosSantos.weight;
				
				heavyBool[pos][0] = CreateFighter.JuniorDosSantos.mad;
			}
			else if (CreateFighter.DerrickLewis.getPos() == pos) {
				heavyStr[pos][0] = CreateFighter.DerrickLewis.first;
				heavyStr[pos][1] = CreateFighter.DerrickLewis.last;
				heavyStr[pos][2] = CreateFighter.DerrickLewis.country;
				
				heavyDbl[pos][0] = CreateFighter.DerrickLewis.str;
				heavyDbl[pos][1] = CreateFighter.DerrickLewis.spd;
				heavyDbl[pos][2] = CreateFighter.DerrickLewis.stm;
				heavyDbl[pos][3] = CreateFighter.DerrickLewis.chin;
				heavyDbl[pos][4] = CreateFighter.DerrickLewis.strk;
				heavyDbl[pos][5] = CreateFighter.DerrickLewis.wrst;
				heavyDbl[pos][6] = CreateFighter.DerrickLewis.iq;
				heavyDbl[pos][7] = CreateFighter.DerrickLewis.luck;
				
				heavyInt[pos][0] = CreateFighter.DerrickLewis.win;
				heavyInt[pos][1] = CreateFighter.DerrickLewis.loss;
				heavyInt[pos][2] = CreateFighter.DerrickLewis.position;
				heavyInt[pos][3] = CreateFighter.DerrickLewis.weight;
				
				heavyBool[pos][0] = CreateFighter.DerrickLewis.mad;
			}
			else if (CreateFighter.JairzinhoRozenstruik.getPos() == pos) {
				heavyStr[pos][0] = CreateFighter.JairzinhoRozenstruik.first;
				heavyStr[pos][1] = CreateFighter.JairzinhoRozenstruik.last;
				heavyStr[pos][2] = CreateFighter.JairzinhoRozenstruik.country;
				
				heavyDbl[pos][0] = CreateFighter.JairzinhoRozenstruik.str;
				heavyDbl[pos][1] = CreateFighter.JairzinhoRozenstruik.spd;
				heavyDbl[pos][2] = CreateFighter.JairzinhoRozenstruik.stm;
				heavyDbl[pos][3] = CreateFighter.JairzinhoRozenstruik.chin;
				heavyDbl[pos][4] = CreateFighter.JairzinhoRozenstruik.strk;
				heavyDbl[pos][5] = CreateFighter.JairzinhoRozenstruik.wrst;
				heavyDbl[pos][6] = CreateFighter.JairzinhoRozenstruik.iq;
				heavyDbl[pos][7] = CreateFighter.JairzinhoRozenstruik.luck;
				
				heavyInt[pos][0] = CreateFighter.JairzinhoRozenstruik.win;
				heavyInt[pos][1] = CreateFighter.JairzinhoRozenstruik.loss;
				heavyInt[pos][2] = CreateFighter.JairzinhoRozenstruik.position;
				heavyInt[pos][3] = CreateFighter.JairzinhoRozenstruik.weight;
				
				heavyBool[pos][0] = CreateFighter.JairzinhoRozenstruik.mad;
			}
			else if (CreateFighter.AlexanderVolkov.getPos() == pos) {
				heavyStr[pos][0] = CreateFighter.AlexanderVolkov.first;
				heavyStr[pos][1] = CreateFighter.AlexanderVolkov.last;
				heavyStr[pos][2] = CreateFighter.AlexanderVolkov.country;
				
				heavyDbl[pos][0] = CreateFighter.AlexanderVolkov.str;
				heavyDbl[pos][1] = CreateFighter.AlexanderVolkov.spd;
				heavyDbl[pos][2] = CreateFighter.AlexanderVolkov.stm;
				heavyDbl[pos][3] = CreateFighter.AlexanderVolkov.chin;
				heavyDbl[pos][4] = CreateFighter.AlexanderVolkov.strk;
				heavyDbl[pos][5] = CreateFighter.AlexanderVolkov.wrst;
				heavyDbl[pos][6] = CreateFighter.AlexanderVolkov.iq;
				heavyDbl[pos][7] = CreateFighter.AlexanderVolkov.luck;
				
				heavyInt[pos][0] = CreateFighter.AlexanderVolkov.win;
				heavyInt[pos][1] = CreateFighter.AlexanderVolkov.loss;
				heavyInt[pos][2] = CreateFighter.AlexanderVolkov.position;
				heavyInt[pos][3] = CreateFighter.AlexanderVolkov.weight;
				
				heavyBool[pos][0] = CreateFighter.AlexanderVolkov.mad;
			}
			else if (CreateFighter.AlistairOvereem.getPos() == pos) {
				heavyStr[pos][0] = CreateFighter.AlistairOvereem.first;
				heavyStr[pos][1] = CreateFighter.AlistairOvereem.last;
				heavyStr[pos][2] = CreateFighter.AlistairOvereem.country;
				
				heavyDbl[pos][0] = CreateFighter.AlistairOvereem.str;
				heavyDbl[pos][1] = CreateFighter.AlistairOvereem.spd;
				heavyDbl[pos][2] = CreateFighter.AlistairOvereem.stm;
				heavyDbl[pos][3] = CreateFighter.AlistairOvereem.chin;
				heavyDbl[pos][4] = CreateFighter.AlistairOvereem.strk;
				heavyDbl[pos][5] = CreateFighter.AlistairOvereem.wrst;
				heavyDbl[pos][6] = CreateFighter.AlistairOvereem.iq;
				heavyDbl[pos][7] = CreateFighter.AlistairOvereem.luck;
				
				heavyInt[pos][0] = CreateFighter.AlistairOvereem.win;
				heavyInt[pos][1] = CreateFighter.AlistairOvereem.loss;
				heavyInt[pos][2] = CreateFighter.AlistairOvereem.position;
				heavyInt[pos][3] = CreateFighter.AlistairOvereem.weight;
				
				heavyBool[pos][0] = CreateFighter.AlistairOvereem.mad;
			}
			else if (CreateFighter.WaltHarris.getPos() == pos) {
				heavyStr[pos][0] = CreateFighter.WaltHarris.first;
				heavyStr[pos][1] = CreateFighter.WaltHarris.last;
				heavyStr[pos][2] = CreateFighter.WaltHarris.country;
				
				heavyDbl[pos][0] = CreateFighter.WaltHarris.str;
				heavyDbl[pos][1] = CreateFighter.WaltHarris.spd;
				heavyDbl[pos][2] = CreateFighter.WaltHarris.stm;
				heavyDbl[pos][3] = CreateFighter.WaltHarris.chin;
				heavyDbl[pos][4] = CreateFighter.WaltHarris.strk;
				heavyDbl[pos][5] = CreateFighter.WaltHarris.wrst;
				heavyDbl[pos][6] = CreateFighter.WaltHarris.iq;
				heavyDbl[pos][7] = CreateFighter.WaltHarris.luck;
				
				heavyInt[pos][0] = CreateFighter.WaltHarris.win;
				heavyInt[pos][1] = CreateFighter.WaltHarris.loss;
				heavyInt[pos][2] = CreateFighter.WaltHarris.position;
				heavyInt[pos][3] = CreateFighter.WaltHarris.weight;
				
				heavyBool[pos][0] = CreateFighter.WaltHarris.mad;
			}
		}
		
	}

}
