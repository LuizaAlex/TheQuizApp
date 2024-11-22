package com.luiza.thequizapp.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.luiza.thequizapp.model.QuestionList;
import com.luiza.thequizapp.retrofit.QuestionsAPI;
import com.luiza.thequizapp.retrofit.RetrofitInstance;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class QuizRepository {

    private QuestionsAPI questionsAPI;

    public QuizRepository() {
        this.questionsAPI = new RetrofitInstance()
                .getRetrofitInstance()
                .create(QuestionsAPI.class);
    }


    public LiveData<QuestionList> getQuestionsFromAPI() {
        MutableLiveData<QuestionList> data = new MutableLiveData<>();


        Call<QuestionList> response = questionsAPI.getQuestions();

        response.enqueue(new Callback<QuestionList>() {
            @Override
            public void onResponse(Call<QuestionList> call, Response<QuestionList> response) {
                // Saving the data to the list
                QuestionList list = response.body();
                data.setValue(list);
            }

            @Override
            public void onFailure(Call<QuestionList> call, Throwable t) {

            }
        });

        return data;

    }
}