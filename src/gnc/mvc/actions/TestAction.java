package gnc.mvc.actions;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6725355306332185263L;
	private int operand1;
	private int operand2;

	public String execute() throws Exception {
		if (getSum() >= 0) 
		{
			return "positive";
		} else 
		{
			return "negative";
		}
	}

	public int getOperand1() {
		return operand1;
	}

	public void setOperand1(int operand1) {
		System.out.println(operand1);
		this.operand1 = operand1;
	}

	public int getOperand2() {
		return operand2;
	}

	public void setOperand2(int operand2) {
		System.out.println(operand2);
		this.operand2 = operand2;
	}

	public int getSum() {
		return operand1 + operand2; // 计算两个整数的代码数和
	}
}