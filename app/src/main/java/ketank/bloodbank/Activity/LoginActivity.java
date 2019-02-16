package ketank.bloodbank.Activity;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import ketank.bloodbank.R;

public class LoginActivity extends AppCompatActivity {
    ProgressBar bankprog;
    Button banklogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    public void BankLogin(View view) {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(LoginActivity.this);

        LayoutInflater inflater =  getLayoutInflater();

        View customview = inflater.inflate(R.layout.popup_bank_login, null);
        dialogBuilder.setView(customview);

        final EditText userid = customview.findViewById(R.id.userid);
        final EditText password = customview.findViewById(R.id.pass);
        banklogin = customview.findViewById(R.id.log);
        bankprog = customview.findViewById(R.id.eventprog);
        bankprog.setVisibility(View.GONE);

        banklogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                banklogin.setVisibility(View.GONE);
                bankprog.setVisibility(View.VISIBLE);
               // BloodLogin(All_urls.values.EventLogin,userid.getText().toString(),password.getText().toString());
            }
        });

        AlertDialog alertDialog = dialogBuilder.create();
        alertDialog.show();



    }


}
