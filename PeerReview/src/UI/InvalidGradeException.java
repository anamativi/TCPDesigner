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
public class InvalidGradeException extends Exception {

    /**
     * Creates a new instance of <code>InvalidGradeException</code> without
     * detail message.
     */
    public InvalidGradeException() {
    }

    /**
     * Constructs an instance of <code>InvalidGradeException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public InvalidGradeException(String msg) {
        super(msg);
    }
}
