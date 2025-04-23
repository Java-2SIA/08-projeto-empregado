import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Double.parseDouble;


public class Util {
    private Controle controle = new Controle();

    public void menu(){
        inserir();
        pesquisar();
        pesquisar();
        listar();
    }

    private void inserir(){
        long matricula;
        String nome;
        double totalDeVendas, comissao, valorDahora;
        int totalDeHoras;
        int opcao;
        String menu = "1. Empregado Comissionado\n2. Empregado Horista\n3. Sair";

        while (true){
            opcao = parseInt(showInputDialog(menu));
            if (opcao == 3){
                return;
            }
            if (opcao == 1 || opcao == 2){
                matricula = parseLong(showInputDialog("Matricula do empregado"));
                nome = showInputDialog("Nome do emprego");
                if (opcao == 1){
                    totalDeVendas = parseDouble(showInputDialog("Valor total de vendas"));
                    comissao = parseDouble(showInputDialog("Comissão (porcentagem)"));
                    controle.inserir(new EComissionado(matricula, nome, totalDeVendas, comissao));
                }
                else {
                    totalDeHoras = parseInt(showInputDialog("Total de horas trabalhadas"));
                    valorDahora = parseDouble(showInputDialog("Valor da hora trabalhada"));
                    controle.inserir(new EHorista(matricula, nome, totalDeHoras, valorDahora));
                }
            }
        }

    }

    private void pesquisar(){
        long matricula = parseLong(showInputDialog("Matricula para pesquisa"));
        Empregado empregado = controle.pesquisar(matricula);
        if (empregado == null){
            showMessageDialog(null, "Empregado com a matrícula " + matricula + " não encontrado");
        }
        else {
            showMessageDialog(null, empregado.getDados());
        }
    }

    private void listar(){
        showMessageDialog(null, controle.listar());
    }


}
