public class Produto {
    String codigo;
    String nome;
    String tamanhoOuPeso;
    String cor;
    double valor;
    int quantidade;

    // Método para cadastrar o produto
    void cadastrarProduto(String codigo, String nome, String tamanhoOuPeso, String cor, double valor, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.tamanhoOuPeso = tamanhoOuPeso;
        this.cor = cor;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    // Método para realizar a venda
    void venderProduto(int quantidadeVendida) {
        if (quantidadeVendida <= quantidade) {
            quantidade -= quantidadeVendida;
            System.out.println("Venda realizada com sucesso!");
        } else {
            System.out.println("Quantidade em estoque insuficiente!");
        }
    }

    // Método para calcular o desconto
    double calcularDesconto(String formaDePagamento) {
        if (formaDePagamento.equalsIgnoreCase("Pix") || formaDePagamento.equalsIgnoreCase("Espécie") || formaDePagamento.equalsIgnoreCase("Transferência") || formaDePagamento.equalsIgnoreCase("Débito")) {
            return valor * 0.05; // 5% de desconto
        }
        return 0; // sem desconto
    }

    // Método para processar o pagamento
    void processarPagamento(String formaDePagamento, double valorPago) {
        double desconto = calcularDesconto(formaDePagamento);
        double valorFinal = valor - desconto;

        if (formaDePagamento.equalsIgnoreCase("Espécie")) {
            if (valorPago > valorFinal) {
                double troco = valorPago - valorFinal;
                System.out.printf("Troco: %.2f\n", troco);
            } else {
                System.out.println("Valor pago não é suficiente!");
            }
        }

        System.out.printf("Valor final a ser pago: %.2f\n", valorFinal);
    }

    // Método para exibir informações do produto
    void exibirInformacoes() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Tamanho/Peso: " + tamanhoOuPeso);
        System.out.println("Cor: " + cor);
        System.out.println("Valor: " + valor);
        System.out.println("Quantidade em estoque: " + quantidade);
    }
}