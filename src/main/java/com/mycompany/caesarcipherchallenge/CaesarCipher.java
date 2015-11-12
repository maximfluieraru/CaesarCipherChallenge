/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.caesarcipherchallenge;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Maxim
 */
public class CaesarCipher {

    private int var;

    private final String pat_p = "\\p{Punct}";
    private final String pat_s = "\\s";

    private Pattern pat1 = Pattern.compile(pat_p);
    private Pattern pat2 = Pattern.compile(pat_s);

    public CaesarCipher(int var) {

        this.var = var;
    }

    public String encipher(String value) {

        char tab[] = value.toCharArray();
        String str = "";

        for (char c : tab) {

            if (pat1.matcher((c + "")).matches() || pat2.matcher((c + "")).matches()) {
                
                str += c;
                
            } else {
                
                c = (char) (c + var);

                str += c;
            }

        }
        return str;
    }
}
