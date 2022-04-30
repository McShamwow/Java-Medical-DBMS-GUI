package its340project;

import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;

public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
        updatePatientList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jButtonSelectPatient = new javax.swing.JButton();
        jButtonDeletePatient = new javax.swing.JButton();
        jButtonNewPatient = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButtonEditDemographics = new javax.swing.JButton();
        jButtonSaveDemographics = new javax.swing.JButton();
        jXTextField1 = new org.jdesktop.swingx.JXTextField();
        jXTextField2 = new org.jdesktop.swingx.JXTextField();
        jXTextField3 = new org.jdesktop.swingx.JXTextField();
        jXTextField4 = new org.jdesktop.swingx.JXTextField();
        jXTextField5 = new org.jdesktop.swingx.JXTextField();
        jXTextField6 = new org.jdesktop.swingx.JXTextField();
        jXTextField7 = new org.jdesktop.swingx.JXTextField();
        jXTextField8 = new org.jdesktop.swingx.JXTextField();
        jXTextField9 = new org.jdesktop.swingx.JXTextField();
        jXTextField10 = new org.jdesktop.swingx.JXTextField();
        jXTextField11 = new org.jdesktop.swingx.JXTextField();
        jXTextField12 = new org.jdesktop.swingx.JXTextField();
        jXTextField13 = new org.jdesktop.swingx.JXTextField();
        jXTextField14 = new org.jdesktop.swingx.JXTextField();
        jXTextField15 = new org.jdesktop.swingx.JXTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jXTextField16 = new org.jdesktop.swingx.JXTextField();
        jButtonAddPatient = new javax.swing.JButton();
        jButtonClearTextFields = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jXTextField17 = new org.jdesktop.swingx.JXTextField();
        jXTextField18 = new org.jdesktop.swingx.JXTextField();
        jXTextField19 = new org.jdesktop.swingx.JXTextField();
        jXTextField20 = new org.jdesktop.swingx.JXTextField();
        jXTextField21 = new org.jdesktop.swingx.JXTextField();
        jXTextField22 = new org.jdesktop.swingx.JXTextField();
        jXTextField23 = new org.jdesktop.swingx.JXTextField();
        jXTextField24 = new org.jdesktop.swingx.JXTextField();
        jXTextField25 = new org.jdesktop.swingx.JXTextField();
        jXTextField26 = new org.jdesktop.swingx.JXTextField();
        jXTextField27 = new org.jdesktop.swingx.JXTextField();
        jXTextField28 = new org.jdesktop.swingx.JXTextField();
        jButtonNewGenMedHxInterview = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stewart National Hospitality");

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(900, 400));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default" }));

        jLabel16.setText("Select a patient:");

        jButtonSelectPatient.setText("Select");
        jButtonSelectPatient.setPreferredSize(new java.awt.Dimension(75, 22));
        jButtonSelectPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSelectPatientMouseClicked(evt);
            }
        });

        jButtonDeletePatient.setText("Delete");
        jButtonDeletePatient.setPreferredSize(new java.awt.Dimension(75, 22));
        jButtonDeletePatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDeletePatientMouseClicked(evt);
            }
        });

        jButtonNewPatient.setText("New");
        jButtonNewPatient.setPreferredSize(new java.awt.Dimension(75, 22));
        jButtonNewPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonNewPatientMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSelectPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonNewPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonDeletePatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel16)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jButtonSelectPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDeletePatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonNewPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(670, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Patient Select", jPanel3);

        jLabel1.setText("Last Name : ");

        jLabel2.setText("First Name :");

        jLabel3.setText("Middle Initial :");

        jLabel4.setText("Address :");

        jLabel5.setText("City :");

        jLabel6.setText("State :");

        jLabel7.setText("Zip :");

        jLabel8.setText("Phone :");

        jLabel9.setText("Email :");

        jLabel10.setText("SSN :");

        jLabel11.setText("DoB :");

        jLabel12.setText("Gender :");

        jLabel13.setText("Ethnicity :");

        jLabel14.setText("Marital Status :");

        jLabel15.setText("Active? :");

        jButtonEditDemographics.setText("Edit");
        jButtonEditDemographics.setToolTipText("Enables editing of text fields");
        jButtonEditDemographics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEditDemographicsMouseClicked(evt);
            }
        });

        jButtonSaveDemographics.setText("Save");
        jButtonSaveDemographics.setToolTipText("Save changes made to an existing patient");
        jButtonSaveDemographics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSaveDemographicsMouseClicked(evt);
            }
        });

        jXTextField1.setEditable(false);
        jXTextField1.setBackground(java.awt.Color.lightGray);
        jXTextField1.setToolTipText("");
        jXTextField1.setPreferredSize(new java.awt.Dimension(105, 32));
        jXTextField1.setPrompt("");

        jXTextField2.setEditable(false);
        jXTextField2.setBackground(java.awt.Color.lightGray);
        jXTextField2.setToolTipText("");
        jXTextField2.setPreferredSize(new java.awt.Dimension(105, 32));
        jXTextField2.setPrompt("");

        jXTextField3.setEditable(false);
        jXTextField3.setBackground(java.awt.Color.lightGray);
        jXTextField3.setToolTipText("");
        jXTextField3.setPreferredSize(new java.awt.Dimension(105, 32));
        jXTextField3.setPrompt("");

        jXTextField4.setEditable(false);
        jXTextField4.setBackground(java.awt.Color.lightGray);
        jXTextField4.setToolTipText("");
        jXTextField4.setPreferredSize(new java.awt.Dimension(105, 32));
        jXTextField4.setPrompt("");

        jXTextField5.setEditable(false);
        jXTextField5.setBackground(java.awt.Color.lightGray);
        jXTextField5.setToolTipText("");
        jXTextField5.setPreferredSize(new java.awt.Dimension(105, 32));
        jXTextField5.setPrompt("");

        jXTextField6.setEditable(false);
        jXTextField6.setBackground(java.awt.Color.lightGray);
        jXTextField6.setToolTipText("");
        jXTextField6.setPreferredSize(new java.awt.Dimension(105, 32));
        jXTextField6.setPrompt("");

        jXTextField7.setEditable(false);
        jXTextField7.setBackground(java.awt.Color.lightGray);
        jXTextField7.setPreferredSize(new java.awt.Dimension(105, 32));
        jXTextField7.setPrompt("XX");

        jXTextField8.setEditable(false);
        jXTextField8.setBackground(java.awt.Color.lightGray);
        jXTextField8.setPreferredSize(new java.awt.Dimension(105, 32));
        jXTextField8.setPrompt("XXXXX");

        jXTextField9.setEditable(false);
        jXTextField9.setBackground(java.awt.Color.lightGray);
        jXTextField9.setPreferredSize(new java.awt.Dimension(105, 32));
        jXTextField9.setPrompt("XXX-XXX-XXXX");

        jXTextField10.setEditable(false);
        jXTextField10.setBackground(java.awt.Color.lightGray);
        jXTextField10.setToolTipText("");
        jXTextField10.setPreferredSize(new java.awt.Dimension(105, 32));
        jXTextField10.setPrompt("");

        jXTextField11.setEditable(false);
        jXTextField11.setBackground(java.awt.Color.lightGray);
        jXTextField11.setPreferredSize(new java.awt.Dimension(105, 32));
        jXTextField11.setPrompt("XXX-XX-XXXX");

        jXTextField12.setEditable(false);
        jXTextField12.setBackground(java.awt.Color.lightGray);
        jXTextField12.setPreferredSize(new java.awt.Dimension(105, 32));
        jXTextField12.setPrompt("YYYY-MM-DD");

        jXTextField13.setEditable(false);
        jXTextField13.setBackground(java.awt.Color.lightGray);
        jXTextField13.setPreferredSize(new java.awt.Dimension(105, 32));
        jXTextField13.setPrompt("M / F");

        jXTextField14.setEditable(false);
        jXTextField14.setBackground(java.awt.Color.lightGray);
        jXTextField14.setToolTipText("");
        jXTextField14.setPreferredSize(new java.awt.Dimension(105, 32));
        jXTextField14.setPrompt("");

        jXTextField15.setEditable(false);
        jXTextField15.setBackground(java.awt.Color.lightGray);
        jXTextField15.setToolTipText("");
        jXTextField15.setPreferredSize(new java.awt.Dimension(105, 32));
        jXTextField15.setPrompt("");

        jLabel17.setText("Comments:");

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(java.awt.Color.lightGray);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel18.setText("Patient ID :");

        jXTextField16.setEditable(false);
        jXTextField16.setBackground(java.awt.Color.lightGray);
        jXTextField16.setPreferredSize(new java.awt.Dimension(105, 32));
        jXTextField16.setPrompt("1 = Yes, 0 = No");

        jButtonAddPatient.setText("Add New");
        jButtonAddPatient.setToolTipText("Insert a new patient into the database");
        jButtonAddPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAddPatientMouseClicked(evt);
            }
        });

        jButtonClearTextFields.setText("Clear All Fields");
        jButtonClearTextFields.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonClearTextFieldsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jXTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jXTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jXTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jXTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jXTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jXTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jXTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jXTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jXTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jXTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jXTextField13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jXTextField12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jXTextField11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jXTextField14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jXTextField15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jXTextField16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButtonEditDemographics)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSaveDemographics)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAddPatient)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonClearTextFields)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditDemographics)
                    .addComponent(jButtonSaveDemographics)
                    .addComponent(jButtonAddPatient)
                    .addComponent(jButtonClearTextFields))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jXTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jXTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jXTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jXTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jXTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jXTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jXTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jXTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jXTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jXTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jXTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jXTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel10, jLabel11, jLabel12, jLabel13, jLabel14, jLabel15, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9});

        jTabbedPane1.addTab("Demographics", jPanel1);

        jLabel19.setText("GenMedHxID: ");

        jLabel20.setText("Patient ID: ");

        jLabel21.setText("Tobacco: ");

        jLabel22.setText("TobaccoQuantity: ");

        jLabel23.setText("TobaccoDuration: ");

        jLabel24.setText("Alcohol:");

        jLabel25.setText("AlcoholDuration: ");

        jLabel26.setText("Drug: ");

        jLabel27.setText("DrugType:");

        jLabel28.setText("DrugDuration: ");

        jLabel29.setText("BloodType: ");

        jLabel30.setText("Rh: ");

        jXTextField17.setEditable(false);

        jXTextField18.setEditable(false);

        jXTextField19.setEditable(false);

        jXTextField20.setEditable(false);

        jXTextField21.setEditable(false);

        jXTextField22.setEditable(false);

        jXTextField23.setEditable(false);

        jXTextField24.setEditable(false);

        jXTextField25.setEditable(false);

        jXTextField26.setEditable(false);

        jXTextField27.setEditable(false);

        jXTextField28.setEditable(false);

        jButtonNewGenMedHxInterview.setText("New Interview");
        jButtonNewGenMedHxInterview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonNewGenMedHxInterviewMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel30)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addComponent(jLabel27)
                    .addComponent(jLabel26)
                    .addComponent(jLabel25)
                    .addComponent(jLabel24)
                    .addComponent(jLabel23)
                    .addComponent(jLabel22)
                    .addComponent(jLabel21)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jXTextField27, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(jXTextField26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jXTextField24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jXTextField25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jXTextField23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jXTextField22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jXTextField21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jXTextField20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jXTextField19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jXTextField17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jXTextField28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jXTextField18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addComponent(jButtonNewGenMedHxInterview)
                .addGap(137, 137, 137))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jButtonNewGenMedHxInterview)
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jXTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jXTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jXTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jXTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jXTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jXTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jXTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jXTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jXTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(382, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("General Medical History", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    
/////////////////////////////// BUTTON EVENTS /////////////////////////////////

    
    private void jButtonSelectPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSelectPatientMouseClicked
        selectPatientDemographics();
        selectPatientGenMedHx();
    }//GEN-LAST:event_jButtonSelectPatientMouseClicked

    private void jButtonDeletePatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDeletePatientMouseClicked
        deleteSelectedPatient();
    }//GEN-LAST:event_jButtonDeletePatientMouseClicked

    private void jButtonNewPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNewPatientMouseClicked
        jTabbedPane1.setSelectedIndex(1);
        emptyDemoTextFields();
        enableDemoTextFields();
    }//GEN-LAST:event_jButtonNewPatientMouseClicked

    private void jButtonAddPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddPatientMouseClicked
        addPatient();
    }//GEN-LAST:event_jButtonAddPatientMouseClicked

    private void jButtonSaveDemographicsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSaveDemographicsMouseClicked
        updatePatientDemographics();
        updatePatientList();
        disableDemoTextFields();
    }//GEN-LAST:event_jButtonSaveDemographicsMouseClicked

    private void jButtonEditDemographicsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEditDemographicsMouseClicked
        enableDemoTextFields();
    }//GEN-LAST:event_jButtonEditDemographicsMouseClicked

    private void jButtonClearTextFieldsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonClearTextFieldsMouseClicked
        emptyDemoTextFields();
    }//GEN-LAST:event_jButtonClearTextFieldsMouseClicked

    private void jButtonNewGenMedHxInterviewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNewGenMedHxInterviewMouseClicked
        confirmNewInterview();
        //startInterview();
    }//GEN-LAST:event_jButtonNewGenMedHxInterviewMouseClicked

