public class TesteGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Marco");
        g1.setCpf("12345678900");
        g1.setSalario(5000.0);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

        g1.setSenha(2222);
        boolean autenticou = g1.autentica(2222);

        System.out.println(autenticou);
    }
}
