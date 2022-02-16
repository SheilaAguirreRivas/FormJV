import java.util.Scanner;

public class Ejecucion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Elemento<Double> eld=new Elemento<>();
		eld.setDato(123.456);
		
		Elemento<String> els=new Elemento<>();
		els.setDato("Hola");
		
		System.out.println("Elemento ingresado es: "+eld.getDato());
		System.out.println("Elemento ingresado es: "+els.getDato());

	}

}
