package com.yo1000.unreadable.hitnblow;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        int l = 4;

        try {
            l = Integer.parseInt(args[0]);
        } catch (Exception e) {}

        String r = "";
        for (int i = 0; i < l; i++) {
            String s = String.valueOf(System.nanoTime());
            r += s.substring(s.length() - 1);
        }

        System.out.println("Secret code is " + l + "-digits.");
//        System.out.println(r);
        for (int i = 0; i < l; i++) {
            System.out.print("*");
        }
        System.out.println();

        int t=0;
        while (true) {
            int re;
            String u = "";
                try {
                    System.out.print("\n> ");
                    while (((re = System.in.read()) != '\n')) {
                        if (re == '\n') break;
                        u += String.valueOf((char) re);
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                if(u.length() != l) {
                    System.out.println("(Please retry)");
                    continue;
                }                try{
                    Integer.parseInt(u);
                }catch(NumberFormatException e){
                    System.out.println("(Please retry)");
                    continue;
                }
t++;
                int h=0,b=0;
                String uu = "";
            for (int i = 0; i <u.length(); i++) {
                boolean u2 = false;
                for (int j = 0; j < uu.length(); j++) {
                    if (u.charAt(i) == uu.charAt(j))u2=true;
                }
                if(!u2)uu+=(char)u.charAt(i);
            }
                for (int i=0;i<r.length();i++){
                    for(int j=0;j<u.length();j++){
                        if (i == j){
                            h+=(r.charAt(i)==u.charAt(j))?1:0;
                        }

                    }
                    for(int j=0;j<uu.length();j++){
                        if(r.charAt(i) == uu.charAt(j)) {
                            b++;
                        }
                    }
                }

            System.out.println("turn | " + t);
            System.out.println("hit  | " + h);
            System.out.println("blow | " + (b-h));

            if(h==l) {
                System.out.println("\nCongrats!");
                return;
            }
        }
    }
}