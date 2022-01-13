package pl.emil;

import pl.emil.File.imageFile.GIFImageFile;
import pl.emil.File.imageFile.JPGImageFile;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        GIFImageFile jpgImageFile = new JPGImageFile("plik.jpg", 100, 100);
        GIFImageFile gifImageFile = new GIFImageFile("plik.gif", 200);

        List<GIFImageFile> files = new ArrayList<>();
        files.add(jpgImageFile);
        files.add(gifImageFile);

        for(GIFImageFile file : files) {
            if (files instanceof JPGImageFile){
                System.out.println("To plik JPG");
            } else if (files instanceof GIFImageFile) {
                System.out.println("To plik GIF");
            }
        }
        System.out.println(jpgImageFile instanceof JPGImageFile);


//        GIFImageFile gif1 = new GIFImageFile("nazwa1.gif", 180);
//        JPGImageFile jpg1 = new JPGImageFile("nazwa1.jpg", 200, 80);
//
//        MP3MusicFile mp3file = new MP3MusicFile("Plik.mp3", 400, "marilyn Manson", "broken", 100);
//
//        HDDdrive drive = new HDDdrive();
//        drive.addFile(gif1);
//        drive.addFile(jpg1);
//        drive.addFile(mp3file);
//
//        drive.listFiles();
//        drive.findFile("plik.mp3");
//        System.out.println(mp3file.getSize());


    }
}
