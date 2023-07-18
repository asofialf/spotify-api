package sofiaalfaro.spotifyapi.service;

import sofiaalfaro.spotifyapi.model.Podcast;

import java.util.List;

public interface PodcastService {
    public abstract Podcast createPodcast(Podcast podcast);
    public abstract Podcast updatePodcast(Podcast podcast);
    public abstract Podcast getPodcastById(Long podcastId);
    public abstract List<Podcast> getAllPodcasts();
    public abstract void deletePodcast(Long podcastId);
}
