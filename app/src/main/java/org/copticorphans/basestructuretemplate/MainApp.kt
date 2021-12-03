package org.copticorphans.basestructuretemplate

import android.app.Application
import org.copticorphans.basestructuretemplate.remote.di.*
import org.copticorphans.basestructuretemplate.remote.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import timber.log.Timber

class MainApp : Application() {
    companion object {
    lateinit var instance: MainApp
        private set
}
    override fun onCreate() {
        super.onCreate()
        if(BuildConfig.DEBUG){
            Timber.plant(Timber.DebugTree())
        }
        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@MainApp)
            modules(listOf(
                remoteDataSourceModule,
                viewModelModule,
                apiModule,
                repositoryModule,
                RetrofitModule
            ))

        }
        instance = this
    }
}