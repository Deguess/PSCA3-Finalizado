package projetoa3;

public class MotoCad extends javax.swing.JFrame {
    private Motos mJanela;
    private int codigo;
    
    public MotoCad(Motos mJanela, int codigo) {
        initComponents();
        this.mJanela = mJanela;
        this.codigo = codigo;
        if(codigo != -1) {
            this.setTitle("Editar");
            DB db = new DB("bancodados.db");
            db.query("SELECT * FROM motos WHERE codigo="+codigo);
            if(db.next()) {
                String modelo = db.getString("modelo");
                String cor = db.getString("cor");
                String ano = db.getString("ano");
                String preco = db.getString("preco");
                txtModelo.setText(modelo);
                txtCor.setText(cor);
                txtAno.setText(ano);
                txtPreco.setText(preco);
            }
            db.closeConnection();        
        } else {
            this.setTitle("Adicionar Moto");
        }         
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        txtCor = new javax.swing.JTextField();
        txtAno = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Modelo:");

        jLabel2.setText("Cor:");

        jLabel3.setText("Ano:");

        jLabel4.setText("Preço:");

        btnAdd.setText("Adicionar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtModelo)
                    .addComponent(txtCor)
                    .addComponent(txtAno)
                    .addComponent(txtPreco, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String modelo = txtModelo.getText();
        String cor = txtCor.getText();
        String ano = txtAno.getText();
        String preco = txtPreco.getText();
        DB db = new DB("bancodados.db");
        String query = "";
        if(codigo == -1) {
        query = "INSERT INTO motos (modelo, cor, ano, preco) ";
        query = query + "VALUES (";
        query = query + "'" + modelo + "',";
        query = query + "'" + cor + "',";
        query = query + "'" + ano + "',";
        query = query + "'" + preco + "'";
        query = query + ");";
        
        } else {
            query = "UPDATE motos SET ";
            query = query + "modelo='" + modelo + "', ";
            query = query + "cor='" + cor + "', ";
            query = query + "ano='" + ano + "', ";
            query = query + "preco='" + preco + "'";
            query = query + " WHERE codigo="+this.codigo;             
        
        }
        db.execQuery(query);
        mJanela.refreshTable();
        this.dispose();        
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
