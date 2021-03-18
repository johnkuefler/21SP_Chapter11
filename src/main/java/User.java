/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class User {

    private String email;

    public User(String email) throws Exception {
        setEmail(email);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws Exception {
        if (email.contains("@") & email.contains(".")) {
            this.email = email;
        } else {
            throw new Exception("Invalid email format!");
        }
    }
}
