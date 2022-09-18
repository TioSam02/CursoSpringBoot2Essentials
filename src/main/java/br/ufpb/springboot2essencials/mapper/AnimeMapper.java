package br.ufpb.springboot2essencials.mapper;

import br.ufpb.springboot2essencials.domain.Anime;
import br.ufpb.springboot2essencials.requests.AnimePostRequestBody;
import br.ufpb.springboot2essencials.requests.AnimePutRequestBody;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class AnimeMapper {
    public static final AnimeMapper INSTANCE = Mappers.getMapper(AnimeMapper.class);

    public abstract Anime toAnime(AnimePostRequestBody animePostRequestBody);

    public abstract  Anime toAnime(AnimePutRequestBody animePutRequestBody);

}
