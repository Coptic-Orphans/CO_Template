package org.drulabs.bankbuddy.remote.source

import org.copticorphans.basestructuretemplate.remote.model.GithubUsersItemNetwork
import org.copticorphans.basestructuretemplate.data.RemoteDataSource
import org.drulabs.bankbuddy.remote.api.GitHubService


class RemoteDataSourceImpl constructor(
    private val githubService: GitHubService
) : RemoteDataSource {

  override suspend  fun getGitHunbUserInfo(): List<GithubUsersItemNetwork>{
        return githubService.getGitHunbUserInfo()
    }
}