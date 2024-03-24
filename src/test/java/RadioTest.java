import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetCurrentStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(5);
        int expected = 5;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationIfMore() {
        Radio rad = new Radio();
        rad.setCurrentStation(10);
        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationIfLess() {
        Radio rad = new Radio();
        rad.setCurrentStation(-1);
        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentSound() {
        Radio rad = new Radio();
        rad.setCurrentSound(99);
        int expected = 99;
        int actual = rad.getCurrentSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentSoundIfMore() {
        Radio rad = new Radio();
        rad.setCurrentSound(101);
        int expected = 0;
        int actual = rad.getCurrentSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentSoundIfLess() {
        Radio rad = new Radio();
        rad.setCurrentSound(-1);
        int expected = 0;
        int actual = rad.getCurrentSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextStationAfterMax() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.setNextStationAfterMax();
        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextStationAfterMaxIf() {
        Radio rad = new Radio();
        rad.setCurrentStation(1);
        rad.setNextStationAfterMax();
        int expected = 2;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(2);
        rad.setPrevStation();
        int expected = 1;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationIf() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.setPrevStation();
        int expected = 9;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseSound() {
        Radio rad = new Radio();
        rad.setCurrentSound(50);
        rad.setIncreaseSound();
        int expected = 51;
        int actual = rad.getCurrentSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseSoundIf() {
        Radio rad = new Radio();
        rad.setCurrentSound(100);
        rad.setIncreaseSound();
        int expected = 100;
        int actual = rad.getCurrentSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseSound() {
        Radio rad = new Radio();
        rad.setCurrentSound(57);
        rad.setDecreaseSound();
        int expected = 56;
        int actual = rad.getCurrentSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseSoundIF() {
        Radio rad = new Radio();
        rad.setCurrentSound(0);
        rad.setDecreaseSound();
        int expected = 0;
        int actual = rad.getCurrentSound();
        Assertions.assertEquals(expected, actual);
    }
}
