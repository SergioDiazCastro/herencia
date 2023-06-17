
public class Empleado extends Persona{
	
	private String codigoDeEmpleado;
	private int numeroDeHorasExtras;
	private String fechaDeIngreso;
	private String area;
	private String cargo;
	
	public String getCodigoDeEmpleado() {
		return codigoDeEmpleado;
	}
	public void setCodigoDeEmpleado(String codigoDeEmpleado) {
		this.codigoDeEmpleado=codigoDeEmpleado;
	}
	public int getNumeroDeHorasExtras() {
		return numeroDeHorasExtras;
	}
	public void setNumeroDeHorasExtras(int numeroDeHorasExtras) {
		this.numeroDeHorasExtras=numeroDeHorasExtras;
	}
	public String getFechaIngreso() {
		return fechaDeIngreso;
	}
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaDeIngreso=fechaIngreso;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area=area;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo=cargo;
	}
}
