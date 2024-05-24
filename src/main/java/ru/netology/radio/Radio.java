package ru.netology.radio;

public class Radio {

    //private int currentStation = 9;    // установленная станция
    private int currentVolume;     // установленная громкость
    private int minStation = 0;    // минимальная станция по умолчанию
    private int maxStation = 9;    // максимальная станция по умолчанию
    private int currentStation = maxStation; // текущая станция равна макимальной по умолчанию

    public Radio (int minStation, int maxStation) {
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.currentStation = maxStation;

    }

    public Radio (int size){
        maxStation = minStation + size;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {         // Установка новой станции
        currentStation = newCurrentStation;

        if (currentStation < minStation) {
            currentStation = minStation;
        }
        if (currentStation > maxStation) {
            currentStation = maxStation;
        }

    }

    public void setNextStation() {                        // установка новой станции вверх
        currentStation++;
        if (currentStation > maxStation) {
            currentStation = minStation;
        }

    }

    public void setPrevStation() {                         // установка новой станции вниз
        currentStation--;
        if (currentStation < minStation) {
            currentStation = maxStation;
        }

    }

    public void setCurrentVolume(int newCurrentVolume) {                 // Установка новой громкости

        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setNextVolume() {                   // установка новой громкости вверх
        if (currentVolume >= 100) {
            return;
        }

        currentVolume++;
    }

    public void setPrevVolume() {                    // установка новой громкости вниз
        if (currentVolume <= 0) {
            return;
        }
        currentVolume--;
    }
}

