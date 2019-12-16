package com.company;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Scanner;

public class b1c26 {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1001; i < 1001+n; i++) {
            int pass = ((i << 29 ^ i << 17) >>> 1);
            String encrypted = Base64.getEncoder().encodeToString(MessageDigest.getInstance("md5").digest((String.valueOf(pass)).getBytes()));

            System.out.println("user"+i+":$1$"+encrypted+":"+i+":1000"+":Usuari " + i + ":/home/user"+i+":/bin/bash");
        }
    }
}
