import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class Q6 {

	public static void main(String[] args) throws IOException, InterruptedException {
		 String getEndpoint = "http://httpbin.org/get";

	        var request = HttpRequest.newBuilder()
	            .uri(URI.create(getEndpoint))
	            .GET()
	            .build();

	        var client = HttpClient.newHttpClient();

	        HttpResponse <String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

	        System.out.println("Status Code: " + response.statusCode());
	        System.out.println("Response: " + response.body());

	}

}