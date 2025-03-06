/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;


import java.awt.*;
import java.awt.event.*;
import java.util.Set;
import javax.swing.*;

public class Log2 extends JFrame implements ActionListener {
    //Declaración de Controles a usar en en Form de Login

    //Labels
    JLabel LbLogo = new JLabel();

    JLabel LbCampoUserType = new JLabel();
    JLabel LbIconCampoUserType = new JLabel();

    JLabel LbCampoUser = new JLabel();
    JLabel LbIconCampoUser = new JLabel();

    JLabel LbCampoPass = new JLabel();
    JLabel LbIconCampoPass = new JLabel();

    //ComoboBO
    String[] ListadoCombo = {"Administrador", "Cliente"};
    JComboBox CbTipoUsuario = new JComboBox(ListadoCombo);

    //Cajas de texto
    JTextField TxtUsuario = new JTextField("");
    JPasswordField TxtPass = new JPasswordField("");

    //Botones
    JButton BtnAceptar = new JButton("Aceptar");
    JButton BtnClose = new JButton("X");

    //Place Holders
    //TextPrompt holder;

    public Log2() {
        this.setLayout(null);
        this.setResizable(false);
        this.setSize(1200, 600);
        this.setLocationRelativeTo(null);
        this.setUndecorated(true);
        this.getContentPane().setBackground(new Color(20, 24, 36));
        this.Load();

    }

    //Propiedades de los controles
    public void Load() {
        //Apartado del Logo
        LbLogo.setBounds(48, 222, 400, 200);
        Image iconLogo = new ImageIcon(this.getClass().getResource("/Recursos/Logo.PNG")).getImage();
        ImageIcon iconLogoRedimensionado = new ImageIcon(iconLogo.getScaledInstance(LbLogo.getWidth(), LbLogo.getHeight(), Image.SCALE_DEFAULT));
        LbLogo.setIcon(iconLogoRedimensionado);
        this.add(LbLogo);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////        
        //Apartado CombBox
        LbIconCampoUserType.setBounds(515, 153, 60, 55);
        Image iconUserType = new ImageIcon(this.getClass().getResource("/Recursos/userType.png")).getImage();
        ImageIcon iconUserTypeRedimensionado = new ImageIcon(iconUserType.getScaledInstance(LbIconCampoUserType.getWidth(), LbIconCampoUserType.getHeight(), Image.SCALE_DEFAULT));
        LbIconCampoUserType.setIcon(iconUserTypeRedimensionado);
        this.add(LbIconCampoUserType);

        LbCampoUserType.setBounds(500, 150, 520, 65);
        Image campo = new ImageIcon(this.getClass().getResource("/Recursos/campos.png")).getImage();
        ImageIcon campoRedimensionado = new ImageIcon(campo.getScaledInstance(LbCampoUserType.getWidth(), LbCampoUserType.getHeight(), Image.SCALE_DEFAULT));
        LbCampoUserType.setIcon(campoRedimensionado);
        this.add(LbCampoUserType);

        CbTipoUsuario.setBounds(590, 158, 400, 50);
        CbTipoUsuario.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
        CbTipoUsuario.setBorder(null);
        CbTipoUsuario.setBackground(Color.white);
        CbTipoUsuario.setForeground(Color.black);
        this.add(CbTipoUsuario);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////                
        //Aparatado User
        LbIconCampoUser.setBounds(515, 256, 60, 55);
        Image iconUser = new ImageIcon(this.getClass().getResource("/Recursos/user.png")).getImage();
        ImageIcon iconUserRedimensionado = new ImageIcon(iconUser.getScaledInstance(LbIconCampoUser.getWidth(), LbIconCampoUser.getHeight(), Image.SCALE_DEFAULT));
        LbIconCampoUser.setIcon(iconUserRedimensionado);
        this.add(LbIconCampoUser);

        LbCampoUser.setBounds(500, 253, 520, 65);
        //Image campo = new ImageIcon(this.getClass().getResource("/Recursos/campos.png")).getImage();
        //ImageIcon campoRedimensionado = new ImageIcon(campo.getScaledInstance(LbCampoUser.getWidth(), LbCampoUser.getHeight(), Image.SCALE_DEFAULT));
        LbCampoUser.setIcon(campoRedimensionado);
        this.add(LbCampoUser);

        TxtUsuario.setBounds(590, 261, 400, 50);
        TxtUsuario.setBackground(Color.white);
        TxtUsuario.setBorder(null);
        TxtUsuario.setFont(new Font("Comic Sans MS", Font.ROMAN_BASELINE, 20));
        //holder = new TextPrompt("User", TxtUsuario);
        this.add(TxtUsuario);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////        
        //Apartado de Password
        LbIconCampoPass.setBounds(515, 356, 60, 55);
        Image iconPass = new ImageIcon(this.getClass().getResource("/Recursos/lock.png")).getImage();
        ImageIcon iconPassedimensionado = new ImageIcon(iconPass.getScaledInstance(LbIconCampoPass.getWidth(), LbIconCampoPass.getHeight(), Image.SCALE_DEFAULT));
        LbIconCampoPass.setIcon(iconPassedimensionado);
        this.add(LbIconCampoPass);

        LbCampoPass.setBounds(500, 353, 520, 65);
        //Image campo = new ImageIcon(this.getClass().getResource("/Recursos/campos.png")).getImage();
        //ImageIcon campoRedimensionado = new ImageIcon(campo.getScaledInstance(LbCampoUser.getWidth(), LbCampoUser.getHeight(), Image.SCALE_DEFAULT));
        LbCampoPass.setIcon(campoRedimensionado);
        this.add(LbCampoPass);

        TxtPass.setBounds(590, 361, 400, 50);
        TxtPass.setBackground(Color.white);
        TxtPass.setBorder(null);
        TxtPass.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        //holder = new TextPrompt("Password", TxtPass);
        this.add(TxtPass);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////                
        //Botones
        BtnAceptar.setBounds(500, 453, 520, 50);
        BtnAceptar.setBorder(null);
        BtnAceptar.setBackground(new Color(12, 146, 214));
        BtnAceptar.setForeground(Color.WHITE);
        BtnAceptar.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
        BtnAceptar.addActionListener(this);
        this.add(BtnAceptar);

        BtnClose.setBounds(1130, 0, 70, 60);
        BtnClose.setBorder(null);
        BtnClose.setBackground(Color.red);
        BtnClose.setForeground(Color.white);
        BtnClose.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
        BtnClose.addActionListener(this);
        BtnClose.setFocusable(false);
        this.add(BtnClose);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(BtnClose)) {
            System.exit(0);
        }

        if (e.getSource().equals(BtnAceptar)) {
            String user = TxtUsuario.getText();
            String pass = TxtPass.getText();
            String userType = ""+CbTipoUsuario.getSelectedItem();

            if (!"".equals(user) && !"".equals(pass)) {
                if ("201800984".equals(user) && "201800984".equals(pass)) {
                    /*if ("Administrador".equals(userType)) {
                        
                    }
                    else{
                        
                    }*/
                    JOptionPane.showMessageDialog(null, "Bienvenido Admin!", "Acceso", JOptionPane.INFORMATION_MESSAGE);
                    this.setVisible(false);
                    //BDE JBde = new BDE();
                    //JBde.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "Contraseña o Usuario no Correctos!", "Acceso Denegado", JOptionPane.ERROR_MESSAGE);
                    TxtUsuario.setText("");
                    TxtPass.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Es necesario ingresar Usuario y Contraseña", "Acceso", JOptionPane.INFORMATION_MESSAGE);
            }

        }
    }
}
