/**
 * 
 */
package br.com.rpires.exceptions;

import java.io.Serial;

/**
 * @author rodrigo.pires
 *
 */
public class DAOException extends Exception {

	@Serial
	private static final long serialVersionUID = 7054379063290825137L;

	public DAOException(String msg, Exception ex) {
		super(msg, ex);
    }
}
