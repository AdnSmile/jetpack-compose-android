package com.vvwxx.bangkit.jetheroes.data

import com.vvwxx.bangkit.jetheroes.model.Hero
import com.vvwxx.bangkit.jetheroes.model.HeroesData

class HeroRepository{
    fun getHeroes(): List<Hero> = HeroesData.heroes
}