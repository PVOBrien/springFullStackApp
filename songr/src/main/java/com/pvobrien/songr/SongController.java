package com.pvobrien.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SongController {

    @Autowired
    AlbumRepository albumRepository;

    @Autowired
    SongRepository songRepository;

    @GetMapping("/songsalbum/{id}") // this is connected directly to
    public String goToSong(@PathVariable long id){

        Album thisAlbum = albumRepository.getOne(id);

        return "/songsalbum"; // TODO add / if not working later.
    }


    @PostMapping("/song")
    public RedirectView addSong(String title, long albumId, int trackNumber, int trackDuration) { //these need to match what is on the form!!!
        Album thisOne = albumRepository.getOne(albumId); // getOne(AlbumId)

        Song thisSong = new Song(title, trackDuration, trackNumber, thisOne); // length, trackNumber, thisOne
        songRepository.save(thisSong);

        return new RedirectView("/albums");
    }
}
