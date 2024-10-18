// 12S24009 - Kezia Vania Pasaribu
// 12S24049 - Rimanda Santa Risa Panjaitan

import java.util.*;
import java.lang.Math;

public class M01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double nilaiAngka, performa, a, aB, b, bC, c, d, e;
        double kredit1;
        String nilaiHuruf, kredit;

        kredit1 = 0;
        a = 4.0;
        aB = 3.5;
        b = 3.0;
        bC = 2.5;
        c = 2.0;
        d = 1.0;
        e = 0.0;
        kredit = input.nextLine();
        if (kredit.equals("---")) {
            kredit = kredit;
        } else {
            kredit1 = Integer.parseDouble(kredit);
        }
        nilaiHuruf = input.nextLine();
        while (!nilaiHuruf.equals("---")) {
            if (nilaiHuruf.equals("A")) {
                nilaiAngka = 4.0;
            } else {
                if (nilaiHuruf.equals("AB")) {
                    nilaiAngka = 3.5;
                } else {
                    if (nilaiHuruf.equals("B")) {
                        nilaiAngka = 3.0;
                    } else {
                        if (nilaiHuruf.equals("BC")) {
                            nilaiAngka = 2.5;
                        } else {
                            if (nilaiHuruf.equals("C")) {
                                nilaiAngka = 2.0;
                            } else {
                                if (nilaiHuruf.equals("D")) {
                                    nilaiAngka = 1.0;
                                } else {
                                    if (nilaiHuruf.equals("E")) {
                                        nilaiAngka = 0.0;
                                    } else {
                                        nilaiAngka = 0.0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            performa = kredit1 * nilaiAngka;
            System.out.println(toFixed(performa,1));
            kredit = input.nextLine();
            if (kredit.equals("---")) {
                kredit = kredit;
            } else {
                kredit1 = Integer.parseDouble(kredit);
            }
            nilaiHuruf = input.nextLine();
        }
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
