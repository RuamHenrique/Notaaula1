public class Aluno {

        private String nome;
        private double nota1;
        private double nota2;
        private double nota3;

        // Construtor
        public Aluno(String nome, double nota1, double nota2, double nota3) {
            this.nome = nome;
            this.nota1 = nota1;
            this.nota2 = nota2;
            this.nota3 = nota3;
        }

        // Método para calcular a média
        public double calcularMedia() {
            return (nota1 + nota2 + nota3) / 3;
        }

        // Método para determinar a situação do aluno
        public String verificarSituacao() {
            double media = calcularMedia();
            if (media >= 70) {
                return "Aprovado";
            } else if (media < 40) {
                return "Reprovado";
            } else {
                return "Na final";
            }
        }

        // Método para obter o nome do aluno
        public String getNome() {
            return nome;
        }
    }


