package com.example.notekeeper.Listeners;

import androidx.cardview.widget.CardView;

import com.example.notekeeper.Models.Notes;

public interface NoteClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
