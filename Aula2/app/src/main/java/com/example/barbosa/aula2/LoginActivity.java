package com.example.barbosa.aula2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText mLoguin, mSenha;
    private Button mEntrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        this.mLoguin = (EditText) findViewById(R.id.loguin);
        this.mSenha = (EditText) findViewById(R.id.senha);
        this.mEntrar = (Button) findViewById(R.id.entrar);

        mEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logar();

            }
        });
    }
    private void logar(){
        String loguin = mLoguin.getText().toString();
        String senha =  mSenha.getText().toString();
        if(loguin.equalsIgnoreCase("matheus")&& senha.equalsIgnoreCase("123")){
            mEntrar.setEnabled(false);
            Intent intent = new Intent(this, MainActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("nome", loguin);
            intent.putExtras(bundle);
            startActivity(intent);
            finish();
        }
        else{
            View focus = null;
            if(TextUtils.isEmpty(loguin)){
                mLoguin.setError("Campo Vazio");
                focus.requestFocus();
            }
            if(TextUtils.isEmpty(senha)){
                mSenha.setError("Campo Vazio");
                focus.requestFocus();
            }
            Toast.makeText(getApplicationContext(), "Loguin ou Senha invalidos", Toast.LENGTH_SHORT).show();
        }


    }


}
