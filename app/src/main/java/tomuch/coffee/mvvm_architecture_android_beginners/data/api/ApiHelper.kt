package tomuch.coffee.mvvm_architecture_android_beginners.data.api

class ApiHelper(private val apiService: ApiService) {

    fun getUsers() = apiService.getUser()
}