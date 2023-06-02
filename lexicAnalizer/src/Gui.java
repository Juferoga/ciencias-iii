import javax.swing.*;

import codigo.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;

public class Gui {
    public static void main(String[] args) {
      JFrame frame = new JFrame("Analizador Léxico");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);
      frame.setSize(600, 600);

      // Crear los componentes
      JTextArea textArea1 = new JTextArea();
      JButton button1 = new JButton("Button");
      JTextArea textArea2 = new JTextArea();

      // Agregar un ActionListener al botón
      button1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          // Definir la funcionalidad del botón
          String text = textArea1.getText();
          File archivo = new File("archivo.jf");
          PrintWriter escritor;
          try {
            escritor= new PrintWriter(archivo);
            escritor.print(text);
            escritor.close();
          } catch (FileNotFoundException ex) {
            System.out.println("Error al buscar archivo: " + ex);
          }
          
          try {
            Reader Lector = new BufferedReader(new FileReader("archivo.jf"));
            Lexer lexer = new Lexer(Lector);
            String resultado = "";
            while (true) {
              Tokens tokens = lexer.yylex();
              if (tokens == null) {
                resultado += "FIN";
                textArea2.setText(resultado);;
                return;
              } 
              switch (tokens) {
                case Reservadas:
                    // Procesar token Reservadas
                    resultado += "El símbolo es : una palabra reservada \t"+lexer.lexeme+ "Token:"+tokens+"\n";
                    break;
                case Igual:
                    // Procesar token Igual
                    resultado += "El símbolo es : Operador(Igual) \t"+lexer.lexeme+ "Token:"+tokens+"\n";
                    break;
                case Suma:
                    // Procesar token Suma
                    resultado += "El símbolo es : Operador(Suma) \t"+lexer.lexeme+ "Token:"+tokens+"\n";
                    break;
                case Resta:
                    // Procesar token Resta
                    resultado += "El símbolo es : Operador(Resta) \t"+lexer.lexeme+ "Token:"+tokens+"\n";
                    break;
                case Multiplicacion:
                    // Procesar token Multiplicación
                    resultado += "El símbolo es : Operador(Multiplicación) \t"+lexer.lexeme+ "Token:"+tokens+"\n";
                    break;
                case Division:
                    // Procesar token Division
                    resultado += "El símbolo es : Operador(División) \t"+lexer.lexeme+ "Token:"+tokens+"\n";
                    break;
                case Potencia:
                    // Procesar token Potencia
                    resultado += "El símbolo es : Operador(Potencia) \t"+lexer.lexeme+ "Token:"+tokens+"\n";
                    break;
                case Identificador:
                    // Procesar token Identificador
                    resultado += "El símbolo es : un identificador \t"+lexer.lexeme+ "Token:"+tokens+"\n";
                    break;
                case Numero:
                    // Procesar token Numero
                    resultado += "El símbolo es : un número \t"+lexer.lexeme+ "Token:"+tokens+"\n";
                    break;
                case ERROR:
                    // Procesar token ERROR
                    resultado += "El símbolo no existe\n";
                    break;
                default:
                    // Token desconocido
                    resultado += "Token desconocido\n";
              }
            }
          } catch (FileNotFoundException ex) {
            System.out.println("Error al Leer el archivo: " + ex);
          } catch (IOException ex){
            System.out.println("Error al Leer el archivo: " + ex);
          }
        }
      });

        // Crear los paneles
        JPanel panel1 = new JPanel(new BorderLayout());
        JPanel panel2 = new JPanel(new GridLayout(16, 1));

        // Agregar los componentes al panel 1
        panel1.add(textArea1, BorderLayout.CENTER);
        panel1.add(button1, BorderLayout.EAST);

        // Agregar los componentes al panel 2
        for (int i = 0; i < 15; i++) {
            panel2.add(new JTextArea());
        }
        panel2.add(textArea2);

        // Agregar los paneles al marco
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.CENTER);

        // Mostrar el marco
        frame.pack();
        frame.setVisible(true);
    }
}


