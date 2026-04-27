public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Carlos", 5000.0);
        Estagiario estagiario = new Estagiario("Ana", 1200.0);

        System.out.println("--- Cálculo de Salários ---");

        System.out.println("Gerente " + gerente.nome + " (base + 10%): R$ " + gerente.calcularSalario());
        System.out.println("Estagiário " + estagiario.nome + " (base): R$ " + estagiario.calcularSalario());

        System.out.println("\n--- Cálculo com Bônus Extra ---");
        System.out.println("Gerente " + gerente.nome + " (com bônus de 500): R$ " + gerente.calcularSalario(500.0));
        System.out.println("Estagiário " + estagiario.nome + " (com bônus de 100): R$ " + estagiario.calcularSalario(100.0));
    }
}
