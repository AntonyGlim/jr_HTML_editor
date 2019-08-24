package com.javarush.task.task32.task3209;

import javax.swing.*;
import java.awt.event.ActionListener;

/** вспомогательный класс для инициализации и настройки меню */
public class MenuHelper {

    /**
     * @param parent - меню в которое мы добавляем пункт
     * @param text - текст добавляемого пункта
     * @param actionListener - слушатель действий добавляемого пункта меню
     * @return - созданный пункт меню
     */
    public static JMenuItem addMenuItem (JMenu parent, String text, ActionListener actionListener){
        JMenuItem menuItem = new JMenuItem(text);
        menuItem.addActionListener(actionListener);
        parent.add(menuItem);
        return menuItem;
    }

    /**
     * @param parent - меню в которое мы добавляем пункт
     * @param action - действие, которое необходимо выполнить при выборе пункта меню
     * @return - созданный пункт меню
     */
    public static JMenuItem addMenuItem (JMenu parent, Action action){
        JMenuItem menuItem = new JMenuItem(action);
        parent.add(menuItem);
        return menuItem;
    }

    /**
     *
     * @param parent - меню в которое мы добавляем пункт
     * @param text - текст добавляемого пункта
     * @param action - действие, которое необходимо выполнить при выборе пункта меню
     * @return
     */
    public static JMenuItem addMenuItem (JMenu parent, String text, Action action){
        JMenuItem menuItem = addMenuItem(parent, action);
        menuItem.setText(text);
        return menuItem;
    }

    public static void initHelpMenu(View view, JMenuBar menuBar){} //инициализация меню помощи.
    public static void initFontMenu(View view, JMenuBar menuBar){} //инициализация меню выбора шрифта.
    public static void initColorMenu(View view, JMenuBar menuBar){} // инициализация меню выбора цвета.
    public static void initAlignMenu(View view, JMenuBar menuBar){} // инициализация меню выравнивания.
    public static void initStyleMenu(View view, JMenuBar menuBar){} // инициализация меню выбора стиля текста.
    public static void initEditMenu(View view, JMenuBar menuBar){} //инициализация меню редактирования текста.
    public static void initFileMenu(View view, JMenuBar menuBar){} //инициализация меню Файл.
}