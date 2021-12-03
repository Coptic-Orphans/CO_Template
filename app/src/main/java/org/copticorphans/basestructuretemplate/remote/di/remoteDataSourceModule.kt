/*************************************************
 * Created by Efendi Hariyadi on 5/15/20 2:06 AM
 * Copyright (c) 2020 . All rights reserved.
 * Last modified 5/15/20 2:06 AM
 ************************************************/

package org.copticorphans.basestructuretemplate.remote.di

import org.copticorphans.basestructuretemplate.data.RemoteDataSource
import org.drulabs.bankbuddy.remote.source.RemoteDataSourceImpl
import org.koin.dsl.module

val remoteDataSourceModule = module {
    single { RemoteDataSourceImpl(get()) }
    single<RemoteDataSource> { RemoteDataSourceImpl(get()) }
}