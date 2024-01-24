package entities;

public class EmmettiComCirc {
	private Integer luvas;
	private Integer cotoveloCobre90 = 3;
	private Integer conectoresFemea22mm = 3;
	private Integer registroMetal34 = 2;
	private Integer registroMetal = 1;
	private Integer plugsDeSolda = 1;
	private Integer plugsDeRosca = 1;
	private Integer valvula = 1;
	private Integer valvula34 = 1;
	private Integer conectorMachoPvc = 1;
	private Integer conectorMachoPpr = 4;
	private Integer conectorFemeaPpr = 6;
	private Integer conectorFemeaAqua = 2;
	private Integer uniaoPvc = 1;
	private Integer cotoveloPpr90 = 10;
	private Integer cotoveloPpr45 = 8;
	private Integer conectorFemeaEmmetti = 2;
	private Integer conectorMachoEmmetti = 5;
	private Integer registroPpr = 3;
	private Integer registroPvc = 1;
	private Integer cotoveloPvc90 = 6;
	private Integer cotoveloPvc45 = 4;

	public int qtdLuvas(int quantidadeDeColetores) {
		return this.luvas = quantidadeDeColetores * 2 - 2;
	}

	public EmmettiComCirc(){
		
	}

	public String toString() {
		String quebraLinha = System.getProperty("line.separator");
		return "Para esta instalação será necessário os seguintes materiais: " + quebraLinha + 
	    "Luvas: " + luvas + quebraLinha +
	    "Cotovelos de 22mm 90°: " + cotoveloCobre90 + quebraLinha + 
		"Conectores Femea de 22mm: " + conectoresFemea22mm + quebraLinha + 
		"Registros de Metal 3/4\": " + registroMetal34 + quebraLinha + 
		"Registros de Metal 1\": " + registroMetal + quebraLinha +
		"Plugs de Solda: " + plugsDeSolda + quebraLinha + 
		"Plugs de Rosca: " + plugsDeRosca + quebraLinha + 
		"Valvula 1\": " + valvula + quebraLinha + 
		"Valvula 3/4\": " + valvula34 + quebraLinha + 
		"Conector Macho PVC: " + conectorMachoPvc + quebraLinha +
		"Conector Macho PPR: " + conectorMachoPpr + quebraLinha + 
		"Conector Femea PPR: " + conectorFemeaPpr + quebraLinha +
		"Conector Femea Aquatherm: " + conectorFemeaAqua + quebraLinha + 
		"União PVC: " + uniaoPvc + quebraLinha + 
		"Cotovelos de PPR 90°: " + cotoveloPpr90 + quebraLinha +
		"Cotovelos de PPR 45°: " + cotoveloPpr45 + quebraLinha + 
		"Conector Femea Emmetti: " + conectorFemeaEmmetti + quebraLinha + 
		"Conector Macho Emmetti: " + conectorMachoEmmetti + quebraLinha + 
		"Registro de PPR: " + registroPpr + quebraLinha + 
		"Registro de PVC: " + registroPvc + quebraLinha + 
		"Cotovelos de PVC 90°: " + cotoveloPvc90 + quebraLinha +
		"Cotovelos de PVC 45°: " + cotoveloPvc45 + quebraLinha;
	}

}
