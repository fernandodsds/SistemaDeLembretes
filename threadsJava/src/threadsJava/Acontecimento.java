package threadsJava;

import org.joda.time.DateTime;

public interface Acontecimento {
	/** 
	 * Retorna a data do acontecimento
	 * 
	 * @return um DateTime do JodaTime
	 * 
	 * @author Fernando Silva
	 * */
	public DateTime getDataAcontecimento();
	/** 
	 * Retorna a quantidade de dias entre um acontecimento e outro
	 * 
	 * @param Acontecimento   Dia a ser comparado
	 * 
	 * @author Fernando Silva
	 * */
	
	public int diasRestantes(Acontecimento dia);
	
	public boolean verificaSeEHoje();

	public String getTitulo();

	public String getDesc();

	
	

}
