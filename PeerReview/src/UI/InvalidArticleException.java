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
public class InvalidArticleException extends Exception {

    /**
     * Creates a new instance of <code>InvalidArticleIdException</code> without
     * detail message.
     */
    public InvalidArticleException() {
    }

    /**
     * Constructs an instance of <code>InvalidArticleIdException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public InvalidArticleException(String msg) {
        super(msg);
    }
}
