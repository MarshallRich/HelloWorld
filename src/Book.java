//recommends books and gives the author and page length
public class Book {
    public String title;
    public String author;
    public int pages;
    public boolean isGood;

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }

    public void setPages(int pages){
        if (pages >= 0) {
            this.pages = pages;
        }
    }

    public int getPages(){
        return pages;
    }

    public void setGood(boolean isGood){
        this.isGood = isGood;
    }

    public boolean checkGood(){
        return isGood;
    }
}
