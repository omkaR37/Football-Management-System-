/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package football.management;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxEditor;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author mmrs
 */
public class SearchBoxModel extends AbstractListModel 
                implements ComboBoxModel, KeyListener, ItemListener
{
    ArrayList<String> db = new ArrayList<String>();
    ArrayList<String> data = new ArrayList<String>();
    String selection;
    JComboBox cb;
    ComboBoxEditor cbe;
    int currPos = 0;


    public SearchBoxModel(JComboBox jcb,ArrayList<String> db )
    {
        
        cb = jcb;
        cbe = jcb.getEditor();
//here we add the key listener to the text field that the combobox is wrapped around
        cbe.getEditorComponent().addKeyListener(this);

//set up our "database" of items - in practice you will usuallu have a proper db.
        this.db = db;
    }

    public void updateModel(String in)
    {
        data.clear();
//lets find any items which start with the string the user typed, and add it to the popup list
//here you would usually get your items from a database, or some other storage...
        for(String s:db)
            if(s.startsWith(in))
                data.add(s);

        super.fireContentsChanged(this, 0, data.size());

//this is a hack to get around redraw problems when changing the list length of the displayed popups
        cb.hidePopup();
        cb.showPopup();
        if(data.size() != 0)
            cb.setSelectedIndex(-1);
    }

    public int getSize(){return data.size();}
    public Object getElementAt(int index){return data.get(index);}
    public void setSelectedItem(Object anItem)
                                 {selection = (String) anItem;}
    public Object getSelectedItem(){return selection;}
    public void keyTyped(KeyEvent e){}
    public void keyPressed(KeyEvent e){}

    public void keyReleased(KeyEvent e)
    {
        String str = cbe.getItem().toString();
        JTextField jtf = (JTextField)cbe.getEditorComponent();
        currPos = jtf.getCaretPosition();

        if(e.getKeyChar() == KeyEvent.CHAR_UNDEFINED)
        {
            if(e.getKeyCode() != KeyEvent.VK_ENTER )
            {
                cbe.setItem(str);
                jtf.setCaretPosition(currPos);
            }
        }
        else if(e.getKeyCode() == KeyEvent.VK_ENTER)
            cb.setSelectedIndex(cb.getSelectedIndex());
        else
        {
            updateModel(cb.getEditor().getItem().toString());
            cbe.setItem(str);
            jtf.setCaretPosition(currPos);
        }
    }

    public void itemStateChanged(ItemEvent e)
    {
        cbe.setItem(e.getItem().toString());
        cb.setSelectedItem(e.getItem());
    }

}

