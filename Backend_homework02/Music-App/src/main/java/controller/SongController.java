package controller;

import model.Song;
import org.springframework.web.bind.annotation.*;
import service.SongService;

import java.util.List;

@RestController
@RequestMapping("/songs")
public class SongController {

    final SongService songService;

    public SongController(SongService songService) {
        this.songService = songService;
    }


   @GetMapping
    public List<Song> getAllSongs(){
        return songService.getAllSongs();
    }


    @GetMapping("/{id}")
    public Song getSongById( @PathVariable Long id){
        return songService.getSongById(id);
    }


    @PostMapping("/{id}")
    public List<Song> addSong(@PathVariable Long id, @RequestBody Song song){
        return songService.addSong(id,song);
    }

    @PutMapping("/{id}")
    public String updateSong(@PathVariable Long id,@RequestBody Song song){
        return songService.updateSong(id,song);
    }

    @DeleteMapping("/{id}")
    public String deleteSong(@PathVariable Long id){
        return songService.deleteSong(id);
    }




}
