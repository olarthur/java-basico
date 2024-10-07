import java.util.Locale;

public class TerceiroPrograma {
    public static void main(String[] args) throws Exception {
        Locale idioma = Locale.getDefault();
        System.out.println("O idioma do sistema e: ");
        System.out.println(idioma.getDisplayLanguage());
        System.out.println("Código do idioma: " + idioma.getLanguage());
    }
}
