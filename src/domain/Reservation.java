package domain;

import server.BoxOffice;
import udp.IExchange;

public class Reservation implements IExchange {
	
	private static final long serialVersionUID = 1L;
	
	private boolean is_confirmed = false;
	private int customer_id, no_tickets;
	private String show_id;
	
	/**
	 * Exchange tickets via UDP between box-office servers
	 * @param customer_id
	 * @param show_id
	 * @param no_tickets
	 */
	public Reservation(int customer_id, String show_id, int no_tickets) {
		this.customer_id = customer_id;
		this.show_id = show_id;
		this.no_tickets = no_tickets;
	}
	
	public boolean isConfirmed() {
		return is_confirmed;
	}

	@Override
	public void execute(BoxOffice boxOffice) {
		
		try {
			boxOffice.reserve(customer_id, show_id, no_tickets);
			is_confirmed = true;
		} catch (Exception e) {
			is_confirmed = false;
		}
	}
	

}
