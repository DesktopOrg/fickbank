/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import Model.Cliente;
import Model.Conta;
import controllers.DashboardController;
import javax.swing.JLabel;

/**
 *
 * @author kassia
 */
public class AdmView extends javax.swing.JFrame {

    DashboardController controller;
    /**
     * Creates new form Dashboard
     */
    public AdmView() {
        initComponents();
    }

    public AdmView(Conta conta, Cliente cliente) {
        initComponents();
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background1 = new javax.swing.JPanel();
        pnl_header = new javax.swing.JPanel();
        logo1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        pnl_solicitacao = new javax.swing.JPanel();
        icon_pagamentos1 = new javax.swing.JLabel();
        lbl_pagamentos1 = new javax.swing.JLabel();
        pnl_pagamento = new javax.swing.JPanel();
        icon_pagamentos = new javax.swing.JLabel();
        lbl_pagamentos = new javax.swing.JLabel();
        pnl_extrato = new javax.swing.JPanel();
        icon_extrato = new javax.swing.JLabel();
        icon_pagamentos4 = new javax.swing.JLabel();
        lbl_extrato = new javax.swing.JLabel();
        pnl_resumo = new javax.swing.JPanel();
        icon_extrato1 = new javax.swing.JLabel();
        pnl_sair = new javax.swing.JPanel();
        icon_pagamentos3 = new javax.swing.JLabel();
        lbl_pagamentos3 = new javax.swing.JLabel();
        pnl_dadosPessoais = new javax.swing.JPanel();
        Scrll_solicitacao = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        lbl_saldo5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btn_atualizar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_aprovar = new javax.swing.JButton();
        btn_recusar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administrador");

        background1.setBackground(new java.awt.Color(255, 255, 255));

        pnl_header.setBackground(new java.awt.Color(255, 104, 104));

        logo1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo_LATERAL.png"))); // NOI18N
        logo1.setToolTipText("Ficbank");

        jLabel5.setFont(jLabel5.getFont().deriveFont(jLabel5.getFont().getStyle() | java.awt.Font.BOLD, jLabel5.getFont().getSize()+12));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Recursos Administrativos");

        javax.swing.GroupLayout pnl_headerLayout = new javax.swing.GroupLayout(pnl_header);
        pnl_header.setLayout(pnl_headerLayout);
        pnl_headerLayout.setHorizontalGroup(
            pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_headerLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(logo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        pnl_headerLayout.setVerticalGroup(
            pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_headerLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logo1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMenu.setBackground(new java.awt.Color(49, 55, 78));

        pnl_solicitacao.setBackground(new java.awt.Color(73, 83, 122));
        pnl_solicitacao.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pnl_solicitacao.setPreferredSize(new java.awt.Dimension(161, 71));

        icon_pagamentos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_pagamentos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/notification_bell [#1398].png"))); // NOI18N
        icon_pagamentos1.setToolTipText("Extrato");

        lbl_pagamentos1.setFont(lbl_pagamentos1.getFont().deriveFont(lbl_pagamentos1.getFont().getSize()+7f));
        lbl_pagamentos1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_pagamentos1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_pagamentos1.setText("REQUISIÇÕES");

        javax.swing.GroupLayout pnl_solicitacaoLayout = new javax.swing.GroupLayout(pnl_solicitacao);
        pnl_solicitacao.setLayout(pnl_solicitacaoLayout);
        pnl_solicitacaoLayout.setHorizontalGroup(
            pnl_solicitacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_solicitacaoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(icon_pagamentos1)
                .addGap(18, 18, 18)
                .addComponent(lbl_pagamentos1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_solicitacaoLayout.setVerticalGroup(
            pnl_solicitacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_solicitacaoLayout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(icon_pagamentos1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_solicitacaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_pagamentos1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnl_pagamento.setBackground(new java.awt.Color(49, 55, 78));
        pnl_pagamento.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pnl_pagamento.setPreferredSize(new java.awt.Dimension(161, 71));
        pnl_pagamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl_pagamentoMouseEntered(evt);
            }
        });

        icon_pagamentos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_pagamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/dollar [#1189].png"))); // NOI18N
        icon_pagamentos.setToolTipText("Extrato");

        lbl_pagamentos.setFont(lbl_pagamentos.getFont().deriveFont(lbl_pagamentos.getFont().getSize()+7f));
        lbl_pagamentos.setForeground(new java.awt.Color(255, 255, 255));
        lbl_pagamentos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_pagamentos.setText("CLIENTES");

        javax.swing.GroupLayout pnl_pagamentoLayout = new javax.swing.GroupLayout(pnl_pagamento);
        pnl_pagamento.setLayout(pnl_pagamentoLayout);
        pnl_pagamentoLayout.setHorizontalGroup(
            pnl_pagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_pagamentoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(icon_pagamentos)
                .addGap(18, 18, 18)
                .addComponent(lbl_pagamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        pnl_pagamentoLayout.setVerticalGroup(
            pnl_pagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_pagamentoLayout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addComponent(icon_pagamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnl_pagamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_pagamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_extrato.setBackground(new java.awt.Color(49, 55, 78));
        pnl_extrato.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pnl_extrato.setPreferredSize(new java.awt.Dimension(161, 71));

        icon_extrato.setToolTipText("Extrato");

        icon_pagamentos4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_pagamentos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/file_text_data [#1700].png"))); // NOI18N
        icon_pagamentos4.setToolTipText("Extrato");

        lbl_extrato.setBackground(new java.awt.Color(76, 81, 103));
        lbl_extrato.setFont(lbl_extrato.getFont().deriveFont(lbl_extrato.getFont().getSize()+7f));
        lbl_extrato.setForeground(new java.awt.Color(255, 255, 255));
        lbl_extrato.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_extrato.setText("CONTAS");

        javax.swing.GroupLayout pnl_extratoLayout = new javax.swing.GroupLayout(pnl_extrato);
        pnl_extrato.setLayout(pnl_extratoLayout);
        pnl_extratoLayout.setHorizontalGroup(
            pnl_extratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_extratoLayout.createSequentialGroup()
                .addGroup(pnl_extratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_extratoLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(icon_extrato))
                    .addGroup(pnl_extratoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(icon_pagamentos4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_extrato, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_extratoLayout.setVerticalGroup(
            pnl_extratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_extratoLayout.createSequentialGroup()
                .addGroup(pnl_extratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icon_pagamentos4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_extratoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_extrato, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(icon_extrato)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_resumo.setBackground(new java.awt.Color(49, 55, 78));
        pnl_resumo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pnl_resumo.setPreferredSize(new java.awt.Dimension(161, 71));

        icon_extrato1.setToolTipText("Extrato");

        pnl_sair.setBackground(new java.awt.Color(49, 55, 78));
        pnl_sair.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pnl_sair.setPreferredSize(new java.awt.Dimension(161, 71));

        icon_pagamentos3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_pagamentos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/door [#45].png"))); // NOI18N
        icon_pagamentos3.setToolTipText("Extrato");

        lbl_pagamentos3.setFont(lbl_pagamentos3.getFont().deriveFont(lbl_pagamentos3.getFont().getSize()+7f));
        lbl_pagamentos3.setForeground(new java.awt.Color(255, 255, 255));
        lbl_pagamentos3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_pagamentos3.setText("SAIR");

        javax.swing.GroupLayout pnl_sairLayout = new javax.swing.GroupLayout(pnl_sair);
        pnl_sair.setLayout(pnl_sairLayout);
        pnl_sairLayout.setHorizontalGroup(
            pnl_sairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_sairLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(icon_pagamentos3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_pagamentos3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_sairLayout.setVerticalGroup(
            pnl_sairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_sairLayout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(icon_pagamentos3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnl_sairLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_pagamentos3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_resumoLayout = new javax.swing.GroupLayout(pnl_resumo);
        pnl_resumo.setLayout(pnl_resumoLayout);
        pnl_resumoLayout.setHorizontalGroup(
            pnl_resumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_resumoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(icon_extrato1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnl_sair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
        );
        pnl_resumoLayout.setVerticalGroup(
            pnl_resumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_resumoLayout.createSequentialGroup()
                .addComponent(pnl_sair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(icon_extrato1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_dadosPessoais.setBackground(new java.awt.Color(49, 55, 78));
        pnl_dadosPessoais.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pnl_dadosPessoais.setPreferredSize(new java.awt.Dimension(161, 71));

        javax.swing.GroupLayout pnl_dadosPessoaisLayout = new javax.swing.GroupLayout(pnl_dadosPessoais);
        pnl_dadosPessoais.setLayout(pnl_dadosPessoaisLayout);
        pnl_dadosPessoaisLayout.setHorizontalGroup(
            pnl_dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnl_dadosPessoaisLayout.setVerticalGroup(
            pnl_dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_resumo, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
            .addComponent(pnl_solicitacao, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
            .addComponent(pnl_pagamento, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
            .addComponent(pnl_extrato, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
            .addComponent(pnl_dadosPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_solicitacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_extrato, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_resumo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_dadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTable2);

        jPanel7.setBackground(new java.awt.Color(255, 104, 104));

        lbl_saldo5.setFont(lbl_saldo5.getFont().deriveFont(lbl_saldo5.getFont().getStyle() | java.awt.Font.BOLD, lbl_saldo5.getFont().getSize()+8));
        lbl_saldo5.setForeground(new java.awt.Color(255, 255, 255));
        lbl_saldo5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_saldo5.setText("Requisições");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 796, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lbl_saldo5, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(62, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lbl_saldo5, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("ID da Requisição:");

        jTextField1.setText("jTextField1");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_atualizar.setText("Atualizar");
        btn_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atualizarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("ID:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Remetente:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("jLabel8");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setText("jLabel8");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("Destinatário:");

        btn_aprovar.setText("Aprovar");

        btn_recusar.setText("Recusar");
        btn_recusar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_recusarActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel13.setText("jLabel12");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel14.setText("Data:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel12.setText("jLabel12");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setText("Operação:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("jLabel7");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Valor:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addContainerGap(680, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(84, 84, 84)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addGap(76, 76, 76)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addGap(81, 81, 81))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addGap(386, 386, 386)
                        .addComponent(btn_recusar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_aprovar)
                        .addGap(63, 63, 63))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_recusar)
                        .addComponent(btn_aprovar)))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(319, 319, 319)
                        .addComponent(btn_atualizar)
                        .addContainerGap())
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane4)
                        .addGap(80, 80, 80))))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(49, 49, 49)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(btn_atualizar))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addGap(107, 107, 107))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(569, Short.MAX_VALUE)))
        );

        Scrll_solicitacao.setViewportView(jPanel4);

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background1Layout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Scrll_solicitacao))
        );
        background1Layout.setVerticalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addComponent(pnl_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Scrll_solicitacao, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pnl_pagamentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_pagamentoMouseEntered
            // TODO add your handling code here:
    }//GEN-LAST:event_pnl_pagamentoMouseEntered

    private void btn_recusarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_recusarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_recusarActionPerformed

    private void btn_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_atualizarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AdmView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdmView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdmView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdmView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdmView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Scrll_solicitacao;
    private javax.swing.JPanel background1;
    private javax.swing.JButton btn_aprovar;
    private javax.swing.JButton btn_atualizar;
    private javax.swing.JButton btn_recusar;
    private javax.swing.JLabel icon_extrato;
    private javax.swing.JLabel icon_extrato1;
    private javax.swing.JLabel icon_pagamentos;
    private javax.swing.JLabel icon_pagamentos1;
    private javax.swing.JLabel icon_pagamentos3;
    private javax.swing.JLabel icon_pagamentos4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_extrato;
    private javax.swing.JLabel lbl_pagamentos;
    private javax.swing.JLabel lbl_pagamentos1;
    private javax.swing.JLabel lbl_pagamentos3;
    private javax.swing.JLabel lbl_saldo5;
    private javax.swing.JLabel logo1;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel pnl_dadosPessoais;
    private javax.swing.JPanel pnl_extrato;
    private javax.swing.JPanel pnl_header;
    private javax.swing.JPanel pnl_pagamento;
    private javax.swing.JPanel pnl_resumo;
    private javax.swing.JPanel pnl_sair;
    private javax.swing.JPanel pnl_solicitacao;
    // End of variables declaration//GEN-END:variables


}