///////////////////////////////////////////////////////////////////////////////


/////////////////////////////// QUERIES ///////////////////////////////////////

        public void updatePatientList(){

        String dbUrl = "jdbc:mysql://localhost:3306/hospital?autoReconnect=true&useSSL=false";
        String query = "SELECT LastName, FirstName FROM patienttable";
        
        jComboBox1.removeAllItems();

        try 
        {
            // Initialize/register driver class.
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection (dbUrl, "root", "");  
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while(rs.next()){
                jComboBox1.addItem(rs.getString(2) + " " + rs.getString(1));
            }

            con.close();
        }
        catch(Exception e) 
        {
            e.getMessage();
        }
    }
    
    public void updatePatientDemographics(){
        String dbUrl = "jdbc:mysql://localhost:3306/hospital?autoReconnect=true&useSSL=false";
        String query = "UPDATE patienttable SET LastName=?, FirstName=?, MiddleInitial=?, Address=?,"
                + " City=?, State=?, Zip=?, Phone=?, Email=?, SSN=?, DoB=?, Gender=?, Ethnicity=?, "
                + "MaritalStatus=?, Active=?, Comments=? WHERE (CONCAT(FirstName, ' ', LastName)) = ? ";
        String patient = jComboBox1.getSelectedItem().toString().strip();
        
        try 
        {
            // Initialize/register driver class.
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection (dbUrl, "root", "");  
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, jXTextField2.getText());
            stmt.setString(2, jXTextField3.getText());
            stmt.setString(3, jXTextField4.getText());
            stmt.setString(4, jXTextField5.getText());
            stmt.setString(5, jXTextField6.getText());
            stmt.setString(6, jXTextField7.getText());
            stmt.setString(7, jXTextField8.getText());
            stmt.setString(8, jXTextField9.getText());
            stmt.setString(9, jXTextField10.getText());
            stmt.setString(10, jXTextField11.getText());
            stmt.setString(11, jXTextField12.getText());
            stmt.setString(12, jXTextField13.getText());
            stmt.setString(13, jXTextField14.getText());
            stmt.setString(14, jXTextField15.getText());
            stmt.setString(15, jXTextField16.getText());
            stmt.setString(16, jTextArea1.getText());
            stmt.setString(17, patient);
            stmt.executeUpdate();

            con.close();
            JOptionPane.showMessageDialog(rootPane, patient + " updated!");

        }
        catch(Exception e) 
        {
            e.getMessage();
            JOptionPane.showMessageDialog(rootPane, patient + " failed to updated!");
        }
    }
    
    public void deleteSelectedPatient(){
        String dbUrl = "jdbc:mysql://localhost:3306/hospital?autoReconnect=true&useSSL=false";
        String patient = jComboBox1.getSelectedItem().toString().strip();
        String query = "DELETE FROM patienttable WHERE CONCAT(FirstName, ' ', LastName)= ?;";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(dbUrl, "root", "");  
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, patient);
            int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to do delete " + patient + " from the database?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(response == JOptionPane.YES_OPTION){
                int row = stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, row + " row deleted!");
                updatePatientList();
            }
            
            con.close();
            JOptionPane.showMessageDialog(rootPane, patient + " deleted from database!");

        }
        catch(Exception e){
            e.printStackTrace(System.out);
            JOptionPane.showMessageDialog(rootPane, "Failed to delete from database!");
        }       

    }
    
    public void addPatient(){
        String dbUrl = "jdbc:mysql://localhost:3306/hospital?autoReconnect=true&useSSL=false";
        String query = "INSERT INTO patienttable (LastName, FirstName, MiddleInitial, Address, City, State, Zip, Phone, Email, SSN, DoB, Gender, Ethnicity, MaritalStatus, Active, Comments) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(dbUrl, "root", "");  
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, jXTextField2.getText());
            stmt.setString(2, jXTextField3.getText());
            stmt.setString(3, jXTextField4.getText());
            stmt.setString(4, jXTextField5.getText());
            stmt.setString(5, jXTextField6.getText());
            stmt.setString(6, jXTextField7.getText());
            stmt.setString(7, jXTextField8.getText());
            stmt.setString(8, jXTextField9.getText());
            stmt.setString(9, jXTextField10.getText());
            stmt.setString(10, jXTextField11.getText());
            stmt.setString(11, jXTextField12.getText());
            stmt.setString(12, jXTextField13.getText());
            stmt.setString(13, jXTextField14.getText());
            stmt.setString(14, jXTextField15.getText());
            stmt.setString(15, jXTextField16.getText());
            stmt.setString(16, jTextArea1.getText());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(rootPane, jXTextField3.getText() + " " + jXTextField2.getText() + " added to database!");
            updatePatientList();
            con.close();
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Failed to add to database");
            e.printStackTrace(System.out);
        }       
        
        emptyDemoTextFields();

    }
    
    public void selectPatientDemographics(){
        String dbUrl = "jdbc:mysql://localhost:3306/hospital?autoReconnect=true&useSSL=false";
        String patient = jComboBox1.getSelectedItem().toString().strip();
        String query = "SELECT * FROM patienttable WHERE (CONCAT(FirstName, ' ', LastName)) = ?";
        
        emptyDemoTextFields();

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(dbUrl, "root", "");  
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, patient);
            ResultSet rs = stmt.executeQuery();
            
            
            while(rs.next()){
                jXTextField1.setText(rs.getString(1));
                jXTextField2.setText(rs.getString(2));
                jXTextField3.setText(rs.getString(3));
                jXTextField4.setText(rs.getString(4));
                jXTextField5.setText(rs.getString(5));
                jXTextField6.setText(rs.getString(6));
                jXTextField7.setText(rs.getString(7));
                jXTextField8.setText(rs.getString(8));
                jXTextField9.setText(rs.getString(9));
                jXTextField10.setText(rs.getString(10));
                jXTextField11.setText(rs.getString(11));
                jXTextField12.setText(rs.getString(12));
                jXTextField13.setText(rs.getString(13));
                jXTextField14.setText(rs.getString(14));
                jXTextField15.setText(rs.getString(15));
                jXTextField16.setText(rs.getString(16));
                jTextArea1.setText(rs.getString(17));
            }

            disableDemoTextFields();
            jTabbedPane1.setSelectedIndex(1);
            con.close();
            
        }
        catch(Exception e){
            e.getMessage();
        }        

    }
    
    public void selectPatientGenMedHx(){
        String dbUrl = "jdbc:mysql://localhost:3306/hospital?autoReconnect=true&useSSL=false";
        String patient = jComboBox1.getSelectedItem().toString().strip();
        String query = "SELECT * FROM generalmedicalhistorytable INNER JOIN patienttable ON generalmedicalhistorytable.PatientID = patienttable.PatientID WHERE (CONCAT(FirstName, ' ', LastName)) = ?";
        
        emptyGenMedHxTextFields();

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(dbUrl, "root", "");  
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, patient);
            ResultSet rs = stmt.executeQuery();
            
            
            while(rs.next()){
                jXTextField17.setText(rs.getString(1));
                jXTextField18.setText(rs.getString(2));
                jXTextField19.setText(rs.getString(3));
                jXTextField20.setText(rs.getString(4));
                jXTextField21.setText(rs.getString(5));
                jXTextField22.setText(rs.getString(6));
                jXTextField23.setText(rs.getString(7));
                jXTextField24.setText(rs.getString(8));
                jXTextField25.setText(rs.getString(9));
                jXTextField26.setText(rs.getString(10));
                jXTextField27.setText(rs.getString(11));
                jXTextField28.setText(rs.getString(12));
            }

            disableGenMedHxTextFields();
            con.close();
            
        }
        catch(Exception e){
            e.getMessage();
        }     
    }
    
    
