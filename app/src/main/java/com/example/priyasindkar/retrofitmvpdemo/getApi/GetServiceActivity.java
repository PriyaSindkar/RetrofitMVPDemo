package com.example.priyasindkar.retrofitmvpdemo.getApi;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.priyasindkar.retrofitmvpdemo.R;
import com.example.priyasindkar.retrofitmvpdemo.getApi.Model.User;
import com.example.priyasindkar.retrofitmvpdemo.getApi.apiMVP.UserApiPresenter;
import com.example.priyasindkar.retrofitmvpdemo.getApi.apiMVP.UserApiView;

import java.util.ArrayList;

public class GetServiceActivity extends AppCompatActivity implements UserApiView{
    private Button btn;
    private ListView listView;
    private ProgressDialog progressDialog;
    private UserApiPresenter userApiPresenter;
    private UserAdapter userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.services_main);

        btn = (Button) findViewById(R.id.btn);
        listView = (ListView) findViewById(R.id.listView);
        progressDialog = new ProgressDialog(this);
        userApiPresenter = new UserApiPresenter(this);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userApiPresenter.callGetUserAPI();
            }
        });
    }

    @Override
    public void showProgressBar() {
        progressDialog.setTitle("Loading Users..");
        progressDialog.show();
    }

    @Override
    public void hideProgressBar() {
        progressDialog.hide();
    }

    @Override
    public void onSuccess(ArrayList<User> users) {
        userAdapter = new UserAdapter(this, users);
        listView.setAdapter(userAdapter);
    }

    @Override
    public void onError() {

    }
}
