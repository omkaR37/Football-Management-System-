
package football.management;

import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import net.proteanit.sql.DbUtils;

public class MainFrame extends javax.swing.JFrame {

    
  
    public MainFrame() {
        initComponents();
        connection = startConnection();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LoginPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        userNameLabel = new javax.swing.JLabel();
        userNameTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        signInButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel102 = new javax.swing.JLabel();
        MainMenu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        playerButton = new javax.swing.JButton();
        teamButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jLabel97 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        teamManagePanel = new javax.swing.JPanel();
        teamManagementLabel = new javax.swing.JLabel();
        addTeamButton = new javax.swing.JButton();
        updateTeamButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        teamManagementTable = new javax.swing.JTable();
        jButton15 = new javax.swing.JButton();
        PlayerManagePanel = new javax.swing.JPanel();
        playerManagementLabel = new javax.swing.JLabel();
        addPlayerButton = new javax.swing.JButton();
        updatePlayerButton = new javax.swing.JButton();
        deletePlayerButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        playerTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        refreshhere = new javax.swing.JButton();
        addPlayerPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        physicalComboBox = new javax.swing.JComboBox();
        speedComboBox = new javax.swing.JComboBox();
        mentalComboBox = new javax.swing.JComboBox();
        defendingComboBox = new javax.swing.JComboBox();
        attackingComboBox = new javax.swing.JComboBox();
        technicalComboBox = new javax.swing.JComboBox();
        jLabel79 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel80 = new javax.swing.JLabel();
        teamPreferenceComboBox = new javax.swing.JComboBox();
        addTeamPanel = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        teamNameLabel = new javax.swing.JLabel();
        teamNameTextField = new javax.swing.JTextField();
        yearFoundedLabel = new javax.swing.JLabel();
        yearFoundedTextField = new javax.swing.JTextField();
        valueLabel = new javax.swing.JLabel();
        valueTextField = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        valueLabel1 = new javax.swing.JLabel();
        valueTextField1 = new javax.swing.JTextField();
        playerProfilePanel = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        updatePlayerPanel = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        physicalComboBox1 = new javax.swing.JComboBox();
        speedComboBox1 = new javax.swing.JComboBox();
        mentalComboBox1 = new javax.swing.JComboBox();
        defendingComboBox1 = new javax.swing.JComboBox();
        attackingComboBox1 = new javax.swing.JComboBox();
        technicalComboBox1 = new javax.swing.JComboBox();
        updateTeamPanel = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jTextField12 = new javax.swing.JTextField();
        leagueTablePanel = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton20 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setLayout(new java.awt.CardLayout());

        LoginPanel.setBackground(new java.awt.Color(102, 255, 255));
        LoginPanel.setForeground(new java.awt.Color(255, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Login");

        jPanel2.setBackground(new java.awt.Color(51, 255, 255));

        userNameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        userNameLabel.setText("User name ");

        passwordLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordLabel.setText("Password");

        signInButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        signInButton.setText("Sign in");
        signInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInButtonActionPerformed(evt);
            }
        });

        ExitButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(userNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userNameTextField)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(signInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameLabel))
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        jLabel102.setFont(new java.awt.Font("Cambria", 3, 48)); // NOI18N
        jLabel102.setText("Football Management");

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        jPanel1.add(LoginPanel, "loginPanelCard");

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 3, 36)); // NOI18N
        jLabel2.setText("FOOTBALL MANAGEMENT  SYSTEM");

        playerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/football/management/player.jpg"))); // NOI18N
        playerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerButtonActionPerformed(evt);
            }
        });

        teamButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/football/management/team.png"))); // NOI18N
        teamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamButtonActionPerformed(evt);
            }
        });

        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/football/management/denied_128px.png"))); // NOI18N
        exitButton.setText("logout");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        jLabel97.setText("MANAGE PLAYER");

        jLabel99.setText("LOGOUT");

        jLabel101.setText("MANAGE TEAM");

        javax.swing.GroupLayout MainMenuLayout = new javax.swing.GroupLayout(MainMenu);
        MainMenu.setLayout(MainMenuLayout);
        MainMenuLayout.setHorizontalGroup(
            MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainMenuLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainMenuLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(113, Short.MAX_VALUE))
                    .addGroup(MainMenuLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(playerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teamButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(136, 136, 136))))
            .addGroup(MainMenuLayout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        MainMenuLayout.setVerticalGroup(
            MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(teamButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jPanel1.add(MainMenu, "mainMenuCard");

        teamManagementLabel.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        teamManagementLabel.setText("Team Management");

        addTeamButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addTeamButton.setText("Add Team ");
        addTeamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTeamButtonActionPerformed(evt);
            }
        });

        updateTeamButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        updateTeamButton.setText("Update Team");
        updateTeamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateTeamButtonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        teamManagementTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Team ID", "Team Name", "Year Founded", "Value"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(teamManagementTable);
        if (teamManagementTable.getColumnModel().getColumnCount() > 0) {
            teamManagementTable.getColumnModel().getColumn(0).setResizable(false);
            teamManagementTable.getColumnModel().getColumn(1).setResizable(false);
            teamManagementTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jButton15.setText("View Players");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout teamManagePanelLayout = new javax.swing.GroupLayout(teamManagePanel);
        teamManagePanel.setLayout(teamManagePanelLayout);
        teamManagePanelLayout.setHorizontalGroup(
            teamManagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teamManagePanelLayout.createSequentialGroup()
                .addContainerGap(267, Short.MAX_VALUE)
                .addComponent(teamManagementLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
            .addGroup(teamManagePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(teamManagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addTeamButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateTeamButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        teamManagePanelLayout.setVerticalGroup(
            teamManagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teamManagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(teamManagementLabel)
                .addGap(104, 104, 104)
                .addGroup(teamManagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(teamManagePanelLayout.createSequentialGroup()
                        .addComponent(addTeamButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(updateTeamButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        jPanel1.add(teamManagePanel, "teamManageCard");

        playerManagementLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        playerManagementLabel.setText("PLAYER MANAGEMENT ");

        addPlayerButton.setText("ADD PLAYER");
        addPlayerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPlayerButtonActionPerformed(evt);
            }
        });

        updatePlayerButton.setText("UPDATE PLAYER");
        updatePlayerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePlayerButtonActionPerformed(evt);
            }
        });

        deletePlayerButton.setText("DELETE PLAYER");
        deletePlayerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePlayerButtonActionPerformed(evt);
            }
        });

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        playerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Player ID ", "First Name", "Last Name", "Team Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(playerTable);

        jButton2.setText("PLAYER PROFILE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        refreshhere.setText("REFRESH");
        refreshhere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshhereActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PlayerManagePanelLayout = new javax.swing.GroupLayout(PlayerManagePanel);
        PlayerManagePanel.setLayout(PlayerManagePanelLayout);
        PlayerManagePanelLayout.setHorizontalGroup(
            PlayerManagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlayerManagePanelLayout.createSequentialGroup()
                .addGroup(PlayerManagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PlayerManagePanelLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(PlayerManagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(updatePlayerButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addPlayerButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deletePlayerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE))
                    .addGroup(PlayerManagePanelLayout.createSequentialGroup()
                        .addGroup(PlayerManagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PlayerManagePanelLayout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(playerManagementLabel))
                            .addGroup(PlayerManagePanelLayout.createSequentialGroup()
                                .addGap(275, 275, 275)
                                .addComponent(refreshhere, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PlayerManagePanelLayout.setVerticalGroup(
            PlayerManagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlayerManagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(playerManagementLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(refreshhere, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PlayerManagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PlayerManagePanelLayout.createSequentialGroup()
                        .addComponent(addPlayerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(updatePlayerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(deletePlayerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel1.add(PlayerManagePanel, "playerManageCard");

        jLabel3.setBackground(java.awt.Color.lightGray);
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setText("                ADD PLAYER");

        jLabel4.setText("First Name");

        jLabel5.setText("Last Name");

        jLabel6.setText("Registration Number");

        jLabel7.setText("Country");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Germany", "Nepal", "India", "Pakistan", "Sri-Lanka", "Bhutan", "Bhutan", "Japan", "China", "South-Korea", "North-Korea" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Attributes");

        jLabel11.setText("Physical");

        jLabel12.setText("Mental");

        jLabel13.setText("Attacking");

        jLabel8.setText("Speed");

        jLabel14.setText("Defending");

        jLabel15.setText("Technical");

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("ADD PLAYER");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setText("BACK");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        physicalComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));

        speedComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));

        mentalComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));

        defendingComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));

        attackingComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));

        technicalComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));

        jLabel79.setText("Position");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MID", "DEF", "ST", "GK" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel80.setText("Team :");

        teamPreferenceComboBox.setEditable(true);
        teamPreferenceComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Manchester United", "Arsenal", "Liverpool", "Real Madrid", "Barcelona", "Chelsea", "Juventus" }));
        teamPreferenceComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamPreferenceComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addPlayerPanelLayout = new javax.swing.GroupLayout(addPlayerPanel);
        addPlayerPanel.setLayout(addPlayerPanelLayout);
        addPlayerPanelLayout.setHorizontalGroup(
            addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPlayerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(120, 120, 120))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPlayerPanelLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addPlayerPanelLayout.createSequentialGroup()
                        .addGroup(addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addPlayerPanelLayout.createSequentialGroup()
                                .addGroup(addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                                .addGroup(addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(teamPreferenceComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(addPlayerPanelLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(addPlayerPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPlayerPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(addPlayerPanelLayout.createSequentialGroup()
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE))
                    .addGroup(addPlayerPanelLayout.createSequentialGroup()
                        .addComponent(jLabel80)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPlayerPanelLayout.createSequentialGroup()
                        .addGroup(addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(23, 23, 23)
                        .addGroup(addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mentalComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(physicalComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(attackingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel8)
                            .addComponent(jLabel15))
                        .addGap(22, 22, 22)
                        .addGroup(addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(defendingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(speedComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(technicalComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(32, 32, 32))
        );
        addPlayerPanelLayout.setVerticalGroup(
            addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPlayerPanelLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel8)
                    .addComponent(physicalComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(speedComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14)
                    .addComponent(mentalComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(defendingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(addPlayerPanelLayout.createSequentialGroup()
                        .addGroup(addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15)
                            .addComponent(attackingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(technicalComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(jLabel7))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addPlayerPanelLayout.createSequentialGroup()
                        .addComponent(jLabel80)
                        .addGap(99, 99, 99)
                        .addGroup(addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(teamPreferenceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanel1.add(addPlayerPanel, "card6");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel16.setText("ADD TEAM ");

        teamNameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        teamNameLabel.setText("Team Name :");

        teamNameTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        yearFoundedLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        yearFoundedLabel.setText("Year Founded :");

        yearFoundedTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        valueLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        valueLabel.setText("Value :");

        valueTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("ADD TEAM");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setText("BACK");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        valueLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        valueLabel1.setText("Team ID :");

        valueTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout addTeamPanelLayout = new javax.swing.GroupLayout(addTeamPanel);
        addTeamPanel.setLayout(addTeamPanelLayout);
        addTeamPanelLayout.setHorizontalGroup(
            addTeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addTeamPanelLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 273, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(186, 186, 186))
            .addGroup(addTeamPanelLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(addTeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(valueLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearFoundedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teamNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(addTeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(addTeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(valueTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                        .addComponent(yearFoundedTextField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(teamNameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(valueTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addTeamPanelLayout.setVerticalGroup(
            addTeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addTeamPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(60, 60, 60)
                .addGroup(addTeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teamNameLabel)
                    .addComponent(teamNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90)
                .addGroup(addTeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearFoundedLabel)
                    .addComponent(yearFoundedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addGroup(addTeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueLabel)
                    .addComponent(valueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(addTeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueLabel1)
                    .addComponent(valueTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addGroup(addTeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.add(addTeamPanel, "card7");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setText("PLAYER PROFILE");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("First Name :");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("f_name");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Last Name :");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("l_name");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("Country     :");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("jLabel26");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("Team         :");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("jLabel35");

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel36.setText("Attributes");

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setText("Physical:");

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setText("Speed:");

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setText("Mental:");

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel40.setText("Defending:");

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel41.setText("Attacking: ");

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel42.setText("Technical:");

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel43.setText("Information");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout playerProfilePanelLayout = new javax.swing.GroupLayout(playerProfilePanel);
        playerProfilePanel.setLayout(playerProfilePanelLayout);
        playerProfilePanelLayout.setHorizontalGroup(
            playerProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerProfilePanelLayout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(playerProfilePanelLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(playerProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(playerProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playerProfilePanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(playerProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(playerProfilePanelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(playerProfilePanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(144, 144, 144)
                .addGroup(playerProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playerProfilePanelLayout.createSequentialGroup()
                        .addGroup(playerProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(89, 89, 89))
                    .addGroup(playerProfilePanelLayout.createSequentialGroup()
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(playerProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playerProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                        .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, playerProfilePanelLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, playerProfilePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(193, 193, 193))
        );
        playerProfilePanelLayout.setVerticalGroup(
            playerProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerProfilePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGap(32, 32, 32)
                .addGroup(playerProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jLabel43))
                .addGap(34, 34, 34)
                .addGroup(playerProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38))
                .addGap(54, 54, 54)
                .addGroup(playerProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(jLabel40))
                .addGap(59, 59, 59)
                .addGroup(playerProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42))
                .addGap(65, 65, 65)
                .addGroup(playerProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel35))
                .addGap(54, 54, 54)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        jPanel1.add(playerProfilePanel, "playerProfile");

        jLabel22.setBackground(java.awt.Color.lightGray);
        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel22.setText("             UPDATE PLAYER");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("First Name");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Last Name");

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel28.setText("Attributes");

        jLabel29.setText("Physical");

        jLabel30.setText("Mental");

        jLabel31.setText("Attacking");

        jLabel32.setText("Speed");

        jLabel33.setText("Defending");

        jLabel34.setText("Technical");

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setText("UPDATE PLAYER");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton10.setText("BACK");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        physicalComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));

        speedComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));

        mentalComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));

        defendingComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));

        attackingComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));

        technicalComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));

        javax.swing.GroupLayout updatePlayerPanelLayout = new javax.swing.GroupLayout(updatePlayerPanel);
        updatePlayerPanel.setLayout(updatePlayerPanelLayout);
        updatePlayerPanelLayout.setHorizontalGroup(
            updatePlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatePlayerPanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(updatePlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(updatePlayerPanelLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, updatePlayerPanelLayout.createSequentialGroup()
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(updatePlayerPanelLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(58, 58, 58)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                .addGroup(updatePlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatePlayerPanelLayout.createSequentialGroup()
                        .addGroup(updatePlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31))
                        .addGap(23, 23, 23)
                        .addGroup(updatePlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mentalComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(physicalComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(attackingComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(updatePlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addComponent(jLabel32)
                            .addComponent(jLabel34))
                        .addGap(22, 22, 22)
                        .addGroup(updatePlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(defendingComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(speedComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(technicalComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatePlayerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel28)
                .addGap(120, 120, 120))
        );
        updatePlayerPanelLayout.setVerticalGroup(
            updatePlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatePlayerPanelLayout.createSequentialGroup()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updatePlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel32)
                    .addComponent(physicalComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(speedComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(updatePlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel33)
                    .addComponent(mentalComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(defendingComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updatePlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updatePlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel34)
                    .addComponent(attackingComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(technicalComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(205, 205, 205)
                .addGroup(updatePlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jPanel1.add(updatePlayerPanel, "card_updateplayer");

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 255));
        jLabel44.setText("TEAM UPDATE");

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel45.setText("Team Name     :");

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel46.setText("Foundation Year:");

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel47.setText("Value              :");

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton11.setText("UPDATE");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton12.setText("BACK");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jTextField12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout updateTeamPanelLayout = new javax.swing.GroupLayout(updateTeamPanel);
        updateTeamPanel.setLayout(updateTeamPanelLayout);
        updateTeamPanelLayout.setHorizontalGroup(
            updateTeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateTeamPanelLayout.createSequentialGroup()
                .addGroup(updateTeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateTeamPanelLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(updateTeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(updateTeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField6)
                            .addComponent(jTextField7)
                            .addComponent(jTextField12, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)))
                    .addGroup(updateTeamPanelLayout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(314, Short.MAX_VALUE))
            .addGroup(updateTeamPanelLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );
        updateTeamPanelLayout.setVerticalGroup(
            updateTeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateTeamPanelLayout.createSequentialGroup()
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addGroup(updateTeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(updateTeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(updateTeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(updateTeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113))
        );

        jPanel1.add(updateTeamPanel, "card10");

        jLabel81.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel81.setText("LEAGUE TABLE");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        jButton20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton20.setText("BACK");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leagueTablePanelLayout = new javax.swing.GroupLayout(leagueTablePanel);
        leagueTablePanel.setLayout(leagueTablePanelLayout);
        leagueTablePanelLayout.setHorizontalGroup(
            leagueTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leagueTablePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
            .addGroup(leagueTablePanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jButton20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leagueTablePanelLayout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        leagueTablePanelLayout.setVerticalGroup(
            leagueTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leagueTablePanelLayout.createSequentialGroup()
                .addComponent(jLabel81)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(leagueTablePanel, "card14");

        getContentPane().add(jPanel1, new java.awt.GridBagConstraints());

        pack();
    }// </editor-fold>//GEN-END:initComponents
int count=0;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         CardLayout card = (CardLayout) jPanel1.getLayout();
        
        card.show(jPanel1, "mainMenuCard");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
         CardLayout card = (CardLayout) jPanel1.getLayout();
        
        card.show(jPanel1, "mainMenuCard");
    }//GEN-LAST:event_backButtonActionPerformed

    private void signInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInButtonActionPerformed
        // TODO add your handling code here:
        
     
        try {
             
            statement = connection.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String userName = userNameTextField.getText();
        String Password = jPasswordField1.getText();
        
        System.out.println(userName+Password);
       try {
         resultSet= statement.executeQuery("SELECT username , password FROM user");
            //resultSet.next();
            while(resultSet.next()){
            if(userName.equalsIgnoreCase(resultSet.getString("username")) && Password.equalsIgnoreCase(resultSet.getString("password"))){
                
                 CardLayout card = (CardLayout) jPanel1.getLayout();
                 card.show(jPanel1, "mainMenuCard");
                 userNameTextField.setText(null);
                jPasswordField1.setText(null);
                
              
            }
            else{
                 //JOptionPane.showMessageDialog(this," Please enter a valid user Name");
            }
         }  
             
        
       } catch (SQLException ex) {
           Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(this," Please enter a valid user Name");
        }
        
    
        
        
    }//GEN-LAST:event_signInButtonActionPerformed

    private void teamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamButtonActionPerformed
        try {
            // TODO add your handling code here:
            statement=connection.createStatement();
            resultSet=statement.executeQuery("SELECT * FROM team WHERE Value > 0");
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            teamManagementTable.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        
         CardLayout card = (CardLayout) jPanel1.getLayout();
        card.show(jPanel1, "teamManageCard");
    }//GEN-LAST:event_teamButtonActionPerformed

    private void playerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerButtonActionPerformed
        try {
            // TODO add your handling code here: CardLayout card = (CardLayout) jPanel1.getLayout();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT Player_ID,First_name,Last_Name,Team_Name,Country_Name FROM player_info Natural join team WHERE team.`Team_ID`=player_info.`Team_ID`");
            
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        playerTable.setModel(DbUtils.resultSetToTableModel(resultSet));
         CardLayout card = (CardLayout) jPanel1.getLayout();
        card.show(jPanel1, "playerManageCard");
    }//GEN-LAST:event_playerButtonActionPerformed

    private void addPlayerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPlayerButtonActionPerformed
        // TODO add your handling code here:
        
        CardLayout card = (CardLayout) jPanel1.getLayout();
        card.show(jPanel1, "card6");
    }//GEN-LAST:event_addPlayerButtonActionPerformed

    private void addTeamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTeamButtonActionPerformed
        // TODO add your handling code here:
        
        CardLayout card = (CardLayout) jPanel1.getLayout();
        card.show(jPanel1, "card7");
    }//GEN-LAST:event_addTeamButtonActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         teamNameTextField.setText(null);
          yearFoundedTextField.setText(null);
          valueTextField.setText(null);
          try {
            
            statement = connection.createStatement();
              resultSet= statement.executeQuery("SELECT * FROM team");
            teamManagementTable.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        CardLayout card = (CardLayout) jPanel1.getLayout();
        card.show(jPanel1, "teamManageCard");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        String teamName =teamNameTextField.getText();
        String yearFoundation=(yearFoundedTextField.getText());
        String value=(valueTextField.getText());
        String team_id=(valueTextField1.getText());
        
        if(teamName.equalsIgnoreCase(null)){
            JOptionPane.showMessageDialog(this, "Insert A Team Name ");
        
    
        }else if(yearFoundation.equalsIgnoreCase(null)){
              JOptionPane.showMessageDialog(this, "Insert A Foundation Year ");
        } else if(value.equalsIgnoreCase(null)){
              JOptionPane.showMessageDialog(this, "Insert A Value ");
        }else if(team_id.equalsIgnoreCase(null)){
              JOptionPane.showMessageDialog(this, "Insert A Team ID ");
              
        }else{
             String query ="INSERT INTO team(Team_ID,Team_Name,Year_Founded,Value) values(" + Integer.parseInt(team_id) +","
             + "'"+  teamName+"' " +" ,"+Integer.parseInt(yearFoundation)+" ,"+ Integer.parseInt(value)+" )";
        
        System.out.println("query:"+query);
        
        
        try {
            statement=connection.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
          JOptionPane.showMessageDialog(this, "Team has been inserted successfully ");
          teamNameTextField.setText(null);
          yearFoundedTextField.setText(null);
          valueTextField.setText(null);
          valueTextField1.setText(null);

          
        }
       
    }//GEN-LAST:event_jButton5ActionPerformed

    int teamId;
    private void updateTeamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateTeamButtonActionPerformed
        // TODO add your handling code here:
        
         int row = teamManagementTable.getSelectedRow();
         int column = teamManagementTable.getColumnCount();
         int teamId=0;
           String teamName =null;
           int yearFounded=0;
           int value =0;
         try{
              teamId=(int) teamManagementTable.getValueAt(row, 0);
         teamName =(String) teamManagementTable.getValueAt(row,1);
         yearFounded=(int) teamManagementTable.getValueAt(row, 2);
         value=(int) teamManagementTable.getValueAt(row, 3);
             System.out.println("TeamId:"+teamId);
             }catch(Exception ex){
                 JOptionPane.showMessageDialog(this,"please select a Team");
                 return;
             }
       
         jTextField6.setText(teamName);
         jTextField7.setText(Integer.toString(yearFounded));
         jTextField12.setText(Integer.toString(value));
         
           
        CardLayout card = (CardLayout) jPanel1.getLayout();
        
        card.show(jPanel1, "card10");
    }//GEN-LAST:event_updateTeamButtonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        // Player Information
                String firstName=null;
                String lastName=null;
                String country=null;
                String team=null;
                
        int playerID;
        firstName=jTextField1.getText();
        lastName = jTextField2.getText();
        country = (String) jComboBox1.getSelectedItem();
        team = (String) teamPreferenceComboBox.getSelectedItem();
        
        
        // Player Attributes
        int physical,speed,mental,defending,attacking,technical;
        
        physical =  Integer.parseInt((String) physicalComboBox.getSelectedItem());
        speed=Integer.parseInt((String) speedComboBox.getSelectedItem());
        mental=Integer.parseInt((String) mentalComboBox.getSelectedItem());
        defending=Integer.parseInt((String) defendingComboBox.getSelectedItem());
        attacking=Integer.parseInt((String) attackingComboBox.getSelectedItem());
        technical=Integer.parseInt((String) technicalComboBox.getSelectedItem());
        
        
        try {
            statement = connection.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String insertQuery1=null;
        String insertAttributesQuery=null;
        if(firstName.length()==0){
            JOptionPane.showMessageDialog(this, "Insert A First Name");
            return;
        }else if(lastName.length()==0){
            JOptionPane.showMessageDialog(this, "Insert A Last Name");
            return;
        }else if(jTextField3.getText().length()==0){
             JOptionPane.showMessageDialog(this, "Insert A Registration Number");
             return;
        }
        
        try{
             playerID =Integer.parseInt(jTextField3.getText()) ;
        }catch(Exception ex){
             JOptionPane.showMessageDialog(this, "Insert A valid Registration Number");
             return;
        }
            
                try {
                    resultSet=  statement.executeQuery("SELECT Team_ID FROM team WHERE Team_name="+"'"+team+"'");
                    resultSet.next();
                    int id =resultSet.getInt("Team_ID");
                     insertQuery1 = "INSERT INTO player_info(Player_ID,Team_ID,First_Name,Last_Name,Country_Name,Position,Team_Preference) values("+
                playerID+","+id+","+"'"+firstName+"'"+","+"'"+lastName+"'"+","+"'"+country+"'"
                 +","+"'"+jComboBox2.getSelectedItem().toString()+"'"+","+"'"+teamPreferenceComboBox.getSelectedItem().toString()+"'"+")";
                     
                     insertAttributesQuery="INSERT INTO player_attributes values("+playerID+","+ physical+","+speed+","+mental+","+defending+","+attacking+","+technical
                +")";
                } catch (SQLException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
               
            
        try {
            statement.execute(insertQuery1);
            statement.execute(insertAttributesQuery);
              
       
            JOptionPane.showMessageDialog(this, "Player has benn inserted successfully");
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("insertQuery1:"+insertQuery1);
        System.out.println("insertAttributesQuery:"+insertAttributesQuery);
        
      
      
        jTextField1.setText(null);
        jTextField2.setText(null);
        jTextField3.setText(null);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        try {
            
            statement = connection.createStatement();
              resultSet= statement.executeQuery("SELECT * FROM player_info");
            playerTable.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
         
          
        CardLayout card = (CardLayout) jPanel1.getLayout();
        
        card.show(jPanel1, "playerManageCard");
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void deletePlayerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePlayerButtonActionPerformed
        // TODO add your handling code here:
        
             int row = playerTable.getSelectedRow();
             int column = playerTable.getColumnCount();
             int id=0;
             try{
                  id=(int) playerTable.getValueAt(row, 0);
             String name =(String) playerTable.getValueAt(row,1);
             }catch(Exception ex){
                  JOptionPane.showMessageDialog(this,"please select a Item");
             }
            
             
             String deletedString= "DELETE FROM player_info WHERE Player_ID="+id;
            
             
        try {
            statement = connection.createStatement();
            statement.executeUpdate(deletedString);
           
           
             
            resultSet= statement.executeQuery("SELECT * FROM player_info");
            playerTable.setModel(DbUtils.resultSetToTableModel(resultSet));
             JOptionPane.showMessageDialog(this,"Player has been deleted successfully");
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deletePlayerButtonActionPerformed
   int updateId;
    private void updatePlayerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePlayerButtonActionPerformed
        // TODO add your handling code here:
        
         int row = playerTable.getSelectedRow();
         int column = playerTable.getColumnCount();
           String firstName =null;
           String lastName=null;
         try{
              updateId=(int) playerTable.getValueAt(row, 0);
         firstName =(String) playerTable.getValueAt(row,1);
         lastName=(String) playerTable.getValueAt(row, 2);
             }catch(Exception ex){
                 JOptionPane.showMessageDialog(this,"please select a Item");
                 return;
             }
             jTextField4.setText(firstName);
             jTextField5.setText(lastName);
        try {
            statement=connection.createStatement();
            resultSet=statement.executeQuery("SELECT * FROM player_attributes WHERE Player_ID="+updateId);
            resultSet.next();
            physicalComboBox1.setSelectedItem(Integer.toString(resultSet.getInt("Physical")));
            speedComboBox1.setSelectedItem(Integer.toString(resultSet.getInt("Speed")));
            mentalComboBox1.setSelectedItem(Integer.toString(resultSet.getInt("Mental")));
            defendingComboBox1.setSelectedItem(Integer.toString(resultSet.getInt("Defending")));
            attackingComboBox1.setSelectedItem(Integer.toString(resultSet.getInt("Attacking")));
            technicalComboBox1.setSelectedItem(Integer.toString(resultSet.getInt("Technical")));
           
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
           CardLayout card = (CardLayout) jPanel1.getLayout();
          card.show(jPanel1, "card_updateplayer");
             
        
    }//GEN-LAST:event_updatePlayerButtonActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        if(jTextField4.getText().length()==0){
             JOptionPane.showMessageDialog(this,"Insert a First Name");
             return ;
        }else if(jTextField5.getText().length()==0){
            JOptionPane.showMessageDialog(this,"Insert a Last Name");
            return ;
        }
              String firstName=null;
              String lastName=null;
                
                
        
        firstName=jTextField4.getText();
        lastName = jTextField5.getText();
        
        // Player Attributes
        int physical,speed,mental,defending,attacking,technical;
        
        physical =  Integer.parseInt((String) physicalComboBox1.getSelectedItem());
        speed=Integer.parseInt((String) speedComboBox1.getSelectedItem());
        mental=Integer.parseInt((String) mentalComboBox1.getSelectedItem());
        defending=Integer.parseInt((String) defendingComboBox1.getSelectedItem());
        attacking=Integer.parseInt((String) attackingComboBox1.getSelectedItem());
        technical=Integer.parseInt((String) technicalComboBox1.getSelectedItem());
        
        String updateQueryInfo ="UPDATE player_info SET First_Name="+"'"+firstName+"', "+"Last_Name="+"'"+lastName+"' WHERE Player_id="+updateId;
        System.out.println("updateQueryInfo:"+updateQueryInfo);
        String updateQueryAttributes="UPDATE player_attributes SET Physical="+physical+", Speed="+speed+", Mental="+mental+
                ", Defending="+defending+", Attacking="+attacking+", Technical="+technical+" WHERE Player_ID="+updateId;
        System.out.println("updateQueryAttributes:"+updateQueryAttributes);
        try {
            statement = connection.createStatement();
            statement.executeUpdate(updateQueryInfo);
            statement.executeUpdate(updateQueryAttributes);
            JOptionPane.showMessageDialog(this,"Player has been updated successfully");
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         CardLayout card = (CardLayout) jPanel1.getLayout();
        
        card.show(jPanel1, "playerManageCard");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        
        
        try {
            
            statement = connection.createStatement();
              resultSet= statement.executeQuery("SELECT * FROM player_info");
            playerTable.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        CardLayout card = (CardLayout) jPanel1.getLayout();
        
        card.show(jPanel1, "playerManageCard");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         int row = playerTable.getSelectedRow();
         int column = playerTable.getColumnCount();
         
           int id=0;
           String firstName =null;
           String lastName=null;
           String country=null;
           String team=null;
         try{
             id=(int) playerTable.getValueAt(row, 0);
             firstName =(String) playerTable.getValueAt(row,1);
             lastName=(String) playerTable.getValueAt(row, 2);
             country=(String) playerTable.getValueAt(row, 4);
             
             }catch(Exception ex){
                 JOptionPane.showMessageDialog(this,"please select a Item");
                 return;
             }
         
        
         
        try {
            statement = connection.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int teamId;
        try {
            resultSet = statement.executeQuery("SELECT Team_ID FROM Player_info WHERE Player_ID= "+id);
            resultSet.next();
            teamId=resultSet.getInt("Team_Id");
            resultSet = statement.executeQuery("SELECT Team_Name FROM team WHERE Team_ID="+teamId);
            resultSet.next();
            team=resultSet.getString("Team_Name");
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
         jLabel19.setText(firstName);
         jLabel21.setText(lastName);
         jLabel26.setText(country);
        jLabel35.setText(team);
     
        
        try {
            //Attributes

            resultSet = statement.executeQuery("SELECT * FROM player_attributes WHERE Player_ID="+id);
            resultSet.next();
            jLabel37.setText("Physical :"+Integer.toString(resultSet.getInt("Physical"))+"/5");
            jLabel38.setText("Speed :"+Integer.toString(resultSet.getInt("Speed"))+"/5");
            jLabel39.setText("Mental :"+Integer.toString(resultSet.getInt("Mental"))+"/5");
            jLabel40.setText("Defending :"+Integer.toString(resultSet.getInt("Defending"))+"/5");
            jLabel41.setText("Attacking :"+Integer.toString(resultSet.getInt("Attacking"))+"/5");
            jLabel42.setText("Technical :"+Integer.toString(resultSet.getInt("Technical"))+"/5");
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
         CardLayout card = (CardLayout) jPanel1.getLayout();
        
        card.show(jPanel1, "playerProfile");
         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         CardLayout card = (CardLayout) jPanel1.getLayout();
        
        card.show(jPanel1, "playerManageCard");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        String teamName=null;
        int foundationYear,value,team_id;
        teamName = jTextField6.getText();
        if(teamName.length()==0){
            JOptionPane.showMessageDialog(this, "Insert a Team name");
            return ;
        }else if(jTextField7.getText().length()==0){
            JOptionPane.showMessageDialog(this, "Insert a Foundation Year");
            return ;
        }else if(jTextField12.getText().length() ==0){
            JOptionPane.showMessageDialog(this, "Insert a Team Value");
       // }else if(jTextField8.getText().length() ==0){
         //   JOptionPane.showMessageDialog(this, "Insert a Team ID");
            return ;
        }
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT Team_ID FROM team WHERE Team_Name ="+"'"+teamName+"'");
            resultSet.next();
            teamId=resultSet.getInt("Team_ID");
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        foundationYear = Integer.parseInt(jTextField7.getText());
        value = Integer.parseInt(jTextField12.getText());
        System.out.println("Foundation:"+foundationYear+" value: "+value+"teamId: "+teamId);
        try {
            statement = connection.createStatement();
            statement.executeUpdate("UPDATE team SET Team_Name = "+"'"+teamName+"', Year_Founded = "+foundationYear+", Value="+
                    value+" WHERE Team_ID ="+teamId);
           JOptionPane.showMessageDialog(this, "Team has benn updated successfully");
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         CardLayout card = (CardLayout) jPanel1.getLayout(); 
        card.show(jPanel1, "teamManageCard");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
         CardLayout card = (CardLayout) jPanel1.getLayout();
        
        card.show(jPanel1, "teamManageCard");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:
        closeConnection();
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout) jPanel1.getLayout();
        
        card.show(jPanel1, "loginPanelCard");
    }//GEN-LAST:event_exitButtonActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
         CardLayout card = (CardLayout) jPanel1.getLayout();
        card.show(jPanel1, "mainMenuCard");
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void teamPreferenceComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamPreferenceComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teamPreferenceComboBoxActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed

     try {
         int row = teamManagementTable.getSelectedRow();
         int column = teamManagementTable.getSelectedColumn();
         int teamId=0;
         teamId=(int) teamManagementTable.getValueAt(row,0);
         System.out.println(teamId);
            statement = connection.createStatement();
            String qy="SELECT First_Name,Last_Name,Position,Country_Name FROM player_info where Team_ID="+teamId;
            resultSet=statement.executeQuery(qy);
       //     jTable2.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(this,"please select a Team");
                 return;
        }
        
        CardLayout card = (CardLayout) jPanel1.getLayout();
        
        card.show(jPanel1, "card17");
    }//GEN-LAST:event_jButton15ActionPerformed

    private void refreshhereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshhereActionPerformed
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT Player_ID,First_name,Last_Name,Team_Name,Country_Name FROM player_info Natural join team WHERE team.`Team_ID`=player_info.`Team_ID`");
            
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
         CardLayout card = (CardLayout) jPanel1.getLayout();
        card.show(jPanel1, "playerManageCard")  ;      // TODO add your handling code here:
    }//GEN-LAST:event_refreshhereActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

     Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
    private String userName = "root";
    private String password = "root";
    String DATABASE_URL = "jdbc:mysql://localhost:3306/db";
      
    public Connection startConnection(){
           try {
            //        String DATABASE_URL = "jdbc:mysql://localhost:3306/mynewdatabase";
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            connection =  DriverManager.getConnection(DATABASE_URL,userName,password);
            
            System.out.println("connected");
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
        return  connection;
    }
    
    
    public void closeConnection(){
        try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   

    
    public static void main(String args[]) {
        
         
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 try {
    
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                
                Properties props = new Properties();
                props.put("logoString", "my company");
                
                UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
              

            }
        } catch (Exception ex) {
            
        }
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JPanel MainMenu;
    private javax.swing.JPanel PlayerManagePanel;
    private javax.swing.JButton addPlayerButton;
    private javax.swing.JPanel addPlayerPanel;
    private javax.swing.JButton addTeamButton;
    private javax.swing.JPanel addTeamPanel;
    private javax.swing.JComboBox attackingComboBox;
    private javax.swing.JComboBox attackingComboBox1;
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox defendingComboBox;
    private javax.swing.JComboBox defendingComboBox1;
    private javax.swing.JButton deletePlayerButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JPanel leagueTablePanel;
    private javax.swing.JComboBox mentalComboBox;
    private javax.swing.JComboBox mentalComboBox1;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JComboBox physicalComboBox;
    private javax.swing.JComboBox physicalComboBox1;
    private javax.swing.JButton playerButton;
    private javax.swing.JLabel playerManagementLabel;
    private javax.swing.JPanel playerProfilePanel;
    private javax.swing.JTable playerTable;
    private javax.swing.JButton refreshhere;
    private javax.swing.JButton signInButton;
    private javax.swing.JComboBox speedComboBox;
    private javax.swing.JComboBox speedComboBox1;
    private javax.swing.JButton teamButton;
    private javax.swing.JPanel teamManagePanel;
    private javax.swing.JLabel teamManagementLabel;
    private javax.swing.JTable teamManagementTable;
    private javax.swing.JLabel teamNameLabel;
    private javax.swing.JTextField teamNameTextField;
    private javax.swing.JComboBox teamPreferenceComboBox;
    private javax.swing.JComboBox technicalComboBox;
    private javax.swing.JComboBox technicalComboBox1;
    private javax.swing.JButton updatePlayerButton;
    private javax.swing.JPanel updatePlayerPanel;
    private javax.swing.JButton updateTeamButton;
    private javax.swing.JPanel updateTeamPanel;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JTextField userNameTextField;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JLabel valueLabel1;
    private javax.swing.JTextField valueTextField;
    private javax.swing.JTextField valueTextField1;
    private javax.swing.JLabel yearFoundedLabel;
    private javax.swing.JTextField yearFoundedTextField;
    // End of variables declaration//GEN-END:variables

     ArrayList<String>teamName = new ArrayList<String>();
    ArrayList<String>playerName = new ArrayList<String>();
    ArrayList<String>allName = new ArrayList<String>();
    

}
