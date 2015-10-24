import java.util.Scanner;

public class Conversion {
	public static String dec2bin(int n) {	
		PilaInt p = new PilaInt();
		String out = "";//La salida, el resultado
		while(n>1) {
			p.push(n%2);
			n = n / 2;
		}
		p.push(n);
		while(!p.empty()) {
			out = out + p.pop();
		}
		return out;
	}
	public static void main(String arg[]) {
		int opc;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1.- Ingresar numero");
			System.out.println("2.- Salir");
			opc = sc.nextInt();
			if ( opc == 1) {
				System.out.println("Dame un numero");
				String r = Conversion.dec2bin(sc.nextInt());
				System.out.println("El resultado: " + r );
			}
		}while(opc != 2);
	}
}
