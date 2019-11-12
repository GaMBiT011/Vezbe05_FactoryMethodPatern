/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import view.factory.PersonViewFactory;

/**
 *
 * @author Nikola
 */
public class Client {

    PersonViewFactory personViewFactory;

    public Client(PersonViewFactory personViewFactory) {
        this.personViewFactory = personViewFactory;
    }

    public void create() {
        personViewFactory.create();
    }
}
