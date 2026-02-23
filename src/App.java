import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class App {

    public static void main(String[] args) throws Exception {

        HttpClient client = HttpClient.newHttpClient();

        while (true) {

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("http://127.0.0.1:8000/predict"))
                    .GET()
                    .build();

            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            String letra = json.split(":")[1]
                    .replace("\"", "")
                    .replace("}", "");

            // Limpa console (Windows)
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("=== Reconhecimento de Libras ===\n");
            System.out.println("Letra detectada: " + letra);

            Thread.sleep(500);
        }
    }
}