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
public class InvalidNumberOfReviewersException extends Exception {

    /**
     * Creates a new instance of <code>InvalidNumberOfReviewersException</code>
     * without detail message.
     */
    public InvalidNumberOfReviewersException() {
    }

    /**
     * Constructs an instance of <code>InvalidNumberOfReviewersException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public InvalidNumberOfReviewersException(String msg) {
        super(msg);
    }
}
