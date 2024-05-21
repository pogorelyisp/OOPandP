package ru.netology.radio;

public class Radio {

    private int currentStation;    // установленная станция
    private int currentVolume;     // установленная громкость

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {         // Установка новой станции
        currentStation = newCurrentStation;

        if (currentStation < 0) {
            currentStation = 0;
        }
        if (currentStation > 9) {
            currentStation = 9;
        }

    }

    public void setNextStation() {
        currentStation++;
        if (currentStation > 9) {
            currentStation = 0;
        }

    }

    public void setPrevStation() {
        currentStation--;
        if (currentStation < 0) {
            currentStation = 9;
        }

    }

    public void setCurrentVolume(int newCurrentVolume) {                 // Установка новой громкости

        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setNextVolume() {
        if (currentVolume >= 100) {
            return;
        }

        currentVolume++;
    }

    public void setPrevVolume() {
        if (currentVolume <= 0) {
            return;
        }
        currentVolume--;
    }
}

