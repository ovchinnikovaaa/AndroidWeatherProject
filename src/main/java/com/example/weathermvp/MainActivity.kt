package com.example.weathermvp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

// 1
class MainActivity : AppCompatActivity(), MainContract.View {
    private lateinit var imageView: ImageView
    private lateinit var button: Button

    // 2
    private lateinit var presenter: MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)
        button = findViewById(R.id.button)

        // 3
        setPresenter(MainPresenter(this, DependencyInjectorImpl()))
        presenter.onViewCreated()

        // 4
        button.setOnClickListener { presenter.onLoadWeatherTapped() }
    }

    // 5
    override fun onDestroy() {
        presenter.onDestroy()
        super.onDestroy()
    }

    // 6
    override fun setPresenter(presenter: MainContract.Presenter) {
        this.presenter = presenter
    }

    // 7
    @SuppressLint("UseCompatLoadingForDrawables")
    override fun displayWeatherState(weatherState: WeatherState) {
        val drawable = resources.getDrawable(weatherDrawableResId(weatherState),
            applicationContext.theme
        )
        this.imageView.setImageDrawable(drawable)
    }

    fun weatherDrawableResId(weatherState: WeatherState) : Int {
        return when (weatherState) {
            WeatherState.SUN -> R.drawable.ic_sun
            WeatherState.RAIN -> R.drawable.ic_umbrella
        }
    }
}