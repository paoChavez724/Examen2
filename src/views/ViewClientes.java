/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author PC22
 */
public class ViewClientes extends javax.swing.JPanel {

    /**
     * Creates new form ViewClientes
     */
    public ViewClientes() {
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

        jl_email = new javax.swing.JLabel();
        jbtn_anterior = new javax.swing.JButton();
        jtf_nombreC = new javax.swing.JTextField();
        jbtn_actualizar = new javax.swing.JButton();
        jbtn_siguiente = new javax.swing.JButton();
        jtf_telefono = new javax.swing.JTextField();
        jl_direccion = new javax.swing.JLabel();
        jtf_id_cliente = new javax.swing.JTextField();
        jbtn_ultimo = new javax.swing.JButton();
        Id_cliente = new javax.swing.JLabel();
        jl_nombreC = new javax.swing.JLabel();
        jtf_direccion = new javax.swing.JTextField();
        jbtn_agregar = new javax.swing.JButton();
        jl_telefono = new javax.swing.JLabel();
        jtf_email = new javax.swing.JTextField();
        jbtn_eliminar = new javax.swing.JButton();
        jbtn_primero = new javax.swing.JButton();

        jl_email.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jl_email.setForeground(new java.awt.Color(204, 153, 255));
        jl_email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_email.setText("Email");

        jbtn_anterior.setBackground(new java.awt.Color(204, 153, 255));
        jbtn_anterior.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jbtn_anterior.setText("<");

        jtf_nombreC.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jtf_nombreC.setForeground(new java.awt.Color(204, 153, 255));

        jbtn_actualizar.setBackground(new java.awt.Color(204, 153, 255));
        jbtn_actualizar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jbtn_actualizar.setText("Actualizar");

        jbtn_siguiente.setBackground(new java.awt.Color(204, 153, 255));
        jbtn_siguiente.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jbtn_siguiente.setText(">");

        jtf_telefono.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jtf_telefono.setForeground(new java.awt.Color(204, 153, 255));

        jl_direccion.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jl_direccion.setForeground(new java.awt.Color(204, 153, 255));
        jl_direccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_direccion.setText("Direccion");

        jtf_id_cliente.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jtf_id_cliente.setForeground(new java.awt.Color(204, 153, 255));

        jbtn_ultimo.setBackground(new java.awt.Color(204, 153, 255));
        jbtn_ultimo.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jbtn_ultimo.setText(">l");

        Id_cliente.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        Id_cliente.setForeground(new java.awt.Color(204, 153, 255));
        Id_cliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Id_cliente.setText("Id de Cliente");

        jl_nombreC.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jl_nombreC.setForeground(new java.awt.Color(204, 153, 255));
        jl_nombreC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_nombreC.setText("Nombre");

        jtf_direccion.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jtf_direccion.setForeground(new java.awt.Color(204, 153, 255));

        jbtn_agregar.setBackground(new java.awt.Color(204, 153, 255));
        jbtn_agregar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jbtn_agregar.setText("Agregar");

        jl_telefono.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jl_telefono.setForeground(new java.awt.Color(204, 153, 255));
        jl_telefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_telefono.setText("Telefono");

        jtf_email.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jtf_email.setForeground(new java.awt.Color(204, 153, 255));

        jbtn_eliminar.setBackground(new java.awt.Color(204, 153, 255));
        jbtn_eliminar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jbtn_eliminar.setText("Eliminar");

        jbtn_primero.setBackground(new java.awt.Color(204, 153, 255));
        jbtn_primero.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jbtn_primero.setText("l<");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtf_id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_nombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtf_nombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtn_primero, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jbtn_anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jbtn_siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jbtn_ultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jl_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jl_email, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Id_cliente)
                    .addComponent(jtf_id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_nombreC)
                    .addComponent(jtf_nombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_telefono)
                    .addComponent(jtf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_email)
                    .addComponent(jtf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_direccion)
                    .addComponent(jtf_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_primero)
                    .addComponent(jbtn_anterior)
                    .addComponent(jbtn_siguiente)
                    .addComponent(jbtn_ultimo))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_agregar)
                    .addComponent(jbtn_eliminar)
                    .addComponent(jbtn_actualizar))
                .addContainerGap(51, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Id_cliente;
    public javax.swing.JButton jbtn_actualizar;
    public javax.swing.JButton jbtn_agregar;
    public javax.swing.JButton jbtn_anterior;
    public javax.swing.JButton jbtn_eliminar;
    public javax.swing.JButton jbtn_primero;
    public javax.swing.JButton jbtn_siguiente;
    public javax.swing.JButton jbtn_ultimo;
    public javax.swing.JLabel jl_direccion;
    public javax.swing.JLabel jl_email;
    public javax.swing.JLabel jl_nombreC;
    public javax.swing.JLabel jl_telefono;
    public javax.swing.JTextField jtf_direccion;
    public javax.swing.JTextField jtf_email;
    public javax.swing.JTextField jtf_id_cliente;
    public javax.swing.JTextField jtf_nombreC;
    public javax.swing.JTextField jtf_telefono;
    // End of variables declaration//GEN-END:variables
}
