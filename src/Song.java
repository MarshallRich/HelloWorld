//gives some info about a particular song

public class Song {
    public String title;
    public String artist;
    public int wordCount;
    public double trackLength;
    public boolean isSingle;

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setArtist(String artist){
        this.artist = artist;
    }

    public String getArtist(){
        return artist;
    }

    public void setWordCount(int wordCount){
        this.wordCount = wordCount;
    }

    public int getWordCount(){
        return wordCount;
    }

    public void setTrackLength(double trackLength) {
        if (trackLength >= 0) {
            this.trackLength = trackLength;
        }
    }

    public double getTrackLength(){
        return trackLength;
    }

    public void setSingle(boolean isSingle){
        this.isSingle = isSingle;
    }

    public boolean checkSingle(){
        return isSingle;
    }
}
