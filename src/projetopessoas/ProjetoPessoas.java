package projetopessoas;

public class ProjetoPessoas {
    public static void main(String [] args){
        //Programa Principal
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Alexandre");
        p1.setSexo("Masculino");
        p1.setIdade(20);

        p2.setNome("Laís");
        p2.setSexo("Feminino");
        p2.setIdade(19);
        p2.setCurso("Pedagogia");
        p2.setMatricula(1);

        p3.setNome("Lucas Montano");
        p3.setSexo("Masculino");
        p3.setIdade(31);
        p3.setSalario(4500.67f);

        p4.setNome("Fabiana");
        p4.setSexo("Feminino");
        p4.setIdade(42);
        p4.setSetor("Estoque");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
