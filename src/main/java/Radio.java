public class Radio {
    private int currentStation;
    private int volume;
    private int maxStation = 10;
    private int minStation = 0;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public Radio() {
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation-1) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void next() {
        if (currentStation == maxStation-1) {
            currentStation = minStation;
        } else {
            currentStation++;
        }
    }

    public void prev() {
        if (currentStation == minStation) {
            currentStation = maxStation-1;
        } else {
            currentStation--;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < minVolume) {
            return;
        }
        if (newVolume > maxVolume) {
            return;
        }
        volume = newVolume;
    }

    public void upVolume() {
        if (volume < maxVolume) {
            volume++;
        }
    }

    public void downVolume() {
        if (volume > minVolume) {
            volume--;
        }
    }
}
