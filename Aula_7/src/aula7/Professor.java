package aula7;

public class Professor extends Pessoa{
    
    private double salario;
    
    public Professor(String nome, String cpf, String data_nascimento) {
        super(nome, cpf, data_nascimento);
    }
    
    
    @Override
    
    public String exibir_cadastro(){
        String info = "\n----Professor-------";
        info += super.exibir_cadastro();
        info += "\nSalário = R$" + String.format("%.2f", this.salario);
        info += "\n";
        
        return info;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}