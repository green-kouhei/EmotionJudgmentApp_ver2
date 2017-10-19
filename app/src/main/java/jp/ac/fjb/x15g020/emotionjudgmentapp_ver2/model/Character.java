package jp.ac.chiba_fjb.a.realm_android;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class Character extends RealmObject {

    @PrimaryKey
    public int CharaID;
    public String file1;
    public String file2;
    public String file3;

    public int getCharaID() {
        return CharaID;
    }

    public void setCharaID(int charaID) {
        CharaID = charaID;
    }

    public String getFile1() {
        return file1;
    }

    public void setFile1(String file1) {
        this.file1 = file1;
    }

    public String getFile2() {
        return file2;
    }

    public void setFile2(String file2) {
        this.file2 = file2;
    }

    public String getFile3() {
        return file3;
    }

    public void setFile3(String file3) {
        this.file3 = file3;
    }


}

