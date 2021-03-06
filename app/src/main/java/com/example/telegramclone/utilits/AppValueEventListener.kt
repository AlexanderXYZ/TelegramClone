package com.example.telegramclone.utilits

import android.renderscript.Sampler
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener

class AppValueEventListener(val onSuccess:(DataSnapshot) -> Unit): ValueEventListener{
    override fun onCancelled(error: DatabaseError) {
    }
    override fun onDataChange(snapshot: DataSnapshot) {
        onSuccess(snapshot)
    }
}