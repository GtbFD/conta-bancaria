import com.banco.entities.*;

public class Main {
    public static void main(String[] args) {
        Banco santander = new Banco("Santander");

        Cliente guga = new Cliente("Guga");
        Conta cc = new ContaCorrente(guga);
        Conta cp = new ContaEspecial(guga);


        santander.getContas().add(cc);
        santander.getContas().add(cp);

        cc.depositar(1000);
        cc.transferir(100, cp);
        cc.transferir(250, cp);

        cc.informacoes();
        cp.informacoes();

        System.out.println("Banco" + santander);
    }
}