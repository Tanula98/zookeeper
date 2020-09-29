import akka.NotUsed;
import akka.actor.ActorSystem;
import akka.http.javadsl.ConnectHttp;
import akka.http.javadsl.Http;
import akka.http.javadsl.ServerBinding;
import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.HttpResponse;
import akka.stream.ActorMaterializer;
import akka.stream.javadsl.Flow;
import org.apache.zookeeper.KeeperException;

import java.io.IOException;
import java.util.concurrent.CompletionStage;

public class ZookeperApp {

    public static void main(String[] args) throws IOException, KeeperException, InterruptedException
    {

        if (args.length < 1) {
            System.err.println("");
            return;
        }

        int serverPort = Integer.parseInt(args[0]);




    }
}
