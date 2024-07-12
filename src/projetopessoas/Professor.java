package projetopessoas;

public class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    public void ReceberAum(float aumento) {
        this.salario += aumento;
        System.out.println("Recebeu um aumento de R$ " + aumento + "\nAgora seu salário é de R$ " + this.salario);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
