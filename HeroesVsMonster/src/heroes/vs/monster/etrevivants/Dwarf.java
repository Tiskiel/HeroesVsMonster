package heroes.vs.monster.etrevivants;

public class Dwarf extends Hero {
    private String _name;
    private int _end;

    Dwarf() {
        super();
        this._name = "Gimly";
        this._end = this.get_end() + 2;
    }
}
