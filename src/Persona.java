import javax.swing.JOptionPane;

public class Persona {
	private String	numeroDeDNI;
	private String 	nombre;
	private String 	apellido;
	private String 	fechaDeNacimiento;
	private String 	direccion;
	private String 	ciudadDeProcedencia;
	
	public void imprimirDatosPersona(String datos ) {
		
		datos+="nombre: "+nombre+"\n";
		datos+="apellido: "+apellido+"\n";
		datos+="fecha de nacimiento: "+fechaDeNacimiento+"\n";
		datos+="direccion: "+direccion+"\n";
		datos+="ciudad de procedencia "+ciudadDeProcedencia+"\n";
		System.out.println(datos);
	}
	
	public void registrarDatos() {
		numeroDeDNI=JOptionPane.showInputDialog("ingrese el numero de documento");
		nombre=JOptionPane.showInputDialog("ingrese el nombre");
		apellido=JOptionPane.showInputDialog("ingrese el apellido");
		fechaDeNacimiento=JOptionPane.showInputDialog("ingrese fecha de nacimiento (dd/mm/aaaa)");
		direccion=JOptionPane.showInputDialog("ingrese la direccion");
		ciudadDeProcedencia=JOptionPane.showInputDialog("ingrese la ciudad de procedencia");
	}
	
	public String getNumeroDeDNI() {
		return numeroDeDNI;
	}
	public void setNumeroDeDNI(String numeroDeDNi) {
		this.numeroDeDNI=numeroDeDNi;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido=apellido;
	}
	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento=fechaDeNacimiento;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion=direccion;
	}
	public String getCiudadDeProcedencia() {
		return ciudadDeProcedencia;
	}
	public void setCiudadDeProcedencia(String ciudadDeProcedencia) {
		this.ciudadDeProcedencia=ciudadDeProcedencia;
	}
}
