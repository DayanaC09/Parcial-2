package Ejercicio2;
import java.util.Random;
public class Persona {
	
	    private String nombre;
	    private int edad;
	    private char sexo;
	    private double peso;
	    private double altura;
	    private final String DNI;
	    private static final char SEXO_POR_DEFECTO = 'H';
	    private static final int PESO_BAJO = -1;
	    private static final int PESO_IDEAL = 0;
	    private static final int SOBREPESO = 1;

	    
	    public Persona() {
	        this("", 0, SEXO_POR_DEFECTO, 0, 0);
	    }

	    public Persona(String nombre, int edad, char sexo) {
	        this(nombre, edad, sexo, 0, 0);
	    }

	    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
	        this.nombre = nombre;
	        this.edad = edad;
	        this.sexo = comprobarSexo(sexo);
	        this.peso = peso;
	        this.altura = altura;
	        this.DNI = generaDNI();
	    }

	    private char comprobarSexo(char sexo) {
	        return sexo == 'H' || sexo == 'M' ? sexo : SEXO_POR_DEFECTO;
	    }

	    private String generaDNI() {
	        Random random = new Random();
	        int numero = random.nextInt(100000000);
	        char letra = calcularLetraDNI(numero);
	        return Integer.toString(numero) + letra;
	    }

	    private char calcularLetraDNI(int numero) {
	        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
	        int indice = numero % 23;
	        return letras.charAt(indice);
	    }

	    public int calcularIMC() {
	        double imc = peso / (altura * altura);
	        if (imc < 20) {
	            return PESO_BAJO;
	        } else if (imc >= 20 && imc <= 25) {
	            return PESO_IDEAL;
	        } else {
	            return SOBREPESO;
	        }
	    }

	    public boolean esMayorDeEdad() {
	        return edad >= 18;
	    }

	    public String toString() {
	        String estado = esMayorDeEdad() ? "Mayor de edad" : "Menor de edad";
	        int imc = calcularIMC();
	        String estadoPeso = imc == PESO_BAJO ? "Peso bajo" :
	                imc == PESO_IDEAL ? "Peso ideal" : "Sobrepeso";
	        return "Nombre: " + nombre + "\n" +
	                "Edad: " + edad + " años\n" +
	                "Sexo: " + sexo + "\n" +
	                "Peso: " + peso + " kg\n" +
	                "Altura: " + altura + " m\n" +
	                "DNI: " + DNI + "\n" +
	                "Estado: " + estado + "\n" +
	                "Estado de peso: " + estadoPeso;
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
	    public String getDNI() {
			return DNI;
		}
	    
	    public char getSexo() {
	    	return sexo;
	    }
	    public void setSexo(char sexo) {
	    	this.sexo = comprobarSexo(sexo);
	    }
	    
	    public double getAltura() {
	    	return altura;
	    }
	    
	    public void setAltura(double altura) {
	    	this.altura = altura;
	    }
	    
	    public double getPeso() {
	    	return peso;
	    }
	    
	    public void setPeso(double peso) {
	    	this.peso = peso;
	    }
	    
	    
}