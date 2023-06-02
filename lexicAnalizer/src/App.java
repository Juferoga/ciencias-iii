import java.io.File;
import codigo.*;

public class App {
    public static void main(String[] args) throws Exception {
        String rutaLexer = "/home/juferoga/repos/ud/ciencias-iii/lexicAnalizer/src/codigo/Lexer.flex";
        crearLexer(rutaLexer);
    }
    public static void crearLexer(String rutaLexer){
        File archivoLexer = new File(rutaLexer);
        JFlex.Main.generate(archivoLexer);
    }
}