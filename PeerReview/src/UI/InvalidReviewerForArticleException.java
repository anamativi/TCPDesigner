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
public class InvalidReviewerForArticleException extends Exception {

    /**
     * Creates a new instance of
     * <code>InvalidResearcherForArtivleException</code> without detail message.
     */
    public InvalidReviewerForArticleException() {
    }

    /**
     * Constructs an instance of
     * <code>InvalidResearcherForArtivleException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public InvalidReviewerForArticleException(String msg) {
        super(msg);
    }
}
