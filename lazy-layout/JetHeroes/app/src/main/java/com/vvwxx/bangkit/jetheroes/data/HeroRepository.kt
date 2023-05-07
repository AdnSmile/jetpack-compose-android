package com.vvwxx.bangkit.jetheroes.data

import com.vvwxx.bangkit.jetheroes.model.Hero
import com.vvwxx.bangkit.jetheroes.model.HeroesData

class HeroRepository{
    fun getHeroes(): List<Hero> = HeroesData.heroes

    fun searchHeroes(query: String): List<Hero> {
        return HeroesData.heroes.filter {
            it.name.contains(query, ignoreCase = true)
        }
    }
}