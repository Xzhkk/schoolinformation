package com.xzh.schoolinformation.pojo;

public class School {
    private int id;
    private String college;
    private String major_name;
    private int admission_persions;
    private int max_score;
    private int avg_score;
    private int min_score;
    private int min_ranking;
    public School(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getMajor_name() {
        return major_name;
    }

    public void setMajor_name(String major_name) {
        this.major_name = major_name;
    }

    public int getAdmission_persions() {
        return admission_persions;
    }

    public void setAdmission_persions(int admission_persions) {
        this.admission_persions = admission_persions;
    }

    public int getMax_score() {
        return max_score;
    }

    public void setMax_score(int max_score) {
        this.max_score = max_score;
    }

    public int getAvg_score() {
        return avg_score;
    }

    public void setAvg_score(int avg_score) {
        this.avg_score = avg_score;
    }

    public int getMin_score() {
        return min_score;
    }

    public void setMin_score(int min_score) {
        this.min_score = min_score;
    }

    public int getMin_ranking() {
        return min_ranking;
    }

    public void setMin_ranking(int min_ranking) {
        this.min_ranking = min_ranking;
    }

    @Override
    public String toString() {
        return "School{" +
                "id=" + id +
                ", college='" + college + '\'' +
                ", major_name='" + major_name + '\'' +
                ", admission_persions='" + admission_persions + '\'' +
                ", max_score=" + max_score +
                ", avg_score=" + avg_score +
                ", min_score=" + min_score +
                ", min_ranking=" + min_ranking +
                '}';
    }
}
