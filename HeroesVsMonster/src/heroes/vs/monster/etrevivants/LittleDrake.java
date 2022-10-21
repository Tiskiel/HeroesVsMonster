package heroes.vs.monster.etrevivants;

public class LittleDrake extends Monster{
    private int _end;

    LittleDrake(){
        super();
        this.set_gold(this.d6.JetDeDes());
        this.set_leather(this.d4.JetDeDes());
        this._end = get_end() + 1;
    }

    @Override
    public int get_end() {
        return _end;
    }
}
