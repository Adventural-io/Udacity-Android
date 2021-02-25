package io.zerod.francev.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class City(@StringRes val cityNameStringId: Int, @StringRes val cityDescriptionStringId: Int, @DrawableRes val cityImageResource: Int)
