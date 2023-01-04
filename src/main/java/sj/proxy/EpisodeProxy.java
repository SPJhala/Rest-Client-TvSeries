package sj.proxy;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import sj.model.Episode;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import java.util.List;

@RegisterRestClient(baseUri = "https://api.tvmaze.com")
@Path("/shows")
public interface EpisodeProxy {
    @GET
    @Path("/{id}/episodes")
    @Produces(MediaType.APPLICATION_JSON)
    List<Episode> get(@PathParam("id")long id);
}
