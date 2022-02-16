
public class Generics {

	public static void main(String[] args) {
		String arr[]= {"a", "b", "c", "d", "e", "f", "g"};
		String valor=TomaValor(arr);
		System.out.println(valor);
	}

	public static <T> T TomaValor(T a[]) {
		int numAl = a.length-2;//largo menos 2
		return a[numAl];
	}
}