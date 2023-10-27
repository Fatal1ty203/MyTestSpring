package poject.mytreny.binarysearch;

import java.util.List;

public class Gun {
    private int damage;
    private int valueAmo;

    public int getDamage(){
        return damage;
    }

    public int getValueAmo(){
        return valueAmo;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class SortGuns{
    private int[] guns;
    private List<Gun> gunList;

    public SortGuns(int[] guns){
        this.guns = guns;
    }

    public SortGuns(List<Gun> gunList){
        this.gunList = gunList;
    }

    public int[] getGuns(){
        return guns;
    }

    public List<Gun> gunList(){
        return gunList;
    }



}
