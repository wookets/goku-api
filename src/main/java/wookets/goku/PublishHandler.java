package wookets.goku;

import io.vertx.core.http.HttpServerResponse;
import io.vertx.ext.web.RoutingContext;

public class PublishHandler {

	public void handle (RoutingContext ctx) {
		String topic = ctx.request().getParam("topic");
		HttpServerResponse response = ctx.response();

		response.end(topic);
	}

}