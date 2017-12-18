import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JXAddressView implements ActionListener {
    private JXplorer explorer;
    private JLabel addressLabel;
    private JTextField textField;
    private JButton button;

    public JXAddressView(JXplorer explorer) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.explorer = explorer;

        this.addressLabel = new JLabel();
        this.addressLabel.setText("Address");
        panel.add(this.addressLabel);

        this.textField = new JTextField();
        this.textField.setText(explorer.getCurrentFile().getPath());
        this.textField.setColumns(20);
        panel.add(this.textField);

        this.button = new JButton();
        this.button.setText("Enter");
        this.button.addActionListener(this );
        panel.add(this.button);

        frame.pack();
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        this.explorer.setCurrentFile(new JXploreFile(this.textField.getText()));
        this.explorer.printSubFiles(explorer.getCurrentFile());
    }
}
