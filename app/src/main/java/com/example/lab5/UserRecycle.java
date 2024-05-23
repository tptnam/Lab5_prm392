package com.example.lab5;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserRecycle extends AppCompatActivity {

    ArrayList<User> userList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_user_list);

        RecyclerView rvUser = findViewById(R.id.item_user);

        userList = new ArrayList<>();
        userList.add(new User("AnguyeVan", "Nguyen Van A", "a@fpt.edu.vn"));
        userList.add(new User("BnguyeVan", "Nguyen Van B", "abc@fpt.edu.vn"));
        userList.add(new User("CnguyeVan", "Nguyen Van C", "abcd@fpt.edu.vn"));
        userList.add(new User("DnguyeVan", "Nguyen Van D", "abcde@fpt.edu.vn"));
        userList.add(new User("EnguyeVan", "Nguyen Van E", "abcdf@fpt.edu.vn"));
        userList.add(new User("FnguyeVan", "Nguyen Van F", "abcdef@fpt.edu.vn"));
        userList.add(new User("GnguyeVan", "Nguyen Van G", "abcdefg@fpt.edu.vn"));
        userList.add(new User("HnguyeVan", "Nguyen Van H", "abcdefgh@fpt.edu.vn"));
        userList.add(new User("KnguyeVan", "Nguyen Van K", "abcdefghk@fpt.edu.vn"));


        UserAdapter adapter = new UserAdapter(userList);
        rvUser.setAdapter(adapter);
        rvUser.setLayoutManager(new LinearLayoutManager(this));

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}