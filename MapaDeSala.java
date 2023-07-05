import java.util.Scanner;

public class Main {

    private static String[][] mapaAlunos;
    private static String[][] mapaLugares;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à Sala de Aula!");

        System.out.print("Informe o número de linhas da sala: ");
        int linhas = scanner.nextInt();

        System.out.print("Informe o número de colunas da sala: ");
        int colunas = scanner.nextInt();

        mapaAlunos = new String[linhas][colunas];
        mapaLugares = new String[linhas][colunas];

        int opcao;
        do {
            System.out.println("\n-=-=-=-=-=- MENU -=-=-=-=-=-");
            System.out.println("1 - Visualizar mapa da sala");
            System.out.println("2 - Reservar lugar");
            System.out.println("3 - Liberar lugar");
            System.out.println("4 - Visualizar detalhes do lugar");
            System.out.println("5 - Visualizar mapa de lugares com nomes");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 0 -> System.out.println("Saindo do programa...");
                case 1 -> mostrarMapa();
                case 2 -> reservarLugar();
                case 3 -> liberarLugar();
                case 4 -> visualizarDetalhesLugar();
                case 5 -> mostrarMapaNomes();
                default -> System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (opcao != 0);
    }

    public static void mostrarMapa() {
        System.out.println("\n===== MAPA DA SALA =====");
        for (String[] mapaLugare : mapaLugares) {
            for (String s : mapaLugare) {
                if (s == null) {
                    System.out.print("[ ]");
                } else {
                    System.out.print("[X]");
                }
            }
            System.out.println();
        }
    }

    public static void reservarLugar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a linha do lugar a ser reservado: ");
        int linha = scanner.nextInt();

        System.out.print("Informe a coluna do lugar a ser reservado: ");
        int coluna = scanner.nextInt();

        if (linha < 1 || linha > mapaAlunos.length || coluna < 1 || coluna > mapaAlunos[0].length) {
            System.out.println("Lugar inválido. Por favor, escolha um lugar dentro dos limites da sala.");
            return;
        }

        if (mapaAlunos[linha - 1][coluna - 1] != null) {
            System.out.println("Lugar já está ocupado. Escolha outro lugar.");
            return;
        }

        String nomeAluno;
        while (true) {
            System.out.print("Informe o nome do aluno: ");
            nomeAluno = scanner.next();

            if (nomeAluno.isEmpty()) {
                System.out.println("Nome inválido. Por favor, insira um nome válido.");
            } else {
                break;
            }
        }

        mapaAlunos[linha - 1][coluna - 1] = nomeAluno;
        mapaLugares[linha - 1][coluna - 1] = "X";
        System.out.println("Lugar reservado com sucesso para o aluno " + nomeAluno + ".");
    }

    public static void liberarLugar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a linha do lugar a ser liberado: ");
        int linha = scanner.nextInt();

        System.out.print("Informe a coluna do lugar a ser liberado: ");
        int coluna = scanner.nextInt();

        if (linha < 1 || linha > mapaAlunos.length || coluna < 1 || coluna > mapaAlunos[0].length) {
            System.out.println("Lugar inválido. Por favor, escolha um lugar dentro dos limites da sala.");
            return;
        }

        if (mapaAlunos[linha - 1][coluna - 1] == null) {
            System.out.println("Lugar já está vazio.");
        } else {
            String nomeAluno = mapaAlunos[linha - 1][coluna - 1];
            mapaAlunos[linha - 1][coluna - 1] = null;
            mapaLugares[linha - 1][coluna - 1] = null;
            System.out.println("Lugar liberado com sucesso. Aluno " + nomeAluno + " removido.");
        }
    }

    public static void visualizarDetalhesLugar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a linha do lugar: ");
        int linha = scanner.nextInt();

        System.out.print("Informe a coluna do lugar: ");
        int coluna = scanner.nextInt();

        if (linha < 1 || linha > mapaAlunos.length || coluna < 1 || coluna > mapaAlunos[0].length) {
            System.out.println("Lugar inválido. Por favor, escolha um lugar dentro dos limites da sala.");
            return;
        }

        String nomeAluno = mapaAlunos[linha - 1][coluna - 1];
        if (nomeAluno == null) {
            System.out.println("Lugar vazio.");
        } else {
            System.out.println("Detalhes do lugar:");
            System.out.println("Linha: " + linha);
            System.out.println("Coluna: " + coluna);
            System.out.println("Aluno: " + nomeAluno);
        }
    }

    public static void mostrarMapaNomes() {
        System.out.println("\n===== MAPA DA SALA COM NOMES =====");
        for (String[] mapaAluno : mapaAlunos) {
            for (String s : mapaAluno) {
                if (s != null) {
                    System.out.print("[ " + s + " ]");
                } else {
                    System.out.print("[   ]");
                }
            }
            System.out.println();
        }
    }
}
