package sj.model;

import java.net.URL;
import java.util.List;

public class TvSeries {
    private long id;
    private URL url;
    private String name;
    private String summary;
    private String language;
    private List<String> genres;
    private URL officialSite;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public URL getofficialSite() {
        return officialSite;
    }

    public void setofficialSite(URL officialSite) {
        this.officialSite = officialSite;
    }
}
