package labs_examples.objects_classes_methods.labs.LibraryContoller;

/**
 *  Library Controller for Manga Library MVC. This is the controller that will send commands to make updates
 *  and adjustments as necessary in MangaVolume and then retrieve the output from LibraryView
 *  
 */

public class LibraryController {

    private MangaVolume volume;
    private LibraryView library;

    public static void main(String[] args){

        MangaVolume myVolume = grabInitialInfo();
        LibraryView myLibrary = new LibraryView();

        LibraryController myController = new LibraryController(myVolume,myLibrary);

        myController.updateLibraryView();

        myController.setMangaTitle("One Piece");
        myController.setMangaAuthor("Eichiro Oda");
        myController.setMangaVolume("100");

        myController.updateLibraryView();

        myController.setMangaTitle("Dragon Ball");
        myController.setMangaAuthor("Akira Toriyama");
        myController.setMangaVolume("16");

        myController.updateLibraryView();
    }

    public LibraryController(MangaVolume volume, LibraryView library){
        this.volume = volume;
        this.library = library;
    }

    public void setMangaTitle(String seriesTitle){
        volume.setTitle(seriesTitle);
    }

    public String getMangaTitle(){
        return volume.getTitle();
    }

    public void setMangaVolume(String volumeNumber){
        volume.setVolume(volumeNumber);
    }

    public String getMangaVolume(){
        return volume.getVolume();
    }

    public void setMangaAuthor(String authorName){
        volume.setAuthor(authorName);
    }

    public String getMangaAuthor(){
        return volume.getAuthor();
    }

    public void updateLibraryView(){
        library.printMangaInfo(volume.getTitle(),volume.getVolume(),volume.getAuthor());
    }

    private static MangaVolume grabInitialInfo(){
        MangaVolume myVolume = new MangaVolume();
        myVolume.setTitle("Demon Slayer");
        myVolume.setVolume("17");
        myVolume.setAuthor("Koyoharu Gotouge");
        return myVolume;
    }
}
