package UFCsimulator;

public class FollowerCheck {
	
	static String mad[][] = new String[10][2];
	static int madInd = 0;

	public static void followerCheck(int weight) {
		
		int pos = Weight.Player.getPos();
		int wgt = Weight.Player.getWeight();
		
		for (int i = 10; i > pos; --i) {
			String[] temp = new String[2];
			
			temp = opponentSearch(i, wgt);
			
			if (temp[0] != "NULL") {
				mad[madInd][0] = temp[0];
				mad[madInd][1] = temp[1];
				
				++madInd;
			}
		}
		
		if (Fighter.BalanceUFC.getClout() >= 10000) {
			String[] temp = new String[2];
			
			temp = opponentSearch(9, wgt);
			
			if (temp[0] != "NULL") {
				mad[madInd][0] = temp[0];
				mad[madInd][1] = temp[1];
				
				++madInd;
			}
		}
		if (Fighter.BalanceUFC.getClout() >= 22000) {
			String[] temp = new String[2];
			
			temp = opponentSearch(8, wgt);
			
			if (temp[0] != "NULL") {
				mad[madInd][0] = temp[0];
				mad[madInd][1] = temp[1];
				
				++madInd;
			}
		}
		if (Fighter.BalanceUFC.getClout() >= 42000) {
			String[] temp = new String[2];
			
			temp = opponentSearch(7, wgt);
			
			if (temp[0] != "NULL") {
				mad[madInd][0] = temp[0];
				mad[madInd][1] = temp[1];
				
				++madInd;
			}
		}
		if (Fighter.BalanceUFC.getClout() >= 70000) {
			String[] temp = new String[2];
			
			temp = opponentSearch(6, wgt);
			
			if (temp[0] != "NULL") {
				mad[madInd][0] = temp[0];
				mad[madInd][1] = temp[1];
				
				++madInd;
			}
		}
		if (Fighter.BalanceUFC.getClout() >= 110000) {
			String[] temp = new String[2];
			
			temp = opponentSearch(5, wgt);
			
			if (temp[0] != "NULL") {
				mad[madInd][0] = temp[0];
				mad[madInd][1] = temp[1];
				
				++madInd;
			}
		}
		if (Fighter.BalanceUFC.getClout() >= 170000) {
			String[] temp = new String[2];
			
			temp = opponentSearch(4, wgt);
			
			if (temp[0] != "NULL") {
				mad[madInd][0] = temp[0];
				mad[madInd][1] = temp[1];
				
				++madInd;
			}
		}
		if (Fighter.BalanceUFC.getClout() >= 235000) {
			String[] temp = new String[2];
			
			temp = opponentSearch(3, wgt);
			
			if (temp[0] != "NULL") {
				mad[madInd][0] = temp[0];
				mad[madInd][1] = temp[1];
				
				++madInd;
			}
		}
		if (Fighter.BalanceUFC.getClout() >= 315000) {
			String[] temp = new String[2];
			
			temp = opponentSearch(2, wgt);
			
			if (temp[0] != "NULL") {
				mad[madInd][0] = temp[0];
				mad[madInd][1] = temp[1];
				
				++madInd;
			}
		}
		if (Fighter.BalanceUFC.getClout() >= 420000) {
			String[] temp = new String[2];
			
			temp = opponentSearch(1, wgt);
			
			if (temp[0] != "NULL") {
				mad[madInd][0] = temp[0];
				mad[madInd][1] = temp[1];
				
				++madInd;
			}
		}
		if (Fighter.BalanceUFC.getClout() >= 530000) {
			String[] temp = new String[2];
			
			temp = opponentSearch(0, wgt);
			
			if (temp[0] != "NULL") {
				mad[madInd][0] = temp[0];
				mad[madInd][1] = temp[1];
				
				++madInd;
			}
		}
	}
	
