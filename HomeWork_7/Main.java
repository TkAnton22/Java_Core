package HomeWorks.HomeWork_7;

import java.io.IOException;

import static HomeWorks.HomeWork_7.ClassForMagic.getJsonString;


public class Main {
    static String cityName = "Moscow";
    public static void main(String[] args) throws IOException {

        String cityCode = ClassForMagic.getCityId(cityName);
        String forecast = getJsonString(cityCode);
        ClassForMagic.getForecast(forecast, 0);
        ClassForMagic.getForecast(forecast, 1);
        ClassForMagic.getForecast(forecast, 2);
        ClassForMagic.getForecast(forecast, 3);
        ClassForMagic.getForecast(forecast, 4);
    }
}
