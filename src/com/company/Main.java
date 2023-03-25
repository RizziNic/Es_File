package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void buffer(String s1, String s2, String sout) throws IOException {
        try{
            BufferedReader in1  = new BufferedReader(new FileReader(s1));
            BufferedReader in2 = new BufferedReader(new FileReader(s2));
            PrintWriter out = new PrintWriter(new FileWriter(sout));

            String lineA = in1.readLine();
            String lineB = in2.readLine();

            while (lineA != null || lineB != null) {
                if (lineA != null) {
                    out.println(lineA);
                    lineA = in1.readLine();
                }
                if (lineB != null) {
                    out.println(lineB);
                    lineB = in2.readLine();
                }
            }
            in1.close();
            in2.close();
            out.close();
        } catch (Exception e){
            System.out.println("Uno dei due file non esiste");
        }

    }
    public static void main(String[] args) throws IOException {

        String s1;
        String s2;
        String sout;

        buffer("A.txt", "B.txt", "output.txt");

        File d = new File("C:/Users//nicolo.rizzi//Desktop//Es_File"); //path del progetto IntellJ
        System.out.println("La directory esiste: " + d.exists() );
        String a[] = d.list(); //creo un array di stringhe e lo riempio con la lista dei files presenti nella directory
        System.out.println("Lista dei file:");
        int j = 0;
        for (int i=0;i<a.length;i++){
            j = j + 1;
            System.out.println(j + ". " + a[i]);
        }

        Scanner input = new Scanner(System.in);
        s1 = input.nextLine();
        s2 = input.nextLine();

        buffer(s1, s2, "output.txt");


    }
}