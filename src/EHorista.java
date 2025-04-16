import java.text.DecimalFormat;

public class EHorista extends Empregado{
    int totalDeHorasTrabalhadas;
    double valorDaHoraTrabalhada;

    public EHorista(long matricula, String nome, int totalDeHorasTrabalhadas, double valorDaHoraTrabalhada) {
        super(matricula, nome);
        this.totalDeHorasTrabalhadas = totalDeHorasTrabalhadas;
        this.valorDaHoraTrabalhada = valorDaHoraTrabalhada;
    }

    public String getDados(){
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String aux = super.getDados();
        aux += "Total de horas trabalhadas: " + totalDeHorasTrabalhadas + "\n";
        aux += "Valor da hora trabalhada: R$ " + df.format(valorDaHoraTrabalhada) + "\n";
        return aux;
    }

    public double CalcularSalario(){
        return totalDeHorasTrabalhadas * valorDaHoraTrabalhada;
    }
}
