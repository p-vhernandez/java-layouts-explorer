package components;

import utils.Utils;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class SideMenuUI {

    private final SideMenu sideMenu;

    private final JTree mainTree;
    private final JTree secondaryTree;
    private final DefaultMutableTreeNode quickAccess;
    private final DefaultMutableTreeNode device;

    public SideMenuUI(SideMenu sideMenu) {
        this.sideMenu = sideMenu;

        this.quickAccess =
                new DefaultMutableTreeNode("Quick access");
        this.device =
                new DefaultMutableTreeNode("Device");

        this.mainTree = new JTree(quickAccess);
        this.secondaryTree = new JTree(device);
    }

    public void initializeUI() {
        sideMenu.setBackground(Color.lightGray.brighter());
        sideMenu.setPreferredSize(new Dimension(Utils.getSideMenuWidth(),
                Utils.getScreenHeight()));

        generateMainNodes();
        generateSecondaryNodes();
        expandTrees();

        mainTree.setShowsRootHandles(true);
        mainTree.addSelectionRow(1);
        secondaryTree.setShowsRootHandles(true);

        sideMenu.add(mainTree);
        sideMenu.add(secondaryTree);
    }

    private void generateMainNodes() {
        quickAccess.add(new DefaultMutableTreeNode("Desktop"));
        quickAccess.add(new DefaultMutableTreeNode("Downloads"));
        quickAccess.add(new DefaultMutableTreeNode("Favourites"));
        quickAccess.add(new DefaultMutableTreeNode("Programs"));
    }

    private void generateSecondaryNodes() {
        device.add(new DefaultMutableTreeNode("Documents"));
        device.add(new DefaultMutableTreeNode("Images"));
        device.add(new DefaultMutableTreeNode("Music"));
        device.add(new DefaultMutableTreeNode("3D Objects"));
        device.add(new DefaultMutableTreeNode("Videos"));
        device.add(new DefaultMutableTreeNode("Storage"));
    }

    private void expandTrees() {
        for (int i = 0; i < mainTree.getRowCount(); i++) {
            mainTree.expandRow(i);
        }

        for (int i = 0; i < secondaryTree.getRowCount(); i++) {
            secondaryTree.expandRow(i);
        }
    }

}
