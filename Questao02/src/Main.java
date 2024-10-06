import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto();

        // Cadastro do produto
        System.out.println("Cadastre o produto:");
        System.out.print("Código: ");
        String codigo = scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Tamanho/Peso: ");
        String tamanhoOuPeso = scanner.nextLine();
        System.out.print("Cor: ");
        String cor = scanner.nextLine();
        System.out.print("Valor: ");
        double valor = scanner.nextDouble();
        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();

        produto.cadastrarProduto(codigo, nome, tamanhoOuPeso, cor, valor, quantidade);

        // Exibe as informações do produto
        System.out.println("\nInformações do produto:");
        produto.exibirInformacoes();

        // Venda do produto
        System.out.print("\nDigite a quantidade a ser vendida: ");
        int quantidadeVendida = scanner.nextInt();
        produto.venderProduto(quantidadeVendida);

        // Processamento do pagamento
        System.out.print("Forma de pagamento (Pix, Espécie, Transferência, Débito, Crédito): ");
        scanner.nextLine(); // Limpar o buffer
        String formaDePagamento = scanner.nextLine();
        if (formaDePagamento.equalsIgnoreCase("Crédito")) {
            System.out.println("Pagamento em até 3x sem juros. Valor total: " + valor);
        } else {
            System.out.print("Valor pago: ");
            double valorPago = scanner.nextDouble();
            produto.processarPagamento(formaDePagamento, valorPago);
        }

        scanner.close();
    }
}