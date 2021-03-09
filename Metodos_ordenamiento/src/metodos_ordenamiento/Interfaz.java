package metodos_ordenamiento;

/**
 *
 * @author Sofía Lugo, Nicolas Tuseddu y Daniel Vargas
 */
public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    CalculosMat cal = new CalculosMat();
    Ordenamientos1 ord = new Ordenamientos1();
    MergeSort mersor = new MergeSort();
    Caracteres car = new Caracteres();
    Persona per = new Persona();

    private String converta = "";
    private String conver = "";
    private String ingreso = "";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        pantallatamaño1 = new javax.swing.JTextField();
        ctazul_tamano = new javax.swing.JLabel();
        ctrojo_tamano_texto = new javax.swing.JTextField();
        ctrojo_tamano = new javax.swing.JLabel();
        mergesort = new javax.swing.JButton();
        burbuja = new javax.swing.JButton();
        ctrojo_metodos_ordenamiento_texto = new javax.swing.JTextField();
        reemplazar_valores = new javax.swing.JButton();
        ctamarillo_valordos_texto = new javax.swing.JTextField();
        ctamarillo_valoruno_texto = new javax.swing.JTextField();
        edad_mergesort = new javax.swing.JButton();
        edad_burbuja = new javax.swing.JButton();
        cedula_burbuja = new javax.swing.JButton();
        cedula_mergesort = new javax.swing.JButton();
        ctverde_nombre_texto = new javax.swing.JTextField();
        ctverde_nombre = new javax.swing.JLabel();
        ctverde_cedula_texto = new javax.swing.JTextField();
        ctverde_cedula = new javax.swing.JLabel();
        ctverde_edad_texto = new javax.swing.JTextField();
        ctverde_edad = new javax.swing.JLabel();
        seleccion = new javax.swing.JButton();
        insercion = new javax.swing.JButton();
        resultado_ordenamiento1 = new javax.swing.JLabel();
        borrartodo = new javax.swing.JButton();
        boton = new javax.swing.JButton();
        pantallaCalculosMedVarDesv = new javax.swing.JTextField();
        pantallaPersonas = new javax.swing.JTextField();
        ctrojo_tamano_texto3 = new javax.swing.JTextField();
        resultadoestadistica2 = new javax.swing.JLabel();
        resultadoestadistica = new javax.swing.JLabel();
        resultadoestadistica3 = new javax.swing.JLabel();
        resultadoestadistica1 = new javax.swing.JLabel();
        resultadoestadistica4 = new javax.swing.JLabel();
        resultadoestadistica5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo.setBackground(java.awt.Color.white);
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pantallatamaño1.setBackground(new java.awt.Color(153, 203, 229));
        pantallatamaño1.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        pantallatamaño1.setForeground(new java.awt.Color(0, 0, 0));
        pantallatamaño1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pantallatamaño1.setBorder(null);
        pantallatamaño1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pantallatamaño1ActionPerformed(evt);
            }
        });
        fondo.add(pantallatamaño1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 180, 50));

        ctazul_tamano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metodos_ordenamiento/Imagenes/azul.png"))); // NOI18N
        fondo.add(ctazul_tamano, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 130));

        ctrojo_tamano_texto.setBackground(new java.awt.Color(241, 211, 199));
        ctrojo_tamano_texto.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        ctrojo_tamano_texto.setForeground(new java.awt.Color(0, 0, 0));
        ctrojo_tamano_texto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ctrojo_tamano_texto.setBorder(null);
        ctrojo_tamano_texto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctrojo_tamano_textoActionPerformed(evt);
            }
        });
        fondo.add(ctrojo_tamano_texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 180, 50));

        ctrojo_tamano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metodos_ordenamiento/Imagenes/rojo.png"))); // NOI18N
        fondo.add(ctrojo_tamano, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 240, 130));

        mergesort.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metodos_ordenamiento/Imagenes/bt_rojouno.png"))); // NOI18N
        mergesort.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/metodos_ordenamiento/Imagenes/bt_rojounopress.png"))); // NOI18N
        mergesort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mergesortActionPerformed(evt);
            }
        });
        fondo.add(mergesort, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 130, 60));

        burbuja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metodos_ordenamiento/Imagenes/bt_rojodos.png"))); // NOI18N
        burbuja.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/metodos_ordenamiento/Imagenes/bt_rojodospress.png"))); // NOI18N
        burbuja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                burbujaActionPerformed(evt);
            }
        });
        fondo.add(burbuja, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 80, 130, 60));

        ctrojo_metodos_ordenamiento_texto.setBackground(new java.awt.Color(241, 211, 199));
        ctrojo_metodos_ordenamiento_texto.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        ctrojo_metodos_ordenamiento_texto.setForeground(new java.awt.Color(0, 0, 0));
        ctrojo_metodos_ordenamiento_texto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ctrojo_metodos_ordenamiento_texto.setBorder(null);
        ctrojo_metodos_ordenamiento_texto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctrojo_metodos_ordenamiento_textoActionPerformed(evt);
            }
        });
        fondo.add(ctrojo_metodos_ordenamiento_texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 650, 40));

        reemplazar_valores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metodos_ordenamiento/Imagenes/bt_amarillouno.png"))); // NOI18N
        reemplazar_valores.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/metodos_ordenamiento/Imagenes/bt_amarillounopress.png"))); // NOI18N
        reemplazar_valores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reemplazar_valoresActionPerformed(evt);
            }
        });
        fondo.add(reemplazar_valores, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 130, 130));

        ctamarillo_valordos_texto.setBackground(new java.awt.Color(255, 235, 190));
        ctamarillo_valordos_texto.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        ctamarillo_valordos_texto.setForeground(new java.awt.Color(0, 0, 0));
        ctamarillo_valordos_texto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ctamarillo_valordos_texto.setBorder(null);
        ctamarillo_valordos_texto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctamarillo_valordos_textoActionPerformed(evt);
            }
        });
        fondo.add(ctamarillo_valordos_texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 300, 30));

        ctamarillo_valoruno_texto.setBackground(new java.awt.Color(255, 235, 190));
        ctamarillo_valoruno_texto.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        ctamarillo_valoruno_texto.setForeground(new java.awt.Color(0, 0, 0));
        ctamarillo_valoruno_texto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ctamarillo_valoruno_texto.setBorder(null);
        ctamarillo_valoruno_texto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctamarillo_valoruno_textoActionPerformed(evt);
            }
        });
        fondo.add(ctamarillo_valoruno_texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 310, 30));

        edad_mergesort.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metodos_ordenamiento/Imagenes/bt_verdeuno.png"))); // NOI18N
        edad_mergesort.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/metodos_ordenamiento/Imagenes/bt_verdeunopress.png"))); // NOI18N
        edad_mergesort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edad_mergesortActionPerformed(evt);
            }
        });
        fondo.add(edad_mergesort, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 110, 100));

        edad_burbuja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metodos_ordenamiento/Imagenes/bt_verdedos.png"))); // NOI18N
        edad_burbuja.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/metodos_ordenamiento/Imagenes/bt_verdedospress.png"))); // NOI18N
        edad_burbuja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edad_burbujaActionPerformed(evt);
            }
        });
        fondo.add(edad_burbuja, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 630, 110, 100));

        cedula_burbuja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metodos_ordenamiento/Imagenes/bt_verdetres.png"))); // NOI18N
        cedula_burbuja.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/metodos_ordenamiento/Imagenes/bt_verdetrespress.png"))); // NOI18N
        cedula_burbuja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedula_burbujaActionPerformed(evt);
            }
        });
        fondo.add(cedula_burbuja, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 630, 110, 100));

        cedula_mergesort.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metodos_ordenamiento/Imagenes/bt_verdecuatro.png"))); // NOI18N
        cedula_mergesort.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/metodos_ordenamiento/Imagenes/bt_verdecuatropress.png"))); // NOI18N
        cedula_mergesort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedula_mergesortActionPerformed(evt);
            }
        });
        fondo.add(cedula_mergesort, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 110, 100));

        ctverde_nombre_texto.setBackground(new java.awt.Color(194, 240, 234));
        ctverde_nombre_texto.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        ctverde_nombre_texto.setForeground(new java.awt.Color(0, 0, 0));
        ctverde_nombre_texto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ctverde_nombre_texto.setBorder(null);
        ctverde_nombre_texto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctverde_nombre_textoActionPerformed(evt);
            }
        });
        fondo.add(ctverde_nombre_texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 610, 120, 30));

        ctverde_nombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metodos_ordenamiento/Imagenes/verdetres.png"))); // NOI18N
        fondo.add(ctverde_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 240, 50));

        ctverde_cedula_texto.setBackground(new java.awt.Color(194, 240, 234));
        ctverde_cedula_texto.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        ctverde_cedula_texto.setForeground(new java.awt.Color(0, 0, 0));
        ctverde_cedula_texto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ctverde_cedula_texto.setBorder(null);
        ctverde_cedula_texto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctverde_cedula_textoActionPerformed(evt);
            }
        });
        fondo.add(ctverde_cedula_texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 690, 120, 30));

        ctverde_cedula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metodos_ordenamiento/Imagenes/verdecuatro.png"))); // NOI18N
        fondo.add(ctverde_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, 240, 50));

        ctverde_edad_texto.setBackground(new java.awt.Color(194, 240, 234));
        ctverde_edad_texto.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        ctverde_edad_texto.setForeground(new java.awt.Color(0, 0, 0));
        ctverde_edad_texto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ctverde_edad_texto.setBorder(null);
        ctverde_edad_texto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctverde_edad_textoActionPerformed(evt);
            }
        });
        fondo.add(ctverde_edad_texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, 120, 30));

        ctverde_edad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metodos_ordenamiento/Imagenes/verdedos.png"))); // NOI18N
        fondo.add(ctverde_edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 240, 50));

        seleccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metodos_ordenamiento/Imagenes/bt_rojotres.png"))); // NOI18N
        seleccion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/metodos_ordenamiento/Imagenes/bt_rojotrespress.png"))); // NOI18N
        seleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionActionPerformed(evt);
            }
        });
        fondo.add(seleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 10, 130, 60));

        insercion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metodos_ordenamiento/Imagenes/bt_rojocuatro.png"))); // NOI18N
        insercion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/metodos_ordenamiento/Imagenes/bt_rojocuatropress.png"))); // NOI18N
        insercion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insercionActionPerformed(evt);
            }
        });
        fondo.add(insercion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 80, 130, 60));

        resultado_ordenamiento1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metodos_ordenamiento/Imagenes/informaciontiempos_1.png"))); // NOI18N
        fondo.add(resultado_ordenamiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 250, 540, 290));

        borrartodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metodos_ordenamiento/Imagenes/borrartodo_1.png"))); // NOI18N
        borrartodo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/metodos_ordenamiento/Imagenes/borrartodopress_1.png"))); // NOI18N
        borrartodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrartodoActionPerformed(evt);
            }
        });
        fondo.add(borrartodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 90, 90));

        boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metodos_ordenamiento/Imagenes/azulsinpresionar.png"))); // NOI18N
        boton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/metodos_ordenamiento/Imagenes/azulpresionado.png"))); // NOI18N
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });
        fondo.add(boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 240, 130));

        pantallaCalculosMedVarDesv.setBackground(new java.awt.Color(153, 203, 229));
        pantallaCalculosMedVarDesv.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        pantallaCalculosMedVarDesv.setBorder(null);
        pantallaCalculosMedVarDesv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pantallaCalculosMedVarDesvActionPerformed(evt);
            }
        });
        fondo.add(pantallaCalculosMedVarDesv, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 440, 40));

        pantallaPersonas.setBackground(new java.awt.Color(222, 247, 243));
        pantallaPersonas.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        pantallaPersonas.setBorder(null);
        pantallaPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pantallaPersonasActionPerformed(evt);
            }
        });
        fondo.add(pantallaPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 660, 670, 40));

        ctrojo_tamano_texto3.setBackground(new java.awt.Color(222, 247, 243));
        ctrojo_tamano_texto3.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        ctrojo_tamano_texto3.setForeground(new java.awt.Color(0, 0, 0));
        ctrojo_tamano_texto3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ctrojo_tamano_texto3.setBorder(null);
        ctrojo_tamano_texto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctrojo_tamano_texto3ActionPerformed(evt);
            }
        });
        fondo.add(ctrojo_tamano_texto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 560, 300, 40));

        resultadoestadistica2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metodos_ordenamiento/Imagenes/resultadoazul.png"))); // NOI18N
        fondo.add(resultadoestadistica2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 510, 80));

        resultadoestadistica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metodos_ordenamiento/Imagenes/verde.png"))); // NOI18N
        fondo.add(resultadoestadistica, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 650, 690, 80));

        resultadoestadistica3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metodos_ordenamiento/Imagenes/verdeingresa.png"))); // NOI18N
        fondo.add(resultadoestadistica3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 550, 340, 80));

        resultadoestadistica1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metodos_ordenamiento/Imagenes/amarilloresultado.png"))); // NOI18N
        fondo.add(resultadoestadistica1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 340, 80));

        resultadoestadistica4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metodos_ordenamiento/Imagenes/resultadorojo.png"))); // NOI18N
        fondo.add(resultadoestadistica4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 690, 80));

        resultadoestadistica5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metodos_ordenamiento/Imagenes/amarillo.png"))); // NOI18N
        fondo.add(resultadoestadistica5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 340, 80));

        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ctrojo_tamano_textoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctrojo_tamano_textoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctrojo_tamano_textoActionPerformed

    private void pantallatamaño1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pantallatamaño1ActionPerformed


    }//GEN-LAST:event_pantallatamaño1ActionPerformed

    private void ctrojo_metodos_ordenamiento_textoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctrojo_metodos_ordenamiento_textoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctrojo_metodos_ordenamiento_textoActionPerformed

    private void ctamarillo_valoruno_textoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctamarillo_valoruno_textoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctamarillo_valoruno_textoActionPerformed

    private void ctamarillo_valordos_textoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctamarillo_valordos_textoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctamarillo_valordos_textoActionPerformed

    private void ctverde_edad_textoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctverde_edad_textoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctverde_edad_textoActionPerformed

    private void ctverde_nombre_textoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctverde_nombre_textoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctverde_nombre_textoActionPerformed

    private void ctverde_cedula_textoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctverde_cedula_textoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctverde_cedula_textoActionPerformed

    private void mergesortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mergesortActionPerformed
        //MERGE SORT 3.3

        conver = pantallatamaño1.getText();
        int tamano = Integer.parseInt(conver);
        int x = (int) tamano;
        double arreglo[] = new double[x];
        for (int i = 0; i < x; i++) {
            arreglo[i] = (int) (Math.random() * 100) + 1;
        }
        for (int i = 0; i < x; i++) {
            arreglo = mersor.getArreglo();
        }
        mersor.sort(arreglo, 0, arreglo.length - 1);
        mersor.ImprimirArreglo(arreglo, tamano);
    }//GEN-LAST:event_mergesortActionPerformed

    private void seleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionActionPerformed
        //SELECCIÓN 3.3

        conver = ctrojo_tamano_texto.getText();
        float tamano = Float.parseFloat(conver);
        ctrojo_metodos_ordenamiento_texto.setText(ord.Seleccion(tamano));

    }//GEN-LAST:event_seleccionActionPerformed

    private void borrartodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrartodoActionPerformed
        //BORRAR TODO
        pantallaCalculosMedVarDesv.setText(" ");
        ctrojo_metodos_ordenamiento_texto.setText(" ");
        pantallatamaño1.setText(" ");
        ctrojo_tamano_texto.setText(" ");
        ctamarillo_valoruno_texto.setText(" Ingrese su mensaje: ");
        ctverde_edad_texto.setText(" ");
        ctverde_nombre_texto.setText(" ");
        ctverde_cedula_texto.setText(" ");
        ctamarillo_valordos_texto.setText(" ");
        pantallaCalculosMedVarDesv.setText(" ");
        ctrojo_tamano_texto3.setText(" ");
        pantallaPersonas.setText(" ");
    }//GEN-LAST:event_borrartodoActionPerformed

    private void PANTALLAVARIANZAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PANTALLAVARIANZAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PANTALLAVARIANZAActionPerformed

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
        //MEDIA, VARIANZA, DESVIACIÓN ESTÁNDAR 3.1

        conver = pantallatamaño1.getText();
        float tamano = Float.parseFloat(conver);
        pantallaCalculosMedVarDesv.setText(cal.RealizarCalculos(tamano));


    }//GEN-LAST:event_botonActionPerformed

    private void pantallaCalculosMedVarDesvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pantallaCalculosMedVarDesvActionPerformed
        //RESULTADO DE ORDENAMIENTO DE LA CLASE PERSONA
    }//GEN-LAST:event_pantallaCalculosMedVarDesvActionPerformed

    private void insercionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insercionActionPerformed
        //INSERCION 3.3

        conver = ctrojo_tamano_texto.getText();
        float tamano = Float.parseFloat(conver);
        ctrojo_metodos_ordenamiento_texto.setText(ord.Insercion(tamano));

    }//GEN-LAST:event_insercionActionPerformed

    private void burbujaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_burbujaActionPerformed
        //BURBUJA 3.3
        conver = ctrojo_tamano_texto.getText();
        float tamano = Float.parseFloat(conver);
        ctrojo_metodos_ordenamiento_texto.setText(ord.Burbuja(tamano));


    }//GEN-LAST:event_burbujaActionPerformed

    private void reemplazar_valoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reemplazar_valoresActionPerformed
        // REEMPLAZAR VALORES
        ingreso = ctamarillo_valoruno_texto.getText();
        ctamarillo_valordos_texto.setText(car.Reemplazo(ingreso));

    }//GEN-LAST:event_reemplazar_valoresActionPerformed

    private void edad_mergesortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edad_mergesortActionPerformed
        // Ordenar persona EDAD MERGE SORT

        ingreso = ctrojo_tamano_texto3.getText();
        int tamano = Integer.parseInt(ingreso);
        String[] nombre;
        int[] edad;
        long[] cedula;
        nombre = new String[tamano];
        edad = new int[tamano];
        cedula = new long[tamano];
        for (int i = 0; i < tamano; i++) {
            nombre[i] = ctverde_nombre_texto.getText();
            conver = ctverde_edad_texto.getText();
            edad[i] = Integer.parseInt(conver);
            converta = ctverde_cedula_texto.getText();
            cedula[i] = Long.parseLong(converta);
            ctverde_edad_texto.setText(" ");
            ctverde_nombre_texto.setText(" ");
            ctverde_cedula_texto.setText(" ");
            per.nombre = nombre;
            per.edad = edad;
            per.cedula = cedula;
        }
        pantallaPersonas.setText(per.OrdenarArregloBurbujaEdad(nombre, edad, cedula, tamano));

    }//GEN-LAST:event_edad_mergesortActionPerformed

    private void edad_burbujaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edad_burbujaActionPerformed
        // Ordenar persona EDAD BURBUJA

        ingreso = ctrojo_tamano_texto3.getText();
        int tamano = Integer.parseInt(ingreso);
        String[] nombre;
        int[] edad;
        long[] cedula;
        nombre = new String[tamano];
        edad = new int[tamano];
        cedula = new long[tamano];
        for (int i = 0; i < tamano; i++) {
            nombre[i] = ctverde_nombre_texto.getText();
            conver = ctverde_edad_texto.getText();
            edad[i] = Integer.parseInt(conver);
            converta = ctverde_cedula_texto.getText();
            cedula[i] = Long.parseLong(converta);
            ctverde_edad_texto.setText(" ");
            ctverde_nombre_texto.setText(" ");
            ctverde_cedula_texto.setText(" ");
        }
        for (int i = 0; i < tamano; i++) {
            per.nombre = nombre;
            per.edad = edad;
            per.cedula = cedula;
        }
        pantallaPersonas.setText(per.OrdenarArregloBurbujaEdad(nombre, edad, cedula, tamano));
    }//GEN-LAST:event_edad_burbujaActionPerformed

    private void cedula_mergesortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedula_mergesortActionPerformed
        
    }//GEN-LAST:event_cedula_mergesortActionPerformed

    private void cedula_burbujaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedula_burbujaActionPerformed
        // Ordenar persona CEDULA BURBUJA

        ingreso = ctrojo_tamano_texto3.getText();
        int tamano = Integer.parseInt(ingreso);
        String[] nombre;
        int[] edad;
        long[] cedula;
        nombre = new String[tamano];
        edad = new int[tamano];
        cedula = new long[tamano];
        for (int i = 0; i < tamano; i++) {
            nombre[i] = ctverde_nombre_texto.getText();
            conver = ctverde_edad_texto.getText();
            edad[i] = Integer.parseInt(conver);
            converta = ctverde_cedula_texto.getText();
            cedula[i] = Long.parseLong(converta);
            ctverde_edad_texto.setText(" ");
            ctverde_nombre_texto.setText(" ");
            ctverde_cedula_texto.setText(" ");
        }
        for (int i = 0; i < tamano; i++) {
            per.nombre = nombre;
            per.edad = edad;
            per.cedula = cedula;
        }
        pantallaPersonas.setText(per.OrdenarArregloBurbujaCedula(nombre, edad, cedula, tamano));
    }//GEN-LAST:event_cedula_burbujaActionPerformed

    private void pantallaPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pantallaPersonasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pantallaPersonasActionPerformed

    private void ctrojo_tamano_texto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctrojo_tamano_texto3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctrojo_tamano_texto3ActionPerformed

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
    private javax.swing.JButton borrartodo;
    private javax.swing.JButton boton;
    private javax.swing.JButton burbuja;
    private javax.swing.JButton cedula_burbuja;
    private javax.swing.JButton cedula_mergesort;
    private javax.swing.JTextField ctamarillo_valordos_texto;
    private javax.swing.JTextField ctamarillo_valoruno_texto;
    private javax.swing.JLabel ctazul_tamano;
    private javax.swing.JTextField ctrojo_metodos_ordenamiento_texto;
    private javax.swing.JLabel ctrojo_tamano;
    private javax.swing.JTextField ctrojo_tamano_texto;
    private javax.swing.JTextField ctrojo_tamano_texto3;
    private javax.swing.JLabel ctverde_cedula;
    private javax.swing.JTextField ctverde_cedula_texto;
    private javax.swing.JLabel ctverde_edad;
    private javax.swing.JTextField ctverde_edad_texto;
    private javax.swing.JLabel ctverde_nombre;
    private javax.swing.JTextField ctverde_nombre_texto;
    private javax.swing.JButton edad_burbuja;
    private javax.swing.JButton edad_mergesort;
    private javax.swing.JPanel fondo;
    private javax.swing.JButton insercion;
    private javax.swing.JButton mergesort;
    private javax.swing.JTextField pantallaCalculosMedVarDesv;
    private javax.swing.JTextField pantallaPersonas;
    private javax.swing.JTextField pantallatamaño1;
    private javax.swing.JButton reemplazar_valores;
    private javax.swing.JLabel resultado_ordenamiento1;
    private javax.swing.JLabel resultadoestadistica;
    private javax.swing.JLabel resultadoestadistica1;
    private javax.swing.JLabel resultadoestadistica2;
    private javax.swing.JLabel resultadoestadistica3;
    private javax.swing.JLabel resultadoestadistica4;
    private javax.swing.JLabel resultadoestadistica5;
    private javax.swing.JButton seleccion;
    // End of variables declaration//GEN-END:variables
}
