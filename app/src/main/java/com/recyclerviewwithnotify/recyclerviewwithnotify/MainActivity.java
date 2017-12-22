package com.recyclerviewwithnotify.recyclerviewwithnotify;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editText1, editText2;
    Button button;
    RecyclerView recyclerView;
    List<AddOperations> mAddOperations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAddOperations = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerview_rv);
        editText1 = findViewById(R.id.add1_et);
        editText2 = findViewById(R.id.add2_et);
        button = findViewById(R.id.add_btn);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        AddOperations addOperations1 = new AddOperations(Integer.parseInt(editText1.getText().toString()), Integer.parseInt(editText2.getText().toString()));
        mAddOperations.add(addOperations1);

        editText1.setText("");
        editText2.setText("");

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(new AdapterAdd(mAddOperations));

    }
}

