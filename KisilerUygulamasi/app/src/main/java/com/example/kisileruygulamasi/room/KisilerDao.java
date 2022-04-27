package com.example.kisileruygulamasi.room;

import androidx.room.Dao;
import androidx.room.Query;

import com.example.kisileruygulamasi.entity.Kisiler;

import java.util.List;

import io.reactivex.Single;

@Dao
public interface KisilerDao {
    @Query("SELECT * FROM kisiler")
    Single<List<Kisiler>> tumKisiler();
}
