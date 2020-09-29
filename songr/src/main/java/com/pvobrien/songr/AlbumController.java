package com.pvobrien.songr;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class AlbumController {

    @GetMapping("/albums")
    public String showAlbums(Model m){
        ArrayList<Album> albums = new ArrayList<>();
        albums.add( new Album(
                "Duel of the Fates",
                "John Williams",
                1,
                254,
                "https://upload.wikimedia.org/wikipedia/en/c/cc/John_Williams_%E2%80%93_Duel_Of_The_Fates_%28Promotional_Single_Artwork%29.jpg"
        ));
        albums.add(new Album(
                "Baba Yetu",
                "Christopher Tin",
                1,
                210,
                "https://m.media-amazon.com/images/I/91yAHEkB-fL._SS500_.jpg"
        ));
        albums.add(new Album(
                "Into the West",
                "Annie Lennox",
                1,
                275,
                "https://vignette.wikia.nocookie.net/lotr/images/e/ed/Intothewest.jpg/revision/latest?cb=20150330155642"
        ));
        m.addAttribute("albumsToShow", albums);
        return "albumsPageToShow";
    }
}
