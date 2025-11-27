/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problematica2.service;

import com.mycompany.problematica2.model.Usuario;
import com.mycompany.problematica2.tools.Conection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author evely
 */
public class UsuarioService {
    
    
    
    
    public Usuario getUserByCorreoAndPassword(String correo,String password){
       Usuario us=null;
        try{
            us=new Usuario();
           Connection con=Conection.getConnection();
           String sql="select idusuario ,password,rol,correo from usuario where correo='"+correo+"' and password='"+password+"'";
           PreparedStatement ps=con.prepareStatement(sql);
           ResultSet rs=ps.executeQuery();
           while(rs.next()){
               us.setIdusuario(rs.getInt("idusuario"));
               us.setCorreo(rs.getString("correo"));
               us.setRol(rs.getString("rol"));
               us.setPassword(rs.getString("password"));
           }
       }catch(SQLException e){
           System.out.println(e.getMessage());
       }
        return us;
    }
}
