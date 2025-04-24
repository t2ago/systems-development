/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pacote.controle;

import com.mycompany.pacote.dao.UsuarioDAO;
import com.mycompany.pacote.modelo.Usuario;
import java.util.ArrayList;
/**
 *
 * @author aluno.den
 */
public class LoginControle {
    private UsuarioDAO dao = new UsuarioDAO();
    
    public boolean autenticar(String login, String senha) {
        return dao.autenticar(login, senha);
    }
}
