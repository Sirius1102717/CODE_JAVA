package swingDemo.tree;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import java.awt.*;

/**
 * @author Freaver
 * @date 07/02/2021 17:05
 */
public class ChangeAllCellRender {

    JFrame jf = new JFrame("改变所有结点外观");

    JTree tree;

    DefaultMutableTreeNode root = new DefaultMutableTreeNode("中国");
    DefaultMutableTreeNode guangdong = new DefaultMutableTreeNode("广东");
    DefaultMutableTreeNode guangxi = new DefaultMutableTreeNode("广西");
    DefaultMutableTreeNode foshan = new DefaultMutableTreeNode("佛山");
    DefaultMutableTreeNode shantou = new DefaultMutableTreeNode("汕头");
    DefaultMutableTreeNode guilin = new DefaultMutableTreeNode("桂林");
    DefaultMutableTreeNode nanning = new DefaultMutableTreeNode("南宁");

    public void init() {
        //通过add()方法建立父子层级关系
        guangdong.add(foshan);
        guangdong.add(shantou);
        guangxi.add(guilin);
        guangxi.add(nanning);
        root.add(guangdong);
        root.add(guangxi);

        tree = new JTree(root);

        DefaultTreeCellRenderer cellRenderer = new DefaultTreeCellRenderer();

        cellRenderer.setBackgroundNonSelectionColor(new Color(220, 220, 220));

        cellRenderer.setBackgroundNonSelectionColor(new Color(140, 140, 140));

        cellRenderer.setClosedIcon(new ImageIcon("img/tree/close.gif"));

        cellRenderer.setFont(new Font("JetBrains Mono", Font.BOLD, 16));

        cellRenderer.setLeafIcon(new ImageIcon("img/tree/leaf.gif"));

        cellRenderer.setOpenIcon(new ImageIcon("img/tree/open.gif"));

        cellRenderer.setTextNonSelectionColor(new Color(255,0, 0));

        cellRenderer.setTextSelectionColor(new Color(0, 0, 255));

        tree.setCellRenderer(cellRenderer);

        tree.setShowsRootHandles(true);

        tree.setRootVisible(true);

        jf.add(new JScrollPane(tree));
        jf.pack();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new ChangeAllCellRender().init();
    }
}
