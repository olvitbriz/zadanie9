package ru.netology;

public class Radio {

    private int minNumberOfStation = 0;
    private int maxNumberOfStation = 9;
    private int currentStation = minNumberOfStation;
    private int currentVolume;

    public Radio(int numberOfStations) {
        this.maxNumberOfStation = numberOfStations - 1;
    }

    public Radio() {
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxNumberOfStation) {
            return;
        }
        if (currentStation < minNumberOfStation) {
            return;
        }
        this.currentStation = currentStation;

    }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;

    }


    public void nextStation() {
        if (currentStation != maxNumberOfStation) {
            currentStation++;
        } else {
            currentStation = minNumberOfStation;
        }
    }

    public void prevStation() {
        if (currentStation != minNumberOfStation) {
            currentStation--;
        } else {
            currentStation = maxNumberOfStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume != 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }
    }

    public void decreaseVolume() {
        if (currentVolume != 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }
}