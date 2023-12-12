package dev.cmanrg.heroes.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Hero (
    @StringRes val nameRes: Int,
    @StringRes val descriptionRes: Int,
    @DrawableRes val imageResourceId: Int
)