package com.company;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in1 = new BufferedReader(new FileReader("A.txt"));
        BufferedReader in2 = new BufferedReader(new FileReader("B.txt"));
        PrintWriter out = new PrintWriter(new FileWriter("output.txt"));

        String s1 = in1.readLine();
        String s2 = in2.readLine();

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
}