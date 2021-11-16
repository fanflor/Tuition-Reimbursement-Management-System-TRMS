package models;

import javax.persistence.*;

@Entity
@Table(name="grades",schema="public2")
public class grades {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int gradeID;
    @Column(name="grading_Sys")
    private int grading_Sys;
    @Column(name="pass")
    private boolean pass;
    @Column(name="approval_letter")
    private boolean approval_letter;
    @Column(name="presentation")
    private boolean presentation;
public grades(){}

    public grades(int grading_Sys, boolean pass, boolean approval_letter, boolean presentation, int gradeID) {
        this.grading_Sys = grading_Sys;
        this.pass = pass;
        this.approval_letter = approval_letter;
        this.presentation = presentation;
        this.gradeID=gradeID;
    }

    public int getGrading_Sys() {
        return grading_Sys;
    }

    public grades setGrading_Sys(int grading_Sys) {
        this.grading_Sys = grading_Sys;
        return this;
    }

    public boolean isPass() {
        return pass;
    }

    public grades setPass(boolean pass) {
        this.pass = pass;
        return this;
    }

    public boolean isApproval_letter() {
        return approval_letter;
    }

    public grades setApproval_letter(boolean approval_letter) {
        this.approval_letter = approval_letter;
        return this;
    }

    public boolean isPresentation() {
        return presentation;
    }

    public grades setPresentation(boolean presentation) {
        this.presentation = presentation;
        return this;
    }

    public int getGradeID() {
        return gradeID;
    }

    public grades setGradeID(int gradeID) {
        this.gradeID = gradeID;
        return this;
    }

    @Override
    public String toString() {
        return "grades{" +
                "gradeID=" + gradeID +
                ", grading_Sys=" + grading_Sys +
                ", pass=" + pass +
                ", approval_letter=" + approval_letter +
                ", presentation=" + presentation +
                '}';
    }
}
