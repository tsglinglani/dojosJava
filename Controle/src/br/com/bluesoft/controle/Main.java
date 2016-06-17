package br.com.bluesoft.controle;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoaTeste = new Pessoa();
        pessoaTeste.salario = 1000.50;
        pessoaTeste.nome = "Kauan";

        Despesa despesa = new Despesa();
        despesa.valor = 50.0;
        despesa.tipoDespesa = "Cinema";

        System.out.println("Meu salário: R$ " + pessoaTeste.salario);
        System.out.println("Despesa " + despesa.tipoDespesa + ": R$ " + despesa.valor);
        Double sobra = pessoaTeste.salario - despesa.valor;
        System.out.println("Sobrou do meu salário: R$ " + sobra);
        Double contaSobra = (pessoaTeste.salario*70/100);

        if(sobra < contaSobra){
            System.out.println("Você precisa parar de gastar!!!!");
        } else {
            System.out.println("Você pode gastar mais!!!");
        }

    }
}
