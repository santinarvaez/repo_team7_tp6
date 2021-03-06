package ar.edu.unju.fi.tp4.model;

import static java.time.temporal.ChronoUnit.DAYS;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;


@Component("clienteObj")
public class Cliente {

	private String tipoDocumento;
	private int numeroDocumento;
	private String nombreApellido;
	private String email;
	private String password;
	@DateTimeFormat(pattern = "yyyy-MM--dd")
	private LocalDate fechaNacimiento;
	private int edad;
	private int codigoAreaTelefono;
	private int numeroTelefono;
	@DateTimeFormat(pattern = "yyyy-MM--dd")
	private LocalDate fechaUltimaCompra;
	
	
	public int getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(int numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public int getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(int numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public String getNombreApellido() {
		
		return nombreApellido;
	}
	public String getMayuscula() {		
		String may;
		may = this.nombreApellido;
		may = may.toUpperCase();	
		return may;
	}
	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getCodigoAreaTelefono() {
		return codigoAreaTelefono;
	}
	public void setCodigoAreaTelefono(int codigoAreaTelefono) {
		this.codigoAreaTelefono = codigoAreaTelefono;
	}
	public LocalDate getFechaUltimaCompra() {
		return fechaUltimaCompra;
	}
	public void setFechaUltimaCompra(LocalDate fechaUltimaCompra) {
		this.fechaUltimaCompra = fechaUltimaCompra;
	}
	public Cliente() {
		super();
	}
	
	
	public Cliente(String tipoDocumento, int numeroDocumento, String nombreApellido, String email, String password,
			LocalDate fechaNacimiento, int codigoAreaTelefono, int numeroTelefono, LocalDate fechaUltimaCompra) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
		this.nombreApellido = nombreApellido;
		this.email = email;
		this.password = password;
		this.fechaNacimiento = fechaNacimiento;
		this.codigoAreaTelefono = codigoAreaTelefono;
		this.numeroTelefono = numeroTelefono;
		this.fechaUltimaCompra = fechaUltimaCompra;
	}
	// calcular la edad
	public int getEdad() {
		
		int edad =0;
		LocalDate hoy =LocalDate.now();
		Period periodo = Period.between(this.fechaNacimiento, hoy);
		edad = periodo.getYears();
		return edad;
	}
	// proximo cumplea??os
	public String getTimeCumple() {
		String texto =" ";
		LocalDate hoy =LocalDate.now();
		int varanio;
		if(hoy.getMonthValue() < this.fechaNacimiento.getMonthValue()) {
			varanio =hoy.getYear();
		}else {
			varanio = hoy.getYear() + 1; 
				
		}
		
		LocalDate fechaProxCumple = LocalDate.of(varanio ,this.fechaNacimiento.getMonth(), this.fechaNacimiento.getDayOfMonth());
		Period periodo = Period.between(hoy, fechaProxCumple);
		texto= "A??o:"+ periodo.getYears() + "Mes:" + periodo.getMonths() + "Dia:" + periodo.getDays();
		
		//localTime
		LocalDateTime ahora= LocalDateTime.now();
		LocalDateTime fechaHoraProxCumple = LocalDateTime.of(varanio, this.fechaNacimiento.getMonth(), this.fechaNacimiento.getDayOfMonth(), 0,0,0);
		Duration duracion = Duration.between(ahora, fechaHoraProxCumple);
		texto = texto + "Hora:" + duracion.toHoursPart()+ "Min:" + duracion.toMinutesPart() + "Seg:" + duracion.toSecondsPart();
		
				return texto;
	}
	// tiempo desde Nacimiento
	public int getTimeNaciMiento() {
		LocalDate hoy =LocalDate.now();
		LocalDate Inicio=this.fechaNacimiento;
		LocalDate Fin=hoy;	
		long dias = DAYS.between(Inicio, Fin);	
		return (int) dias;
	
	}
	// tiempo desde Ultima Compra
	public String getTimeUltimaC() {
		LocalDate hoy = LocalDate.now();
		LocalDate Inicio=this.fechaUltimaCompra;
		LocalDate Fin=hoy;
		Period periodo = Period.between(Inicio, Fin);
		String fecha = " A??o: " + periodo.getYears() + " Mes: " + periodo.getMonths() + " Dia: " + periodo.getDays();
		return fecha;
	}
	
		
	@Override
	public String toString() {
		return "Cliente [tipoDocumento=" + tipoDocumento + ", numeroDocumento=" + numeroDocumento + ", nombreApellido="
				+ nombreApellido + ", email=" + email + ", password=" + password + ", fechaNacimiento="
				+ fechaNacimiento + ", edad=" + edad + ", codigoAreaTelefono=" + codigoAreaTelefono
				+ ", numeroTelefono=" + numeroTelefono + ", fechaUltimaCompra=" + fechaUltimaCompra + "]";
	}
	
}
