package org.book.chapter02.ex10;

import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import java.io.Serializable;

@ConversationScoped // используется для длительных процессов с началом и концом
public class CustomerCreationWizard implements Serializable{

    private Login login;
    private Account account;

    @Inject
    private CustomerService customerService;

    @Inject
    private Conversation conversation;

    public void saveLogin() {
        conversation.begin();
        login = new Login();
    }

    public void saveAccount() {
        account = new Account();
    }

    public void createCustomer() {
        Customer customer = new Customer();
        customer.setLogin(login);
        customer.setAccount(account);
        customerService.createCustomer(customer);
        conversation.end();
    }
}
