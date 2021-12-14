package codigo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class generadora { 
    public static void main(String[] args) throws Exception 
    {
        String ruta =  "C:\\Users\\Hugo Quezada\\OneDrive\\1.JavaProyects\\LenguajesAII_ALexicoII\\src\\codigo\\Lexer.flex";
        String ruta2 = "C:\\Users\\Hugo Quezada\\OneDrive\\1.JavaProyects\\LenguajesAII_ALexicoII\\src\\codigo\\LexerCup.flex";
        String[] rutaS = {"-parser", "Sintax","C:\\Users\\Hugo Quezada\\OneDrive\\1.JavaProyects\\LenguajesAII_ALexicoII\\src\\codigo\\Sintax.cup"};
        generarLexer(ruta, ruta2, rutaS);
    }
    public static void generarLexer(String ruta, String ruta2, String[] rutaS) throws IOException, Exception{
    File archivo;
        archivo = new File(ruta);
        JFlex.Main.generate(archivo);
        archivo = new File(ruta2);
        JFlex.Main.generate(archivo);
        java_cup.Main.main(rutaS);
        
        Path rutaSym = Paths.get("C:\\Users\\Hugo Quezada\\OneDrive\\1.JavaProyects\\LenguajesAII_ALexicoII\\src\\codigo\\sym.java");
        if (Files.exists(rutaSym)) {
            Files.delete(rutaSym);
            }
        Files.move(
                Paths.get("C:\\Users\\Hugo Quezada\\OneDrive\\1.JavaProyects\\LenguajesAII_ALexicoII\\sym.java"), 
                Paths.get("C:\\Users\\Hugo Quezada\\OneDrive\\1.JavaProyects\\LenguajesAII_ALexicoII\\src\\codigo\\sym.java")
            );
        Path rutaSin = Paths.get("C:\\Users\\Hugo Quezada\\OneDrive\\1.JavaProyects\\LenguajesAII_ALexicoII\\src\\codigo\\Sintax.java");
        if (Files.exists(rutaSin)) {
            Files.delete(rutaSin);
            }
        Files.move(
                Paths.get("C:\\Users\\Hugo Quezada\\OneDrive\\1.JavaProyects\\LenguajesAII_ALexicoII\\Sintax.java"), 
                Paths.get("C:\\Users\\Hugo Quezada\\OneDrive\\1.JavaProyects\\LenguajesAII_ALexicoII\\src\\codigo\\Sintax.java")
            );
    } 
}

