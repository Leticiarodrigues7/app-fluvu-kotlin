package br.com.fluvu.sensors.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity
@Parcelize
data class Sensor(
        @PrimaryKey(autoGenerate = true)
        val id: Long = 0L,
        val date: String,
        val volume: String,
        val weather: String,
        val alert: String
) : Parcelable
