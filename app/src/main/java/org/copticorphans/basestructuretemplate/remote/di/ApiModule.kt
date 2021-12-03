/*************************************************
 * Created by Efendi Hariyadi on 5/15/20 3:01 AM
 * Copyright (c) 2020 . All rights reserved.
 * Last modified 5/15/20 3:01 AM
 ************************************************/

package org.copticorphans.basestructuretemplate.remote.di

import org.drulabs.bankbuddy.remote.api.GitHubService
import org.koin.dsl.module
import retrofit2.Retrofit

val apiModule = module {
    single(createdAtStart = false) { get<Retrofit>().create(GitHubService::class.java) }
}