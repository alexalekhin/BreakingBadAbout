package ru.alexalekhin.breakingbadabout

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import ru.alexalekhin.breakingbadabout.di.koinModules

class BreakingBadApp: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@BreakingBadApp)

            modules(koinModules)
        }
    }
}
