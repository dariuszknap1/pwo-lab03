/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo;

/**
 *
 * @author dariusz
 */

import java.math.BigDecimal;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Zadanie2 {

    public static final int FROM = 0, TO = 100;
    public static final String FILE_NAME = "lucseq100.txt";

    public static void zadanie2() {
        System.out.println("Ciag Lucasa");
        boolean ok = SequenceTools.writeToFile(
                new LucasGenerator(), FROM, TO, FILE_NAME,
                LucasGenerator.l_1, LucasGenerator.l_2);
        if (ok) {
            System.out.println("Wynik zapisany do pliku: " + FILE_NAME);
        } else {
            System.out.println("Błąd");
        }
    }
}
