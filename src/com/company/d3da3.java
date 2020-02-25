package com.company;

import java.util.Scanner;

class Player {
    int points;

    Player(int points) {
        this.points = points;
    }
}

class Game {
    Player player1, player2;

    Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
}

public class d3da3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Game game = new Game(new Player(0), new Player(0));

        int numRondas = scanner.nextInt();

        for (int i = 0; i < numRondas; i++) {
            String ronda = scanner.next();
            if(ronda.equals("@%") || ronda.equals("#@") || ronda.equals("%#")){
                game.player1.points++;
            } else if(ronda.equals("%@") || ronda.equals("@#") || ronda.equals("#%")){
                game.player2.points++;
            }
        }

        if(game.player1.points > game.player2.points){
            System.out.println("PLAYER 1 WINS");
        } else if(game.player2.points > game.player1.points){
            System.out.println("PLAYER 2 WINS");
        } else {
            System.out.println("TIE");
        }
    }
}

/*
4 ## @# %# %@

6 #@ %@ %# #% %@ @%

6 @% @% %# %# #% #@
 */
