package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void TestNumberOfStationDefault() {
        Radio rad = new Radio();

        Assertions.assertEquals(0, rad.getMinStation());
        Assertions.assertEquals(9, rad.getMaxStation());
        Assertions.assertEquals(10, rad.getNumberOfStation());
    }

    @Test
    public void TestNumberOfStation5() {
        Radio rad = new Radio(5);

        Assertions.assertEquals(0, rad.getMinStation());
        Assertions.assertEquals(4, rad.getMaxStation());
        Assertions.assertEquals(5, rad.getNumberOfStation());
    }

    @Test
    public void shouldSetStationNumberOfStationDefault() {
        Radio rad = new Radio();

        rad.setCurrentStation(9);

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMaxNumberOfStationDefault() {
        Radio rad = new Radio();

        rad.setCurrentStation(10);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMaxNumberOfStation5() {
        Radio rad = new Radio(5);

        rad.setCurrentStation(6);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMin() {
        Radio rad = new Radio();

        rad.setCurrentStation(-1);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationNumberOfStationDefault() {
        Radio rad = new Radio();
        rad.setCurrentStation(8);

        rad.nextStation();

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationMaxNumberOfStationDefault() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);

        rad.nextStation();

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationMaxNumberOfStation5() {
        Radio rad = new Radio(5);
        rad.setCurrentStation(4);

        rad.nextStation();

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationNumberOfStationDefault() {
        Radio rad = new Radio();
        rad.setCurrentStation(8);

        rad.prevStation();

        int expected = 7;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationMinNumberOfStationDefault() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);

        rad.prevStation();

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationMinNumberOfStation5() {
        Radio rad = new Radio(5);
        rad.setCurrentStation(0);

        rad.prevStation();

        int expected = 4;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(9);

        rad.increaseVolume();

        int expected = 10;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);

        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);

        rad.decreaseVolume();

        int expected = 9;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeAboveMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(99);

        int expected = 99;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(101);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMin() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
