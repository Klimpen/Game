import java.util.List;


public class EffectDamageRune extends Rune {

	
	public EffectDamageRune(){
		variable = 50;
	}

	public List<Cell> activate(List<Cell> cellListIn) {
		for(int i=0; i<cellListIn.size(); i++){
			cellListIn.get(i).getUnit().setCurrentHP(cellListIn.get(i).getUnit().getCurrentHP()-variable);
		}
		return cellListIn;
	}
}
