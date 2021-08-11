package tomuch.coffee.mvvm_architecture_android_beginners.data.api

import io.reactivex.Single
import tomuch.coffee.mvvm_architecture_android_beginners.data.model.User

interface ApiService {
    fun getUser(): Single<List<User>>
}