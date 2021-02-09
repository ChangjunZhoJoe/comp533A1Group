package bankwithlogging;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;
import java.lang.Runnable;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import javax.swing.SwingUtilities;
import javax.swing.DefaultListModel;
import javax.swing.text.Document;
import javax.swing.JFrame;
import javax.swing.event.ListSelectionListener;
import java.awt.BorderLayout;
import javax.swing.event.ListSelectionEvent;
import javax.swing.JPanel;

// Start of user code for imports
// End of user code

/**
 * BankWithLogging class definition.
 * Generated by the TouchCORE code generator.
 */
public class BankWithLogging extends JPanel implements ListSelectionListener {
    
    protected DefaultListModel<Customer> customerListModel;
    protected JList<Customer> customerList;
    protected JButton createCustomerButton;
    protected JButton createAccountButton;
    protected JTextField customerNameField;
    protected DefaultListModel<Account> accountListModel;
    protected JList<Account> accountList;
    protected JButton depositButton;
    protected JButton withdrawButton;
    protected JTextField amountField;
    
    public BankWithLogging() {
        BorderLayout borderlayout = new BorderLayout();
        super.setLayout(borderlayout);
        this.customerListModel = new DefaultListModel<Customer>();
        this.customerList = new JList<Customer>(customerListModel);
        customerList.setSelectionMode(0);
        customerList.setVisibleRowCount(5);
        customerList.addListSelectionListener(this);
        JScrollPane jscrollpane = new JScrollPane(this.customerList);
        this.accountListModel = new DefaultListModel<Account>();
        this.accountList = new JList<Account>(accountListModel);
        accountList.setSelectionMode(0);
        accountList.setVisibleRowCount(5);
        accountList.addListSelectionListener(this);
        JScrollPane jscrollpane2 = new JScrollPane(this.accountList);
        this.createCustomerButton = new JButton("Create Customer");
        createCustomerButton.setEnabled(true);
        this.customerNameField = new JTextField(10);
        this.createAccountButton = new JButton("Create Account");
        CustomerListener createCustomerListener = new CustomerListener(this.createCustomerButton, this.customerNameField, this.customerListModel, this.createAccountButton, this.customerList);
        createCustomerButton.addActionListener(createCustomerListener);
        Document document = customerNameField.getDocument();
        document.addDocumentListener(createCustomerListener);
        createCustomerButton.setEnabled(false);
        createAccountButton.setEnabled(false);
        AccountListener createAccountListener = new AccountListener(this.accountListModel, this.customerList, this.accountList);
        createAccountButton.addActionListener(createAccountListener);
        this.amountField = new JTextField(10);
        this.depositButton = new JButton("Deposit");
        AccountActionListener accountActionListener = new AccountActionListener(this.depositButton, this.amountField, this.accountList, true, this);
        depositButton.addActionListener(accountActionListener);
        depositButton.setEnabled(false);
        Document amountDocument = amountField.getDocument();
        amountDocument.addDocumentListener(accountActionListener);
        this.withdrawButton = new JButton("Withdraw");
        AccountActionListener accountActionListener2 = new AccountActionListener(this.withdrawButton, this.amountField, this.accountList, false, this);
        withdrawButton.addActionListener(accountActionListener2);
        withdrawButton.setEnabled(false);
        amountDocument.addDocumentListener(accountActionListener2);
        JPanel buttonPanel = new JPanel();
        GridLayout gridlayout = new GridLayout(0, 2);
        buttonPanel.setLayout(gridlayout);
        buttonPanel.add(this.customerNameField);
        buttonPanel.add(this.createCustomerButton);
        Component filler = Box.createHorizontalStrut(5);
        buttonPanel.add(filler);
        buttonPanel.add(this.createAccountButton);
        buttonPanel.add(this.amountField);
        buttonPanel.add(this.depositButton);
        Component anotherFiller = Box.createHorizontalStrut(5);
        buttonPanel.add(anotherFiller);
        buttonPanel.add(this.withdrawButton);
        String pos = BorderLayout.PAGE_START;
        super.add(jscrollpane, pos);
        pos = BorderLayout.CENTER;
        super.add(jscrollpane2, pos);
        pos = BorderLayout.PAGE_END;
        super.add(buttonPanel, pos);
    }

    public static void main(String[] args) {
        Runnable r = new Runnable() { public void run() { createAndShowGUI(); } };
        SwingUtilities.invokeLater(r);
    }

    public static void createAndShowGUI() {
        JFrame myFrame = new JFrame("Bank Application");
        int operationConstant = JFrame.EXIT_ON_CLOSE;
        myFrame.setDefaultCloseOperation(operationConstant);
        BankWithLogging contentPane = new BankWithLogging();
        contentPane.setOpaque(true);
        myFrame.setContentPane(contentPane);
        myFrame.pack();
        myFrame.setVisible(true);
    }

    DefaultListModel<Customer> getCustomerListModel() {
        /* TODO: No message view defined */
        return null;
    }

    boolean setCustomerListModel(DefaultListModel<Customer> newObject) {
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

    public void valueChanged(ListSelectionEvent arg0) {
        boolean valueIsAdjusting = arg0.getValueIsAdjusting();
        if (!valueIsAdjusting) {
            int selectedIndex = customerList.getSelectedIndex();
            if (selectedIndex == -1) {
                
            }
        }
    }

    JButton getCreateCustomerButton() {
        /* TODO: No message view defined */
        return null;
    }

    boolean setCreateCustomerButton(JButton newObject) {
        /* TODO: No message view defined */
        return false;
    }

    JButton getCreateAccountButton() {
        /* TODO: No message view defined */
        return null;
    }

    boolean setCreateAccountButton(JButton newObject) {
        /* TODO: No message view defined */
        return false;
    }

    JTextField getCustomerNameField() {
        /* TODO: No message view defined */
        return null;
    }

    boolean setCustomerNameField(JTextField newObject) {
        /* TODO: No message view defined */
        return false;
    }

    DefaultListModel<Account> getAccountListModel() {
        /* TODO: No message view defined */
        return null;
    }

    boolean setAccountListModel(DefaultListModel<Account> newObject) {
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

    JButton getDepositButton() {
        /* TODO: No message view defined */
        return null;
    }

    boolean setDepositButton(JButton newObject) {
        /* TODO: No message view defined */
        return false;
    }

    JButton getWithdrawButton() {
        /* TODO: No message view defined */
        return null;
    }

    boolean setWithdrawButton(JButton newObject) {
        /* TODO: No message view defined */
        return false;
    }

    JTextField getAmountField() {
        /* TODO: No message view defined */
        return null;
    }

    boolean setAmountField(JTextField newObject) {
        /* TODO: No message view defined */
        return false;
    }
}
