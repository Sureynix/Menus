import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIMenu implements ActionListener
{
    private JFrame frame;


    public static void main (String[] args)
    {
        GUIMenu gui = new GUIMenu();
        gui.start();
        System.setProperty("apple.laf.useScreenMenuBar", "true");
    }

    public void start()
    {
        frame = new JFrame("GUI Menus");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        makeMenus();


        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    private void makeMenus() {
        JMenuBar menuBar;
        JMenu menu;
        JMenuItem menuItem;
        menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
        menu = new JMenu("File");
        menuBar.add(menu);
        menuItem = new JMenuItem("New");
        menuItem.addActionListener(new newListener());
        menu.add(menuItem);
        menuItem = new JMenuItem("Open");
        menuItem.addActionListener(new newListener());
        menu.add(menuItem);
        menuItem = new JMenuItem("Save");
        menuItem.addActionListener(new newListener());
        menu.add(menuItem);
        menuItem = new JMenuItem("Save As...");
        menu.add(menuItem);
        menuItem.addActionListener(new newListener());
        menu.addSeparator();
        menuItem = new JMenuItem("Exit");
        menuItem.addActionListener(new newListener());
        menu.add(menuItem);

    }
    private class newListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (e.getActionCommand().equals("New"))
                New();
            if (e.getActionCommand().equals("Open"))
                Open();
            if (e.getActionCommand().equals("Save")) {
                Save();
            }
            if (e.getActionCommand().equals("Save As.")) {
                SaveAs();
            }
            if (e.getActionCommand().equals("Exit")) {
                System.exit(0);
            }
        }
    }
    public void actionPerformed (ActionEvent e) {

    }


    private void New() {
        JOptionPane.showMessageDialog(frame,
                "The  File > New  menu option was clicked",
                "Menu Item Click",
                JOptionPane.INFORMATION_MESSAGE);
    }
    private void Open() {
        JOptionPane.showMessageDialog(frame,
                "The  File > Open  menu option was clicked",
                "Menu Item Click",
                JOptionPane.INFORMATION_MESSAGE);
    }
    private void Save() {
        JOptionPane.showMessageDialog(frame,
                "The  File > Save  menu option was clicked",
                "Menu Item Click",
                JOptionPane.INFORMATION_MESSAGE);
    }

    private void SaveAs() {
        JOptionPane.showMessageDialog(frame,
                "The  File > Save As... menu option was clicked",
                "Menu Item Click",
                JOptionPane.INFORMATION_MESSAGE);
    }

}