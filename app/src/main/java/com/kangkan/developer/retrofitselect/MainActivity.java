package com.kangkan.developer.retrofitselect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;

    private ApiInterface apiInterface;
    String text;


    private ListView listView;
    private List<Contact> student = new ArrayList<>();
    private Adapter studentAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.ext_input);
        button = findViewById(R.id.btn_go);
        listView = findViewById(R.id.stu_list);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = editText.getText().toString();
                fetchContact("users",text);
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Contact Response = student.get(position);
                Toast.makeText(MainActivity.this, Response.getInstitute(), Toast.LENGTH_SHORT).show();


            }
        });

    }

    public void fetchContact(String u, String i) {

        apiInterface = ApiClient.getApiClient().create(ApiInterface.class);


        Call<List<Contact>> call = apiInterface.getContact(u,i);
        call.enqueue(new Callback<List<Contact>>() {
            @Override
            public void onResponse(Call<List<Contact>> call, Response<List<Contact>> response) {

                student =response.body();
                studentAdapter = new Adapter(MainActivity.this, student);
                listView.setAdapter(studentAdapter);

            }

            @Override
            public void onFailure(Call<List<Contact>> call, Throwable t) {

                Toast.makeText(MainActivity.this, "Error\n" + t.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
