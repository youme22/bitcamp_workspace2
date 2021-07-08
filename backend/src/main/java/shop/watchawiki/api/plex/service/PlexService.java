package shop.watchawiki.api.plex.service;

import shop.watchawiki.api.plex.domain.PlexDto;

import java.util.ArrayList;

public interface PlexService {
    int regPlex(PlexDto vo);
    PlexDto selectByNo(int plexNo);
    PlexDto selectByName(String name);
    boolean isExist(int plexNo);
    boolean isExistName(String name);
    int delete(int plexNo);
    ArrayList<PlexDto> selectAll();
    int update(PlexDto vo);


}
