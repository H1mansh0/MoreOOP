package lotr;
import kick.KickStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public abstract class Character implements KickStrategy{
    public int power;
    public int hp;
    public KickStrategy kickStrategy;

    public void setHp(int val) {
        if (val <= 0 ) {
            this.hp = 0;
        } else {
            this.hp = val;
        }   
    }

    public void kick(Character opponent) {
        kickStrategy.kick(this, opponent);
    }

    public boolean isAlive() {
        if (this.hp <= 0) {
            return false;
        } else {
            return true;
        }
    }

    public String toString(){
        return this.getClass().getSimpleName()+"{hp=" + hp + ", power=" + power + "}"; 
    }
}
