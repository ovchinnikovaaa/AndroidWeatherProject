package com.example.weathermvp

class MainContract {
    interface Presenter : BasePresenter {
        fun onViewCreated()
        fun onLoadWeatherTapped()
    }

    interface View : BaseView<Presenter> {
        fun displayWeatherState(weatherState: WeatherState)
    }

}