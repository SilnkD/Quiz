package com.example.quiz;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.quiz.placeholder.PlaceholderContent;

import java.util.List;

public class ScoreAdapter extends RecyclerView.Adapter<ScoreAdapter.ViewHolder> {

    private List<PlaceholderContent.PlaceholderItem> quizItems;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView quizDate;
        public TextView quizDifficulty;
        public TextView quizScore;

        public ViewHolder(View view) {
            super(view);
            quizDate = view.findViewById(R.id.quiz_date);
            quizDifficulty = view.findViewById(R.id.quiz_difficulty);
            quizScore = view.findViewById(R.id.quiz_score);
        }
    }

    public ScoreAdapter(List<PlaceholderContent.PlaceholderItem> items) {
        this.quizItems = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_score, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.quizDate.setText("Date");
        holder.quizDifficulty.setText("Medium");
        holder.quizScore.setText(String.valueOf("10"));
    }

    @Override
    public int getItemCount() {
        return quizItems.size();
    }
}