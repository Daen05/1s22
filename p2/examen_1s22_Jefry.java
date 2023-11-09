import java.util.Scanner;

public class examen{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(SYstem.in);
		System.out.println("Cuantos valores vas a capturar");
		int tamaño = teclado.nextInt();
		int tamaño = teclado.int[tamano];
		int[] valores = new int[tamano];
		int a;
		for (a=0;a<tamano;a++){
			System.out.println("Ingrese el valor #"+a+": ");
			valores[a] = teclado.nextInt();
		}
		int sumatoria=0;
		for (a=0;<tamano;a++){
			sumatoria+=valores[a];
		}
		int promedio=sumatoria/tamano;
		Systemn.out.println("La media aritmetica es "+ promedio);
		sumatoria=0;
		for (a=0;a<tamano;a++){
			sumatoria+=Math.abs(valores [a]-promedio);
		}
		int dmn = sumatoria/tamano;
		System.out.println("La desviacion media es "+dm);
	}

}