/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ZULFA
 */



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.Timer;
public class Konsultasi extends javax.swing.JFrame {

    /**
     * Creates new form Konsultasi
     */
    
    ArrayList<String> hasil = new ArrayList<>();
    ArrayList<String> dataKerusakan = new ArrayList<>();
    ArrayList<String> kodeCiriKerusakan = new ArrayList<>();
    ArrayList<String> pertanyaanKonsultasi = new ArrayList<>();
    ArrayList<String> resultPertanyaanKonsultasi = new ArrayList<>();
    ArrayList<String> resultSolusiKerusakan = new ArrayList<>();
    ArrayList<String> resultCiriKodeKerusakan = new ArrayList<>();
    ArrayList<Integer> arrCurrentDate = new ArrayList<>();
    String akhir = null;
    Statement st;
    ResultSet rsp,rs = null;
    PreparedStatement pst;
    String nama = "";
    String resultFinalKodeKerusakan = "";
    Connection cn = database.kerusakandb.configDB();
    
    public Konsultasi() {
        initComponents();
        labelCurrentDate.setText(nama);
        txtNama.setEnabled(false);
        btnLanjut.setEnabled(false);
        btnBatal.setEnabled(false);
        btnTidak.setEnabled(false);
        btnYa.setEnabled(false);
        btnHasil.setEnabled(false);
        txtKodeCiriKerusakan.setEnabled(false);
        txtJawaban.setEnabled(false);
        txtPertanyaan.setEnabled(false);
        txtNomortlp.setEnabled(false);
        showDate();
        getCurrentTime();
        try{
        st = cn.createStatement();
        rsp = st.executeQuery("SELECT * FROM kerusakan");
        while(rsp.next()){
            String namaKerusakan = rsp.getString("nama_kerusakan");
            String solusiKerusakan = rsp.getString("solusi_kerusakan");
            dataKerusakan.add(namaKerusakan);
            resultSolusiKerusakan.add(solusiKerusakan);
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtKodeCiriKerusakan = new javax.swing.JTextField();
        txtNomortlp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPertanyaan = new javax.swing.JTextArea();
        txtJawaban = new javax.swing.JTextField();
        btnTidak = new javax.swing.JButton();
        btnYa = new javax.swing.JButton();
        btnMulai = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        btnHasil = new javax.swing.JButton();
        btnLanjut = new javax.swing.JButton();
        labelCurrentDate = new javax.swing.JLabel();
        labelCurrentTime = new javax.swing.JLabel();
        btnKembali = new javax.swing.JButton();
        txtNama = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(237, 235, 230));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 700, -1, -1));

        jPanel2.setBackground(new java.awt.Color(237, 235, 230));

