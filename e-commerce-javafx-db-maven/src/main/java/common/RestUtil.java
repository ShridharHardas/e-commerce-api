package common;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RestUtil {
	public static String deleteRequest(String uri) throws IOException, InterruptedException
	{
		HttpClient client=HttpClient.newHttpClient();
		HttpRequest request=HttpRequest.newBuilder().uri(URI.create(uri)).DELETE().build();
		HttpResponse<String> response=client.send(request, HttpResponse.BodyHandlers.ofString());
		return response.body();
	}
	
	public static String getRequest(String uri) throws IOException, InterruptedException
	{
		HttpClient client=HttpClient.newHttpClient();
		HttpRequest request=HttpRequest.newBuilder().uri(URI.create(uri)).GET().build();
		HttpResponse<String> response=client.send(request, HttpResponse.BodyHandlers.ofString());
		return response.body();
	}
	public static String postRequest(String uri,String body) throws IOException, InterruptedException
	{
		HttpClient client=HttpClient.newHttpClient();
		HttpRequest request=HttpRequest.newBuilder().uri(URI.create(uri))
							.header("Content-Type", "application/json")
							.POST(HttpRequest.BodyPublishers.ofString(body))
							.build();
		HttpResponse<String> response=client.send(request, HttpResponse.BodyHandlers.ofString());
		return response.body();
	}

}
