package com.luiza.thequizapp.retrofit;
import com.luiza.thequizapp.model.QuestionList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface QuestionsAPI {

    @GET("myquizapi.php") //endpoint
    Call<QuestionList> getQuestions();


}
