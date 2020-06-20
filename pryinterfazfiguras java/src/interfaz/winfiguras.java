/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import negocio.clscirculo;
import negocio.clscuadrilatero;
import negocio.clspoligonoreg;
import negocio.clstriangulo;
import negocio.figura;

/**
 *
 * @author Programacion Objetos
 */
public class winfiguras extends javax.swing.JFrame {

    float radio ;
    float longitud,apotema;
    int lados;
    float lado1 , lado2,lado3;
    float largo , ancho ;
    clspoligonoreg areapoligono, perpoligono;
    clscirculo areacirculo , percirculo;
    clstriangulo areatriangulo,pertriangulo;
    clscuadrilatero areacuadrilatero ,percuadrilatero;
    public winfiguras() {
        initComponents();
        
        grupofiguras.add(btncirculo);
        grupofiguras.add(btntriangulo);
        grupofiguras.add(btncuadrilatero);
        grupofiguras.add(btnpoligono);
        
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frmcirculo = new javax.swing.JFrame();
        txtradio = new javax.swing.JTextField();
        lblcirculo = new javax.swing.JLabel();
        btnarea = new javax.swing.JButton();
        btnperimetro = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        lblmensaje = new javax.swing.JLabel();
        lblradio = new javax.swing.JLabel();
        txtresradio = new javax.swing.JTextField();
        frmpoligono = new javax.swing.JFrame();
        btnareapoligono = new javax.swing.JButton();
        btnperimetropoligono = new javax.swing.JButton();
        btnlimpiarpoligono = new javax.swing.JButton();
        txtlongitud = new javax.swing.JTextField();
        txtapotema = new javax.swing.JTextField();
        txtlados = new javax.swing.JTextField();
        txtpoligono = new javax.swing.JTextField();
        lblongitud = new javax.swing.JLabel();
        lblongitud1 = new javax.swing.JLabel();
        lblmensajepoligono = new javax.swing.JLabel();
        lblongitud2 = new javax.swing.JLabel();
        lblpoligono = new javax.swing.JLabel();
        frmtriangulo = new javax.swing.JFrame();
        btnareatriangulo = new javax.swing.JButton();
        btnperimetrotriangulo = new javax.swing.JButton();
        btnlimpiartriangulo = new javax.swing.JButton();
        txtlado1 = new javax.swing.JTextField();
        txtlado2 = new javax.swing.JTextField();
        txtlado3 = new javax.swing.JTextField();
        txttriangulo = new javax.swing.JTextField();
        Lado1 = new javax.swing.JLabel();
        lblongitud4 = new javax.swing.JLabel();
        lblmensajetriangulo = new javax.swing.JLabel();
        lblongitud5 = new javax.swing.JLabel();
        lbltriangulo = new javax.swing.JLabel();
        frmcuadrilatero = new javax.swing.JFrame();
        btnareacuadrilatero = new javax.swing.JButton();
        btnperimetrocuadrilatero = new javax.swing.JButton();
        btnlimpiarcuadrilatero = new javax.swing.JButton();
        txtlargo = new javax.swing.JTextField();
        txtancho = new javax.swing.JTextField();
        txtcuadrilatero = new javax.swing.JTextField();
        Lado2 = new javax.swing.JLabel();
        lblmensajecuadrilatero = new javax.swing.JLabel();
        lblongitud7 = new javax.swing.JLabel();
        lblcuadrilatero = new javax.swing.JLabel();
        grupofiguras = new javax.swing.ButtonGroup();
        btnsalir = new javax.swing.JButton();
        btncirculo = new javax.swing.JRadioButton();
        btntriangulo = new javax.swing.JRadioButton();
        btncuadrilatero = new javax.swing.JRadioButton();
        btnpoligono = new javax.swing.JRadioButton();

        frmcirculo.setLocation(new java.awt.Point(400, 200));
        frmcirculo.setMinimumSize(new java.awt.Dimension(400, 200));

        txtradio.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        txtradio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        lblcirculo.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        lblcirculo.setForeground(new java.awt.Color(153, 0, 0));
        lblcirculo.setName("lblcirculo"); // NOI18N

        btnarea.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        btnarea.setText("Area");
        btnarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnareaActionPerformed(evt);
            }
        });

        btnperimetro.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        btnperimetro.setText("Perimetro");
        btnperimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnperimetroActionPerformed(evt);
            }
        });

        btnlimpiar.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        lblmensaje.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        lblmensaje.setForeground(new java.awt.Color(153, 0, 0));
        lblmensaje.setName("lblmensajecirculo"); // NOI18N

        lblradio.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        lblradio.setForeground(new java.awt.Color(153, 0, 0));
        lblradio.setText("Radio");

        txtresradio.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        txtresradio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtresradio.setToolTipText("");
        txtresradio.setEnabled(false);

        javax.swing.GroupLayout frmcirculoLayout = new javax.swing.GroupLayout(frmcirculo.getContentPane());
        frmcirculo.getContentPane().setLayout(frmcirculoLayout);
        frmcirculoLayout.setHorizontalGroup(
            frmcirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmcirculoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(frmcirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblradio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcirculo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnarea))
                .addGap(18, 18, 18)
                .addGroup(frmcirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmcirculoLayout.createSequentialGroup()
                        .addGroup(frmcirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtradio, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtresradio, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblmensaje, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                    .addGroup(frmcirculoLayout.createSequentialGroup()
                        .addComponent(btnperimetro)
                        .addGap(18, 18, 18)
                        .addComponent(btnlimpiar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        frmcirculoLayout.setVerticalGroup(
            frmcirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmcirculoLayout.createSequentialGroup()
                .addGroup(frmcirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmcirculoLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(frmcirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblradio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtradio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(frmcirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtresradio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblcirculo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmcirculoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblmensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addGroup(frmcirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnarea)
                    .addComponent(btnperimetro)
                    .addComponent(btnlimpiar))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        frmpoligono.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        frmpoligono.setTitle("Poligono");
        frmpoligono.setLocation(new java.awt.Point(400, 200));
        frmpoligono.setMinimumSize(new java.awt.Dimension(400, 400));

        btnareapoligono.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        btnareapoligono.setText("Area");
        btnareapoligono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnareapoligonoActionPerformed(evt);
            }
        });

        btnperimetropoligono.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        btnperimetropoligono.setText("Perimetro");
        btnperimetropoligono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnperimetropoligonoActionPerformed(evt);
            }
        });

        btnlimpiarpoligono.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        btnlimpiarpoligono.setText("Limpiar");
        btnlimpiarpoligono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarpoligonoActionPerformed(evt);
            }
        });

        txtlongitud.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        txtlongitud.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtapotema.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        txtapotema.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtlados.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        txtlados.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtpoligono.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        txtpoligono.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtpoligono.setEnabled(false);

        lblongitud.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        lblongitud.setText("Longitud");

        lblongitud1.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        lblongitud1.setText("Lados");

        lblongitud2.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        lblongitud2.setText("Apotema");

        lblpoligono.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N

        javax.swing.GroupLayout frmpoligonoLayout = new javax.swing.GroupLayout(frmpoligono.getContentPane());
        frmpoligono.getContentPane().setLayout(frmpoligonoLayout);
        frmpoligonoLayout.setHorizontalGroup(
            frmpoligonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmpoligonoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(frmpoligonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(frmpoligonoLayout.createSequentialGroup()
                        .addComponent(btnareapoligono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnperimetropoligono)
                        .addGap(18, 18, 18)
                        .addComponent(btnlimpiarpoligono)
                        .addContainerGap(66, Short.MAX_VALUE))
                    .addGroup(frmpoligonoLayout.createSequentialGroup()
                        .addGroup(frmpoligonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblongitud)
                            .addComponent(lblongitud1)
                            .addComponent(lblongitud2)
                            .addComponent(lblpoligono))
                        .addGap(39, 39, 39)
                        .addGroup(frmpoligonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtlados)
                            .addComponent(txtapotema)
                            .addComponent(txtlongitud)
                            .addComponent(txtpoligono, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(lblmensajepoligono, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        frmpoligonoLayout.setVerticalGroup(
            frmpoligonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmpoligonoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(frmpoligonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtlongitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblongitud))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frmpoligonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmpoligonoLayout.createSequentialGroup()
                        .addGroup(frmpoligonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtapotema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblongitud2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(frmpoligonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtlados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblongitud1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmpoligonoLayout.createSequentialGroup()
                        .addComponent(lblmensajepoligono, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGroup(frmpoligonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpoligono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblpoligono))
                .addGap(18, 18, 18)
                .addGroup(frmpoligonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnareapoligono)
                    .addComponent(btnperimetropoligono)
                    .addComponent(btnlimpiarpoligono))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        frmtriangulo.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        frmtriangulo.setTitle("Poligono");
        frmtriangulo.setLocation(new java.awt.Point(400, 200));
        frmtriangulo.setMinimumSize(new java.awt.Dimension(400, 400));

        btnareatriangulo.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        btnareatriangulo.setText("Area");
        btnareatriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnareatrianguloActionPerformed(evt);
            }
        });

        btnperimetrotriangulo.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        btnperimetrotriangulo.setText("Perimetro");
        btnperimetrotriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnperimetrotrianguloActionPerformed(evt);
            }
        });

        btnlimpiartriangulo.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        btnlimpiartriangulo.setText("Limpiar");
        btnlimpiartriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiartrianguloActionPerformed(evt);
            }
        });

        txtlado1.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        txtlado1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtlado2.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        txtlado2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtlado3.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        txtlado3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txttriangulo.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        txttriangulo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txttriangulo.setEnabled(false);

        Lado1.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        Lado1.setText("Lado 1");

        lblongitud4.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        lblongitud4.setText("Lado 3");

        lblongitud5.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        lblongitud5.setText("Lado 2");

        lbltriangulo.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N

        javax.swing.GroupLayout frmtrianguloLayout = new javax.swing.GroupLayout(frmtriangulo.getContentPane());
        frmtriangulo.getContentPane().setLayout(frmtrianguloLayout);
        frmtrianguloLayout.setHorizontalGroup(
            frmtrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmtrianguloLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(frmtrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(frmtrianguloLayout.createSequentialGroup()
                        .addComponent(btnareatriangulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnperimetrotriangulo)
                        .addGap(18, 18, 18)
                        .addComponent(btnlimpiartriangulo)
                        .addContainerGap(66, Short.MAX_VALUE))
                    .addGroup(frmtrianguloLayout.createSequentialGroup()
                        .addGroup(frmtrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lado1)
                            .addComponent(lblongitud4)
                            .addComponent(lblongitud5)
                            .addComponent(lbltriangulo))
                        .addGap(39, 39, 39)
                        .addGroup(frmtrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtlado3)
                            .addComponent(txtlado2)
                            .addComponent(txtlado1)
                            .addComponent(txttriangulo, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(lblmensajetriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        frmtrianguloLayout.setVerticalGroup(
            frmtrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmtrianguloLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(frmtrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtlado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lado1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frmtrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmtrianguloLayout.createSequentialGroup()
                        .addGroup(frmtrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtlado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblongitud5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(frmtrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtlado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblongitud4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmtrianguloLayout.createSequentialGroup()
                        .addComponent(lblmensajetriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGroup(frmtrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltriangulo))
                .addGap(18, 18, 18)
                .addGroup(frmtrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnareatriangulo)
                    .addComponent(btnperimetrotriangulo)
                    .addComponent(btnlimpiartriangulo))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        frmcuadrilatero.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        frmcuadrilatero.setTitle("Poligono");
        frmcuadrilatero.setLocation(new java.awt.Point(400, 200));
        frmcuadrilatero.setMinimumSize(new java.awt.Dimension(400, 400));

        btnareacuadrilatero.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        btnareacuadrilatero.setText("Area");
        btnareacuadrilatero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnareacuadrilateroActionPerformed(evt);
            }
        });

        btnperimetrocuadrilatero.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        btnperimetrocuadrilatero.setText("Perimetro");
        btnperimetrocuadrilatero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnperimetrocuadrilateroActionPerformed(evt);
            }
        });

        btnlimpiarcuadrilatero.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        btnlimpiarcuadrilatero.setText("Limpiar");
        btnlimpiarcuadrilatero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarcuadrilateroActionPerformed(evt);
            }
        });

        txtlargo.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        txtlargo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtancho.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        txtancho.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtcuadrilatero.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        txtcuadrilatero.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtcuadrilatero.setEnabled(false);

        Lado2.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        Lado2.setText("Largo");

        lblongitud7.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        lblongitud7.setText("Ancho");

        lblcuadrilatero.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N

        javax.swing.GroupLayout frmcuadrilateroLayout = new javax.swing.GroupLayout(frmcuadrilatero.getContentPane());
        frmcuadrilatero.getContentPane().setLayout(frmcuadrilateroLayout);
        frmcuadrilateroLayout.setHorizontalGroup(
            frmcuadrilateroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmcuadrilateroLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnareacuadrilatero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnperimetrocuadrilatero)
                .addGap(18, 18, 18)
                .addComponent(btnlimpiarcuadrilatero)
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmcuadrilateroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(frmcuadrilateroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(frmcuadrilateroLayout.createSequentialGroup()
                        .addGroup(frmcuadrilateroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lado2)
                            .addComponent(lblongitud7))
                        .addGap(39, 39, 39))
                    .addGroup(frmcuadrilateroLayout.createSequentialGroup()
                        .addComponent(lblcuadrilatero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(frmcuadrilateroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtancho)
                    .addComponent(txtlargo)
                    .addComponent(txtcuadrilatero, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lblmensajecuadrilatero, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        frmcuadrilateroLayout.setVerticalGroup(
            frmcuadrilateroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmcuadrilateroLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(frmcuadrilateroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtlargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lado2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frmcuadrilateroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(frmcuadrilateroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtancho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblongitud7))
                    .addComponent(lblmensajecuadrilatero, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frmcuadrilateroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtcuadrilatero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcuadrilatero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(frmcuadrilateroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnareacuadrilatero)
                    .addComponent(btnperimetrocuadrilatero)
                    .addComponent(btnlimpiarcuadrilatero))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("APLICACION FIGURA");
        setLocation(new java.awt.Point(400, 200));
        setName("frmcirculo"); // NOI18N

        btnsalir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        grupofiguras.add(btncirculo);
        btncirculo.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        btncirculo.setForeground(new java.awt.Color(204, 0, 204));
        btncirculo.setText("Circulo");
        btncirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncirculoActionPerformed(evt);
            }
        });

        grupofiguras.add(btntriangulo);
        btntriangulo.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        btntriangulo.setForeground(new java.awt.Color(204, 0, 204));
        btntriangulo.setText("Triangulo");
        btntriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntrianguloActionPerformed(evt);
            }
        });

        grupofiguras.add(btncuadrilatero);
        btncuadrilatero.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        btncuadrilatero.setForeground(new java.awt.Color(204, 0, 204));
        btncuadrilatero.setText("Cuadrilatero");
        btncuadrilatero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncuadrilateroActionPerformed(evt);
            }
        });

        grupofiguras.add(btnpoligono);
        btnpoligono.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        btnpoligono.setForeground(new java.awt.Color(204, 0, 204));
        btnpoligono.setText("Poligono");
        btnpoligono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpoligonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btncuadrilatero)
                    .addComponent(btntriangulo)
                    .addComponent(btnpoligono)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnsalir)
                        .addComponent(btncirculo)))
                .addGap(0, 290, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnsalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncirculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btntriangulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncuadrilatero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnpoligono)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        txtradio.setText("");
        txtradio.requestFocus();
        txtresradio.setText("");
        lblmensaje.setText("");
        lblcirculo.setText("");
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnareaActionPerformed
        radio = Float.parseFloat(txtradio.getText());
        clscirculo areacirculo = new clscirculo(radio);
        txtresradio.setText(""+areacirculo.area());
        lblcirculo.setText("Area");
        lblmensaje.setText(""+areacirculo.tipo());
        
        
    }//GEN-LAST:event_btnareaActionPerformed

    private void btncirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncirculoActionPerformed
        frmcirculo.show();
        
    }//GEN-LAST:event_btncirculoActionPerformed

    private void btnperimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnperimetroActionPerformed
        radio = Float.parseFloat(txtradio.getText());
        clscirculo percirculo = new clscirculo(radio);
        txtresradio.setText(""+percirculo.area());
        lblcirculo.setText("Perimetro");
        lblmensaje.setText(""+percirculo.tipo());
    }//GEN-LAST:event_btnperimetroActionPerformed

    private void btntrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntrianguloActionPerformed
        frmtriangulo.show();
    }//GEN-LAST:event_btntrianguloActionPerformed

    private void btnpoligonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpoligonoActionPerformed
        frmpoligono.show();
    }//GEN-LAST:event_btnpoligonoActionPerformed

    private void btnareapoligonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnareapoligonoActionPerformed
       longitud = Float.parseFloat(txtlongitud.getText());
       apotema = Float.parseFloat(txtapotema.getText());
       lados = Integer.parseInt(txtlados.getText());
       clspoligonoreg areapoligono = new clspoligonoreg(longitud,apotema,lados);
       txtpoligono.setText(""+areapoligono.area());
       lblpoligono.setText("Area");
       lblmensajepoligono.setText(""+areapoligono.tipo());
       
    }//GEN-LAST:event_btnareapoligonoActionPerformed

    private void btnlimpiarpoligonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarpoligonoActionPerformed
        txtpoligono.setText("");
        lblmensajepoligono.setText("");
        lblpoligono.setText("");
        txtlongitud.setText("");
        txtapotema.setText("");
        txtlados.setText("");
    }//GEN-LAST:event_btnlimpiarpoligonoActionPerformed

    private void btnperimetropoligonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnperimetropoligonoActionPerformed
       longitud = Float.parseFloat(txtlongitud.getText());
       apotema = Float.parseFloat(txtapotema.getText());
       lados = Integer.parseInt(txtlados.getText());
       clspoligonoreg perpoligono = new clspoligonoreg(longitud,apotema,lados);
       txtpoligono.setText(""+perpoligono.perimetro());
       lblpoligono.setText("Area");
       lblmensajepoligono.setText(""+perpoligono.tipo());
    }//GEN-LAST:event_btnperimetropoligonoActionPerformed

    private void btnareatrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnareatrianguloActionPerformed
        lado1 = Float.parseFloat(txtlado1.getText());
        lado2 = Float.parseFloat(txtlado2.getText());
        lado3 = Float.parseFloat(txtlado3.getText());
        clstriangulo areatriangulo = new clstriangulo(lado1,lado2,lado3);
        txttriangulo.setText(""+areatriangulo.area());
        lbltriangulo.setText("Area");
        lblmensajetriangulo.setText(""+areatriangulo.tipo());
                
    }//GEN-LAST:event_btnareatrianguloActionPerformed

    private void btnperimetrotrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnperimetrotrianguloActionPerformed
        lado1 = Float.parseFloat(txtlado1.getText());
        lado2 = Float.parseFloat(txtlado2.getText());
        lado3 = Float.parseFloat(txtlado3.getText());
        clstriangulo pertriangulo = new clstriangulo(lado1,lado2,lado3);
        txttriangulo.setText(""+pertriangulo.perimetro());
        lbltriangulo.setText("Perimetro");
        lblmensajetriangulo.setText(""+pertriangulo.tipo());
                
    }//GEN-LAST:event_btnperimetrotrianguloActionPerformed

    private void btnlimpiartrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiartrianguloActionPerformed
        txtlado1.setText("");
        txtlado2.setText("");
        txtlado3.setText("");
        txttriangulo.setText("");
        lbltriangulo.setText("");
        lblmensajetriangulo.setText("");
    }//GEN-LAST:event_btnlimpiartrianguloActionPerformed

    private void btnareacuadrilateroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnareacuadrilateroActionPerformed
        largo = Float.parseFloat(txtlargo.getText());
        ancho = Float.parseFloat(txtancho.getText());
        clscuadrilatero areacuadrilatero = new clscuadrilatero(largo,ancho);
        txtcuadrilatero.setText(""+areacuadrilatero.area());
        lblcuadrilatero.setText("Area");
        lblmensajecuadrilatero.setText(""+areacuadrilatero.tipo());
               
    }//GEN-LAST:event_btnareacuadrilateroActionPerformed

    private void btnperimetrocuadrilateroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnperimetrocuadrilateroActionPerformed
        largo = Float.parseFloat(txtlargo.getText());
        ancho = Float.parseFloat(txtancho.getText());
        clscuadrilatero percuadrilatero = new clscuadrilatero(largo,ancho);
        txtcuadrilatero.setText(""+percuadrilatero.perimetro());
        lblcuadrilatero.setText("Area");
        lblmensajecuadrilatero.setText(""+percuadrilatero.tipo());
    }//GEN-LAST:event_btnperimetrocuadrilateroActionPerformed

    private void btnlimpiarcuadrilateroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarcuadrilateroActionPerformed
        txtlargo.setText("");
        txtancho.setText("");
        txtcuadrilatero.setText("");
        lblcuadrilatero.setText("");
        lblmensajecuadrilatero.setText("");
    }//GEN-LAST:event_btnlimpiarcuadrilateroActionPerformed

    private void btncuadrilateroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncuadrilateroActionPerformed
        frmcuadrilatero.show();
    }//GEN-LAST:event_btncuadrilateroActionPerformed

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
            java.util.logging.Logger.getLogger(winfiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(winfiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(winfiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(winfiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new winfiguras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lado1;
    private javax.swing.JLabel Lado2;
    private javax.swing.JButton btnarea;
    private javax.swing.JButton btnareacuadrilatero;
    private javax.swing.JButton btnareapoligono;
    private javax.swing.JButton btnareatriangulo;
    private javax.swing.JRadioButton btncirculo;
    private javax.swing.JRadioButton btncuadrilatero;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnlimpiarcuadrilatero;
    private javax.swing.JButton btnlimpiarpoligono;
    private javax.swing.JButton btnlimpiartriangulo;
    private javax.swing.JButton btnperimetro;
    private javax.swing.JButton btnperimetrocuadrilatero;
    private javax.swing.JButton btnperimetropoligono;
    private javax.swing.JButton btnperimetrotriangulo;
    private javax.swing.JRadioButton btnpoligono;
    private javax.swing.JButton btnsalir;
    private javax.swing.JRadioButton btntriangulo;
    private javax.swing.JFrame frmcirculo;
    private javax.swing.JFrame frmcuadrilatero;
    private javax.swing.JFrame frmpoligono;
    private javax.swing.JFrame frmtriangulo;
    private javax.swing.ButtonGroup grupofiguras;
    private javax.swing.JLabel lblcirculo;
    private javax.swing.JLabel lblcuadrilatero;
    private javax.swing.JLabel lblmensaje;
    private javax.swing.JLabel lblmensajecuadrilatero;
    private javax.swing.JLabel lblmensajepoligono;
    private javax.swing.JLabel lblmensajetriangulo;
    private javax.swing.JLabel lblongitud;
    private javax.swing.JLabel lblongitud1;
    private javax.swing.JLabel lblongitud2;
    private javax.swing.JLabel lblongitud4;
    private javax.swing.JLabel lblongitud5;
    private javax.swing.JLabel lblongitud7;
    private javax.swing.JLabel lblpoligono;
    private javax.swing.JLabel lblradio;
    private javax.swing.JLabel lbltriangulo;
    private javax.swing.JTextField txtancho;
    private javax.swing.JTextField txtapotema;
    private javax.swing.JTextField txtcuadrilatero;
    private javax.swing.JTextField txtlado1;
    private javax.swing.JTextField txtlado2;
    private javax.swing.JTextField txtlado3;
    private javax.swing.JTextField txtlados;
    private javax.swing.JTextField txtlargo;
    private javax.swing.JTextField txtlongitud;
    private javax.swing.JTextField txtpoligono;
    private javax.swing.JTextField txtradio;
    private javax.swing.JTextField txtresradio;
    private javax.swing.JTextField txttriangulo;
    // End of variables declaration//GEN-END:variables
}
