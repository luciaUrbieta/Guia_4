public class Persona {

    private String nombre;
    private int edad;
    private int dni;
    private char sexo;
    private double peso;
    private double altura;

    private static final char sexoPorDefecto = 'H';
    public static final int infrapeso = -1;
    public static final int pesoIdeal = 0;
    public static final int sobrepeso = 1;

    public Persona(){
        this.nombre= "";
        this.edad = 0;
        this.dni = 0;
        this.sexo = sexoPorDefecto;
        this.peso = 0.0;
        this.altura = 0.0;
    }

    public Persona(String nombre, int edad, char sexo){
        this.nombre=nombre;
        this.edad = edad;
        this.dni = 0;
        this.setSexo(sexo); // Usa el setter para validar el sexo
        this.peso = 0.0;
        this.altura = 0.0;
    }

    public Persona(String nombre, int edad, int dni, char sexo, double peso, double altura){
        this.nombre=nombre;
        this.edad = edad;
        this.dni = dni;
        this.setSexo(sexo); // Usa el setter para validar el sexo
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if (comprobarSexo(sexo)) {
            this.sexo = sexo;
        } else {
            this.sexo = sexoPorDefecto; // Asigna el valor por defecto si no es válido
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int calcularIMC(){

        double imc = peso / (altura * altura);
        int retorno;

        if (imc < 20) {
            retorno = infrapeso;
        } else if (imc >= 20 && imc <= 25) {
            retorno = pesoIdeal;
        } else {
            retorno = sobrepeso;
        }
        return retorno;
    }

    public boolean esMayorDeEdad(){
        boolean retorno=false;
        if(edad>18){
            retorno=true;
        }
        return retorno;
    }

    public boolean comprobarSexo(char sexo){
       boolean retorno = false;
       if (sexo == 'H' || sexo == 'M') {
            retorno=true;
       }
        return retorno;
    }



    public String toString(){
        return "\nNombre: " + nombre +"\nEdad: " + edad + "\nDni: " + dni + "\nSexo: " + sexo + "\nPeso: " + peso + "\nAltura: " + altura;
    }

}
