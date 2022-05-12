package types;

public class Person
{
    protected String DNI;
    protected String correo;

    public Person() {
        this.DNI = "";
        this.correo = "";
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {

        this.DNI = "";


        this.DNI = DNI;
    }

    public String getCorreo() {



        return correo;
    }

    public void setCorreo(String correo) {

        this.correo = "";

        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "DNI='" + DNI + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}