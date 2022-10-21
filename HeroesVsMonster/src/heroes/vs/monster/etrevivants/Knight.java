package heroes.vs.monster.etrevivants;

public class Knight extends Hero{
    private String _name;
    private int _end;
    private int _for;

    Knight(){
        super();
        this._name = "Izildur";
        this._for = this.get_for() + 1;
        this._end = this.get_end() +1;
    }
}
