package com.example.priyasindkar.retrofitmvpdemo.postApi;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.priyasindkar.retrofitmvpdemo.R;
import com.example.priyasindkar.retrofitmvpdemo.postApi.model.MainData;
import com.example.priyasindkar.retrofitmvpdemo.postApi.postServiceMVP.PostServicePresenter;
import com.example.priyasindkar.retrofitmvpdemo.postApi.postServiceMVP.PostServiceView;

import java.util.ArrayList;

/**
 * Created by priyasindkar on 03-03-2016.
 */
public class PostServiceActivity extends AppCompatActivity implements PostServiceView {
    private Button btn;
    private ListView listView;
    private ProgressDialog progressDialog;
    private PostServicePresenter postServicePresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.services_main);

        postServicePresenter = new PostServicePresenter(this);
        progressDialog = new ProgressDialog(this);
        btn = (Button) findViewById(R.id.btn);
        listView = (ListView) findViewById(R.id.listView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                postServicePresenter.callPostServiceAPI();
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
    public void onSuccess(ArrayList<MainData> mainData) {

    }

    @Override
    public void onError() {

    }
}
