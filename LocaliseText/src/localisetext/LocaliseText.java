/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localisetext;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author Kedar
 */
public class LocaliseText {

    public static void main(String[] args) {
        Locale ruLocale=new Locale("ru","RU");
        Locale deLocale=new Locale("de","DE");
        Locale frLocale=new Locale("fr","FR");
        
        //it will fetch messages properties file for russian language
        //messages_ru_RU.properties
        ResourceBundle ruResBundle=ResourceBundle.getBundle("messages",ruLocale);
        ResourceBundle deResBundle=ResourceBundle.getBundle("messages",deLocale);
        ResourceBundle frResBundle=ResourceBundle.getBundle("messages",frLocale);
//        System.out.println("Greeting in Russian "+ruResBundle.getString("msg"));
//        System.out.println("Greeting in German "+deResBundle.getString("msg"));
        System.out.println("Greeting in French "+frResBundle.getString("msg"));
    }
    
}
