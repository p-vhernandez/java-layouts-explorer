package components;

import utils.Utils;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class RecentlyViewedUI {

    private final RecentlyViewed recentlyViewed;

    private final JLabel sectionTitle;

    public RecentlyViewedUI(RecentlyViewed recentlyViewed) {
        this.recentlyViewed = recentlyViewed;
        this.sectionTitle = new JLabel();
    }

    public void initializeUI() {
        recentlyViewed.setLayout(new BorderLayout());
        recentlyViewed.setBorder(new EmptyBorder(20, 20, 20, 20));
        recentlyViewed.setPreferredSize(new Dimension(Utils.getMainPanelWidth(),
                Utils.getRecentlyViewedPanelHeight()));

        setUpTitle();
        generateDummyRecentlyViewed();
    }

    private void setUpTitle() {
        sectionTitle.setText("Recently viewed archives: ");
        recentlyViewed.add(sectionTitle, BorderLayout.NORTH);
    }

    private void generateDummyRecentlyViewed() {
        JPanel recents = new JPanel();
        recents.setBorder(new EmptyBorder(10, 0, 0, 0));
        recents.setLayout(new BoxLayout(recents, BoxLayout.PAGE_AXIS));

        JButton recent1 = Utils.generateIconButton(this, "folder", "img", false);
        JButton recent2 = Utils.generateIconButton(this, "doc", "Dummy doc", false);
        JButton recent3 = Utils.generateIconButton(this, "video", "Dummy video", false);

        recents.add(recent1);
        recents.add(recent2);
        recents.add(recent3);

        recentlyViewed.add(recents);
    }

}
