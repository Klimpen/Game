import java.util.List;


public class EffectDebuffRune extends Rune {

	@Override
	public List<Cell> activate(List<Cell> cellListIn) {
		for(int i=0; i<cellListIn.size(); i++){
			cellListIn.get(i).getUnit();//.addBuff();
		}
		return cellListIn;
	}

}
