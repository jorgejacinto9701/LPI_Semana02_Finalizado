package validaciones.inicio;

public class Ejemplos {

	public static void main(String[] args) {

		// Para validar se usa expresiones regulares
		// Para validar formatos
		// https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html#sum
		
		//Validar un d�gito
		System.out.println("8".matches("[0-9]"));
		System.out.println("9".matches("[0-3]"));
		
		//Validar dos d�gitos
		System.out.println("15".matches("[0-9][0-9]"));
		System.out.println("a1".matches("[0-9][0-9]"));
		
		//Validar un DNI(8 d�gitos)
		System.out.println("12564563".matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]"));

		//Usar letras que representa un d�gito
		//Validar DNI
		System.out.println("12564563".matches("\\d\\d\\d\\d\\d\\d\\d\\d"));
		
		//Uso de cuantificadores para validar DNI
		System.out.println("12564563".matches("[0-9]{8}"));
		System.out.println("12564563".matches("\\d{8}"));
		
		//Validar un RUC (11 d�gitos)
		System.out.println("12564563123".matches("[0-9]{11}"));
		System.out.println("12564563123".matches("\\d{11}"));
		
		//Validar una palabra en min�scula y may�scula de 4 caracteres
		System.out.println("Hola".matches("[a-zA-Z]{4}"));
		System.out.println("Luciana".matches("[a-zA-Z]{4}"));
		
		//Validar una palabra en min�scula y may�scula de m�s 5 caracteres (tildes,�,di�resis)
		System.out.println("�andu".matches("[a-zA-Z��������������]{5,}"));
		System.out.println("Canci�n".matches("[a-zA-Z��������������]{5,}"));
		System.out.println("Ag�ita".matches("[a-zA-Z��������������]{5,}"));
		
		//Validar un texto de 3 a 20 caracteres (tildes,�,di�resis)
		System.out.println("La vida es bella".matches("[a-zA-Z��������������\\s]{3,20}"));
		
		//Validar una placa de carro (3 caracteres may�sculas y 2 d�gitos)
		System.out.println("AXY14".matches("[A-Z]{3}[0-9]{2}"));
		System.out.println("abc14".matches("[A-Z]{3}[0-9]{2}"));
		System.out.println("AXYef".matches("[A-Z]{3}[0-9]{2}"));
		
		//Validar un n�mero decimal
		System.out.println("15.5".matches("[0-9]{1,}[.][0-9]{1,}"));
		System.out.println("0.369".matches("[0-9]{1,}[.][0-9]{1,}"));
		System.out.println("30.8747".matches("[0-9]{1,}[.][0-9]{1,}"));
		
		System.out.println("15.5".matches("[0-9]+[.][0-9]+"));
		System.out.println("0.369".matches("[0-9]+[.][0-9]+"));
		System.out.println("30.8747".matches("[0-9]+[.][0-9]+"));
		
		System.out.println("15.5".matches("\\d+[.]\\d+"));
		System.out.println("0.369".matches("\\d+[.]\\d+"));
		System.out.println("30.8747".matches("\\d+[.]\\d+"));
		
		//Validar un n�mero entero (15414)(+454)(-454)
		System.out.println("15414".matches("[+-]?\\d+"));
		System.out.println("+454".matches("[+-]?\\d+"));
		System.out.println("-454".matches("[+-]?\\d+"));
		
	}

}






