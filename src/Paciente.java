import java.util.ArrayList;

public class Paciente extends Persona {
	
	private int numeroHistoriaClinica;
	private String sexo;
	private String grupoSanguineo;
	private ArrayList<String> listaMedicamentosAlergicos;
	
	public int getNumeroHistoriaClinica() {
		return numeroHistoriaClinica;
	}
	public void setNumeroHistoriaClinica(int numeroHistoriaClinica) {
		this.numeroHistoriaClinica=numeroHistoriaClinica;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo=sexo;
	}
	public String getGrupoSanguineo() {
		return grupoSanguineo;
	}
	public void setGrupoSanguineo(String grupoSanguineo) {
		this.grupoSanguineo=grupoSanguineo;
	}
	public ArrayList<String> getListaMedicamentosAlergico() {
		return listaMedicamentosAlergicos;
	}
	public void setListaMedicamentosAlergico(ArrayList<String> listaMedicametosAlergico) {
		this.listaMedicamentosAlergicos=listaMedicametosAlergico;
	}
}