///////////////////////////////////////////////////////////////////////////////
    
/////////////////////////////// UTILITY FUNCTIONS /////////////////////////////

    
    public void emptyDemoTextFields(){
        jXTextField1.setText("");
        jXTextField2.setText("");
        jXTextField3.setText("");
        jXTextField4.setText("");
        jXTextField5.setText("");
        jXTextField6.setText("");
        jXTextField7.setText("");
        jXTextField8.setText("");
        jXTextField9.setText("");
        jXTextField10.setText("");
        jXTextField11.setText("");
        jXTextField12.setText("");
        jXTextField13.setText("");
        jXTextField14.setText("");
        jXTextField15.setText("");
        jXTextField16.setText("");
        jTextArea1.setText("");
    }
    
    public void emptyGenMedHxTextFields(){
        jXTextField17.setText("");
        jXTextField18.setText("");
        jXTextField19.setText("");
        jXTextField20.setText("");
        jXTextField21.setText("");
        jXTextField22.setText("");
        jXTextField23.setText("");
        jXTextField24.setText("");
        jXTextField25.setText("");
        jXTextField26.setText("");
        jXTextField27.setText("");
        jXTextField28.setText("");
    }
    
    public void disableDemoTextFields(){
        jXTextField1.setEditable(false);
        jXTextField2.setEditable(false);
        jXTextField3.setEditable(false);
        jXTextField4.setEditable(false);
        jXTextField5.setEditable(false);
        jXTextField6.setEditable(false);
        jXTextField7.setEditable(false);
        jXTextField8.setEditable(false);
        jXTextField9.setEditable(false);
        jXTextField10.setEditable(false);
        jXTextField11.setEditable(false);
        jXTextField12.setEditable(false);
        jXTextField13.setEditable(false);
        jXTextField14.setEditable(false);
        jXTextField15.setEditable(false);
        jXTextField16.setEditable(false);
        jTextArea1.setEditable(false);
        
        jXTextField1.setBackground(Color.LIGHT_GRAY);
        jXTextField2.setBackground(Color.LIGHT_GRAY);
        jXTextField3.setBackground(Color.LIGHT_GRAY);
        jXTextField4.setBackground(Color.LIGHT_GRAY);
        jXTextField5.setBackground(Color.LIGHT_GRAY);
        jXTextField6.setBackground(Color.LIGHT_GRAY);
        jXTextField7.setBackground(Color.LIGHT_GRAY);
        jXTextField8.setBackground(Color.LIGHT_GRAY);
        jXTextField9.setBackground(Color.LIGHT_GRAY);
        jXTextField10.setBackground(Color.LIGHT_GRAY);
        jXTextField11.setBackground(Color.LIGHT_GRAY);
        jXTextField12.setBackground(Color.LIGHT_GRAY);
        jXTextField13.setBackground(Color.LIGHT_GRAY);
        jXTextField14.setBackground(Color.LIGHT_GRAY);
        jXTextField15.setBackground(Color.LIGHT_GRAY);
        jXTextField16.setBackground(Color.LIGHT_GRAY);
        jTextArea1.setBackground(Color.LIGHT_GRAY);
    }
    
    public void disableGenMedHxTextFields(){
        jXTextField17.setEditable(false);
        jXTextField18.setEditable(false);
        jXTextField19.setEditable(false);
        jXTextField20.setEditable(false);
        jXTextField21.setEditable(false);
        jXTextField22.setEditable(false);
        jXTextField23.setEditable(false);
        jXTextField24.setEditable(false);
        jXTextField25.setEditable(false);
        jXTextField26.setEditable(false);
        jXTextField27.setEditable(false);
        jXTextField28.setEditable(false);
        
        jXTextField17.setBackground(Color.LIGHT_GRAY);
        jXTextField18.setBackground(Color.LIGHT_GRAY);
        jXTextField19.setBackground(Color.LIGHT_GRAY);
        jXTextField20.setBackground(Color.LIGHT_GRAY);
        jXTextField21.setBackground(Color.LIGHT_GRAY);
        jXTextField22.setBackground(Color.LIGHT_GRAY);
        jXTextField23.setBackground(Color.LIGHT_GRAY);
        jXTextField24.setBackground(Color.LIGHT_GRAY);
        jXTextField25.setBackground(Color.LIGHT_GRAY);
        jXTextField26.setBackground(Color.LIGHT_GRAY);
        jXTextField27.setBackground(Color.LIGHT_GRAY);
        jXTextField28.setBackground(Color.LIGHT_GRAY);
    }
    
    public void enableDemoTextFields(){
        //jXTextField1.setEditable(true); // do NOT enable the patient ID field
        jXTextField2.setEditable(true);
        jXTextField3.setEditable(true);
        jXTextField4.setEditable(true);
        jXTextField5.setEditable(true);
        jXTextField6.setEditable(true);
        jXTextField7.setEditable(true);
        jXTextField8.setEditable(true);
        jXTextField9.setEditable(true);
        jXTextField10.setEditable(true);
        jXTextField11.setEditable(true);
        jXTextField12.setEditable(true);
        jXTextField13.setEditable(true);
        jXTextField14.setEditable(true);
        jXTextField15.setEditable(true);
        jXTextField16.setEditable(true);
        jTextArea1.setEditable(true);
        
        //jXTextField1.setBackground(Color.WHITE);
        jXTextField2.setBackground(Color.WHITE);
        jXTextField3.setBackground(Color.WHITE);
        jXTextField4.setBackground(Color.WHITE);
        jXTextField5.setBackground(Color.WHITE);
        jXTextField6.setBackground(Color.WHITE);
        jXTextField7.setBackground(Color.WHITE);
        jXTextField8.setBackground(Color.WHITE);
        jXTextField9.setBackground(Color.WHITE);
        jXTextField10.setBackground(Color.WHITE);
        jXTextField11.setBackground(Color.WHITE);
        jXTextField12.setBackground(Color.WHITE);
        jXTextField13.setBackground(Color.WHITE);
        jXTextField14.setBackground(Color.WHITE);
        jXTextField15.setBackground(Color.WHITE);
        jXTextField16.setBackground(Color.WHITE);
        jTextArea1.setBackground(Color.WHITE);
    }
    
    public void confirmNewInterview(){
        int reply = JOptionPane.showConfirmDialog(null, "Start new interview for " + jComboBox1.getSelectedItem().toString().strip() + "?", "Confirm", JOptionPane.YES_NO_OPTION);
    }
    
    
    
