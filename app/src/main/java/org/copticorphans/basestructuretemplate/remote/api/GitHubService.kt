package org.drulabs.bankbuddy.remote.api


import org.copticorphans.basestructuretemplate.remote.model.GithubUsersItemNetwork
import retrofit2.http.GET


interface GitHubService {

    @GET("users")
   suspend fun getGitHunbUserInfo(): List<GithubUsersItemNetwork>
}