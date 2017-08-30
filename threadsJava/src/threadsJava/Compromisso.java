package threadsJava;

import org.joda.time.DateTime;
import org.joda.time.Days;

public class Compromisso implements Acontecimento {
	
	DateTime data;
	String titulo;
	String desc;
	public Compromisso(String titulo, String desc, DateTime d) {
		// TODO Auto-generated constructor stub
		this.data = new DateTime(d);
		this.titulo = titulo;
		this.desc = desc;

	}
	public Compromisso(Compromisso a) {
		this.data = new DateTime(a.getDataAcontecimento());
		this.titulo = a.getTitulo();
		this.desc = a.getDesc();
	}


	@Override
	public DateTime getDataAcontecimento() {
		// TODO Auto-generated method stub
		return this.data;
	}

	@Override
	public int diasRestantes(Acontecimento dia) {
       	 return Days.daysBetween(this.getDataAcontecimento(), dia.getDataAcontecimento()).getDays();
	}
	@Override
	public boolean verificaSeEHoje() {
		if (this.data.equals(new DateTime())) 
			return true;
		return false;
	}
	@Override
	public String getTitulo() {
		// TODO Auto-generated method stub
		return this.titulo;
	}
	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return this.desc;
	}
	
	public void setData(DateTime d) {
		this.data = new DateTime(d);
	}
	
	

}
