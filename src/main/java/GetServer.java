import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.http.javadsl.Http;
import akka.http.javadsl.server.Route;

public class GetServer {

    private final ActorRef cacheActor;

    GetServer(ActorSystem system){
        cacheActor = system.actorOf(CacheActor.props(), "cacheActor");
    }

    public ActorRef getCacheActor() {
        return cacheActor;
    }

    Route createRoute(Http http) {
        return route(
}
