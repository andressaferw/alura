public class TesteFuncionario {
    public static void main(String[] args) {

        Funcionario andressa = new Funcionario();
        andressa.setNome("Andressa Alves");
        andressa.setCpf("123456789-0");
        andressa.setSalario(2600.00);

        System.out.println(andressa.getNome());
        System.out.println(andressa.getBonificacao());
    }
}
