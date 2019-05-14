package basico.android.cftic.edu.miprimerboton;

//BEAN DE PERSONA JAVABEAN O POJO (PLAIN OLD JAVA OBJECT)
public class Persona
{
    private static int n_personas;
    private  String nombre;
    private int edad;

    //en el constructor, this es el objeto en ciernes
    public Persona(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
    n_personas++;
}

    //this el objeto llamante
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static void main (String[] arg)
    {
        Persona persona = new Persona("Alex", 23);
        System.out.println("Npersonas = " + n_personas);
        Persona persona2 = new Persona("Conchi", 16);
        System.out.println("Npersonas = " + n_personas);
        int edad = persona2.getEdad();
    }
}
