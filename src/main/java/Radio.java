public class Radio {

    private int countStation;
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation = minStation;
    private int maxSound = 100;
    private int minSound = 0;
    private int currentSound = minSound;

    public Radio(int count) {
        countStation = minStation + count;
        maxStation = countStation - 1;
        minStation = 0;
    }

    public Radio() {
        countStation = 10;
    }

    public int getCountStation() {
        return countStation;
    }
    public int getMaxStation() {
        return maxStation;
    }
    public int getMinStation() {
        return minStation;
    }
    public int getCurrentStation() {
        return currentStation;
    }
    public int getCurrentSound() {
        return currentSound;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxStation) {
            setCurrentStation(minStation);
            return;
        }
        if (newCurrentStation < minStation) {
            setCurrentStation(maxStation);
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentSound(int newCurrentSound) {
        if (newCurrentSound < minSound) {
            setCurrentSound(minSound);
            return;
        }
        if (newCurrentSound > maxSound) {
            setCurrentSound(maxSound);
            return;
        }
        currentSound = newCurrentSound;
    }

    public void next() {
        int nextStation = currentStation + 1;
        if (nextStation < maxStation) {
            setCurrentStation(nextStation);
        }
        if (nextStation > maxStation) {
            setCurrentStation(minStation);
        }
        return;
    }

    public void prev() {
        int prevStation = currentStation - 1;
        if (prevStation > minStation) {
            setCurrentStation(prevStation);
        }
        if (prevStation < minStation) {
            setCurrentStation(maxStation);
        }
        return;
    }

    public void increaseSound() {
        int nextSound = currentSound + 1;
        if (currentSound == maxSound) {
            setCurrentSound(maxSound);
        }
        if (currentSound < maxSound) {
            setCurrentSound(nextSound);
        }
        return;
    }

    public void decreaseSound() {
        int prevSound = currentSound - 1;
        if (currentSound <= minSound) {
            setCurrentSound(minSound);
        }
        if (currentSound > minSound) {
            setCurrentSound(prevSound);
        }
        return;
    }

}
