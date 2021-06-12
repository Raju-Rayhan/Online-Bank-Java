
package onlinebank;

import com.sun.glass.events.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class HomePage extends javax.swing.JFrame {

    String login_acn,login_pass,mobile_no,email;
    int RD_balance,RW_balance,CR_balance,TR_balance,change_bal;
    public HomePage() {
        initComponents();
        
        
    }
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        prifilePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        profileLbl = new javax.swing.JLabel();
        transferBtn = new javax.swing.JButton();
        withdrawBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        acnLbl = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        emailLbl = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        mobileLbl = new javax.swing.JLabel();
        depositButton = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        statusBarPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        currentBalLbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        rcntDepLbl = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rcntWtdLbl = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        rcnttfLbl = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        withdrawPanel = new javax.swing.JPanel();
        Panel = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        wtPass = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        witdrawNextPanel = new javax.swing.JPanel();
        wtAmmount = new javax.swing.JTextField();
        withfrawBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        tansferPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        transferAcNo = new javax.swing.JTextField();
        transferAmnt = new javax.swing.JTextField();
        transfBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        depositPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        depositAmt = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        depositBtn = new javax.swing.JButton();
        depositPass = new javax.swing.JPasswordField();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1365, 720));
        setMinimumSize(new java.awt.Dimension(1365, 720));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        prifilePanel.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hello! ");

        profileLbl.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        profileLbl.setForeground(new java.awt.Color(255, 255, 255));

        transferBtn.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        transferBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinebank/Image/rsz_money-transfer_1.png"))); // NOI18N
        transferBtn.setText("  Transfer");
        transferBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferBtnActionPerformed(evt);
            }
        });

        withdrawBtn.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        withdrawBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinebank/Image/rsz_1atm.png"))); // NOI18N
        withdrawBtn.setText(" Withdraw");
        withdrawBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawBtnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("A/C No:");

        acnLbl.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        acnLbl.setForeground(new java.awt.Color(255, 255, 255));
        acnLbl.setText("201902053");

        jSeparator4.setForeground(new java.awt.Color(204, 204, 204));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Email:");

        emailLbl.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        emailLbl.setForeground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Mobile No:");

        mobileLbl.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        mobileLbl.setForeground(new java.awt.Color(255, 255, 255));

        depositButton.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        depositButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinebank/Image/rsz_1deposit.png"))); // NOI18N
        depositButton.setText(" Deposit");
        depositButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositButtonActionPerformed(evt);
            }
        });

        logoutBtn.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        logoutBtn.setText("Log Out");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Welcome to Online Bank");

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinebank/Image/rsz_1bank.png"))); // NOI18N

        jLabel23.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText(" Online Bank");

        javax.swing.GroupLayout prifilePanelLayout = new javax.swing.GroupLayout(prifilePanel);
        prifilePanel.setLayout(prifilePanelLayout);
        prifilePanelLayout.setHorizontalGroup(
            prifilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, prifilePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(prifilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(prifilePanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(prifilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(prifilePanelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(prifilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(withdrawBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(transferBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(depositButton, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
            .addGroup(prifilePanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(prifilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(prifilePanelLayout.createSequentialGroup()
                        .addGroup(prifilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(prifilePanelLayout.createSequentialGroup()
                                .addGroup(prifilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel15))
                                .addGap(25, 25, 25)
                                .addGroup(prifilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mobileLbl)
                                    .addComponent(emailLbl)
                                    .addComponent(acnLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(profileLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        prifilePanelLayout.setVerticalGroup(
            prifilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(prifilePanelLayout.createSequentialGroup()
                .addGroup(prifilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addGroup(prifilePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(prifilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profileLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(prifilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(acnLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(prifilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(mobileLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(prifilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(emailLbl))
                .addGap(150, 150, 150)
                .addComponent(depositButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(transferBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(withdrawBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        getContentPane().add(prifilePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 720));

        statusBarPanel.setBackground(new java.awt.Color(102, 153, 255));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Current Balance:");

        currentBalLbl.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        currentBalLbl.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Recent Deposit:");

        rcntDepLbl.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        rcntDepLbl.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Recent Withdraw:");

        rcntWtdLbl.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        rcntWtdLbl.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("$");

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("$");

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("$");

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Recent Transfer:");

        rcnttfLbl.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        rcnttfLbl.setForeground(new java.awt.Color(255, 255, 255));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("$");

        javax.swing.GroupLayout statusBarPanelLayout = new javax.swing.GroupLayout(statusBarPanel);
        statusBarPanel.setLayout(statusBarPanelLayout);
        statusBarPanelLayout.setHorizontalGroup(
            statusBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusBarPanelLayout.createSequentialGroup()
                .addGroup(statusBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(statusBarPanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2))
                    .addGroup(statusBarPanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(currentBalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(statusBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(statusBarPanelLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rcntDepLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(statusBarPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(statusBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(statusBarPanelLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rcntWtdLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statusBarPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel6)
                        .addGap(76, 76, 76)))
                .addGroup(statusBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statusBarPanelLayout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rcnttfLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(44, 44, 44))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        statusBarPanelLayout.setVerticalGroup(
            statusBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusBarPanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(statusBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(statusBarPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(29, 29, 29)
                        .addGroup(statusBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rcntDepLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(statusBarPanelLayout.createSequentialGroup()
                        .addGroup(statusBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel6))
                        .addGap(16, 16, 16)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(statusBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(statusBarPanelLayout.createSequentialGroup()
                                .addGroup(statusBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(currentBalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(statusBarPanelLayout.createSequentialGroup()
                                .addGroup(statusBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rcnttfLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(statusBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rcntWtdLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );

        getContentPane().add(statusBarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 920, 160));

        jPanel6.setBackground(new java.awt.Color(102, 153, 255));
        jPanel6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPanel6KeyTyped(evt);
            }
        });

        wtPass.setText("jPasswordField1");
        wtPass.setMargin(new java.awt.Insets(2, 15, 2, 2));
        wtPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wtPassMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                wtPassMouseExited(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinebank/Image/rsz_padlock (1).png"))); // NOI18N

        witdrawNextPanel.setBackground(new java.awt.Color(102, 153, 255));

        wtAmmount.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        wtAmmount.setText("Enter ammount");
        wtAmmount.setMargin(new java.awt.Insets(2, 15, 2, 2));
        wtAmmount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                wtAmmountMouseEntered(evt);
            }
        });
        wtAmmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wtAmmountActionPerformed(evt);
            }
        });
        wtAmmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                wtAmmountKeyTyped(evt);
            }
        });

        withfrawBtn.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        withfrawBtn.setText("Withdraw");
        withfrawBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withfrawBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout witdrawNextPanelLayout = new javax.swing.GroupLayout(witdrawNextPanel);
        witdrawNextPanel.setLayout(witdrawNextPanelLayout);
        witdrawNextPanelLayout.setHorizontalGroup(
            witdrawNextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(witdrawNextPanelLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(witdrawNextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, witdrawNextPanelLayout.createSequentialGroup()
                        .addComponent(wtAmmount, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, witdrawNextPanelLayout.createSequentialGroup()
                        .addComponent(withfrawBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157))))
        );
        witdrawNextPanelLayout.setVerticalGroup(
            witdrawNextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(witdrawNextPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(wtAmmount, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(withfrawBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );

        nextBtn.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        nextBtn.setText("Next");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(witdrawNextPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(wtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(407, 407, 407)
                        .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(wtPass)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(witdrawNextPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 255));
        jLabel10.setText("Withdraw:");

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(413, 413, 413)
                .addComponent(jLabel10)
                .addContainerGap(2219, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(26, 26, 26)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout withdrawPanelLayout = new javax.swing.GroupLayout(withdrawPanel);
        withdrawPanel.setLayout(withdrawPanelLayout);
        withdrawPanelLayout.setHorizontalGroup(
            withdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withdrawPanelLayout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        withdrawPanelLayout.setVerticalGroup(
            withdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withdrawPanelLayout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(withdrawPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 920, 560));

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));

        transferAcNo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        transferAcNo.setText("Enter transfer account number");
        transferAcNo.setMargin(new java.awt.Insets(2, 15, 2, 2));
        transferAcNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transferAcNoMouseClicked(evt);
            }
        });
        transferAcNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                transferAcNoKeyTyped(evt);
            }
        });

        transferAmnt.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        transferAmnt.setText("Enter transfer ammount");
        transferAmnt.setMargin(new java.awt.Insets(2, 15, 2, 2));
        transferAmnt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transferAmntMouseClicked(evt);
            }
        });
        transferAmnt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                transferAmntKeyTyped(evt);
            }
        });

        transfBtn.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        transfBtn.setText("Transfer");
        transfBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfBtnActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinebank/Image/rsz_1accounting.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinebank/Image/rsz_1dollar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(transferAcNo)
                    .addComponent(transferAmnt, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE))
                .addContainerGap(231, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(transfBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(303, 303, 303))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transferAcNo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transferAmnt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addComponent(transfBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText("Transfer:");

        javax.swing.GroupLayout tansferPanelLayout = new javax.swing.GroupLayout(tansferPanel);
        tansferPanel.setLayout(tansferPanelLayout);
        tansferPanelLayout.setHorizontalGroup(
            tansferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(tansferPanelLayout.createSequentialGroup()
                .addGap(412, 412, 412)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tansferPanelLayout.setVerticalGroup(
            tansferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tansferPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(tansferPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 920, 560));

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        depositAmt.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        depositAmt.setText("Enter ammount");
        depositAmt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                depositAmtMouseClicked(evt);
            }
        });

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinebank/Image/rsz_1dollar.png"))); // NOI18N

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinebank/Image/rsz_padlock (1).png"))); // NOI18N

        depositBtn.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        depositBtn.setText("Deposit");
        depositBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositBtnActionPerformed(evt);
            }
        });

        depositPass.setText("jPasswordField1");
        depositPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                depositPassMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                depositPassMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(362, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(depositAmt, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                            .addComponent(depositPass))
                        .addGap(174, 174, 174))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(depositBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(268, 268, 268))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(depositAmt)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(depositPass))
                .addGap(42, 42, 42)
                .addComponent(depositBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 102, 255));
        jLabel19.setText("Deposit");

        javax.swing.GroupLayout depositPanelLayout = new javax.swing.GroupLayout(depositPanel);
        depositPanel.setLayout(depositPanelLayout);
        depositPanelLayout.setHorizontalGroup(
            depositPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(depositPanelLayout.createSequentialGroup()
                .addGap(389, 389, 389)
                .addComponent(jLabel19)
                .addContainerGap(441, Short.MAX_VALUE))
        );
        depositPanelLayout.setVerticalGroup(
            depositPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, depositPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(depositPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 920, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void getAccountNumber(String acn){
        login_acn = acn;
    }
    public void getPassword(String pass){
        login_pass = pass;
    }
    
    private void transferBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferBtnActionPerformed
        withdrawPanel.hide();
        depositPanel.hide();
        tansferPanel.show();
    }//GEN-LAST:event_transferBtnActionPerformed

    private void withdrawBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawBtnActionPerformed
        depositPanel.hide();
        tansferPanel.hide();
        withdrawPanel.show();
    }//GEN-LAST:event_withdrawBtnActionPerformed
    
    //Withdraw pass checking and next
    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed

        if(wtPass.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Enter the Account Password!");
        }
        else if(!wtPass.getText().equals(login_pass)){
            JOptionPane.showMessageDialog(this, "Incorrect Password! ");
        }
        else{
            witdrawNextPanel.hide();
            witdrawNextPanel.show();

        }
    }//GEN-LAST:event_nextBtnActionPerformed
    
    //Show all dtails when home page load
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        tansferPanel.hide();
        withdrawPanel.hide();
        witdrawNextPanel.hide();
        depositPanel.hide();
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=User;user=sa;password=sa";
            Connection con = DriverManager.getConnection(url);
            String sql="Select * from UserTable where AC_Number=? and Password=?";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            pst.setString(1, login_acn);
            pst.setString(2, login_pass);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                String profile_name = rs.getString("User_Name");
                CR_balance = rs.getInt("CR_Balance");
                RD_balance = rs.getInt("RD_Balance");
                RW_balance = rs.getInt("RW_Balance");
                TR_balance = rs.getInt("TR_Balance");
                mobile_no = rs.getString("Mobile_No");
                email = rs.getString("Email_Address");
                
                profileLbl.setText(profile_name);
                mobileLbl.setText(mobile_no);
                emailLbl.setText(email);
                acnLbl.setText(login_acn);
                
                String cr_bal = String.valueOf(CR_balance);
                String rd_bal = String.valueOf(RD_balance);
                String rw_bal = String.valueOf(RW_balance);
                String tr_bal = String.valueOf(TR_balance);
                currentBalLbl.setText(cr_bal);
                rcntDepLbl.setText(rd_bal);
                rcnttfLbl.setText(tr_bal);
                rcntWtdLbl.setText(rw_bal);
            }
        }
        catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_formWindowOpened
    
    
    public void Reload(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=User;user=sa;password=sa";
            Connection con = DriverManager.getConnection(url);
            String sql="Select * from UserTable where AC_Number=? and Password=?";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            pst.setString(1, login_acn);
            pst.setString(2, login_pass);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                int crbalance = rs.getInt("CR_Balance");
                int rdbalance = rs.getInt("RD_Balance");
                int rwbalance = rs.getInt("RW_Balance");
                int trbalance = rs.getInt("TR_Balance");
                
                String cr_bal = String.valueOf(crbalance);
                String rd_bal = String.valueOf(rdbalance);
                String rw_bal = String.valueOf(rwbalance);
                String tr_bal = String.valueOf(trbalance);
                currentBalLbl.setText(cr_bal);
                rcntDepLbl.setText(rd_bal);
                rcntWtdLbl.setText(rw_bal);
                rcnttfLbl.setText(tr_bal);
            }
        }
        catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
        }
    }
    
    
    private void transfBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfBtnActionPerformed
        
        if(transferAcNo.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Enter Transfer Account Number!");
        }
        else if(transferAmnt.getText().equals("0") ){
            JOptionPane.showMessageDialog(this, "Transfer Ammount Can't be Zero!");
        }
        else if(transferAmnt.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Enter then Transfer Ammount!");
        }
        
        String target_acn;
        int amt = Integer.parseInt(transferAmnt.getText());
        int new_bal = CR_balance - amt;
        change_bal = CR_balance - amt;
        
        
       
        if((CR_balance-amt) <= 0){
            JOptionPane.showMessageDialog(this, "Insufficient Balance!");
        }
        else if(transferAcNo.getText().equals(login_acn)){
            JOptionPane.showMessageDialog(this, "Transfer Account Invalid!");
        }
        else{
            try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=User;user=sa;password=sa";
            Connection con = DriverManager.getConnection(url);
            String sql="Select * from UserTable where AC_Number=?";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            pst.setString(1, transferAcNo.getText());
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                target_acn = transferAcNo.getText();
                int new_amt = amt + rs.getInt("CR_Balance");
                String tr_name = rs.getString("User_Name");
                Transfer(target_acn,new_amt, amt,tr_name);
            }
            else{
                JOptionPane.showMessageDialog(this,"Transfer Account Not Found!");
            }
            
            }  
            catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
        
    }//GEN-LAST:event_transfBtnActionPerformed
    
    private void Transfer(String acn_no,int ammount, int rc_amt,String tr_name){
        try{
            CR_balance = change_bal;
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String url = "jdbc:sqlserver://localhost:1433;databaseName=User;user=sa;password=sa";
                Connection con = DriverManager.getConnection(url);
                String sql="UPDATE UserTable SET CR_Balance=? where AC_Number="+acn_no;
                PreparedStatement pst;
                pst = con.prepareStatement(sql);
                pst.setInt(1, ammount);
                pst.executeQuery(); 
                
            }
            catch(Exception e){
                    JOptionPane.showMessageDialog(this, "Transfer Successful to, "+tr_name);
                    
                    RecentTransfer(rc_amt);
                    Reload();
            }
    }
    
    
    private void RecentTransfer(int ammount){
        try{
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String url = "jdbc:sqlserver://localhost:1433;databaseName=User;user=sa;password=sa";
                Connection con = DriverManager.getConnection(url);
                String sql="UPDATE UserTable SET CR_Balance=?,TR_Balance=? where AC_Number="+login_acn;
                PreparedStatement pst;
                pst = con.prepareStatement(sql);
                
                pst.setInt(1, CR_balance);
                pst.setInt(2, ammount);
                ResultSet rs = pst.executeQuery(); 
            }
            catch(Exception e){
                    Reload();
            }
    }





//Checkin Typing Digit Only for Deposit Ammount
    private void transferAmntKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_transferAmntKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c == KeyEvent.VK_SPACE) || c == KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_transferAmntKeyTyped
    /*
    private void jPanel6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel6KeyTyped

    }//GEN-LAST:event_jPanel6KeyTyped
    */
    //Checkin Typing Digit Only for Withdraw Ammount TextField
    private void wtAmmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wtAmmountKeyTyped
        char c = evt.getKeyChar();
        if((!Character.isDigit(c) || (c == KeyEvent.VK_SPACE) || c == KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_wtAmmountKeyTyped

    private void wtAmmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wtAmmountActionPerformed

    }//GEN-LAST:event_wtAmmountActionPerformed

   //Checkin Typing Digit Only for  Deposit Account Number
    private void transferAcNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_transferAcNoKeyTyped
        char c = evt.getKeyChar();
        if((!Character.isDigit(c) || (c == KeyEvent.VK_SPACE) || c == KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_transferAcNoKeyTyped

    
    //Withdraw Operation
    
    private void withfrawBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withfrawBtnActionPerformed
        if(wtAmmount.getText().equals("") || wtAmmount.getText().equals("Enter ammount")){
            JOptionPane.showMessageDialog(this, "Enter Withdraw Ammount!");
        }
        else if(wtAmmount.getText().equals("") || wtAmmount.getText().equals("Enter ammount")){
            JOptionPane.showMessageDialog(this, "Enter Withdraw Ammount!");
        }
        else if(wtAmmount.getText().equals("0")){
            JOptionPane.showMessageDialog(this, "Withdraw Ammount Can't Zero!");
        }
        
        String inputAmt = wtAmmount.getText();
        int amt = Integer.parseInt(inputAmt);
        int new_bal = CR_balance - amt;
        change_bal = CR_balance - amt;
        
        
        if((CR_balance-amt) <=0){
            JOptionPane.showMessageDialog(this, "Insufficient Balance!");
        }
        else{
            CR_balance = CR_balance - amt;
            try{
                
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String url = "jdbc:sqlserver://localhost:1433;databaseName=User;user=sa;password=sa";
                Connection con = DriverManager.getConnection(url);
                String sql="UPDATE UserTable SET CR_Balance=? where AC_Number="+login_acn;
                PreparedStatement pst;
                pst = con.prepareStatement(sql);
                pst.setInt(1, new_bal);
                pst.executeQuery(); 
                RecentWithdraw(amt);
            }
            catch(Exception e){
                    JOptionPane.showMessageDialog(this, "Withdraw Successful");
                    witdrawNextPanel.hide();
                    wtPass.setText("");
                    RecentWithdraw(amt);
                    Reload();
            }
        }
    }//GEN-LAST:event_withfrawBtnActionPerformed
    
     private void RecentWithdraw(int ammount){
        try{
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String url = "jdbc:sqlserver://localhost:1433;databaseName=User;user=sa;password=sa";
                Connection con = DriverManager.getConnection(url);
                String sql="UPDATE UserTable SET RW_Balance=? where AC_Number="+login_acn;
                PreparedStatement pst;
                pst = con.prepareStatement(sql);
                pst.setInt(1, ammount);
                ResultSet rs = pst.executeQuery(); 
            }
            catch(Exception e){
                    Reload();
            }
    }
    
    private void wtAmmountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wtAmmountMouseEntered
        wtAmmount.setText("");
    }//GEN-LAST:event_wtAmmountMouseEntered

    private void wtPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wtPassMouseClicked
        wtPass.setText("");
    }//GEN-LAST:event_wtPassMouseClicked

    private void wtPassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wtPassMouseExited
        wtPass.setText(wtPass.getText());
    }//GEN-LAST:event_wtPassMouseExited

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        LoginPage logout = new LoginPage();
        this.hide();
        logout.show();
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void depositBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositBtnActionPerformed
        if(depositAmt.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please Enter Ammount!");
        }
        else if(depositPass.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please Enter Ammount Password!");
        }
        else if(!depositPass.getText().equals(login_pass)){
            JOptionPane.showMessageDialog(this, "Incorrect Password!");
        }
        
        String inputAmt = depositAmt.getText();
        int ammount = Integer.parseInt(inputAmt);
        int new_bal = CR_balance + ammount;
        

        if(!depositPass.getText().equals(login_pass)){
            JOptionPane.showMessageDialog(this, "Incorrect Password!");
        }
        else{
            try{
                CR_balance = CR_balance + ammount;
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String url = "jdbc:sqlserver://localhost:1433;databaseName=User;user=sa;password=sa";
                Connection con = DriverManager.getConnection(url);
                String sql="UPDATE UserTable SET CR_Balance=? where AC_Number="+login_acn;
                PreparedStatement pst;
                pst = con.prepareStatement(sql);
                pst.setInt(1, new_bal);
                ResultSet rs = pst.executeQuery(); 
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, "Deposit Successful!");
                RecentDeposit(ammount);
                Reload();
            }
        }
    }//GEN-LAST:event_depositBtnActionPerformed
    
    public void RecentDeposit(int ammount){
        try{
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String url = "jdbc:sqlserver://localhost:1433;databaseName=User;user=sa;password=sa";
                Connection con = DriverManager.getConnection(url);
                String sql="UPDATE UserTable SET RD_Balance=? where AC_Number="+login_acn;
                PreparedStatement pst;
                pst = con.prepareStatement(sql);
                pst.setInt(1, ammount);
                ResultSet rs = pst.executeQuery(); 
            }
            catch(Exception e){
                    Reload();
            }
    }
    
    
    private void depositButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositButtonActionPerformed
        withdrawPanel.hide();
        tansferPanel.hide();
        depositPanel.show();
        
    }//GEN-LAST:event_depositButtonActionPerformed

    private void depositPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositPassMouseClicked
        depositPass.setText("");
    }//GEN-LAST:event_depositPassMouseClicked

    private void depositPassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositPassMouseExited

    }//GEN-LAST:event_depositPassMouseExited

    private void depositAmtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositAmtMouseClicked
        depositAmt.setText("");
    }//GEN-LAST:event_depositAmtMouseClicked

    private void transferAcNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transferAcNoMouseClicked
        transferAcNo.setText("");
    }//GEN-LAST:event_transferAcNoMouseClicked

    private void transferAmntMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transferAmntMouseClicked
        transferAmnt.setText("");
    }//GEN-LAST:event_transferAmntMouseClicked

   
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel acnLbl;
    private javax.swing.JLabel currentBalLbl;
    private javax.swing.JTextField depositAmt;
    private javax.swing.JButton depositBtn;
    private javax.swing.JButton depositButton;
    private javax.swing.JPanel depositPanel;
    private javax.swing.JPasswordField depositPass;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel mobileLbl;
    private javax.swing.JButton nextBtn;
    private javax.swing.JPanel prifilePanel;
    public javax.swing.JLabel profileLbl;
    private javax.swing.JLabel rcntDepLbl;
    private javax.swing.JLabel rcntWtdLbl;
    private javax.swing.JLabel rcnttfLbl;
    private javax.swing.JPanel statusBarPanel;
    private javax.swing.JPanel tansferPanel;
    private javax.swing.JButton transfBtn;
    private javax.swing.JTextField transferAcNo;
    private javax.swing.JTextField transferAmnt;
    private javax.swing.JButton transferBtn;
    private javax.swing.JPanel witdrawNextPanel;
    private javax.swing.JButton withdrawBtn;
    private javax.swing.JPanel withdrawPanel;
    private javax.swing.JButton withfrawBtn;
    private javax.swing.JTextField wtAmmount;
    private javax.swing.JPasswordField wtPass;
    // End of variables declaration//GEN-END:variables
}
