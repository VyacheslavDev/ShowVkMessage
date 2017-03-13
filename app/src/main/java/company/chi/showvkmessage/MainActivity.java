package company.chi.showvkmessage;

import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import company.chi.showvkmessage.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ActivityMainBinding binding;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        user = new User("Test", "User", true);
        binding.setUser(user);
        binding.btnSend.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        user.setEmail("233333");
        binding.tvEmail.setBackgroundColor(Color.RED);
        binding.getUser();
    }
}
