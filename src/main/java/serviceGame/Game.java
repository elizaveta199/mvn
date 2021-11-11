package serviceGame;
//import package tests.*;

import java.util.Arrays;

public class Game {

    static boolean isGreenLight = false;
    static int MAX_SPEED = 7;

    public static String[] winnersNames(String[] players) {
        int size = 0;
        if (!isGreenLight) {
            for (int i = 0, j = 1, k = 0; i < players.length; i++) {
                String winners = players[i];
                String[] parts = winners.split(" ");
                int speed = Integer.parseInt(parts[j]);
                if (speed <= MAX_SPEED) {
                    size = size + 1;
                    System.out.println(size);
                }
            }
            String[] names = new String[size];
            for (int i = 0, j = 1, k = 0; i < players.length; i++) {
                String winners = players[i];
                String[] parts = winners.split(" ");
                int speed = Integer.parseInt(parts[j]);
                if (speed <= MAX_SPEED) {
                    names[k] = parts[j - 1];
                    k = k + 1;
                }
            }
            System.out.println(Arrays.toString(names));
            return names;
        } else {
            size = players.length;
            String[] names = new String[size];
            for (int i = 0, j = 1, k = 0; i < players.length; i++) {
                String winners = players[i];
                String[] parts = winners.split(" ");
                names[k] = parts[j - 1];
                k = k + 1;
            }
            return names;
        }
    }

    public static int firstMethod(int[] game) {
        int x = 0;
        if (!isGreenLight) {
            for (int speed : game) {
                if (speed > MAX_SPEED) {
                    x++;
                }
            }
        } else {
            x = 0;
        }
        return x;
    }

    public static int[] secondMethod(int[] game) {
        int x = 0;
        for (int i = 0; i < game.length; i++) {
            if (game[i] > MAX_SPEED) {
                x++;
            }
        }
        int[] speed = new int[x];
        int[] speed2 = {};
        if (!isGreenLight) {
            for (int i = 0, p = 0; i < game.length; i++) {
                if (game[i] > MAX_SPEED) {
                    speed[p] = game[i];
                    p = p + 1;
                }
            }
            return speed;
        } else {
            System.out.println("Выбывших нет");
        }
        return speed2;
    }

    public static int[] thirdMethod(int[] game) {
        int x = 0;
        for (int i = 0; i < game.length; i++) {
            if (game[i] <= MAX_SPEED) {
                x++;
            }
        }

        if (!isGreenLight) {
            int[] speed = new int[x];
            for (int i = 0, p = 0; i < game.length; i++) {
                if (game[i] <= MAX_SPEED) {
                    speed[p] = game[i];
                    p = p + 1;
                }
            }
            return speed;
        } else return game;
    }

}