	public static String[] opponentSearch(int pos, int weight) {
		
		String[] name = new String[2];
		
		if (weight == 1) {
			if (CreateFighter.DeivesonFigueiredo.getPos() == pos && CreateFighter.DeivesonFigueiredo.unfound) {
				CreateFighter.DeivesonFigueiredo.found();
				CreateFighter.DeivesonFigueiredo.mad();
				
				name[0] = CreateFighter.DeivesonFigueiredo.first;
				name[1] = CreateFighter.DeivesonFigueiredo.last;
				
				return name;
			}
			else if (CreateFighter.JosephBenavidez.getPos() == pos && CreateFighter.JosephBenavidez.unfound) {
				CreateFighter.JosephBenavidez.found();
				CreateFighter.JosephBenavidez.mad();
				
				name[0] = CreateFighter.JosephBenavidez.first;
				name[1] = CreateFighter.JosephBenavidez.last;
				
				return name;
			}
			else if (CreateFighter.JussierFormiga.getPos() == pos && CreateFighter.JussierFormiga.unfound) {
				CreateFighter.JussierFormiga.found();
				CreateFighter.JussierFormiga.mad();
				
				name[0] = CreateFighter.JussierFormiga.first;
				name[1] = CreateFighter.JussierFormiga.last;
				
				return name;
			}
			else if (CreateFighter.AlexandrePantoja.getPos() == pos && CreateFighter.AlexandrePantoja.unfound) {
				CreateFighter.AlexandrePantoja.found();
				CreateFighter.AlexandrePantoja.mad();
				
				name[0] = CreateFighter.AlexandrePantoja.first;
				name[1] = CreateFighter.AlexandrePantoja.last;
				
				return name;
			}
			else if (CreateFighter.BrandonMoreno.getPos() == pos && CreateFighter.BrandonMoreno.unfound) {
				CreateFighter.BrandonMoreno.found();
				CreateFighter.BrandonMoreno.mad();
				
				name[0] = CreateFighter.BrandonMoreno.first;
				name[1] = CreateFighter.BrandonMoreno.last;
				
				return name;
			}
			else if (CreateFighter.AskarAskarov.getPos() == pos && CreateFighter.AskarAskarov.unfound) {
				CreateFighter.AskarAskarov.found();
				CreateFighter.AskarAskarov.mad();
				
				name[0] = CreateFighter.AskarAskarov.first;
				name[1] = CreateFighter.AskarAskarov.last;
				
				return name;
			}
			else if (CreateFighter.KaiKaraFrance.getPos() == pos && CreateFighter.KaiKaraFrance.unfound) {
				CreateFighter.KaiKaraFrance.found();
				CreateFighter.KaiKaraFrance.mad();
				
				name[0] = CreateFighter.KaiKaraFrance.first;
				name[1] = CreateFighter.KaiKaraFrance.last;
				
				return name;
			}
			else if (CreateFighter.RogerioBontorin.getPos() == pos && CreateFighter.RogerioBontorin.unfound) {
				CreateFighter.RogerioBontorin.found();
				CreateFighter.RogerioBontorin.mad();
				
				name[0] = CreateFighter.RogerioBontorin.first;
				name[1] = CreateFighter.RogerioBontorin.last;
				
				return name;
			}
			else if (CreateFighter.AlexPerez.getPos() == pos && CreateFighter.AlexPerez.unfound) {
				CreateFighter.AlexPerez.found();
				CreateFighter.AlexPerez.mad();
				
				name[0] = CreateFighter.AlexPerez.first;
				name[1] = CreateFighter.AlexPerez.last;
				
				return name;
			}
			else if (CreateFighter.MattSchnell.getPos() == pos && CreateFighter.MattSchnell.unfound) {
				CreateFighter.MattSchnell.found();
				CreateFighter.MattSchnell.mad();
				
				name[0] = CreateFighter.MattSchnell.first;
				name[1] = CreateFighter.MattSchnell.last;
				
				return name;
			}
		}
		
		else if (weight == 2) {
			if (CreateFighter.HenryCejudo.getPos() == pos && CreateFighter.HenryCejudo.unfound) {
				CreateFighter.HenryCejudo.found();
				CreateFighter.HenryCejudo.mad();
				
				name[0] = CreateFighter.HenryCejudo.first;
				name[1] = CreateFighter.HenryCejudo.last;
				
				return name;
			}
			else if (CreateFighter.MarlonMoraes.getPos() == pos && CreateFighter.MarlonMoraes.unfound) {
				CreateFighter.MarlonMoraes.found();
				CreateFighter.MarlonMoraes.mad();
				
				name[0] = CreateFighter.MarlonMoraes.first;
				name[1] = CreateFighter.MarlonMoraes.last;
				
				return name;
			}
			else if (CreateFighter.AljamainSterling.getPos() == pos && CreateFighter.AljamainSterling.unfound) {
				CreateFighter.AljamainSterling.found();
				CreateFighter.AljamainSterling.mad();
				
				name[0] = CreateFighter.AljamainSterling.first;
				name[1] = CreateFighter.AljamainSterling.last;
				
				return name;
			}
			else if (CreateFighter.PetrYan.getPos() == pos && CreateFighter.PetrYan.unfound) {
				CreateFighter.PetrYan.found();
				CreateFighter.PetrYan.mad();
				
				name[0] = CreateFighter.PetrYan.first;
				name[1] = CreateFighter.PetrYan.last;
				
				return name;
			}
			else if (CreateFighter.CorySandhagen.getPos() == pos && CreateFighter.CorySandhagen.unfound) {
				CreateFighter.CorySandhagen.found();
				CreateFighter.CorySandhagen.mad();
				
				name[0] = CreateFighter.CorySandhagen.first;
				name[1] = CreateFighter.CorySandhagen.last;
				
				return name;
			}
			else if (CreateFighter.RaphaelAssuncao.getPos() == pos && CreateFighter.RaphaelAssuncao.unfound) {
				CreateFighter.RaphaelAssuncao.found();
				CreateFighter.RaphaelAssuncao.mad();
				
				name[0] = CreateFighter.RaphaelAssuncao.first;
				name[1] = CreateFighter.RaphaelAssuncao.last;
				
				return name;
			}
			else if (CreateFighter.PedroMunhoz.getPos() == pos && CreateFighter.PedroMunhoz.unfound) {
				CreateFighter.PedroMunhoz.found();
				CreateFighter.PedroMunhoz.mad();
				
				name[0] = CreateFighter.PedroMunhoz.first;
				name[1] = CreateFighter.PedroMunhoz.last;
				
				return name;
			}
			else if (CreateFighter.JimmieRivera.getPos() == pos && CreateFighter.JimmieRivera.unfound) {
				CreateFighter.JimmieRivera.found();
				CreateFighter.JimmieRivera.mad();
				
				name[0] = CreateFighter.JimmieRivera.first;
				name[1] = CreateFighter.JimmieRivera.last;
				
				return name;
			}
			else if (CreateFighter.CodyGarbrandt.getPos() == pos && CreateFighter.CodyGarbrandt.unfound) {
				CreateFighter.CodyGarbrandt.found();
				CreateFighter.CodyGarbrandt.mad();
				
				name[0] = CreateFighter.CodyGarbrandt.first;
				name[1] = CreateFighter.CodyGarbrandt.last;
				
				return name;
			}
			else if (CreateFighter.SeanOMalley.getPos() == pos && CreateFighter.SeanOMalley.unfound) {
				CreateFighter.SeanOMalley.found();
				CreateFighter.SeanOMalley.mad();
				
				name[0] = CreateFighter.SeanOMalley.first;
				name[1] = CreateFighter.SeanOMalley.last;
				
				return name;
			}
		}
		
		else if (weight == 3) {
			if (CreateFighter.AlexanderVolkanovski.getPos() == pos && CreateFighter.AlexanderVolkanovski.unfound) {
				CreateFighter.AlexanderVolkanovski.found();
				CreateFighter.AlexanderVolkanovski.mad();
				
				name[0] = CreateFighter.AlexanderVolkanovski.first;
				name[1] = CreateFighter.AlexanderVolkanovski.last;
				
				return name;
			}
			else if (CreateFighter.MaxHolloway.getPos() == pos && CreateFighter.MaxHolloway.unfound) {
				CreateFighter.MaxHolloway.found();
				CreateFighter.MaxHolloway.mad();
				
				name[0] = CreateFighter.MaxHolloway.first;
				name[1] = CreateFighter.MaxHolloway.last;
				
				return name;
			}
			else if (CreateFighter.BrianOrtega.getPos() == pos && CreateFighter.BrianOrtega.unfound) {
				CreateFighter.BrianOrtega.found();
				CreateFighter.BrianOrtega.mad();
				
				name[0] = CreateFighter.BrianOrtega.first;
				name[1] = CreateFighter.BrianOrtega.last;
				
				return name;
			}
			else if (CreateFighter.ZabitMagomedsharipov.getPos() == pos && CreateFighter.ZabitMagomedsharipov.unfound) {
				CreateFighter.ZabitMagomedsharipov.found();
				CreateFighter.ZabitMagomedsharipov.mad();
				
				name[0] = CreateFighter.ZabitMagomedsharipov.first;
				name[1] = CreateFighter.ZabitMagomedsharipov.last;
				
				return name;
			}
			else if (CreateFighter.ChanSungJung.getPos() == pos && CreateFighter.ChanSungJung.unfound) {
				CreateFighter.ChanSungJung.found();
				CreateFighter.ChanSungJung.mad();
				
				name[0] = CreateFighter.ChanSungJung.first;
				name[1] = CreateFighter.ChanSungJung.last;
				
				return name;
			}
			else if (CreateFighter.YairRodriguez.getPos() == pos && CreateFighter.YairRodriguez.unfound) {
				CreateFighter.YairRodriguez.found();
				CreateFighter.YairRodriguez.mad();
				
				name[0] = CreateFighter.YairRodriguez.first;
				name[1] = CreateFighter.YairRodriguez.last;
				
				return name;
			}
			else if (CreateFighter.FrankieEdgar.getPos() == pos && CreateFighter.FrankieEdgar.unfound) {
				CreateFighter.FrankieEdgar.found();
				CreateFighter.FrankieEdgar.mad();
				
				name[0] = CreateFighter.FrankieEdgar.first;
				name[1] = CreateFighter.FrankieEdgar.last;
				
				return name;
			}
			else if (CreateFighter.JeremyStephens.getPos() == pos && CreateFighter.JeremyStephens.unfound) {
				CreateFighter.JeremyStephens.found();
				CreateFighter.JeremyStephens.mad();
				
				name[0] = CreateFighter.JeremyStephens.first;
				name[1] = CreateFighter.JeremyStephens.last;
				
				return name;
			}
			else if (CreateFighter.JoseAldo.getPos() == pos && CreateFighter.JoseAldo.unfound) {
				CreateFighter.JoseAldo.found();
				CreateFighter.JoseAldo.mad();
				
				name[0] = CreateFighter.JoseAldo.first;
				name[1] = CreateFighter.JoseAldo.last;
				
				return name;
			}
			else if (CreateFighter.SodiqYusuff.getPos() == pos && CreateFighter.SodiqYusuff.unfound) {
				CreateFighter.SodiqYusuff.found();
				CreateFighter.SodiqYusuff.mad();
				
				name[0] = CreateFighter.SodiqYusuff.first;
				name[1] = CreateFighter.SodiqYusuff.last;
				
				return name;
			}
		}
		
		else if (weight == 4) {
			if (CreateFighter.KhabibNurmagomedov.getPos() == pos && CreateFighter.KhabibNurmagomedov.unfound) {
				CreateFighter.KhabibNurmagomedov.found();
				CreateFighter.KhabibNurmagomedov.mad();
				
				name[0] = CreateFighter.KhabibNurmagomedov.first;
				name[1] = CreateFighter.KhabibNurmagomedov.last;
				
				return name;
			}
			else if (CreateFighter.TonyFerguson.getPos() == pos && CreateFighter.TonyFerguson.unfound) {
				CreateFighter.TonyFerguson.found();
				CreateFighter.TonyFerguson.mad();
				
				name[0] = CreateFighter.TonyFerguson.first;
				name[1] = CreateFighter.TonyFerguson.last;
				
				return name;
			}
			else if (CreateFighter.DustinPoirier.getPos() == pos && CreateFighter.DustinPoirier.unfound) {
				CreateFighter.DustinPoirier.found();
				CreateFighter.DustinPoirier.mad();
				
				name[0] = CreateFighter.DustinPoirier.first;
				name[1] = CreateFighter.DustinPoirier.last;
				
				return name;
			}
			else if (CreateFighter.ConorMcGregor.getPos() == pos && CreateFighter.ConorMcGregor.unfound) {
				CreateFighter.ConorMcGregor.found();
				CreateFighter.ConorMcGregor.mad();
				
				name[0] = CreateFighter.ConorMcGregor.first;
				name[1] = CreateFighter.ConorMcGregor.last;
				
				return name;
			}
			else if (CreateFighter.JustinGaethje.getPos() == pos && CreateFighter.JustinGaethje.unfound) {
				CreateFighter.JustinGaethje.found();
				CreateFighter.JustinGaethje.mad();
				
				name[0] = CreateFighter.JustinGaethje.first;
				name[1] = CreateFighter.JustinGaethje.last;
				
				return name;
			}
			else if (CreateFighter.DanHooker.getPos() == pos && CreateFighter.DanHooker.unfound) {
				CreateFighter.DanHooker.found();
				CreateFighter.DanHooker.mad();
				
				name[0] = CreateFighter.DanHooker.first;
				name[1] = CreateFighter.DanHooker.last;
				
				return name;
			}
			else if (CreateFighter.DonaldCerrone.getPos() == pos && CreateFighter.DonaldCerrone.unfound) {
				CreateFighter.DonaldCerrone.found();
				CreateFighter.DonaldCerrone.mad();
				
				name[0] = CreateFighter.DonaldCerrone.first;
				name[1] = CreateFighter.DonaldCerrone.last;
				
				return name;
			}
			else if (CreateFighter.PaulFelder.getPos() == pos && CreateFighter.PaulFelder.unfound) {
				CreateFighter.PaulFelder.found();
				CreateFighter.PaulFelder.mad();
				
				name[0] = CreateFighter.PaulFelder.first;
				name[1] = CreateFighter.PaulFelder.last;
				
				return name;
			}
			else if (CreateFighter.CharlesOliveira.getPos() == pos && CreateFighter.CharlesOliveira.unfound) {
				CreateFighter.CharlesOliveira.found();
				CreateFighter.CharlesOliveira.mad();
				
				name[0] = CreateFighter.CharlesOliveira.first;
				name[1] = CreateFighter.CharlesOliveira.last;
				
				return name;
			}
			else if (CreateFighter.IslamMakhachev.getPos() == pos && CreateFighter.IslamMakhachev.unfound) {
				CreateFighter.IslamMakhachev.found();
				CreateFighter.IslamMakhachev.mad();
				
				name[0] = CreateFighter.IslamMakhachev.first;
				name[1] = CreateFighter.IslamMakhachev.last;
				
				return name;
			}
		}
		
		else if (weight == 5) {
			if (CreateFighter.KamaruUsman.getPos() == pos && CreateFighter.KamaruUsman.unfound) {
				CreateFighter.KamaruUsman.found();
				CreateFighter.KamaruUsman.mad();
				
				name[0] = CreateFighter.KamaruUsman.first;
				name[1] = CreateFighter.KamaruUsman.last;
				
				return name;
			}
			else if (CreateFighter.TyronWoodley.getPos() == pos && CreateFighter.TyronWoodley.unfound) {
				CreateFighter.TyronWoodley.found();
				CreateFighter.TyronWoodley.mad();
				
				name[0] = CreateFighter.TyronWoodley.first;
				name[1] = CreateFighter.TyronWoodley.last;
				
				return name;
			}
			else if (CreateFighter.ColbyCovington.getPos() == pos && CreateFighter.ColbyCovington.unfound) {
				CreateFighter.ColbyCovington.found();
				CreateFighter.ColbyCovington.mad();
				
				name[0] = CreateFighter.ColbyCovington.first;
				name[1] = CreateFighter.ColbyCovington.last;
				
				return name;
			}
			else if (CreateFighter.JorgeMasvidal.getPos() == pos && CreateFighter.JorgeMasvidal.unfound) {
				CreateFighter.JorgeMasvidal.found();
				CreateFighter.JorgeMasvidal.mad();
				
				name[0] = CreateFighter.JorgeMasvidal.first;
				name[1] = CreateFighter.JorgeMasvidal.last;
				
				return name;
			}
			else if (CreateFighter.LeonEdwards.getPos() == pos && CreateFighter.LeonEdwards.unfound) {
				CreateFighter.LeonEdwards.found();
				CreateFighter.LeonEdwards.mad();
				
				name[0] = CreateFighter.LeonEdwards.first;
				name[1] = CreateFighter.LeonEdwards.last;
				
				return name;
			}
			else if (CreateFighter.StephenThompson.getPos() == pos && CreateFighter.StephenThompson.unfound) {
				CreateFighter.StephenThompson.found();
				CreateFighter.StephenThompson.mad();
				
				name[0] = CreateFighter.StephenThompson.first;
				name[1] = CreateFighter.StephenThompson.last;
				
				return name;
			}
			else if (CreateFighter.DemianMaia.getPos() == pos && CreateFighter.DemianMaia.unfound) {
				CreateFighter.DemianMaia.found();
				CreateFighter.DemianMaia.mad();
				
				name[0] = CreateFighter.DemianMaia.first;
				name[1] = CreateFighter.DemianMaia.last;
				
				return name;
			}
			else if (CreateFighter.RafaelDosAnjos.getPos() == pos && CreateFighter.RafaelDosAnjos.unfound) {
				CreateFighter.RafaelDosAnjos.found();
				CreateFighter.RafaelDosAnjos.mad();
				
				name[0] = CreateFighter.RafaelDosAnjos.first;
				name[1] = CreateFighter.RafaelDosAnjos.last;
				
				return name;
			}
			else if (CreateFighter.NateDiaz.getPos() == pos && CreateFighter.NateDiaz.unfound) {
				CreateFighter.NateDiaz.found();
				CreateFighter.NateDiaz.mad();
				
				name[0] = CreateFighter.NateDiaz.first;
				name[1] = CreateFighter.NateDiaz.last;
				
				return name;
			}
			else if (CreateFighter.AnthonyPettis.getPos() == pos && CreateFighter.AnthonyPettis.unfound) {
				CreateFighter.AnthonyPettis.found();
				CreateFighter.AnthonyPettis.mad();
				
				name[0] = CreateFighter.AnthonyPettis.first;
				name[1] = CreateFighter.AnthonyPettis.last;
				
				return name;
			}
		}
		
		else if (weight == 6) {
			if (CreateFighter.IsraelAdesanya.getPos() == pos && CreateFighter.IsraelAdesanya.unfound) {
				CreateFighter.IsraelAdesanya.found();
				CreateFighter.IsraelAdesanya.mad();
				
				name[0] = CreateFighter.IsraelAdesanya.first;
				name[1] = CreateFighter.IsraelAdesanya.last;
				
				return name;
			}
			else if (CreateFighter.PauloCosta.getPos() == pos && CreateFighter.PauloCosta.unfound) {
				CreateFighter.PauloCosta.found();
				CreateFighter.PauloCosta.mad();
				
				name[0] = CreateFighter.PauloCosta.first;
				name[1] = CreateFighter.PauloCosta.last;
				
				return name;
			}
			else if (CreateFighter.RobertWhittaker.getPos() == pos && CreateFighter.RobertWhittaker.unfound) {
				CreateFighter.RobertWhittaker.found();
				CreateFighter.RobertWhittaker.mad();
				
				name[0] = CreateFighter.RobertWhittaker.first;
				name[1] = CreateFighter.RobertWhittaker.last;
				
				return name;
			}
			else if (CreateFighter.JaredCannonier.getPos() == pos && CreateFighter.JaredCannonier.unfound) {
				CreateFighter.JaredCannonier.found();
				CreateFighter.JaredCannonier.mad();
				
				name[0] = CreateFighter.JaredCannonier.first;
				name[1] = CreateFighter.JaredCannonier.last;
				
				return name;
			}
			else if (CreateFighter.YoelRomero.getPos() == pos && CreateFighter.YoelRomero.unfound) {
				CreateFighter.YoelRomero.found();
				CreateFighter.YoelRomero.mad();
				
				name[0] = CreateFighter.YoelRomero.first;
				name[1] = CreateFighter.YoelRomero.last;
				
				return name;
			}
			else if (CreateFighter.DarrenTill.getPos() == pos && CreateFighter.DarrenTill.unfound) {
				CreateFighter.DarrenTill.found();
				CreateFighter.DarrenTill.mad();
				
				name[0] = CreateFighter.DarrenTill.first;
				name[1] = CreateFighter.DarrenTill.last;
				
				return name;
			}
			else if (CreateFighter.KelvinGastelum.getPos() == pos && CreateFighter.KelvinGastelum.unfound) {
				CreateFighter.KelvinGastelum.found();
				CreateFighter.KelvinGastelum.mad();
				
				name[0] = CreateFighter.KelvinGastelum.first;
				name[1] = CreateFighter.KelvinGastelum.last;
				
				return name;
			}
			else if (CreateFighter.DerekBrunson.getPos() == pos && CreateFighter.DerekBrunson.unfound) {
				CreateFighter.DerekBrunson.found();
				CreateFighter.DerekBrunson.mad();
				
				name[0] = CreateFighter.DerekBrunson.first;
				name[1] = CreateFighter.DerekBrunson.last;
				
				return name;
			}
			else if (CreateFighter.BradTavares.getPos() == pos && CreateFighter.BradTavares.unfound) {
				CreateFighter.BradTavares.found();
				CreateFighter.BradTavares.mad();
				
				name[0] = CreateFighter.BradTavares.first;
				name[1] = CreateFighter.BradTavares.last;
				
				return name;
			}
			else if (CreateFighter.AndersonSilva.getPos() == pos && CreateFighter.AndersonSilva.unfound) {
				CreateFighter.AndersonSilva.found();
				CreateFighter.AndersonSilva.mad();
				
				name[0] = CreateFighter.AndersonSilva.first;
				name[1] = CreateFighter.AndersonSilva.last;
				
				return name;
			}
		}
		
		else if (weight == 7) {
			if (CreateFighter.JonJones.getPos() == pos && CreateFighter.JonJones.unfound) {
				CreateFighter.JonJones.found();
				CreateFighter.JonJones.mad();
				
				name[0] = CreateFighter.JonJones.first;
				name[1] = CreateFighter.JonJones.last;
				
				return name;
			}
			else if (CreateFighter.DominickReyes.getPos() == pos && CreateFighter.DominickReyes.unfound) {
				CreateFighter.DominickReyes.found();
				CreateFighter.DominickReyes.mad();
				
				name[0] = CreateFighter.DominickReyes.first;
				name[1] = CreateFighter.DominickReyes.last;
				
				return name;
			}
			else if (CreateFighter.ThiagoSantos.getPos() == pos && CreateFighter.ThiagoSantos.unfound) {
				CreateFighter.ThiagoSantos.found();
				CreateFighter.ThiagoSantos.mad();
				
				name[0] = CreateFighter.ThiagoSantos.first;
				name[1] = CreateFighter.ThiagoSantos.last;
				
				return name;
			}
			else if (CreateFighter.AnthonySmith.getPos() == pos && CreateFighter.AnthonySmith.unfound) {
				CreateFighter.AnthonySmith.found();
				CreateFighter.AnthonySmith.mad();
				
				name[0] = CreateFighter.AnthonySmith.first;
				name[1] = CreateFighter.AnthonySmith.last;
				
				return name;
			}
			else if (CreateFighter.JanBlachowicz.getPos() == pos && CreateFighter.JanBlachowicz.unfound) {
				CreateFighter.JanBlachowicz.found();
				CreateFighter.JanBlachowicz.mad();
				
				name[0] = CreateFighter.JanBlachowicz.first;
				name[1] = CreateFighter.JanBlachowicz.last;
				
				return name;
			}
			else if (CreateFighter.CoreyAnderson.getPos() == pos && CreateFighter.CoreyAnderson.unfound) {
				CreateFighter.CoreyAnderson.found();
				CreateFighter.CoreyAnderson.mad();
				
				name[0] = CreateFighter.CoreyAnderson.first;
				name[1] = CreateFighter.CoreyAnderson.last;
				
				return name;
			}
			else if (CreateFighter.VolkanOezdemir.getPos() == pos && CreateFighter.VolkanOezdemir.unfound) {
				CreateFighter.VolkanOezdemir.found();
				CreateFighter.VolkanOezdemir.mad();
				
				name[0] = CreateFighter.VolkanOezdemir.first;
				name[1] = CreateFighter.VolkanOezdemir.last;
				
				return name;
			}
			else if (CreateFighter.AlexanderGustafsson.getPos() == pos && CreateFighter.AlexanderGustafsson.unfound) {
				CreateFighter.AlexanderGustafsson.found();
				CreateFighter.AlexanderGustafsson.mad();
				
				name[0] = CreateFighter.AlexanderGustafsson.first;
				name[1] = CreateFighter.AlexanderGustafsson.last;
				
				return name;
			}
			else if (CreateFighter.GloverTeixeira.getPos() == pos && CreateFighter.GloverTeixeira.unfound) {
				CreateFighter.GloverTeixeira.found();
				CreateFighter.GloverTeixeira.mad();
				
				name[0] = CreateFighter.GloverTeixeira.first;
				name[1] = CreateFighter.GloverTeixeira.last;
				
				return name;
			}
			else if (CreateFighter.JohnnyWalker.getPos() == pos && CreateFighter.JohnnyWalker.unfound) {
				CreateFighter.JohnnyWalker.found();
				CreateFighter.JohnnyWalker.mad();
				
				name[0] = CreateFighter.JohnnyWalker.first;
				name[1] = CreateFighter.JohnnyWalker.last;
				
				return name;
			}
		}
		
		else if (weight == 8) {
			if (CreateFighter.StipeMiocic.getPos() == pos && CreateFighter.StipeMiocic.unfound) {
				CreateFighter.StipeMiocic.found();
				CreateFighter.StipeMiocic.mad();
				
				name[0] = CreateFighter.StipeMiocic.first;
				name[1] = CreateFighter.StipeMiocic.last;
				
				return name;
			}
			else if (CreateFighter.DanielCormier.getPos() == pos && CreateFighter.DanielCormier.unfound) {
				CreateFighter.DanielCormier.found();
				CreateFighter.DanielCormier.mad();
				
				name[0] = CreateFighter.DanielCormier.first;
				name[1] = CreateFighter.DanielCormier.last;
				
				return name;
			}
			else if (CreateFighter.FrancisNgannou.getPos() == pos && CreateFighter.FrancisNgannou.unfound) {
				CreateFighter.FrancisNgannou.found();
				CreateFighter.FrancisNgannou.mad();
				
				name[0] = CreateFighter.FrancisNgannou.first;
				name[1] = CreateFighter.FrancisNgannou.last;
				
				return name;
			}
			else if (CreateFighter.CurtisBlaydes.getPos() == pos && CreateFighter.CurtisBlaydes.unfound) {
				CreateFighter.CurtisBlaydes.found();
				CreateFighter.CurtisBlaydes.mad();
				
				name[0] = CreateFighter.CurtisBlaydes.first;
				name[1] = CreateFighter.CurtisBlaydes.last;
				
				return name;
			}
			else if (CreateFighter.JuniorDosSantos.getPos() == pos && CreateFighter.JuniorDosSantos.unfound) {
				CreateFighter.JuniorDosSantos.found();
				CreateFighter.JuniorDosSantos.mad();
				
				name[0] = CreateFighter.JuniorDosSantos.first;
				name[1] = CreateFighter.JuniorDosSantos.last;
				
				return name;
			}
			else if (CreateFighter.DerrickLewis.getPos() == pos && CreateFighter.DerrickLewis.unfound) {
				CreateFighter.DerrickLewis.found();
				CreateFighter.DerrickLewis.mad();
				
				name[0] = CreateFighter.DerrickLewis.first;
				name[1] = CreateFighter.DerrickLewis.last;
				
				return name;
			}
			else if (CreateFighter.JairzinhoRozenstruik.getPos() == pos && CreateFighter.JairzinhoRozenstruik.unfound) {
				CreateFighter.JairzinhoRozenstruik.found();
				CreateFighter.JairzinhoRozenstruik.mad();
				
				name[0] = CreateFighter.JairzinhoRozenstruik.first;
				name[1] = CreateFighter.JairzinhoRozenstruik.last;
				
				return name;
			}
			else if (CreateFighter.AlexanderVolkov.getPos() == pos && CreateFighter.AlexanderVolkov.unfound) {
				CreateFighter.AlexanderVolkov.found();
				CreateFighter.AlexanderVolkov.mad();
				
				name[0] = CreateFighter.AlexanderVolkov.first;
				name[1] = CreateFighter.AlexanderVolkov.last;
				
				return name;
			}
			else if (CreateFighter.AlistairOvereem.getPos() == pos && CreateFighter.AlistairOvereem.unfound) {
				CreateFighter.AlistairOvereem.found();
				CreateFighter.AlistairOvereem.mad();
				
				name[0] = CreateFighter.AlistairOvereem.first;
				name[1] = CreateFighter.AlistairOvereem.last;
				
				return name;
			}
			else if (CreateFighter.WaltHarris.getPos() == pos && CreateFighter.WaltHarris.unfound) {
				CreateFighter.WaltHarris.found();
				CreateFighter.WaltHarris.mad();
				
				name[0] = CreateFighter.WaltHarris.first;
				name[1] = CreateFighter.WaltHarris.last;
				
				return name;
			}
		}
		
		name[0] = "NULL";
		name[1] = "NULL";
		
		return name;
		
	}
		
}
