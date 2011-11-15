package server;

import server.BoxOffice;
/**
 * This is a wrapper class written for the BoxOffice
 * Since WSDL's cannot have void methods we'll just return null here
 * @author ben
 *
 */
public class BoxOfficeWS {

	private BoxOffice boxOffice = null;
	
	public BoxOfficeWS(String location, String host, int port) throws Exception {
			boxOffice = new BoxOffice(location, host, port);
	}
	
	public Object shutdown() {
		boxOffice.shutdown();
		return null;
	}
	
	public Object reserve(int customer_id, String show_id, int quantity) throws Exception {
		boxOffice.reserve(customer_id, show_id, quantity);
		return null;
	}

	public Object cancel(int customer_id, String show_id, int qty) throws Exception {
		boxOffice.cancel(customer_id, show_id, qty);
		return null;
	}


	public int show(String show_id) throws Exception {
		return boxOffice.show(show_id);
		
	}


	public Object createEvent(String event_id, String title, int capacity) throws Exception {
		boxOffice.createEvent(event_id, title, capacity);
		return null;
	}

	public String[] allEvents() {
		return boxOffice.allEvents();
	}

	public Object exchange(int customer_id, String reserved_event_id, int reserved_tickets, String desired_event_id, int desired_tickets) throws Exception {
		boxOffice.exchange(customer_id, reserved_event_id, reserved_tickets, desired_event_id, desired_tickets);	
		return null;
	}

	public String getUDPHost() {
		return boxOffice.getUDPHost();
	}
	

	public int getUDPPort() {
		return boxOffice.getUDPPort();
	}

}
