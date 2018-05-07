package wookets.goku;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.ext.web.Router;

public class MainVerticle extends AbstractVerticle {

    @Override
    public void start() throws Exception {
		HttpServer server = vertx.createHttpServer();
		
		Router router = Router.router(vertx);
		router.route().handler(ctx -> {
			HttpServerResponse res = ctx.response();
			res.putHeader("content-type", "text/plain");
			res.end("Hello");
		});
		server.requestHandler(router::accept).listen(8080);
        System.out.println("HTTP server started on port 8080");
    }
}
