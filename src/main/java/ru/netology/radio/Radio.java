package ru.netology.radio;

public class Radio {

    private int minStation = 0;
    private int maxStation = 9;
    private int numberOfStation = 10;
    private int currentStation;

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getNumberOfStation() {
        return numberOfStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public Radio() {

    }

    public Radio(int numberOfStation) {
        this.numberOfStation = numberOfStation;
        this.maxStation = numberOfStation - 1;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxStation) {
            return;
        }
        if (newCurrentStation < minStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else currentStation = minStation;
    }

    public void prevStation() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        } else currentStation = maxStation;
    }

    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}
