package org.copticorphans.basestructuretemplate.data.repository


import org.copticorphans.basestructuretemplate.data.RemoteDataSource
import org.copticorphans.basestructuretemplate.remote.model.GithubUsersItemNetwork
import org.copticorphans.basestructuretemplate.ui.home.HomeRepository

class GithubRepositoryImpl constructor(
    private val remoteDataSource: RemoteDataSource
) : HomeRepository {
    override suspend fun getGitHunbUserInfo(): List<GithubUsersItemNetwork> {
        return remoteDataSource.getGitHunbUserInfo()
    }
}