
package petrinet;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author miguel
 */
public class Main extends javax.swing.JFrame {
    int aux=0;
    int plaza = 0;
    int transicion = 0;
    int marcaje = 0;
    int peso = 0;
    String splaza;
    String stransicion;
    String sdireccion = "--->";
    
    int [][] preMatrix;
    int [][] postMatrix;
    
    ArrayList<Plaza> plazas = new ArrayList<>();
    ArrayList<Transicion> transiciones = new ArrayList<>();
    ArrayList<Arco> arcos = new ArrayList<>();
    ArrayList<JLabel> labelPlaza = new ArrayList<>();
    ArrayList<JLabel> labelTran = new ArrayList<>();
     
    
    int p1x;
    int p1y;
    int p2x;
    int p2y;
    
    public Main() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton2 = new javax.swing.JToggleButton();
        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        label_marcaje = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        trans_sensibilizadas = new javax.swing.JComboBox<>();
        boton_disparo = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        plazas_CB = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        direccion = new javax.swing.JComboBox<>();
        transicion_CB = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btn_crearArco = new javax.swing.JButton();
        redibujar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btn_plaza = new javax.swing.JToggleButton();
        btn_transicion = new javax.swing.JButton();

        jToggleButton2.setText("jToggleButton2");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(254, 254, 254));
        panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel.setPreferredSize(new java.awt.Dimension(800, 600));
        panel.setRequestFocusEnabled(false);
        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Cantarell", 0, 36)); // NOI18N
        jLabel1.setText("<html>Red de<br/>Petri</html>");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setAutoscrolls(true);
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 250));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel5.setText("Marcajes");

        label_marcaje.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_marcaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_marcaje, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setMinimumSize(new java.awt.Dimension(150, 100));
        jPanel3.setPreferredSize(new java.awt.Dimension(250, 54));

        jLabel6.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel6.setText("Transiciones Disparables");

        trans_sensibilizadas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        boton_disparo.setText("Disparar Transición");
        boton_disparo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_disparoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel6)
                        .addGap(0, 44, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(trans_sensibilizadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton_disparo)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trans_sensibilizadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_disparo))
                .addGap(0, 237, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        plazas_CB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));
        plazas_CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plazas_CBActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel2.setText("Plazas");

        jLabel4.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel4.setText("Dirección");

        direccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--->", "<---" }));
        direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionActionPerformed(evt);
            }
        });

        transicion_CB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));
        transicion_CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transicion_CBActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel3.setText("Transiciones");

        btn_crearArco.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        btn_crearArco.setText("Agregar Arco");
        btn_crearArco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearArcoActionPerformed(evt);
            }
        });

        redibujar.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        redibujar.setText("Redibujar");
        redibujar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redibujarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(plazas_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(transicion_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addComponent(btn_crearArco, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(redibujar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(plazas_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(direccion)
                            .addComponent(transicion_CB)))
                    .addComponent(redibujar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_crearArco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_plaza.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        btn_plaza.setText("Plaza");
        btn_plaza.setBorder(null);
        btn_plaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_plazaActionPerformed(evt);
            }
        });

        btn_transicion.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        btn_transicion.setText("Transición");
        btn_transicion.setBorder(null);
        btn_transicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_transicionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addComponent(btn_transicion, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(btn_plaza, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(158, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_transicion, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btn_plaza, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
                        .addGap(39, 39, 39)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

       
    public void createPlaza(int x, int y, int plaza) {
        int imageWidth = 55, imageHeight = 55, marca = 0;
        
        Plaza objPLaza = new Plaza();
        try{
            marca = Integer.parseInt( JOptionPane.showInputDialog(null,"Introduzca la marca de la Plaza", "Marca", JOptionPane.QUESTION_MESSAGE) );
        }catch(HeadlessException | NumberFormatException e){
            JOptionPane.showMessageDialog(null,"La marca debe ser un numero entero positivo");
            marca = Integer.parseInt( JOptionPane.showInputDialog(null,"Introduzca la marca de la Plaza", "Marca", JOptionPane.QUESTION_MESSAGE) );
        }
        
        objPLaza.setMarca(marca);
        objPLaza.setNombrePlaza("P" + (plaza + 1));
        objPLaza.setX(x);
        objPLaza.setY(y);
        plazas.add(objPLaza);
        JLabel label = new JLabel("P" + (plaza + 1));
        ImageIcon icon = new ImageIcon("circulo.png");
        Icon icono = new ImageIcon(icon.getImage().getScaledInstance(imageWidth,imageHeight , Image.SCALE_DEFAULT));
        
        label.setIcon(icono); 
        label.setSize(label.getPreferredSize());
        label.setOpaque(false);
        label.setLocation(x, y);
        //label.setPreferredSize(null);
        //label.setFont(new java.awt.Font("Tahoma", 0, 36));
        
        labelPlaza.add(label);
        panel.add(label);
        //Actualizar lista de plazas en el comboBox
        plazas_CB.removeAllItems();
        Iterator<JLabel> itrT = labelPlaza.iterator();
        while(itrT.hasNext()){
            JLabel tra = itrT.next();
            plazas_CB.addItem(tra.getText());
        }
        updateMarcaje();

    }
    
    public void createTransicion(int x, int y, int transicion) {
        int imageWidth = 55, imageHeight = 55;
        JLabel label = new JLabel("T" + (transicion + 1));
        Transicion obj_Transicion = new Transicion();
        obj_Transicion.setNombreTransicion("T" + (transicion + 1));
        obj_Transicion.setX(x);
        obj_Transicion.setY(y);
        transiciones.add(obj_Transicion);
        ImageIcon icon = new ImageIcon("linea.png");
        Icon icono = new ImageIcon(icon.getImage().getScaledInstance(imageWidth,imageHeight , Image.SCALE_DEFAULT));
        //int eb = 0;
        //Border insideBorder = new EmptyBorder(eb, eb, eb, eb);          
        label.setIcon(icono); 
        label.setSize(label.getPreferredSize());
        label.setOpaque(false);
        label.setLocation(x, y);
        //label.addMouseListener(myMouseAdapter);
        //label.addMouseMotionListener(myMouseAdapter);
       
        labelTran.add(label);
        panel.add(label);
        
        //Actualiza la lista de transiciones
        transicion_CB.removeAllItems();
        Iterator<JLabel> itrT = labelTran.iterator();
        while(itrT.hasNext()){
            JLabel tra = itrT.next();
            transicion_CB.addItem(tra.getText());
        }
    }
    
    public void createArco(String plaza, String transicion, int direccion, int peso, int px1, int py1, int px2, int py2){
        Arco arco = new Arco();
        arco.setPlaza(plaza);
        arco.setTransicion(transicion);
        arco.setDireccion(direccion);
        arco.setPeso(peso);
        arco.setPx(px1);
        arco.setPy(py1);
        arco.setTx(px2);
        arco.setTy(py2);
        arcos.add(arco);
        updateMatrices();
        updateTransicionesSensibilizadas();
        redibujarArcos();
    }       
    
    public void updateMarcaje(){
        String textoMarcaje = "<html>";
        for(int i=0; i<plazas.size(); i++){
            Plaza p = plazas.get(i);
            textoMarcaje = textoMarcaje + p.getNombrePlaza()+ ": "+ p.getMarca()+"<br/>";
        }
        textoMarcaje = textoMarcaje + "</html>";
        label_marcaje.setText(textoMarcaje);
    }
    
    public void updateMatrices(){
        int n_plazas = plazas.size();
        int n_transiciones = transiciones.size();
        preMatrix = new int[n_plazas][n_transiciones];
        postMatrix = new int[n_plazas][n_transiciones];
        for (int fila = 0; fila < n_plazas; fila++){
            for(int col = 0; col < n_transiciones; col++){
                preMatrix[fila][col] = 0;
                postMatrix[fila][col] = 0;
            }
        }
        
        for(int i=0; i<arcos.size(); i++){
            //Recorre los arcos y por cada arco actualiza la matrix Pre
            Arco a = arcos.get(i);
            int p_id = Integer.parseInt(a.getPlaza().substring(1))-1;
            int t_id = Integer.parseInt(a.getTransicion().substring(1))-1;
            int peso = a.getPeso();
            if(a.getDireccion()==Arco.PLAZA_A_TRANS){
                preMatrix[p_id][t_id] = peso;
            }else if(a.getDireccion()==Arco.TRANS_A_PLAZA){
                postMatrix[p_id][t_id] = peso;
            }
        }
        System.out.println("Imprimiendo Matrices:");
        System.out.println("Matriz Pre:");
        for (int fila = 0; fila < n_plazas; fila++){
            for(int col = 0; col < n_transiciones; col++){
                System.out.print(preMatrix[fila][col]);
            }
            System.out.print("\n");
        }
        System.out.println("Matriz Post:");
        for (int fila = 0; fila < n_plazas; fila++){
            for(int col = 0; col < n_transiciones; col++){
                System.out.print(postMatrix[fila][col]);
            }
            System.out.print("\n");
        }
    }
    
    public void updateTransicionesSensibilizadas(){
        //System.out.println("Actualizando transiciones sensibilizadas.");
        trans_sensibilizadas.removeAllItems();
        for(int i=0; i< transiciones.size(); i++){
            int sens = 1;
            for(int j=0;j<plazas.size();j++){
                if(preMatrix[j][i] > plazas.get(j).getMarca()){
                    sens = 0;
                }
            }
            if(sens==1){
                //La transición i está sensibilizada            
                trans_sensibilizadas.addItem("T"+(i+1));
            }
        }
    }
    
    public void dispararTransicion(int index){
        index = index -1;
        for(int i = 0; i < plazas.size(); i++){
            Plaza p = plazas.get(i);
            int m_p = p.getMarca() - preMatrix[i][index] + postMatrix[i][index];
            p.setMarca(m_p);
        }
        updateMarcaje();
        updateTransicionesSensibilizadas();
    }
    
    
    public void redibujarArcos(){
        for(int i=0; i<arcos.size(); i++){
            Arco a = arcos.get(i);
            dibujaArco(a.getPx(), a.getPy(), a.getTx(), a.getTy(), a.getDireccion(), a.getPeso());
        }
    }
            
    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        
    }//GEN-LAST:event_jToggleButton2ActionPerformed
    // cuando se presiona el btn se queda pegado, entonces hay que despegarlo .. xD
    private void btn_plazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_plazaActionPerformed
        aux=1;
        btn_plaza.setSelected(false);
    }//GEN-LAST:event_btn_plazaActionPerformed

    private void panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseClicked
        int x1, x2, y1, y2;
        switch (aux) {
            case 1:
                createPlaza(evt.getX(), evt.getY(), plaza);
                panel.repaint();
                aux=0;
                plaza++;
                break;
            case 2:
                createTransicion(evt.getX(), evt.getY(), transicion);
                panel.repaint();
                aux=0;
                transicion++;
                break;
            default:
                break;
        }
  
    }//GEN-LAST:event_panelMouseClicked

    private void btn_transicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transicionActionPerformed
        aux = 2;
        btn_transicion.setSelected(false);
    }//GEN-LAST:event_btn_transicionActionPerformed

    private void plazas_CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plazas_CBActionPerformed
        //Selecciona plaza de la lista y la guarda en splaza
        splaza = (String) plazas_CB.getSelectedItem();
    }//GEN-LAST:event_plazas_CBActionPerformed

    private void transicion_CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transicion_CBActionPerformed
        //Selecciona la transición y la guarda en la variable strancision
        stransicion = (String) transicion_CB.getSelectedItem();
    }//GEN-LAST:event_transicion_CBActionPerformed

    public void dibujaArco(int px, int py, int tx, int ty, int dir, int peso){
        Graphics g = panel.getGraphics();
        //largo de la flecha
        int dist=15, dibuja = 1;
        //puntos para la flecha
        int p1xf, p1yf, p2xf, p2yf;
        double angSep=25.0, ang=0.0;
        double tyd, txd;
        double pmX;
        double pmY;
        // punto medio para el peso del arco
        pmX = (px + tx)/2;
        pmY = (py + ty)/2;
        //Se crea el objeto arco
        
        if(dir == 0){
            
            tyd=-(py-ty)*1.0;
            txd=(px-tx)*1.0;
            ang=Math.atan (tyd/txd);
            if(txd<0)
            {// si tx es negativo aumentar 180 grados
               ang +=Math.PI;
            }
            p1xf=(int)(tx+dist*Math.cos (ang-Math.toRadians (angSep)));
            p1yf=(int)(ty-dist*Math.sin (ang-Math.toRadians (angSep)));
            p2xf=(int)(tx+dist*Math.cos (ang+Math.toRadians (angSep)));
            p2yf=(int)(ty-dist*Math.sin (ang+Math.toRadians (angSep)));
            
            //peso = Integer.parseInt( JOptionPane.showInputDialog(null,"Introduzca el Peso del Arco", "Peso", JOptionPane.QUESTION_MESSAGE) );
            g.setColor(Color.red);
            g.drawLine(px, py, tx, ty);
            g.drawLine((int)p1xf,(int)p1yf, tx, ty);
            g.drawLine((int)p2xf, (int)p2yf, tx, ty);
            g.drawString(Integer.toString(peso) , (int)pmX, (int)pmY);
            
        }else if(dir == 1){
            
            tyd=-(ty-py)*1.0;
            txd=(tx-px)*1.0;
            ang=Math.atan (tyd/txd);
            if(txd<0)
            {// si tx es negativo aumentar 180 grados
               ang +=Math.PI;
            }
            p1xf=(int)(px+dist*Math.cos (ang-Math.toRadians (angSep)));
            p1yf=(int)(py-dist*Math.sin (ang-Math.toRadians (angSep)));
            p2xf=(int)(px+dist*Math.cos (ang+Math.toRadians (angSep)));
            p2yf=(int)(py-dist*Math.sin (ang+Math.toRadians (angSep)));
            
            
            g.setColor(Color.blue);
            g.drawLine(px, py, tx, ty);
            g.drawLine((int)p1xf,(int)p1yf, px, py);
            g.drawLine((int)p2xf, (int)p2yf, px, py);
            g.drawString(Integer.toString(peso) , (int)pmX, (int)pmY); 
            
            
        } 
    }
    
    
    
    private void btn_crearArcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearArcoActionPerformed
        if (plazas.size() > 0 && transiciones.size() > 0) {
            int dibuja = 1;
        Iterator<JLabel> itrT = labelPlaza.iterator();
        Iterator<JLabel> itrTR = labelTran.iterator();
        while(itrT.hasNext()){
            JLabel tra = itrT.next();
            if (tra.getText().equals(splaza)) {
               p1x = tra.getX();
               p1y = tra.getY();
            }
        }
        while(itrTR.hasNext()){
            JLabel tran = itrTR.next();
            if (tran.getText().equals(stransicion)) {
                p2x = tran.getX();
                p2y = tran.getY();
            }
        }
        
        
        if (direccion.getSelectedItem().equals("--->")) {
            p1x = p1x + 25;
            p1y = p1y + 40;
            p2x = p2x + 15;
            p2y = p2y + 15;
            
            if (arcos.size()>=1) {
                for (int i = 0; i < arcos.size(); i++) {
                    //si la plaza y la transicion existen y ademas existe en esa direccion ... 
                    if (arcos.get(i).getPlaza().equals(splaza) && arcos.get(i).getTransicion().equals(stransicion) && arcos.get(i).getDireccion() == 0) {
                        //envia el mensaje
                        JOptionPane.showMessageDialog(null,"El arco ya Existe"); 
                        dibuja = 0;
                    }
                }
                if (dibuja  == 1 ) {
                    try{
                        peso = Integer.parseInt( JOptionPane.showInputDialog(null,"Introduzca el Peso del Arco", "Peso", JOptionPane.QUESTION_MESSAGE) );
                    }catch(HeadlessException | NumberFormatException e){
                        JOptionPane.showMessageDialog(null,"La Peso debe ser un numero entero positivo");
                        peso = Integer.parseInt( JOptionPane.showInputDialog(null,"Introduzca el Peso del Arco", "Peso", JOptionPane.QUESTION_MESSAGE) );
                    }
                    
                    dibujaArco(p1x, p1y, p2x, p2y, 0 , peso);
                    createArco(splaza, stransicion, 0, peso, p1x, p1y, p2x, p2y);
                }
            }else{
                try{
                    peso = Integer.parseInt( JOptionPane.showInputDialog(null,"Introduzca el Peso del Arco", "Peso", JOptionPane.QUESTION_MESSAGE) );
                }catch(HeadlessException | NumberFormatException e){
                    JOptionPane.showMessageDialog(null,"La Peso debe ser un numero entero positivo");
                    peso = Integer.parseInt( JOptionPane.showInputDialog(null,"Introduzca el Peso del Arco", "Peso", JOptionPane.QUESTION_MESSAGE) );
                }
                dibujaArco(p1x, p1y, p2x, p2y, 0, peso );
                createArco(splaza, stransicion, 0, peso, p1x, p1y, p2x, p2y);
            }
            
            
        }else if(direccion.getSelectedItem().equals("<---")){
            p1x = p1x + 35;
            p1y = p1y + 20;
            p2x = p2x + 35;
            p2y = p2y + 25;
            
            if (arcos.size()>=1) {
                for (int i = 0; i < arcos.size(); i++) {
                    //si la plaza y la transicion existen y ademas existe en esa direccion ... 
                    if (arcos.get(i).getPlaza().equals(splaza) && arcos.get(i).getTransicion().equals(stransicion) && arcos.get(i).getDireccion() == 1) {
                        //envia el mensaje
                        JOptionPane.showMessageDialog(null,"El arco ya Existe"); 
                        dibuja = 0;
                    }
                }
                if (dibuja  == 1 ) {
                    try{
                        peso = Integer.parseInt( JOptionPane.showInputDialog(null,"Introduzca el Peso del Arco", "Peso", JOptionPane.QUESTION_MESSAGE) );
                    }catch(HeadlessException | NumberFormatException e){
                        JOptionPane.showMessageDialog(null,"La Peso debe ser un numero entero positivo");
                        peso = Integer.parseInt( JOptionPane.showInputDialog(null,"Introduzca el Peso del Arco", "Peso", JOptionPane.QUESTION_MESSAGE) );
                    }
                    dibujaArco(p1x, p1y, p2x, p2y, 1, peso );
                    createArco(splaza, stransicion, 1, peso, p1x, p1y, p2x, p2y);
                }
            }else{
                try{
                    peso = Integer.parseInt( JOptionPane.showInputDialog(null,"Introduzca el Peso del Arco", "Peso", JOptionPane.QUESTION_MESSAGE) );
                }catch(HeadlessException | NumberFormatException e){
                    JOptionPane.showMessageDialog(null,"La Peso debe ser un numero entero positivo");
                    peso = Integer.parseInt( JOptionPane.showInputDialog(null,"Introduzca el Peso del Arco", "Peso", JOptionPane.QUESTION_MESSAGE) );
                }
                dibujaArco(p1x, p1y, p2x, p2y, 1, peso );
                createArco(splaza, stransicion, 1, peso, p1x, p1y, p2x, p2y);
            }
        }
        }else{
            JOptionPane.showMessageDialog(null,"No hay las Pazas o Transiciones suficientes para crear arcos");
        }
        
              
        
    }//GEN-LAST:event_btn_crearArcoActionPerformed

    private void direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionActionPerformed
        // TODO add your handling code here:
        sdireccion = (String) direccion.getSelectedItem();
    }//GEN-LAST:event_direccionActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MousePressed

    private void boton_disparoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_disparoActionPerformed
        if(trans_sensibilizadas.getItemCount()>0){
            String trans = (String) trans_sensibilizadas.getSelectedItem();
            int ind = Integer.parseInt(trans.substring(1));
            dispararTransicion(ind);
        }else{
            JOptionPane.showMessageDialog(null, "No hay transiciones sensibilizadas."); 
        }        
    }//GEN-LAST:event_boton_disparoActionPerformed

    private void redibujarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redibujarActionPerformed
        redibujarArcos();
    }//GEN-LAST:event_redibujarActionPerformed

    
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_disparo;
    private javax.swing.JButton btn_crearArco;
    private javax.swing.JToggleButton btn_plaza;
    private javax.swing.JButton btn_transicion;
    private javax.swing.JComboBox<String> direccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JLabel label_marcaje;
    private javax.swing.JPanel panel;
    private javax.swing.JComboBox<String> plazas_CB;
    private javax.swing.JButton redibujar;
    private javax.swing.JComboBox<String> trans_sensibilizadas;
    private javax.swing.JComboBox<String> transicion_CB;
    // End of variables declaration//GEN-END:variables
    class MyMouseAdapter extends MouseAdapter {

       private Point initialLoc;
       private Point initialLocOnScreen;

       public void mouseClicked(MouseEvent e) {
          Component comp = (Component)e.getSource();

          initialLoc = comp.getLocation();
          initialLocOnScreen = e.getLocationOnScreen();  
       }

       @Override
       public void mousePressed(MouseEvent e) {
          Component comp = (Component)e.getSource();
          initialLoc = comp.getLocation();
          initialLocOnScreen = e.getLocationOnScreen();
       }

       @Override
       public void mouseReleased(MouseEvent e) {
          Component comp = (Component)e.getSource();
          Point locOnScreen = e.getLocationOnScreen();

          int x = locOnScreen.x - initialLocOnScreen.x + initialLoc.x;
          int y = locOnScreen.y - initialLocOnScreen.y + initialLoc.y;
          comp.setLocation(x, y);
       }

       @Override
       public void mouseDragged(MouseEvent e) {
          Component comp = (Component)e.getSource();
          Point locOnScreen = e.getLocationOnScreen();

          int x = locOnScreen.x - initialLocOnScreen.x + initialLoc.x;
          int y = locOnScreen.y - initialLocOnScreen.y + initialLoc.y;
          comp.setLocation(x, y);
       }
    }
    
    
}




