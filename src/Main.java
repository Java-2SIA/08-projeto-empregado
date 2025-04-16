public class Main {
    public static void main(String[] args) {

        Empregado[] empregado = new Empregado[3];
        empregado[0] = new EComissionado(123, "Isa", 200, 180);
        empregado[1] = new EHorista(456, "Dani", 13, 200);
        empregado[2] = new EComissionado(789, "Theus", 400, 20);

        // a variavel "e" respresenta a superclasse
        for(Empregado e : empregado){
            System.out.println(e.getDados());
            System.out.println(e.CalcularSalario());
        }

    }
}
