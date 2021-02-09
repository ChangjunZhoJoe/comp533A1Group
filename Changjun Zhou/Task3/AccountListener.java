package bankwithlogging;

import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import java.awt.event.ActionEvent;

// Start of user code for imports
// End of user code

/**
 * AccountListener class definition.
 * Generated by the TouchCORE code generator.
 */
public class AccountListener implements ActionListener {
    
    protected DefaultListModel<Account> accountListModel;
    protected JList<Customer> customerList;
    protected JList<Account> accountList;
    
    public AccountListener(DefaultListModel<Account> listModel, JList<Customer> custList, JList<Account> accList) {
        this.accountListModel = listModel;
        this.customerList = custList;
        this.accountList = accList;
    }

    public void actionPerformed(ActionEvent e) {
        Customer selectedCustomer = customerList.getSelectedValue();
        Account newAccount = new Account(0, selectedCustomer);
        accountListModel.insertElementAt(newAccount, 0);
        accountList.setSelectedIndex(0);
    }

    DefaultListModel<Account> getAccountListModel() {
        /* TODO: No message view defined */
        return null;
    }

    boolean setAccountListModel(DefaultListModel<Account> newObject) {
        /* TODO: No message view defined */
        return false;
    }

    JList<Customer> getCustomerList() {
        /* TODO: No message view defined */
        return null;
    }

    boolean setCustomerList(JList<Customer> newObject) {
        /* TODO: No message view defined */
        return false;
    }

    JList<Account> getAccountList() {
        /* TODO: No message view defined */
        return null;
    }

    boolean setAccountList(JList<Account> newObject) {
        /* TODO: No message view defined */
        return false;
    }
}
