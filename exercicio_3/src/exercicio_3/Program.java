package exercicio_3;

import java.text.DecimalFormat;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Circulo circulo = new Circulo(5.0);
		DecimalFormat df = new DecimalFormat("#.00", new java.text.DecimalFormatSymbols(Locale.US));
        System.out.println("�rea do c�rculo: " + df.format(circulo.calcularArea()));


        Triangulo triangulo = new Triangulo(4.0, 3.0);
        System.out.println("�rea do tri�ngulo: " + triangulo.calcularArea());

        Quadrado quadrado = new Quadrado(2.0);
        System.out.println("�rea do quadrado: " + quadrado.calcularArea());
	}
}
