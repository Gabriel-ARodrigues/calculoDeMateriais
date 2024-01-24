package entities;

public class AquecimentoPiscina {
	//Peças de 50mm PVC
	private Integer registros50mm = 2;
	private Integer cotovelos50mmNoventa = 10;
	private Integer cotovelos50mmQuarenta = 6;
	private Integer tubos50mm = 2;
	private Integer reducao50x32mm = 4;
	private Integer valvula50mm = 1;
	//Peças de 32mm PVC
	private double tubos32mm;
	private Integer	caps32mm = 2;
	private Integer teeazul = 1;
	private Integer cotovelos32mmNoventa = 12;
	private Integer cotovelos32mmQuarenta = 6;
	private Integer conectorMacho = 2;
	private Integer uniao = 2;
	//Fios
	private Integer arame = 1;
	private Integer araudite = 1;
	private Integer cola = 2 ; //Potes de Cola
	private Integer fio = 5; //Metros
	private Integer PU = 1;
	
	public AquecimentoPiscina() {
	}

	public double qtdTubos(int quantidadeDeColetores) {
		return this.tubos32mm = quantidadeDeColetores * 1.10;
	}

	public String toString() {
		String quebraLinha = System.getProperty("line.separator");
		return "Para esta instalação será necessário os seguintes materiais: " + quebraLinha + 
	    "Registros de 50mm: " + registros50mm + quebraLinha + 
	    "Cotovelos de 50mm 90°: " + cotovelos50mmNoventa + quebraLinha + 
	    "Cotovelos de 50mm 45°: " + cotovelos50mmQuarenta + quebraLinha +
	    "Tubos de 50mm: " + tubos50mm + quebraLinha + 
	    "Redução de 50x32mm: " + reducao50x32mm + quebraLinha + 
	    "Valvula de Retenção 50mm: " + valvula50mm + quebraLinha + 
	    "Tubos de 32mm: " + tubos32mm + quebraLinha +
	    "Tampão de Solda 32mm: " + caps32mm + quebraLinha + 
	    "Tee Azul 32x3/4\": " + teeazul + quebraLinha +
	    "Cotovelos de 32mm 90°: " + cotovelos32mmNoventa + quebraLinha + 
	    "Cotovelos de 32mm 45°: " + cotovelos32mmQuarenta + quebraLinha +
	    "Conector Macho de 32mm: " + conectorMacho + quebraLinha +
	    "União de 32mm: " + uniao + quebraLinha +
	    "Arame galvanizado 2,5mm: " + arame + "rolo" + quebraLinha +
	    "Araudite 10 minutos: " + araudite + "Unid." + quebraLinha + 
	    "Cola Vermelha: " + cola + "Pote" + quebraLinha +
	    "Fio PP 3x2,5mm: " + fio + "metros" + quebraLinha +
	    "PU Cinza: " + PU;
		
	}
	
}
