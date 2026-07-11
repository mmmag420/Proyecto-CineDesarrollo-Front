package vistas;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import modelos.Car;
import modelos.Client;
import modelos.Movie;

public class VenMembresia extends javax.swing.JFrame {
    
    private Movie p;
    private Client cliente;
    private Car carrito;
    
    public VenMembresia(Client cliente, Car carrito) {
        initComponents();
        setLocationRelativeTo(this);
        txtUserEnSession.setText(cliente.getNombre());
        organizarImagen(lblMembresia, "/imagenes/tajetaP.png");

        this.p = p;
        this.cliente = cliente;
        this.carrito = carrito;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        CbSelectCIty = new javax.swing.JComboBox<>();
        lblLogo = new javax.swing.JLabel();
        btnCarrito = new javax.swing.JButton();
        btnPerfil = new javax.swing.JButton();
        txtUserEnSession = new javax.swing.JLabel();
        btnCombos = new javax.swing.JButton();
        btnPromociones = new javax.swing.JButton();
        btnMembresia = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnCartelera = new javax.swing.JButton();
        btnBot = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        lblMembresia = new javax.swing.JLabel();

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        CbSelectCIty.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CbSelectCIty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Armenia", "Barranquilla", "Bogotá", "Bucaramanga", "Buenaventura", "Buga", "Cali", "Cartagena", "Cartago", "Caucasia", "Cúcuta", "Dosquebradas", "Girardot", "Guajira", "Ibagué", "Itagüí", "Medellín", "Montería", "Mosquera", "Neiva", "Pasto", "Pereira", "Popayán", "Santo Tomás", "Sincelejo", "Tuluá", "Tunja", "Valledupar", "Villavicencio", "Yumbo" }));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoLujosamPrueba.png"))); // NOI18N

        btnCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carritoprueba.png"))); // NOI18N
        btnCarrito.setBorderPainted(false);
        btnCarrito.setContentAreaFilled(false);
        btnCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarritoActionPerformed(evt);
            }
        });

        btnPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/userprueba.png"))); // NOI18N
        btnPerfil.setBorderPainted(false);
        btnPerfil.setContentAreaFilled(false);
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });

        txtUserEnSession.setBackground(new java.awt.Color(255, 255, 255));
        txtUserEnSession.setForeground(new java.awt.Color(255, 255, 255));

        btnCombos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCombos.setForeground(new java.awt.Color(255, 255, 255));
        btnCombos.setText("COMBOS");
        btnCombos.setBorderPainted(false);
        btnCombos.setContentAreaFilled(false);
        btnCombos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombosActionPerformed(evt);
            }
        });

        btnPromociones.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPromociones.setForeground(new java.awt.Color(255, 255, 255));
        btnPromociones.setText("PROMOCIONES");
        btnPromociones.setBorderPainted(false);
        btnPromociones.setContentAreaFilled(false);
        btnPromociones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromocionesActionPerformed(evt);
            }
        });

        btnMembresia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMembresia.setForeground(new java.awt.Color(255, 255, 255));
        btnMembresia.setText("MEMBRESIA");
        btnMembresia.setBorderPainted(false);
        btnMembresia.setContentAreaFilled(false);
        btnMembresia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMembresiaActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Multicine Plaza Flora", "Multicine San Andresito" }));

        btnCartelera.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCartelera.setForeground(new java.awt.Color(255, 255, 255));
        btnCartelera.setText("CARTELERA");
        btnCartelera.setBorderPainted(false);
        btnCartelera.setContentAreaFilled(false);
        btnCartelera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarteleraActionPerformed(evt);
            }
        });

        btnBot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IAprueba.png"))); // NOI18N
        btnBot.setBorderPainted(false);
        btnBot.setContentAreaFilled(false);
        btnBot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBotActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblLogo)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCartelera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMembresia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCombos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPromociones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CbSelectCIty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUserEnSession, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPerfil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCarrito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBot)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUserEnSession, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(CbSelectCIty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox1)))
                        .addGap(21, 21, 21))
                    .addComponent(lblLogo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPromociones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCombos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMembresia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCartelera, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBot)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnPerfil)
                        .addComponent(btnCarrito)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¿POR QUÉ DEBO TENER MI MEMBRESIA?");

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("El Programa de Membresia, le permite que esté inscrito en el club y que tenga su tarjeta para poder acceder a los beneficios de descuento permanente que el programa otorgue.");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("¿CÓMO HAGO PARA OBTENER MI MEMBRESIA?");

        jTextArea4.setEditable(false);
        jTextArea4.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea4.setColumns(20);
        jTextArea4.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea4.setLineWrap(true);
        jTextArea4.setRows(5);
        jTextArea4.setText("Debes ser mayor de edad (18 años cumplidos), visitar la taquilla de tu Multicine favorito, hacer el registro y adquirir la tarjeta por valor de $12.000.\nAsí quedas registrado en el CLUB LUJOSAM . Estos datos deben ser reales para poder acceder a los beneficios del programa, leer y aceptar los términos y condiciones y aceptar la política de información y tratamiento de datos por parte de LUJOSAM voluntariamente.");
        jTextArea4.setWrapStyleWord(true);
        jScrollPane4.setViewportView(jTextArea4);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ENTRADAS A CINE A PRECIO PREFERENTE:");

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea2.setColumns(20);
        jTextArea2.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("Siempre podrás comprar tu boleta a menor precio y extender este beneficio a un máximo de 3 acompañantes (grupo familiar) por día.");
        jTextArea2.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("¿CUANTO DURA EL BENEFICIO DE MI MEMBRESIA?");

        jTextArea5.setEditable(false);
        jTextArea5.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea5.setColumns(20);
        jTextArea5.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea5.setLineWrap(true);
        jTextArea5.setRows(5);
        jTextArea5.setText("Todos los usuarios tienen un año continuo de beneficios con descuento al presentar la Tarjeta Cliente Royal, este período comienza a regir desde el mismo momento registras el plástico en las taquilla.");
        jTextArea5.setWrapStyleWord(true);
        jScrollPane5.setViewportView(jTextArea5);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("¿QUE DIAS APLICA LA MEMBRESIA?:");

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea3.setColumns(20);
        jTextArea3.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(5);
        jTextArea3.setText("En las taquillas la tarjeta aplica todos los días. Incluyendo los festivos. En Cafetería funciona todos los días ofreciendo descuentos en Combos de Cafetería. Máximo 4 combos por día.");
        jTextArea3.setWrapStyleWord(true);
        jScrollPane3.setViewportView(jTextArea3);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CINE GRATIS EL DIA DE TU CUMPLEAÑOS:");

        jTextArea7.setEditable(false);
        jTextArea7.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea7.setColumns(20);
        jTextArea7.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea7.setLineWrap(true);
        jTextArea7.setRows(5);
        jTextArea7.setText("Todo Cliente Lujosam, con su tarjeta activa puede acceder a las salas de cine el día de su cumpleaños y reclamar una entrada totalmente gratis, y puedes llevar a tus acompañantes y comprar la entrada para estos a precio de cliente Lujosam con descuento (hasta 4 boletas). Este beneficio de entrada a cine Gratuito es únicamente para el titular de la tarjeta y únicamente el día de su cumpleaños, ese beneficio no es acumulable, ni es posible aplazarlo en fecha. Solo aplica para salas en 2D y 3D con ingreso inmediato a la película, no aplica para salas con servicio VIP, asi como tampoco para salas con servicio de sillas 4DX. No aplica para reservas así como tampoco para ventas futuras o pre estrenos de películas.");
        jTextArea7.setWrapStyleWord(true);
        jScrollPane7.setViewportView(jTextArea7);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("¿SE TE PERDIÓ TU TARJETA CLIENTE LUJOSAM?");

        jTextArea8.setEditable(false);
        jTextArea8.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea8.setColumns(20);
        jTextArea8.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea8.setLineWrap(true);
        jTextArea8.setRows(5);
        jTextArea8.setText("Sólo tienes que acercarte a las taquillas de los multicines en todo el país, hacer el reporte de la pérdida de tu tarjeta y cancelar el valor de la nueva para que puedas acceder al programa nuevamente.");
        jTextArea8.setWrapStyleWord(true);
        jScrollPane8.setViewportView(jTextArea8);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("SE VENCIÓ MI MEMBRESIA ¿QUÉ DEBO HACER?");

        jTextArea6.setEditable(false);
        jTextArea6.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea6.setColumns(20);
        jTextArea6.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea6.setLineWrap(true);
        jTextArea6.setRows(5);
        jTextArea6.setText("Si tienes la tarjeta y te dijeron en las taquillas que ésta ya venció... Pues bien, lo que debes hacer es cambiarla por la tarjeta nueva cancelando el valor establecido en las taquillas y sigues disfrutando de tus beneficios. No debes volver a inscribirte y no pierdes tu antigüedad en el Club LUJOSAM de clientes. Todas las tarjetas tienen vigencia por un año a partir de la fecha de su nueva expedición.");
        jTextArea6.setWrapStyleWord(true);
        jScrollPane6.setViewportView(jTextArea6);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1357, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(jScrollPane2)
                        .addComponent(jScrollPane1)
                        .addComponent(jLabel3)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(26, 26, 26)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addGap(18, 18, 18)
                            .addComponent(lblMembresia, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(41, 41, 41)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 735, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel4))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(16, 16, 16)
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabel6))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(82, 82, 82)
                                    .addComponent(lblMembresia, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(52, Short.MAX_VALUE)))
        );

        jScrollPane9.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCarteleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarteleraActionPerformed
        String usser = txtUserEnSession.getText();
        VenPrincipal venPrincipal = new VenPrincipal(cliente, carrito);
        venPrincipal.setVisible(true);
        this.dispose();
      
    }//GEN-LAST:event_btnCarteleraActionPerformed

    private void btnCombosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombosActionPerformed
        String usser = txtUserEnSession.getText();
        VenCombos venCombos = new VenCombos(cliente, carrito);
        venCombos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCombosActionPerformed

    private void btnMembresiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMembresiaActionPerformed
        String usser = txtUserEnSession.getText();
        VenMembresia venMembresia = new VenMembresia(cliente, carrito);
        venMembresia.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMembresiaActionPerformed

    private void btnPromocionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromocionesActionPerformed
        String usser = txtUserEnSession.getText();
        VenPromo venPromo = new VenPromo(cliente, carrito);
        venPromo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPromocionesActionPerformed

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        String usser = txtUserEnSession.getText();
        VenPerfil venPerfil = new VenPerfil(cliente, carrito);
        venPerfil.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnBotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBotActionPerformed
        VenChatBot venIA = new VenChatBot();
        venIA.setVisible(true);
    }//GEN-LAST:event_btnBotActionPerformed

    private void btnCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarritoActionPerformed
        String usser = txtUserEnSession.getText();
        VenCarrito venCarrito = new VenCarrito(cliente, carrito);
        venCarrito.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCarritoActionPerformed
 
    
    private void organizarImagen(JLabel label, String rutaImagen) {
    URL url = getClass().getResource(rutaImagen);
        if (url != null) {
            ImageIcon icono = new ImageIcon(url);
            Image imagen = icono.getImage().getScaledInstance(
                    label.getWidth(),
                    label.getHeight(),
                    Image.SCALE_SMOOTH
            );
            
            label.setIcon(new ImageIcon(imagen));
            } else {
            
            System.err.println("No se encontró: " + rutaImagen);
            
            }
    }
    
  
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbSelectCIty;
    private javax.swing.JButton btnBot;
    private javax.swing.JButton btnCarrito;
    private javax.swing.JButton btnCartelera;
    private javax.swing.JButton btnCombos;
    private javax.swing.JButton btnMembresia;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnPromociones;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMembresia;
    private javax.swing.JLabel txtUserEnSession;
    // End of variables declaration//GEN-END:variables
}
