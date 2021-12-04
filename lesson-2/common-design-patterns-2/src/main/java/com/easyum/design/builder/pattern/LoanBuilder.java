package com.easyum.design.builder.pattern;

public interface LoanBuilder {
	void loanApply();
	void loanApproval();
	void loanSanction();
	Loan loanDisburse();
}
