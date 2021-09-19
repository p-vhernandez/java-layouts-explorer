package components;

import javax.swing.*;

public class RecentlyViewed extends JPanel {

    private final RecentlyViewedUI view;

    public RecentlyViewed() {
        this.view = new RecentlyViewedUI(this);

        setUpUI();
    }

    private void setUpUI() {
        this.view.initializeUI();
    }

    static final String[] TABLE_COLUMNS = {
            "Directory",
            "Access date",
            "Full path"
    };

    static Object[][] TABLE_DATA = {
            {null, "05/02/2021", "Full/path/goes/here"},
            {null, "03/02/2021", "Full/path/goes/here"},
            {null, "01/02/2021", "Full/path/goes/here"}
    };

}
