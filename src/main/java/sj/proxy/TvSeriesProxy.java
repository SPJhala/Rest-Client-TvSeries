package sj.proxy;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import sj.model.TvSeries;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@RegisterRestClient(baseUri = "https://api.tvmaze.com")
@Path("/singlesearch")
public interface TvSeriesProxy {
    @GET
    @Path("/shows")
    @Produces(MediaType.APPLICATION_JSON)
    TvSeries get(@QueryParam("q")String title);
}
