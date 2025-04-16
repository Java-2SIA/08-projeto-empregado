import java.text.DecimalFormat;

public class EComissionado extends Empregado{
    double totalDeVendas;
    double comissao;

    public EComissionado(long matricula, String nome, double totalDeVendas, double comissao) {
        super(matricula, nome); // super nessa linha de cod é um método
        this.totalDeVendas = totalDeVendas;
        this.comissao = comissao;
    }

    public String getDados(){
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String aux = super.getDados();
        aux += "Total de vendas: " + df.format(totalDeVendas) + "\n";
        aux += "Comissão: " + df.format(comissao) + "%\n";
        return aux;
    }

    public double CalcularSalario(){
        return totalDeVendas * comissao / 100;
    }
}
