public class Cookie extends ItemSobremesa {
	protected int numero;
	protected int precoPorDuzia;
	
	public Cookie(String nome, int numero, int precoPorDuzia) {
		super(nome);
		setNumero(numero);
		setPrecoPorDuzia(precoPorDuzia);
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getPrecoPorDuzia() {
		return precoPorDuzia;
	}

	public void setPrecoPorDuzia(int precoPorDuzia) {
		this.precoPorDuzia = precoPorDuzia;
	}

	@Override
	public int getCusto(){
		
		return (numero/12)*precoPorDuzia;
	}
	
	@Override
	public String toString() {
	  return String.format("%d @ %s /dz\n%-25s %6s", getNumero(), 
	    Sorveteria.centavos2ReaisECentavos(getPrecoPorDuzia()), getNome(), Sorveteria.centavos2ReaisECentavos(getCusto()));
	}

}
}