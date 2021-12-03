package org.copticorphans.basestructuretemplate.data


import org.copticorphans.basestructuretemplate.remote.model.GithubUsersItemNetwork


interface RemoteDataSource {
   suspend fun getGitHunbUserInfo(): List<GithubUsersItemNetwork>
}