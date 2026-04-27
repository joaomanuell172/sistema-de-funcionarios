public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
  
    @Override
    public double calcularSalario() {
        return this.salario * 1.10;
    }

    public double calcularSalario(double bonus) {
        return (this.salario * 1.10) + bonus;
    }
}
