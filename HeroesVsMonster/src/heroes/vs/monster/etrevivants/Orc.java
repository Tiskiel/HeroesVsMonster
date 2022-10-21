package heroes.vs.monster.etrevivants;

public class Orc extends Monster {
    private int _for;


    Orc(){
        super();
        this.set_gold(this.d6.JetDeDes());
        this._for = get_for() + 1;
    }

    @Override
    public int get_for() {
        return _for;
    }
}
