package com.example.soundtracks.datafetchers;

import com.example.soundtracks.models.MappedPlayList;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;

import java.util.List;

@DgsComponent
public class PlaylistDataFetcher {

    @DgsQuery
    public List<MappedPlayList> featuredPlaylists(){
        MappedPlayList rockPlayList = new MappedPlayList();
        rockPlayList.setId("1");
        rockPlayList.setName("Rock n' Roll");
        rockPlayList.setDescription("A rock n' roll playlist");

        MappedPlayList popPlaylist = new MappedPlayList();
        popPlaylist.setId("2");
        popPlaylist.setName("Pop");
        popPlaylist.setDescription("A pop playlist");


        return List.of(rockPlayList,popPlaylist);

    }
}
