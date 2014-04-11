import java.util.List;

public class TriggerTurnRune extends Rune {

	public TriggerTurnRune(String variableIn) {
		super(variableIn);
	}

	public List<Cell> activate(List<Cell> cellListIn) {
		// returns cellListIn if it's the beginning of the turn and an empty list otherwise
		return cellListIn;
	}
}
