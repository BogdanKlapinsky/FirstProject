package ua.form;
import java.util.List;
public class AmountFilter {
private int min;
	private int max;
	private List<Integer> itemId;
	private List<Integer> msId;
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public List<Integer> getItemId() {
		return itemId;
	}
	@Override
	public String toString() {
		return "AmountFilter [min=" + min + ", max=" + max + ", ingredientId="
				+ itemId + ", msId=" + msId + "]";
	}
}
