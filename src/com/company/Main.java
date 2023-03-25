package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void buffer(String s1, String s2, String sout) throws IOException{
        BufferedReader in1  = new BufferedReader(new FileReader(s1));
        BufferedReader in2 = new BufferedReader(new FileReader(s2));
        PrintWriter out = new PrintWriter(new FileWriter(sout));



        while (s1 != null || s2 != null) {
            if (s1 != null) {
                out.println(s1);
                s1 = in1.readLine();
            }
            if (s2 != null) {
                out.println(s2);
                s2 = in2.readLine();
            }
        }
        in1.close();
        in2.close();
        out.close();
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