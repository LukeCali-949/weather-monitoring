package edu.iu.habahram.weathermonitoring.model;

public class StatisticsDisplay {
    public String weather = "Cloudy";
    public int avgTemp;
    public int maxTemp;
    public int minTemp;

    StatisticsDisplay(String weather, int avgTemp, int maxTemp, int minTemp){
        this.weather = weather;
        this.avgTemp = avgTemp;
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
    }
}
