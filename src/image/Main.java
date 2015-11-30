
package image;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

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
    String strancision;
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
        btn_plaza = new javax.swing.JToggleButton();
        btn_transicion = new javax.swing.JButton();
        plazas_CB = new javax.swing.JComboBox<>();
        transicion_CB = new javax.swing.JComboBox<>();
        btn_crearArco = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        direccion = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        label_marcaje = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

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
            .addGap(0, 682, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Cantarell", 0, 36)); // NOI18N
        jLabel1.setText("Red de Petri");

        btn_plaza.setText("Plaza");
        btn_plaza.setBorder(null);
        btn_plaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_plazaActionPerformed(evt);
            }
        });

        btn_transicion.setText("Transición");
        btn_transicion.setBorder(null);
        btn_transicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_transicionActionPerformed(evt);
            }
        });

        plazas_CB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));
        plazas_CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plazas_CBActionPerformed(evt);
            }
        });

        transicion_CB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));
        transicion_CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transicion_CBActionPerformed(evt);
            }
        });

        btn_crearArco.setText("Agregar Arco");
        btn_crearArco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearArcoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel2.setText("Plazas");

        jLabel3.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel3.setText("Transiciones");

        direccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--->", "<---" }));
        direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel4.setText("Dirección");

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
                .addContainerGap(102, Short.MAX_VALUE))
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

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        jButton2.setText("Disparar Transición");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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
                        .addGap(0, 32, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(0, 237, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(btn_plaza, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_transicion, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(plazas_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(transicion_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btn_crearArco, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(309, 309, 309))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_crearArco, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(plazas_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(direccion)
                                .addComponent(transicion_CB))
                            .addComponent(btn_transicion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_plaza, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void createPlaza(int x, int y, int plaza) {
        int imageWidth = 55, imageHeight = 55, marca = 0;
        panel.setLayout(null);
        MyMouseAdapter myMouseAdapter = new MyMouseAdapter();
        Plaza objPLaza = new Plaza();
        marca = Integer.parseInt( JOptionPane.showInputDialog(null,"Introduzca la marca de la Plaza", "Marca", JOptionPane.QUESTION_MESSAGE) );
        objPLaza.setMarca(marca);
        objPLaza.setNombrePlaza("P" + (plaza + 1));
        objPLaza.setX(x);
        objPLaza.setY(y);
        plazas.add(objPLaza);
        JLabel label = new JLabel("P" + (plaza + 1));
        ImageIcon icon = new ImageIcon("circulo.png");
        Icon icono = new ImageIcon(icon.getImage().getScaledInstance(imageWidth,imageHeight , Image.SCALE_DEFAULT));
        int eb = 0;
        Border insideBorder = new EmptyBorder(eb, eb, eb, eb); 
        
        label.setIcon(icono); 
        label.setSize(label.getPreferredSize());
        label.setOpaque(false);
        label.setLocation(x, y);
        
        //label.addMouseListener(myMouseAdapter);
        //label.addMouseMotionListener(myMouseAdapter);
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
        panel.setLayout(null);
        MyMouseAdapter myMouseAdapter = new MyMouseAdapter();
        JLabel label = new JLabel("T" + (transicion + 1));
        Transicion obj_Transicion = new Transicion();
        obj_Transicion.setNombreTransicion("T" + (transicion + 1));
        obj_Transicion.setX(x);
        obj_Transicion.setY(y);
        transiciones.add(obj_Transicion);
        ImageIcon icon = new ImageIcon("linea.png");
        Icon icono = new ImageIcon(icon.getImage().getScaledInstance(imageWidth,imageHeight , Image.SCALE_DEFAULT));
        int eb = 0;
        Border insideBorder = new EmptyBorder(eb, eb, eb, eb);          
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
    
    public void createArco(String plaza, String transicion, int direccion, int peso){
        Arco arco = new Arco();
        arco.setPlaza(plaza);
        arco.setTransicion(transicion);
        arco.setDireccion(direccion);
        arco.setPeso(peso);
        //TODO: Verificar que no se añada un arco si es que ya está en la lista
        
        //System.out.println("Añadido arco con:" + plaza + transicion + direccion + peso);
        arcos.add(arco);
        updateMatrices();
    }
    
    public void updateArcos(){
        
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
    //función que busca la matriz C (matriz post - matriz pre) ... 
    //hay que ver las excepciones de tal forma que la resta se pueda hacer
    public int[][] matrizC(int post[][], int pre[][]){
        int C[][] = new int[plazas.size()][transiciones.size()];
        for (int i = 0; i < plazas.size(); i++) {
            for (int j = 0; j < transiciones.size(); j++) {
                C[i][j] = post[i][j] - pre[i][j];
            }
        }
        return C;
    }
    
    //funcion para sacar el producto entre la matriz C con el vector caracteristico
    //hay que ver las excepciones de tal forma que la resta se pueda hacer
    public int[] producto(int A[][], int B[]){
	int suma = 0;
	int result[] = new int[plazas.size()];
            for(int i = 0; i < plazas.size(); i++){
                for(int j = 0; j < B.length; j++){
                    suma = 0;
                    for(int k = 0; k < B.length; k++){
                        suma += A[i][k] * B[k];
                    }
                    result[i] = suma;
		}
            }
	return result;
    }
    //funcion que encuentra el siguiente marcaje
    public int[] sigMarcaje(int M0[], int B[]){
        int result[] = new int[plazas.size()];
        for (int i = 0; i < plazas.size(); i++) {
            result[i] = M0[i] + B[i];
        }
        return result;
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
                
                Iterator<JLabel> itre = labelPlaza.iterator();
                while(itre.hasNext()){
                        JLabel pla = itre.next();
                }
                
                Iterator<Plaza> itr = plazas.iterator();
                while(itr.hasNext()){
                        Plaza pla = itr.next();
                }
                break;
            case 2:
                createTransicion(evt.getX(), evt.getY(), transicion);
                panel.repaint();
                aux=0;
                transicion++;
                Iterator<Transicion> itrT = transiciones.iterator();
                while(itrT.hasNext()){
                        Transicion tra = itrT.next();
                }
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
        strancision = (String) transicion_CB.getSelectedItem();
    }//GEN-LAST:event_transicion_CBActionPerformed

    private void btn_crearArcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearArcoActionPerformed
        Graphics g = panel.getGraphics();
        //largo de la flecha
        int dist=15, dibuja = 1;
        //puntos para la flecha
        int p1xf, p1yf, p2xf, p2yf;
        double angSep=25.0, ang=0.0;
        double ty, tx;
        double pmX;
        double pmY;
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
            if (tran.getText().equals(strancision)) {
                p2x = tran.getX();
                p2y = tran.getY();
            }
        }
        pmX = (p1x + p2x)/2;
        pmY = (p1y + p2y)/2;
        //Se crea el objeto arco
        int dir = 0;
        if(sdireccion.equals("--->")){
            
            dir = Arco.PLAZA_A_TRANS;
            p1x = p1x + 30;
            p1y = p1y + 55;
            p2x = p2x + 10;
            p2y = p2y + 20;
            ty=-(p1y-p2y)*1.0;
            tx=(p1x-p2x)*1.0;
            ang=Math.atan (ty/tx);
            if(tx<0)
            {// si tx es negativo aumentar 180 grados
               ang +=Math.PI;
            }
            p1xf=(int)(p2x+dist*Math.cos (ang-Math.toRadians (angSep)));
            p1yf=(int)(p2y-dist*Math.sin (ang-Math.toRadians (angSep)));
            p2xf=(int)(p2x+dist*Math.cos (ang+Math.toRadians (angSep)));
            p2yf=(int)(p2y-dist*Math.sin (ang+Math.toRadians (angSep)));
            
            
            if (arcos.size() >= 1) {
                System.out.println(arcos.size());
                for (int i = 0; i < arcos.size(); i++) {
                    if (arcos.get(i).getPlaza().equals(splaza) && arcos.get(i).getTransicion().equals(strancision) && arcos.get(i).getDireccion() == 0) {
                        //envia el mensaje
                        JOptionPane.showMessageDialog(null,"El arco ya Existe"); 
                        dibuja = 0;
                    }
                }
                if (dibuja == 1) {
                    peso = Integer.parseInt( JOptionPane.showInputDialog(null,"Introduzca el Peso del Arco", "Peso", JOptionPane.QUESTION_MESSAGE) );
                    g.setColor(Color.red);
                    g.drawLine(p1x, p1y, p2x, p2y);
                    g.drawLine((int)p1xf,(int)p1yf, p2x, p2y);
                    g.drawLine((int)p2xf, (int)p2yf, p2x, p2y);
                    g.drawString(Integer.toString(peso) , (int)pmX + 15, (int)pmY + 15);
                    createArco(splaza, strancision, dir, peso);
                }
            }else{
                peso = Integer.parseInt( JOptionPane.showInputDialog(null,"Introduzca el Peso del Arco", "Peso", JOptionPane.QUESTION_MESSAGE) );
                g.setColor(Color.red);
                g.drawLine(p1x, p1y, p2x, p2y);
                g.drawLine((int)p1xf,(int)p1yf, p2x, p2y);
                g.drawLine((int)p2xf, (int)p2yf, p2x, p2y);
                g.drawString(Integer.toString(peso) , (int)pmX + 15, (int)pmY + 15);
                createArco(splaza, strancision, dir, peso);
            }
            
            
            
            
        }else if(sdireccion.equals("<---")){
            
            dir = Arco.TRANS_A_PLAZA;
            p1x = p1x + 40;
            p1y = p1y + 55;
            p2x = p2x + 25;
            p2y = p2y + 25;
            ty=-(p2y-p1y)*1.0;
            tx=(p2x-p1x)*1.0;
            ang=Math.atan (ty/tx);
            if(tx<0)
            {// si tx es negativo aumentar 180 grados
               ang +=Math.PI;
            }
            p1xf=(int)(p1x+dist*Math.cos (ang-Math.toRadians (angSep)));
            p1yf=(int)(p1y-dist*Math.sin (ang-Math.toRadians (angSep)));
            p2xf=(int)(p1x+dist*Math.cos (ang+Math.toRadians (angSep)));
            p2yf=(int)(p1y-dist*Math.sin (ang+Math.toRadians (angSep)));

            
            if (arcos.size() >= 1) {
                System.out.println(arcos.size());
                for (int i = 0; i < arcos.size(); i++) {
                    if (arcos.get(i).getPlaza().equals(splaza) && arcos.get(i).getTransicion().equals(strancision) && arcos.get(i).getDireccion() == 1) {
                        //envia el mensaje
                        JOptionPane.showMessageDialog(null,"El arco ya Existe"); 
                        dibuja = 0;
                    }
                }
                if (dibuja == 1) {
                    peso = Integer.parseInt( JOptionPane.showInputDialog(null,"Introduzca el Peso del Arco", "Peso", JOptionPane.QUESTION_MESSAGE) );
                    g.setColor(Color.blue);
                    g.drawLine(p1x, p1y, p2x, p2y);
                    g.drawLine((int)p1xf,(int)p1yf, p1x, p1y);
                    g.drawLine((int)p2xf, (int)p2yf, p1x, p1y);
                    g.drawString(Integer.toString(peso) , (int)pmX, (int)pmY);
                    createArco(splaza, strancision, dir, peso);
                }
            }else{
                peso = Integer.parseInt( JOptionPane.showInputDialog(null,"Introduzca el Peso del Arco", "Peso", JOptionPane.QUESTION_MESSAGE) );
                g.setColor(Color.blue);
                g.drawLine(p1x, p1y, p2x, p2y);
                g.drawLine((int)p1xf,(int)p1yf, p1x, p1y);
                g.drawLine((int)p2xf, (int)p2yf, p1x, p1y);
                g.drawString(Integer.toString(peso) , (int)pmX, (int)pmY);
                createArco(splaza, strancision, dir, peso);
            }
            
            
        }
        
    }//GEN-LAST:event_btn_crearArcoActionPerformed

    private void direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionActionPerformed
        // TODO add your handling code here:
        sdireccion = (String) direccion.getSelectedItem();
    }//GEN-LAST:event_direccionActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    
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
    private javax.swing.JButton btn_crearArco;
    private javax.swing.JToggleButton btn_plaza;
    private javax.swing.JButton btn_transicion;
    private javax.swing.JComboBox<String> direccion;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JLabel label_marcaje;
    private javax.swing.JPanel panel;
    private javax.swing.JComboBox<String> plazas_CB;
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


class DibujaArco extends JComponent {

    private static final int N = 20;
    private Point n1, n2;

    public DibujaArco(int w, int h) {
        this.setPreferredSize(new Dimension(w, h));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.n1 = new Point(N, N);
        this.n2 = new Point(getWidth() - N, getHeight() - N);
        g.drawLine(n1.x, n1.y, n2.x, n2.y);
        double d = n1.distance(n2);
        this.setToolTipText(String.valueOf(d));
        g.drawString(String.valueOf((int) d),
            (n1.x + n2.x) / 2, (n1.y + n2.y) / 2);
    }

    private void display() {
        JFrame f = new JFrame("EdgeLabel");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new DibujaArco(320, 240));
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                display();
            }
        });
    }
}


}




