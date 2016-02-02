//gives some information about a movie
public class Movie {
    public String title;
    public String director;
    public int releaseYear;
    public boolean wonOscar;

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setDirector(String Director){
        this.director = director;
    }

    public String getDirector(){
        return director;
    }

    public void setReleaseYear(int releaseYear){
        if(releaseYear >= 1900) {
            this.title = title;
        }
    }

    public int getReleaseYear(){
        return releaseYear;
    }

    public void setWonOscar(Boolean wonOscar){
        this.wonOscar = wonOscar;
    }

    public boolean checkWonOscar(){
        return wonOscar;
    }
}
