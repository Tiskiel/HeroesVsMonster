package heroes.vs.monster.etrevivants;

public class Hero extends Etresvivant {

    public Hero() {
        super();

    }

    public void Strip(Etresvivant enmy) {
        if (enmy != this) {
            if(enmy.get_gold() > 0) {
                this.set_gold(enmy.get_gold()) ;
            }else this.set_gold(enmy.get_leather());
        }
    }

    public int Rest() {
        return this.get_pv();
    }

}
