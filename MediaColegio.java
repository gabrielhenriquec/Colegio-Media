import java.util.Scanner;

public class MediaColegio {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		float nota1, nota2, media;

		System.out.println("Digite sua primeira nota: ");
		nota1 = leia.nextFloat();

		System.out.println("Digite a sua segunda nota: ");
		nota2 = leia.nextFloat();

		media = (nota1 + nota2) / 2;

		System.out.println("Sua média é: " + media);
	}

}
