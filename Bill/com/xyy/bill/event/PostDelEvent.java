package com.xyy.bill.event;

import java.util.EventObject;

import com.xyy.bill.instance.BillContext;

public class PostDelEvent extends EventObject {
	private static final long serialVersionUID = -6811085297073148263L;
	private BillContext context;

	public PostDelEvent(BillContext context) {
		super(context);
		this.context = context;
	}

	public BillContext getContext() {
		return context;
	}

}
