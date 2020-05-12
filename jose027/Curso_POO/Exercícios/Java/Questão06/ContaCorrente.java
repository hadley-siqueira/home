public class ContaCorrente {
    int numero;
    double saldo, limite;   
    boolean c_especial;
     
    public boolean saque(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;            
            return true;
        } 
        return false;
    }

    public void deposito(double valor) {
        this.saldo += valor;
    }

    public void consultaSaldo() {
        System.out.println("Saldo atual da conta: R$" + this.saldo + " reais");
    }

    public boolean verificacaoEspecial() {
        if (this.c_especial == true) {
            return true;
        }
        return false;
    }

    public void status() {
        System.out.println("Número da conta: " + this.numero);
        System.out.println("Saldo da conta: R$" + this.saldo + " reais");
        System.out.println("Limite da conta: R$" + this.limite + " reais");
        System.out.println("Conta especial? " + this.c_especial);
    }
}
