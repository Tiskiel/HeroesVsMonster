package heroes.vs.monster.etrevivants;

import heroes.vs.monster.Des;

public class Etresvivant {
    private final int _end;
    private final int _for;
    private final int _pv;
    private int _gold;
    private int _leather;

    private int _x;
    private int _y;


    Des d6 = new Des(6);
    Des d4 = new Des(4);

    Des d15 = new Des(15);

    Etresvivant(){
        this._end = d6.JetDeDes();
        this._for = d6.JetDeDes();
        this._pv = this._end + Modificateur(this._end);
        this._gold = 0;
        this._leather = 0;
        this._x = d15.jetDeDe();
        this._y = d15.jetDeDe();
    }

    private int Modificateur (int carac) {
        return carac > 15 ? 2 : carac > 10 ? 1 : carac > 5 ? 0 : -1;
    }

    public int Hit (int carac, Etresvivant enemy) {
        int hit = this.d4.JetDeDes() + Modificateur(this._for);
        return enemy._pv - hit;
    }

    public int get_end() {
        return _end;
    }

    public int get_for() {
        return _for;
    }

    public int get_pv() {
        return _pv;
    }

    public int get_gold() {
        return _gold;
    }

    public int get_leather() {
        return _leather;
    }

    public void set_gold(int _gold) {
        this._gold = _gold;
    }

    public void set_leather(int _leather) {
        this._leather = _leather;
    }
}
