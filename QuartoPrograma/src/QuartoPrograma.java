import java.awt.Dimension;
import java.awt.Toolkit;

public class QuartoPrograma {
    public static void main(String[] args) throws Exception {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension resolucao = toolkit.getScreenSize();

        System.out.println("A resolucao da tela e:");
        System.out.println("Largura: " + resolucao.width + " pixels");
        System.out.println("Altura: " + resolucao.height + " pixels");
    }
}
