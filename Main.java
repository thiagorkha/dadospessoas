import java.util.Scanner;
import entities.Dados;

class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    System.out.print("Quantas pessoas serao digitadas? ");
    int n = sc.nextInt();
    sc.nextLine();

    Dados[] vect = new Dados[n];
    for (int i=0; i<vect.length; i++) {
      System.out.print("Altura da " + (i+1) + "a pessoa: ");
      double altura = sc.nextDouble();
      sc.nextLine();
      System.out.print("Genero da " + (i+1) + "a pessoa: ");
      char genero = sc.nextLine().charAt(0);

      vect[i] = new Dados(altura, genero);
    }

    double menor = vect[0].getAltura();
    int posMenor = 0;
    for (int i=0; i<vect.length; i++) {
      if (menor > vect[i].getAltura()) {
        menor = vect[i].getAltura();
        posMenor = i;
      }
    }
    System.out.println("Menor altura = " + vect[posMenor].getAltura());

    double maior = vect[0].getAltura();
    int posMaior = 0;
    for (int i=0; i<vect.length; i++) {
      if (maior < vect[i].getAltura()) {
        maior = vect[i].getAltura();
        posMaior = i;
      }
    }
    System.out.println("Maior altura = " + vect[posMaior].getAltura());

    double soma = 0.0;
    int count = 0;
    for (int i=0; i<vect.length; i++) {
      if (vect[i].getGenero() == 'M') {
        soma += vect[i].getAltura();
        count++;
      }
    }
    double media = soma / count;
    System.out.printf("Media das alturas das mulheres = %.2f%n", media);

    int contagem = 0;
    for (int i=0; i<vect.length; i++) {
      if (vect[i].getGenero() == 'F') {
        contagem++;
      }
    }
    System.out.println("Numero de homens = " + contagem);

    
      
  }
}