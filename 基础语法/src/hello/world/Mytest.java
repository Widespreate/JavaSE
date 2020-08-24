package hello.world;

import 猜拳游戏.Game;

import java.util.Scanner;

public class Mytest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        Game game = new Game();
        game.start();
    }
}
