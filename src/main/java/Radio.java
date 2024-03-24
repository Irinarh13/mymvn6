public class Radio {
    private int currentStation;
    private int currentSound;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentSound() {
        return currentSound;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentSound(int newCurrentSound) {
        if (newCurrentSound < 0) {
            return;
        }
        if (newCurrentSound > 100) {
            return;
        }
        currentSound = newCurrentSound;
    }

    public void setNextStationAfterMax() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void setPrevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = 9;
        }
    }

    public void setIncreaseSound() {
        if (currentSound < 100) {
            currentSound = currentSound + 1;
        } else {
            currentSound = 100;
        }
    }

    public void setDecreaseSound() {
        if (currentSound > 0) {
            currentSound = currentSound - 1;
        } else {
            currentSound = 0;
        }
    }
}

