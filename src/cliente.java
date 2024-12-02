import java.util.*;

public class cliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Parte 1: Ordenar nomes em ordem alfabética
        System.out.println("Digite nomes separados por vírgulas:");
        String entradaNomes = scanner.nextLine();

        // Dividir os nomes pela vírgula e armazenar em uma lista
        List<String> nomes = Arrays.asList(entradaNomes.split(","));
        nomes.replaceAll(String::trim); // Remover espaços extras
        Collections.sort(nomes); // Ordenar os nomes

        // Imprimir os nomes ordenados
        System.out.println("\nNomes ordenados em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // Parte 2: Separar pessoas por sexo
        System.out.println("\nDigite nomes e sexo separados por traço (exemplo: João-M, Maria-F):");
        String entradaPessoas = scanner.nextLine();

        // Dividir as entradas por vírgula
        String[] pessoasArray = entradaPessoas.split(",");

        // Listas para armazenar por sexo
        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();

        // Processar cada entrada
        for (String pessoa : pessoasArray) {
            String[] partes = pessoa.split("-");
            if (partes.length == 2) { // Verificar se há nome e sexo
                String nome = partes[0].trim();
                String sexo = partes[1].trim().toUpperCase();

                if (sexo.equals("M")) {
                    masculino.add(nome);
                } else if (sexo.equals("F")) {
                    feminino.add(nome);
                }
            }
        }

        // Ordenar as listas
        Collections.sort(masculino);
        Collections.sort(feminino);

        // Imprimir os resultados
        System.out.println("\nLista Masculino:");
        for (String nome : masculino) {
            System.out.println(nome);
        }

        System.out.println("\nLista Feminino:");
        for (String nome : feminino) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
