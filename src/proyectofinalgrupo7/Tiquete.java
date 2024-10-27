package proyectofinalgrupo7;

public class Tiquete {

    private String Nombre;
    private int id;
    private int edad;
    private int horacreacion;
    private int horaatencion = -1;
    private Tramite tramite;
    private Tipo tipo;

    public Tiquete(String Nombre, int id, int edad, int horacreacion, Tramite tramite, Tipo tipo) {
        this.Nombre = Nombre;
        this.id = id;
        this.edad = edad;
        this.horacreacion = horacreacion;
        this.tramite = tramite;
        this.tipo = tipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHoracreacion() {
        return horacreacion;
    }

    public void setHoracreacion(int horacreacion) {
        this.horacreacion = horacreacion;
    }

    public int getHoraatencion() {
        return horaatencion;
    }

    public void setHoraatencion(int horaatencion) {
        this.horaatencion = horaatencion;
    }

    public Tramite getTramite() {
        return tramite;
    }

    public void setTramite(Tramite tramite) {
        this.tramite = tramite;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Tiquete{" + "Nombre=" + Nombre + ", id=" + id + ", edad=" + edad + ", horacreacion=" + horacreacion + ", horaatencion=" + horaatencion + ", tramite=" + tramite + ", tipo=" + tipo + '}';
    }

}
