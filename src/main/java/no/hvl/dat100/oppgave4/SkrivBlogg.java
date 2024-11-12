package no.hvl.dat100.oppgave4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import no.hvl.dat100.oppgave3.Blogg;

public class SkrivBlogg {

    public static boolean skriv(Blogg samling, String mappe, String filnavn) {
        try {
            File file = new File(mappe, filnavn);
            FileWriter writer = new FileWriter(file);
            writer.write(samling.toString());
            writer.close();
            return true;
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }
}