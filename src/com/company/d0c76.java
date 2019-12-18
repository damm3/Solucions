package com.company;

import java.util.Scanner;

public class d0c76 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        float viewportHeight = s.nextFloat();
        float contentHeight = s.nextFloat();
        float arrowHeight = s.nextFloat();


        float viewableRatio = viewportHeight / contentHeight;
        float scrollBarArea = viewportHeight - arrowHeight * 2;
        float thumbHeight = scrollBarArea * viewableRatio;

        float scrollTrackSpace = contentHeight - viewportHeight;
        float scrollThumbSpace =  scrollBarArea - thumbHeight;
        float scrollJump = scrollTrackSpace / scrollThumbSpace;

        System.out.println(Math.round(thumbHeight));
        System.out.println(Math.round(scrollJump));
    }
}
