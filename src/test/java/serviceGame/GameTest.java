package serviceGame;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {

    @Test
    public void winnersNamesCase1() {
        String[] players = {"Kolya 7", "Dasha 9", "Ivan 3"};

        String[] actual = Game.winnersNames(players, false, 7);
        String[] expected = {"Kolya", "Ivan"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void winnersNamesCase2() {
        String[] players = {"Kolya 7", "Dasha 9", "Ivan 3"};

        String[] actual = Game.winnersNames(players, true, 5);
        String[] expected = {"Kolya", "Dasha", "Ivan"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLoseCase1() {
        int[] arr = {5, 0, 9, 7, 0, 6};

        int actual = Game.getCountOutOfTheGame(arr, false, 4);
        int expected = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindLoseCase2() {
        int[] arr = {5, 0, 9, 7, 0, 6};

        int actual = Game.getCountOutOfTheGame(arr, true, 6);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindSpeedLoseCase1() {
        int[] arr = {5, 0, 9, 7, 0, 6};

        int[] actual = Game.getSpeedOutOfTheGame(arr, false, 2);
        int[] expected = {5, 9, 7, 6};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindSpeedLoseCase2() {
        int[] arr = {5, 0, 9, 7, 0, 6};

        int[] actual = Game.getSpeedOutOfTheGame(arr, true, 6);
        int[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldFindSpeedWinCase1() {
        int[] arr = {5, 0, 9, 7, 0, 6};

        int[] actual = Game.getSpeedSurvivors(arr, false, 5);
        int[] expected = {5, 0, 0};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindSpeedWinCase2() {
        int[] arr = {5, 0, 9, 7, 0, 6};

        int[] actual = Game.getSpeedSurvivors(arr, true, 0);
        int[] expected = {5, 0, 9, 7, 0, 6};

        Assertions.assertArrayEquals(expected, actual);
    }
}
