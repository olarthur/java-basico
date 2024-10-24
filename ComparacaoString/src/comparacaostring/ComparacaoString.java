package comparacaostring;
public class ComparacaoString {
    public static void main(String[] args) throws Exception {

        String name1 = "Platao";
        String name2 = "Platao";
        String name3 = new String("Platao");
        String res;

        res = (name1.equals(name3)) ? "Igual" : "Diferente";
        System.out.println(res);
    }
}
