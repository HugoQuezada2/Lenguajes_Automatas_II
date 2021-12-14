package codigo;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;
import javax.swing.JFileChooser;

public class frmAnalizador extends javax.swing.JFrame {

    public frmAnalizador() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        analizador1 = new codigo.analizador();
        analizador2 = new codigo.analizador();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnAnalizar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEntrada = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtSalida = new javax.swing.JTextArea();
        btbAbrirArchivo = new javax.swing.JButton();
        btnAnalizador2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtSalida2 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btbAnalizador3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Sylfaen", 2, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Analizador Lexico");

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnAnalizar.setBackground(new java.awt.Color(51, 51, 51));
        btnAnalizar.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        btnAnalizar.setForeground(new java.awt.Color(204, 204, 204));
        btnAnalizar.setText("Analizar");
        btnAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Ingrese el texto que desea analizar:");

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtEntrada.setBackground(new java.awt.Color(204, 204, 204));
        txtEntrada.setColumns(20);
        txtEntrada.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        txtEntrada.setRows(5);
        jScrollPane1.setViewportView(txtEntrada);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtSalida.setColumns(20);
        txtSalida.setRows(5);
        jScrollPane2.setViewportView(txtSalida);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        btbAbrirArchivo.setText("Abrir Archivo");
        btbAbrirArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbAbrirArchivoActionPerformed(evt);
            }
        });

        btnAnalizador2.setText("Analizar");
        btnAnalizador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizador2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAnalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(168, 168, 168)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAnalizador2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btbAbrirArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAnalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAnalizador2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btbAbrirArchivo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        txtSalida2.setColumns(20);
        txtSalida2.setRows(5);
        jScrollPane3.setViewportView(txtSalida2);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Analizador Sintáctico");

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btbAnalizador3.setText("Analizar");
        btbAnalizador3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbAnalizador3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btbAnalizador3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)))
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(btbAnalizador3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void analizadorLexico () throws IOException {
        int cont = 1;
    String expr = (String) txtEntrada.getText();
    Lexer lexer = new Lexer (new StringReader(expr));
    String resultado= "Linea: "+ cont + "\t\t SIMBOLO\t\n";
    while(true){
            Tokens tokens = lexer.yylex();
            if(tokens == null) {
                    resultado += "fin";
                    txtSalida.setText(resultado);
                    return;
                }
    
    switch(tokens){
    case entonces:
    cont++;
    resultado += "<Reservada entonces> \t" +lexer.lexeme + "\n";
    break;
    
    case ademas:
    cont++;
    resultado += "<Reservada ademas>\t" + lexer.lexeme + "\n";
    break;
    
    case mientrasque:
    cont++;
    resultado += "<Reservada mientras que>\t" + lexer.lexeme + "\n";
    break;
    
    case para:
    cont++;
    resultado += "<Reservada para>\t" + lexer.lexeme + "\n";
    break;
    
    case entera:
    cont++;
    resultado += "<Reservada entera>\t" + lexer.lexeme + "\n";
    break;
    
    case caracter:
    cont++;
    resultado += "<Reservada caracter>\t" + lexer.lexeme + "\n";
    break;
    
    case flotante:
    cont++;
    resultado += "<Reservada flotante>\t" + lexer.lexeme + "\n";
    break;
    
    case doble:
    cont++;
    resultado += "<Reservada doble>\t" + lexer.lexeme + "\n";
    break;
    
    case boleana:
    cont++;
    resultado += "<Reservada boleana>\t" + lexer.lexeme + "\n";
    break;
    
    case Linea:
    cont++;
    resultado += "<Reservada Linea>\t" + lexer.lexeme + "\n";
    break;
    
    case asignaA:
    cont++;
    resultado += "<Reservada asigna>\t" + lexer.lexeme + "\n";
    break;
    
    case Igual:
    cont++;
    resultado += "<Reservada Igual>\t" + lexer.lexeme + "\n";
    break;
    
    case Suma:
    cont++;
    resultado += "<Reservada Suma>\t" + lexer.lexeme + "\n";
    break;
    
    case Resta:
    cont++;
    resultado += "<Reservada Resta>\t" + lexer.lexeme + "\n";
    break;
    
    case Multiplicacion:
    cont++;
    resultado += "<Reservada Multiplicacion>\t" + lexer.lexeme + "\n";
    break;
    
    case Division:
    cont++;
    resultado += "<Reservada Division>\t" + lexer.lexeme + "\n";
    break;
    
    case igualA:
    cont++;
    resultado += "<Reservada igual a>\t" + lexer.lexeme + "\n";
    break;
    
    case menorQue:
    cont++;
    resultado += "<Reservada Linea>\t" + lexer.lexeme + "\n";
    break;
    
    case mayorQue:
    cont++;
    resultado += "<Reservada mayor que>\t" + lexer.lexeme + "\n";
    break;
    
    case mayorOigualA:
    cont++;
    resultado += "<Reservada mayor o igual a>\t" + lexer.lexeme + "\n";
    break;
    
    case menorOigualA:
    cont++;
    resultado += "<Reservada menor o igual a>\t" + lexer.lexeme + "\n";
    break;
    
    case desplazaIzquierda:
    cont++;
    resultado += "<Reservada desplaza a la Izquierda>\t" + lexer.lexeme + "\n";
    break;
    
    case desplazaDerecha:
    cont++;
    resultado += "<Reservada desplazar a la Derecha>\t" + lexer.lexeme + "\n";
    break;
    
    case diferenteA:
    cont++;
    resultado += "<Reservada diferente a>\t" + lexer.lexeme + "\n";
    break;
    case tambien:
    cont++;
    resultado += "<Reservada tambien>\t" + lexer.lexeme + "\n";
    break;
    
    case comentario:
    cont++;
    resultado += "<Reservada comentario>\t" + lexer.lexeme + "\n";
    break;
    case modula:
    cont++;
    resultado += "<Reservada diferente a>\t" + lexer.lexeme + "\n";
    break;
    
    case obien:
    cont++;
    resultado += "<Reservada o bien>\t" + lexer.lexeme + "\n";
    break;
    
    case incremento:
    cont++;
    resultado += "<Reservada incremento>\t" + lexer.lexeme + "\n";
    break;
    
    case decremento:
    cont++;
    resultado += "<Reservada decremento>\t" + lexer.lexeme + "\n";
    break;
    
    case comilladoSimple:
    cont++;
    resultado += "<Reservada comillado simple>\t" + lexer.lexeme + "\n";
    break;
    
    case comilladoDobleA:
    cont++;
    resultado += "<Reservada comillado doble>\t" + lexer.lexeme + "\n";
    break;
    
    case dosPuntos:
    cont++;
    resultado += "<Reservada dos puntos>\t" + lexer.lexeme + "\n";
    break;
    
    case coma:
    cont++;
    resultado += "<Reservada coma>\t" + lexer.lexeme + "\n";
    break;
    
    case puntoYcoma:
    cont++;
    resultado += "<Reservada punto y coma>\t" + lexer.lexeme + "\n";
    break;
    
    case parentesisA:
    cont++;
    resultado += "<Reservada parentesis A>\t" + lexer.lexeme + "\n";
    break;
    
    case parentesisB:
    cont++;
    resultado += "<Reservada parentesis B>\t" + lexer.lexeme + "\n";
    break;
    
    case corcheteA:
    cont++;
    resultado += "<Reservada corchete A>\t" + lexer.lexeme + "\n";
    break;
    
    case corcheteB:
    cont++;
    resultado += "<Reservada corchete B>\t" + lexer.lexeme + "\n";
    break;
    
    case llaveA:
    cont++;
    resultado += "<Reservada llave A>\t" + lexer.lexeme + "\n";
    break;
    
    case llaveB:
    cont++;
    resultado += "<Reservada llave B>\t" + lexer.lexeme + "\n";
    break;
    
    case Identificador:
    cont++;
    resultado += "<Reservada identificador>\t" + lexer.lexeme + "\n";
    break;
    
    case Numero:
    cont++;
    resultado += "<Reservada Numero>\t" + lexer.lexeme + "\n";
    break;
    
    case ERROR:

    resultado += "<simbolo no definido>\t"+ lexer.lexeme +"\n";
    break;
    }
  }
}

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtEntrada.setText(" ");
        txtSalida.setText(" ");
        txtSalida2.setText(" ");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarActionPerformed
        File archivo = new File("archivo.txt");

        PrintWriter escribir;
        try {
            escribir = new PrintWriter(archivo);
            escribir.print(txtEntrada.getText());
            escribir.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(frmAnalizador.class.getName()).log(Level.SEVERE, null, ex);
        }
        Reader lector;
        try {
            lector = new BufferedReader(new FileReader("archivo.txt"));
            Lexer lexer = new Lexer(lector);
            String resultado = "";
            while (true) {
                Tokens tokens = lexer.yylex();
                if (tokens == null) {
                    resultado += "FIN";
                    txtSalida.setText(resultado); //System.out.println(resultado); (proyectar en consola de NetBeans)
                    return;
                }
                switch (tokens) {
                    case ERROR:
                    resultado += "Error! Símbolo no definido\n";
                    break;
                    case Identificador: case Numero: case Reservadas:
                    resultado += lexer.lexeme + ": Es un " + tokens + "\n";
                    break;
                    default:
                    resultado += "Token: " + tokens + "\n";
                    break;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(frmAnalizador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(frmAnalizador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnAnalizarActionPerformed

    private void btbAbrirArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbAbrirArchivoActionPerformed
    JFileChooser chooser = new JFileChooser();
    chooser.showOpenDialog(null);
    File archivo = new File(chooser.getSelectedFile().getAbsolutePath());
    
    String ST; 
        try {
            ST = new String(Files.readAllBytes(archivo.toPath()));
                txtSalida.setText(ST);
        } catch (IOException ex) {
            Logger.getLogger(frmAnalizador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btbAbrirArchivoActionPerformed

    private void btnAnalizador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizador2ActionPerformed
        try {
            analizadorLexico();
        } catch (IOException ex) {
            Logger.getLogger(frmAnalizador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAnalizador2ActionPerformed

    private void btbAnalizador3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbAnalizador3ActionPerformed
      String ST = txtEntrada.getText();
      Sintax s = new Sintax(new codigo.LexerCup(new StringReader(ST)));
        try {
            s.parse();
        txtSalida2.setText("Analisis realizado correctamente");
        txtSalida2.setForeground(Color.green);
        } catch (Exception ex) {
            Symbol sym = s.getS();
            txtSalida2.setText("Error en la sintaxis. Linea: "+ (sym.right+1) + " texto:\"" + sym.value + "\"" );
            txtSalida2.setForeground(Color.red);
          //Logger.getLogger(frmAnalizador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btbAnalizador3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAnalizador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private codigo.analizador analizador1;
    private codigo.analizador analizador2;
    private javax.swing.JButton btbAbrirArchivo;
    private javax.swing.JButton btbAnalizador3;
    private javax.swing.JButton btnAnalizador2;
    private javax.swing.JButton btnAnalizar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtEntrada;
    private javax.swing.JTextArea txtSalida;
    private javax.swing.JTextArea txtSalida2;
    // End of variables declaration//GEN-END:variables
}
