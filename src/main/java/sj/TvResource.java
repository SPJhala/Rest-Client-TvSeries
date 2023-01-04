package sj;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import sj.model.Episode;
import sj.model.TvSeries;
import sj.proxy.EpisodeProxy;
import sj.proxy.TvSeriesProxy;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/tvseries")
public class TvResource {
    @RestClient
    TvSeriesProxy tvProxy;
    @RestClient
    EpisodeProxy epiProxy;
    public List<TvSeries> tvSeries = new ArrayList();
    @GET
    @Path("/{title}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(@PathParam("title")String title){
        TvSeries tvserial = tvProxy.get(title);
        tvSeries.add(tvserial);
        List <Episode>episodeList = epiProxy.get(tvserial.getId());
        return Response.ok(episodeList).build();
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getEpisodes(@QueryParam("id")long id) {
       List <Episode>episodeList = epiProxy.get(id);
       return Response.ok(episodeList).build();
    }
}
