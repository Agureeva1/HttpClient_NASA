package org.example;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


public class Main {
    //Наша ссылка, на которую будем отправлять запрос
 //   public static final String URI = "https://api.nasa.gov/planetary/apod?api_key=19lkT5GJZd5W5dllkDpx0fPTRJnIPcesOm3Vbvtq";

    //Сущность, которая будет преобразовывать ответ в наш объект NASA
 //   public static final ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) throws TelegramApiException {
//
//        //Настраиваем наш HTTP клиент, который будет отправлять запросы
//        CloseableHttpClient httpClient = HttpClientBuilder.create()
//                .setDefaultRequestConfig(RequestConfig.custom()
//                        .setConnectTimeout(5000)
//                        .setSocketTimeout(30000)
//                        .setRedirectsEnabled(false)
//                        .build())
//                .build();
//
//        //Отправляем запрос и получаем ответ
//        CloseableHttpResponse response = httpClient.execute(new HttpGet(URI));
//
//        //Преобразуем ответ в Java-объект NasaObject
//        NasaObject nasaObject = mapper.readValue(response.getEntity().getContent(), NasaObject.class);
//
//        System.out.println(nasaObject);
//
//        // Отправляем запрос и получаем ответ с нашей картинкой
//        CloseableHttpResponse pictureResponse = httpClient.execute(new HttpGet(nasaObject.getUrl()));
//
//        //Формируем автоматически название для файла
//        String[] arr = nasaObject.getUrl().split("/");
//        String fileName = arr[arr.length - 1];
//
//        HttpEntity entity = pictureResponse.getEntity();
//
//        //сохраняем в файл
//        FileOutputStream fos = new FileOutputStream(fileName);
//        entity.writeTo(fos);
//        fos.close();
        new MyTelegramBot();
    }
}