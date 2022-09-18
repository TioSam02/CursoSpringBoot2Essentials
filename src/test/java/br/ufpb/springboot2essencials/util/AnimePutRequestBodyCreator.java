package br.ufpb.springboot2essencials.util;

import br.ufpb.springboot2essencials.requests.AnimePutRequestBody;

public class AnimePutRequestBodyCreator {

    public static AnimePutRequestBody createAnimePutRequestBody() {
        return AnimePutRequestBody.builder()
                .name(AnimeCreator.createValidUpdateAnime().getName())
                .id(AnimeCreator.createValidUpdateAnime().getId())
                .build();
    }
}