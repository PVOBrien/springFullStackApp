package com.pvobrien.songr;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class SongrApplicationTests {

//	@Test
//	void contextLoads() {
//	}

	@Test
	public void testAlbumConstructor() {
		Album testAlbum = new Album("Leeroy Jenkins", "WoWers", 1,13, "https://cdn.gamer-network.net/2020/metabomb/leeroyfull.jpg");
		assertEquals("Leeroy Jenkins", testAlbum.getTitle());
		assertEquals("WoWers",testAlbum.getArtist());
		assertEquals(1,testAlbum.getSongCount());
		assertEquals("https://cdn.gamer-network.net/2020/metabomb/leeroyfull.jpg", testAlbum.getImageUrl());
	}
}
