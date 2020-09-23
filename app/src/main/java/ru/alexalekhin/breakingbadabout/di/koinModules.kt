package ru.alexalekhin.breakingbadabout.di

import ru.alexalekhin.breakingbadabout.di.modules.repositoriesModule
import ru.alexalekhin.breakingbadabout.di.modules.servicesModule
import ru.alexalekhin.breakingbadabout.di.modules.viewModelsModule

val koinModules = listOf(
    servicesModule,
    repositoriesModule,
    viewModelsModule
)