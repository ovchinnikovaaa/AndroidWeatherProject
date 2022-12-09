
package com.example.weathermvp

interface BaseView<T> {
  fun setPresenter(presenter : T)
}
