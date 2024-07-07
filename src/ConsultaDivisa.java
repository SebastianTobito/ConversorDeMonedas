import com.google.gson.Gson;

import java.io.IOException;

import java.net.URI;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaDivisa {
    private String json;

    public Divisa buscarMoneda(String moneda)  {

        String direccion = "https://v6.exchangerate-api.com/v6/78f060949cff6ec52636c485/latest/"+moneda;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            json = response.body();
            System.out.println(json);

            return new Gson().fromJson(json, Divisa.class);

        }catch (RuntimeException  e){
            System.out.println("Ocurrió un error" + e.getMessage());
       }catch (IOException  e){
            System.out.println("Ocurrió un error" +e.getMessage());
        }catch (InterruptedException e){
            System.out.println("Ocurrió un error" +e.getMessage());
        }

        return new Gson().fromJson(json, Divisa.class);
    }
}
