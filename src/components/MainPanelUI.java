package components;

import utils.Utils;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class MainPanelUI {

    private final MainPanel mainPanel;

    public MainPanelUI(MainPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    public void initializeUI() {
        mainPanel.setPreferredSize(new Dimension(Utils.getMainPanelWidth(),
                Utils.getMainPanelHeight()));
        mainPanel.setMaximumSize(mainPanel.getPreferredSize());
        mainPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        mainPanel.setBorder(new EmptyBorder(20, 20, 20, 20));

        generateDefaultAccesses();
    }

    private void generateDefaultAccesses() {
        JButton folder1 = Utils.generateIconButton(this, "folder", "Folder 1", true);
        JButton folder2 = Utils.generateIconButton(this, "folder", "Folder 2", true);
        JButton folder3 = Utils.generateIconButton(this, "folder", "Folder 3", true);

        JButton file1 = Utils.generateIconButton(this, "doc", "Document 1", true);
        JButton file2 = Utils.generateIconButton(this, "doc", "Document 2", true);

        JButton pic1 = Utils.generateIconButton(this, "picture", "Picture 1", true);
        JButton pic2 = Utils.generateIconButton(this, "picture", "Picture 2", true);

        JButton video1 = Utils.generateIconButton(this, "video", "Video 1", true);
        JButton video2 = Utils.generateIconButton(this, "video", "Video 2", true);
        JButton video3 = Utils.generateIconButton(this, "video", "Video 3", true);

        mainPanel.add(folder1);
        mainPanel.add(folder2);
        mainPanel.add(folder3);
        mainPanel.add(file1);
        mainPanel.add(file2);
        mainPanel.add(pic1);
        mainPanel.add(pic2);
        mainPanel.add(video1);
        mainPanel.add(video2);
        mainPanel.add(video3);
    }
}
