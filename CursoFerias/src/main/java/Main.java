import senac.pe.faculdade.entidades.Agencia;
import senac.pe.faculdade.entidades.Cliente;
import senac.pe.faculdade.entidades.Conta;
import senac.pe.faculdade.entidades.Endereco;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Endereco endMiguel;

        endMiguel = new Endereco("Rua Luis de Camoes", "Encruzilhada",
                "Recife", "PE", 100, "Apartamento 405",
                "50070085");

        // Cuidado - Não deve fazer!
        // endMiguel.cidade = "Olinda";
        // Sim está correto!
        endMiguel.setCidade("Olinda");

        //System.out.println(endMiguel.getCidade() + " | " + endMiguel.getBairro());
        //System.out.println(endMiguel);

        Endereco endCharles = new Endereco("Rua Sete", "Maranguape II",
                "Paulista", "PE", 87,
                "55420170");

        //System.out.println(endCharles);

        Endereco endAgSenac = new Endereco("Rua do Pombal", "Santo Amaro",
                "Recife", "PE", 81,
                "50750840");

        Agencia agSenac = new Agencia(1234, "SENAC PE", "(81)21212588",
                "ag@bancosenac.com", endAgSenac);

        System.out.println(agSenac);

        Cliente miguel = new Cliente("Miguel Souza", "123.456.789-99",
                                new Date(95, 10, 20), 123456,
                            "miguelsouza@gmail.com", "(81)99858525", endMiguel);

        Cliente charles = new Cliente("Felippe Adriel", "321.456.789-00",
                new Date(98, 04, 16), 558456,
                "felippecharles@gmail.com", "(81)99858235", endCharles);

        System.out.println(miguel);
        System.out.println(charles);

        Conta contaMiguel = new Conta(miguel, 784512, agSenac,
                    new Date(125, 00, 26), 1400, true);
        Conta contaCharles = new Conta(charles, 875421, agSenac,
                    new Date(125, 00, 20), 2000, true);

        System.out.println(contaMiguel.sacar(1500));
        System.out.println(contaCharles.depositar(-250));

        contaCharles.depositar(1000);
        contaMiguel.sacar(1000);
        contaCharles.sacar(800);
        contaMiguel.depositar(1300);



    }
}