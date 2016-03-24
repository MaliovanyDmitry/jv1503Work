
package com.mycompany.stringtask;

import com.mycompany.stringtask.Session.SQLQuerry;

public class App {

    public static void main(String[] args) {

        Session s = new Session();
        SQLQuerry sql = s.new SQLQuerry();

        sql.executeQuerry();
        System.out.println(Session.res);
    }
    
}
