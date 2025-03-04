public class ExemploForArray {
    public static void main(String[] args) {
        String[] alunos = { "Ana", "Maria", "José", "Pedro" };
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("O nome do aluno no " + i + "º indice é: " + alunos[i]);
        }
    }
}
