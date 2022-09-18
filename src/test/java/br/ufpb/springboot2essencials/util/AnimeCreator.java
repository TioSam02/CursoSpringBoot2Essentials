package br.ufpb.springboot2essencials.util;

import br.ufpb.springboot2essencials.domain.Anime;

public class AnimeCreator {

    public static Anime createAnimeToBeSaved() {
        return Anime.builder()
                .name("Hajime no Ippo ")
                .build();
    }

    public static Anime createValidAnime() {
        return Anime.builder()
                .name("Hajime no Ippo")
                .id(1L)
                .build();
    }

    public static Anime createValidUpdateAnime() {
        return Anime.builder()
                .name("Hajime No Ippo 2")
                .id(1L)
                .build();
    }

}