package com.ssafy.back_end.exercise.service;

import com.ssafy.back_end.exercise.model.ExerciseDto;

import java.util.List;

public interface WorkoutExerciseService {
    List<ExerciseDto> getAllExercises();
    ExerciseDto getExerciseById(int exerciseId);
    boolean isFavoriteExercise(int exerciseId, int userId);
    int favoriteExercise(int exerciseId, int userId);
    int unfavoriteExercise(int exerciseId, int userId);
}
