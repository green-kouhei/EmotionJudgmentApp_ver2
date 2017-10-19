package jp.ac.chiba_fjb.a.realm_android;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class StageStatus extends RealmObject {
    @PrimaryKey
    public int StageID;
    public String StageName;
    public Boolean OpenFlag;
    public Character CharaID;
    public int FaceCode;

    public int getStageID() {
        return StageID;
    }

    public void setStageID(int stageID) {
        StageID = stageID;
    }

    public String getStageName() {
        return StageName;
    }

    public void setStageName(String stageName) {
        StageName = stageName;
    }

    public Boolean getOpenFlag() {
        return OpenFlag;
    }

    public void setOpenFlag(Boolean openFlag) {
        OpenFlag = openFlag;
    }

    public Character getCharaID() {
        return CharaID;
    }

    public void setCharaID(Character charaID) {
        CharaID = charaID;
    }

    public int getFaceCode() {
        return FaceCode;
    }

    public void setFaceCode(int faceCode) {
        FaceCode = faceCode;
    }




}

