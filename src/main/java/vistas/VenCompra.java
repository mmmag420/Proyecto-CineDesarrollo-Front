package vistas;

import Service.SalaServiceFront;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import modelos.Car;
import modelos.Client;
import modelos.Hall;
import modelos.Movie;
import modelos.Ticket;
import service.CarritoServiceFront;


public class VenCompra extends javax.swing.JFrame {
    
    private Movie p;
    private Client cliente;
    private Car carrito;
    private Hall sala;
    
    private final SalaServiceFront serviceSala = new SalaServiceFront();
    private final CarritoServiceFront carritoSvc = new CarritoServiceFront();

    public VenCompra(Client cliente, Movie p,Car carrito, Hall sala) {
        initComponents();
        setLocationRelativeTo(this);
        txtUserEnSession.setText(cliente.getNombre());
        cargarComponentes(p);
        organizarImagen(lblPoster, p.getRutaImagen());
        this.p = p;
        this.cliente = cliente;
        this.carrito = carrito;
        this.sala = sala;
        selecSillas();
        cargarSala();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jPanel3 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblClasificacion = new javax.swing.JLabel();
        lblDirector = new javax.swing.JLabel();
        lblPoster = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtReparto = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        chk38 = new javax.swing.JCheckBox();
        chk37 = new javax.swing.JCheckBox();
        chk36 = new javax.swing.JCheckBox();
        chk35 = new javax.swing.JCheckBox();
        chk34 = new javax.swing.JCheckBox();
        chk33 = new javax.swing.JCheckBox();
        chk32 = new javax.swing.JCheckBox();
        chk31 = new javax.swing.JCheckBox();
        chk30 = new javax.swing.JCheckBox();
        chk29 = new javax.swing.JCheckBox();
        chk28 = new javax.swing.JCheckBox();
        chk27 = new javax.swing.JCheckBox();
        chk26 = new javax.swing.JCheckBox();
        chk25 = new javax.swing.JCheckBox();
        chk24 = new javax.swing.JCheckBox();
        chk23 = new javax.swing.JCheckBox();
        chk22 = new javax.swing.JCheckBox();
        chk18 = new javax.swing.JCheckBox();
        chk19 = new javax.swing.JCheckBox();
        chk17 = new javax.swing.JCheckBox();
        chk16 = new javax.swing.JCheckBox();
        chk4 = new javax.swing.JCheckBox();
        chk13 = new javax.swing.JCheckBox();
        chk21 = new javax.swing.JCheckBox();
        chk39 = new javax.swing.JCheckBox();
        chk10 = new javax.swing.JCheckBox();
        chk11 = new javax.swing.JCheckBox();
        chk20 = new javax.swing.JCheckBox();
        chk12 = new javax.swing.JCheckBox();
        chk8 = new javax.swing.JCheckBox();
        chk9 = new javax.swing.JCheckBox();
        chk7 = new javax.swing.JCheckBox();
        chk14 = new javax.swing.JCheckBox();
        chk5 = new javax.swing.JCheckBox();
        chk6 = new javax.swing.JCheckBox();
        chk15 = new javax.swing.JCheckBox();
        chk3 = new javax.swing.JCheckBox();
        chk2 = new javax.swing.JCheckBox();
        chk1 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNumSillas = new javax.swing.JTextField();
        btnSumarSIllas = new javax.swing.JButton();
        btnRestarSillas = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lblDuracion = new javax.swing.JLabel();
        btnAgregarCarrito = new javax.swing.JButton();

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCartelera)
                .addGap(18, 18, 18)
                .addComponent(btnMembresia)
                .addGap(18, 18, 18)
                .addComponent(btnCombos)
                .addGap(18, 18, 18)
                .addComponent(btnPromociones, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CbSelectCIty, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUserEnSession, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnPerfil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCarrito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBot)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblLogo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCartelera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnMembresia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CbSelectCIty, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUserEnSession, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCombos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnPromociones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPerfil)
                    .addComponent(btnBot)
                    .addComponent(btnCarrito))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("jLabel2");

        lblClasificacion.setForeground(new java.awt.Color(255, 255, 255));
        lblClasificacion.setText("jLabel4");

        lblDirector.setForeground(new java.awt.Color(255, 255, 255));
        lblDirector.setText("jLabel6");

        lblPoster.setText("jLabel1");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre original:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Clasificacion:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Reparto:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Director:");

        txtReparto.setEditable(false);
        txtReparto.setColumns(20);
        txtReparto.setLineWrap(true);
        txtReparto.setRows(5);
        txtReparto.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtReparto);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("PANTALLA");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(75, 75, 75))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(chk22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chk23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chk24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chk25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chk26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(chk1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chk2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chk3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chk4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chk5)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(chk19)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(chk20))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(chk36)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(chk37)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(chk38)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(chk39)
                                        .addComponent(chk21))
                                    .addGap(72, 72, 72))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(chk27)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(chk28))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(chk11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(chk12)))
                                    .addContainerGap()))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chk13)
                            .addComponent(chk29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(chk30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chk31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chk32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chk33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chk34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chk35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(chk6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chk7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chk8))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(chk14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chk15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chk16)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(chk17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chk18))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(chk9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chk10)))))
                        .addGap(172, 172, 172))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk5)
                    .addComponent(chk4)
                    .addComponent(chk3)
                    .addComponent(chk2)
                    .addComponent(chk1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chk10)
                            .addComponent(chk11)
                            .addComponent(chk12)
                            .addComponent(chk8)
                            .addComponent(chk9)
                            .addComponent(chk7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chk18)
                                    .addComponent(chk19)
                                    .addComponent(chk17)
                                    .addComponent(chk16)
                                    .addComponent(chk13)
                                    .addComponent(chk21)
                                    .addComponent(chk14)
                                    .addComponent(chk15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chk28, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(chk27, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(chk26, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(chk25, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(chk24, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(chk23, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(chk22, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chk29)
                                    .addComponent(chk30)
                                    .addComponent(chk31)
                                    .addComponent(chk32)
                                    .addComponent(chk33)
                                    .addComponent(chk34)
                                    .addComponent(chk35)
                                    .addComponent(chk38)
                                    .addComponent(chk37)
                                    .addComponent(chk36)
                                    .addComponent(chk39)))
                            .addComponent(chk20)))
                    .addComponent(chk6))
                .addGap(522, 522, 522))
        );

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("SILLA STANDARD: $14.000");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CANTIDAD DE SILLAS:");

        txtNumSillas.setEditable(false);
        txtNumSillas.setBackground(new java.awt.Color(102, 102, 102));
        txtNumSillas.setForeground(new java.awt.Color(255, 255, 255));
        txtNumSillas.setText("0");
        txtNumSillas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumSillasActionPerformed(evt);
            }
        });

        btnSumarSIllas.setBackground(new java.awt.Color(102, 102, 102));
        btnSumarSIllas.setForeground(new java.awt.Color(255, 255, 255));
        btnSumarSIllas.setText("+");
        btnSumarSIllas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarSIllasActionPerformed(evt);
            }
        });

        btnRestarSillas.setBackground(new java.awt.Color(102, 102, 102));
        btnRestarSillas.setForeground(new java.awt.Color(255, 255, 255));
        btnRestarSillas.setText("-");
        btnRestarSillas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarSillasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(btnRestarSillas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumSillas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSumarSIllas))
                            .addComponent(jLabel7))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumSillas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSumarSIllas)
                    .addComponent(btnRestarSillas))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Duracion:");

        lblDuracion.setForeground(new java.awt.Color(255, 255, 255));
        lblDuracion.setText("jLabel9");

        btnAgregarCarrito.setText("AGREGAR AL CARRITO");
        btnAgregarCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCarritoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPoster, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNombre))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblClasificacion))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(lblDuracion))
                                            .addComponent(lblDirector)))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(btnAgregarCarrito)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPoster, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgregarCarrito))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblClasificacion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lblDirector))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lblDuracion))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
  
        VenCombos venCombos = new VenCombos(cliente, carrito);
        venCombos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCombosActionPerformed

    private void btnMembresiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMembresiaActionPerformed
     
        VenMembresia venMembresia = new VenMembresia(cliente, carrito);
        venMembresia.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMembresiaActionPerformed

    private void btnPromocionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromocionesActionPerformed
        VenPromo venPromo = new VenPromo(cliente, carrito);
        venPromo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPromocionesActionPerformed

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
       
        VenPerfil venPerfil = new VenPerfil(cliente, carrito);
        venPerfil.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnSumarSIllasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarSIllasActionPerformed
        int numSillas = Integer.parseInt(txtNumSillas.getText());
        if(numSillas < 31) {
          numSillas = numSillas + 1;  
          txtNumSillas.setText(String.valueOf(numSillas));
        } else {
            JOptionPane.showMessageDialog(null, "Maximo de sillas en la sala");
        }                
    }//GEN-LAST:event_btnSumarSIllasActionPerformed

    private void btnRestarSillasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarSillasActionPerformed
        int numSillas = Integer.parseInt(txtNumSillas.getText());
        if(numSillas > 0) {
          numSillas = numSillas - 1;   
          txtNumSillas.setText(String.valueOf(numSillas));
        }
    }//GEN-LAST:event_btnRestarSillasActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        int numSillas = Integer.parseInt(txtNumSillas.getText());
        float ValorCompra = 14000 * numSillas;
        VenPago venPago = new VenPago(cliente, carrito);
        venPago.setVisible(true);
        this.dispose();     
    }//GEN-LAST:event_btnConfirmarActionPerformed

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

    private void btnAgregarCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCarritoActionPerformed
     try {
         
         JCheckBox[] sillas = {
            chk1, chk2, chk3, chk4, chk5, chk6, chk7, chk8, chk9, chk10,
            chk11, chk12, chk13, chk14, chk15, chk16, chk17, chk18, chk19, chk20,
            chk21, chk22, chk23, chk24, chk25, chk26, chk27, chk28, chk29, chk30,
            chk31, chk32, chk33, chk34, chk35, chk36, chk37, chk38, chk39
        };        
         
        int cantidad;
        try {
            cantidad = Integer.parseInt(txtNumSillas.getText());
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Cantidad inválida.");
            return;
        }
        if (cantidad <= 0) {
            JOptionPane.showMessageDialog(this, "Selecciona la cantidad de sillas primero.");
            return;
        }

        java.util.List<Integer> seleccionados = new java.util.ArrayList<>();
        for (int i = 0; i < sillas.length; i++) {
            if (sillas[i].isEnabled() && sillas[i].isSelected()) {
                seleccionados.add(i + 1);
            }
        }
        if (seleccionados.size() != cantidad) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar exactamente " + cantidad + " sillas.");
            return;
        }

        int numSala = sala.getNumSala();
        Hall.Dia dia = sala.getDiaPelicula();
        String hora = sala.getHoraInicio().toString(); 
        boolean reservado = serviceSala.reservarSillas(numSala, dia, hora, seleccionados);
        if (!reservado) {
            JOptionPane.showMessageDialog(this, "Alguna silla ya fue ocupada. Actualizando estado…");
            cargarSala(); 
            return;
        }

        for (int asiento : seleccionados) {
            Ticket t = new Ticket(asiento, 14000, sala);

            Car actualizado = carritoSvc.agregarEntrada(carrito, t);
            if (actualizado == null) {
                JOptionPane.showMessageDialog(this, "No se pudo agregar la entrada al carrito.");
                cargarSala();
                return;
            }
            carrito = actualizado;
        }

        JOptionPane.showMessageDialog(this, "Entradas agregadas al carrito: " + seleccionados);

        for (JCheckBox c : sillas) if (c.isEnabled()) c.setSelected(false);
        txtNumSillas.setText("0");

        cargarSala();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    } finally {
        btnAgregarCarrito.setEnabled(true);
    }
    }//GEN-LAST:event_btnAgregarCarritoActionPerformed

    private void txtNumSillasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumSillasActionPerformed
        
    }//GEN-LAST:event_txtNumSillasActionPerformed

    private void cargarComponentes(Movie p) {
        lblNombre.setText(p.getNombre());
        lblClasificacion.setText(p.getClasificacion());
        txtReparto.setText(p.getReparto());
        lblDirector.setText(p.getDirector());
        lblDuracion.setText(p.getDuracion());
        
        java.net.URL url = getClass().getResource(p.getRutaImagen());
        ImageIcon icon = new ImageIcon(url);
        Image imgEscalada = icon.getImage().getScaledInstance(200, 300, Image.SCALE_SMOOTH);    
    }    
    
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
    
    public void selecSillas() {

        JCheckBox[] sillas = {
            chk1, chk2, chk3, chk4, chk5, chk6, chk7, chk8, chk9, chk10,
            chk11, chk12, chk13, chk14, chk15, chk16, chk17, chk18, chk19, chk20,
            chk21, chk22, chk23, chk24, chk25, chk26, chk27, chk28, chk29, chk30,
            chk31, chk32, chk33, chk34, chk35, chk36, chk37, chk38, chk39
        };

        for (JCheckBox chk : sillas) {
            chk.addActionListener(e -> {
                int maxSillas = Integer.parseInt(txtNumSillas.getText());

                int seleccionados = 0;
                for (JCheckBox c : sillas) {
                    if (c.isEnabled() && c.isSelected()) { 
                        seleccionados++;
                    }
                }

                if (seleccionados > maxSillas) {
                    chk.setSelected(false);
                    JOptionPane.showMessageDialog(this,
                        "Solo puedes seleccionar " + maxSillas + " sillas.",
                        "Límite alcanzado", JOptionPane.WARNING_MESSAGE);
                }
            });
        }
    }
    
    public void cargarSala() {
        try {
            
        boolean[] estado = serviceSala.estadoSillas(sala.getNumSala(), sala.getDiaPelicula(), sala.getHoraInicio().toString()); 
        
        JCheckBox[] sillas = {
            chk1, chk2, chk3, chk4, chk5, chk6, chk7, chk8, chk9, chk10,
            chk11, chk12, chk13, chk14, chk15, chk16, chk17, chk18, chk19, chk20,
            chk21, chk22, chk23, chk24, chk25, chk26, chk27, chk28, chk29, chk30,
            chk31, chk32, chk33, chk34, chk35, chk36, chk37, chk38, chk39
        };
            
            for (int i = 0; i < estado.length && i < sillas.length; i++) {
                boolean ocupada = estado[i];
                JCheckBox cb = sillas[i];

                cb.setSelected(ocupada);     
                cb.setEnabled(!ocupada);    
            }
            
        } catch (Exception e) {
           JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());     
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbSelectCIty;
    private javax.swing.JButton btnAgregarCarrito;
    private javax.swing.JButton btnBot;
    private javax.swing.JButton btnCarrito;
    private javax.swing.JButton btnCartelera;
    private javax.swing.JButton btnCombos;
    private javax.swing.JButton btnMembresia;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnPromociones;
    private javax.swing.JButton btnRestarSillas;
    private javax.swing.JButton btnSumarSIllas;
    private javax.swing.JCheckBox chk1;
    private javax.swing.JCheckBox chk10;
    private javax.swing.JCheckBox chk11;
    private javax.swing.JCheckBox chk12;
    private javax.swing.JCheckBox chk13;
    private javax.swing.JCheckBox chk14;
    private javax.swing.JCheckBox chk15;
    private javax.swing.JCheckBox chk16;
    private javax.swing.JCheckBox chk17;
    private javax.swing.JCheckBox chk18;
    private javax.swing.JCheckBox chk19;
    private javax.swing.JCheckBox chk2;
    private javax.swing.JCheckBox chk20;
    private javax.swing.JCheckBox chk21;
    private javax.swing.JCheckBox chk22;
    private javax.swing.JCheckBox chk23;
    private javax.swing.JCheckBox chk24;
    private javax.swing.JCheckBox chk25;
    private javax.swing.JCheckBox chk26;
    private javax.swing.JCheckBox chk27;
    private javax.swing.JCheckBox chk28;
    private javax.swing.JCheckBox chk29;
    private javax.swing.JCheckBox chk3;
    private javax.swing.JCheckBox chk30;
    private javax.swing.JCheckBox chk31;
    private javax.swing.JCheckBox chk32;
    private javax.swing.JCheckBox chk33;
    private javax.swing.JCheckBox chk34;
    private javax.swing.JCheckBox chk35;
    private javax.swing.JCheckBox chk36;
    private javax.swing.JCheckBox chk37;
    private javax.swing.JCheckBox chk38;
    private javax.swing.JCheckBox chk39;
    private javax.swing.JCheckBox chk4;
    private javax.swing.JCheckBox chk5;
    private javax.swing.JCheckBox chk6;
    private javax.swing.JCheckBox chk7;
    private javax.swing.JCheckBox chk8;
    private javax.swing.JCheckBox chk9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblClasificacion;
    private javax.swing.JLabel lblDirector;
    private javax.swing.JLabel lblDuracion;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPoster;
    private javax.swing.JTextField txtNumSillas;
    private javax.swing.JTextArea txtReparto;
    private javax.swing.JLabel txtUserEnSession;
    // End of variables declaration//GEN-END:variables
}
