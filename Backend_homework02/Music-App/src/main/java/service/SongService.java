package service;

import model.Song;
import model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class SongService {
    List<Song> songs=new ArrayList<>();
   final UserService userService;

    public SongService(UserService userService) {
        this.userService = userService;
    }

    public List<Song> getAllSongs() {
        return  songs;
    }

    public Song getSongById(Long id) {
      return   songs.stream().filter(song -> song.getId()==id).findFirst().orElseThrow();
    }

    public String updateSong(Long id, Song song) {
        Song foundSong=songs.stream().filter(song1 -> song1.getId()==id).findAny().orElseThrow();
        if(foundSong.getSongName() !=null) foundSong.setSongName(song.getSongName());
        if(foundSong.getSinger() !=null)   foundSong.setSinger(song.getSinger());
        if(foundSong.getYear() !=null) foundSong.setYear(song.getYear());
        if(foundSong.getCategory() !=null) foundSong.setCategory(song.getCategory());

        return foundSong.getId()+"'li kullanıcı güncellendi";
    }

    public String deleteSong(Long id) {
        Song foundSong=songs.stream().filter(song1 -> song1.getId()==id).findAny().orElseThrow();
        songs.remove(foundSong);
        return foundSong.getId()+"'li kullanıcı silindi";
    }

    public List<Song> addSong(Long id, Song song) {
        User foundUser= userService.getAllUsers().stream().filter(user1 -> user1.getId()==id).findFirst().orElseThrow();
        if(foundUser.getMySongs().size()>20){
            System.out.println("20'den fazla şarkı ekleyemezsiniz.");
        }
        else{
            foundUser.getMySongs().add(song);
        }
        return foundUser.getMySongs();

    }
    }

