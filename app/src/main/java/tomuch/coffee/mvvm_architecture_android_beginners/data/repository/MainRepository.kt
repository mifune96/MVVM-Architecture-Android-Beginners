package tomuch.coffee.mvvm_architecture_android_beginners.data.repository

import io.reactivex.Single
import tomuch.coffee.mvvm_architecture_android_beginners.data.api.ApiHelper
import tomuch.coffee.mvvm_architecture_android_beginners.data.model.User

class MainRepository(private val apiHelper: ApiHelper) {

    fun getUsers(): Single<List<User>>{
        return apiHelper.getUsers()
    }
}