import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public  void countOfStationNotSetted() {
        Radio radio = new Radio();

        Assertions.assertEquals(10, radio.getCountStation());
        Assertions.assertEquals(9, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getMinStation());
    }
    @Test public void countOf15Station() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(15);
        Assertions.assertEquals(15,radio.getCurrentStation());
    }

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);

        int expected = 7;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public  void shouldSetStationHighLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public  void shouldSetStationLowLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnToZeroIfNext() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnToNineIfPrev() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.next();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.prev();

        int expected = 4;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public  void setCountOfStation() {
        Radio radio = new Radio(35);

        Assertions.assertEquals(35, radio.getCountStation());
        Assertions.assertEquals(34, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getMinStation());
    }

    @Test
    public void shouldSetCurrentStation() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(15);

        int expected = 15;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnToMinIfAboveMax() {
        Radio radio = new Radio(30);

        radio.setCurrentStation(30);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnToMaxIfBelowMin() {
        Radio radio = new Radio(30);

        radio.setCurrentStation(-1);

        int expected = 29;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnToMinIfAboveMaxNext() {
        Radio radio = new Radio(40);

        radio.setCurrentStation(39);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnToMaxIfBelowMinPrev() {
        Radio radio = new Radio(40);

        radio.setCurrentStation(0);
        radio.prev();

        int expected = 39;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchIfNext() {
        Radio radio = new Radio(15);

        radio.setCurrentStation(11);
        radio.next();

        int expected = 12;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchIfPrev() {
        Radio radio = new Radio(15);

        radio.setCurrentStation(11);
        radio.prev();

        int expected = 10;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public  void shouldSetSoundLevel() {
        Radio radio = new Radio();

        radio.setCurrentSound(13);

        int expected = 13;
        int actual = radio.getCurrentSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public  void shouldSetHighSoundLimit() {
        Radio radio = new Radio();

        radio.setCurrentSound(101);

        int expected = 100;
        int actual = radio.getCurrentSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public  void shouldSetLowSoundLimit() {
        Radio radio = new Radio();

        radio.setCurrentSound(-1);

        int expected = 0;
        int actual = radio.getCurrentSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public  void shouldNotIncreaseSoundAboveHighLimit() {
        Radio radio = new Radio();

        radio.setCurrentSound(101);
        radio.increaseSound();

        int expected = 100;
        int actual = radio.getCurrentSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public  void shouldNotDecreaseSoundUnderLowLimit() {
        Radio radio = new Radio();

        radio.setCurrentSound(-1);
        radio.decreaseSound();

        int expected = 0;
        int actual = radio.getCurrentSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public  void shouldIncreaseSoundLevel() {
        Radio radio = new Radio();

        radio.setCurrentSound(70);
        radio.increaseSound();

        int expected = 71;
        int actual = radio.getCurrentSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public  void shouldDecreaseSoundLevel() {
        Radio radio = new Radio();

        radio.setCurrentSound(50);
        radio.decreaseSound();

        int expected = 49;
        int actual = radio.getCurrentSound();

        Assertions.assertEquals(expected, actual);
    }
}
