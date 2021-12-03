package org.copticorphans.basestructuretemplate.ui.home

import org.copticorphans.basestructuretemplate.remote.model.GithubUsersItemNetwork


interface HomeRepository {
   suspend fun getGitHunbUserInfo(): List<GithubUsersItemNetwork>
}
