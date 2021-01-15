package labs_examples.objects_classes_methods.labs.LibraryContoller;

/**
 * Model class to show off the structure of an MVC using a Manga library as reference
 */

public class MangaVolume {

    //Set variables
    private String title;
    private String volume;
    private String author;

    //Methods to set and return the variables when called from the Controller
    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getVolume(){
        return volume;
    }

    public void setVolume(String volume){
        this.volume = volume;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }
}
