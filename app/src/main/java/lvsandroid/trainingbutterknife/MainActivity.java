package lvsandroid.trainingbutterknife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.eTextUsername) EditText username;
    @BindView(R.id.eTextPassword) EditText password;

    @BindString(R.string.login_debug) String loginDebugMessage;

    @OnClick(R.id.btnSubmit) void submit() {
        Log.d(loginDebugMessage,username.getText().toString());
        Log.d(loginDebugMessage,password.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);



    }
}