///////////////////////////////////////////////////////////////////////////////
    
/////////////////////////////// GEN MED HX INTERVIEW //////////////////////////
    
    
    
    
    
    
    
    
    
    
///////////////////////////////////////////////////////////////////////////////

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddPatient;
    private javax.swing.JButton jButtonClearTextFields;
    private javax.swing.JButton jButtonDeletePatient;
    private javax.swing.JButton jButtonEditDemographics;
    private javax.swing.JButton jButtonNewGenMedHxInterview;
    private javax.swing.JButton jButtonNewPatient;
    private javax.swing.JButton jButtonSaveDemographics;
    private javax.swing.JButton jButtonSelectPatient;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private org.jdesktop.swingx.JXTextField jXTextField1;
    private org.jdesktop.swingx.JXTextField jXTextField10;
    private org.jdesktop.swingx.JXTextField jXTextField11;
    private org.jdesktop.swingx.JXTextField jXTextField12;
    private org.jdesktop.swingx.JXTextField jXTextField13;
    private org.jdesktop.swingx.JXTextField jXTextField14;
    private org.jdesktop.swingx.JXTextField jXTextField15;
    private org.jdesktop.swingx.JXTextField jXTextField16;
    private org.jdesktop.swingx.JXTextField jXTextField17;
    private org.jdesktop.swingx.JXTextField jXTextField18;
    private org.jdesktop.swingx.JXTextField jXTextField19;
    private org.jdesktop.swingx.JXTextField jXTextField2;
    private org.jdesktop.swingx.JXTextField jXTextField20;
    private org.jdesktop.swingx.JXTextField jXTextField21;
    private org.jdesktop.swingx.JXTextField jXTextField22;
    private org.jdesktop.swingx.JXTextField jXTextField23;
    private org.jdesktop.swingx.JXTextField jXTextField24;
    private org.jdesktop.swingx.JXTextField jXTextField25;
    private org.jdesktop.swingx.JXTextField jXTextField26;
    private org.jdesktop.swingx.JXTextField jXTextField27;
    private org.jdesktop.swingx.JXTextField jXTextField28;
    private org.jdesktop.swingx.JXTextField jXTextField3;
    private org.jdesktop.swingx.JXTextField jXTextField4;
    private org.jdesktop.swingx.JXTextField jXTextField5;
    private org.jdesktop.swingx.JXTextField jXTextField6;
    private org.jdesktop.swingx.JXTextField jXTextField7;
    private org.jdesktop.swingx.JXTextField jXTextField8;
    private org.jdesktop.swingx.JXTextField jXTextField9;
    // End of variables declaration//GEN-END:variables
}
