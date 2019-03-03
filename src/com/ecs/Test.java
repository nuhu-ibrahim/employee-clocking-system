
package com.ecs;

import com.dataStructures.PasswordHash;
import java.io.File;
import java.util.Date;

public class Test {
    
    public static void main(String [] args){
        String t = "2017-12-25 08:14:25.0".replaceAll("-", "/");
        Date sign_in_time = new Date(t.substring(0, t.length()-2));
        System.out.println(t.substring(0, t.length()-2));
    }
}
