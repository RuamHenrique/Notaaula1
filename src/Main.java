import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicita o nome do aluno
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        // Solicita as notas
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        // Cria um objeto do tipo Aluno
        Aluno aluno = new Aluno(nome, nota1, nota2, nota3);

        // Exibe a situação acadêmica
        System.out.printf("O aluno %s está: %s (Média: %.2f)%n", aluno.getNome(), aluno.verificarSituacao(), aluno.calcularMedia());

        // Fecha o scanner
        scanner.close();
    }
}