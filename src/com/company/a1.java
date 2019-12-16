package com.company;

import java.util.UUID;

public class a1 {

    public static void main(String[] args) {
        String uid;
        while((uid = UUID.randomUUID().toString()).charAt(0) < 58);
        System.out.println(uid.substring(0,5));
    }
}
