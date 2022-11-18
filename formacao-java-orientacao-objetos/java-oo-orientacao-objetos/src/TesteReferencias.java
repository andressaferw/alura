public class TesteReferencias {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 500;
        System.out.println("saldo da primeira: " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta;
        System.out.println("saldo da segunda conta: " + segundaConta.saldo);

        segundaConta.saldo += 200;
        System.out.println("saldo da segunda conta: " + segundaConta.saldo);

        System.out.println(primeiraConta.saldo);

        if (primeiraConta == segundaConta) {
            System.out.println("é a mesma conta");
        }
        //System.out.println(primeiraConta);
        //System.out.println(segundaConta);
    }
}
