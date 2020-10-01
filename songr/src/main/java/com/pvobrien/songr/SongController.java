package com.pvobrien.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SongController {

    @Autowired
    AlbumRepository albumRepository;

    @Autowired
    SongRepository songRepository;

    @PostMapping("/song")
    public RedirectView addSong(String title, long AlbumId) {
        Album thisOne = albumRepository.getOne(AlbumId); // getOne(AlbumId)
        Song thisSong = new Song(title, 10, 3, thisOne); // length, trackNumber, thisOne

        return new RedirectView("/albums");
    }
}
