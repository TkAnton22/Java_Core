package HomeWorks.HomeWork_7;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import java.io.IOException;
import java.util.Objects;

import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.json.*;
import static HomeWorks.HomeWork_7.Main.cityName;

public class ClassForMagic {

    final static OkHttpClient okHttpClient = new OkHttpClient();
    final static ObjectMapper objectMapper = new ObjectMapper();
    final static String host = "dataservice.accuweather.com";

    public static String getCityId(String cityName) throws IOException {
        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme("http")
                .host(host)
                .addPathSegment("locations")
                .addPathSegment("v1")
                .addPathSegment("cities")
                .addPathSegment("search")
                .addQueryParameter("apikey", "5MvTMXPgNGm8GLFMJMNEeupz8wSapPnF")
                .addQueryParameter("q", cityName)
                .build();
        Request request = new Request.Builder()
                .addHeader("Accept", "application/json")
                .url(httpUrl)
                .build();

        Response response = okHttpClient.newCall(request).execute();
        String json = response.body().string();
        String cityCode = objectMapper.readTree(json).get(0).at("/Key").asText();

        return cityCode;
    }
    @NotNull
    public static String getJsonString(String cityCode) throws IOException {
        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegment("forecasts")
                .addPathSegment("v1")
                .addPathSegment("daily")
                .addPathSegment("5day")
                .addPathSegment(cityCode)
                .addQueryParameter("apikey", "5MvTMXPgNGm8GLFMJMNEeupz8wSapPnF")
                .addQueryParameter("metric", "true")
                .build();
        Request request = new Request.Builder()
                .addHeader("Accept", "application/json")
                .url(httpUrl)
                .build();

        Response response = okHttpClient.newCall(request).execute();
        String json = response.body().string();
        return json;



    }
    public static void getForecast(String forecast, int day) {

        if (Objects.equals(cityName, "Moscow")) {
            cityName = "Москва";
        }
        JSONObject obj = new JSONObject(forecast);
        JSONArray arr = obj.getJSONArray("DailyForecasts");
        String date = arr.getJSONObject(day).getString("Date");
        double tempMin = arr.getJSONObject(day).getJSONObject("Temperature").getJSONObject("Minimum").getDouble("Value");
        double tempMax = arr.getJSONObject(day).getJSONObject("Temperature").getJSONObject("Maximum").getDouble("Value");
        String dayWeather = arr.getJSONObject(day).getJSONObject("Day").getString("IconPhrase");
        {
            if (Objects.equals(dayWeather, "Dreary")) {
                dayWeather = "пасмурно";
            } else if (Objects.equals(dayWeather, "Mostly cloudy")) {
                dayWeather = " приемущественно облачно";
            } else if (Objects.equals(dayWeather, "Cloudy")) {
                dayWeather = "облачно";
            } else if (Objects.equals(dayWeather, "Intermittent clouds")) {
                dayWeather = "переменная облачность";
            } else if (Objects.equals(dayWeather, "Showers")) {
                dayWeather = "дожди";
            } else if (Objects.equals(dayWeather, "Snow")) {
                dayWeather = "снег";
            } else if (Objects.equals(dayWeather, "Partly sunny")) {
                dayWeather = "солнечно";
            }
        }
        boolean dayPrecipitation = arr.getJSONObject(day).getJSONObject("Day").getBoolean("HasPrecipitation");
        String nightWeather = arr.getJSONObject(day).getJSONObject("Night").getString("IconPhrase");
        {
            if (Objects.equals(nightWeather, "Dreary")) {
                nightWeather = "пасмурно";
            } else if (Objects.equals(nightWeather, "Mostly cloudy")) {
                nightWeather = " приемущественно облачно";
            } else if (Objects.equals(nightWeather, "Cloudy")) {
                nightWeather = "облачно";
            } else if (Objects.equals(nightWeather, "Intermittent clouds")) {
                nightWeather = "переменная облачность";
            } else if (Objects.equals(nightWeather, "Showers")) {
                nightWeather = "дожди";
            } else if (Objects.equals(nightWeather, "Snow")) {
                nightWeather = "снег";
            } else if (Objects.equals(nightWeather, "Partly sunny")) {
                nightWeather = "солнечно";
            }
        }
        boolean nightPrecipitation = arr.getJSONObject(day).getJSONObject("Night").getBoolean("HasPrecipitation");
        System.out.println(
                "Краткий прогноз на " + date.substring(0, 10) + " в городе " + cityName + ":" +
                "\nМинимальая температура : " + tempMin +
                "\nМаксимальная температура : " + tempMax +
                "\nДнем " + dayWeather +
                "\n" + (!dayPrecipitation ? "Без осадков" : "Возможны осадки") +
                "\nНочью " + nightWeather +
                "\n" + (!nightPrecipitation ? "Без осадков" : "Возможны осадки\n"));
    }
}