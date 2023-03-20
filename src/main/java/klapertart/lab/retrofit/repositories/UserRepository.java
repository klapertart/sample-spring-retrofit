package klapertart.lab.retrofit.repositories;

import klapertart.lab.retrofit.models.User;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

/**
 * @author kurakuraninja
 * @since 20/03/2023
 */

public interface UserRepository {
    @GET("/users")
    public Call<List<User>> getUsers(
            @Query("per_page") int per_page,
            @Query("page") int page
    );

    @GET("/users/{username}")
    public Call<User> getUser(@Path("username") String username);
}
