package com.YaumalYusuf.Projekakhir.ui;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.YaumalYusuf.Projekakhir.data.AppRepository;
import com.YaumalYusuf.Projekakhir.data.model.Faskes;
import com.YaumalYusuf.Projekakhir.data.model.KumulatifHarian;

import java.util.ArrayList;

public class ViewModel extends AndroidViewModel {

    protected AppRepository repository;

    public ViewModel(@NonNull Application application) {
        super(application);
        this.repository = new AppRepository(application);
    }

    public final LiveData<ArrayList<KumulatifHarian.Data.Content>> getKumulatifHarian() {
        return repository.getKumulatif();
    }

    public final LiveData<ArrayList<Faskes.Data>> getFaskes() {
        return repository.getFaskes();
    }


}
