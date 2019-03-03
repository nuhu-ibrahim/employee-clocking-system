
package com.dataStructures;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;

public class PasswordHash {
    public String getSecurePassword(String passwordToHash){
        String hashedPassword = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(passwordToHash.getBytes());
            byte[] bytes = md.digest();
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<bytes.length; i++){
                sb.append(Integer.toString(bytes[i], 16).substring(1)) ;
            }
            hashedPassword = sb.toString();
        } catch (NoSuchAlgorithmException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return hashedPassword;
    }
}
