package Formularios;

import Clases.Datos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by scrafet on 28/07/2016.
 */
public class frmLogin extends JFrame {
    /**
     * Objetos del formulario
     */
    private JLabel lblUsuario;
    private JLabel lblClave;
    private JLabel lblImagen;
    private JTextField txtUsuario;
    private JTextField txtClave;
    private JButton btnAceptar;
    private JButton btnCancelar;
    /**
     *Constructor
     */
    public frmLogin(){
        /**
         * Propiedades del Formulario
         */
        setTitle("Ingreso al Sistema");
        setResizable(false);
        setSize(390, 180);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /**
         * Creamos los Iconos
         */
        Icon icoAceptar = new ImageIcon(getClass().getResource("/images/32x32/accept_item.png"));
        Icon icoCancelar = new ImageIcon(getClass().getResource("/images/32x32/delete_item.png"));
        Icon icoImagen = new ImageIcon(getClass().getResource("/images/128x128/lock.png"));
        /**
         * Creamos Objetos del Formulario
         */
        lblUsuario = new JLabel("Usuario");
        txtUsuario = new JTextField(10);
        lblClave = new JLabel("Clave");
        txtClave = new JPasswordField(10);
        btnAceptar = new JButton("Aceptar", icoAceptar);
        btnCancelar = new JButton("Cancelar", icoCancelar);
        lblImagen = new JLabel(icoImagen);
        /**
         * Definimos Propiedades de los Objetos
         */
        btnAceptar.setHorizontalTextPosition(SwingConstants.HORIZONTAL);
        btnAceptar.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnAceptar.setToolTipText("Ingresa al Sistema");

        btnCancelar.setHorizontalTextPosition(SwingConstants.HORIZONTAL);
        btnCancelar.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnCancelar.setToolTipText("Cancela la operacion y cierra la aplicacion");


        /**
         * Adicionamos Objetos al Formulario
         */
        add(lblUsuario);
        add(txtUsuario);
        add(lblClave);
        add(txtClave);
        add(btnAceptar);
        add(btnCancelar);
        add(lblImagen);
        /**
         * Ubicamos Objetos en el Formulario
         */
        lblUsuario.reshape(20, 20, 100, 20);
        txtUsuario.reshape(120, 20, 100, 20);
        lblImagen.reshape(250, 20, 128, 128);

        lblClave.reshape(20, 45, 100, 20);
        txtClave.reshape(120, 45, 100, 20);

        btnAceptar.reshape(20, 75, 90, 60);
        btnCancelar.reshape(130, 75, 90, 60);
        /**
         * Adicionamos Eventos a los Botones
         */
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnAceptarActionPerformed(e);
            }
        });
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCancelarActionPerformed(e);
            }
        });
    }
    private void btnAceptarActionPerformed(ActionEvent e){
        Datos misDatos = new Datos();

        if (!misDatos.validarUsuario(txtUsuario.getText(), new String(txtClave.getText()))) {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña no validos");
            txtUsuario.setText("");
            txtClave.setText("");
            txtUsuario.requestFocusInWindow();
            return;
        }
        frmPrincipal miPrincipal= new frmPrincipal();
        setVisible(false);
        miPrincipal.setExtendedState(JFrame.MAXIMIZED_BOTH);
        miPrincipal.setVisible(true);
    }

    private  void btnCancelarActionPerformed(ActionEvent e){
        /**
         * Terminamos la Aplicacion
         */
        System.exit(0);
    }
}
