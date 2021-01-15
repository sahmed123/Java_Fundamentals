package labs_examples.objects_classes_methods.labs.LibraryContoller;

/**
 * Library View to print out the details for a given volume
 */

public class LibraryView {

    public void printMangaInfo(String mangaTitle, String mangaVolume, String mangaAuthor){
        System.out.println("Manga Details");
        System.out.println("Title: " + mangaTitle);
        System.out.println("Volume: " + mangaVolume);
        System.out.println("Author: " + mangaAuthor);
        System.out.println();
    }
}
