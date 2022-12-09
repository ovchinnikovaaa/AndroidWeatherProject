
package com.example.weathermvp


class WeatherRepositoryImpl : WeatherRepository {
//  val jsonRain:String = "{\"id\":804,\"main\":\"clouds\",\"description\":\"overcast clouds\",\"icon\":\"04n\", \"rain\":{\"amount\":20},\"clouds\":{\"all\":92}, \"wind\":{\"speed\":7.31,\"deg\":187.002}, \"temp\":289.5,\"humidity\":89,\"pressure\":1013,\"temp_min\":287.04,\"temp_max\":292.04}"
//  val jsonSun:String = "{\"id\":804,\"main\":\"sunny\",\"description\":\"sunny\",\"icon\":\"04n\", \"rain\":{\"amount\":0},\"clouds\":{\"all\":92}, \"wind\":{\"speed\":7.31,\"deg\":187.002}, \"temp\":289.5,\"humidity\":89,\"pressure\":1013,\"temp_min\":287.04,\"temp_max\":292.04}"

  override fun loadWeather(): Weather {
    val weather: Weather = Weather(id = "804")
    return weather
  }
}