        jLabel2.setBackground(new java.awt.Color(55, 58, 58));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(55, 58, 58));
        jLabel2.setText("Nomor tlp");

        jLabel3.setBackground(new java.awt.Color(55, 58, 58));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(55, 58, 58));
        jLabel3.setText("Kode");

        jLabel4.setBackground(new java.awt.Color(55, 58, 58));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(55, 58, 58));
        jLabel4.setText("Pertanyaan");

        jLabel5.setBackground(new java.awt.Color(55, 58, 58));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(55, 58, 58));
        jLabel5.setText("Jawaban");

        txtPertanyaan.setColumns(20);
        txtPertanyaan.setRows(5);
        jScrollPane1.setViewportView(txtPertanyaan);

        btnTidak.setBackground(new java.awt.Color(237, 235, 230));
        btnTidak.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTidak.setForeground(new java.awt.Color(55, 58, 58));
        btnTidak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        btnTidak.setText("Tidak");
        btnTidak.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTidak.setFocusable(false);
        btnTidak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTidakActionPerformed(evt);
            }
        });

        btnYa.setBackground(new java.awt.Color(237, 235, 230));
        btnYa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnYa.setForeground(new java.awt.Color(55, 58, 58));
        btnYa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/yes.png"))); // NOI18N
        btnYa.setText("Ya");
        btnYa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnYa.setFocusable(false);
        btnYa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYaActionPerformed(evt);
            }
        });

        btnMulai.setBackground(new java.awt.Color(237, 235, 230));
        btnMulai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMulai.setForeground(new java.awt.Color(55, 58, 58));
        btnMulai.setText("Mulai");
        btnMulai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMulai.setFocusable(false);
        btnMulai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMulaiActionPerformed(evt);
            }
        });

        btnBatal.setBackground(new java.awt.Color(237, 235, 230));
        btnBatal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBatal.setForeground(new java.awt.Color(55, 58, 58));
        btnBatal.setText("Batal");
        btnBatal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBatal.setFocusable(false);
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        btnHasil.setBackground(new java.awt.Color(237, 235, 230));
        btnHasil.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHasil.setForeground(new java.awt.Color(55, 58, 58));
        btnHasil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/report.png"))); // NOI18N
        btnHasil.setText("Hasil");
        btnHasil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHasil.setFocusable(false);
        btnHasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHasilActionPerformed(evt);
            }
        });

        btnLanjut.setBackground(new java.awt.Color(237, 235, 230));
        btnLanjut.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLanjut.setForeground(new java.awt.Color(55, 58, 58));
        btnLanjut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/next.png"))); // NOI18N
        btnLanjut.setText("Lanjut");
        btnLanjut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLanjut.setFocusable(false);
        btnLanjut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanjutActionPerformed(evt);
            }
        });

        labelCurrentDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCurrentDate.setForeground(new java.awt.Color(55, 58, 58));

        labelCurrentTime.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCurrentTime.setForeground(new java.awt.Color(55, 58, 58));

        btnKembali.setBackground(new java.awt.Color(237, 235, 230));
        btnKembali.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnKembali.setForeground(new java.awt.Color(55, 58, 58));
        btnKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/previous.png"))); // NOI18N
        btnKembali.setText("Kembali");
        btnKembali.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKembali.setFocusable(false);
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(55, 58, 58));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(55, 58, 58));
        jLabel6.setText("Nama");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelCurrentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelCurrentTime, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtJawaban, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTidak)
                                .addGap(18, 18, 18)
                                .addComponent(btnYa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLanjut))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnMulai, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBatal))
                            .addComponent(btnHasil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNomortlp, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtKodeCiriKerusakan, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(74, 74, 74))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCurrentDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCurrentTime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMulai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomortlp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKodeCiriKerusakan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel4)
                        .addGap(105, 105, 105)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtJawaban, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTidak, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnYa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLanjut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35)
                .addComponent(btnHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 510, 700));

        jPanel3.setBackground(new java.awt.Color(237, 235, 230));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Interview.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel1)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
        public void awalPertanyaan(){
        try{
         rs.first();
         txtKodeCiriKerusakan.setText(rs.getString(2));
         txtPertanyaan.setText( "Apakah " + rs.getString(3) + " ?");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
        
        
        public void lanjutPertanyaan(){
        try{
         rs.next();
         txtKodeCiriKerusakan.setText(rs.getString(2));
         txtPertanyaan.setText("Apakah " + rs.getString(3) + " ?");
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
        }
    }
        
    public void akhirPertanyaan(){
        try{
         rs.last();
         akhir = rs.getString(2);
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
        }
    }     
    
  
    
    public void showDate(){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatDay = new SimpleDateFormat("EEEE", new Locale("in","ID"));
        String Hari = formatDay.format(calendar.getTime());
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy" ,new Locale("id","ID"));
        String dateNow = dateFormat.format(new Date());
       labelCurrentDate.setText(Hari +" ,"+ dateNow);
    }
    
    public void getCurrentTime(){
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss", new Locale("id", "ID"));
        Timer timer = new Timer(1000, new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
        String nowTime = timeFormat.format(new Date());
        labelCurrentTime.setText(nowTime);
    }
    });
        timer.start();
    }
    
    
   
    
    
    private void btnMulaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMulaiActionPerformed
        // TODO add your handling code here:
        txtKodeCiriKerusakan.setText("");
        txtPertanyaan.setText("");
        txtJawaban.setText("");
        btnLanjut.setEnabled(true);
        btnYa.setEnabled(true);
        btnTidak.setEnabled(true);
        btnBatal.setEnabled(true);
        btnHasil.setEnabled(true);
        txtKodeCiriKerusakan.setEnabled(true);
        txtNomortlp.setEnabled(true);
        txtJawaban.setEnabled(true);
        txtPertanyaan.setEnabled(true);
        txtKodeCiriKerusakan.setEditable(false);
        txtPertanyaan.setEditable(false);
        txtJawaban.setEditable(false);
        txtNama.setEnabled(true);
        akhirPertanyaan();
        awalPertanyaan();
    }//GEN-LAST:event_btnMulaiActionPerformed

    private void btnYaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYaActionPerformed
        // TODO add your handling code here:
        txtJawaban.setText("ya");
    }//GEN-LAST:event_btnYaActionPerformed

    private void btnTidakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTidakActionPerformed
        // TODO add your handling code here:
        txtJawaban.setText("tidak");
    }//GEN-LAST:event_btnTidakActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
          try{
            st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = st.executeQuery("SELECT * FROM gejala_kerusakan");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnHasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHasilActionPerformed
        // TODO add your handling code here:
            String nomorTlpnUsers = txtNomortlp.getText().trim();
        try {
            String resultDiagnosa;
            String namaUser;
            String solusiKerusakan;
            if(txtNomortlp.getText().equals("")|| txtNomortlp.getText().equals("")){
                 JOptionPane.showMessageDialog(null, "Data harus di isi lengkap");
            }else if (kodeCiriKerusakan.isEmpty()) {
                 JOptionPane.showMessageDialog(null, "Anda Belum menjawab pertanyaan satupun");
            }else if(kodeCiriKerusakan.contains("GK001") && kodeCiriKerusakan.contains("GK002")){
                resultDiagnosa = "Kemungkinan Vespa anda Mengalami kerusakan '" + dataKerusakan.get(0) + "'";
                solusiKerusakan = "Solusi yang tepat untuk mencegah kerusakan'" + dataKerusakan.get(0) + "'  '" + resultSolusiKerusakan.get(0) + "' ";
                String imgPath = "src\\images\\busi.png";
                namaUser = txtNama.getText();
                showResultDiagnosa(namaUser , nomorTlpnUsers ,resultDiagnosa,solusiKerusakan,imgPath);
            }else if (kodeCiriKerusakan.contains("GK003") && kodeCiriKerusakan.contains("GK004") && kodeCiriKerusakan.contains("GK005")){
                resultDiagnosa = "Kemungkinan Vespa anda Mengalami kerusakan '" + dataKerusakan.get(1) + "'";
                solusiKerusakan = "Solusi yang tepat untuk mencegah kerusakan '" + dataKerusakan.get(1) + "' \n'" +resultSolusiKerusakan.get(1)+ "' ";
                String imgPath = "src\\images\\seal_krukas.png";
                namaUser = txtNama.getText();
                showResultDiagnosa(namaUser, nomorTlpnUsers , resultDiagnosa,solusiKerusakan,imgPath);
            }else if (kodeCiriKerusakan.contains("GK006") && kodeCiriKerusakan.contains("GK007") && kodeCiriKerusakan.contains("GK008")){
                resultDiagnosa = "Kemungkinan Vespa anda Mengalami kerusakan '" + dataKerusakan.get(2) + "'";
                solusiKerusakan = "Solusi yang tepat untuk mencegah kerusakan '" + dataKerusakan.get(2) + "' \n'" +resultSolusiKerusakan.get(2)+ "' ";
                String imgPath = "src\\images\\kampas_kopling.png";
                namaUser = txtNama.getText();
                showResultDiagnosa(namaUser, nomorTlpnUsers , resultDiagnosa,solusiKerusakan,imgPath);
            }else if (kodeCiriKerusakan.contains("GK009") && kodeCiriKerusakan.contains("GK010")){
                resultDiagnosa = "Kemungkinan Vespa anda Mengalami kerusakan '" + dataKerusakan.get(3) + "'";
                solusiKerusakan = "Solusi yang tepat untuk mencegah kerusakan '" + dataKerusakan.get(3) + "' \n'" +resultSolusiKerusakan.get(3)+ "' ";
                String imgPath = "src\\images\\seal_krukas.png";
                namaUser = txtNama.getText();
                showResultDiagnosa(namaUser, nomorTlpnUsers , resultDiagnosa,solusiKerusakan,imgPath);
            }else if (kodeCiriKerusakan.contains("GK011") && kodeCiriKerusakan.contains("GK012") && kodeCiriKerusakan.contains("GK013") && kodeCiriKerusakan.contains("GK014")){
                resultDiagnosa = "Kemungkinan Vespa anda Mengalami kerusakan '" + dataKerusakan.get(4) + "'";
                solusiKerusakan = "Solusi yang tepat untuk mencegah kerusakan '" + dataKerusakan.get(4) + "' \n'" +resultSolusiKerusakan.get(4)+ "' ";
                String imgPath = "src\\images\\karburator.png";
                namaUser = txtNama.getText();
                showResultDiagnosa(namaUser, nomorTlpnUsers , resultDiagnosa,solusiKerusakan,imgPath);
            }
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnHasilActionPerformed

    
    private void btnLanjutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanjutActionPerformed
        // TODO add your handling code here:
        try {
            if(txtKodeCiriKerusakan.getText().equalsIgnoreCase(akhir)){
                if(txtJawaban.getText().equalsIgnoreCase("ya")){
                    pertanyaanKonsultasi.add(txtPertanyaan.getText());
                }
                kodeCiriKerusakan.add(rs.getString(2));
                JOptionPane.showMessageDialog(null, "pertanyaan Selesai !! Silahkan tekan tombol DIAGNOSA");
            }else{
                if (txtJawaban.getText().equalsIgnoreCase("ya")) {
                    pertanyaanKonsultasi.add(txtPertanyaan.getText());
                    kodeCiriKerusakan.add(rs.getString(2));
                }
                txtJawaban.setText("");
                lanjutPertanyaan();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnLanjutActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
          if(!kodeCiriKerusakan.isEmpty() || !pertanyaanKonsultasi.isEmpty()){
            kodeCiriKerusakan.clear();
            pertanyaanKonsultasi.clear();
        }
        txtPertanyaan.setText("");
        txtKodeCiriKerusakan.setText("");
        txtNomortlp.setText("");
        txtNama.setEnabled(false);
        txtNomortlp.setEnabled(false);
        btnHasil.setEnabled(false);
        btnLanjut.setEnabled(false);
        btnBatal.setEnabled(false);
        btnTidak.setEnabled(false);
        btnYa.setEnabled(false);
        txtKodeCiriKerusakan.setEnabled(false);
        txtJawaban.setEnabled(false);
        txtPertanyaan.setEnabled(false);
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        // TODO add your handling code here:
        new MenuUtama().show();
        this.dispose();
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void insertHasilDiagnosa(String namaUser, String nomorTlpnUser , String gejala, String diagnosaKerusakan, String solusiKerusakan ){
        try {
            pst = cn.prepareStatement("INSERT INTO hasil_diagnosa(nama ,nomor_telepon ,gejala_kerusakan,diagnosa_kerusakan,solusi_kerusakan) VALUES (?,?,?,?,?)");
                pst.setString(1, namaUser);
                pst.setString(2, nomorTlpnUser);
                pst.setString(3, gejala);
                pst.setString(4, diagnosaKerusakan);
                pst.setString(5, solusiKerusakan);
                pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void insertRekapDiagnosa(String namaUser, String nomorTlpnUser , String gejala, String diagnosaKerusakan, String solusiKerusakan ){
        try {
            pst = cn.prepareStatement("INSERT INTO rekap_diagnosa(nama,nomor_telepon ,gejala_kerusakan,diagnosa_kerusakan,solusi_kerusakan)  VALUES (?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, namaUser);
            pst.setString(2, nomorTlpnUser);
            pst.setString(3, gejala);
            pst.setString(4, diagnosaKerusakan);
            pst.setString(5, solusiKerusakan);
            pst.executeUpdate();
            ResultSet tableId = pst.getGeneratedKeys();
            tableId.next();
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
    }

    
    public void showResultDiagnosa(String namaUser,String nomorTlpnUser, String resultDiagnosa,String solusi, String imgParts ){
        
        for(String items : pertanyaanKonsultasi){
            resultPertanyaanKonsultasi.add(items+"\n");
        }
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < resultPertanyaanKonsultasi.size(); i++) {
            output.append(resultPertanyaanKonsultasi.get(i));
        }
        String editPertanyaanKonsultasi = output.toString();
        
        String resultGejala = editPertanyaanKonsultasi.replace("Apakah", "").replace("?", "");
        
        insertRekapDiagnosa(namaUser, nomorTlpnUser, resultGejala,resultDiagnosa, solusi);
        insertHasilDiagnosa(namaUser, nomorTlpnUser, resultGejala,resultDiagnosa, solusi);
        HasilDiagnosa hasil = new HasilDiagnosa(namaUser , nomorTlpnUser , resultGejala , resultDiagnosa,solusi,imgParts, editPertanyaanKonsultasi);
        hasil.setVisible(true);
        this.dispose();
    }
    
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
            java.util.logging.Logger.getLogger(Konsultasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Konsultasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Konsultasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Konsultasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Konsultasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnHasil;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnLanjut;
    private javax.swing.JButton btnMulai;
    private javax.swing.JButton btnTidak;
    private javax.swing.JButton btnYa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCurrentDate;
    private javax.swing.JLabel labelCurrentTime;
    private javax.swing.JTextField txtJawaban;
    private javax.swing.JTextField txtKodeCiriKerusakan;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNomortlp;
    private javax.swing.JTextArea txtPertanyaan;
    // End of variables declaration//GEN-END:variables
}
