package udp;

import java.io.Serializable;

import server.BoxOffice;


public interface IExchange extends Serializable {

	public void execute(BoxOffice boxOffice);
}
