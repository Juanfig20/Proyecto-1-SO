/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Clases;

import java.io.File;
import java.io.PrintWriter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author manza
 */
public class Interfaz extends javax.swing.JFrame {
    
    static Empresa apple;
    static Empresa hp;
    
    /**
     * Creates new form Interface
     */
    
    public Interfaz(Empresa apple, Empresa hp, int [] numTrabajadoresInicialesA, int [] numTrabajadoresInicialesH) {
        initComponents();
        this.apple = apple;
        this.hp = hp;
        
        // ---------------------- Interfaz Ventana: Menú ----------------------
        
        //Deadline
        this.deadline.setValue(apple.getDeadline());
        
        //Duración del día
        this.duracionDia.setValue(apple.getDuracion());
        
        //Trabajadores iniciales Apple
        this.numPlacaBase_Apple.setText(String.valueOf(numTrabajadoresInicialesA[0]));
        this.numCPUS_Apple.setText(String.valueOf(numTrabajadoresInicialesA[1]));
        this.numRAM_Apple.setText(String.valueOf(numTrabajadoresInicialesA[2]));
        this.numFuente_Apple.setText(String.valueOf(numTrabajadoresInicialesA[3]));
        this.numTGraficas_Apple.setText(String.valueOf(numTrabajadoresInicialesA[4]));
        this.numEnsambladores_Apple.setText(String.valueOf(numTrabajadoresInicialesA[5]));
        
        //Trabajadores iniciales HP
        this.numPlacaBase_HP.setText(String.valueOf(numTrabajadoresInicialesH[0]));
        this.numCPUS_HP.setText(String.valueOf(numTrabajadoresInicialesH[1]));
        this.numRAM_HP.setText(String.valueOf(numTrabajadoresInicialesH[2]));
        this.numFuentes_HP.setText(String.valueOf(numTrabajadoresInicialesH[3]));
        this.numTGraficas_HP.setText(String.valueOf(numTrabajadoresInicialesH[4]));
        this.numEnsambladores_HP.setText(String.valueOf(numTrabajadoresInicialesH[5]));
        
        // ---------------------- Interfaz Ventana: Apple ----------------------
        
        //Lista de trabajadores
        this.numTrabajadoresPB_Apple.setText(String.valueOf(numTrabajadoresInicialesA[0]));
        this.numTrabajadoresCPU_Apple.setText(String.valueOf(numTrabajadoresInicialesA[1]));
        this.numTrabajadoresRAM_Apple.setText(String.valueOf(numTrabajadoresInicialesA[2]));
        this.numTrabajadoresFuente_Apple.setText(String.valueOf(numTrabajadoresInicialesA[3]));
        this.numTrabajadoresTG_Apple.setText(String.valueOf(numTrabajadoresInicialesA[4]));
        this.numTrabajadoresEnsamb_Apple.setText(String.valueOf(numTrabajadoresInicialesA[5]));
        
        //Almacen
        JLabel [] piezasAlmacen_Apple = {placasEnStock_Apple, CPUsEnStock_Apple, RAMsEnStock_Apple, fuentesEnStock_Apple, tGraficasEnStock_Apple, cantCompEstandarListos_Apple, cantCompTGListos_Apple, ganancias_Apple};
        apple.getAlmacen().setLabels(piezasAlmacen_Apple);
        
        //Project Manager / Director
        JLabel [] datosDirector_Apple = {nroFaltasPM_Apple, sueldoDescontadoPM_Apple, estadoDirector_Apple, diasRestantes_Apple};
        apple.getDirector().setLabels(datosDirector_Apple);
        
        JLabel [] datosPM_Apple = {estadoPM_Apple, costos_Apple, utilidad_Apple, diasRestantes_Apple, diasTranscurridos_Apple};
        apple.getPm().setLabels(datosPM_Apple);
        
        
        // ---------------------- Interfaz Ventana: HP ----------------------
        
        //Lista de trabajadores
        this.numTrabajadoresPB_HP.setText(String.valueOf(numTrabajadoresInicialesH[0]));
        this.numTrabajadoresCPU_HP.setText(String.valueOf(numTrabajadoresInicialesH[1]));
        this.numTrabajadoresRAM_HP.setText(String.valueOf(numTrabajadoresInicialesH[2]));
        this.numTrabajadoresFuente_HP.setText(String.valueOf(numTrabajadoresInicialesH[3]));
        this.numTrabajadoresTG_HP.setText(String.valueOf(numTrabajadoresInicialesH[4]));
        this.numTrabajadoresEnsamb_HP.setText(String.valueOf(numTrabajadoresInicialesH[5]));
        
        //Almacen
        JLabel [] piezasAlmacen_HP = {placasEnStock_HP, CPUsEnStock_HP, RAMsEnStock_HP, fuentesEnStock_HP, tGraficasEnStock_HP, cantCompEstandarListos_HP, cantCompTGListos_HP, ganancias_HP};
        hp.getAlmacen().setLabels(piezasAlmacen_HP);
        
        //Project Manager / Director
        JLabel [] datosDirector_HP = {nroFaltasPM_HP, sueldoDescontadoPM_HP, estadoDirector_HP, diasRestantes_HP};
        hp.getDirector().setLabels(datosDirector_HP);
        
        JLabel [] datosPM_HP = {estadoPM_HP, costos_HP, utilidad_HP, diasRestantes_HP, diasTranscurridos_HP};
        hp.getPm().setLabels(datosPM_HP);
        
        
        // ---------------------- Interfaz Ventana: Gráfico ----------------------
        
        Grafico grafica = new Grafico(grafico, apple, hp);
        apple.getPm().setGrafico(grafica);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        ventanaMenu = new javax.swing.JPanel();
        tituloMenu = new javax.swing.JLabel();
        duracionDiaLabel = new javax.swing.JLabel();
        deadlineLabel = new javax.swing.JLabel();
        duracionDia = new javax.swing.JSpinner();
        deadline = new javax.swing.JSpinner();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        numPlacaBase_Apple = new javax.swing.JLabel();
        numCPUS_Apple = new javax.swing.JLabel();
        numRAM_Apple = new javax.swing.JLabel();
        numFuente_Apple = new javax.swing.JLabel();
        numTGraficas_Apple = new javax.swing.JLabel();
        removePlacaBase_Apple = new javax.swing.JButton();
        removeCPU_Apple = new javax.swing.JButton();
        removeRAM_Apple = new javax.swing.JButton();
        removeFuente_Apple = new javax.swing.JButton();
        removeTGrafica_Apple = new javax.swing.JButton();
        addPlacaBase_Apple = new javax.swing.JButton();
        addCPU_Apple = new javax.swing.JButton();
        addRAM_Apple = new javax.swing.JButton();
        addFuente_Apple = new javax.swing.JButton();
        addTGrafica_Apple = new javax.swing.JButton();
        ensambladorMenu_Apple = new javax.swing.JLabel();
        numEnsambladores_Apple = new javax.swing.JLabel();
        removeEnsamblador_Apple = new javax.swing.JButton();
        addEnsamblador_Apple = new javax.swing.JButton();
        placaBaseMenu_Apple = new javax.swing.JLabel();
        cpusMenu_Apple = new javax.swing.JLabel();
        memoriaRAMMenu_Apple = new javax.swing.JLabel();
        fuentesMenu_Apple = new javax.swing.JLabel();
        tarjetaGraficaMenu_Apple = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        addEnsamblador_HP = new javax.swing.JButton();
        numEnsambladores_HP = new javax.swing.JLabel();
        removeEnsamblador_HP = new javax.swing.JButton();
        numPlacaBase_HP = new javax.swing.JLabel();
        ensambladoresMenu_HP = new javax.swing.JLabel();
        numCPUS_HP = new javax.swing.JLabel();
        numRAM_HP = new javax.swing.JLabel();
        numFuentes_HP = new javax.swing.JLabel();
        numTGraficas_HP = new javax.swing.JLabel();
        removeTGrafica_HP = new javax.swing.JButton();
        removePlacaBase_HP = new javax.swing.JButton();
        removeCPU_HP = new javax.swing.JButton();
        removeRAM_HP = new javax.swing.JButton();
        removeFuente_HP = new javax.swing.JButton();
        addPlacaBase_HP = new javax.swing.JButton();
        addCPU_HP = new javax.swing.JButton();
        addRAM_HP = new javax.swing.JButton();
        addFuente_HP = new javax.swing.JButton();
        addTGrafica_HP = new javax.swing.JButton();
        placaBaseMenu_HP = new javax.swing.JLabel();
        cpusMenu_HP = new javax.swing.JLabel();
        memoriaRAMMenu_HP = new javax.swing.JLabel();
        fuentesMenu_HP = new javax.swing.JLabel();
        tarjetasGraficasMenu_HP = new javax.swing.JLabel();
        guardarCambios = new javax.swing.JButton();
        iniciarSimulacion = new javax.swing.JButton();
        ventanaApple = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        placasEnStock_Apple = new javax.swing.JLabel();
        CPUsEnStock_Apple = new javax.swing.JLabel();
        RAMsEnStock_Apple = new javax.swing.JLabel();
        fuentesEnStock_Apple = new javax.swing.JLabel();
        tGraficasEnStock_Apple = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cantCompEstandarListos_Apple = new javax.swing.JLabel();
        compEstandarLabel_Apple = new javax.swing.JLabel();
        compConTGLabel_Apple = new javax.swing.JLabel();
        cantCompTGListos_Apple = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        fuentesLabel_Apple = new javax.swing.JLabel();
        removeNumFuente_Apple = new javax.swing.JButton();
        RAMLabel_Apple = new javax.swing.JLabel();
        removeNumRAM_Apple = new javax.swing.JButton();
        CPUsLabel_Apple = new javax.swing.JLabel();
        removeNumCPUs_Apple = new javax.swing.JButton();
        placaBaseLabel_Apple = new javax.swing.JLabel();
        removeNumPB_Apple = new javax.swing.JButton();
        numTrabajadoresFuente_Apple = new javax.swing.JLabel();
        numTrabajadoresRAM_Apple = new javax.swing.JLabel();
        numTrabajadoresCPU_Apple = new javax.swing.JLabel();
        numTrabajadoresPB_Apple = new javax.swing.JLabel();
        numTrabajadoresTG_Apple = new javax.swing.JLabel();
        labelTrabajadores = new javax.swing.JLabel();
        removeNumEnsamb_Apple = new javax.swing.JButton();
        ensambladoresLabel_Apple = new javax.swing.JLabel();
        addNumEnsamb_Apple = new javax.swing.JButton();
        numTrabajadoresEnsamb_Apple = new javax.swing.JLabel();
        addNumTG_Apple = new javax.swing.JButton();
        addNumFuente_Apple = new javax.swing.JButton();
        addNumRAM_Apple = new javax.swing.JButton();
        addNumCPUs_Apple = new javax.swing.JButton();
        removeNumTG_Apple = new javax.swing.JButton();
        addNumPB_Apple = new javax.swing.JButton();
        tGraficaLabel_Apple = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        estadoPMLabel_Apple = new javax.swing.JLabel();
        nroFaltasPMLabel_Apple = new javax.swing.JLabel();
        sueldoDescontadoPMLabel_Apple = new javax.swing.JLabel();
        estadoPM_Apple = new javax.swing.JLabel();
        nroFaltasPM_Apple = new javax.swing.JLabel();
        sueldoDescontadoPM_Apple = new javax.swing.JLabel();
        estadoDirectorLabel_Apple = new javax.swing.JLabel();
        estadoDirector_Apple = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        ganaciasLabel_Apple = new javax.swing.JLabel();
        costosLabel_Apple = new javax.swing.JLabel();
        utilidadLabel_Apple = new javax.swing.JLabel();
        diasRestantesLabel_Apple = new javax.swing.JLabel();
        ganancias_Apple = new javax.swing.JLabel();
        costos_Apple = new javax.swing.JLabel();
        utilidad_Apple = new javax.swing.JLabel();
        diasRestantes_Apple = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        iconHP1 = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        diasTranscurridosLabelA = new javax.swing.JLabel();
        diasTranscurridos_Apple = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        ventanaHP = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        fuentesLabel_HP = new javax.swing.JLabel();
        removeNumFuente_HP = new javax.swing.JButton();
        RAMLabel_HP = new javax.swing.JLabel();
        removeNumRAM_HP = new javax.swing.JButton();
        CPUsLabel_HP = new javax.swing.JLabel();
        removeNumCPUs_HP = new javax.swing.JButton();
        placaBaseLabel_HP = new javax.swing.JLabel();
        removeNumPB_HP = new javax.swing.JButton();
        numTrabajadoresFuente_HP = new javax.swing.JLabel();
        numTrabajadoresRAM_HP = new javax.swing.JLabel();
        numTrabajadoresCPU_HP = new javax.swing.JLabel();
        numTrabajadoresPB_HP = new javax.swing.JLabel();
        numTrabajadoresTG_HP = new javax.swing.JLabel();
        labelTrabajadores1 = new javax.swing.JLabel();
        removeNumEnsamb_HP = new javax.swing.JButton();
        ensambladoresLabel_HP = new javax.swing.JLabel();
        addNumEnsamb_HP = new javax.swing.JButton();
        numTrabajadoresEnsamb_HP = new javax.swing.JLabel();
        addNumTG_HP = new javax.swing.JButton();
        addNumFuente_HP = new javax.swing.JButton();
        addNumRAM_HP = new javax.swing.JButton();
        addNumCPUs_HP = new javax.swing.JButton();
        removeNumTG_HP = new javax.swing.JButton();
        addNumPB_HP = new javax.swing.JButton();
        tGraficaLabel_HP = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        placasEnStock_HP = new javax.swing.JLabel();
        CPUsEnStock_HP = new javax.swing.JLabel();
        RAMsEnStock_HP = new javax.swing.JLabel();
        fuentesEnStock_HP = new javax.swing.JLabel();
        tGraficasEnStock_HP = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        cantCompEstandarListos_HP = new javax.swing.JLabel();
        compEstandarLabel_HP = new javax.swing.JLabel();
        compConTGLabel_HP = new javax.swing.JLabel();
        cantCompTGListos_HP = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        ganaciasLabel_HP = new javax.swing.JLabel();
        costosLabel_HP = new javax.swing.JLabel();
        utilidadLabel_HP = new javax.swing.JLabel();
        diasRestantesLabel_HP = new javax.swing.JLabel();
        ganancias_HP = new javax.swing.JLabel();
        costos_HP = new javax.swing.JLabel();
        utilidad_HP = new javax.swing.JLabel();
        diasRestantes_HP = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        estadoPMLabel_HP = new javax.swing.JLabel();
        nroFaltasPMLabel_HP = new javax.swing.JLabel();
        sueldoDescontadoPMLabel_HP = new javax.swing.JLabel();
        estadoPM_HP = new javax.swing.JLabel();
        nroFaltasPM_HP = new javax.swing.JLabel();
        sueldoDescontadoPM_HP = new javax.swing.JLabel();
        estadoDirectorLabel_HP = new javax.swing.JLabel();
        estadoDirector_HP = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        iconHP = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        labelDiasTranscurridos = new javax.swing.JLabel();
        diasTranscurridos_HP = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        ventanaGrafico = new javax.swing.JPanel();
        grafico = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));

        ventanaMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloMenu.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloMenu.setText("CONFIGURACIONES");
        ventanaMenu.add(tituloMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 22, -1, -1));

        duracionDiaLabel.setText("Duración de un día");
        ventanaMenu.add(duracionDiaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 83, -1, -1));

        deadlineLabel.setText("Días límites");
        ventanaMenu.add(deadlineLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 83, -1, -1));

        duracionDia.setModel(new javax.swing.SpinnerNumberModel(1000, 1000, null, 1000));
        ventanaMenu.add(duracionDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 80, 80, -1));

        deadline.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        ventanaMenu.add(deadline, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 80, 80, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/LogoApple.jpg"))); // NOI18N
        jLabel26.setText("jLabel26");
        ventanaMenu.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 179, -1));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/LogoHP.png"))); // NOI18N
        jLabel28.setText("jLabel28");
        ventanaMenu.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 198, -1));

        numPlacaBase_Apple.setText("0");

        numCPUS_Apple.setText("0");

        numRAM_Apple.setText("0");

        numFuente_Apple.setText("0");

        numTGraficas_Apple.setText("0");

        removePlacaBase_Apple.setText("-");
        removePlacaBase_Apple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removePlacaBase_AppleActionPerformed(evt);
            }
        });

        removeCPU_Apple.setText("-");
        removeCPU_Apple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCPU_AppleActionPerformed(evt);
            }
        });

        removeRAM_Apple.setText("-");
        removeRAM_Apple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeRAM_AppleActionPerformed(evt);
            }
        });

        removeFuente_Apple.setText("-");
        removeFuente_Apple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeFuente_AppleActionPerformed(evt);
            }
        });

        removeTGrafica_Apple.setText("-");
        removeTGrafica_Apple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeTGrafica_AppleActionPerformed(evt);
            }
        });

        addPlacaBase_Apple.setText("+");
        addPlacaBase_Apple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPlacaBase_AppleActionPerformed(evt);
            }
        });

        addCPU_Apple.setText("+");
        addCPU_Apple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCPU_AppleActionPerformed(evt);
            }
        });

        addRAM_Apple.setText("+");
        addRAM_Apple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRAM_AppleActionPerformed(evt);
            }
        });

        addFuente_Apple.setText("+");
        addFuente_Apple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFuente_AppleActionPerformed(evt);
            }
        });

        addTGrafica_Apple.setText("+");
        addTGrafica_Apple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTGrafica_AppleActionPerformed(evt);
            }
        });

        ensambladorMenu_Apple.setText("Ensambladores:");

        numEnsambladores_Apple.setText("0");

        removeEnsamblador_Apple.setText("-");
        removeEnsamblador_Apple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeEnsamblador_AppleActionPerformed(evt);
            }
        });

        addEnsamblador_Apple.setText("+");
        addEnsamblador_Apple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEnsamblador_AppleActionPerformed(evt);
            }
        });

        placaBaseMenu_Apple.setText("Productores de placas bases:");

        cpusMenu_Apple.setText("Productores de CPUs:");

        memoriaRAMMenu_Apple.setText("Productores de memoria RAM:");

        fuentesMenu_Apple.setText("Productores de fuentes:");

        tarjetaGraficaMenu_Apple.setText("Productores de tarjetas gráficas:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(memoriaRAMMenu_Apple)
                        .addGap(40, 40, 40)
                        .addComponent(removeRAM_Apple)
                        .addGap(12, 12, 12)
                        .addComponent(numRAM_Apple)
                        .addGap(12, 12, 12)
                        .addComponent(addRAM_Apple))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(fuentesMenu_Apple)
                        .addGap(78, 78, 78)
                        .addComponent(removeFuente_Apple)
                        .addGap(12, 12, 12)
                        .addComponent(numFuente_Apple)
                        .addGap(12, 12, 12)
                        .addComponent(addFuente_Apple))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tarjetaGraficaMenu_Apple)
                            .addComponent(ensambladorMenu_Apple))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(removeTGrafica_Apple)
                                .addGap(12, 12, 12)
                                .addComponent(numTGraficas_Apple)
                                .addGap(12, 12, 12)
                                .addComponent(addTGrafica_Apple))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(removeEnsamblador_Apple)
                                .addGap(12, 12, 12)
                                .addComponent(numEnsambladores_Apple)
                                .addGap(12, 12, 12)
                                .addComponent(addEnsamblador_Apple))))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(placaBaseMenu_Apple)
                            .addGap(50, 50, 50)
                            .addComponent(removePlacaBase_Apple)
                            .addGap(12, 12, 12)
                            .addComponent(numPlacaBase_Apple)
                            .addGap(12, 12, 12)
                            .addComponent(addPlacaBase_Apple))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(cpusMenu_Apple)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(removeCPU_Apple)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(numCPUS_Apple)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(addCPU_Apple))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removePlacaBase_Apple)
                    .addComponent(addPlacaBase_Apple)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(placaBaseMenu_Apple)
                            .addComponent(numPlacaBase_Apple))))
                .addGap(17, 17, 17)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cpusMenu_Apple)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(numCPUS_Apple)
                        .addComponent(addCPU_Apple)
                        .addComponent(removeCPU_Apple)))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeRAM_Apple)
                    .addComponent(addRAM_Apple)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(memoriaRAMMenu_Apple)
                            .addComponent(numRAM_Apple))))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeFuente_Apple)
                    .addComponent(addFuente_Apple)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fuentesMenu_Apple)
                            .addComponent(numFuente_Apple))))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeTGrafica_Apple)
                    .addComponent(addTGrafica_Apple)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tarjetaGraficaMenu_Apple)
                            .addComponent(numTGraficas_Apple))))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ensambladorMenu_Apple)
                    .addComponent(removeEnsamblador_Apple)
                    .addComponent(addEnsamblador_Apple)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(numEnsambladores_Apple)))
                .addGap(32, 32, 32))
        );

        ventanaMenu.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 227, -1, -1));

        addEnsamblador_HP.setText("+");
        addEnsamblador_HP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEnsamblador_HPActionPerformed(evt);
            }
        });

        numEnsambladores_HP.setText("0");

        removeEnsamblador_HP.setText("-");
        removeEnsamblador_HP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeEnsamblador_HPActionPerformed(evt);
            }
        });

        numPlacaBase_HP.setText("0");

        ensambladoresMenu_HP.setText("Ensambladores:");

        numCPUS_HP.setText("0");

        numRAM_HP.setText("0");

        numFuentes_HP.setText("0");

        numTGraficas_HP.setText("0");

        removeTGrafica_HP.setText("-");
        removeTGrafica_HP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeTGrafica_HPActionPerformed(evt);
            }
        });

        removePlacaBase_HP.setText("-");
        removePlacaBase_HP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removePlacaBase_HPActionPerformed(evt);
            }
        });

        removeCPU_HP.setText("-");
        removeCPU_HP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCPU_HPActionPerformed(evt);
            }
        });

        removeRAM_HP.setText("-");
        removeRAM_HP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeRAM_HPActionPerformed(evt);
            }
        });

        removeFuente_HP.setText("-");
        removeFuente_HP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeFuente_HPActionPerformed(evt);
            }
        });

        addPlacaBase_HP.setText("+");
        addPlacaBase_HP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPlacaBase_HPActionPerformed(evt);
            }
        });

        addCPU_HP.setText("+");
        addCPU_HP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCPU_HPActionPerformed(evt);
            }
        });

        addRAM_HP.setText("+");
        addRAM_HP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRAM_HPActionPerformed(evt);
            }
        });

        addFuente_HP.setText("+");
        addFuente_HP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFuente_HPActionPerformed(evt);
            }
        });

        addTGrafica_HP.setText("+");
        addTGrafica_HP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTGrafica_HPActionPerformed(evt);
            }
        });

        placaBaseMenu_HP.setText("Productores de placas bases:");

        cpusMenu_HP.setText("Productores de CPUs:");

        memoriaRAMMenu_HP.setText("Productores de memoria RAM:");

        fuentesMenu_HP.setText("Productores de fuentes:");

        tarjetasGraficasMenu_HP.setText("Productores de tarjetas gráficas:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(memoriaRAMMenu_HP)
                        .addGap(40, 40, 40)
                        .addComponent(removeRAM_HP)
                        .addGap(12, 12, 12)
                        .addComponent(numRAM_HP)
                        .addGap(12, 12, 12)
                        .addComponent(addRAM_HP))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(fuentesMenu_HP)
                        .addGap(78, 78, 78)
                        .addComponent(removeFuente_HP)
                        .addGap(12, 12, 12)
                        .addComponent(numFuentes_HP)
                        .addGap(12, 12, 12)
                        .addComponent(addFuente_HP))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tarjetasGraficasMenu_HP)
                            .addComponent(ensambladoresMenu_HP))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(removeTGrafica_HP)
                                .addGap(12, 12, 12)
                                .addComponent(numTGraficas_HP)
                                .addGap(12, 12, 12)
                                .addComponent(addTGrafica_HP))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(removeEnsamblador_HP)
                                .addGap(12, 12, 12)
                                .addComponent(numEnsambladores_HP)
                                .addGap(12, 12, 12)
                                .addComponent(addEnsamblador_HP))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cpusMenu_HP)
                            .addComponent(placaBaseMenu_HP))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(removeCPU_HP)
                                .addGap(12, 12, 12)
                                .addComponent(numCPUS_HP)
                                .addGap(12, 12, 12)
                                .addComponent(addCPU_HP))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(removePlacaBase_HP)
                                .addGap(12, 12, 12)
                                .addComponent(numPlacaBase_HP)
                                .addGap(12, 12, 12)
                                .addComponent(addPlacaBase_HP)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removePlacaBase_HP)
                    .addComponent(addPlacaBase_HP)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(placaBaseMenu_HP)
                            .addComponent(numPlacaBase_HP))))
                .addGap(14, 14, 14)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(removeCPU_HP)
                        .addComponent(cpusMenu_HP))
                    .addComponent(addCPU_HP)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(numCPUS_HP)))
                .addGap(22, 22, 22)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeRAM_HP)
                    .addComponent(addRAM_HP)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(memoriaRAMMenu_HP)
                            .addComponent(numRAM_HP))))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeFuente_HP)
                    .addComponent(addFuente_HP)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fuentesMenu_HP)
                            .addComponent(numFuentes_HP))))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeTGrafica_HP)
                    .addComponent(addTGrafica_HP)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tarjetasGraficasMenu_HP)
                            .addComponent(numTGraficas_HP))))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeEnsamblador_HP)
                    .addComponent(addEnsamblador_HP)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(numEnsambladores_HP))
                    .addComponent(ensambladoresMenu_HP))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        ventanaMenu.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 227, -1, -1));

        guardarCambios.setBackground(new java.awt.Color(255, 255, 255));
        guardarCambios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/BotonGuardar.png"))); // NOI18N
        guardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarCambiosActionPerformed(evt);
            }
        });
        ventanaMenu.add(guardarCambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, 30, 30));

        iniciarSimulacion.setBackground(new java.awt.Color(255, 255, 255));
        iniciarSimulacion.setForeground(new java.awt.Color(255, 255, 255));
        iniciarSimulacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/BotonPlay.png"))); // NOI18N
        iniciarSimulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarSimulacionActionPerformed(evt);
            }
        });
        ventanaMenu.add(iniciarSimulacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 30, 30));

        jTabbedPane1.addTab("Menú", ventanaMenu);

        ventanaApple.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(224, 224, 224));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Cant. de placas bases:");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 47, -1, -1));

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Cant. de CPUs:");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 75, -1, -1));

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Cant. de memorias RAM:");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 103, -1, -1));

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Cant. de fuentes:");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 131, -1, -1));

        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Cant. de tarjetas gráficas:");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 159, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("ALMACEN");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 13, -1, -1));

        placasEnStock_Apple.setForeground(new java.awt.Color(51, 51, 51));
        placasEnStock_Apple.setText("0");
        jPanel5.add(placasEnStock_Apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 47, -1, -1));

        CPUsEnStock_Apple.setForeground(new java.awt.Color(51, 51, 51));
        CPUsEnStock_Apple.setText("0");
        jPanel5.add(CPUsEnStock_Apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 75, -1, -1));

        RAMsEnStock_Apple.setForeground(new java.awt.Color(51, 51, 51));
        RAMsEnStock_Apple.setText("0");
        jPanel5.add(RAMsEnStock_Apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 103, -1, -1));

        fuentesEnStock_Apple.setForeground(new java.awt.Color(51, 51, 51));
        fuentesEnStock_Apple.setText("0");
        jPanel5.add(fuentesEnStock_Apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 131, -1, -1));

        tGraficasEnStock_Apple.setForeground(new java.awt.Color(51, 51, 51));
        tGraficasEnStock_Apple.setText("0");
        jPanel5.add(tGraficasEnStock_Apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 159, -1, -1));

        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Capacidad máx.:            25");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 47, 148, -1));

        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Capacidad máx.:            20");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 75, 148, -1));

        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Capacidad máx.:            55");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 103, 148, -1));

        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Capacidad máx.:            35");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 131, 148, -1));

        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Capacidad máx.:            10");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 159, 148, -1));

        cantCompEstandarListos_Apple.setForeground(new java.awt.Color(51, 51, 51));
        cantCompEstandarListos_Apple.setText("0");
        jPanel5.add(cantCompEstandarListos_Apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 203, -1, -1));

        compEstandarLabel_Apple.setForeground(new java.awt.Color(51, 51, 51));
        compEstandarLabel_Apple.setText("Computadores estándar listos:");
        jPanel5.add(compEstandarLabel_Apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 203, -1, -1));

        compConTGLabel_Apple.setForeground(new java.awt.Color(51, 51, 51));
        compConTGLabel_Apple.setText("Computadores con tarjeta gráfica listos:");
        jPanel5.add(compConTGLabel_Apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 231, -1, -1));

        cantCompTGListos_Apple.setForeground(new java.awt.Color(51, 51, 51));
        cantCompTGListos_Apple.setText("0");
        jPanel5.add(cantCompTGListos_Apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 231, -1, -1));

        ventanaApple.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 420, 260));

        jPanel6.setBackground(new java.awt.Color(245, 245, 245));
        jPanel6.setForeground(new java.awt.Color(51, 51, 51));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fuentesLabel_Apple.setForeground(new java.awt.Color(51, 51, 51));
        fuentesLabel_Apple.setText("Productores de fuentes:");
        jPanel6.add(fuentesLabel_Apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 198, -1, -1));

        removeNumFuente_Apple.setText("-");
        removeNumFuente_Apple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeNumFuente_AppleActionPerformed(evt);
            }
        });
        jPanel6.add(removeNumFuente_Apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 198, -1, -1));

        RAMLabel_Apple.setForeground(new java.awt.Color(51, 51, 51));
        RAMLabel_Apple.setText("Productores de memoria RAM:");
        jPanel6.add(RAMLabel_Apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 158, -1, -1));

        removeNumRAM_Apple.setText("-");
        removeNumRAM_Apple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeNumRAM_AppleActionPerformed(evt);
            }
        });
        jPanel6.add(removeNumRAM_Apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 158, -1, -1));

        CPUsLabel_Apple.setForeground(new java.awt.Color(51, 51, 51));
        CPUsLabel_Apple.setText("Productores de placas CPUs:");
        jPanel6.add(CPUsLabel_Apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 118, -1, -1));

        removeNumCPUs_Apple.setText("-");
        removeNumCPUs_Apple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeNumCPUs_AppleActionPerformed(evt);
            }
        });
        jPanel6.add(removeNumCPUs_Apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 118, -1, -1));

        placaBaseLabel_Apple.setForeground(new java.awt.Color(51, 51, 51));
        placaBaseLabel_Apple.setText("Productores de placas bases:");
        jPanel6.add(placaBaseLabel_Apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 77, -1, -1));

        removeNumPB_Apple.setText("-");
        removeNumPB_Apple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeNumPB_AppleActionPerformed(evt);
            }
        });
        jPanel6.add(removeNumPB_Apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 77, -1, -1));

        numTrabajadoresFuente_Apple.setForeground(new java.awt.Color(51, 51, 51));
        numTrabajadoresFuente_Apple.setText("0");
        jPanel6.add(numTrabajadoresFuente_Apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 198, -1, -1));

        numTrabajadoresRAM_Apple.setForeground(new java.awt.Color(51, 51, 51));
        numTrabajadoresRAM_Apple.setText("0");
        jPanel6.add(numTrabajadoresRAM_Apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 158, -1, -1));

        numTrabajadoresCPU_Apple.setForeground(new java.awt.Color(51, 51, 51));
        numTrabajadoresCPU_Apple.setText("0");
        jPanel6.add(numTrabajadoresCPU_Apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 118, -1, -1));

        numTrabajadoresPB_Apple.setForeground(new java.awt.Color(51, 51, 51));
        numTrabajadoresPB_Apple.setText("0");
        jPanel6.add(numTrabajadoresPB_Apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 77, -1, -1));

        numTrabajadoresTG_Apple.setForeground(new java.awt.Color(51, 51, 51));
        numTrabajadoresTG_Apple.setText("0");
        jPanel6.add(numTrabajadoresTG_Apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 239, -1, -1));

        labelTrabajadores.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTrabajadores.setForeground(new java.awt.Color(0, 0, 0));
        labelTrabajadores.setText("LISTA DE TRABAJADORES");
        jPanel6.add(labelTrabajadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        removeNumEnsamb_Apple.setText("-");
        removeNumEnsamb_Apple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeNumEnsamb_AppleActionPerformed(evt);
            }
        });
        jPanel6.add(removeNumEnsamb_Apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 280, -1, -1));

        ensambladoresLabel_Apple.setForeground(new java.awt.Color(51, 51, 51));
        ensambladoresLabel_Apple.setText("Ensambladores:");
        jPanel6.add(ensambladoresLabel_Apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 283, -1, -1));

        addNumEnsamb_Apple.setText("+");
        addNumEnsamb_Apple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNumEnsamb_AppleActionPerformed(evt);
            }
        });
        jPanel6.add(addNumEnsamb_Apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 280, -1, -1));

        numTrabajadoresEnsamb_Apple.setForeground(new java.awt.Color(51, 51, 51));
        numTrabajadoresEnsamb_Apple.setText("0");
        jPanel6.add(numTrabajadoresEnsamb_Apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 280, -1, -1));

        addNumTG_Apple.setText("+");
        addNumTG_Apple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNumTG_AppleActionPerformed(evt);
            }
        });
        jPanel6.add(addNumTG_Apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 239, -1, -1));

        addNumFuente_Apple.setText("+");
        addNumFuente_Apple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNumFuente_AppleActionPerformed(evt);
            }
        });
        jPanel6.add(addNumFuente_Apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 198, -1, -1));

        addNumRAM_Apple.setText("+");
        addNumRAM_Apple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNumRAM_AppleActionPerformed(evt);
            }
        });
        jPanel6.add(addNumRAM_Apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 158, -1, -1));

        addNumCPUs_Apple.setText("+");
        addNumCPUs_Apple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNumCPUs_AppleActionPerformed(evt);
            }
        });
        jPanel6.add(addNumCPUs_Apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 118, -1, -1));

        removeNumTG_Apple.setText("-");
        removeNumTG_Apple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeNumTG_AppleActionPerformed(evt);
            }
        });
        jPanel6.add(removeNumTG_Apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 239, -1, -1));

        addNumPB_Apple.setText("+");
        addNumPB_Apple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNumPB_AppleActionPerformed(evt);
            }
        });
        jPanel6.add(addNumPB_Apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 77, -1, -1));

        tGraficaLabel_Apple.setForeground(new java.awt.Color(51, 51, 51));
        tGraficaLabel_Apple.setText("Productores de tarjetas gráficas:");
        jPanel6.add(tGraficaLabel_Apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 242, -1, -1));

        ventanaApple.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 350, 320));

        jPanel9.setBackground(new java.awt.Color(245, 245, 245));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("PROJECT MANAGER / DIRECTOR");
        jPanel9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 6, -1, -1));

        estadoPMLabel_Apple.setForeground(new java.awt.Color(51, 51, 51));
        estadoPMLabel_Apple.setText("Estado PM:");
        jPanel9.add(estadoPMLabel_Apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 34, -1, -1));

        nroFaltasPMLabel_Apple.setForeground(new java.awt.Color(51, 51, 51));
        nroFaltasPMLabel_Apple.setText("Nro. faltas PM:");
        jPanel9.add(nroFaltasPMLabel_Apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 62, -1, -1));

        sueldoDescontadoPMLabel_Apple.setForeground(new java.awt.Color(51, 51, 51));
        sueldoDescontadoPMLabel_Apple.setText("Sueldo descontado:");
        jPanel9.add(sueldoDescontadoPMLabel_Apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 89, -1, -1));

        estadoPM_Apple.setForeground(new java.awt.Color(51, 51, 51));
        estadoPM_Apple.setText("...");
        jPanel9.add(estadoPM_Apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        nroFaltasPM_Apple.setForeground(new java.awt.Color(51, 51, 51));
        nroFaltasPM_Apple.setText("0");
        jPanel9.add(nroFaltasPM_Apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 62, -1, -1));

        sueldoDescontadoPM_Apple.setForeground(new java.awt.Color(51, 51, 51));
        sueldoDescontadoPM_Apple.setText("0");
        jPanel9.add(sueldoDescontadoPM_Apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 89, -1, -1));

        estadoDirectorLabel_Apple.setForeground(new java.awt.Color(51, 51, 51));
        estadoDirectorLabel_Apple.setText("Estado director:");
        jPanel9.add(estadoDirectorLabel_Apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));

        estadoDirector_Apple.setText("...");
        jPanel9.add(estadoDirector_Apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        ventanaApple.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 380, 120));

        jPanel10.setBackground(new java.awt.Color(224, 224, 224));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("DATOS RELEVANTES");

        ganaciasLabel_Apple.setForeground(new java.awt.Color(51, 51, 51));
        ganaciasLabel_Apple.setText("Ganancias en bruto:");

        costosLabel_Apple.setForeground(new java.awt.Color(51, 51, 51));
        costosLabel_Apple.setText("Costos operativos:");

        utilidadLabel_Apple.setForeground(new java.awt.Color(51, 51, 51));
        utilidadLabel_Apple.setText("Utilidad total:");

        diasRestantesLabel_Apple.setForeground(new java.awt.Color(51, 51, 51));
        diasRestantesLabel_Apple.setText("Días restantes para la entrega:");

        ganancias_Apple.setForeground(new java.awt.Color(51, 51, 51));
        ganancias_Apple.setText("0");

        costos_Apple.setForeground(new java.awt.Color(51, 51, 51));
        costos_Apple.setText("0");

        utilidad_Apple.setForeground(new java.awt.Color(51, 51, 51));
        utilidad_Apple.setText("0");

        diasRestantes_Apple.setForeground(new java.awt.Color(51, 51, 51));
        diasRestantes_Apple.setText("0");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(diasRestantesLabel_Apple)
                    .addComponent(utilidadLabel_Apple)
                    .addComponent(costosLabel_Apple)
                    .addComponent(ganaciasLabel_Apple)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(costos_Apple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ganancias_Apple, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(utilidad_Apple)
                    .addComponent(diasRestantes_Apple))
                .addGap(66, 66, 66))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ganaciasLabel_Apple)
                    .addComponent(ganancias_Apple))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(costosLabel_Apple)
                    .addComponent(costos_Apple))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(utilidadLabel_Apple)
                    .addComponent(utilidad_Apple))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diasRestantesLabel_Apple)
                    .addComponent(diasRestantes_Apple))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        ventanaApple.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 320, -1));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));

        iconHP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/IconApple.png"))); // NOI18N

        title1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        title1.setForeground(new java.awt.Color(0, 0, 0));
        title1.setText("Apple");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(iconHP1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(title1)
                .addGap(23, 23, 23))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(title1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(iconHP1)
                .addContainerGap())
        );

        ventanaApple.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 240, 80));

        diasTranscurridosLabelA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        diasTranscurridosLabelA.setForeground(new java.awt.Color(0, 0, 0));
        diasTranscurridosLabelA.setText("Días transcurridos de la simulación:");
        ventanaApple.add(diasTranscurridosLabelA, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        diasTranscurridos_Apple.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        diasTranscurridos_Apple.setForeground(new java.awt.Color(0, 0, 0));
        diasTranscurridos_Apple.setText("0");
        ventanaApple.add(diasTranscurridos_Apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, -1, -1));

        jLabel32.setForeground(new java.awt.Color(51, 51, 51));
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/WhiteBackground.jpg"))); // NOI18N
        jLabel32.setText("jLabel32");
        ventanaApple.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 560));

        jTabbedPane1.addTab("Apple", ventanaApple);

        ventanaHP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(102, 102, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fuentesLabel_HP.setForeground(new java.awt.Color(255, 255, 255));
        fuentesLabel_HP.setText("Productores de fuentes:");
        jPanel11.add(fuentesLabel_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 198, -1, -1));

        removeNumFuente_HP.setText("-");
        removeNumFuente_HP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeNumFuente_HPActionPerformed(evt);
            }
        });
        jPanel11.add(removeNumFuente_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 198, -1, -1));

        RAMLabel_HP.setForeground(new java.awt.Color(255, 255, 255));
        RAMLabel_HP.setText("Productores de memoria RAM:");
        jPanel11.add(RAMLabel_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 158, -1, -1));

        removeNumRAM_HP.setText("-");
        removeNumRAM_HP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeNumRAM_HPActionPerformed(evt);
            }
        });
        jPanel11.add(removeNumRAM_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 158, -1, -1));

        CPUsLabel_HP.setForeground(new java.awt.Color(255, 255, 255));
        CPUsLabel_HP.setText("Productores de placas CPUs:");
        jPanel11.add(CPUsLabel_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 118, -1, -1));

        removeNumCPUs_HP.setText("-");
        removeNumCPUs_HP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeNumCPUs_HPActionPerformed(evt);
            }
        });
        jPanel11.add(removeNumCPUs_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 118, -1, -1));

        placaBaseLabel_HP.setForeground(new java.awt.Color(255, 255, 255));
        placaBaseLabel_HP.setText("Productores de placas bases:");
        jPanel11.add(placaBaseLabel_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 77, -1, -1));

        removeNumPB_HP.setText("-");
        removeNumPB_HP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeNumPB_HPActionPerformed(evt);
            }
        });
        jPanel11.add(removeNumPB_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 77, -1, -1));

        numTrabajadoresFuente_HP.setForeground(new java.awt.Color(255, 255, 255));
        numTrabajadoresFuente_HP.setText("0");
        jPanel11.add(numTrabajadoresFuente_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 198, -1, -1));

        numTrabajadoresRAM_HP.setForeground(new java.awt.Color(255, 255, 255));
        numTrabajadoresRAM_HP.setText("0");
        jPanel11.add(numTrabajadoresRAM_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 158, -1, -1));

        numTrabajadoresCPU_HP.setForeground(new java.awt.Color(255, 255, 255));
        numTrabajadoresCPU_HP.setText("0");
        jPanel11.add(numTrabajadoresCPU_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 118, -1, -1));

        numTrabajadoresPB_HP.setForeground(new java.awt.Color(255, 255, 255));
        numTrabajadoresPB_HP.setText("0");
        jPanel11.add(numTrabajadoresPB_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 77, -1, -1));

        numTrabajadoresTG_HP.setForeground(new java.awt.Color(255, 255, 255));
        numTrabajadoresTG_HP.setText("0");
        jPanel11.add(numTrabajadoresTG_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 239, -1, -1));

        labelTrabajadores1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTrabajadores1.setForeground(new java.awt.Color(255, 255, 255));
        labelTrabajadores1.setText("LISTA DE TRABAJADORES");
        jPanel11.add(labelTrabajadores1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        removeNumEnsamb_HP.setText("-");
        removeNumEnsamb_HP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeNumEnsamb_HPActionPerformed(evt);
            }
        });
        jPanel11.add(removeNumEnsamb_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 280, -1, -1));

        ensambladoresLabel_HP.setForeground(new java.awt.Color(255, 255, 255));
        ensambladoresLabel_HP.setText("Ensambladores:");
        jPanel11.add(ensambladoresLabel_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 283, -1, -1));

        addNumEnsamb_HP.setText("+");
        addNumEnsamb_HP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNumEnsamb_HPActionPerformed(evt);
            }
        });
        jPanel11.add(addNumEnsamb_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 280, -1, -1));

        numTrabajadoresEnsamb_HP.setForeground(new java.awt.Color(255, 255, 255));
        numTrabajadoresEnsamb_HP.setText("0");
        jPanel11.add(numTrabajadoresEnsamb_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 280, -1, -1));

        addNumTG_HP.setText("+");
        addNumTG_HP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNumTG_HPActionPerformed(evt);
            }
        });
        jPanel11.add(addNumTG_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 239, -1, -1));

        addNumFuente_HP.setText("+");
        addNumFuente_HP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNumFuente_HPActionPerformed(evt);
            }
        });
        jPanel11.add(addNumFuente_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 198, -1, -1));

        addNumRAM_HP.setText("+");
        addNumRAM_HP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNumRAM_HPActionPerformed(evt);
            }
        });
        jPanel11.add(addNumRAM_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 158, -1, -1));

        addNumCPUs_HP.setText("+");
        addNumCPUs_HP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNumCPUs_HPActionPerformed(evt);
            }
        });
        jPanel11.add(addNumCPUs_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 118, -1, -1));

        removeNumTG_HP.setText("-");
        removeNumTG_HP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeNumTG_HPActionPerformed(evt);
            }
        });
        jPanel11.add(removeNumTG_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 239, -1, -1));

        addNumPB_HP.setText("+");
        addNumPB_HP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNumPB_HPActionPerformed(evt);
            }
        });
        jPanel11.add(addNumPB_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 77, -1, -1));

        tGraficaLabel_HP.setForeground(new java.awt.Color(255, 255, 255));
        tGraficaLabel_HP.setText("Productores de tarjetas gráficas:");
        jPanel11.add(tGraficaLabel_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 242, -1, -1));

        ventanaHP.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 350, 320));

        jPanel12.setBackground(new java.awt.Color(158, 143, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Cant. de placas bases:");
        jPanel12.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 47, -1, -1));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Cant. de CPUs:");
        jPanel12.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 75, -1, -1));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Cant. de memorias RAM:");
        jPanel12.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 103, -1, -1));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Cant. de fuentes:");
        jPanel12.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 131, -1, -1));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Cant. de tarjetas gráficas:");
        jPanel12.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 159, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("ALMACEN");
        jPanel12.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 13, -1, -1));

        placasEnStock_HP.setForeground(new java.awt.Color(255, 255, 255));
        placasEnStock_HP.setText("0");
        jPanel12.add(placasEnStock_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 47, -1, -1));

        CPUsEnStock_HP.setForeground(new java.awt.Color(255, 255, 255));
        CPUsEnStock_HP.setText("0");
        jPanel12.add(CPUsEnStock_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 75, -1, -1));

        RAMsEnStock_HP.setForeground(new java.awt.Color(255, 255, 255));
        RAMsEnStock_HP.setText("0");
        jPanel12.add(RAMsEnStock_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 103, -1, -1));

        fuentesEnStock_HP.setForeground(new java.awt.Color(255, 255, 255));
        fuentesEnStock_HP.setText("0");
        jPanel12.add(fuentesEnStock_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 131, -1, -1));

        tGraficasEnStock_HP.setForeground(new java.awt.Color(255, 255, 255));
        tGraficasEnStock_HP.setText("0");
        jPanel12.add(tGraficasEnStock_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 159, -1, -1));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Capacidad máx.:            25");
        jPanel12.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 47, 150, -1));

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Capacidad máx.:            20");
        jPanel12.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 75, 150, -1));

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Capacidad máx.:            55");
        jPanel12.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 103, 150, -1));

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Capacidad máx.:            35");
        jPanel12.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 131, 150, -1));

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Capacidad máx.:            10");
        jPanel12.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 159, 150, -1));

        cantCompEstandarListos_HP.setForeground(new java.awt.Color(255, 255, 255));
        cantCompEstandarListos_HP.setText("0");
        jPanel12.add(cantCompEstandarListos_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 203, -1, -1));

        compEstandarLabel_HP.setForeground(new java.awt.Color(255, 255, 255));
        compEstandarLabel_HP.setText("Computadores estándar listos:");
        jPanel12.add(compEstandarLabel_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 203, -1, -1));

        compConTGLabel_HP.setForeground(new java.awt.Color(255, 255, 255));
        compConTGLabel_HP.setText("Computadores con tarjeta gráfica listos:");
        jPanel12.add(compConTGLabel_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 231, -1, -1));

        cantCompTGListos_HP.setForeground(new java.awt.Color(255, 255, 255));
        cantCompTGListos_HP.setText("0");
        jPanel12.add(cantCompTGListos_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 231, -1, -1));

        ventanaHP.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 420, 260));

        jPanel13.setBackground(new java.awt.Color(153, 153, 255));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("DATOS RELEVANTES");

        ganaciasLabel_HP.setForeground(new java.awt.Color(255, 255, 255));
        ganaciasLabel_HP.setText("Ganancias en bruto:");

        costosLabel_HP.setForeground(new java.awt.Color(255, 255, 255));
        costosLabel_HP.setText("Costos operativos:");

        utilidadLabel_HP.setForeground(new java.awt.Color(255, 255, 255));
        utilidadLabel_HP.setText("Utilidad total:");

        diasRestantesLabel_HP.setForeground(new java.awt.Color(255, 255, 255));
        diasRestantesLabel_HP.setText("Días restantes para la entrega:");

        ganancias_HP.setForeground(new java.awt.Color(255, 255, 255));
        ganancias_HP.setText("0");

        costos_HP.setForeground(new java.awt.Color(255, 255, 255));
        costos_HP.setText("0");

        utilidad_HP.setForeground(new java.awt.Color(255, 255, 255));
        utilidad_HP.setText("0");

        diasRestantes_HP.setForeground(new java.awt.Color(255, 255, 255));
        diasRestantes_HP.setText("0");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel25))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(costosLabel_HP)
                        .addGap(96, 96, 96)
                        .addComponent(costos_HP, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                .addComponent(ganaciasLabel_HP)
                                .addGap(89, 89, 89)
                                .addComponent(ganancias_HP, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                .addComponent(utilidadLabel_HP)
                                .addGap(120, 120, 120)
                                .addComponent(utilidad_HP, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                .addComponent(diasRestantesLabel_HP)
                                .addGap(33, 33, 33)
                                .addComponent(diasRestantes_HP, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ganaciasLabel_HP)
                    .addComponent(ganancias_HP))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(costosLabel_HP)
                    .addComponent(costos_HP))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(utilidadLabel_HP)
                    .addComponent(utilidad_HP))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(diasRestantesLabel_HP)
                    .addComponent(diasRestantes_HP)))
        );

        ventanaHP.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 320, 190));

        jPanel14.setBackground(new java.awt.Color(102, 102, 255));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("PROJECT MANAGER / DIRECTOR");
        jPanel14.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 6, -1, -1));

        estadoPMLabel_HP.setForeground(new java.awt.Color(255, 255, 255));
        estadoPMLabel_HP.setText("Estado PM:");
        jPanel14.add(estadoPMLabel_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 34, -1, -1));

        nroFaltasPMLabel_HP.setForeground(new java.awt.Color(255, 255, 255));
        nroFaltasPMLabel_HP.setText("Nro. faltas PM:");
        jPanel14.add(nroFaltasPMLabel_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 62, -1, -1));

        sueldoDescontadoPMLabel_HP.setForeground(new java.awt.Color(255, 255, 255));
        sueldoDescontadoPMLabel_HP.setText("Sueldo descontado:");
        jPanel14.add(sueldoDescontadoPMLabel_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 89, -1, -1));

        estadoPM_HP.setForeground(new java.awt.Color(255, 255, 255));
        estadoPM_HP.setText("...");
        jPanel14.add(estadoPM_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 180, -1));

        nroFaltasPM_HP.setForeground(new java.awt.Color(255, 255, 255));
        nroFaltasPM_HP.setText("0");
        jPanel14.add(nroFaltasPM_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 62, -1, -1));

        sueldoDescontadoPM_HP.setForeground(new java.awt.Color(255, 255, 255));
        sueldoDescontadoPM_HP.setText("0");
        jPanel14.add(sueldoDescontadoPM_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 89, -1, -1));

        estadoDirectorLabel_HP.setForeground(new java.awt.Color(255, 255, 255));
        estadoDirectorLabel_HP.setText("Estado director:");
        jPanel14.add(estadoDirectorLabel_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));

        estadoDirector_HP.setForeground(new java.awt.Color(255, 255, 255));
        estadoDirector_HP.setText("...");
        jPanel14.add(estadoDirector_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        ventanaHP.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 380, 120));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        iconHP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/IconHP.png"))); // NOI18N

        title.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 0));
        title.setText("HP");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(iconHP)
                .addGap(33, 33, 33)
                .addComponent(title)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(iconHP))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(title)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        ventanaHP.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 200, 80));

        labelDiasTranscurridos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelDiasTranscurridos.setForeground(new java.awt.Color(0, 0, 0));
        labelDiasTranscurridos.setText("Días transcurridos de la simulación:");
        ventanaHP.add(labelDiasTranscurridos, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        diasTranscurridos_HP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        diasTranscurridos_HP.setForeground(new java.awt.Color(0, 0, 0));
        diasTranscurridos_HP.setText("0");
        ventanaHP.add(diasTranscurridos_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, -1, -1));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/BlueBackground.jpg"))); // NOI18N
        jLabel29.setText("jLabel29");
        ventanaHP.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 560));

        jTabbedPane1.addTab("HP", ventanaHP);

        grafico.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout graficoLayout = new javax.swing.GroupLayout(grafico);
        grafico.setLayout(graficoLayout);
        graficoLayout.setHorizontalGroup(
            graficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
        );
        graficoLayout.setVerticalGroup(
            graficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ventanaGraficoLayout = new javax.swing.GroupLayout(ventanaGrafico);
        ventanaGrafico.setLayout(ventanaGraficoLayout);
        ventanaGraficoLayout.setHorizontalGroup(
            ventanaGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaGraficoLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(grafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(223, Short.MAX_VALUE))
        );
        ventanaGraficoLayout.setVerticalGroup(
            ventanaGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaGraficoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(grafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Gráfico", ventanaGrafico);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 841, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void removePlacaBase_AppleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removePlacaBase_AppleActionPerformed
        // TODO add your handling code here:
        if (Integer.parseInt(numPlacaBase_Apple.getText()) == 1){
            JOptionPane.showMessageDialog(null, "No pueden quedar áreas sin empelados");
        } else{
            int nuevaCantidad = Integer.parseInt(numPlacaBase_Apple.getText())-1;
            numPlacaBase_Apple.setText(String.valueOf(nuevaCantidad));
        }
    }//GEN-LAST:event_removePlacaBase_AppleActionPerformed

    private void removeCPU_AppleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCPU_AppleActionPerformed
        // TODO add your handling code here:
        if (Integer.parseInt(numCPUS_Apple.getText()) == 1){
            JOptionPane.showMessageDialog(null, "No pueden quedar áreas sin empelados");
        } else{
            int nuevaCantidad = Integer.parseInt(numCPUS_Apple.getText())-1;
            numCPUS_Apple.setText(String.valueOf(nuevaCantidad));
        }
    }//GEN-LAST:event_removeCPU_AppleActionPerformed

    private void removeRAM_AppleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeRAM_AppleActionPerformed
        // TODO add your handling code here:
        if (Integer.parseInt(numRAM_Apple.getText()) == 1){
            JOptionPane.showMessageDialog(null, "No pueden quedar áreas sin empelados");
        } else{
            int nuevaCantidad = Integer.parseInt(numRAM_Apple.getText())-1;
            numRAM_Apple.setText(String.valueOf(nuevaCantidad));
        }
    }//GEN-LAST:event_removeRAM_AppleActionPerformed

    private void removeFuente_AppleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeFuente_AppleActionPerformed
        // TODO add your handling code here:
        if (Integer.parseInt(numFuente_Apple.getText()) == 1){
            JOptionPane.showMessageDialog(null, "No pueden quedar áreas sin empelados");
        } else{
            int nuevaCantidad = Integer.parseInt(numFuente_Apple.getText())-1;
            numFuente_Apple.setText(String.valueOf(nuevaCantidad));
        }
    }//GEN-LAST:event_removeFuente_AppleActionPerformed

    private void removeTGrafica_AppleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeTGrafica_AppleActionPerformed
        // TODO add your handling code here:
        if (Integer.parseInt(numTGraficas_Apple.getText()) == 1){
            JOptionPane.showMessageDialog(null, "No pueden quedar áreas sin empelados");
        } else{
            int nuevaCantidad = Integer.parseInt(numTGraficas_Apple.getText())-1;
            numTGraficas_Apple.setText(String.valueOf(nuevaCantidad));
        }
    }//GEN-LAST:event_removeTGrafica_AppleActionPerformed

    private int calcularCantidadTrabajadoresApple() {
        int cantidad = (Integer.parseInt(numPlacaBase_Apple.getText()) + Integer.parseInt(numCPUS_Apple.getText()) + Integer.parseInt(numRAM_Apple.getText()) + Integer.parseInt(numFuente_Apple.getText()) + Integer.parseInt(numTGraficas_Apple.getText()) + Integer.parseInt(numEnsambladores_Apple.getText()));
        return cantidad;
    }
    
    private int calcularCantidadTrabajadoresHP() {
        int cantidad = (Integer.parseInt(numPlacaBase_HP.getText()) + Integer.parseInt(numCPUS_HP.getText()) + Integer.parseInt(numRAM_HP.getText()) + Integer.parseInt(numFuentes_HP.getText()) + Integer.parseInt(numTGraficas_HP.getText()) + Integer.parseInt(numEnsambladores_HP.getText()));
        return cantidad;
    }
    
    private void addPlacaBase_AppleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPlacaBase_AppleActionPerformed
        // TODO add your handling code here:
        if (calcularCantidadTrabajadoresApple()== 19){
            JOptionPane.showMessageDialog(null, "Se ha alcanzado el límite de trabajadores para Apple");
        } else {
            int nuevaCantidad = Integer.parseInt(numPlacaBase_Apple.getText())+1;
            numPlacaBase_Apple.setText(String.valueOf(nuevaCantidad));
        }
    }//GEN-LAST:event_addPlacaBase_AppleActionPerformed

    private void addCPU_AppleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCPU_AppleActionPerformed
        // TODO add your handling code here:
        if (calcularCantidadTrabajadoresApple()== 19){
            JOptionPane.showMessageDialog(null, "Se ha alcanzado el límite de trabajadores para Apple");
        } else {
            int nuevaCantidad = Integer.parseInt(numCPUS_Apple.getText())+1;
            numCPUS_Apple.setText(String.valueOf(nuevaCantidad));
        }
    }//GEN-LAST:event_addCPU_AppleActionPerformed

    private void addRAM_AppleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRAM_AppleActionPerformed
        // TODO add your handling code here:
        if (calcularCantidadTrabajadoresApple()== 19){
            JOptionPane.showMessageDialog(null, "Se ha alcanzado el límite de trabajadores para Apple");
        } else {
            int nuevaCantidad = Integer.parseInt(numRAM_Apple.getText())+1;
            numRAM_Apple.setText(String.valueOf(nuevaCantidad));
        }
    }//GEN-LAST:event_addRAM_AppleActionPerformed

    private void addFuente_AppleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFuente_AppleActionPerformed
        // TODO add your handling code here:
        if (calcularCantidadTrabajadoresApple()== 19){
            JOptionPane.showMessageDialog(null, "Se ha alcanzado el límite de trabajadores para Apple");
        } else {
            int nuevaCantidad = Integer.parseInt(numFuente_Apple.getText())+1;
            numFuente_Apple.setText(String.valueOf(nuevaCantidad));
        }
    }//GEN-LAST:event_addFuente_AppleActionPerformed

    private void addTGrafica_AppleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTGrafica_AppleActionPerformed
        // TODO add your handling code here:
        if (calcularCantidadTrabajadoresApple()== 19){
            JOptionPane.showMessageDialog(null, "Se ha alcanzado el límite de trabajadores para Apple");
        } else {
            int nuevaCantidad = Integer.parseInt(numTGraficas_Apple.getText())+1;
            numTGraficas_Apple.setText(String.valueOf(nuevaCantidad));
        }
    }//GEN-LAST:event_addTGrafica_AppleActionPerformed

    private void removePlacaBase_HPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removePlacaBase_HPActionPerformed
        // TODO add your handling code here:
        if (Integer.parseInt(numPlacaBase_HP.getText()) == 1){
            JOptionPane.showMessageDialog(null, "No pueden quedar áreas sin empelados");
        } else{
            int nuevaCantidad = Integer.parseInt(numPlacaBase_HP.getText())-1;
            numPlacaBase_HP.setText(String.valueOf(nuevaCantidad));
        }
    }//GEN-LAST:event_removePlacaBase_HPActionPerformed

    private void removeCPU_HPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCPU_HPActionPerformed
        // TODO add your handling code here:
        if (Integer.parseInt(numCPUS_HP.getText()) == 1){
            JOptionPane.showMessageDialog(null, "No pueden quedar áreas sin empelados");
        } else{
            int nuevaCantidad = Integer.parseInt(numCPUS_HP.getText())-1;
            numCPUS_HP.setText(String.valueOf(nuevaCantidad));
        }
    }//GEN-LAST:event_removeCPU_HPActionPerformed

    private void removeRAM_HPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeRAM_HPActionPerformed
        // TODO add your handling code here:
        if (Integer.parseInt(numRAM_HP.getText()) == 1){
            JOptionPane.showMessageDialog(null, "No pueden quedar áreas sin empelados");
        } else{
            int nuevaCantidad = Integer.parseInt(numRAM_HP.getText())-1;
            numRAM_HP.setText(String.valueOf(nuevaCantidad));
        }
    }//GEN-LAST:event_removeRAM_HPActionPerformed

    private void removeFuente_HPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeFuente_HPActionPerformed
        // TODO add your handling code here:
        if (Integer.parseInt(numFuentes_HP.getText()) == 1){
            JOptionPane.showMessageDialog(null, "No pueden quedar áreas sin empelados");
        } else{
            int nuevaCantidad = Integer.parseInt(numFuentes_HP.getText())-1;
            numFuentes_HP.setText(String.valueOf(nuevaCantidad));
        }
    }//GEN-LAST:event_removeFuente_HPActionPerformed

    private void addPlacaBase_HPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPlacaBase_HPActionPerformed
        // TODO add your handling code here:
        if (calcularCantidadTrabajadoresHP()== 20){
            JOptionPane.showMessageDialog(null, "Se ha alcanzado el límite de trabajadores para HP");
        } else {
            int nuevaCantidad = Integer.parseInt(numPlacaBase_HP.getText())+1;
            numPlacaBase_HP.setText(String.valueOf(nuevaCantidad));
        }
    }//GEN-LAST:event_addPlacaBase_HPActionPerformed

    private void addCPU_HPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCPU_HPActionPerformed
        // TODO add your handling code here:
        if (calcularCantidadTrabajadoresHP()== 20){
            JOptionPane.showMessageDialog(null, "Se ha alcanzado el límite de trabajadores para HP");
        } else {
            int nuevaCantidad = Integer.parseInt(numCPUS_HP.getText())+1;
            numCPUS_HP.setText(String.valueOf(nuevaCantidad));
        }
    }//GEN-LAST:event_addCPU_HPActionPerformed

    private void addRAM_HPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRAM_HPActionPerformed
        // TODO add your handling code here:
        if (calcularCantidadTrabajadoresHP()== 20){
            JOptionPane.showMessageDialog(null, "Se ha alcanzado el límite de trabajadores para HP");
        } else {
            int nuevaCantidad = Integer.parseInt(numRAM_HP.getText())+1;
            numRAM_HP.setText(String.valueOf(nuevaCantidad));
        }
    }//GEN-LAST:event_addRAM_HPActionPerformed

    private void addFuente_HPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFuente_HPActionPerformed
        // TODO add your handling code here:
        if (calcularCantidadTrabajadoresHP()== 20){
            JOptionPane.showMessageDialog(null, "Se ha alcanzado el límite de trabajadores para HP");
        } else {
            int nuevaCantidad = Integer.parseInt(numFuentes_HP.getText())+1;
            numFuentes_HP.setText(String.valueOf(nuevaCantidad));
        }
    }//GEN-LAST:event_addFuente_HPActionPerformed

    private void removeTGrafica_HPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeTGrafica_HPActionPerformed
        // TODO add your handling code here:
        if (Integer.parseInt(numTGraficas_HP.getText()) == 1){
            JOptionPane.showMessageDialog(null, "No pueden quedar áreas sin empelados");
        } else{
            int nuevaCantidad = Integer.parseInt(numTGraficas_HP.getText())-1;
            numTGraficas_HP.setText(String.valueOf(nuevaCantidad));
        }
    }//GEN-LAST:event_removeTGrafica_HPActionPerformed

    private void addTGrafica_HPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTGrafica_HPActionPerformed
        // TODO add your handling code here:
        if (calcularCantidadTrabajadoresHP()== 20){
            JOptionPane.showMessageDialog(null, "Se ha alcanzado el límite de trabajadores para HP");
        } else {
            int nuevaCantidad = Integer.parseInt(numTGraficas_HP.getText())+1;
            numTGraficas_HP.setText(String.valueOf(nuevaCantidad));
        }
    }//GEN-LAST:event_addTGrafica_HPActionPerformed

    private void removeEnsamblador_AppleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeEnsamblador_AppleActionPerformed
        // TODO add your handling code here:
        if (Integer.parseInt(numEnsambladores_Apple.getText()) == 1){
            JOptionPane.showMessageDialog(null, "No pueden quedar áreas sin empelados");
        } else{
            int nuevaCantidad = Integer.parseInt(numEnsambladores_Apple.getText())-1;
            numEnsambladores_Apple.setText(String.valueOf(nuevaCantidad));
        }
    }//GEN-LAST:event_removeEnsamblador_AppleActionPerformed

    private void addEnsamblador_AppleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEnsamblador_AppleActionPerformed
        // TODO add your handling code here:
        if (calcularCantidadTrabajadoresApple()== 19){
            JOptionPane.showMessageDialog(null, "Se ha alcanzado el límite de trabajadores para Apple");
        } else {
            int nuevaCantidad = Integer.parseInt(numEnsambladores_Apple.getText())+1;
            numEnsambladores_Apple.setText(String.valueOf(nuevaCantidad));
        }
    }//GEN-LAST:event_addEnsamblador_AppleActionPerformed

    private void addEnsamblador_HPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEnsamblador_HPActionPerformed
        // TODO add your handling code here:
        if (calcularCantidadTrabajadoresHP()== 20){
            JOptionPane.showMessageDialog(null, "Se ha alcanzado el límite de trabajadores para HP");
        } else {
            int nuevaCantidad = Integer.parseInt(numEnsambladores_HP.getText())+1;
            numEnsambladores_HP.setText(String.valueOf(nuevaCantidad));
        }
    }//GEN-LAST:event_addEnsamblador_HPActionPerformed

    private void removeEnsamblador_HPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeEnsamblador_HPActionPerformed
        // TODO add your handling code here:
        if (Integer.parseInt(numEnsambladores_HP.getText()) == 1){
            JOptionPane.showMessageDialog(null, "No pueden quedar áreas sin empelados");
        } else{
            int nuevaCantidad = Integer.parseInt(numEnsambladores_HP.getText())-1;
            numEnsambladores_HP.setText(String.valueOf(nuevaCantidad));
        }
    }//GEN-LAST:event_removeEnsamblador_HPActionPerformed

    private void removeNumPB_AppleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeNumPB_AppleActionPerformed
        // TODO add your handling code here:
        apple.getProductorPlacaBase().despedir();
        numTrabajadoresPB_Apple.setText(Integer.toString(apple.getProductorPlacaBase().getCantidadTrabajadores()));
    }//GEN-LAST:event_removeNumPB_AppleActionPerformed

    private void removeNumCPUs_AppleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeNumCPUs_AppleActionPerformed
        // TODO add your handling code here:
        apple.getProductorCPUs().despedir();
        numTrabajadoresCPU_Apple.setText(Integer.toString(apple.getProductorCPUs().getCantidadTrabajadores()));
    }//GEN-LAST:event_removeNumCPUs_AppleActionPerformed

    private void removeNumRAM_AppleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeNumRAM_AppleActionPerformed
        // TODO add your handling code here:
        apple.getProductorRAM().despedir();
        numTrabajadoresRAM_Apple.setText(Integer.toString(apple.getProductorRAM().getCantidadTrabajadores()));
    }//GEN-LAST:event_removeNumRAM_AppleActionPerformed

    private void removeNumFuente_AppleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeNumFuente_AppleActionPerformed
        // TODO add your handling code here:
        apple.getProductorFuente().despedir();
        numTrabajadoresFuente_Apple.setText(Integer.toString(apple.getProductorFuente().getCantidadTrabajadores()));
    }//GEN-LAST:event_removeNumFuente_AppleActionPerformed

    private void addNumPB_AppleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNumPB_AppleActionPerformed
        // TODO add your handling code here:
        apple.añadirTrabajadores(0);
        numTrabajadoresPB_Apple.setText(Integer.toString(apple.getProductorPlacaBase().getCantidadTrabajadores()));
    }//GEN-LAST:event_addNumPB_AppleActionPerformed

    private void addNumCPUs_AppleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNumCPUs_AppleActionPerformed
        // TODO add your handling code here:
        apple.añadirTrabajadores(1);
        numTrabajadoresCPU_Apple.setText(Integer.toString(apple.getProductorCPUs().getCantidadTrabajadores()));
    }//GEN-LAST:event_addNumCPUs_AppleActionPerformed

    private void addNumRAM_AppleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNumRAM_AppleActionPerformed
        // TODO add your handling code here:
        apple.añadirTrabajadores(2);
        numTrabajadoresRAM_Apple.setText(Integer.toString(apple.getProductorRAM().getCantidadTrabajadores()));
    }//GEN-LAST:event_addNumRAM_AppleActionPerformed

    private void addNumFuente_AppleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNumFuente_AppleActionPerformed
        // TODO add your handling code here:
        apple.añadirTrabajadores(3);
        numTrabajadoresFuente_Apple.setText(Integer.toString(apple.getProductorFuente().getCantidadTrabajadores()));
    }//GEN-LAST:event_addNumFuente_AppleActionPerformed

    private void removeNumTG_AppleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeNumTG_AppleActionPerformed
        // TODO add your handling code here:
        apple.getProductorTGrafica().despedir();
        numTrabajadoresTG_Apple.setText(Integer.toString(apple.getProductorTGrafica().getCantidadTrabajadores()));
    }//GEN-LAST:event_removeNumTG_AppleActionPerformed

    private void addNumTG_AppleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNumTG_AppleActionPerformed
        // TODO add your handling code here:
        apple.añadirTrabajadores(4);
        numTrabajadoresTG_Apple.setText(Integer.toString(apple.getProductorTGrafica().getCantidadTrabajadores()));
    }//GEN-LAST:event_addNumTG_AppleActionPerformed

    private void addNumEnsamb_AppleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNumEnsamb_AppleActionPerformed
        // TODO add your handling code here:
        apple.añadirTrabajadores(5);
        numTrabajadoresEnsamb_Apple.setText(Integer.toString(apple.getEnsamblador().getCantidadTrabajadores()));
    }//GEN-LAST:event_addNumEnsamb_AppleActionPerformed

    private void removeNumEnsamb_AppleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeNumEnsamb_AppleActionPerformed
        // TODO add your handling code here:
        apple.getEnsamblador().despedir();
        numTrabajadoresEnsamb_Apple.setText(Integer.toString(apple.getEnsamblador().getCantidadTrabajadores()));
    }//GEN-LAST:event_removeNumEnsamb_AppleActionPerformed

    private void removeNumFuente_HPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeNumFuente_HPActionPerformed
        // TODO add your handling code here:
        hp.getProductorFuente().despedir();
        numTrabajadoresFuente_HP.setText(Integer.toString(hp.getProductorFuente().getCantidadTrabajadores()));
    }//GEN-LAST:event_removeNumFuente_HPActionPerformed

    private void removeNumRAM_HPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeNumRAM_HPActionPerformed
        // TODO add your handling code here:
        hp.getProductorRAM().despedir();
        numTrabajadoresRAM_HP.setText(Integer.toString(hp.getProductorRAM().getCantidadTrabajadores()));
    }//GEN-LAST:event_removeNumRAM_HPActionPerformed

    private void removeNumCPUs_HPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeNumCPUs_HPActionPerformed
        // TODO add your handling code here:
        hp.getProductorCPUs().despedir();
        numTrabajadoresCPU_HP.setText(Integer.toString(hp.getProductorCPUs().getCantidadTrabajadores()));
    }//GEN-LAST:event_removeNumCPUs_HPActionPerformed

    private void removeNumPB_HPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeNumPB_HPActionPerformed
        // TODO add your handling code here:
        hp.getProductorPlacaBase().despedir();
        numTrabajadoresPB_HP.setText(Integer.toString(hp.getProductorPlacaBase().getCantidadTrabajadores()));
    }//GEN-LAST:event_removeNumPB_HPActionPerformed

    private void removeNumEnsamb_HPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeNumEnsamb_HPActionPerformed
        // TODO add your handling code here:
        hp.getEnsamblador().despedir();
        numTrabajadoresEnsamb_HP.setText(Integer.toString(hp.getEnsamblador().getCantidadTrabajadores()));
    }//GEN-LAST:event_removeNumEnsamb_HPActionPerformed

    private void addNumEnsamb_HPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNumEnsamb_HPActionPerformed
        // TODO add your handling code here:
        hp.añadirTrabajadores(5);
        numTrabajadoresEnsamb_HP.setText(Integer.toString(hp.getEnsamblador().getCantidadTrabajadores()));
    }//GEN-LAST:event_addNumEnsamb_HPActionPerformed

    private void addNumTG_HPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNumTG_HPActionPerformed
        // TODO add your handling code here:
        hp.añadirTrabajadores(4);
        numTrabajadoresTG_HP.setText(Integer.toString(hp.getProductorTGrafica().getCantidadTrabajadores()));
    }//GEN-LAST:event_addNumTG_HPActionPerformed

    private void addNumFuente_HPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNumFuente_HPActionPerformed
        // TODO add your handling code here:
        hp.añadirTrabajadores(3);
        numTrabajadoresFuente_HP.setText(Integer.toString(hp.getProductorFuente().getCantidadTrabajadores()));
    }//GEN-LAST:event_addNumFuente_HPActionPerformed

    private void addNumRAM_HPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNumRAM_HPActionPerformed
        // TODO add your handling code here:
        hp.añadirTrabajadores(2);
        numTrabajadoresRAM_HP.setText(Integer.toString(hp.getProductorRAM().getCantidadTrabajadores()));
    }//GEN-LAST:event_addNumRAM_HPActionPerformed

    private void addNumCPUs_HPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNumCPUs_HPActionPerformed
        // TODO add your handling code here:
        hp.añadirTrabajadores(1);
        numTrabajadoresCPU_HP.setText(Integer.toString(hp.getProductorCPUs().getCantidadTrabajadores()));
    }//GEN-LAST:event_addNumCPUs_HPActionPerformed

    private void removeNumTG_HPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeNumTG_HPActionPerformed
        // TODO add your handling code here:
        hp.getProductorTGrafica().despedir();
        numTrabajadoresTG_HP.setText(Integer.toString(hp.getProductorTGrafica().getCantidadTrabajadores()));
    }//GEN-LAST:event_removeNumTG_HPActionPerformed

    private void addNumPB_HPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNumPB_HPActionPerformed
        // TODO add your handling code here:
        hp.añadirTrabajadores(0);
        numTrabajadoresPB_HP.setText(Integer.toString(hp.getProductorPlacaBase().getCantidadTrabajadores()));
    }//GEN-LAST:event_addNumPB_HPActionPerformed

    private void guardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarCambiosActionPerformed
        // TODO add your handling code here:
        String configuraciones = "deadline, " + deadline.getValue() + "\n" + "duracionDia, " + duracionDia.getValue() + "\n" + "cantidadApple, " + numPlacaBase_Apple.getText() + ", " + numCPUS_Apple.getText() + ", " + numRAM_Apple.getText() + ", " + numFuente_Apple.getText() + ", " + numTGraficas_Apple.getText() + ", " + numEnsambladores_Apple.getText() + "\n" + "cantidadHP, " + numPlacaBase_HP.getText() + ", " + numCPUS_HP.getText() + ", " + numRAM_HP.getText() + ", " + numFuentes_HP.getText() + ", " +numTGraficas_HP.getText() + ", " + numEnsambladores_HP.getText();
        
        File fichero = new File("src\\Archivo\\Configuraciones.txt");
        String contenido = "";
        
        try{
            PrintWriter salida = new PrintWriter(fichero);
            salida.print(configuraciones);
            salida.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_guardarCambiosActionPerformed

    private void iniciarSimulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarSimulacionActionPerformed
        // TODO add your handling code here:
        apple.iniciar();
        hp.iniciar();
    }//GEN-LAST:event_iniciarSimulacionActionPerformed
    
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CPUsEnStock_Apple;
    private javax.swing.JLabel CPUsEnStock_HP;
    private javax.swing.JLabel CPUsLabel_Apple;
    private javax.swing.JLabel CPUsLabel_HP;
    private javax.swing.JLabel RAMLabel_Apple;
    private javax.swing.JLabel RAMLabel_HP;
    private javax.swing.JLabel RAMsEnStock_Apple;
    private javax.swing.JLabel RAMsEnStock_HP;
    private javax.swing.JButton addCPU_Apple;
    private javax.swing.JButton addCPU_HP;
    private javax.swing.JButton addEnsamblador_Apple;
    private javax.swing.JButton addEnsamblador_HP;
    private javax.swing.JButton addFuente_Apple;
    private javax.swing.JButton addFuente_HP;
    private javax.swing.JButton addNumCPUs_Apple;
    private javax.swing.JButton addNumCPUs_HP;
    private javax.swing.JButton addNumEnsamb_Apple;
    private javax.swing.JButton addNumEnsamb_HP;
    private javax.swing.JButton addNumFuente_Apple;
    private javax.swing.JButton addNumFuente_HP;
    private javax.swing.JButton addNumPB_Apple;
    private javax.swing.JButton addNumPB_HP;
    private javax.swing.JButton addNumRAM_Apple;
    private javax.swing.JButton addNumRAM_HP;
    private javax.swing.JButton addNumTG_Apple;
    private javax.swing.JButton addNumTG_HP;
    private javax.swing.JButton addPlacaBase_Apple;
    private javax.swing.JButton addPlacaBase_HP;
    private javax.swing.JButton addRAM_Apple;
    private javax.swing.JButton addRAM_HP;
    private javax.swing.JButton addTGrafica_Apple;
    private javax.swing.JButton addTGrafica_HP;
    private javax.swing.JLabel cantCompEstandarListos_Apple;
    private javax.swing.JLabel cantCompEstandarListos_HP;
    private javax.swing.JLabel cantCompTGListos_Apple;
    private javax.swing.JLabel cantCompTGListos_HP;
    private javax.swing.JLabel compConTGLabel_Apple;
    private javax.swing.JLabel compConTGLabel_HP;
    private javax.swing.JLabel compEstandarLabel_Apple;
    private javax.swing.JLabel compEstandarLabel_HP;
    private javax.swing.JLabel costosLabel_Apple;
    private javax.swing.JLabel costosLabel_HP;
    private javax.swing.JLabel costos_Apple;
    private javax.swing.JLabel costos_HP;
    private javax.swing.JLabel cpusMenu_Apple;
    private javax.swing.JLabel cpusMenu_HP;
    private javax.swing.JSpinner deadline;
    private javax.swing.JLabel deadlineLabel;
    private javax.swing.JLabel diasRestantesLabel_Apple;
    private javax.swing.JLabel diasRestantesLabel_HP;
    private javax.swing.JLabel diasRestantes_Apple;
    private javax.swing.JLabel diasRestantes_HP;
    private javax.swing.JLabel diasTranscurridosLabelA;
    private javax.swing.JLabel diasTranscurridos_Apple;
    private javax.swing.JLabel diasTranscurridos_HP;
    private javax.swing.JSpinner duracionDia;
    private javax.swing.JLabel duracionDiaLabel;
    private javax.swing.JLabel ensambladorMenu_Apple;
    private javax.swing.JLabel ensambladoresLabel_Apple;
    private javax.swing.JLabel ensambladoresLabel_HP;
    private javax.swing.JLabel ensambladoresMenu_HP;
    private javax.swing.JLabel estadoDirectorLabel_Apple;
    private javax.swing.JLabel estadoDirectorLabel_HP;
    private javax.swing.JLabel estadoDirector_Apple;
    private javax.swing.JLabel estadoDirector_HP;
    private javax.swing.JLabel estadoPMLabel_Apple;
    private javax.swing.JLabel estadoPMLabel_HP;
    private javax.swing.JLabel estadoPM_Apple;
    private javax.swing.JLabel estadoPM_HP;
    private javax.swing.JLabel fuentesEnStock_Apple;
    private javax.swing.JLabel fuentesEnStock_HP;
    private javax.swing.JLabel fuentesLabel_Apple;
    private javax.swing.JLabel fuentesLabel_HP;
    private javax.swing.JLabel fuentesMenu_Apple;
    private javax.swing.JLabel fuentesMenu_HP;
    private javax.swing.JLabel ganaciasLabel_Apple;
    private javax.swing.JLabel ganaciasLabel_HP;
    private javax.swing.JLabel ganancias_Apple;
    private javax.swing.JLabel ganancias_HP;
    private javax.swing.JPanel grafico;
    private javax.swing.JButton guardarCambios;
    private javax.swing.JLabel iconHP;
    private javax.swing.JLabel iconHP1;
    private javax.swing.JButton iniciarSimulacion;
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
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelDiasTranscurridos;
    private javax.swing.JLabel labelTrabajadores;
    private javax.swing.JLabel labelTrabajadores1;
    private javax.swing.JLabel memoriaRAMMenu_Apple;
    private javax.swing.JLabel memoriaRAMMenu_HP;
    private javax.swing.JLabel nroFaltasPMLabel_Apple;
    private javax.swing.JLabel nroFaltasPMLabel_HP;
    private javax.swing.JLabel nroFaltasPM_Apple;
    private javax.swing.JLabel nroFaltasPM_HP;
    private javax.swing.JLabel numCPUS_Apple;
    private javax.swing.JLabel numCPUS_HP;
    private javax.swing.JLabel numEnsambladores_Apple;
    private javax.swing.JLabel numEnsambladores_HP;
    private javax.swing.JLabel numFuente_Apple;
    private javax.swing.JLabel numFuentes_HP;
    private javax.swing.JLabel numPlacaBase_Apple;
    private javax.swing.JLabel numPlacaBase_HP;
    private javax.swing.JLabel numRAM_Apple;
    private javax.swing.JLabel numRAM_HP;
    private javax.swing.JLabel numTGraficas_Apple;
    private javax.swing.JLabel numTGraficas_HP;
    private javax.swing.JLabel numTrabajadoresCPU_Apple;
    private javax.swing.JLabel numTrabajadoresCPU_HP;
    private javax.swing.JLabel numTrabajadoresEnsamb_Apple;
    private javax.swing.JLabel numTrabajadoresEnsamb_HP;
    private javax.swing.JLabel numTrabajadoresFuente_Apple;
    private javax.swing.JLabel numTrabajadoresFuente_HP;
    private javax.swing.JLabel numTrabajadoresPB_Apple;
    private javax.swing.JLabel numTrabajadoresPB_HP;
    private javax.swing.JLabel numTrabajadoresRAM_Apple;
    private javax.swing.JLabel numTrabajadoresRAM_HP;
    private javax.swing.JLabel numTrabajadoresTG_Apple;
    private javax.swing.JLabel numTrabajadoresTG_HP;
    private javax.swing.JLabel placaBaseLabel_Apple;
    private javax.swing.JLabel placaBaseLabel_HP;
    private javax.swing.JLabel placaBaseMenu_Apple;
    private javax.swing.JLabel placaBaseMenu_HP;
    private javax.swing.JLabel placasEnStock_Apple;
    private javax.swing.JLabel placasEnStock_HP;
    private javax.swing.JButton removeCPU_Apple;
    private javax.swing.JButton removeCPU_HP;
    private javax.swing.JButton removeEnsamblador_Apple;
    private javax.swing.JButton removeEnsamblador_HP;
    private javax.swing.JButton removeFuente_Apple;
    private javax.swing.JButton removeFuente_HP;
    private javax.swing.JButton removeNumCPUs_Apple;
    private javax.swing.JButton removeNumCPUs_HP;
    private javax.swing.JButton removeNumEnsamb_Apple;
    private javax.swing.JButton removeNumEnsamb_HP;
    private javax.swing.JButton removeNumFuente_Apple;
    private javax.swing.JButton removeNumFuente_HP;
    private javax.swing.JButton removeNumPB_Apple;
    private javax.swing.JButton removeNumPB_HP;
    private javax.swing.JButton removeNumRAM_Apple;
    private javax.swing.JButton removeNumRAM_HP;
    private javax.swing.JButton removeNumTG_Apple;
    private javax.swing.JButton removeNumTG_HP;
    private javax.swing.JButton removePlacaBase_Apple;
    private javax.swing.JButton removePlacaBase_HP;
    private javax.swing.JButton removeRAM_Apple;
    private javax.swing.JButton removeRAM_HP;
    private javax.swing.JButton removeTGrafica_Apple;
    private javax.swing.JButton removeTGrafica_HP;
    private javax.swing.JLabel sueldoDescontadoPMLabel_Apple;
    private javax.swing.JLabel sueldoDescontadoPMLabel_HP;
    private javax.swing.JLabel sueldoDescontadoPM_Apple;
    private javax.swing.JLabel sueldoDescontadoPM_HP;
    private javax.swing.JLabel tGraficaLabel_Apple;
    private javax.swing.JLabel tGraficaLabel_HP;
    private javax.swing.JLabel tGraficasEnStock_Apple;
    private javax.swing.JLabel tGraficasEnStock_HP;
    private javax.swing.JLabel tarjetaGraficaMenu_Apple;
    private javax.swing.JLabel tarjetasGraficasMenu_HP;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel tituloMenu;
    private javax.swing.JLabel utilidadLabel_Apple;
    private javax.swing.JLabel utilidadLabel_HP;
    private javax.swing.JLabel utilidad_Apple;
    private javax.swing.JLabel utilidad_HP;
    private javax.swing.JPanel ventanaApple;
    private javax.swing.JPanel ventanaGrafico;
    private javax.swing.JPanel ventanaHP;
    private javax.swing.JPanel ventanaMenu;
    // End of variables declaration//GEN-END:variables
}
