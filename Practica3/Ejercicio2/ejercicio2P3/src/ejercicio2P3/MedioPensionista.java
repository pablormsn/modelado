package ejercicio2P3;

public class MedioPensionista extends Trabajador{
	
	
	private Activo perfilActivo;
	private Pensionista perfilPensionista;
	
	

	public MedioPensionista(String nombre, String numeroSeguridadSocial, float salario, Activo a, Pensionista p) {
		super(nombre, numeroSeguridadSocial, salario);
		this.perfilActivo = a;
		this.perfilPensionista = p;
	}



	@Override
	public void incrementar() {
		perfilActivo.incrementar();
		perfilPensionista.incrementar();
		
	}
	@Override
	public float nomina() {
		return (perfilPensionista.nomina() + perfilActivo.nomina());
	}
	
	
}
