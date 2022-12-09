
package com.example.weathermvp

class DependencyInjectorImpl : DependencyInjector {
  override fun weatherRepository() : WeatherRepository {
    return WeatherRepositoryImpl()
  }
}
