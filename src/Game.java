//gives information about a game in question
public class Game {
    public String name;
    public int numberOfTimesBeaten;
    public boolean hasSequel;

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setNumberOfTimesBeaten(int numberOfTimesBeaten) {
        if (numberOfTimesBeaten >= 0) {
            this.numberOfTimesBeaten = numberOfTimesBeaten;
        }
    }

    public int getNumberOfTimesBeaten() {
        return numberOfTimesBeaten;
    }

    public void setHasSequel(boolean hasSequel){
        this.hasSequel = hasSequel;
    }

    public boolean checkHasSequel(){
        return hasSequel;
    }
}
