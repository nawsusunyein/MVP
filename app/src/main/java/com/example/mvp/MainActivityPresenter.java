package com.example.mvp;

import android.view.View;

public class MainActivityPresenter {
    private User user;
    private View view;

    public MainActivityPresenter(View view){
        this.user = new User();
        this.view = view;
    }

    public void updateFullName(String name){
        user.setFullName(name);
        view.showUserInfo(user.toString());
    }

    public void updateEmail(String email){
        user.setEmail(email);
        view.showUserInfo(user.toString());
    }
    public interface View{
        void showUserInfo(String info);
        void showProgressBar();
        void hideProgressBar();
    }
}
