import java.util.List;


public class EffectStatusRune extends Rune {
	private String type;
	
	public EffectStatusRune(String variableIn, String typeIn){
		// variable is duration
		super(variableIn);
		type = typeIn;
	}
	
	public List<Cell> activate(List<Cell> cellListIn) {
		
		/*
		 * List of potential status effects:
		 * 
		 * Silence // isLegalMove.activateAbility()==false
		 * Stun // Perplex + Silence + Immobilise + Disarm
		 * Disarm // isLegalMove.attack()==false
		 * Sleep // Stun + onTrigger.isDamaged().removeDebuff(this)
		 * Taunt // onAttack.target(this.getUnit())
		 * Immobilise // isLegalMove.move()==false
		 * Stop // Stun + this.onDamage.setDamage()==0
		 * Weaken // 
		 * Perplex // isLegalMove.useItem()==false
		 * Unit Walk // isLegalMove.setUnit()==false
		 * Environment Walk // isLegalMove.setDoodads()==false + isLegalMove.setUnit()==false
		 * Magic Immune // if(this.damageType()!=physical) this.onDamage.setDamage()==0
		 * Physical Immune // if(this.damageType()==physical) this.onDamage.setDamage()==0
		 * Invis // 
		 * Retaliate // this.onAttack.attack(this)
		 * 
		 * Damage Taken this.onDamage.setDamage(this.onDamage.getDamage()*x)
	`	 * Damage Done
		 * Heal this.dealDamage(-x)
		 * Shield if(this.exists()) this.onDamage.setDamage(this.onDamage.getDamage-this.get()); this.set()=this.get()-this.onDamage.getDamage()
		 * Movement Speed 
		 * Attack Speed
		 * Enlargen unit.setSize(unit.getSize()+1)
		 * Smallen unit.setSize(unit.getSize()-1)
		 */
		
		for(Cell i : cellListIn){
			if(i.getUnit().getStatusMap().get(type)<variable){ // makes the unit be affected by the set status effect
				i.getUnit().getStatusMap().put(type, variable); // iff the duration will be longer
			}
		}
		return cellListIn;
	}
}
