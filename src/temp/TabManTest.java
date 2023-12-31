/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package temp;

/**
 *
 * @author Yougeshwar
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class TabManTest implements ActionListener {
    TabManager tabManager;
 
    public void actionPerformed(ActionEvent e) {
        JComboBox combo = (JComboBox)e.getSource();
        String item = (String)combo.getSelectedItem();
        String[] titles = item.split("\\,\\s");
        tabManager.setTabs(titles);
    }
 
    private JPanel getSourceComponent() {
        String[] items = {
            "two, four, three", "five, two, one, three",
            "two, one, five, four", "one, five, three"
        };
        JComboBox comboBox = new JComboBox(items);
        comboBox.addActionListener(this);
        JPanel panel = new JPanel();
        panel.add(comboBox);
        return panel;
    }
 
    private JTabbedPane getTabbedComponent() {
        JTabbedPane tabbedPane = new JTabbedPane();
        String[] titles = {
            "one", "two", "three", "four", "five"
        };
        JComponent[] children = initComponents();
        tabManager = new TabManager(tabbedPane, titles, children);
        return tabbedPane;
    }
 
    private JComponent[] initComponents() {
        Color[] colors = {
            Color.red, Color.green, Color.blue,
            Color.magenta, Color.yellow
        };
        JPanel[] panels = new JPanel[colors.length];
        for(int i = 0; i < colors.length; i++) {
            JLabel label = new JLabel(String.valueOf(i+1), JLabel.CENTER);
            label.setFont(label.getFont().deriveFont(18f));
            panels[i] = new JPanel(new BorderLayout());
            panels[i].add(label);
            panels[i].setBackground(colors[i]);
        }
        return panels;
    }
 
    public static void main(String[] args) {
        TabManTest test = new TabManTest();
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(test.getSourceComponent(), "First");
        f.add(test.getTabbedComponent());
        f.setSize(400,400);
        f.setLocation(50,50);
        f.setVisible(true);
    }
}
 
class TabManager {
    JTabbedPane tabbedPane;
    String[] titles;
    JComponent[] components;
 
    public TabManager(JTabbedPane tabbedPane, String[] titles,
                      JComponent[] components) {
        this.tabbedPane = tabbedPane;
        this.titles = titles;
        this.components = components;
        setTabs(titles);
    }
 
    public void setTabs(String[] titles) {
        removeTabs(titles);
        addTabs(titles);
    }
 
    private void addTabs(String[] titles) {
        String[] tabTitles = getTabTitles();
        for(int i = 0; i < titles.length; i++) {
            String title = titles[i];
            if(!contains(tabTitles, title)) {
                insert(title);
            }
        }
    }
 
    private void insert(String title) {
        String[] tabTitles = getTabTitles();
        int index = getIndex(tabTitles, title);
        JComponent component = components[getIndex(title)];
        if(index == -1) {
            tabbedPane.addTab(title, component);
        } else {
            tabbedPane.insertTab(title, null, component, null, index);
        }
    }
 
    private int getIndex(String[] array, String insert) {
        int insertIndex = getIndex(insert);
        for(int i = 0; i < array.length; i++) {
            int index = getIndex(array[i]);
            if(insertIndex < index) {;
                return i;
            }
        }
        return -1;
    }
 
    private int getIndex(String str) {
        for(int i = 0; i < titles.length; i++) {
            if(titles[i].equals(str)) {
                return i;
            }
        }
        return -1;
    }
 
    private void removeTabs(String[] titles) {
        String[] tabTitles = getTabTitles();
        for(int i = tabTitles.length-1; i >= 0; i--) {
            String title = tabTitles[i];
            if(!contains(titles, title)) {
                tabbedPane.removeTabAt(i);
            }
        }
    }
 
    private boolean contains(String[] array, String element) {
        for(int i = 0; i < array.length; i++) {
            if(array[i].equals(element)) {
                return true;
            }
        }
        return false;
    }                
 
    private String[] getTabTitles() {
        int tabCount = tabbedPane.getTabCount();
        String[] titles = new String[tabCount];
        for(int i = 0; i < tabCount; i++) {
            titles[i] = tabbedPane.getTitleAt(i);
        }
        return titles;
    }
}