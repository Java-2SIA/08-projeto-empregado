import java.text.DecimalFormat;

public class EHorista extends Empregado{
    int totalDeHoras;
    double valorDaHora;

    public EHorista(long matricula, String nome, int totalDeHorasTrabalhadas, double valorDaHoraTrabalhada) {
        super(matricula, nome);
        this.totalDeHoras = totalDeHorasTrabalhadas;
        this.valorDaHora = valorDaHoraTrabalhada;
    }

    public String getDados(){
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String aux = super.getDados();
        aux += "Total de horas trabalhadas: " + totalDeHoras + "\n";
        aux += "Valor da hora trabalhada: R$ " + df.format(valorDaHora) + "\n";
        return aux;
    }

    public double CalcularSalario(){
        return totalDeHoras * valorDaHora;
    }
}
