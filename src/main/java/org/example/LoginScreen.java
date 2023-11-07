package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Classe para a autenticação, irá simular uma base de dados
 */
public class LoginScreen {
    private Map<String, String> userDatabase;

    public LoginScreen() {
        userDatabase = new HashMap<>();
        userDatabase.put("john", "password123");
        userDatabase.put("alice", "securepass");
    }

    /**
     * Este trecho tentará autenticar o usuário baseado no usuário e senha do banco de dados.
     *
     * @param username o username do usuário tentando logar
     * @param password a senha digitada pelo usuário
     * @return retornara true se autenticação for bem sucedide, false caso contrário.
     */
    public boolean login(String username, String password) {

        if (userDatabase.containsKey(username)) {
            String storedPassword = userDatabase.get(username);
            if (storedPassword.equals(password)) {
                return true; //Autenticação bem sucedida
            }
        }
        return false; //Autenticação falha
    }

    /**
     * Adiciona um novo usuário para a base de dados. Usado apenas para teste.
     * @param username o username do novo usuário
     * @param password a senha do novo usuário
     */
    public void addUser(String username, String password) {
        userDatabase.put(username, password);
    }
}
