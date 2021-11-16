package services;

import Repository.gradesRepo;
import models.grades;

import java.util.List;

public class gradesHbIMM implements  gradesService {
    gradesRepo oner;

    public gradesHbIMM(gradesRepo one) {
        this.oner=one;
    }

    @Override
    public grades addGrades(grades one) {
        return oner.addGrades(one);
    }

    @Override
    public List<grades> getAllGrades() {
        return oner.getAllGrades();
    }

    @Override
    public grades getGradesById(int id) {
        return oner.getGradesById(id);
    }

    @Override
    public grades updateGrades(grades change) {
        return oner.updateGrades(change);
    }

    @Override
    public grades deleteGrades(int id) {
        return oner.deleteGrades(id);
    }
}
