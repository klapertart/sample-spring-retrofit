package klapertart.lab.retrofit.services;

import klapertart.lab.retrofit.models.User;
import klapertart.lab.retrofit.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;

import java.util.List;

/**
 * @author kurakuraninja
 * @since 20/03/2023
 */

@Service
@Slf4j
public class UserService {

    @Autowired
    private RetrofitClient retrofitClient;


    public void getAllUsers(){
        UserRepository userRepository = retrofitClient.getClient().create(UserRepository.class);
        Call<List<User>> users = userRepository.getUsers(2, 0);

        try{
            Response<List<User>> execute = users.execute();
            if (execute.isSuccessful()){
                List<User> body = execute.body();
                log.info("SUKSES GET USERS");
                log.info(body.toString());
            }else{
                log.error("GAGAL GET USERS");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void getUser(){
        UserRepository userRepository = retrofitClient.getClient().create(UserRepository.class);
        Call<User> user = userRepository.getUser("defunkt");
        try{
            Response<User> execute = user.execute();
            if (execute.isSuccessful()){
                User body = execute.body();
                log.info("SUKSES GET USERS");
                log.info(body.toString());
            }else{
                log.error("GAGAL GET USERS");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
