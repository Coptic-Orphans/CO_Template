/*************************************************
 * Created by Efendi Hariyadi on 5/15/20 2:06 AM
 * Copyright (c) 2020 . All rights reserved.
 * Last modified 5/15/20 2:06 AM
 ************************************************/

package org.copticorphans.basestructuretemplate.remote.di

import org.copticorphans.basestructuretemplate.ui.home.HomeRepository
import org.copticorphans.basestructuretemplate.data.repository.GithubRepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {
    single { GithubRepositoryImpl(get()) }
    single<HomeRepository> { GithubRepositoryImpl(get()) }
}