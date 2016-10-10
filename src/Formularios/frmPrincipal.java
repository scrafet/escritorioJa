package Formularios;

import Clases.DesktopConFondo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by scrafet on 30/07/2016.
 */
public class frmPrincipal extends JFrame {
    /**
     * Objetos
     */
    private JMenuBar mnFacturacion;
    private JMenu mnArchivo;
    private JMenu mnMovimientos;
    private JMenu mnAyuda;
    private JMenuItem mnArchivoClientes;
    private JMenuItem mnArchivoProductos;
    private JMenuItem mnArchivoUsuarios;
    private JSeparator mnArchivoSeparador1;
    private JMenuItem mnArchivoCambioClave;
    private JMenuItem mnArchivoCambioUsuario;
    private JSeparator mnArchivoSeparador2;
    private JMenuItem mnArchivoSalir;
    private JMenuItem mnMovimientosNuevaFactura;
    private JMenuItem mnMovimientosReportesFacturas;
    private JMenuItem mnAyudaAcercaDe;
    private JMenuItem mnAyudaAyuda;
    private JDesktopPane dpEscritorio;

    public frmPrincipal(){
        /**
         * Propiedades del Formulario
         */
        setTitle("Sistema de Facturacion");
        setResizable(true);
        setSize(700, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /**
         * Creamos los Iconos
         */
        Icon icoArchivo = new ImageIcon(getClass().getResource("/images/32x32/folder.png"));
        Icon icoMovimientos = new ImageIcon(getClass().getResource("/images/32x32/dollar_currency_sign.png"));
        Icon icoAyuda = new ImageIcon(getClass().getResource("/images/32x32/help.png"));
        Icon icoClientes = new ImageIcon(getClass().getResource("/images/32x32/user.png"));
        Icon icoProductos= new ImageIcon(getClass().getResource("/images/32x32/shopping_cart.png"));
        Icon icoUsuarios = new ImageIcon(getClass().getResource("/images/32x32/users.png"));
        Icon icoCambioClave = new ImageIcon(getClass().getResource("/images/32x32/note_delete.png"));
        Icon icoCambioUsuario = new ImageIcon(getClass().getResource("/images/32x32/user_comment.png"));
        Icon icoSalir = new ImageIcon(getClass().getResource("/images/32x32/delete_item.png"));
        Icon icoNuevaFactura = new ImageIcon(getClass().getResource("/images/32x32/note_accept.png"));
        Icon icoReporteFactura = new ImageIcon(getClass().getResource("/images/32x32/printer.png"));
        Icon icoAcercaDe = new ImageIcon(getClass().getResource("/images/32x32/search_magnifier.png"));
        Icon icoAyudaAyuda = new ImageIcon(getClass().getResource("/images/32x32/help.png"));
        /**
         * Creacion de objetos
         */
        mnFacturacion = new JMenuBar();
        mnArchivo = new JMenu("Archivo");
        mnMovimientos= new JMenu("Movimientos");
        mnAyuda = new JMenu("Ayuda");
        mnArchivoClientes=new JMenuItem("Clientes");
        mnArchivoProductos=new JMenuItem("Productos");
        mnArchivoUsuarios=new JMenuItem("Usuario");
        mnArchivoSeparador1=new JSeparator();
        mnArchivoCambioClave=new JMenuItem("Cambio de Clave");
        mnArchivoCambioUsuario=new JMenuItem("Cambio de Usuario");
        mnArchivoSeparador2=new JSeparator();
        mnArchivoSalir=new JMenuItem("Salir");
        mnMovimientosNuevaFactura=new JMenuItem("NuevaFactura");
        mnMovimientosReportesFacturas=new JMenuItem("Reportes Facturas");
        mnAyudaAcercaDe=new JMenuItem("Acerca De");
        mnAyudaAyuda=new JMenuItem("Ayuda");
        dpEscritorio=new DesktopConFondo();
        /**
         * Imagen de la clase DesktopConFondo
         */
        ((DesktopConFondo) dpEscritorio).setImagen("/images/Fondos/fondo(2).jpg");
        /**
         * Asignacion de iconos
         */
        mnArchivo.setIcon(icoArchivo);
        mnMovimientos.setIcon(icoMovimientos);
        mnAyuda.setIcon(icoAyuda);
        mnArchivoClientes.setIcon(icoClientes);
        mnArchivoProductos.setIcon(icoProductos);
        mnArchivoUsuarios.setIcon(icoUsuarios);
        mnArchivoCambioClave.setIcon(icoCambioClave);
        mnArchivoCambioUsuario.setIcon(icoCambioUsuario);
        mnArchivoSalir.setIcon(icoSalir);
        mnMovimientosNuevaFactura.setIcon(icoNuevaFactura);
        mnMovimientosReportesFacturas.setIcon(icoReporteFactura);
        mnAyudaAcercaDe.setIcon(icoAcercaDe);
        mnAyudaAyuda.setIcon(icoAyudaAyuda);
        /**
         * Armado de Menu
         */
        mnArchivo.add(mnArchivoClientes);
        mnArchivo.add(mnArchivoProductos);
        mnArchivo.add(mnArchivoUsuarios);
        mnArchivo.add(mnArchivoSeparador1);
        mnArchivo.add(mnArchivoCambioClave);
        mnArchivo.add(mnArchivoCambioUsuario);
        mnArchivo.add(mnArchivoSeparador2);
        mnArchivo.add(mnArchivoSalir);
        mnFacturacion.add(mnArchivo);
        /**
         *
         */
        mnMovimientos.add(mnMovimientosNuevaFactura);
        mnMovimientos.add(mnMovimientosReportesFacturas);
        mnFacturacion.add(mnMovimientos);
        /**
         *  Mas propiedades del formulario
         */
        mnAyuda.add(mnAyudaAcercaDe);
        mnAyuda.add(mnAyudaAyuda);
        mnFacturacion.add(mnAyuda);
        setJMenuBar(mnFacturacion);
        setContentPane(dpEscritorio);
        /**
         * Eventos del Menu
         */
        mnArchivoClientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mnArchivoClientesActionPerformed(e);
            }
        });

        mnArchivoProductos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mnArchivoProductosActionPerformed(e);
            }
        });
        mnArchivoUsuarios.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mnArchivoUsuariosActionPerformed(e);
            }
        });
        mnArchivoCambioClave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mnArchivoCambioClaveActionPerformed(e);
            }
        });
        mnArchivoCambioUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mnArchivoCambioUsuarioActionPerformed(e);
            }
        });
        mnArchivoSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mnArchivoSalirActionPerformed(e);
            }
        });
        mnMovimientosNuevaFactura.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mnMovimientosNuevaFacturaActionPerformed(e);
            }
        });
        mnMovimientosReportesFacturas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mnMovimientosReportesFacturasActionPerformed(e);
            }
        });
        mnAyudaAyuda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mnAyudaAyudaActionPerformed(e);
            }
        });
        mnAyudaAcercaDe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mnAyudaAcercaDeActionPerformed(e);
            }
        });

    }

    /**
     *
     *
     */
    private void mnArchivoClientesActionPerformed(ActionEvent e)   {
        frmClientes misClientes = new frmClientes();
        dpEscritorio.add(misClientes);
        misClientes.show();
    }
    private void mnArchivoProductosActionPerformed(ActionEvent e)   {
        frmProductos misProductos = new frmProductos();
        dpEscritorio.add(misProductos);
        misProductos.show();
    }
    private void mnArchivoUsuariosActionPerformed(ActionEvent e)   {
        frmUsuarios misUsuarios = new frmUsuarios();
        dpEscritorio.add(misUsuarios);
        misUsuarios.show();
    }
    private void mnArchivoCambioClaveActionPerformed(ActionEvent e)   {

    }
    private void mnArchivoCambioUsuarioActionPerformed(ActionEvent e)   {

    }
    private void mnArchivoSalirActionPerformed(ActionEvent e)   {
        /**
         * termina la aplicacion
         */
        System.exit(0);
    }
    private void mnMovimientosNuevaFacturaActionPerformed(ActionEvent e)   {

    }
    private void mnMovimientosReportesFacturasActionPerformed(ActionEvent e)   {

    }
    private void mnAyudaAyudaActionPerformed(ActionEvent e)   {

    }
    private void mnAyudaAcercaDeActionPerformed(ActionEvent e)   {

    }
}
