package com.moj.criminalintent

import androidx.lifecycle.ViewModel
import com.google.type.Date


class CrimeListViewModel : ViewModel() {

    var crimes = mutableListOf<Crime>()

    init {
        for (i in 0 until 100) {
            val crime = Crime()
            crime.title = "Crime #$i"
            crime.isSolved = i % 2 == 0
            crimes += crime
        }


        /*fun initialize(): MutableList<Crime> {

            for (i in 0 until 100) {
                val crime = Crime()
                crime.title = "number $i"
                crime.date = crime.date
                crimes += crime
            }
            return crimes*/
    }
}