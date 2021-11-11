package serviceGame;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {
    boolean isGreenLight = false;
    @Test
    public void winnersNames() {
        String[] players = {"Kolya 7", "Dasha 9", "Ivan 3"};
        String[] actual = Game.winnersNames(players);
        if (!isGreenLight) {
            String[] expected = {"Kolya", "Ivan"};
            Assertions.assertArrayEquals(expected, actual);
        } else {
            String[] expected = {"Kolya", "Dasha", "Ivan"};
            Assertions.assertArrayEquals(expected, actual);
        }
    }

    @Test
    public void shouldFindLose() {

        int[] arr = {5, 0, 9, 7, 0, 6};
        int actual = Game.firstMethod(arr);
        int expected;
        if (!isGreenLight) {
            expected = 1;
        } else {
            expected = 0;
        }
        Assertions.assertEquals(expected, actual, "MAX_SPEED=7");
    }

    @Test
    public void shouldFindSpeedLoseIfNoGreenLight() {
        int[] arr = {5, 0, 9, 7, 0, 6};
        int[] actual = Game.secondMethod(arr);
        int[] expected = {9};
        Assertions.assertArrayEquals(expected, actual, "Если isGreenLight=false, MAX_SPEED=7");
    }


    @Test
    public void shouldFindSpeedWinIfNoGreenLight() {
        int[] arr = {5, 0, 9, 7, 0, 6};
        int[] actual = Game.thirdMethod(arr);
        int[] expected = {5, 0, 7, 0, 6};
        Assertions.assertArrayEquals(expected, actual, "Если isGreenLight=false, MAX_SPEED=7");
    }
}




