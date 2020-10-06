package com.pvobrien.songr;

//import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
//import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;

//@SpringBootTest
class SongrApplicationTests {

	@Test
	public void testAlbumConstructorAndGetters() {
		Album testAlbum = new Album("Leeroy Jenkins", "WoWers", 1,13, "https://cdn.gamer-network.net/2020/metabomb/leeroyfull.jpg");
		assertEquals("Leeroy Jenkins", testAlbum.getTitle());
		assertEquals("WoWers",testAlbum.getArtist());
		assertEquals(1,testAlbum.getSongCount());
		assertEquals("https://cdn.gamer-network.net/2020/metabomb/leeroyfull.jpg", testAlbum.getImageUrl());
	}

	@Test
	public void testSongConstructorAndGetters() {
		Album testAlbum = new Album("Calling All Dawns", "Christopher Tin", 10, 123, "https://images-na.ssl-images-amazon.com/images/I/71Cser-A1cL._SX522_.jpg");
		Song testSong = new Song("Baba Yetu", 123, 4, testAlbum);
		assertEquals("This is the title", "Baba Yetu", testSong.getTitle());
		assertEquals("This is the length", 123, testSong.getLength());
		assertEquals("This is the trackNumber", 4, testSong.getTrackNumber());
		assertEquals("This is the album", testAlbum, testSong.getAlbum());
	}

	@Test
	public void testAlbumSetters() {
		Album testAlbum = new Album("Leeroy Jenkins", "WoWers", 1,13, "https://cdn.gamer-network.net/2020/metabomb/leeroyfull.jpg");
		testAlbum.setTitle("newAlbum");
		assertEquals("newAlbum", testAlbum.getTitle());
		testAlbum.setArtist("newArtist");
		assertEquals("newArtist",testAlbum.getArtist());
		testAlbum.setSongCount(13);
		assertEquals(13,testAlbum.getSongCount());
		testAlbum.setImageUrl("newImageUrl");
		assertEquals("newImageUrl", testAlbum.getImageUrl());
	}

	@Test
	public void testSongSetters() {
		Album testAlbum = new Album("Calling All Dawns", "Christopher Tin", 10, 123, "https://images-na.ssl-images-amazon.com/images/I/71Cser-A1cL._SX522_.jpg");
		Album resetAlbum = new Album("Leeroy Jenkins", "WoWers", 1,13, "https://cdn.gamer-network.net/2020/metabomb/leeroyfull.jpg");
		Song testSong = new Song("Baba Yetu", 123, 4, testAlbum);
		testSong.setTitle("newTitle");
		assertEquals("This is the title", "newTitle", testSong.getTitle());
		testSong.setLength(321);
		assertEquals("This is the length", 321, testSong.getLength());
		testSong.setTrackNumber(37);
		assertEquals("This is the tracknumber", 37, testSong.getTrackNumber());
		testSong.setAlbum(resetAlbum);
		assertEquals("This is the album", resetAlbum, testSong.getAlbum());
	}
}
