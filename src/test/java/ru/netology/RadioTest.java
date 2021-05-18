package ru.netology;

import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/dataForNextRS.csv")
    void nextRadioStation(boolean on, int currentRadioStation, int expected) {
        Radio radio = new Radio();
        radio.setOn(on);
        radio.setCurrentRadioStation(currentRadioStation);
        radio.nextRadioStation();

        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataForPrevRS.csv")
    void prevRadioStation(boolean on, int currentRadioStation, int expected) {
        Radio radio = new Radio();
        radio.setOn(on);
        radio.setCurrentRadioStation(currentRadioStation);
        radio.prevRadioStation();

        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataForInputRS.csv")
    void inputRadioStation(boolean on, int currentRadioStation, int expected) {
        Radio radio = new Radio();
        radio.setOn(on);
        radio.setCurrentRadioStation(currentRadioStation);

        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataForIncSV.csv")
    void increaseSoundVolume(boolean on, int currentSoundVolume, int expected) {
        Radio radio = new Radio();
        radio.setOn(on);
        radio.setCurrentSoundVolume(currentSoundVolume);
        radio.increaseSoundVolume();

        assertEquals(expected, radio.getCurrentSoundVolume());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataForDecSV.csv")
    void decreaseSoundVolume(boolean on, int currentSoundVolume, int expected) {
        Radio radio = new Radio();
        radio.setOn(on);
        radio.setCurrentSoundVolume(currentSoundVolume);
        radio.decreaseSoundVolume();

        assertEquals(expected, radio.getCurrentSoundVolume());
    }
}