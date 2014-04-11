import java.util.List;

public class EffectDamageRune extends Rune {

	public EffectDamageRune(String variableIn) {
		super(variableIn);
	}

	public List<Cell> activate(List<Cell> cellListIn) {
		for(Cell i:cellListIn){
			i.getUnit().setCurrentHP(i.getUnit().getCurrentHP()-variable);
		}
		return cellListIn;
	}
}
