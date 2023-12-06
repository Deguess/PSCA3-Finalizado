
package projetoa3;

import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

        private Pokemon pJanela;
        private boolean verificar;
        
    public Menu() {
        initComponents();
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMoto = new javax.swing.JButton();
        btnPokemon = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnLogin = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnMoto.setBackground(new java.awt.Color(0, 102, 102));
        btnMoto.setForeground(new java.awt.Color(255, 255, 255));
        btnMoto.setText("Motos");
        btnMoto.setPreferredSize(new java.awt.Dimension(50, 20));
        btnMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMotoActionPerformed(evt);
            }
        });

        btnPokemon.setBackground(new java.awt.Color(0, 102, 102));
        btnPokemon.setForeground(new java.awt.Color(255, 255, 255));
        btnPokemon.setText("Pokemon");
        btnPokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPokemonActionPerformed(evt);
            }
        });

        btnRegistrar.setBackground(new java.awt.Color(0, 102, 102));
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(0, 102, 102));
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        txtSenha.setName(""); // NOI18N

        jLabel1.setText("Usuário");

        jLabel3.setText("Senha");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrar)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        txtSenha.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPokemonActionPerformed
        if(verificar == true) {
        Pokemon pJanela = new Pokemon();
        pJanela.setVisible(true);
        } else {
        JOptionPane.showMessageDialog(null, "Por favor faça o login primeiro");
        }
    }//GEN-LAST:event_btnPokemonActionPerformed

    private void btnMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMotoActionPerformed
        if(verificar == true) {
        Motos mJanela = new Motos();
        mJanela.setVisible(true);
        } else {
        JOptionPane.showMessageDialog(null, "Por favor faça o login primeiro");        
        }
    }//GEN-LAST:event_btnMotoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String usuario = txtUsuario.getText();
        String senha = txtSenha.getText();
        DB db = new DB("bancodados.db");
        String query = "SELECT usuario FROM pessoa WHERE usuario ='" + usuario + "'";
        db.query(query);
        if(db.next()) {
        JOptionPane.showMessageDialog(null, "O usuário já existe. Insira um novo usuário"); 
        } else { 
        query = "INSERT INTO pessoa (usuario, senha) ";
        query = query + "VALUES (";
        query = query + "'" + usuario + "',";
        query = query + "'" + senha + "'";
        query = query + ");";
        db.execQuery(query);
        db.closeConnection();
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String usuario = txtUsuario.getText();
        String senha = txtSenha.getText();
        DB db = new DB("bancodados.db");
        String query = "SELECT usuario FROM pessoa WHERE usuario='" + usuario + "'" + "AND senha='" + senha + "'";
        db.query(query);
        if(db.next()) {
        JOptionPane.showMessageDialog(null, "Login realizado");
        verificar = true;
        } else {
        JOptionPane.showMessageDialog(null, "O usuário não existe, por favor cadastre-se primeiro.");
        verificar = false;
        }
        db.closeConnection();
    }//GEN-LAST:event_btnLoginActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnMoto;
    private javax.swing.JButton btnPokemon;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
