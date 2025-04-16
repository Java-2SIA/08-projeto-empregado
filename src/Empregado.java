public abstract class Empregado extends Object{
    long matricula;
    String nome;

    public Empregado(long matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public String getDados(){
        String aux = "";
        aux += "Matrícula: " + matricula + "\n";
        aux += "Nome: " + nome + "\n";
        return aux;
    }

    // o metedo que não possui corpo é abstrato
    public abstract double CalcularSalario();

}
    // uma classe abstrada não pode ser instânciada - não gera objeto
    // só faz sentido a superclasse ser abstrata
    // só tem sentido o metodo abstrato na classe abstrata (superclasse)
    // override - subescreve
