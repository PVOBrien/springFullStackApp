package com.pvobrien.songr;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;

@Controller
public class AlbumController {
    @Autowired // connecting to and creating necessary stuff in the db
    public AlbumRepository albumRepository;

    @PostMapping("/albums")
    public RedirectView addAlbum(String title, String artist, int songCount, int length, String imageURL){
        Album newAlbum = new Album(
                title,
                artist,
                songCount,
                length,
                imageURL
        );

        albumRepository.save(newAlbum);
        return new RedirectView("/albums");
    }

    @GetMapping("/albums")
    public String showAlbums(Model m){
        ArrayList<Album> albums = new ArrayList<>();
        albums.add( new Album(
                "Star Wars: The Phantom Menace",
                "John Williams",
                17,
                4_463,
                "https://upload.wikimedia.org/wikipedia/en/c/cc/John_Williams_%E2%80%93_Duel_Of_The_Fates_%28Promotional_Single_Artwork%29.jpg"
        ));
        albums.add(new Album(
                "Calling All Dawns",
                "Christopher Tin",
                12,
                2_756,
                "https://m.media-amazon.com/images/I/91yAHEkB-fL._SS500_.jpg"
        ));
        albums.add(new Album(
                "The Lord of the Rings: Return of the King",
                "Howard Shore",
                19,
                4325,
                "https://images-na.ssl-images-amazon.com/images/I/91%2Bni21hctL._SY355_.jpg"
        ));
        m.addAttribute("albumsToShow", albums);
        return "albumsPageToShow";
    }
}
