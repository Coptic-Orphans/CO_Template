package org.copticorphans.basestructuretemplate.remote.di


import org.copticorphans.basestructuretemplate.ui.home.HomeViewModel
import org.koin.androidx.viewmodel.compat.ScopeCompat.viewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { HomeViewModel(get()) }
}