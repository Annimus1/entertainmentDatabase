package dev.pablo.view;

import dev.pablo.model.Movie;
import dev.pablo.services.MovieService;
import java.awt.Color;
import java.time.LocalDate;
/**
 *
 * @author pablo
 */
public class VAddMovie extends javax.swing.JDialog {

    MovieService movieService;
    int id;
    VPrincipal parent;
    
    public VAddMovie(VPrincipal parent, boolean modal) {
        super(parent, modal);
        this.parent = parent;
        this.movieService = new MovieService();
        initComponents();
        
    }
    
    public VAddMovie(java.awt.Frame parent, boolean modal, Movie m) {
        super(parent, modal);
        initComponents();
        this.movieService = new MovieService();
        this.id = m.getId();
        this.nameImp.setText(m.getName());
        this.languageInp.setSelectedItem(m.getLanguage());
        this.typeInp.setSelectedItem(m.getType());
        this.watchDateInp.setText(m.getWatchDate().toString());
        this.rateInp.setText(String.valueOf(m.getRate()));
        this.noteInp.setText(m.getNote());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        popupMenu1 = new java.awt.PopupMenu();
        frame = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameImp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        watchDateInp = new javax.swing.JTextField();
        rateInp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        noteInp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        languageInp = new javax.swing.JComboBox<>();
        typeInp = new javax.swing.JComboBox<>();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        frame.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                frameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                frameKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("JetBrains Mono", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Activity");

        jLabel2.setFont(new java.awt.Font("BitstromWera Nerd Font", 0, 18)); // NOI18N
        jLabel2.setText("Name");

        nameImp.setFont(new java.awt.Font("BitstromWera Nerd Font", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("BitstromWera Nerd Font", 0, 18)); // NOI18N
        jLabel3.setText("Language");

        jLabel4.setFont(new java.awt.Font("BitstromWera Nerd Font", 0, 18)); // NOI18N
        jLabel4.setText("Type");

        jLabel5.setFont(new java.awt.Font("BitstromWera Nerd Font", 0, 18)); // NOI18N
        jLabel5.setText("Watch Date");

        watchDateInp.setFont(new java.awt.Font("BitstromWera Nerd Font", 0, 18)); // NOI18N
        watchDateInp.setForeground(new java.awt.Color(204, 204, 204));
        watchDateInp.setText("YYYY-MM-DD");
        watchDateInp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                watchDateInpFocusLost(evt);
            }
        });

