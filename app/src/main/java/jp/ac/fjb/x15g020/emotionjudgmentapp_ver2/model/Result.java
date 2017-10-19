package jp.ac.chiba_fjb.a.realm_android;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class Result extends RealmObject {
    @PrimaryKey
    public int ResultID;
    public StageStatus StageID;
    public String picture;
    public int Score;

    public int getResultID() {
        return ResultID;
    }

    public void setResultID(int resultID) {
        ResultID = resultID;
    }

    public StageStatus getStageID() {
        return StageID;
    }

    public void setStageID(StageStatus stageID) {
        StageID = stageID;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }
}
