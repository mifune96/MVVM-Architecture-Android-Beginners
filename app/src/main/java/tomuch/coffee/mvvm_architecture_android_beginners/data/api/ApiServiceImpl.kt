package tomuch.coffee.mvvm_architecture_android_beginners.data.api

import com.rx2androidnetworking.Rx2AndroidNetworking
import io.reactivex.Single
import tomuch.coffee.mvvm_architecture_android_beginners.data.model.User

class ApiServiceImpl : ApiService {
    override fun getUser(): Single<List<User>> {
        return Rx2AndroidNetworking.get("https://5e510330f2c0d300147c034c.mockapi.io/users")
            .build()
            .getObjectListSingle(User::class.java)
    }
}