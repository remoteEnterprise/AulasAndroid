package com.example.barbosa.aula05;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by barbosa on 09/09/16.
 */
public class CarrosAplication extends Application{


    private List<Carro> carros;

    public List<Carro> getCarros() {
        return carros;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        crearCarros();
        carros = new ArrayList<Carro>();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    public void crearCarros(){
        carros.add(new Carro(R.drawable.bmw_720, "Bmw 720"));
        carros.add(new Carro(R.drawable.bmw_720, "Bmw 720"));
        carros.add(new Carro(R.drawable.bmw_720, "Bmw 720"));
        carros.add(new Carro(R.drawable.bmw_720, "Bmw 720"));
        carros.add(new Carro(R.drawable.bmw_720, "Bmw 720"));
        carros.add(new Carro(R.drawable.bmw_720, "Bmw 720"));
        carros.add(new Carro(R.drawable.bmw_720, "Bmw 720"));
    }

}
