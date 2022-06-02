import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private String nombre;
    private String apellido;

    private LocalDate edad;
    private String mail;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getEdad() {
        return edad;
    }

    public void setEdad(LocalDate edad) {
        this.edad = edad;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String calcularNombreCompleto(){
        return this.nombre + ", "+ this.apellido;
    }
    public Boolean esMayorDeEdad(){
        //return Period.between(this.edad,LocalDate.of(2022,5,16)).getYears()>=18;
        return Period.between(this.edad,LocalDate.now().getYear())>=18;
    }
}