        rateInp.setFont(new java.awt.Font("BitstromWera Nerd Font", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("BitstromWera Nerd Font", 0, 18)); // NOI18N
        jLabel6.setText("Rate");

        noteInp.setFont(new java.awt.Font("BitstromWera Nerd Font", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("BitstromWera Nerd Font", 0, 18)); // NOI18N
        jLabel7.setText("Note");

        saveBtn.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        cancelBtn.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        languageInp.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        languageInp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "English","Spanish", "Sub-Spanish" }));
        languageInp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                languageInpActionPerformed(evt);
            }
        });

        typeInp.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        typeInp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Movie", "Serie", "Anime", "Videogame", "Book"}));

        javax.swing.GroupLayout frameLayout = new javax.swing.GroupLayout(frame);
        frame.setLayout(frameLayout);
        frameLayout.setHorizontalGroup(
            frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(noteInp, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(frameLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addComponent(watchDateInp, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(frameLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rateInp, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameLayout.createSequentialGroup()
                        .addGroup(frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameImp)
                            .addComponent(languageInp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(typeInp, 0, 166, Short.MAX_VALUE))))
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(cancelBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveBtn)
                .addGap(58, 58, 58))
            .addGroup(frameLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        frameLayout.setVerticalGroup(
            frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameImp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(languageInp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(typeInp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(watchDateInp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rateInp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(noteInp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(cancelBtn))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(frame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void languageInpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_languageInpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_languageInpActionPerformed

    private void frameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_frameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_frameKeyReleased

    private void frameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_frameKeyTyped
    }//GEN-LAST:event_frameKeyTyped

    private void watchDateInpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_watchDateInpFocusLost
        // TODO add your handling code here:
//        cuando el foco se pierda
        if(watchDateInp.getText().equals("")){
            System.out.println(watchDateInp.getBackground().getRGB());
            System.out.println(watchDateInp.getForeground().getRGB());
            watchDateInp.setText("YYYY-MM-DD");
            watchDateInp.setForeground(Color.gray);
        }else{
            validateDate();
        }
// si esta lleno, verificar la fecha y cambia color a negro
    }//GEN-LAST:event_watchDateInpFocusLost

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        
        // if validation is ok
        if(validateSave()){
           
            if(this.id > 0){
                Movie m = new Movie(
                   this.id,
                   nameImp.getText(), 
                   Float.parseFloat(rateInp.getText()), 
                   languageInp.getSelectedItem().toString(), 
                   noteInp.getText(), 
                   typeInp.getSelectedItem().toString(), 
                   getDate(watchDateInp.getText()) 
                );
                
                this.movieService.save(m);
            }
            else{
                Movie m = new Movie(
                   nameImp.getText(), 
                   Float.parseFloat(rateInp.getText()), 
                   languageInp.getSelectedItem().toString(), 
                   noteInp.getText(), 
                   typeInp.getSelectedItem().toString(), 
                   getDate(watchDateInp.getText()) 
                );
            
                this.movieService.save(m);
            }
           
           // exit pop-up
           this.dispose();           
        }
    }//GEN-LAST:event_saveBtnActionPerformed
    
    
    private boolean validateSave(){
        int[] bg = {70, 73, 75};
        int[] fg = {167, 167, 167};
        
        
        nameImp.setBackground(new Color(bg[0],bg[1], bg[2]));
        nameImp.setForeground(new Color(fg[0], fg[1], fg[2]));
                
        rateInp.setBackground(new Color(bg[0],bg[1], bg[2]));
        rateInp.setForeground(new Color(fg[0], fg[1], fg[2]));
                
        watchDateInp.setBackground(new Color(bg[0],bg[1], bg[2]));
        watchDateInp.setForeground(new Color(fg[0], fg[1], fg[2]));
        
        
        
        if(nameImp.getText().isBlank()){
            nameImp.setBackground(Color.red);
            nameImp.setForeground(Color.black);
            return false;
        }
        
        if(rateInp.getText().isBlank()){
            rateInp.setBackground(Color.red);
            rateInp.setForeground(Color.black);
            return false;
        }
        
        try{
            Float.parseFloat(rateInp.getText());
        }catch(Exception e){
            rateInp.setBackground(Color.red);
            rateInp.setForeground(Color.black);
            return false;
        }
        
        if(
                watchDateInp.getText().isBlank() || 
                watchDateInp.getText().equals( "YYYY-MM-DD" ) ||
                watchDateInp.getText().equals("Invalid Format")
            ){
            watchDateInp.setBackground(Color.red);
            watchDateInp.setForeground(Color.black);
            return false;
        }
        return true;
    }
    
    private LocalDate getDate(String dateString){
        int year, month, day;
        String splitedDate[] = dateString.split("-");
        
        year = Integer.parseInt(splitedDate[0]);
        month = Integer.parseInt(splitedDate[1]);
        day = Integer.parseInt(splitedDate[2]);
        
        
        return LocalDate.of(year, month, day);
    }
    
    private void validateDate(){
        int[] bg = {70, 73, 75};
        int[] fg = {167, 167, 167};
        try{
            var splitedStr = watchDateInp.getText().split("-");
            
            if(splitedStr.length == 3){
                
                for( String i: splitedStr){
                    Integer.parseInt(i);
                }
                
                if( splitedStr[0].length() != 4 || 
                        splitedStr[1].length() != 2 || 
                        splitedStr[2].length() != 2 
                   ){
                    throw new Exception("");
                }
                
                watchDateInp.setBackground(new Color(bg[0],bg[1], bg[2]));
                watchDateInp.setForeground(new Color(fg[0], fg[1], fg[2]));
            }else{
                throw new Exception("");
            }
        }
        catch( Exception e){
            watchDateInp.setText("Invalid Format");
            watchDateInp.setBackground(Color.red);
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JPanel frame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JComboBox<String> languageInp;
    private javax.swing.JTextField nameImp;
    private javax.swing.JTextField noteInp;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JTextField rateInp;
    private javax.swing.JButton saveBtn;
    private javax.swing.JComboBox<String> typeInp;
    private javax.swing.JTextField watchDateInp;
    // End of variables declaration//GEN-END:variables
}
