/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

/**
 *
 * @author Matheus Barbieri
 */
public class NotMenuOptionException extends Exception {

    /**
     * Creates a new instance of <code>NotMenuOptionException</code> without
     * detail message.
     */
    public NotMenuOptionException() {
    }

    /**
     * Constructs an instance of <code>NotMenuOptionException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NotMenuOptionException(String msg) {
        super(msg);
    }
}
